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
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100, 10, 1, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue24 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue35 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        fuzzTest27.FuzzTest_remove(intQueue35, intQueue41, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue61 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        fuzzTest47.FuzzTest_remove(intQueue55, intQueue61, (java.lang.Integer) 2, false);
        fuzzTest27.FuzzTest_remove(intQueue46, intQueue61, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue72 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzzTest26.FuzzTest_remove(intQueue61, intQueue72, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue24, intQueue61, (java.lang.Integer) 0, false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue9 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        fuzzTest1.FuzzTest_remove(intQueue9, intQueue15, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue29 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue35 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzzTest21.FuzzTest_remove(intQueue29, intQueue35, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_remove(intQueue20, intQueue35, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue46 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        fuzzTest0.FuzzTest_remove(intQueue35, intQueue46, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue59 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue65 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        fuzzTest51.FuzzTest_remove(intQueue59, intQueue65, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue79 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue85 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        fuzzTest71.FuzzTest_remove(intQueue79, intQueue85, (java.lang.Integer) 2, false);
        fuzzTest51.FuzzTest_remove(intQueue70, intQueue85, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue93 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue85, intQueue93, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzzTest19.FuzzTest_remove(intQueue27, intQueue33, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue46 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        fuzzTest38.FuzzTest_remove(intQueue46, intQueue52, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue65 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue71 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        fuzzTest57.FuzzTest_remove(intQueue65, intQueue71, (java.lang.Integer) 2, false);
        fuzzTest19.FuzzTest_remove(intQueue52, intQueue71, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue79 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue52, intQueue79, (java.lang.Integer) 100, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 10, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzzTest7.FuzzTest_remove(intQueue15, intQueue21, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue35 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        fuzzTest27.FuzzTest_remove(intQueue35, intQueue41, (java.lang.Integer) 2, false);
        fuzzTest7.FuzzTest_remove(intQueue26, intQueue41, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue57 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue63 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzzTest49.FuzzTest_remove(intQueue57, intQueue63, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue76 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue82 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        fuzzTest68.FuzzTest_remove(intQueue76, intQueue82, (java.lang.Integer) 2, false);
        fuzzTest7.FuzzTest_remove(intQueue63, intQueue82, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue6, intQueue63, (java.lang.Integer) 2, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10, 2, 2, 0, 1, 1 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue18 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue24 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        fuzzTest10.FuzzTest_remove(intQueue18, intQueue24, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue18, (java.lang.Integer) 2, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = null;
        fuzzTest19.FuzzTest_remove(intQueue20, intQueue21, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue39 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        fuzzTest25.FuzzTest_remove(intQueue33, intQueue39, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue53 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue59 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        fuzzTest45.FuzzTest_remove(intQueue53, intQueue59, (java.lang.Integer) 2, false);
        fuzzTest25.FuzzTest_remove(intQueue44, intQueue59, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue20, intQueue44, (java.lang.Integer) 0, false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_remove(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue28, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue50 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzzTest42.FuzzTest_remove(intQueue50, intQueue56, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue70 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue76 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        fuzzTest62.FuzzTest_remove(intQueue70, intQueue76, (java.lang.Integer) 2, false);
        fuzzTest42.FuzzTest_remove(intQueue61, intQueue76, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue84 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_remove(intQueue84, intQueue85, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest89 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue90 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue91 = null;
        fuzzTest89.FuzzTest_remove(intQueue90, intQueue91, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue84, intQueue90, (java.lang.Integer) 0, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue31 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest23.FuzzTest_remove(intQueue31, intQueue37, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue51 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue57 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzzTest43.FuzzTest_remove(intQueue51, intQueue57, (java.lang.Integer) 2, false);
        fuzzTest23.FuzzTest_remove(intQueue42, intQueue57, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue21, intQueue42, (java.lang.Integer) 1, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzzTest7.FuzzTest_remove(intQueue15, intQueue21, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue40 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzzTest26.FuzzTest_remove(intQueue34, intQueue40, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue53 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue59 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        fuzzTest45.FuzzTest_remove(intQueue53, intQueue59, (java.lang.Integer) 2, false);
        fuzzTest7.FuzzTest_remove(intQueue40, intQueue59, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_remove(intQueue6, intQueue40, (java.lang.Integer) 100, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue79 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue85 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        fuzzTest71.FuzzTest_remove(intQueue79, intQueue85, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue70, intQueue85, (java.lang.Integer) 0, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        fuzzTest6.FuzzTest_remove(intQueue14, intQueue20, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue35 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        fuzzTest27.FuzzTest_remove(intQueue35, intQueue41, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue54 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue60 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        fuzzTest46.FuzzTest_remove(intQueue54, intQueue60, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue79 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        fuzzTest65.FuzzTest_remove(intQueue73, intQueue79, (java.lang.Integer) 2, false);
        fuzzTest27.FuzzTest_remove(intQueue60, intQueue79, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue87 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue88 = null;
        fuzzTest27.FuzzTest_remove(intQueue87, intQueue88, (java.lang.Integer) 10, false);
        fuzzTest25.FuzzTest_remove(intQueue26, intQueue87, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue20, intQueue87, (java.lang.Integer) 1, false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_remove(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue34, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue50 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzzTest42.FuzzTest_remove(intQueue50, intQueue56, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue62 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue63 = null;
        fuzzTest61.FuzzTest_remove(intQueue62, intQueue63, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue56, intQueue62, (java.lang.Integer) 1, false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = null;
        fuzzTest6.FuzzTest_remove(intQueue7, intQueue8, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 10, 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue18 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_remove(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue53 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        fuzzTest39.FuzzTest_remove(intQueue47, intQueue53, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue66 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue72 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzzTest58.FuzzTest_remove(intQueue66, intQueue72, (java.lang.Integer) 2, false);
        fuzzTest20.FuzzTest_remove(intQueue53, intQueue72, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue80 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_remove(intQueue80, intQueue81, (java.lang.Integer) 10, false);
        fuzzTest12.FuzzTest_remove(intQueue18, intQueue81, (java.lang.Integer) 2, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue7, intQueue81, (java.lang.Integer) 1, false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue18 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue24 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        fuzzTest10.FuzzTest_remove(intQueue18, intQueue24, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue38 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        fuzzTest30.FuzzTest_remove(intQueue38, intQueue44, (java.lang.Integer) 2, false);
        fuzzTest10.FuzzTest_remove(intQueue29, intQueue44, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_remove(intQueue52, intQueue53, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue53, (java.lang.Integer) 0, false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue6 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = null;
        fuzzTest0.FuzzTest_remove(intQueue6, intQueue7, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, (-1), 10, 0, 0, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue18 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue29 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue35 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzzTest21.FuzzTest_remove(intQueue29, intQueue35, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue49 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        fuzzTest41.FuzzTest_remove(intQueue49, intQueue55, (java.lang.Integer) 2, false);
        fuzzTest21.FuzzTest_remove(intQueue40, intQueue55, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue66 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        fuzzTest20.FuzzTest_remove(intQueue55, intQueue66, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue83 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue89 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue89, intArray88);
        fuzzTest75.FuzzTest_remove(intQueue83, intQueue89, (java.lang.Integer) 2, false);
        fuzzTest20.FuzzTest_remove(intQueue73, intQueue83, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue18, intQueue73, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue4 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest3.FuzzTest_remove(intQueue4, intQueue5, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue18 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue24 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        fuzzTest10.FuzzTest_remove(intQueue18, intQueue24, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzzTest29.FuzzTest_remove(intQueue37, intQueue43, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue62 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        fuzzTest48.FuzzTest_remove(intQueue56, intQueue62, (java.lang.Integer) 2, false);
        fuzzTest10.FuzzTest_remove(intQueue43, intQueue62, (java.lang.Integer) 0, true);
        fuzzTest3.FuzzTest_remove(intQueue9, intQueue43, (java.lang.Integer) 100, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_remove(intQueue43, intQueue73, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue43, (java.lang.Integer) 0, false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        fuzzTest6.FuzzTest_remove(intQueue14, intQueue20, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue40 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzzTest26.FuzzTest_remove(intQueue34, intQueue40, (java.lang.Integer) 2, false);
        fuzzTest6.FuzzTest_remove(intQueue25, intQueue40, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(intQueue48, intQueue49, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue54 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = null;
        fuzzTest53.FuzzTest_remove(intQueue54, intQueue55, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue49, intQueue54, (java.lang.Integer) 0, false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue10 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        fuzzTest2.FuzzTest_remove(intQueue10, intQueue16, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue16, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue6 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = null;
        fuzzTest0.FuzzTest_remove(intQueue6, intQueue7, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzzTest13.FuzzTest_remove(intQueue21, intQueue27, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest33.FuzzTest_remove(intQueue41, intQueue47, (java.lang.Integer) 2, false);
        fuzzTest13.FuzzTest_remove(intQueue32, intQueue47, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_remove(intQueue55, intQueue56, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue68 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue74 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        fuzzTest60.FuzzTest_remove(intQueue68, intQueue74, (java.lang.Integer) 2, false);
        fuzzTest12.FuzzTest_remove(intQueue56, intQueue68, (java.lang.Integer) 2, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue11, intQueue56, (java.lang.Integer) 0, false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_remove(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue28, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0, 100, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue46 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue62 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        fuzzTest48.FuzzTest_remove(intQueue56, intQueue62, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue76 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue82 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        fuzzTest68.FuzzTest_remove(intQueue76, intQueue82, (java.lang.Integer) 2, false);
        fuzzTest48.FuzzTest_remove(intQueue67, intQueue82, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue90 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue91 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_remove(intQueue90, intQueue91, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue46, intQueue90, (java.lang.Integer) 1, false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzzTest7.FuzzTest_remove(intQueue15, intQueue21, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue35 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        fuzzTest27.FuzzTest_remove(intQueue35, intQueue41, (java.lang.Integer) 2, false);
        fuzzTest7.FuzzTest_remove(intQueue26, intQueue35, (java.lang.Integer) 10, false);
        fuzzTest0.FuzzTest_remove(intQueue6, intQueue26, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue61 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue67 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        fuzzTest53.FuzzTest_remove(intQueue61, intQueue67, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 2, 100, 100, 100, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue78 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        fuzzTest52.FuzzTest_remove(intQueue61, intQueue78, (java.lang.Integer) 2, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue83 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue78, intQueue83, (java.lang.Integer) 100, false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue6 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = null;
        fuzzTest0.FuzzTest_remove(intQueue6, intQueue7, (java.lang.Integer) 0, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzzTest13.FuzzTest_remove(intQueue21, intQueue27, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 100, 100, 100, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue38 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        fuzzTest12.FuzzTest_remove(intQueue21, intQueue38, (java.lang.Integer) 2, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue11, intQueue38, (java.lang.Integer) 2, false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), (-1), 2, 100, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue13 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = null;
        fuzzTest0.FuzzTest_remove(intQueue13, intQueue15, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = null;
        fuzzTest19.FuzzTest_remove(intQueue20, intQueue21, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue40 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzzTest26.FuzzTest_remove(intQueue34, intQueue40, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue54 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue60 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        fuzzTest46.FuzzTest_remove(intQueue54, intQueue60, (java.lang.Integer) 2, false);
        fuzzTest26.FuzzTest_remove(intQueue45, intQueue54, (java.lang.Integer) 10, false);
        fuzzTest19.FuzzTest_remove(intQueue25, intQueue45, (java.lang.Integer) 2, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue71 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_remove(intQueue71, intQueue72, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 2, 1, 1, 100, 100, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue83 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue72, intQueue83, (java.lang.Integer) 0, false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 10, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue22 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        fuzzTest8.FuzzTest_remove(intQueue16, intQueue22, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue35 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        fuzzTest27.FuzzTest_remove(intQueue35, intQueue41, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue54 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue60 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        fuzzTest46.FuzzTest_remove(intQueue54, intQueue60, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue79 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        fuzzTest65.FuzzTest_remove(intQueue73, intQueue79, (java.lang.Integer) 2, false);
        fuzzTest27.FuzzTest_remove(intQueue60, intQueue79, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue87 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_remove(intQueue87, intQueue88, (java.lang.Integer) 10, false);
        fuzzTest7.FuzzTest_remove(intQueue22, intQueue87, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue6, intQueue22, (java.lang.Integer) 1, false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue6 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = null;
        fuzzTest0.FuzzTest_remove(intQueue6, intQueue7, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue12 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue13 = null;
        fuzzTest11.FuzzTest_remove(intQueue12, intQueue13, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue31 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        fuzzTest17.FuzzTest_remove(intQueue25, intQueue31, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue50 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        fuzzTest36.FuzzTest_remove(intQueue44, intQueue50, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue64 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue70 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        fuzzTest56.FuzzTest_remove(intQueue64, intQueue70, (java.lang.Integer) 2, false);
        fuzzTest36.FuzzTest_remove(intQueue55, intQueue70, (java.lang.Integer) 10, true);
        fuzzTest11.FuzzTest_remove(intQueue25, intQueue70, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue82 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue83 = null;
        fuzzTest81.FuzzTest_remove(intQueue82, intQueue83, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest87 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue88 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue89 = null;
        fuzzTest87.FuzzTest_remove(intQueue88, intQueue89, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue93 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_remove(intQueue89, intQueue93, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue70, intQueue93, (java.lang.Integer) 2, false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_remove(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue34, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue42 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intQueue42, intQueue43, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue47 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = null;
        fuzzTest0.FuzzTest_remove(intQueue47, intQueue48, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue53 = null;
        fuzzTest0.FuzzTest_remove(intQueue52, intQueue53, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue59 = null;
        fuzzTest57.FuzzTest_remove(intQueue58, intQueue59, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue63 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue64 = null;
        fuzzTest57.FuzzTest_remove(intQueue63, intQueue64, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, (-1), 100, (-1), 1 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue74 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue63, intQueue74, (java.lang.Integer) 1, false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue4 = null;
        fuzzTest2.FuzzTest_remove(intQueue3, intQueue4, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue4, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue11 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue12 = null;
        fuzzTest0.FuzzTest_remove(intQueue11, intQueue12, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue17 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue18 = null;
        fuzzTest16.FuzzTest_remove(intQueue17, intQueue18, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue30 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        fuzzTest22.FuzzTest_remove(intQueue30, intQueue36, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue50 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzzTest42.FuzzTest_remove(intQueue50, intQueue56, (java.lang.Integer) 2, false);
        fuzzTest22.FuzzTest_remove(intQueue41, intQueue56, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue64 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_remove(intQueue64, intQueue65, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue69 = null;
        fuzzTest16.FuzzTest_remove(intQueue64, intQueue69, (java.lang.Integer) 100, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_remove(intQueue73, intQueue74, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue79 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue80 = null;
        fuzzTest78.FuzzTest_remove(intQueue79, intQueue80, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue85 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue86 = null;
        fuzzTest84.FuzzTest_remove(intQueue85, intQueue86, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue90 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_remove(intQueue86, intQueue90, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue74, intQueue90, (java.lang.Integer) 100, false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue4 = null;
        fuzzTest2.FuzzTest_remove(intQueue3, intQueue4, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue4, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue11 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue12 = null;
        fuzzTest0.FuzzTest_remove(intQueue11, intQueue12, (java.lang.Integer) (-1), true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue17 = null;
        fuzzTest0.FuzzTest_remove(intQueue16, intQueue17, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue29 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue35 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzzTest21.FuzzTest_remove(intQueue29, intQueue35, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = null;
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue46 = null;
        fuzzTest44.FuzzTest_remove(intQueue45, intQueue46, (java.lang.Integer) 1, false);
        fuzzTest42.FuzzTest_remove(intQueue43, intQueue46, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue53 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue54 = null;
        fuzzTest42.FuzzTest_remove(intQueue53, intQueue54, (java.lang.Integer) (-1), true);
        fuzzTest40.FuzzTest_remove(intQueue41, intQueue53, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue35, intQueue53, (java.lang.Integer) 100, false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue4 = null;
        fuzzTest2.FuzzTest_remove(intQueue3, intQueue4, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue4, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue26 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        fuzzTest12.FuzzTest_remove(intQueue20, intQueue26, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 2, 100, 100, 100, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest11.FuzzTest_remove(intQueue20, intQueue37, (java.lang.Integer) 2, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue42 = null;
        fuzzTest0.FuzzTest_remove(intQueue20, intQueue42, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue47 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = null;
        fuzzTest46.FuzzTest_remove(intQueue47, intQueue48, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), (-1), 2, 100, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue59 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue61 = null;
        fuzzTest46.FuzzTest_remove(intQueue59, intQueue61, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue65 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_remove(intQueue65, intQueue66, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue70 = null;
        fuzzTest0.FuzzTest_remove(intQueue66, intQueue70, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue74 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue75 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue74, intQueue75, (java.lang.Integer) 1, false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), (-1), 2, 100, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue13 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = null;
        fuzzTest0.FuzzTest_remove(intQueue13, intQueue15, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue20, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue39 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        fuzzTest25.FuzzTest_remove(intQueue33, intQueue39, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 100, 100, 100, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue50 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        fuzzTest24.FuzzTest_remove(intQueue33, intQueue50, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue57 = null;
        fuzzTest55.FuzzTest_remove(intQueue56, intQueue57, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue61 = null;
        fuzzTest24.FuzzTest_remove(intQueue56, intQueue61, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue65 = null;
        fuzzTest0.FuzzTest_remove(intQueue61, intQueue65, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue70 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue71 = null;
        fuzzTest69.FuzzTest_remove(intQueue70, intQueue71, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), (-1), 2, 100, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue82 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue84 = null;
        fuzzTest69.FuzzTest_remove(intQueue82, intQueue84, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 0, 1, 0, 2, 1, 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue95 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue95, intArray94);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue82, intQueue95, (java.lang.Integer) 1, false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue10 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        fuzzTest2.FuzzTest_remove(intQueue10, intQueue16, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue30 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        fuzzTest22.FuzzTest_remove(intQueue30, intQueue36, (java.lang.Integer) 2, false);
        fuzzTest2.FuzzTest_remove(intQueue21, intQueue36, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzzTest44.FuzzTest_remove(intQueue52, intQueue58, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue71 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue77 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        fuzzTest63.FuzzTest_remove(intQueue71, intQueue77, (java.lang.Integer) 2, false);
        fuzzTest2.FuzzTest_remove(intQueue58, intQueue71, (java.lang.Integer) 0, false);
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue58, (java.lang.Integer) 10, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue88 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intQueue88, intQueue89, (java.lang.Integer) (-1), false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue93 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue94 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue93, intQueue94, (java.lang.Integer) 100, false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue6 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = null;
        fuzzTest0.FuzzTest_remove(intQueue6, intQueue7, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue13 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = null;
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue18 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = null;
        fuzzTest17.FuzzTest_remove(intQueue18, intQueue19, (java.lang.Integer) 1, false);
        fuzzTest15.FuzzTest_remove(intQueue16, intQueue19, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue27 = null;
        fuzzTest15.FuzzTest_remove(intQueue26, intQueue27, (java.lang.Integer) (-1), true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue31 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = null;
        fuzzTest15.FuzzTest_remove(intQueue31, intQueue32, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue39 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue40 = null;
        fuzzTest38.FuzzTest_remove(intQueue39, intQueue40, (java.lang.Integer) 1, false);
        fuzzTest36.FuzzTest_remove(intQueue37, intQueue40, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue47 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = null;
        fuzzTest36.FuzzTest_remove(intQueue47, intQueue48, (java.lang.Integer) (-1), true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue53 = null;
        fuzzTest36.FuzzTest_remove(intQueue52, intQueue53, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue59 = null;
        fuzzTest57.FuzzTest_remove(intQueue58, intQueue59, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue63 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue64 = null;
        fuzzTest57.FuzzTest_remove(intQueue63, intQueue64, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue69 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue70 = null;
        fuzzTest68.FuzzTest_remove(intQueue69, intQueue70, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue74 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue75 = null;
        fuzzTest68.FuzzTest_remove(intQueue74, intQueue75, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue79 = null;
        fuzzTest57.FuzzTest_remove(intQueue74, intQueue79, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue83 = null;
        fuzzTest36.FuzzTest_remove(intQueue74, intQueue83, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue89 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue89, intArray88);
        fuzzTest15.FuzzTest_remove(intQueue74, intQueue89, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue13, intQueue74, (java.lang.Integer) 10, false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = null;
        fuzzTest6.FuzzTest_remove(intQueue7, intQueue8, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzzTest13.FuzzTest_remove(intQueue21, intQueue27, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest33.FuzzTest_remove(intQueue41, intQueue47, (java.lang.Integer) 2, false);
        fuzzTest13.FuzzTest_remove(intQueue32, intQueue47, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzzTest12.FuzzTest_remove(intQueue47, intQueue58, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue7, intQueue47, (java.lang.Integer) 1, false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = null;
        fuzzTest6.FuzzTest_remove(intQueue7, intQueue8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue13 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = null;
        fuzzTest12.FuzzTest_remove(intQueue13, intQueue14, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(intQueue14, intQueue18, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue30 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        fuzzTest22.FuzzTest_remove(intQueue30, intQueue36, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue50 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzzTest42.FuzzTest_remove(intQueue50, intQueue56, (java.lang.Integer) 2, false);
        fuzzTest22.FuzzTest_remove(intQueue41, intQueue56, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue18, intQueue56, (java.lang.Integer) 1, false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), (-1), 2, 100, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue13 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = null;
        fuzzTest0.FuzzTest_remove(intQueue13, intQueue15, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = null;
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue20, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue26 = null;
        fuzzTest24.FuzzTest_remove(intQueue25, intQueue26, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue39 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        fuzzTest31.FuzzTest_remove(intQueue39, intQueue45, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 100, 100, 100, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzzTest30.FuzzTest_remove(intQueue39, intQueue56, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue62 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue63 = null;
        fuzzTest61.FuzzTest_remove(intQueue62, intQueue63, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue67 = null;
        fuzzTest30.FuzzTest_remove(intQueue62, intQueue67, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue71 = null;
        fuzzTest24.FuzzTest_remove(intQueue62, intQueue71, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue76 = null;
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue78 = null;
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue80 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue81 = null;
        fuzzTest79.FuzzTest_remove(intQueue80, intQueue81, (java.lang.Integer) 1, false);
        fuzzTest77.FuzzTest_remove(intQueue78, intQueue81, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue88 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue89 = null;
        fuzzTest77.FuzzTest_remove(intQueue88, intQueue89, (java.lang.Integer) (-1), true);
        fuzzTest75.FuzzTest_remove(intQueue76, intQueue88, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue62, intQueue88, (java.lang.Integer) 100, false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue6 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = null;
        fuzzTest0.FuzzTest_remove(intQueue6, intQueue7, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue12 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue13 = null;
        fuzzTest11.FuzzTest_remove(intQueue12, intQueue13, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue17 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue18 = null;
        fuzzTest11.FuzzTest_remove(intQueue17, intQueue18, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue23 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue24 = null;
        fuzzTest22.FuzzTest_remove(intQueue23, intQueue24, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue29 = null;
        fuzzTest22.FuzzTest_remove(intQueue28, intQueue29, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = null;
        fuzzTest11.FuzzTest_remove(intQueue28, intQueue33, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue38 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue39 = null;
        fuzzTest37.FuzzTest_remove(intQueue38, intQueue39, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = null;
        fuzzTest43.FuzzTest_remove(intQueue44, intQueue45, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_remove(intQueue45, intQueue49, (java.lang.Integer) 100, true);
        fuzzTest0.FuzzTest_remove(intQueue33, intQueue49, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue64 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue70 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        fuzzTest56.FuzzTest_remove(intQueue64, intQueue70, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue75 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue70, intQueue75, (java.lang.Integer) 10, false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), (-1), 2, 100, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue13 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = null;
        fuzzTest0.FuzzTest_remove(intQueue13, intQueue15, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10, 10, 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue23 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue39 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        fuzzTest25.FuzzTest_remove(intQueue33, intQueue39, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue53 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue59 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        fuzzTest45.FuzzTest_remove(intQueue53, intQueue59, (java.lang.Integer) 2, false);
        fuzzTest25.FuzzTest_remove(intQueue44, intQueue53, (java.lang.Integer) 10, false);
        fuzzTest0.FuzzTest_remove(intQueue23, intQueue44, (java.lang.Integer) 100, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue79 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue85 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        fuzzTest71.FuzzTest_remove(intQueue79, intQueue85, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue70, intQueue85, (java.lang.Integer) 10, false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue6 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = null;
        fuzzTest0.FuzzTest_remove(intQueue6, intQueue7, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue12 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue13 = null;
        fuzzTest11.FuzzTest_remove(intQueue12, intQueue13, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue31 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        fuzzTest17.FuzzTest_remove(intQueue25, intQueue31, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue50 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        fuzzTest36.FuzzTest_remove(intQueue44, intQueue50, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue64 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue70 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        fuzzTest56.FuzzTest_remove(intQueue64, intQueue70, (java.lang.Integer) 2, false);
        fuzzTest36.FuzzTest_remove(intQueue55, intQueue70, (java.lang.Integer) 10, true);
        fuzzTest11.FuzzTest_remove(intQueue25, intQueue70, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue82 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue83 = null;
        fuzzTest81.FuzzTest_remove(intQueue82, intQueue83, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue70, intQueue82, (java.lang.Integer) 10, false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), (-1), 2, 100, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue13 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = null;
        fuzzTest0.FuzzTest_remove(intQueue13, intQueue15, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_remove(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue28, (java.lang.Integer) 0, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = null;
        fuzzTest43.FuzzTest_remove(intQueue44, intQueue45, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), (-1), 2, 100, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = null;
        fuzzTest43.FuzzTest_remove(intQueue56, intQueue58, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue62 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue63 = null;
        fuzzTest43.FuzzTest_remove(intQueue62, intQueue63, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue76 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue82 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        fuzzTest68.FuzzTest_remove(intQueue76, intQueue82, (java.lang.Integer) 2, false);
        fuzzTest43.FuzzTest_remove(intQueue67, intQueue76, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue42, intQueue76, (java.lang.Integer) 100, false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue6 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = null;
        fuzzTest0.FuzzTest_remove(intQueue6, intQueue7, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzzTest11.FuzzTest_remove(intQueue19, intQueue25, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue31 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = null;
        fuzzTest30.FuzzTest_remove(intQueue31, intQueue32, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue51 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        fuzzTest37.FuzzTest_remove(intQueue45, intQueue51, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue65 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue71 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        fuzzTest57.FuzzTest_remove(intQueue65, intQueue71, (java.lang.Integer) 2, false);
        fuzzTest37.FuzzTest_remove(intQueue56, intQueue65, (java.lang.Integer) 10, false);
        fuzzTest30.FuzzTest_remove(intQueue36, intQueue56, (java.lang.Integer) 2, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue82 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_remove(intQueue82, intQueue83, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue25, intQueue83, (java.lang.Integer) 10, false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        fuzzTest6.FuzzTest_remove(intQueue14, intQueue20, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue40 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzzTest26.FuzzTest_remove(intQueue34, intQueue40, (java.lang.Integer) 2, false);
        fuzzTest6.FuzzTest_remove(intQueue25, intQueue40, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_remove(intQueue48, intQueue49, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 2, 10, 100, 1, 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue60 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue48, intQueue60, (java.lang.Integer) 0, false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzzTest19.FuzzTest_remove(intQueue27, intQueue33, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue46 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        fuzzTest38.FuzzTest_remove(intQueue46, intQueue52, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intQueue33, intQueue52, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue60 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intQueue60, intQueue61, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue66 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue67 = null;
        fuzzTest65.FuzzTest_remove(intQueue66, intQueue67, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue71 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue72 = null;
        fuzzTest65.FuzzTest_remove(intQueue71, intQueue72, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue77 = null;
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue79 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue80 = null;
        fuzzTest78.FuzzTest_remove(intQueue79, intQueue80, (java.lang.Integer) 1, false);
        fuzzTest76.FuzzTest_remove(intQueue77, intQueue80, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue87 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue88 = null;
        fuzzTest76.FuzzTest_remove(intQueue87, intQueue88, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue71, intQueue87, (java.lang.Integer) 0, false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = null;
        fuzzTest1.FuzzTest_remove(intQueue2, intQueue3, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = null;
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue10 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue11 = null;
        fuzzTest9.FuzzTest_remove(intQueue10, intQueue11, (java.lang.Integer) 1, false);
        fuzzTest7.FuzzTest_remove(intQueue8, intQueue11, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue18 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = null;
        fuzzTest7.FuzzTest_remove(intQueue18, intQueue19, (java.lang.Integer) (-1), true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue23 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue24 = null;
        fuzzTest7.FuzzTest_remove(intQueue23, intQueue24, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue29 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue30 = null;
        fuzzTest28.FuzzTest_remove(intQueue29, intQueue30, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue35 = null;
        fuzzTest28.FuzzTest_remove(intQueue34, intQueue35, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue40 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = null;
        fuzzTest39.FuzzTest_remove(intQueue40, intQueue41, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue46 = null;
        fuzzTest39.FuzzTest_remove(intQueue45, intQueue46, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue50 = null;
        fuzzTest28.FuzzTest_remove(intQueue45, intQueue50, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue54 = null;
        fuzzTest7.FuzzTest_remove(intQueue45, intQueue54, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue2, intQueue45, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_remove(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue34, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue42 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intQueue42, intQueue43, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue47 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = null;
        fuzzTest0.FuzzTest_remove(intQueue47, intQueue48, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue62 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue68 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        fuzzTest54.FuzzTest_remove(intQueue62, intQueue68, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = null;
        fuzzTest53.FuzzTest_remove(intQueue68, intQueue73, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue52, intQueue68, (java.lang.Integer) 1, false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue4 = null;
        fuzzTest2.FuzzTest_remove(intQueue3, intQueue4, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue4, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue12 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue13 = null;
        fuzzTest11.FuzzTest_remove(intQueue12, intQueue13, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue18 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = null;
        fuzzTest17.FuzzTest_remove(intQueue18, intQueue19, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue38 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        fuzzTest24.FuzzTest_remove(intQueue32, intQueue38, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzzTest44.FuzzTest_remove(intQueue52, intQueue58, (java.lang.Integer) 2, false);
        fuzzTest24.FuzzTest_remove(intQueue43, intQueue52, (java.lang.Integer) 10, false);
        fuzzTest17.FuzzTest_remove(intQueue23, intQueue43, (java.lang.Integer) 2, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue69 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_remove(intQueue69, intQueue70, (java.lang.Integer) (-1), false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_remove(intQueue69, intQueue74, (java.lang.Integer) 2, true);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue79 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue80 = null;
        fuzzTest78.FuzzTest_remove(intQueue79, intQueue80, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue74, intQueue79, (java.lang.Integer) 1, false);
    }
}

