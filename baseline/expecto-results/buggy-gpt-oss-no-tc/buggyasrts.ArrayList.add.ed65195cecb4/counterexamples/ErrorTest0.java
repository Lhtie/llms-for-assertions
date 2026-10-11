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
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList12, intList13, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_add(intList32, intList36, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_add(intList44, intList48, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList60 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_add(intList56, intList60, (java.lang.Integer) 1, true);
        fuzzTest29.FuzzTest_add(intList48, intList60, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList24, intList48, (java.lang.Integer) 10, false);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList5 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_add(intList5, intList9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList1, intList5, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList17 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = null;
        fuzzTest0.FuzzTest_add(intList17, intList18, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = null;
        fuzzTest0.FuzzTest_add(intList22, intList23, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList30 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList34 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_add(intList30, intList34, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = null;
        fuzzTest27.FuzzTest_add(intList39, intList40, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_add(intList47, intList51, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList59 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList63 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_add(intList59, intList63, (java.lang.Integer) 1, true);
        fuzzTest27.FuzzTest_add(intList51, intList59, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList74 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList78 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest71.FuzzTest_add(intList74, intList78, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList59, intList74, (java.lang.Integer) 100, false);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList12, intList13, (java.lang.Integer) 10, false);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList17 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = null;
        fuzzTest0.FuzzTest_add(intList17, intList18, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_add(intList27, intList31, (java.lang.Integer) 1, true);
        fuzzTest22.FuzzTest_add(intList23, intList27, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList42 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = null;
        fuzzTest22.FuzzTest_add(intList42, intList44, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest48.FuzzTest_add(intList51, intList55, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList42, intList51, (java.lang.Integer) 100, false);
    }
}

