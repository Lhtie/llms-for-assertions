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
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue4 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue8 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzzTest1.FuzzTest_addFirst(intQueue4, intQueue8, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue15 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue19 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_addFirst(intQueue15, intQueue19, (java.lang.Integer) 1);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue26 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        fuzzTest1.FuzzTest_addFirst(intQueue19, intQueue26, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue33 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue37 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest30.FuzzTest_addFirst(intQueue33, intQueue37, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue44 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue48 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        fuzzTest41.FuzzTest_addFirst(intQueue44, intQueue48, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue55 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue59 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        fuzzTest52.FuzzTest_addFirst(intQueue55, intQueue59, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue66 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue70 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        fuzzTest63.FuzzTest_addFirst(intQueue66, intQueue70, (java.lang.Integer) 1);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue77 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        fuzzTest52.FuzzTest_addFirst(intQueue70, intQueue77, (java.lang.Integer) 1);
        fuzzTest30.FuzzTest_addFirst(intQueue44, intQueue77, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addFirst(intQueue26, intQueue77, (java.lang.Integer) 0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue3 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue7 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_addFirst(intQueue3, intQueue7, (java.lang.Integer) 1);
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue15 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue19 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_addFirst(intQueue15, intQueue19, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_addFirst(intQueue11, intQueue19, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue28 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue32 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        fuzzTest25.FuzzTest_addFirst(intQueue28, intQueue32, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue39 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue43 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzzTest36.FuzzTest_addFirst(intQueue39, intQueue43, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue50 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue54 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        fuzzTest47.FuzzTest_addFirst(intQueue50, intQueue54, (java.lang.Integer) 1);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue61 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        fuzzTest36.FuzzTest_addFirst(intQueue54, intQueue61, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addFirst(intQueue32, intQueue61, (java.lang.Integer) 0);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue4 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue8 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzzTest1.FuzzTest_addFirst(intQueue4, intQueue8, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue16 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue20 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        fuzzTest13.FuzzTest_addFirst(intQueue16, intQueue20, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue27 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue31 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        fuzzTest24.FuzzTest_addFirst(intQueue27, intQueue31, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_addFirst(intQueue16, intQueue27, (java.lang.Integer) 100);
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue37 = null;
        fuzzTest1.FuzzTest_addFirst(intQueue27, intQueue37, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue43 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue47 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest40.FuzzTest_addFirst(intQueue43, intQueue47, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue54 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue58 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzzTest51.FuzzTest_addFirst(intQueue54, intQueue58, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue65 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue69 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        fuzzTest62.FuzzTest_addFirst(intQueue65, intQueue69, (java.lang.Integer) 1);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue76 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        fuzzTest51.FuzzTest_addFirst(intQueue69, intQueue76, (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_addFirst(intQueue43, intQueue76, (java.lang.Integer) 10);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10, 100, 100 };
        buggyasrts.mut_017.ArrayDeque<java.lang.Integer> intQueue86 = new buggyasrts.mut_017.ArrayDeque<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addFirst(intQueue43, intQueue86, (java.lang.Integer) 10);
    }
}

