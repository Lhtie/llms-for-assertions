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
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = null;
        fuzzTest12.FuzzTest_setElementAt(intList18, intList20, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList18, intList24, (java.lang.Integer) 1, (int) (byte) 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList12, intList13, (java.lang.Integer) 10, (int) (short) 10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = null;
        fuzzTest3.FuzzTest_setElementAt(intList9, intList11, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest15.FuzzTest_setElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) '#');
        fuzzTest2.FuzzTest_setElementAt(intList9, intList23, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest0.FuzzTest_setElementAt(intList1, intList23, (java.lang.Integer) 0, 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = null;
        fuzzTest34.FuzzTest_setElementAt(intList40, intList42, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = null;
        fuzzTest46.FuzzTest_setElementAt(intList52, intList54, (java.lang.Integer) (-1), (int) '#');
        fuzzTest33.FuzzTest_setElementAt(intList40, intList54, (java.lang.Integer) 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = null;
        fuzzTest61.FuzzTest_setElementAt(intList67, intList69, (java.lang.Integer) (-1), (int) '#');
        fuzzTest0.FuzzTest_setElementAt(intList54, intList69, (java.lang.Integer) 100, 10);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, (-1), (-1), 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList81, intList83, (java.lang.Integer) 0, (int) (byte) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 10, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest6.FuzzTest_setElementAt(intList12, intList14, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzzTest19.FuzzTest_setElementAt(intList25, intList27, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = null;
        fuzzTest31.FuzzTest_setElementAt(intList37, intList39, (java.lang.Integer) (-1), (int) '#');
        fuzzTest18.FuzzTest_setElementAt(intList25, intList39, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_setElementAt(intList39, intList46, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = null;
        fuzzTest50.FuzzTest_setElementAt(intList56, intList58, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        fuzzTest63.FuzzTest_setElementAt(intList69, intList71, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = null;
        fuzzTest75.FuzzTest_setElementAt(intList81, intList83, (java.lang.Integer) (-1), (int) '#');
        fuzzTest62.FuzzTest_setElementAt(intList69, intList83, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_setElementAt(intList83, intList90, (java.lang.Integer) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList46, intList90, (java.lang.Integer) 0, 2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_setElementAt(intList7, intList9, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_setElementAt(intList19, intList21, (java.lang.Integer) (-1), (int) '#');
        fuzzTest0.FuzzTest_setElementAt(intList7, intList21, (java.lang.Integer) 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = null;
        fuzzTest28.FuzzTest_setElementAt(intList34, intList36, (java.lang.Integer) (-1), (int) '#');
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-1), 1, 10, 10, 100, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = null;
        fuzzTest53.FuzzTest_setElementAt(intList59, intList61, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = null;
        fuzzTest65.FuzzTest_setElementAt(intList71, intList73, (java.lang.Integer) (-1), (int) '#');
        fuzzTest52.FuzzTest_setElementAt(intList59, intList73, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest50.FuzzTest_setElementAt(intList51, intList73, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_setElementAt(intList73, intList83, (java.lang.Integer) 100, 1);
        fuzzTest28.FuzzTest_setElementAt(intList47, intList73, (java.lang.Integer) 2, (int) (short) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList47, intList90, (java.lang.Integer) (-1), (int) (byte) 100);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_setElementAt(intList19, intList21, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        fuzzTest12.FuzzTest_setElementAt(intList19, intList25, (java.lang.Integer) 100, 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = null;
        fuzzTest33.FuzzTest_setElementAt(intList39, intList41, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = null;
        fuzzTest45.FuzzTest_setElementAt(intList51, intList53, (java.lang.Integer) (-1), (int) '#');
        fuzzTest32.FuzzTest_setElementAt(intList39, intList53, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest30.FuzzTest_setElementAt(intList31, intList53, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_setElementAt(intList53, intList63, (java.lang.Integer) 100, 1);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10, 1, (-1), (-1), (-1), 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest12.FuzzTest_setElementAt(intList63, intList74, (java.lang.Integer) 1, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList88 = null;
        fuzzTest80.FuzzTest_setElementAt(intList86, intList88, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList92 = null;
        fuzzTest79.FuzzTest_setElementAt(intList86, intList92, (java.lang.Integer) 100, 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList63, intList86, (java.lang.Integer) 1, 100);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = null;
        fuzzTest14.FuzzTest_setElementAt(intList20, intList22, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest13.FuzzTest_setElementAt(intList20, intList26, (java.lang.Integer) 100, 10);
        fuzzTest0.FuzzTest_setElementAt(intList12, intList20, (java.lang.Integer) 10, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 10, 0, (-1), (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList33, intList41, (java.lang.Integer) 0, (int) 'a');
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_setElementAt(intList19, intList21, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = null;
        fuzzTest25.FuzzTest_setElementAt(intList31, intList33, (java.lang.Integer) (-1), (int) '#');
        fuzzTest12.FuzzTest_setElementAt(intList19, intList33, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_setElementAt(intList33, intList40, (java.lang.Integer) 1, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = null;
        fuzzTest49.FuzzTest_setElementAt(intList55, intList57, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = null;
        fuzzTest61.FuzzTest_setElementAt(intList67, intList69, (java.lang.Integer) (-1), (int) '#');
        fuzzTest48.FuzzTest_setElementAt(intList55, intList69, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest46.FuzzTest_setElementAt(intList47, intList69, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_setElementAt(intList69, intList79, (java.lang.Integer) 100, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList44, intList79, (java.lang.Integer) 2, (int) (byte) 1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_setElementAt(intList7, intList9, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_setElementAt(intList19, intList21, (java.lang.Integer) (-1), (int) '#');
        fuzzTest0.FuzzTest_setElementAt(intList7, intList21, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = null;
        fuzzTest30.FuzzTest_setElementAt(intList36, intList38, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = null;
        fuzzTest29.FuzzTest_setElementAt(intList36, intList42, (java.lang.Integer) 100, 10);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = null;
        fuzzTest50.FuzzTest_setElementAt(intList56, intList58, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = null;
        fuzzTest62.FuzzTest_setElementAt(intList68, intList70, (java.lang.Integer) (-1), (int) '#');
        fuzzTest49.FuzzTest_setElementAt(intList56, intList70, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest47.FuzzTest_setElementAt(intList48, intList70, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_setElementAt(intList70, intList80, (java.lang.Integer) 100, 1);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 10, 1, (-1), (-1), (-1), 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList91 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        fuzzTest29.FuzzTest_setElementAt(intList80, intList91, (java.lang.Integer) 1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList28, intList91, (java.lang.Integer) 0, 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = null;
        fuzzTest3.FuzzTest_setElementAt(intList9, intList11, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest15.FuzzTest_setElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) '#');
        fuzzTest2.FuzzTest_setElementAt(intList9, intList23, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest0.FuzzTest_setElementAt(intList1, intList23, (java.lang.Integer) 0, 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = null;
        fuzzTest33.FuzzTest_setElementAt(intList39, intList41, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = null;
        fuzzTest46.FuzzTest_setElementAt(intList52, intList54, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = null;
        fuzzTest58.FuzzTest_setElementAt(intList64, intList66, (java.lang.Integer) (-1), (int) '#');
        fuzzTest45.FuzzTest_setElementAt(intList52, intList66, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_setElementAt(intList66, intList73, (java.lang.Integer) 1, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList73, intList77, (java.lang.Integer) 0, (int) (short) 1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = null;
        fuzzTest2.FuzzTest_setElementAt(intList8, intList10, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = null;
        fuzzTest14.FuzzTest_setElementAt(intList20, intList22, (java.lang.Integer) (-1), (int) '#');
        fuzzTest1.FuzzTest_setElementAt(intList8, intList22, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList8, intList29, (java.lang.Integer) (-1), (int) (short) 1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest18.FuzzTest_setElementAt(intList24, intList26, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest32.FuzzTest_setElementAt(intList38, intList40, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = null;
        fuzzTest31.FuzzTest_setElementAt(intList38, intList44, (java.lang.Integer) 100, 10);
        fuzzTest18.FuzzTest_setElementAt(intList30, intList38, (java.lang.Integer) 10, 0);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzzTest52.FuzzTest_setElementAt(intList58, intList60, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = null;
        fuzzTest51.FuzzTest_setElementAt(intList58, intList64, (java.lang.Integer) 100, 10);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = null;
        fuzzTest69.FuzzTest_setElementAt(intList75, intList77, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = null;
        fuzzTest68.FuzzTest_setElementAt(intList75, intList81, (java.lang.Integer) 100, 10);
        fuzzTest18.FuzzTest_setElementAt(intList58, intList75, (java.lang.Integer) 0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList16, intList58, (java.lang.Integer) 2, 100);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = null;
        fuzzTest2.FuzzTest_setElementAt(intList8, intList10, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest1.FuzzTest_setElementAt(intList8, intList14, (java.lang.Integer) 100, 10);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzzTest19.FuzzTest_setElementAt(intList25, intList27, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = null;
        fuzzTest31.FuzzTest_setElementAt(intList37, intList39, (java.lang.Integer) (-1), (int) '#');
        fuzzTest18.FuzzTest_setElementAt(intList25, intList39, (java.lang.Integer) 0, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList8, intList25, (java.lang.Integer) 0, (int) 'a');
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = null;
        fuzzTest4.FuzzTest_setElementAt(intList10, intList12, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzzTest16.FuzzTest_setElementAt(intList22, intList24, (java.lang.Integer) (-1), (int) '#');
        fuzzTest3.FuzzTest_setElementAt(intList10, intList24, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest1.FuzzTest_setElementAt(intList2, intList24, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_setElementAt(intList24, intList34, (java.lang.Integer) 100, 1);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = null;
        fuzzTest38.FuzzTest_setElementAt(intList44, intList46, (java.lang.Integer) (-1), (int) '#');
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 0, 100, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest0.FuzzTest_setElementAt(intList46, intList54, (java.lang.Integer) 1, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = null;
        fuzzTest59.FuzzTest_setElementAt(intList65, intList67, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = null;
        fuzzTest73.FuzzTest_setElementAt(intList79, intList81, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = null;
        fuzzTest72.FuzzTest_setElementAt(intList79, intList85, (java.lang.Integer) 100, 10);
        fuzzTest59.FuzzTest_setElementAt(intList71, intList79, (java.lang.Integer) 10, 0);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 0, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList95 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList95, intArray94);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList79, intList95, (java.lang.Integer) (-1), (int) '#');
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 0, 0, 10, 0, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = null;
        fuzzTest24.FuzzTest_setElementAt(intList30, intList32, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = null;
        fuzzTest36.FuzzTest_setElementAt(intList42, intList44, (java.lang.Integer) (-1), (int) '#');
        fuzzTest23.FuzzTest_setElementAt(intList30, intList44, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest21.FuzzTest_setElementAt(intList22, intList44, (java.lang.Integer) 0, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList19, intList22, (java.lang.Integer) 100, (int) (short) 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_setElementAt(intList7, intList9, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_setElementAt(intList19, intList21, (java.lang.Integer) (-1), (int) '#');
        fuzzTest0.FuzzTest_setElementAt(intList7, intList21, (java.lang.Integer) 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = null;
        fuzzTest29.FuzzTest_setElementAt(intList35, intList37, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = null;
        fuzzTest28.FuzzTest_setElementAt(intList35, intList41, (java.lang.Integer) 100, 10);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = null;
        fuzzTest49.FuzzTest_setElementAt(intList55, intList57, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = null;
        fuzzTest61.FuzzTest_setElementAt(intList67, intList69, (java.lang.Integer) (-1), (int) '#');
        fuzzTest48.FuzzTest_setElementAt(intList55, intList69, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest46.FuzzTest_setElementAt(intList47, intList69, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_setElementAt(intList69, intList79, (java.lang.Integer) 100, 1);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 10, 1, (-1), (-1), (-1), 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        fuzzTest28.FuzzTest_setElementAt(intList79, intList90, (java.lang.Integer) 1, (int) (short) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList95 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList90, intList95, (java.lang.Integer) 1, (int) ' ');
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = null;
        fuzzTest2.FuzzTest_setElementAt(intList8, intList10, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest1.FuzzTest_setElementAt(intList8, intList14, (java.lang.Integer) 100, 10);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest22.FuzzTest_setElementAt(intList28, intList30, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = null;
        fuzzTest34.FuzzTest_setElementAt(intList40, intList42, (java.lang.Integer) (-1), (int) '#');
        fuzzTest21.FuzzTest_setElementAt(intList28, intList42, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest19.FuzzTest_setElementAt(intList20, intList42, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_setElementAt(intList42, intList52, (java.lang.Integer) 100, 1);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10, 1, (-1), (-1), (-1), 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest1.FuzzTest_setElementAt(intList52, intList63, (java.lang.Integer) 1, (int) (short) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList52, intList68, (java.lang.Integer) 1, (int) (short) 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 10, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = null;
        fuzzTest10.FuzzTest_setElementAt(intList16, intList18, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest22.FuzzTest_setElementAt(intList28, intList30, (java.lang.Integer) (-1), (int) '#');
        fuzzTest9.FuzzTest_setElementAt(intList16, intList30, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest7.FuzzTest_setElementAt(intList8, intList30, (java.lang.Integer) 0, 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = null;
        fuzzTest41.FuzzTest_setElementAt(intList47, intList49, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = null;
        fuzzTest53.FuzzTest_setElementAt(intList59, intList61, (java.lang.Integer) (-1), (int) '#');
        fuzzTest40.FuzzTest_setElementAt(intList47, intList61, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest6.FuzzTest_setElementAt(intList8, intList47, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList8, intList71, (java.lang.Integer) 100, (int) (byte) 10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = null;
        fuzzTest14.FuzzTest_setElementAt(intList20, intList22, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest13.FuzzTest_setElementAt(intList20, intList26, (java.lang.Integer) 100, 10);
        fuzzTest0.FuzzTest_setElementAt(intList12, intList20, (java.lang.Integer) 10, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = null;
        fuzzTest35.FuzzTest_setElementAt(intList41, intList43, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = null;
        fuzzTest34.FuzzTest_setElementAt(intList41, intList47, (java.lang.Integer) 100, 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = null;
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzzTest52.FuzzTest_setElementAt(intList58, intList60, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = null;
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = null;
        fuzzTest66.FuzzTest_setElementAt(intList72, intList74, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = null;
        fuzzTest65.FuzzTest_setElementAt(intList72, intList78, (java.lang.Integer) 100, 10);
        fuzzTest52.FuzzTest_setElementAt(intList64, intList72, (java.lang.Integer) 10, 0);
        fuzzTest34.FuzzTest_setElementAt(intList51, intList72, (java.lang.Integer) 1, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList33, intList72, (java.lang.Integer) 10, 100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_setElementAt(intList19, intList21, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = null;
        fuzzTest25.FuzzTest_setElementAt(intList31, intList33, (java.lang.Integer) (-1), (int) '#');
        fuzzTest12.FuzzTest_setElementAt(intList19, intList33, (java.lang.Integer) 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = null;
        fuzzTest40.FuzzTest_setElementAt(intList41, intList42, (java.lang.Integer) 10, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = null;
        fuzzTest50.FuzzTest_setElementAt(intList56, intList58, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = null;
        fuzzTest62.FuzzTest_setElementAt(intList68, intList70, (java.lang.Integer) (-1), (int) '#');
        fuzzTest49.FuzzTest_setElementAt(intList56, intList70, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest47.FuzzTest_setElementAt(intList48, intList70, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_setElementAt(intList70, intList80, (java.lang.Integer) 100, 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = null;
        fuzzTest40.FuzzTest_setElementAt(intList80, intList84, (java.lang.Integer) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList19, intList80, (java.lang.Integer) 1, 2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_setElementAt(intList19, intList21, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = null;
        fuzzTest25.FuzzTest_setElementAt(intList31, intList33, (java.lang.Integer) (-1), (int) '#');
        fuzzTest12.FuzzTest_setElementAt(intList19, intList33, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_setElementAt(intList33, intList40, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = null;
        fuzzTest44.FuzzTest_setElementAt(intList50, intList52, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = null;
        fuzzTest56.FuzzTest_setElementAt(intList62, intList64, (java.lang.Integer) (-1), (int) '#');
        fuzzTest0.FuzzTest_setElementAt(intList52, intList64, (java.lang.Integer) 10, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = null;
        fuzzTest0.FuzzTest_setElementAt(intList71, intList72, (java.lang.Integer) 0, (int) (short) 10);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1, 2, 2, 1, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList82, intList86, (java.lang.Integer) 1, (int) ' ');
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_setElementAt(intList7, intList9, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_setElementAt(intList7, intList13, (java.lang.Integer) 100, 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest18.FuzzTest_setElementAt(intList24, intList26, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest32.FuzzTest_setElementAt(intList38, intList40, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = null;
        fuzzTest31.FuzzTest_setElementAt(intList38, intList44, (java.lang.Integer) 100, 10);
        fuzzTest18.FuzzTest_setElementAt(intList30, intList38, (java.lang.Integer) 10, 0);
        fuzzTest0.FuzzTest_setElementAt(intList17, intList38, (java.lang.Integer) 1, (int) (short) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = null;
        fuzzTest56.FuzzTest_setElementAt(intList62, intList64, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = null;
        fuzzTest68.FuzzTest_setElementAt(intList74, intList76, (java.lang.Integer) (-1), (int) '#');
        fuzzTest55.FuzzTest_setElementAt(intList62, intList76, (java.lang.Integer) 0, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList54, intList62, (java.lang.Integer) 0, (int) '4');
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = null;
        fuzzTest4.FuzzTest_setElementAt(intList10, intList12, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzzTest16.FuzzTest_setElementAt(intList22, intList24, (java.lang.Integer) (-1), (int) '#');
        fuzzTest3.FuzzTest_setElementAt(intList10, intList24, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest1.FuzzTest_setElementAt(intList2, intList24, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_setElementAt(intList24, intList34, (java.lang.Integer) 100, 1);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = null;
        fuzzTest38.FuzzTest_setElementAt(intList44, intList46, (java.lang.Integer) (-1), (int) '#');
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 0, 100, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest0.FuzzTest_setElementAt(intList46, intList54, (java.lang.Integer) 1, (int) (byte) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzzTest0.FuzzTest_setElementAt(intList59, intList60, (java.lang.Integer) 0, (int) (byte) 10);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = null;
        fuzzTest68.FuzzTest_setElementAt(intList69, intList70, (java.lang.Integer) 100, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList66, intList69, (java.lang.Integer) 1, (int) (byte) 1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 100, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest6.FuzzTest_setElementAt(intList12, intList14, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = null;
        fuzzTest0.FuzzTest_setElementAt(intList12, intList18, (java.lang.Integer) 100, 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzzTest22.FuzzTest_setElementAt(intList23, intList24, (java.lang.Integer) 100, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest28.FuzzTest_setElementAt(intList29, intList30, (java.lang.Integer) 100, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList23, intList29, (java.lang.Integer) 1, (int) (short) 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 100, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest6.FuzzTest_setElementAt(intList12, intList14, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = null;
        fuzzTest0.FuzzTest_setElementAt(intList12, intList18, (java.lang.Integer) 100, 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = null;
        fuzzTest26.FuzzTest_setElementAt(intList32, intList34, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = null;
        fuzzTest38.FuzzTest_setElementAt(intList44, intList46, (java.lang.Integer) (-1), (int) '#');
        fuzzTest25.FuzzTest_setElementAt(intList32, intList46, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest23.FuzzTest_setElementAt(intList24, intList46, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_setElementAt(intList46, intList56, (java.lang.Integer) 100, 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = null;
        fuzzTest22.FuzzTest_setElementAt(intList60, intList61, (java.lang.Integer) 2, (int) '#');
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 2, 2, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList60, intList71, (java.lang.Integer) 1, 100);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 10, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest6.FuzzTest_setElementAt(intList12, intList14, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = null;
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = null;
        fuzzTest20.FuzzTest_setElementAt(intList26, intList28, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = null;
        fuzzTest19.FuzzTest_setElementAt(intList26, intList32, (java.lang.Integer) 100, 10);
        fuzzTest6.FuzzTest_setElementAt(intList18, intList26, (java.lang.Integer) 10, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = null;
        fuzzTest40.FuzzTest_setElementAt(intList41, intList42, (java.lang.Integer) 100, (int) (byte) -1);
        fuzzTest6.FuzzTest_setElementAt(intList39, intList41, (java.lang.Integer) 100, (int) ' ');
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = null;
        fuzzTest49.FuzzTest_setElementAt(intList55, intList57, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = null;
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        fuzzTest63.FuzzTest_setElementAt(intList69, intList71, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = null;
        fuzzTest62.FuzzTest_setElementAt(intList69, intList75, (java.lang.Integer) 100, 10);
        fuzzTest49.FuzzTest_setElementAt(intList61, intList69, (java.lang.Integer) 10, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList41, intList69, (java.lang.Integer) 1, (int) (byte) 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_setElementAt(intList19, intList21, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = null;
        fuzzTest25.FuzzTest_setElementAt(intList31, intList33, (java.lang.Integer) (-1), (int) '#');
        fuzzTest12.FuzzTest_setElementAt(intList19, intList33, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_setElementAt(intList33, intList40, (java.lang.Integer) 1, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = null;
        fuzzTest0.FuzzTest_setElementAt(intList44, intList45, (java.lang.Integer) 100, (int) ' ');
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = null;
        fuzzTest49.FuzzTest_setElementAt(intList50, intList51, (java.lang.Integer) 100, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = null;
        fuzzTest56.FuzzTest_setElementAt(intList62, intList64, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = null;
        fuzzTest55.FuzzTest_setElementAt(intList62, intList68, (java.lang.Integer) 100, 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList50, intList62, (java.lang.Integer) 0, (int) (byte) 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 10, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest6.FuzzTest_setElementAt(intList12, intList14, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzzTest19.FuzzTest_setElementAt(intList25, intList27, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = null;
        fuzzTest31.FuzzTest_setElementAt(intList37, intList39, (java.lang.Integer) (-1), (int) '#');
        fuzzTest18.FuzzTest_setElementAt(intList25, intList39, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_setElementAt(intList39, intList46, (java.lang.Integer) 1, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = null;
        fuzzTest6.FuzzTest_setElementAt(intList50, intList51, (java.lang.Integer) 100, (int) ' ');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = null;
        fuzzTest0.FuzzTest_setElementAt(intList50, intList55, (java.lang.Integer) 10, (int) (short) 100);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 10, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList63, intList65, (java.lang.Integer) 100, (int) (short) 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_setElementAt(intList7, intList9, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_setElementAt(intList7, intList13, (java.lang.Integer) 100, 10);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest18.FuzzTest_setElementAt(intList24, intList26, (java.lang.Integer) (-1), (int) '#');
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { (-1), 1, 10, 10, 100, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = null;
        fuzzTest43.FuzzTest_setElementAt(intList49, intList51, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = null;
        fuzzTest55.FuzzTest_setElementAt(intList61, intList63, (java.lang.Integer) (-1), (int) '#');
        fuzzTest42.FuzzTest_setElementAt(intList49, intList63, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest40.FuzzTest_setElementAt(intList41, intList63, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_setElementAt(intList63, intList73, (java.lang.Integer) 100, 1);
        fuzzTest18.FuzzTest_setElementAt(intList37, intList63, (java.lang.Integer) 2, (int) (short) 0);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100, 0, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest17.FuzzTest_setElementAt(intList63, intList84, (java.lang.Integer) 10, (int) (short) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList89 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList84, intList89, (java.lang.Integer) 1, (int) (byte) 10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 100, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest6.FuzzTest_setElementAt(intList12, intList14, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = null;
        fuzzTest0.FuzzTest_setElementAt(intList12, intList18, (java.lang.Integer) 100, 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzzTest22.FuzzTest_setElementAt(intList23, intList24, (java.lang.Integer) 10, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest32.FuzzTest_setElementAt(intList38, intList40, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = null;
        fuzzTest44.FuzzTest_setElementAt(intList50, intList52, (java.lang.Integer) (-1), (int) '#');
        fuzzTest31.FuzzTest_setElementAt(intList38, intList52, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest29.FuzzTest_setElementAt(intList30, intList52, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_setElementAt(intList52, intList62, (java.lang.Integer) 100, 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = null;
        fuzzTest22.FuzzTest_setElementAt(intList62, intList66, (java.lang.Integer) 0, (int) 'a');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList62, intList70, (java.lang.Integer) 0, (int) ' ');
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_setElementAt(intList7, intList9, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_setElementAt(intList19, intList21, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = null;
        fuzzTest28.FuzzTest_setElementAt(intList34, intList36, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = null;
        fuzzTest40.FuzzTest_setElementAt(intList46, intList48, (java.lang.Integer) (-1), (int) '#');
        fuzzTest27.FuzzTest_setElementAt(intList34, intList48, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest25.FuzzTest_setElementAt(intList26, intList48, (java.lang.Integer) 0, 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = null;
        fuzzTest58.FuzzTest_setElementAt(intList64, intList66, (java.lang.Integer) (-1), (int) '#');
        fuzzTest13.FuzzTest_setElementAt(intList48, intList64, (java.lang.Integer) 1, (int) 'a');
        fuzzTest0.FuzzTest_setElementAt(intList7, intList48, (java.lang.Integer) 10, (int) (byte) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = null;
        fuzzTest0.FuzzTest_setElementAt(intList76, intList77, (java.lang.Integer) 1, (int) (short) 100);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzztests.FuzzTest fuzzTest85 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = null;
        fuzzTest85.FuzzTest_setElementAt(intList86, intList87, (java.lang.Integer) 100, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList83, intList86, (java.lang.Integer) 1, (int) (byte) 100);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = null;
        fuzzTest4.FuzzTest_setElementAt(intList10, intList12, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzzTest16.FuzzTest_setElementAt(intList22, intList24, (java.lang.Integer) (-1), (int) '#');
        fuzzTest3.FuzzTest_setElementAt(intList10, intList24, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest1.FuzzTest_setElementAt(intList2, intList24, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_setElementAt(intList24, intList34, (java.lang.Integer) 100, 1);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest42.FuzzTest_setElementAt(intList48, intList50, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = null;
        fuzzTest54.FuzzTest_setElementAt(intList60, intList62, (java.lang.Integer) (-1), (int) '#');
        fuzzTest41.FuzzTest_setElementAt(intList48, intList62, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest39.FuzzTest_setElementAt(intList40, intList62, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_setElementAt(intList62, intList72, (java.lang.Integer) 100, 1);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = null;
        fuzzTest77.FuzzTest_setElementAt(intList83, intList85, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList89 = null;
        fuzzTest76.FuzzTest_setElementAt(intList83, intList89, (java.lang.Integer) 100, 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList72, intList83, (java.lang.Integer) 2, (int) ' ');
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = null;
        fuzzTest4.FuzzTest_setElementAt(intList10, intList12, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzzTest16.FuzzTest_setElementAt(intList22, intList24, (java.lang.Integer) (-1), (int) '#');
        fuzzTest3.FuzzTest_setElementAt(intList10, intList24, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest1.FuzzTest_setElementAt(intList2, intList24, (java.lang.Integer) 0, 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = null;
        fuzzTest35.FuzzTest_setElementAt(intList41, intList43, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = null;
        fuzzTest47.FuzzTest_setElementAt(intList53, intList55, (java.lang.Integer) (-1), (int) '#');
        fuzzTest34.FuzzTest_setElementAt(intList41, intList55, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest0.FuzzTest_setElementAt(intList2, intList41, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = null;
        fuzzTest0.FuzzTest_setElementAt(intList65, intList66, (java.lang.Integer) 10, 2);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, 100, (-1), 10, 100, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1), 0, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList77, intList83, (java.lang.Integer) 10, (int) (short) 1);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = null;
        fuzzTest4.FuzzTest_setElementAt(intList10, intList12, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzzTest16.FuzzTest_setElementAt(intList22, intList24, (java.lang.Integer) (-1), (int) '#');
        fuzzTest3.FuzzTest_setElementAt(intList10, intList24, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest1.FuzzTest_setElementAt(intList2, intList24, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_setElementAt(intList24, intList34, (java.lang.Integer) 100, 1);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = null;
        fuzzTest38.FuzzTest_setElementAt(intList44, intList46, (java.lang.Integer) (-1), (int) '#');
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 0, 100, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest0.FuzzTest_setElementAt(intList46, intList54, (java.lang.Integer) 1, (int) (byte) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzzTest0.FuzzTest_setElementAt(intList59, intList60, (java.lang.Integer) 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = null;
        fuzzTest65.FuzzTest_setElementAt(intList71, intList73, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = null;
        fuzzTest64.FuzzTest_setElementAt(intList71, intList77, (java.lang.Integer) 100, 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList71, intList81, (java.lang.Integer) 0, 100);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_setElementAt(intList19, intList21, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        fuzzTest12.FuzzTest_setElementAt(intList19, intList25, (java.lang.Integer) 100, 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = null;
        fuzzTest29.FuzzTest_setElementAt(intList35, intList37, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = null;
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = null;
        fuzzTest43.FuzzTest_setElementAt(intList49, intList51, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = null;
        fuzzTest42.FuzzTest_setElementAt(intList49, intList55, (java.lang.Integer) 100, 10);
        fuzzTest29.FuzzTest_setElementAt(intList41, intList49, (java.lang.Integer) 10, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList19, intList49, (java.lang.Integer) 100, (int) (byte) 100);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 10, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = null;
        fuzzTest10.FuzzTest_setElementAt(intList16, intList18, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest22.FuzzTest_setElementAt(intList28, intList30, (java.lang.Integer) (-1), (int) '#');
        fuzzTest9.FuzzTest_setElementAt(intList16, intList30, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest7.FuzzTest_setElementAt(intList8, intList30, (java.lang.Integer) 0, 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = null;
        fuzzTest41.FuzzTest_setElementAt(intList47, intList49, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = null;
        fuzzTest53.FuzzTest_setElementAt(intList59, intList61, (java.lang.Integer) (-1), (int) '#');
        fuzzTest40.FuzzTest_setElementAt(intList47, intList61, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest6.FuzzTest_setElementAt(intList8, intList47, (java.lang.Integer) 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = null;
        fuzzTest71.FuzzTest_setElementAt(intList77, intList79, (java.lang.Integer) (-1), (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList47, intList77, (java.lang.Integer) 100, 1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_setElementAt(intList19, intList21, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        fuzzTest12.FuzzTest_setElementAt(intList19, intList25, (java.lang.Integer) 100, 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = null;
        fuzzTest0.FuzzTest_setElementAt(intList25, intList29, (java.lang.Integer) (-1), (int) (short) 10);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = null;
        fuzzTest34.FuzzTest_setElementAt(intList40, intList42, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = null;
        fuzzTest46.FuzzTest_setElementAt(intList52, intList54, (java.lang.Integer) (-1), (int) '#');
        fuzzTest33.FuzzTest_setElementAt(intList40, intList54, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = null;
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = null;
        fuzzTest62.FuzzTest_setElementAt(intList68, intList70, (java.lang.Integer) (-1), (int) '#');
        fuzzTest33.FuzzTest_setElementAt(intList61, intList70, (java.lang.Integer) 1, (int) '4');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = null;
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest33.FuzzTest_setElementAt(intList77, intList80, (java.lang.Integer) (-1), (int) (short) 10);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 2, 0, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList89 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList80, intList89, (java.lang.Integer) 1, (int) (short) 1);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = null;
        fuzzTest14.FuzzTest_setElementAt(intList20, intList22, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest13.FuzzTest_setElementAt(intList20, intList26, (java.lang.Integer) 100, 10);
        fuzzTest0.FuzzTest_setElementAt(intList12, intList20, (java.lang.Integer) 10, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = null;
        fuzzTest34.FuzzTest_setElementAt(intList35, intList36, (java.lang.Integer) 100, (int) (byte) -1);
        fuzzTest0.FuzzTest_setElementAt(intList33, intList35, (java.lang.Integer) 100, (int) ' ');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = null;
        fuzzTest46.FuzzTest_setElementAt(intList52, intList54, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = null;
        fuzzTest58.FuzzTest_setElementAt(intList64, intList66, (java.lang.Integer) (-1), (int) '#');
        fuzzTest45.FuzzTest_setElementAt(intList52, intList66, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest43.FuzzTest_setElementAt(intList44, intList66, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList44, intList76, (java.lang.Integer) 10, (int) '4');
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_setElementAt(intList19, intList21, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = null;
        fuzzTest25.FuzzTest_setElementAt(intList31, intList33, (java.lang.Integer) (-1), (int) '#');
        fuzzTest12.FuzzTest_setElementAt(intList19, intList33, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_setElementAt(intList33, intList40, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = null;
        fuzzTest44.FuzzTest_setElementAt(intList50, intList52, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = null;
        fuzzTest58.FuzzTest_setElementAt(intList64, intList66, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = null;
        fuzzTest57.FuzzTest_setElementAt(intList64, intList70, (java.lang.Integer) 100, 10);
        fuzzTest44.FuzzTest_setElementAt(intList56, intList64, (java.lang.Integer) 10, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = null;
        fuzzTest0.FuzzTest_setElementAt(intList56, intList77, (java.lang.Integer) 10, (int) (short) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList81, intList84, (java.lang.Integer) 10, (int) (short) 100);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 100, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest6.FuzzTest_setElementAt(intList12, intList14, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = null;
        fuzzTest0.FuzzTest_setElementAt(intList12, intList18, (java.lang.Integer) 100, 1);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = null;
        fuzzTest28.FuzzTest_setElementAt(intList34, intList36, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest27.FuzzTest_setElementAt(intList34, intList40, (java.lang.Integer) 100, 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = null;
        fuzzTest44.FuzzTest_setElementAt(intList50, intList52, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = null;
        fuzzTest57.FuzzTest_setElementAt(intList63, intList65, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = null;
        fuzzTest69.FuzzTest_setElementAt(intList75, intList77, (java.lang.Integer) (-1), (int) '#');
        fuzzTest56.FuzzTest_setElementAt(intList63, intList77, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_setElementAt(intList77, intList84, (java.lang.Integer) 1, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_setElementAt(intList77, intList88, (java.lang.Integer) 1, (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList25, intList88, (java.lang.Integer) 0, (int) (byte) 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 1, (int) 'a');
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = null;
        fuzzTest7.FuzzTest_setElementAt(intList13, intList15, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = null;
        fuzzTest6.FuzzTest_setElementAt(intList15, intList19, (java.lang.Integer) 2, 2);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        fuzzTest23.FuzzTest_setElementAt(intList24, intList25, (java.lang.Integer) 10, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = null;
        fuzzTest33.FuzzTest_setElementAt(intList39, intList41, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = null;
        fuzzTest45.FuzzTest_setElementAt(intList51, intList53, (java.lang.Integer) (-1), (int) '#');
        fuzzTest32.FuzzTest_setElementAt(intList39, intList53, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest30.FuzzTest_setElementAt(intList31, intList53, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_setElementAt(intList53, intList63, (java.lang.Integer) 100, 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = null;
        fuzzTest23.FuzzTest_setElementAt(intList63, intList67, (java.lang.Integer) 0, (int) 'a');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        fuzzTest6.FuzzTest_setElementAt(intList63, intList71, (java.lang.Integer) 10, (int) '#');
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList63, intList78, (java.lang.Integer) 100, (int) (short) 0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 10, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest6.FuzzTest_setElementAt(intList12, intList14, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzzTest19.FuzzTest_setElementAt(intList25, intList27, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = null;
        fuzzTest31.FuzzTest_setElementAt(intList37, intList39, (java.lang.Integer) (-1), (int) '#');
        fuzzTest18.FuzzTest_setElementAt(intList25, intList39, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_setElementAt(intList39, intList46, (java.lang.Integer) 1, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = null;
        fuzzTest6.FuzzTest_setElementAt(intList50, intList51, (java.lang.Integer) 100, (int) ' ');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = null;
        fuzzTest0.FuzzTest_setElementAt(intList50, intList55, (java.lang.Integer) 10, (int) (short) 100);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList63, intList65, (java.lang.Integer) 0, (int) (byte) 10);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = null;
        fuzzTest4.FuzzTest_setElementAt(intList10, intList12, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzzTest16.FuzzTest_setElementAt(intList22, intList24, (java.lang.Integer) (-1), (int) '#');
        fuzzTest3.FuzzTest_setElementAt(intList10, intList24, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest1.FuzzTest_setElementAt(intList2, intList24, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_setElementAt(intList24, intList34, (java.lang.Integer) 100, 1);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = null;
        fuzzTest39.FuzzTest_setElementAt(intList45, intList47, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = null;
        fuzzTest38.FuzzTest_setElementAt(intList45, intList51, (java.lang.Integer) 100, 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList45, intList55, (java.lang.Integer) 10, (int) '#');
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_setElementAt(intList19, intList21, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        fuzzTest12.FuzzTest_setElementAt(intList19, intList25, (java.lang.Integer) 100, 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = null;
        fuzzTest0.FuzzTest_setElementAt(intList25, intList29, (java.lang.Integer) (-1), (int) (short) 10);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = null;
        fuzzTest36.FuzzTest_setElementAt(intList42, intList44, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = null;
        fuzzTest48.FuzzTest_setElementAt(intList54, intList56, (java.lang.Integer) (-1), (int) '#');
        fuzzTest35.FuzzTest_setElementAt(intList42, intList56, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest33.FuzzTest_setElementAt(intList34, intList56, (java.lang.Integer) 0, 0);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 1, 100, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList34, intList71, (java.lang.Integer) (-1), (int) '4');
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest15.FuzzTest_setElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = null;
        fuzzTest27.FuzzTest_setElementAt(intList33, intList35, (java.lang.Integer) (-1), (int) '#');
        fuzzTest14.FuzzTest_setElementAt(intList21, intList35, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest12.FuzzTest_setElementAt(intList13, intList35, (java.lang.Integer) 0, 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = null;
        fuzzTest45.FuzzTest_setElementAt(intList51, intList53, (java.lang.Integer) (-1), (int) '#');
        fuzzTest0.FuzzTest_setElementAt(intList35, intList51, (java.lang.Integer) 1, (int) 'a');
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 2, (-1), 10, 0, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = null;
        fuzzTest70.FuzzTest_setElementAt(intList76, intList78, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = null;
        fuzzTest69.FuzzTest_setElementAt(intList76, intList82, (java.lang.Integer) 100, 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList67, intList76, (java.lang.Integer) (-1), 100);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 1, (int) 'a');
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest6.FuzzTest_setElementAt(intList12, intList14, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzzTest19.FuzzTest_setElementAt(intList25, intList27, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = null;
        fuzzTest31.FuzzTest_setElementAt(intList37, intList39, (java.lang.Integer) (-1), (int) '#');
        fuzzTest18.FuzzTest_setElementAt(intList25, intList39, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_setElementAt(intList39, intList46, (java.lang.Integer) 1, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = null;
        fuzzTest6.FuzzTest_setElementAt(intList50, intList51, (java.lang.Integer) 100, (int) ' ');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = null;
        fuzzTest6.FuzzTest_setElementAt(intList55, intList56, (java.lang.Integer) 100, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = null;
        fuzzTest60.FuzzTest_setElementAt(intList66, intList68, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = null;
        fuzzTest6.FuzzTest_setElementAt(intList66, intList72, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = null;
        fuzzTest76.FuzzTest_setElementAt(intList82, intList84, (java.lang.Integer) (-1), (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList66, intList82, (java.lang.Integer) 0, (int) '#');
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 100, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = null;
        fuzzTest8.FuzzTest_setElementAt(intList14, intList16, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = null;
        fuzzTest20.FuzzTest_setElementAt(intList26, intList28, (java.lang.Integer) (-1), (int) '#');
        fuzzTest7.FuzzTest_setElementAt(intList14, intList28, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = null;
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = null;
        fuzzTest36.FuzzTest_setElementAt(intList37, intList38, (java.lang.Integer) 100, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest42.FuzzTest_setElementAt(intList48, intList50, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = null;
        fuzzTest36.FuzzTest_setElementAt(intList48, intList54, (java.lang.Integer) 100, 1);
        fuzzTest7.FuzzTest_setElementAt(intList35, intList54, (java.lang.Integer) 2, (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_setElementAt(intList61, intList62, (java.lang.Integer) 10, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList6, intList62, (java.lang.Integer) 10, (int) (short) 100);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 10, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = null;
        fuzzTest7.FuzzTest_setElementAt(intList13, intList15, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = null;
        fuzzTest6.FuzzTest_setElementAt(intList13, intList19, (java.lang.Integer) 100, 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest0.FuzzTest_setElementAt(intList19, intList23, (java.lang.Integer) 1, 10);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = null;
        fuzzTest30.FuzzTest_setElementAt(intList36, intList38, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest42.FuzzTest_setElementAt(intList48, intList50, (java.lang.Integer) (-1), (int) '#');
        fuzzTest29.FuzzTest_setElementAt(intList36, intList50, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest27.FuzzTest_setElementAt(intList28, intList50, (java.lang.Integer) 0, 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = null;
        fuzzTest60.FuzzTest_setElementAt(intList66, intList68, (java.lang.Integer) (-1), (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList28, intList66, (java.lang.Integer) 0, 2);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 100, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = null;
        fuzzTest8.FuzzTest_setElementAt(intList14, intList16, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = null;
        fuzzTest20.FuzzTest_setElementAt(intList26, intList28, (java.lang.Integer) (-1), (int) '#');
        fuzzTest7.FuzzTest_setElementAt(intList14, intList28, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = null;
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = null;
        fuzzTest36.FuzzTest_setElementAt(intList42, intList44, (java.lang.Integer) (-1), (int) '#');
        fuzzTest7.FuzzTest_setElementAt(intList35, intList44, (java.lang.Integer) 1, (int) '4');
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzzTest52.FuzzTest_setElementAt(intList58, intList60, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = null;
        fuzzTest64.FuzzTest_setElementAt(intList70, intList72, (java.lang.Integer) (-1), (int) '#');
        fuzzTest51.FuzzTest_setElementAt(intList58, intList72, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = null;
        fuzzTest7.FuzzTest_setElementAt(intList58, intList79, (java.lang.Integer) 0, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList6, intList58, (java.lang.Integer) 100, 0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_setElementAt(intList6, intList8, (java.lang.Integer) (-1), (int) '#');
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), (-1), (-1), 100, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = null;
        fuzzTest20.FuzzTest_setElementAt(intList21, intList22, (java.lang.Integer) 10, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = null;
        fuzzTest26.FuzzTest_setElementAt(intList32, intList34, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = null;
        fuzzTest39.FuzzTest_setElementAt(intList45, intList47, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = null;
        fuzzTest51.FuzzTest_setElementAt(intList57, intList59, (java.lang.Integer) (-1), (int) '#');
        fuzzTest38.FuzzTest_setElementAt(intList45, intList59, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_setElementAt(intList59, intList66, (java.lang.Integer) 1, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        fuzzTest26.FuzzTest_setElementAt(intList70, intList71, (java.lang.Integer) 100, (int) ' ');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = null;
        fuzzTest20.FuzzTest_setElementAt(intList70, intList75, (java.lang.Integer) 10, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList18, intList70, (java.lang.Integer) 10, (int) ' ');
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_setElementAt(intList7, intList9, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_setElementAt(intList19, intList21, (java.lang.Integer) (-1), (int) '#');
        fuzzTest0.FuzzTest_setElementAt(intList7, intList21, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = null;
        fuzzTest29.FuzzTest_setElementAt(intList30, intList31, (java.lang.Integer) 100, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = null;
        fuzzTest35.FuzzTest_setElementAt(intList41, intList43, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = null;
        fuzzTest29.FuzzTest_setElementAt(intList41, intList47, (java.lang.Integer) 100, 1);
        fuzzTest0.FuzzTest_setElementAt(intList28, intList47, (java.lang.Integer) 2, (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_setElementAt(intList54, intList55, (java.lang.Integer) 10, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = null;
        fuzzTest59.FuzzTest_setElementAt(intList60, intList61, (java.lang.Integer) 100, (int) (byte) -1);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0, 10, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList60, intList69, (java.lang.Integer) 10, (int) '4');
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 10, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = null;
        fuzzTest7.FuzzTest_setElementAt(intList13, intList15, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = null;
        fuzzTest6.FuzzTest_setElementAt(intList13, intList19, (java.lang.Integer) 100, 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest0.FuzzTest_setElementAt(intList19, intList23, (java.lang.Integer) 1, 10);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = null;
        fuzzTest27.FuzzTest_setElementAt(intList33, intList35, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest42.FuzzTest_setElementAt(intList48, intList50, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = null;
        fuzzTest54.FuzzTest_setElementAt(intList60, intList62, (java.lang.Integer) (-1), (int) '#');
        fuzzTest41.FuzzTest_setElementAt(intList48, intList62, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest39.FuzzTest_setElementAt(intList40, intList62, (java.lang.Integer) 0, 0);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = null;
        fuzzTest72.FuzzTest_setElementAt(intList78, intList80, (java.lang.Integer) (-1), (int) '#');
        fuzzTest27.FuzzTest_setElementAt(intList62, intList78, (java.lang.Integer) 1, (int) 'a');
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList78, intList90, (java.lang.Integer) 0, (int) (short) 100);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 10, (int) (byte) 1);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { (-1), 2, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = null;
        fuzzTest0.FuzzTest_setElementAt(intList10, intList12, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = null;
        fuzzTest0.FuzzTest_setElementAt(intList16, intList17, (java.lang.Integer) 2, 2);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest22.FuzzTest_setElementAt(intList28, intList30, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = null;
        fuzzTest21.FuzzTest_setElementAt(intList28, intList34, (java.lang.Integer) 100, 10);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = null;
        fuzzTest38.FuzzTest_setElementAt(intList44, intList46, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = null;
        fuzzTest51.FuzzTest_setElementAt(intList57, intList59, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = null;
        fuzzTest50.FuzzTest_setElementAt(intList57, intList63, (java.lang.Integer) 100, 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = null;
        fuzzTest38.FuzzTest_setElementAt(intList63, intList67, (java.lang.Integer) (-1), (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = null;
        fuzzTest73.FuzzTest_setElementAt(intList79, intList81, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = null;
        fuzzTest72.FuzzTest_setElementAt(intList81, intList85, (java.lang.Integer) 2, 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList89 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_setElementAt(intList89, intList90, (java.lang.Integer) (-1), (int) (byte) 100);
        fuzzTest38.FuzzTest_setElementAt(intList71, intList90, (java.lang.Integer) (-1), (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList28, intList90, (java.lang.Integer) 100, (int) (short) 100);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = null;
        fuzzTest3.FuzzTest_setElementAt(intList9, intList11, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest15.FuzzTest_setElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) '#');
        fuzzTest2.FuzzTest_setElementAt(intList9, intList23, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest0.FuzzTest_setElementAt(intList1, intList23, (java.lang.Integer) 0, 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = null;
        fuzzTest34.FuzzTest_setElementAt(intList40, intList42, (java.lang.Integer) (-1), (int) '#');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = null;
        fuzzTest33.FuzzTest_setElementAt(intList40, intList46, (java.lang.Integer) 100, 10);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = null;
        fuzzTest51.FuzzTest_setElementAt(intList57, intList59, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        fuzzTest63.FuzzTest_setElementAt(intList69, intList71, (java.lang.Integer) (-1), (int) '#');
        fuzzTest50.FuzzTest_setElementAt(intList57, intList71, (java.lang.Integer) 0, (int) (short) 10);
        fuzzTest0.FuzzTest_setElementAt(intList40, intList71, (java.lang.Integer) 10, 0);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100, (-1), 2, 100, 100, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList88 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList88, intList90, (java.lang.Integer) (-1), 1);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = null;
        fuzzTest7.FuzzTest_setElementAt(intList13, intList15, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzzTest19.FuzzTest_setElementAt(intList25, intList27, (java.lang.Integer) (-1), (int) '#');
        fuzzTest6.FuzzTest_setElementAt(intList13, intList27, (java.lang.Integer) 0, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = null;
        fuzzTest35.FuzzTest_setElementAt(intList41, intList43, (java.lang.Integer) (-1), (int) '#');
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = null;
        fuzzTest47.FuzzTest_setElementAt(intList53, intList55, (java.lang.Integer) (-1), (int) '#');
        fuzzTest34.FuzzTest_setElementAt(intList41, intList55, (java.lang.Integer) 0, (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = null;
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        fuzzTest63.FuzzTest_setElementAt(intList69, intList71, (java.lang.Integer) (-1), (int) '#');
        fuzzTest34.FuzzTest_setElementAt(intList62, intList71, (java.lang.Integer) 1, (int) '4');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = null;
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest34.FuzzTest_setElementAt(intList78, intList81, (java.lang.Integer) (-1), (int) (short) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_setElementAt(intList81, intList86, (java.lang.Integer) 100, (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList81, intList90, (java.lang.Integer) 1, (int) (short) 1);
    }
}

