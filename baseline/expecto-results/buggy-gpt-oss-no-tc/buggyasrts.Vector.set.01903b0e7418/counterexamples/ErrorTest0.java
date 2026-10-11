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
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_set(intList16, intList20, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList20, intList29, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_set(intList4, intList8, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzzTest1.FuzzTest_set(intList17, intList27, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 10, 0, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList17, intList37, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_set(intList4, intList8, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzzTest1.FuzzTest_set(intList17, intList27, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 0, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList17, intList36, (int) 'a', (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_set(intList4, intList8, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest28.FuzzTest_set(intList31, intList35, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest14.FuzzTest_set(intList27, intList35, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList8, intList35, 10, (java.lang.Integer) 100, (java.lang.Integer) 10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 0, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest20.FuzzTest_set(intList23, intList27, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_set(intList36, intList40, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest46.FuzzTest_set(intList49, intList53, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = null;
        fuzzTest33.FuzzTest_set(intList49, intList59, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest19.FuzzTest_set(intList27, intList49, (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList17, intList27, 10, (java.lang.Integer) 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_set(intList4, intList8, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_set(intList30, intList34, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest14.FuzzTest_set(intList30, intList40, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList8, intList30, (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, (-1), 10, 1, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest57.FuzzTest_set(intList60, intList64, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList55, intList60, (int) (short) 100, (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList13, intList21, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_set(intList34, intList38, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_set(intList47, intList51, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_set(intList64, intList68, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest74.FuzzTest_set(intList77, intList81, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = null;
        fuzzTest61.FuzzTest_set(intList77, intList87, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest44.FuzzTest_set(intList59, intList87, 100, (java.lang.Integer) 10, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList34, intList59, (int) ' ', (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList13, intList21, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_set(intList34, intList38, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1), 100, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList38, intList48, (int) (byte) 100, (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_set(intList16, intList20, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_set(intList29, intList33, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList16, intList29, 10, (java.lang.Integer) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList13, intList21, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_set(intList35, intList39, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_set(intList48, intList52, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_set(intList61, intList65, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        fuzzTest45.FuzzTest_set(intList61, intList71, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest31.FuzzTest_set(intList39, intList61, (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, 100, 100, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList39, intList85, (int) (short) 100, (java.lang.Integer) 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_set(intList4, intList8, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_set(intList30, intList34, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest14.FuzzTest_set(intList30, intList40, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList8, intList30, (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_set(intList52, intList56, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, 100, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList56, intList66, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_set(intList4, intList8, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_set(intList21, intList25, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_set(intList34, intList38, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = null;
        fuzzTest18.FuzzTest_set(intList34, intList44, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_set(intList16, intList44, 100, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_set(intList56, intList60, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList16, intList60, (int) (byte) 1, (java.lang.Integer) 100, (java.lang.Integer) 10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_set(intList16, intList20, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_set(intList30, intList34, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_set(intList47, intList51, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest57.FuzzTest_set(intList60, intList64, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = null;
        fuzzTest44.FuzzTest_set(intList60, intList70, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest27.FuzzTest_set(intList42, intList70, 100, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest79.FuzzTest_set(intList82, intList86, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest26.FuzzTest_set(intList70, intList86, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList16, intList86, (int) (byte) 1, (java.lang.Integer) (-1), (java.lang.Integer) 10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_set(intList4, intList8, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_set(intList30, intList34, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest14.FuzzTest_set(intList30, intList40, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList8, intList30, (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_set(intList52, intList56, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10, (-1), 100, 100, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList56, intList68, 1, (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_set(intList16, intList20, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest28.FuzzTest_set(intList31, intList35, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_set(intList44, intList48, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest54.FuzzTest_set(intList57, intList61, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = null;
        fuzzTest41.FuzzTest_set(intList57, intList67, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest27.FuzzTest_set(intList35, intList57, (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest76.FuzzTest_set(intList79, intList83, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest26.FuzzTest_set(intList57, intList83, (int) (short) -1, (java.lang.Integer) 0, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList16, intList83, (int) (short) 100, (java.lang.Integer) 100, (java.lang.Integer) 100);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 1, 0, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest0.FuzzTest_set(intList19, intList21, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest28.FuzzTest_set(intList31, intList35, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_set(intList44, intList48, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest54.FuzzTest_set(intList57, intList61, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = null;
        fuzzTest41.FuzzTest_set(intList57, intList67, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest27.FuzzTest_set(intList35, intList57, (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = null;
        fuzzTest26.FuzzTest_set(intList35, intList76, (int) (short) -1, (java.lang.Integer) 100, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList88 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest81.FuzzTest_set(intList84, intList88, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList35, intList88, (int) ' ', (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_set(intList16, intList20, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest0.FuzzTest_set(intList16, intList26, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 1, 0, 10, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest39.FuzzTest_set(intList42, intList46, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 1, 0, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzzTest39.FuzzTest_set(intList58, intList60, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList37, intList58, (int) (byte) 10, (java.lang.Integer) 1, (java.lang.Integer) 10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_set(intList4, intList8, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest15.FuzzTest_set(intList18, intList22, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_set(intList14, intList22, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_set(intList35, intList39, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 1, 10, 10, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest1.FuzzTest_set(intList35, intList51, 0, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = null;
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest1.FuzzTest_set(intList57, intList61, (-1), (java.lang.Integer) 0, (java.lang.Integer) 1);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, 0, 10, 0, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList61, intList73, (int) (byte) 100, (java.lang.Integer) 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_set(intList20, intList24, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_set(intList33, intList37, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = null;
        fuzzTest17.FuzzTest_set(intList33, intList43, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList15, intList43, 100, (java.lang.Integer) 10, (java.lang.Integer) 100);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, (-1), 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList56, intList60, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_set(intList5, intList9, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest19.FuzzTest_set(intList22, intList26, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_set(intList35, intList39, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = null;
        fuzzTest19.FuzzTest_set(intList35, intList45, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest2.FuzzTest_set(intList17, intList45, 100, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_set(intList1, intList45, 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_set(intList61, intList65, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest71.FuzzTest_set(intList74, intList78, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList61, intList78, (int) (byte) 100, (java.lang.Integer) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_set(intList16, intList20, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_set(intList29, intList33, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_set(intList43, intList47, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest26.FuzzTest_set(intList39, intList47, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList16, intList47, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_set(intList4, intList8, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_set(intList21, intList25, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_set(intList34, intList38, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = null;
        fuzzTest18.FuzzTest_set(intList34, intList44, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_set(intList16, intList44, 100, (java.lang.Integer) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = null;
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest54.FuzzTest_set(intList57, intList61, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_set(intList53, intList57, 10, (java.lang.Integer) (-1), (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest71.FuzzTest_set(intList74, intList78, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList57, intList74, (int) (short) 1, (java.lang.Integer) 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 1, 0, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest0.FuzzTest_set(intList19, intList21, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_set(intList29, intList33, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest39.FuzzTest_set(intList42, intList46, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList29, intList42, 1, (java.lang.Integer) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_set(intList4, intList8, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_set(intList30, intList34, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest14.FuzzTest_set(intList30, intList40, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList8, intList30, (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_set(intList52, intList56, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest62.FuzzTest_set(intList65, intList69, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = null;
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest76.FuzzTest_set(intList79, intList83, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest62.FuzzTest_set(intList75, intList83, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList52, intList83, 1, (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_set(intList4, intList8, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest16.FuzzTest_set(intList19, intList23, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_set(intList32, intList36, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest42.FuzzTest_set(intList45, intList49, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = null;
        fuzzTest29.FuzzTest_set(intList45, intList55, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest15.FuzzTest_set(intList23, intList45, (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest64.FuzzTest_set(intList67, intList71, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest14.FuzzTest_set(intList45, intList71, (int) (short) -1, (java.lang.Integer) 0, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList4, intList45, (int) '#', (java.lang.Integer) 100, (java.lang.Integer) 10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_set(intList5, intList9, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest19.FuzzTest_set(intList22, intList26, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_set(intList35, intList39, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = null;
        fuzzTest19.FuzzTest_set(intList35, intList45, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest2.FuzzTest_set(intList17, intList45, 100, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_set(intList1, intList45, 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_set(intList61, intList65, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        fuzzTest0.FuzzTest_set(intList61, intList71, 10, (java.lang.Integer) 0, (java.lang.Integer) 10);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 1, (-1), 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        fuzzTest83.FuzzTest_set(intList86, intList90, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList81, intList90, (int) ' ', (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList13, intList21, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_set(intList34, intList38, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = null;
        fuzzTest0.FuzzTest_set(intList34, intList44, (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_set(intList52, intList56, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, 0, (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList52, intList68, (int) (byte) 100, (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_set(intList4, intList8, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_set(intList30, intList34, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest14.FuzzTest_set(intList30, intList40, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList8, intList30, (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_set(intList52, intList56, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest62.FuzzTest_set(intList65, intList69, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList52, intList65, (int) (short) 10, (java.lang.Integer) 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList13, intList21, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_set(intList34, intList38, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 1, 0, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = null;
        fuzzTest31.FuzzTest_set(intList50, intList52, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest57.FuzzTest_set(intList60, intList64, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = null;
        fuzzTest31.FuzzTest_set(intList64, intList70, (int) (short) -1, (java.lang.Integer) (-1), (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest75.FuzzTest_set(intList78, intList82, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList64, intList82, 1, (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList13, intList21, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_set(intList35, intList39, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList31, intList35, (int) (short) 1, (java.lang.Integer) 1, (java.lang.Integer) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest50.FuzzTest_set(intList53, intList57, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList49, intList53, (int) (byte) 1, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest67.FuzzTest_set(intList70, intList74, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest80.FuzzTest_set(intList83, intList87, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList74, intList83, 10, (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_set(intList5, intList9, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest15.FuzzTest_set(intList18, intList22, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest28.FuzzTest_set(intList31, intList35, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = null;
        fuzzTest15.FuzzTest_set(intList31, intList41, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_set(intList9, intList31, (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest0.FuzzTest_set(intList9, intList50, (int) (short) -1, (java.lang.Integer) 100, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = null;
        fuzzTest0.FuzzTest_set(intList55, intList56, 1, (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_set(intList64, intList68, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, (-1), 10, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList64, intList79, (int) '#', (java.lang.Integer) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_set(intList4, intList8, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_set(intList30, intList34, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest14.FuzzTest_set(intList30, intList40, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList8, intList30, (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_set(intList52, intList56, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = null;
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest63.FuzzTest_set(intList66, intList70, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest49.FuzzTest_set(intList62, intList66, (int) (short) 10, (java.lang.Integer) 100, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest80.FuzzTest_set(intList83, intList87, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList66, intList87, 100, (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_set(intList5, intList9, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, 1, 0, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest2.FuzzTest_set(intList21, intList23, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_set(intList1, intList21, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 0, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest38.FuzzTest_set(intList41, intList45, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest55.FuzzTest_set(intList58, intList62, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest68.FuzzTest_set(intList71, intList75, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = null;
        fuzzTest55.FuzzTest_set(intList71, intList81, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest38.FuzzTest_set(intList53, intList81, 100, (java.lang.Integer) 10, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList36, intList53, (int) '4', (java.lang.Integer) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_set(intList4, intList8, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest15.FuzzTest_set(intList18, intList22, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_set(intList14, intList22, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_set(intList35, intList39, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 1, 10, 10, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest1.FuzzTest_set(intList35, intList51, 0, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest57.FuzzTest_set(intList60, intList64, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList51, intList60, 10, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 1, 0, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest0.FuzzTest_set(intList19, intList21, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_set(intList29, intList33, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_set(intList43, intList47, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest26.FuzzTest_set(intList39, intList47, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = null;
        fuzzTest26.FuzzTest_set(intList59, intList61, (int) (short) 100, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest66.FuzzTest_set(intList69, intList73, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList59, intList69, (int) ' ', (java.lang.Integer) (-1), (java.lang.Integer) 1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_set(intList4, intList8, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest15.FuzzTest_set(intList18, intList22, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_set(intList14, intList22, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_set(intList35, intList39, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = null;
        fuzzTest1.FuzzTest_set(intList35, intList45, (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest0.FuzzTest_set(intList45, intList50, (int) (short) 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest55.FuzzTest_set(intList58, intList62, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest68.FuzzTest_set(intList71, intList75, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList62, intList71, (int) (byte) 100, (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList13, intList21, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_set(intList34, intList38, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { (-1), 1, 10, 10, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest0.FuzzTest_set(intList34, intList50, 0, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest57.FuzzTest_set(intList60, intList64, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList56, intList64, (-1), (java.lang.Integer) (-1), (java.lang.Integer) 100);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, 1, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest80.FuzzTest_set(intList83, intList87, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList78, intList83, (int) ' ', (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_set(intList5, intList9, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest19.FuzzTest_set(intList22, intList26, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_set(intList35, intList39, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = null;
        fuzzTest19.FuzzTest_set(intList35, intList45, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest2.FuzzTest_set(intList17, intList45, 100, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_set(intList1, intList45, 100, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest62.FuzzTest_set(intList65, intList69, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList60, intList69, (int) (byte) 100, (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 1, 0, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest0.FuzzTest_set(intList19, intList21, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_set(intList30, intList34, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_set(intList43, intList47, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_set(intList56, intList60, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = null;
        fuzzTest40.FuzzTest_set(intList56, intList66, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest26.FuzzTest_set(intList34, intList56, (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest75.FuzzTest_set(intList78, intList82, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList34, intList82, (int) (short) 1, (java.lang.Integer) 100, (java.lang.Integer) 100);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 1, 0, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = null;
        fuzzTest14.FuzzTest_set(intList33, intList35, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_set(intList13, intList33, (int) 'a', (java.lang.Integer) (-1), (java.lang.Integer) 0);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10, 0, 0, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest52.FuzzTest_set(intList55, intList59, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 1, 0, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = null;
        fuzzTest52.FuzzTest_set(intList71, intList73, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest78.FuzzTest_set(intList81, intList85, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList91 = null;
        fuzzTest52.FuzzTest_set(intList85, intList91, (int) (short) -1, (java.lang.Integer) (-1), (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList50, intList85, (int) (byte) 10, (java.lang.Integer) 10, (java.lang.Integer) 10);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 1, 0, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest0.FuzzTest_set(intList19, intList21, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_set(intList33, intList37, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest43.FuzzTest_set(intList46, intList50, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = null;
        fuzzTest30.FuzzTest_set(intList46, intList56, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_set(intList64, intList68, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = null;
        fuzzTest30.FuzzTest_set(intList68, intList74, 1, (java.lang.Integer) 100, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList28, intList68, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList13, intList21, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_set(intList34, intList38, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = null;
        fuzzTest0.FuzzTest_set(intList34, intList44, (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_set(intList52, intList56, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest62.FuzzTest_set(intList65, intList69, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList52, intList65, (int) (short) 10, (java.lang.Integer) 100, (java.lang.Integer) 100);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 1, 0, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = null;
        fuzzTest14.FuzzTest_set(intList33, intList35, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_set(intList13, intList33, (int) 'a', (java.lang.Integer) (-1), (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = null;
        fuzzTest0.FuzzTest_set(intList44, intList45, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = null;
        fuzzTest0.FuzzTest_set(intList50, intList51, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_set(intList59, intList63, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList59, intList72, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) 10);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_set(intList5, intList9, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = null;
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest16.FuzzTest_set(intList19, intList23, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest2.FuzzTest_set(intList15, intList19, (int) (short) 10, (java.lang.Integer) 100, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_set(intList1, intList19, (int) (byte) 10, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest43.FuzzTest_set(intList46, intList50, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100, 1, 0, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = null;
        fuzzTest43.FuzzTest_set(intList62, intList64, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzzTest41.FuzzTest_set(intList42, intList62, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList39, intList62, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) 10);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest7.FuzzTest_set(intList10, intList14, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_set(intList27, intList31, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest37.FuzzTest_set(intList40, intList44, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest24.FuzzTest_set(intList40, intList50, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest7.FuzzTest_set(intList22, intList50, 100, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest59.FuzzTest_set(intList62, intList66, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 1, 0, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = null;
        fuzzTest59.FuzzTest_set(intList78, intList80, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = null;
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 100, 0, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        fuzzTest59.FuzzTest_set(intList85, intList90, (int) (byte) -1, (java.lang.Integer) 10, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList22, intList90, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 10);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList13, intList21, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_set(intList35, intList39, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList31, intList35, (int) (short) 1, (java.lang.Integer) 1, (java.lang.Integer) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest0.FuzzTest_set(intList49, intList50, (-1), (java.lang.Integer) 100, (java.lang.Integer) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = null;
        fuzzTest0.FuzzTest_set(intList55, intList56, (-1), (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_set(intList64, intList68, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 100, 100, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList68, intList79, (int) (short) 1, (java.lang.Integer) 100, (java.lang.Integer) 10);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList13, intList17, (int) (short) 10, (java.lang.Integer) 100, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_set(intList34, intList38, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_set(intList48, intList52, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest31.FuzzTest_set(intList44, intList48, (int) (short) 10, (java.lang.Integer) 100, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest62.FuzzTest_set(intList65, intList69, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList48, intList69, (int) (byte) 10, (java.lang.Integer) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
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
        fuzzTest3.FuzzTest_set(intList6, intList10, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 1, 0, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzzTest3.FuzzTest_set(intList22, intList24, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzzTest1.FuzzTest_set(intList2, intList22, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = null;
        fuzzTest1.FuzzTest_set(intList33, intList34, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest39.FuzzTest_set(intList42, intList46, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 1, 0, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzzTest39.FuzzTest_set(intList58, intList60, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_set(intList68, intList72, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_set(intList60, intList68, (int) (short) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList89 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        fuzzTest82.FuzzTest_set(intList85, intList89, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList68, intList89, (int) (short) 1, (java.lang.Integer) 10, (java.lang.Integer) 1);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList13, intList21, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = null;
        fuzzTest0.FuzzTest_set(intList33, intList35, (int) (short) 100, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_set(intList43, intList47, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = null;
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest54.FuzzTest_set(intList57, intList61, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest40.FuzzTest_set(intList53, intList61, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest71.FuzzTest_set(intList74, intList78, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = null;
        fuzzTest40.FuzzTest_set(intList74, intList84, (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 10, 100, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList93 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList74, intList93, (int) (byte) 1, (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_set(intList30, intList34, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_set(intList43, intList47, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = null;
        fuzzTest27.FuzzTest_set(intList43, intList53, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest13.FuzzTest_set(intList21, intList43, (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = null;
        fuzzTest0.FuzzTest_set(intList43, intList62, 0, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest72.FuzzTest_set(intList75, intList79, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList70, intList79, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_set(intList7, intList8, (int) (short) -1, (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_set(intList17, intList21, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_set(intList30, intList34, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_set(intList43, intList47, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = null;
        fuzzTest27.FuzzTest_set(intList43, intList53, 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzzTest13.FuzzTest_set(intList21, intList43, (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest62.FuzzTest_set(intList65, intList69, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = null;
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest76.FuzzTest_set(intList79, intList83, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest62.FuzzTest_set(intList75, intList83, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList43, intList83, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 1, 0, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = null;
        fuzzTest0.FuzzTest_set(intList19, intList21, (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzzTest0.FuzzTest_set(intList26, intList27, (-1), (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = null;
        fuzzTest32.FuzzTest_set(intList33, intList34, (int) (byte) -1, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = null;
        fuzzTest40.FuzzTest_set(intList41, intList42, (int) (byte) -1, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest47.FuzzTest_set(intList50, intList54, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_set(intList64, intList68, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest47.FuzzTest_set(intList60, intList64, (int) (short) 10, (java.lang.Integer) 100, (java.lang.Integer) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = null;
        fuzzTest40.FuzzTest_set(intList64, intList78, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzzTest32.FuzzTest_set(intList39, intList64, (int) (short) 10, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { (-1), 100, (-1), 1, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList93 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList64, intList93, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) 1);
    }
}

