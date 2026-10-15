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
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_remove(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue34, (java.lang.Integer) 10, true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
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
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue18, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest33.FuzzTest_remove(intQueue41, intQueue47, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue32, intQueue47, (java.lang.Integer) 10, true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
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
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue18, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue51 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue57 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzzTest43.FuzzTest_remove(intQueue51, intQueue57, (java.lang.Integer) 2, false);
        fuzzTest33.FuzzTest_remove(intQueue41, intQueue51, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue79 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        fuzzTest65.FuzzTest_remove(intQueue73, intQueue79, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_remove(intQueue79, intQueue84, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue32, intQueue79, (java.lang.Integer) 0, true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
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
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue18, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, (-1), 100, 100, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue38 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue54 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        fuzzTest40.FuzzTest_remove(intQueue48, intQueue54, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue38, intQueue54, (java.lang.Integer) 100, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
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
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue18, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue40 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue46 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        fuzzTest32.FuzzTest_remove(intQueue40, intQueue46, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intQueue46, intQueue51, (java.lang.Integer) 100, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10, 1, 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue60 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue55, intQueue60, (java.lang.Integer) 1, true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 0, 2, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue6 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue26 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        fuzzTest18.FuzzTest_remove(intQueue26, intQueue32, (java.lang.Integer) 2, false);
        fuzzTest8.FuzzTest_remove(intQueue16, intQueue26, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue54 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        fuzzTest40.FuzzTest_remove(intQueue48, intQueue54, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_remove(intQueue54, intQueue59, (java.lang.Integer) 100, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue72 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue78 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        fuzzTest64.FuzzTest_remove(intQueue72, intQueue78, (java.lang.Integer) 2, false);
        fuzzTest8.FuzzTest_remove(intQueue63, intQueue72, (java.lang.Integer) 0, false);
        fuzzTest0.FuzzTest_remove(intQueue6, intQueue72, (java.lang.Integer) 100, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue89 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 1, 1, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue94 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue94, intArray93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue89, intQueue94, (java.lang.Integer) 10, true);
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
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_remove(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue54 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        fuzzTest40.FuzzTest_remove(intQueue48, intQueue54, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue67 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzzTest59.FuzzTest_remove(intQueue67, intQueue73, (java.lang.Integer) 2, false);
        fuzzTest39.FuzzTest_remove(intQueue48, intQueue73, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue81 = null;
        fuzzTest20.FuzzTest_remove(intQueue48, intQueue81, (java.lang.Integer) 2, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue19, intQueue48, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue10 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        fuzzTest2.FuzzTest_remove(intQueue10, intQueue16, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(intQueue16, intQueue21, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue49 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        fuzzTest35.FuzzTest_remove(intQueue43, intQueue49, (java.lang.Integer) 2, false);
        fuzzTest25.FuzzTest_remove(intQueue33, intQueue43, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue65 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue71 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        fuzzTest57.FuzzTest_remove(intQueue65, intQueue71, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_remove(intQueue71, intQueue76, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue21, intQueue76, (java.lang.Integer) 2, true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue10 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue26 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        fuzzTest12.FuzzTest_remove(intQueue20, intQueue26, (java.lang.Integer) 2, false);
        fuzzTest2.FuzzTest_remove(intQueue10, intQueue20, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue42 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        fuzzTest34.FuzzTest_remove(intQueue42, intQueue48, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_remove(intQueue48, intQueue53, (java.lang.Integer) 100, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue66 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue72 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzzTest58.FuzzTest_remove(intQueue66, intQueue72, (java.lang.Integer) 2, false);
        fuzzTest2.FuzzTest_remove(intQueue57, intQueue66, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue66, (java.lang.Integer) 10, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
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
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue18, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue40 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue46 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        fuzzTest32.FuzzTest_remove(intQueue40, intQueue46, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intQueue46, intQueue51, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue63 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue69 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        fuzzTest55.FuzzTest_remove(intQueue63, intQueue69, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intQueue69, intQueue74, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 100, 100, 0, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue86 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue88 = null;
        fuzzTest79.FuzzTest_remove(intQueue86, intQueue88, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue78, intQueue86, (java.lang.Integer) 2, false);
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
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzzTest29.FuzzTest_remove(intQueue37, intQueue43, (java.lang.Integer) 2, false);
        fuzzTest19.FuzzTest_remove(intQueue27, intQueue37, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue51 = null;
        fuzzTest0.FuzzTest_remove(intQueue37, intQueue51, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue64 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue74 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue80 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        fuzzTest66.FuzzTest_remove(intQueue74, intQueue80, (java.lang.Integer) 2, false);
        fuzzTest56.FuzzTest_remove(intQueue64, intQueue74, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue55, intQueue74, (java.lang.Integer) 1, true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue10 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        fuzzTest2.FuzzTest_remove(intQueue10, intQueue16, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue29 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue35 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzzTest21.FuzzTest_remove(intQueue29, intQueue35, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue40 = null;
        fuzzTest2.FuzzTest_remove(intQueue35, intQueue40, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = null;
        fuzzTest2.FuzzTest_remove(intQueue44, intQueue45, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 100, 2, (-1), 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_remove(intQueue55, intQueue57, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue61 = null;
        fuzzTest1.FuzzTest_remove(intQueue55, intQueue61, (java.lang.Integer) 0, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intQueue55, intQueue65, (java.lang.Integer) 100, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue69 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue72 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue69, intQueue72, (java.lang.Integer) 2, false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue10 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        fuzzTest2.FuzzTest_remove(intQueue10, intQueue16, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(intQueue16, intQueue21, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue49 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        fuzzTest35.FuzzTest_remove(intQueue43, intQueue49, (java.lang.Integer) 2, false);
        fuzzTest25.FuzzTest_remove(intQueue33, intQueue43, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue21, intQueue33, (java.lang.Integer) 100, false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_remove(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzzTest29.FuzzTest_remove(intQueue37, intQueue43, (java.lang.Integer) 2, false);
        fuzzTest19.FuzzTest_remove(intQueue27, intQueue37, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue51 = null;
        fuzzTest0.FuzzTest_remove(intQueue37, intQueue51, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100, 100, 0, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue62 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue64 = null;
        fuzzTest55.FuzzTest_remove(intQueue62, intQueue64, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue68 = null;
        fuzzTest0.FuzzTest_remove(intQueue62, intQueue68, (java.lang.Integer) 10, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue82 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue88 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue88, intArray87);
        fuzzTest74.FuzzTest_remove(intQueue82, intQueue88, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue93 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_remove(intQueue88, intQueue93, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue72, intQueue93, (java.lang.Integer) 0, true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue38 = null;
        fuzzTest0.FuzzTest_remove(intQueue33, intQueue38, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue50 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzzTest42.FuzzTest_remove(intQueue50, intQueue56, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue61 = null;
        fuzzTest0.FuzzTest_remove(intQueue56, intQueue61, (java.lang.Integer) 100, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue65 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue66 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue65, intQueue66, (java.lang.Integer) 1, false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue9 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzzTest11.FuzzTest_remove(intQueue19, intQueue25, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_remove(intQueue9, intQueue19, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest33.FuzzTest_remove(intQueue41, intQueue47, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(intQueue47, intQueue52, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue64 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue70 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        fuzzTest56.FuzzTest_remove(intQueue64, intQueue70, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(intQueue70, intQueue75, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue81 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue75, intQueue81, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue12 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue18 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        fuzzTest4.FuzzTest_remove(intQueue12, intQueue18, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue31 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest33.FuzzTest_remove(intQueue41, intQueue47, (java.lang.Integer) 2, false);
        fuzzTest23.FuzzTest_remove(intQueue31, intQueue41, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = null;
        fuzzTest4.FuzzTest_remove(intQueue41, intQueue55, (java.lang.Integer) 10, true);
        fuzzTest2.FuzzTest_remove(intQueue3, intQueue41, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue41, (java.lang.Integer) 100, false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue38 = null;
        fuzzTest0.FuzzTest_remove(intQueue33, intQueue38, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue42 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = null;
        fuzzTest0.FuzzTest_remove(intQueue42, intQueue43, (java.lang.Integer) 10, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue47 = null;
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 100, 0, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue57 = null;
        fuzzTest48.FuzzTest_remove(intQueue55, intQueue57, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_remove(intQueue47, intQueue55, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue79 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        fuzzTest65.FuzzTest_remove(intQueue73, intQueue79, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_remove(intQueue79, intQueue84, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue88 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue84, intQueue88, (java.lang.Integer) 10, true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100, 0, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue9 = null;
        fuzzTest0.FuzzTest_remove(intQueue7, intQueue9, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue22 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        fuzzTest14.FuzzTest_remove(intQueue22, intQueue28, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intQueue13, intQueue22, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue51 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        fuzzTest37.FuzzTest_remove(intQueue45, intQueue51, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_remove(intQueue51, intQueue56, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue69 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue75 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        fuzzTest61.FuzzTest_remove(intQueue69, intQueue75, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_remove(intQueue75, intQueue80, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue56, intQueue75, (java.lang.Integer) 1, false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
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
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue38 = null;
        fuzzTest0.FuzzTest_remove(intQueue33, intQueue38, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue42 = null;
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        fuzzTest0.FuzzTest_remove(intQueue42, intQueue48, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue53 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue54 = null;
        fuzzTest0.FuzzTest_remove(intQueue53, intQueue54, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 100, 0, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue66 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue68 = null;
        fuzzTest59.FuzzTest_remove(intQueue66, intQueue68, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue58, intQueue66, (java.lang.Integer) 1, false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 100, 0, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue10 = null;
        fuzzTest1.FuzzTest_remove(intQueue8, intQueue10, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = null;
        fuzzTest0.FuzzTest_remove(intQueue10, intQueue14, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue26 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue42 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        fuzzTest28.FuzzTest_remove(intQueue36, intQueue42, (java.lang.Integer) 2, false);
        fuzzTest18.FuzzTest_remove(intQueue26, intQueue36, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue50 = null;
        fuzzTest0.FuzzTest_remove(intQueue26, intQueue50, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue63 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue69 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        fuzzTest55.FuzzTest_remove(intQueue63, intQueue69, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue54, intQueue63, (java.lang.Integer) 100, true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue9 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        fuzzTest1.FuzzTest_remove(intQueue9, intQueue15, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = null;
        fuzzTest0.FuzzTest_remove(intQueue15, intQueue20, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue24 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_remove(intQueue24, intQueue25, (java.lang.Integer) (-1), false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 100, 0, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue39 = null;
        fuzzTest30.FuzzTest_remove(intQueue37, intQueue39, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = null;
        fuzzTest30.FuzzTest_remove(intQueue43, intQueue44, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue66 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue72 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzzTest58.FuzzTest_remove(intQueue66, intQueue72, (java.lang.Integer) 2, false);
        fuzzTest48.FuzzTest_remove(intQueue56, intQueue66, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue80 = null;
        fuzzTest30.FuzzTest_remove(intQueue56, intQueue80, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_remove(intQueue29, intQueue80, (java.lang.Integer) (-1), true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue87 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { (-1), 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue92 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue92, intArray91);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue87, intQueue92, (java.lang.Integer) 0, true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100, 0, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue9 = null;
        fuzzTest0.FuzzTest_remove(intQueue7, intQueue9, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
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
        fuzzTest13.FuzzTest_remove(intQueue21, intQueue31, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue53 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue59 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        fuzzTest45.FuzzTest_remove(intQueue53, intQueue59, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_remove(intQueue59, intQueue64, (java.lang.Integer) 100, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue68 = null;
        fuzzTest0.FuzzTest_remove(intQueue64, intQueue68, (java.lang.Integer) 0, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue82 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue88 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue88, intArray87);
        fuzzTest74.FuzzTest_remove(intQueue82, intQueue88, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue93 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_remove(intQueue88, intQueue93, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue72, intQueue88, (java.lang.Integer) 100, true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue11 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue17 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        fuzzTest3.FuzzTest_remove(intQueue11, intQueue17, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue30 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        fuzzTest22.FuzzTest_remove(intQueue30, intQueue36, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = null;
        fuzzTest3.FuzzTest_remove(intQueue36, intQueue41, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue46 = null;
        fuzzTest3.FuzzTest_remove(intQueue45, intQueue46, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 100, 2, (-1), 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_remove(intQueue56, intQueue58, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue62 = null;
        fuzzTest2.FuzzTest_remove(intQueue56, intQueue62, (java.lang.Integer) 0, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_remove(intQueue56, intQueue66, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue78 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue84 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue84, intArray83);
        fuzzTest70.FuzzTest_remove(intQueue78, intQueue84, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue66, intQueue78, (java.lang.Integer) 2, false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_remove(intQueue1, intQueue2, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue17 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue23 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        fuzzTest9.FuzzTest_remove(intQueue17, intQueue23, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_remove(intQueue23, intQueue28, (java.lang.Integer) 1, true);
        fuzzTest6.FuzzTest_remove(intQueue7, intQueue28, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue53 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue59 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        fuzzTest45.FuzzTest_remove(intQueue53, intQueue59, (java.lang.Integer) 2, false);
        fuzzTest35.FuzzTest_remove(intQueue43, intQueue53, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue28, intQueue53, (java.lang.Integer) 1, false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 100, 0, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue10 = null;
        fuzzTest1.FuzzTest_remove(intQueue8, intQueue10, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = null;
        fuzzTest0.FuzzTest_remove(intQueue10, intQueue14, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue26 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        fuzzTest18.FuzzTest_remove(intQueue26, intQueue32, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = null;
        fuzzTest0.FuzzTest_remove(intQueue26, intQueue37, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzzTest44.FuzzTest_remove(intQueue52, intQueue58, (java.lang.Integer) 2, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_remove(intQueue58, intQueue63, (java.lang.Integer) 1, true);
        fuzzTest41.FuzzTest_remove(intQueue42, intQueue63, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue70 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue63, intQueue70, (java.lang.Integer) 0, true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 100, 0, (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue10 = null;
        fuzzTest1.FuzzTest_remove(intQueue8, intQueue10, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = null;
        fuzzTest0.FuzzTest_remove(intQueue10, intQueue14, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue18 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 0, 100, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue23 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intQueue18, intQueue23, (java.lang.Integer) 10, true);
    }
}

