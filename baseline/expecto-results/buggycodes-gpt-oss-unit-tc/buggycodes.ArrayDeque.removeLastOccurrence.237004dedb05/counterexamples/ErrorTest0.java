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
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue28 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue34 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_removeLastOccurrence(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue19, intQueue34, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue50 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue56 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzzTest42.FuzzTest_removeLastOccurrence(intQueue50, intQueue56, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue69 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue75 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        fuzzTest61.FuzzTest_removeLastOccurrence(intQueue69, intQueue75, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue56, intQueue75, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue9 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        fuzzTest1.FuzzTest_removeLastOccurrence(intQueue9, intQueue15, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue29 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue35 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzzTest21.FuzzTest_removeLastOccurrence(intQueue29, intQueue35, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_removeLastOccurrence(intQueue20, intQueue35, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue51 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue57 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzzTest43.FuzzTest_removeLastOccurrence(intQueue51, intQueue57, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue20, intQueue57, (java.lang.Integer) 0, false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue28 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue34 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_removeLastOccurrence(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue19, intQueue34, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, (-1) };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue45 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue55 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue61 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        fuzzTest47.FuzzTest_removeLastOccurrence(intQueue55, intQueue61, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue75 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue81 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        fuzzTest67.FuzzTest_removeLastOccurrence(intQueue75, intQueue81, (java.lang.Integer) 2, false);
        fuzzTest47.FuzzTest_removeLastOccurrence(intQueue66, intQueue81, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue45, intQueue81, (java.lang.Integer) 2, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue28 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue34 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_removeLastOccurrence(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue19, intQueue34, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 10, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue46 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue48 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue46, intQueue48, (java.lang.Integer) 0, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { (-1), 10, (-1), 1, 1, 10 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue9 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue19 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue25 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzzTest11.FuzzTest_removeLastOccurrence(intQueue19, intQueue25, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue39 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue45 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        fuzzTest31.FuzzTest_removeLastOccurrence(intQueue39, intQueue45, (java.lang.Integer) 2, false);
        fuzzTest11.FuzzTest_removeLastOccurrence(intQueue30, intQueue45, (java.lang.Integer) 10, true);
        fuzzTest1.FuzzTest_removeLastOccurrence(intQueue9, intQueue30, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, 0, 100, (-1), 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue62 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue30, intQueue62, (java.lang.Integer) 1, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue28 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue34 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_removeLastOccurrence(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue19, intQueue34, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue50 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue56 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzzTest42.FuzzTest_removeLastOccurrence(intQueue50, intQueue56, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue70 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue76 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        fuzzTest62.FuzzTest_removeLastOccurrence(intQueue70, intQueue76, (java.lang.Integer) 2, false);
        fuzzTest42.FuzzTest_removeLastOccurrence(intQueue61, intQueue76, (java.lang.Integer) 10, true);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue84 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue76, intQueue84, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue9 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        fuzzTest1.FuzzTest_removeLastOccurrence(intQueue9, intQueue15, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue28 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue34 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_removeLastOccurrence(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue48 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue54 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        fuzzTest40.FuzzTest_removeLastOccurrence(intQueue48, intQueue54, (java.lang.Integer) 2, false);
        fuzzTest20.FuzzTest_removeLastOccurrence(intQueue39, intQueue54, (java.lang.Integer) 10, true);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_removeLastOccurrence(intQueue39, intQueue62, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue74 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue80 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        fuzzTest66.FuzzTest_removeLastOccurrence(intQueue74, intQueue80, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue39, intQueue80, (java.lang.Integer) 100, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue28 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue34 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_removeLastOccurrence(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue19, intQueue34, (java.lang.Integer) 10, true);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue51 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue57 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzzTest43.FuzzTest_removeLastOccurrence(intQueue51, intQueue57, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue42, intQueue57, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue9 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        fuzzTest1.FuzzTest_removeLastOccurrence(intQueue9, intQueue15, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue28 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue34 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_removeLastOccurrence(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue47 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue53 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        fuzzTest39.FuzzTest_removeLastOccurrence(intQueue47, intQueue53, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue67 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue73 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzzTest59.FuzzTest_removeLastOccurrence(intQueue67, intQueue73, (java.lang.Integer) 2, false);
        fuzzTest39.FuzzTest_removeLastOccurrence(intQueue58, intQueue73, (java.lang.Integer) 10, true);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_removeLastOccurrence(intQueue58, intQueue81, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue9, intQueue58, (java.lang.Integer) 0, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue27 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue33 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzzTest19.FuzzTest_removeLastOccurrence(intQueue27, intQueue33, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue38 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue27, intQueue38, (java.lang.Integer) 0, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue42 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue43 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue42, intQueue43, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue57 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue63 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzzTest49.FuzzTest_removeLastOccurrence(intQueue57, intQueue63, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue76 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue82 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        fuzzTest68.FuzzTest_removeLastOccurrence(intQueue76, intQueue82, (java.lang.Integer) 2, false);
        fuzzTest48.FuzzTest_removeLastOccurrence(intQueue63, intQueue76, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue47, intQueue63, (java.lang.Integer) 2, false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue27 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue33 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzzTest19.FuzzTest_removeLastOccurrence(intQueue27, intQueue33, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue47 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue53 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        fuzzTest39.FuzzTest_removeLastOccurrence(intQueue47, intQueue53, (java.lang.Integer) 2, false);
        fuzzTest19.FuzzTest_removeLastOccurrence(intQueue38, intQueue53, (java.lang.Integer) 10, true);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue61 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue53, intQueue61, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, 10, 1, 1, 1 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue71 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 100, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue77 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue71, intQueue77, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1), 10, (-1), 1, 1, 10 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue18 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue24 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        fuzzTest10.FuzzTest_removeLastOccurrence(intQueue18, intQueue24, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue38 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue44 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        fuzzTest30.FuzzTest_removeLastOccurrence(intQueue38, intQueue44, (java.lang.Integer) 2, false);
        fuzzTest10.FuzzTest_removeLastOccurrence(intQueue29, intQueue44, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue8, intQueue29, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue63 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue69 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        fuzzTest55.FuzzTest_removeLastOccurrence(intQueue63, intQueue69, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue74 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue69, intQueue74, (java.lang.Integer) 10, false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue29 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue35 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzzTest21.FuzzTest_removeLastOccurrence(intQueue29, intQueue35, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue49 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue55 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        fuzzTest41.FuzzTest_removeLastOccurrence(intQueue49, intQueue55, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue68 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue74 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        fuzzTest60.FuzzTest_removeLastOccurrence(intQueue68, intQueue74, (java.lang.Integer) 2, false);
        fuzzTest40.FuzzTest_removeLastOccurrence(intQueue55, intQueue68, (java.lang.Integer) 2, false);
        fuzzTest20.FuzzTest_removeLastOccurrence(intQueue29, intQueue55, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue19, intQueue29, (java.lang.Integer) 2, false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue10 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue16 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        fuzzTest2.FuzzTest_removeLastOccurrence(intQueue10, intQueue16, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue29 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue35 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzzTest21.FuzzTest_removeLastOccurrence(intQueue29, intQueue35, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_removeLastOccurrence(intQueue16, intQueue29, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue51 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue57 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzzTest43.FuzzTest_removeLastOccurrence(intQueue51, intQueue57, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue16, intQueue51, (java.lang.Integer) 10, false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue28 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue34 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_removeLastOccurrence(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue19, intQueue34, (java.lang.Integer) 10, true);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue51 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue57 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzzTest43.FuzzTest_removeLastOccurrence(intQueue51, intQueue57, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue71 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue77 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        fuzzTest63.FuzzTest_removeLastOccurrence(intQueue71, intQueue77, (java.lang.Integer) 2, false);
        fuzzTest43.FuzzTest_removeLastOccurrence(intQueue62, intQueue77, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue42, intQueue77, (java.lang.Integer) 0, false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue1, intQueue2, (java.lang.Integer) 100, true);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue16 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue22 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        fuzzTest8.FuzzTest_removeLastOccurrence(intQueue16, intQueue22, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue35 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue41 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        fuzzTest27.FuzzTest_removeLastOccurrence(intQueue35, intQueue41, (java.lang.Integer) 2, false);
        fuzzTest7.FuzzTest_removeLastOccurrence(intQueue22, intQueue35, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue6, intQueue35, (java.lang.Integer) 100, false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue9 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        fuzzTest1.FuzzTest_removeLastOccurrence(intQueue9, intQueue15, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue29 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue35 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzzTest21.FuzzTest_removeLastOccurrence(intQueue29, intQueue35, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_removeLastOccurrence(intQueue20, intQueue35, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue51 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue57 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzzTest43.FuzzTest_removeLastOccurrence(intQueue51, intQueue57, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue71 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue77 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        fuzzTest63.FuzzTest_removeLastOccurrence(intQueue71, intQueue77, (java.lang.Integer) 2, false);
        fuzzTest43.FuzzTest_removeLastOccurrence(intQueue62, intQueue77, (java.lang.Integer) 10, true);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue85 = null;
        fuzzTest1.FuzzTest_removeLastOccurrence(intQueue62, intQueue85, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 100, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue92 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue92, intArray91);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue62, intQueue92, (java.lang.Integer) 100, false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue28 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue34 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_removeLastOccurrence(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue19, intQueue34, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 10 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue45 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue47 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue45, intQueue47, (java.lang.Integer) (-1), false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue61 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue67 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        fuzzTest53.FuzzTest_removeLastOccurrence(intQueue61, intQueue67, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue80 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue86 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        fuzzTest72.FuzzTest_removeLastOccurrence(intQueue80, intQueue86, (java.lang.Integer) 2, false);
        fuzzTest52.FuzzTest_removeLastOccurrence(intQueue67, intQueue80, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue51, intQueue80, (java.lang.Integer) 0, false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue9 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        fuzzTest1.FuzzTest_removeLastOccurrence(intQueue9, intQueue15, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue28 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue34 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest20.FuzzTest_removeLastOccurrence(intQueue28, intQueue34, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue39 = null;
        fuzzTest1.FuzzTest_removeLastOccurrence(intQueue28, intQueue39, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue51 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue57 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzzTest43.FuzzTest_removeLastOccurrence(intQueue51, intQueue57, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue28, intQueue51, (java.lang.Integer) 0, false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue1, intQueue2, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, 100, 10 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue10 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue21 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue27 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzzTest13.FuzzTest_removeLastOccurrence(intQueue21, intQueue27, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue40 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue46 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        fuzzTest32.FuzzTest_removeLastOccurrence(intQueue40, intQueue46, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue51 = null;
        fuzzTest13.FuzzTest_removeLastOccurrence(intQueue40, intQueue51, (java.lang.Integer) 0, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue55 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue56 = null;
        fuzzTest13.FuzzTest_removeLastOccurrence(intQueue55, intQueue56, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_removeLastOccurrence(intQueue55, intQueue60, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue10, intQueue60, (java.lang.Integer) 2, false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 10, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue6 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue1, intQueue6, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue20 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue26 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        fuzzTest12.FuzzTest_removeLastOccurrence(intQueue20, intQueue26, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue40 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue46 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        fuzzTest32.FuzzTest_removeLastOccurrence(intQueue40, intQueue46, (java.lang.Integer) 2, false);
        fuzzTest12.FuzzTest_removeLastOccurrence(intQueue31, intQueue46, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue62 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue68 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        fuzzTest54.FuzzTest_removeLastOccurrence(intQueue62, intQueue68, (java.lang.Integer) 2, false);
        fuzzTest11.FuzzTest_removeLastOccurrence(intQueue46, intQueue62, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 10 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue79 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue46, intQueue79, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue1, intQueue2, (java.lang.Integer) 100, true);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue6 = null;
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue7 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue6, intQueue7, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue12 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue13 = null;
        fuzzTest11.FuzzTest_removeLastOccurrence(intQueue12, intQueue13, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1), 10, (-1), 1, 1, 10 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue25 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue35 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue41 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        fuzzTest27.FuzzTest_removeLastOccurrence(intQueue35, intQueue41, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue55 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue61 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        fuzzTest47.FuzzTest_removeLastOccurrence(intQueue55, intQueue61, (java.lang.Integer) 2, false);
        fuzzTest27.FuzzTest_removeLastOccurrence(intQueue46, intQueue61, (java.lang.Integer) 10, true);
        fuzzTest17.FuzzTest_removeLastOccurrence(intQueue25, intQueue46, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue12, intQueue25, (java.lang.Integer) 100, false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue10 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue16 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        fuzzTest2.FuzzTest_removeLastOccurrence(intQueue10, intQueue16, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue30 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue36 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        fuzzTest22.FuzzTest_removeLastOccurrence(intQueue30, intQueue36, (java.lang.Integer) 2, false);
        fuzzTest2.FuzzTest_removeLastOccurrence(intQueue21, intQueue36, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue52 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue58 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzzTest44.FuzzTest_removeLastOccurrence(intQueue52, intQueue58, (java.lang.Integer) 2, false);
        fuzzTest1.FuzzTest_removeLastOccurrence(intQueue36, intQueue52, (java.lang.Integer) 100, true);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue66 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue36, intQueue66, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue78 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue84 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue84, intArray83);
        fuzzTest70.FuzzTest_removeLastOccurrence(intQueue78, intQueue84, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 10, 100, 1, 0 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue94 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue94, intArray93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue78, intQueue94, (java.lang.Integer) 0, false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 10, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue6 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue1, intQueue6, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue12 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 10, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue17 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        fuzzTest11.FuzzTest_removeLastOccurrence(intQueue12, intQueue17, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue30 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue36 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        fuzzTest22.FuzzTest_removeLastOccurrence(intQueue30, intQueue36, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue17, intQueue30, (java.lang.Integer) 0, false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue19 = null;
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue20 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue19, intQueue20, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue32 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue38 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        fuzzTest24.FuzzTest_removeLastOccurrence(intQueue32, intQueue38, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue51 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue57 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzzTest43.FuzzTest_removeLastOccurrence(intQueue51, intQueue57, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue62 = null;
        fuzzTest24.FuzzTest_removeLastOccurrence(intQueue51, intQueue62, (java.lang.Integer) 0, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue75 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue81 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        fuzzTest67.FuzzTest_removeLastOccurrence(intQueue75, intQueue81, (java.lang.Integer) 2, false);
        fuzzTest24.FuzzTest_removeLastOccurrence(intQueue66, intQueue75, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 100, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue92 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue92, intArray91);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue66, intQueue92, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue2 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue3 = null;
        fuzzTest1.FuzzTest_removeLastOccurrence(intQueue2, intQueue3, (java.lang.Integer) 100, true);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue7 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue2, intQueue7, (java.lang.Integer) 10, false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue1, intQueue2, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue20 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        fuzzTest6.FuzzTest_removeLastOccurrence(intQueue14, intQueue20, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue34 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue40 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzzTest26.FuzzTest_removeLastOccurrence(intQueue34, intQueue40, (java.lang.Integer) 2, false);
        fuzzTest6.FuzzTest_removeLastOccurrence(intQueue25, intQueue40, (java.lang.Integer) 10, true);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue48 = null;
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue49 = null;
        fuzzTest6.FuzzTest_removeLastOccurrence(intQueue48, intQueue49, (java.lang.Integer) 10, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue53 = null;
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_removeLastOccurrence(intQueue53, intQueue54, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue66 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue72 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzzTest58.FuzzTest_removeLastOccurrence(intQueue66, intQueue72, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue54, intQueue72, (java.lang.Integer) 100, false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue2 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 2, 10, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue7 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest1.FuzzTest_removeLastOccurrence(intQueue2, intQueue7, (java.lang.Integer) 100, true);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue12 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue2, intQueue12, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue16 = null;
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue17 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue16, intQueue17, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue30 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue36 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        fuzzTest22.FuzzTest_removeLastOccurrence(intQueue30, intQueue36, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue49 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue55 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        fuzzTest41.FuzzTest_removeLastOccurrence(intQueue49, intQueue55, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue60 = null;
        fuzzTest22.FuzzTest_removeLastOccurrence(intQueue49, intQueue60, (java.lang.Integer) 0, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue64 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue65 = null;
        fuzzTest22.FuzzTest_removeLastOccurrence(intQueue64, intQueue65, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue69 = null;
        fuzzTest21.FuzzTest_removeLastOccurrence(intQueue65, intQueue69, (java.lang.Integer) (-1), false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue73 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue74 = null;
        fuzzTest21.FuzzTest_removeLastOccurrence(intQueue73, intQueue74, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue86 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue92 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue92, intArray91);
        fuzzTest78.FuzzTest_removeLastOccurrence(intQueue86, intQueue92, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue73, intQueue92, (java.lang.Integer) 100, false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue1, intQueue2, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue21 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzzTest7.FuzzTest_removeLastOccurrence(intQueue15, intQueue21, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue34 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue40 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzzTest26.FuzzTest_removeLastOccurrence(intQueue34, intQueue40, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue45 = null;
        fuzzTest7.FuzzTest_removeLastOccurrence(intQueue34, intQueue45, (java.lang.Integer) 0, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue49 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue50 = null;
        fuzzTest7.FuzzTest_removeLastOccurrence(intQueue49, intQueue50, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_removeLastOccurrence(intQueue49, intQueue54, (java.lang.Integer) 10, true);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue58 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue54, intQueue58, (java.lang.Integer) 10, true);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue62 = null;
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue63 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue62, intQueue63, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue68 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue69 = null;
        fuzzTest67.FuzzTest_removeLastOccurrence(intQueue68, intQueue69, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue81 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue87 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue87, intArray86);
        fuzzTest73.FuzzTest_removeLastOccurrence(intQueue81, intQueue87, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue68, intQueue87, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue27 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue33 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzzTest19.FuzzTest_removeLastOccurrence(intQueue27, intQueue33, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue38 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue27, intQueue38, (java.lang.Integer) 0, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue42 = null;
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue43 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue42, intQueue43, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue55 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue61 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        fuzzTest47.FuzzTest_removeLastOccurrence(intQueue55, intQueue61, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue75 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue81 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        fuzzTest67.FuzzTest_removeLastOccurrence(intQueue75, intQueue81, (java.lang.Integer) 2, false);
        fuzzTest47.FuzzTest_removeLastOccurrence(intQueue66, intQueue81, (java.lang.Integer) 10, true);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue89 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue66, intQueue89, (java.lang.Integer) 2, false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue8, intQueue14, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue27 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue33 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzzTest19.FuzzTest_removeLastOccurrence(intQueue27, intQueue33, (java.lang.Integer) 2, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue38 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue27, intQueue38, (java.lang.Integer) 0, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue42 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue43 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue42, intQueue43, (java.lang.Integer) 10, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue47 = null;
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue48 = null;
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue47, intQueue48, (java.lang.Integer) 100, false);
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue54 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue55 = null;
        fuzzTest53.FuzzTest_removeLastOccurrence(intQueue54, intQueue55, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue67 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue73 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzzTest59.FuzzTest_removeLastOccurrence(intQueue67, intQueue73, (java.lang.Integer) 2, false);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1), 2, 2, (-1) };
        buggycodes.mut_000.ArrayDeque<java.lang.Integer> intQueue83 = new buggycodes.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        fuzzTest53.FuzzTest_removeLastOccurrence(intQueue67, intQueue83, (java.lang.Integer) 2, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeLastOccurrence(intQueue52, intQueue83, (java.lang.Integer) 2, false);
    }
}

