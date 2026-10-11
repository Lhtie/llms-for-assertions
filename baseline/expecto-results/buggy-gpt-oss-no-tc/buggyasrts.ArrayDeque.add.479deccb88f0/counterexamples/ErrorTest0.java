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
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_add(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_add(intQueue15, intQueue19, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue31 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        fuzzTest24.FuzzTest_add(intQueue27, intQueue31, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue39 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        fuzzTest12.FuzzTest_add(intQueue31, intQueue39, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue51 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        fuzzTest44.FuzzTest_add(intQueue47, intQueue51, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue60 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue64 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        fuzzTest57.FuzzTest_add(intQueue60, intQueue64, (java.lang.Integer) 1, true);
        fuzzTest44.FuzzTest_add(intQueue56, intQueue64, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue75 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue79 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        fuzzTest72.FuzzTest_add(intQueue75, intQueue79, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_add(intQueue64, intQueue75, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 0, 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue90 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue90, intArray89);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue64, intQueue90, (java.lang.Integer) 0, true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_add(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        fuzzTest13.FuzzTest_add(intQueue16, intQueue20, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue29 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzzTest26.FuzzTest_add(intQueue29, intQueue33, (java.lang.Integer) 1, true);
        fuzzTest13.FuzzTest_add(intQueue25, intQueue33, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_add(intQueue12, intQueue25, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue51 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        fuzzTest44.FuzzTest_add(intQueue47, intQueue51, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue61 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue65 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        fuzzTest58.FuzzTest_add(intQueue61, intQueue65, (java.lang.Integer) 1, true);
        fuzzTest56.FuzzTest_add(intQueue57, intQueue61, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue47, intQueue61, (java.lang.Integer) 100, true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue5 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue9 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzzTest2.FuzzTest_add(intQueue5, intQueue9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intQueue1, intQueue5, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue18 = null;
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue22 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue26 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        fuzzTest19.FuzzTest_add(intQueue22, intQueue26, (java.lang.Integer) 1, true);
        fuzzTest17.FuzzTest_add(intQueue18, intQueue22, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue41 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        fuzzTest34.FuzzTest_add(intQueue37, intQueue41, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue49 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue53 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        fuzzTest46.FuzzTest_add(intQueue49, intQueue53, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue61 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        fuzzTest34.FuzzTest_add(intQueue53, intQueue61, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue22, intQueue61, (java.lang.Integer) 0, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_add(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_add(intQueue15, intQueue19, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue31 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        fuzzTest24.FuzzTest_add(intQueue27, intQueue31, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue39 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        fuzzTest12.FuzzTest_add(intQueue31, intQueue39, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0, 0 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue31, intQueue47, (java.lang.Integer) 0, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_add(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        fuzzTest13.FuzzTest_add(intQueue16, intQueue20, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue29 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzzTest26.FuzzTest_add(intQueue29, intQueue33, (java.lang.Integer) 1, true);
        fuzzTest13.FuzzTest_add(intQueue25, intQueue33, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_add(intQueue12, intQueue25, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10, 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue49 = null;
        fuzzTest0.FuzzTest_add(intQueue47, intQueue49, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), (-1) };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue61 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue65 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        fuzzTest58.FuzzTest_add(intQueue61, intQueue65, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue56, intQueue65, (java.lang.Integer) 10, true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, 10, (-1), 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue10 = null;
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue18 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        fuzzTest11.FuzzTest_add(intQueue14, intQueue18, (java.lang.Integer) 1, true);
        fuzzTest9.FuzzTest_add(intQueue10, intQueue14, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue30 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest27.FuzzTest_add(intQueue30, intQueue34, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue42 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue46 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        fuzzTest39.FuzzTest_add(intQueue42, intQueue46, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue51 = null;
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue55 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue59 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        fuzzTest52.FuzzTest_add(intQueue55, intQueue59, (java.lang.Integer) 1, true);
        fuzzTest39.FuzzTest_add(intQueue51, intQueue59, (java.lang.Integer) 1, false);
        fuzzTest26.FuzzTest_add(intQueue30, intQueue59, (java.lang.Integer) (-1), true);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue70 = null;
        fuzzTest9.FuzzTest_add(intQueue30, intQueue70, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue7, intQueue30, (java.lang.Integer) 100, false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_add(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        fuzzTest13.FuzzTest_add(intQueue16, intQueue20, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue25 = null;
        fuzzTest12.FuzzTest_add(intQueue16, intQueue25, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue38 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        fuzzTest31.FuzzTest_add(intQueue34, intQueue38, (java.lang.Integer) 1, true);
        fuzzTest29.FuzzTest_add(intQueue30, intQueue34, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue49 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue53 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        fuzzTest46.FuzzTest_add(intQueue49, intQueue53, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue61 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue65 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        fuzzTest58.FuzzTest_add(intQueue61, intQueue65, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue73 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzzTest46.FuzzTest_add(intQueue65, intQueue73, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue81 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue85 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        fuzzTest78.FuzzTest_add(intQueue81, intQueue85, (java.lang.Integer) 1, true);
        fuzzTest29.FuzzTest_add(intQueue73, intQueue85, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue16, intQueue73, (java.lang.Integer) 0, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue5 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue9 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzzTest2.FuzzTest_add(intQueue5, intQueue9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intQueue1, intQueue5, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue17 = null;
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, (-1), 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue22 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        fuzzTest0.FuzzTest_add(intQueue17, intQueue22, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue30 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest27.FuzzTest_add(intQueue30, intQueue34, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue43 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest40.FuzzTest_add(intQueue43, intQueue47, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue55 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue59 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        fuzzTest52.FuzzTest_add(intQueue55, intQueue59, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue64 = null;
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue68 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue72 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzzTest65.FuzzTest_add(intQueue68, intQueue72, (java.lang.Integer) 1, true);
        fuzzTest52.FuzzTest_add(intQueue64, intQueue72, (java.lang.Integer) 1, false);
        fuzzTest39.FuzzTest_add(intQueue43, intQueue72, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue30, intQueue43, (java.lang.Integer) 100, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue1 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), 100, 100, 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_add(intQueue1, intQueue7, (java.lang.Integer) (-1), false);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue12 = null;
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue13 = null;
        fuzzTest0.FuzzTest_add(intQueue12, intQueue13, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue21 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue25 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzzTest18.FuzzTest_add(intQueue21, intQueue25, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest30.FuzzTest_add(intQueue33, intQueue37, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue46 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue50 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        fuzzTest43.FuzzTest_add(intQueue46, intQueue50, (java.lang.Integer) 1, true);
        fuzzTest30.FuzzTest_add(intQueue42, intQueue50, (java.lang.Integer) 1, false);
        fuzzTest17.FuzzTest_add(intQueue21, intQueue50, (java.lang.Integer) (-1), true);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue61 = null;
        fuzzTest0.FuzzTest_add(intQueue21, intQueue61, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10, 0, 100, 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue70 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10, (-1) };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue75 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue70, intQueue75, (java.lang.Integer) 10, true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_add(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_add(intQueue15, intQueue19, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue28 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue32 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        fuzzTest25.FuzzTest_add(intQueue28, intQueue32, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_add(intQueue24, intQueue32, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue43 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest40.FuzzTest_add(intQueue43, intQueue47, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue60 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        fuzzTest53.FuzzTest_add(intQueue56, intQueue60, (java.lang.Integer) 1, true);
        fuzzTest40.FuzzTest_add(intQueue52, intQueue60, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue68 = null;
        fuzzTest12.FuzzTest_add(intQueue60, intQueue68, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue75 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue79 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        fuzzTest72.FuzzTest_add(intQueue75, intQueue79, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue60, intQueue79, (java.lang.Integer) 10, false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_add(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_add(intQueue15, intQueue19, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue31 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        fuzzTest24.FuzzTest_add(intQueue27, intQueue31, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue39 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue43 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzzTest36.FuzzTest_add(intQueue39, intQueue43, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue51 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        fuzzTest24.FuzzTest_add(intQueue43, intQueue51, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue61 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue65 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        fuzzTest58.FuzzTest_add(intQueue61, intQueue65, (java.lang.Integer) 1, true);
        fuzzTest56.FuzzTest_add(intQueue57, intQueue61, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue76 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue80 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        fuzzTest73.FuzzTest_add(intQueue76, intQueue80, (java.lang.Integer) 1, true);
        fuzzTest24.FuzzTest_add(intQueue61, intQueue80, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue15, intQueue61, (java.lang.Integer) 100, false);
    }
}

