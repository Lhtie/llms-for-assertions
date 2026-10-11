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
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_offer(intQueue15, intQueue19, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        fuzzTest25.FuzzTest_offer(intQueue28, intQueue32, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_offer(intQueue24, intQueue32, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest40.FuzzTest_offer(intQueue43, intQueue47, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue59 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        fuzzTest52.FuzzTest_offer(intQueue55, intQueue59, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue67 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        fuzzTest40.FuzzTest_offer(intQueue59, intQueue67, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue32, intQueue59, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 0, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzzTest18.FuzzTest_offer(intQueue21, intQueue25, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest30.FuzzTest_offer(intQueue33, intQueue37, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        fuzzTest18.FuzzTest_offer(intQueue37, intQueue45, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_offer(intQueue16, intQueue45, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue61 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue65 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        fuzzTest58.FuzzTest_offer(intQueue61, intQueue65, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue77 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        fuzzTest70.FuzzTest_offer(intQueue73, intQueue77, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue85 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        fuzzTest58.FuzzTest_offer(intQueue77, intQueue85, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue56, intQueue77, (java.lang.Integer) 10, false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_offer(intQueue15, intQueue19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzzTest0.FuzzTest_offer(intQueue19, intQueue27, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue35 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue39 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        fuzzTest32.FuzzTest_offer(intQueue35, intQueue39, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        fuzzTest45.FuzzTest_offer(intQueue48, intQueue52, (java.lang.Integer) 1, true);
        fuzzTest32.FuzzTest_offer(intQueue44, intQueue52, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue63 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue67 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        fuzzTest60.FuzzTest_offer(intQueue63, intQueue67, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue52, intQueue63, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 1, 1 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue5 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue10 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest7.FuzzTest_offer(intQueue10, intQueue14, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue5, intQueue10, (java.lang.Integer) 10, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue5 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue9 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzzTest2.FuzzTest_offer(intQueue5, intQueue9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_offer(intQueue1, intQueue5, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue24 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        fuzzTest17.FuzzTest_offer(intQueue20, intQueue24, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        fuzzTest29.FuzzTest_offer(intQueue32, intQueue36, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        fuzzTest41.FuzzTest_offer(intQueue44, intQueue48, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue60 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        fuzzTest53.FuzzTest_offer(intQueue56, intQueue60, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue68 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        fuzzTest41.FuzzTest_offer(intQueue60, intQueue68, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue76 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue80 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        fuzzTest73.FuzzTest_offer(intQueue76, intQueue80, (java.lang.Integer) 1, true);
        fuzzTest29.FuzzTest_offer(intQueue60, intQueue76, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue20, intQueue76, (java.lang.Integer) 1, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_offer(intQueue15, intQueue19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10, 0, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest30.FuzzTest_offer(intQueue33, intQueue37, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue49 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        fuzzTest42.FuzzTest_offer(intQueue45, intQueue49, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue57 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzzTest30.FuzzTest_offer(intQueue49, intQueue57, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_offer(intQueue28, intQueue57, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue68 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue72 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzzTest65.FuzzTest_offer(intQueue68, intQueue72, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue57, intQueue68, (java.lang.Integer) 100, false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        fuzzTest13.FuzzTest_offer(intQueue16, intQueue20, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_offer(intQueue12, intQueue20, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue31 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue35 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzzTest28.FuzzTest_offer(intQueue31, intQueue35, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        fuzzTest41.FuzzTest_offer(intQueue44, intQueue48, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue60 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        fuzzTest53.FuzzTest_offer(intQueue56, intQueue60, (java.lang.Integer) 1, true);
        fuzzTest40.FuzzTest_offer(intQueue44, intQueue56, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue35, intQueue56, (java.lang.Integer) 100, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_offer(intQueue15, intQueue19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzzTest0.FuzzTest_offer(intQueue19, intQueue27, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue40 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzzTest33.FuzzTest_offer(intQueue36, intQueue40, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        fuzzTest45.FuzzTest_offer(intQueue48, intQueue52, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue60 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        fuzzTest33.FuzzTest_offer(intQueue52, intQueue60, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue65 = null;
        fuzzTest32.FuzzTest_offer(intQueue60, intQueue65, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue71 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue60, intQueue71, (java.lang.Integer) 0, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_offer(intQueue15, intQueue19, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue31 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        fuzzTest24.FuzzTest_offer(intQueue27, intQueue31, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue39 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        fuzzTest12.FuzzTest_offer(intQueue31, intQueue39, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue51 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        fuzzTest44.FuzzTest_offer(intQueue47, intQueue51, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_offer(intQueue31, intQueue47, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue62 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue66 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        fuzzTest59.FuzzTest_offer(intQueue62, intQueue66, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue71 = null;
        fuzzTest0.FuzzTest_offer(intQueue66, intQueue71, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 1, 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue79 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue84 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue84, intArray83);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue88 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue88, intArray87);
        fuzzTest81.FuzzTest_offer(intQueue84, intQueue88, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue79, intQueue88, (java.lang.Integer) 0, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue5 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue9 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzzTest2.FuzzTest_offer(intQueue5, intQueue9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_offer(intQueue1, intQueue5, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue24 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        fuzzTest17.FuzzTest_offer(intQueue20, intQueue24, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest30.FuzzTest_offer(intQueue33, intQueue37, (java.lang.Integer) 1, true);
        fuzzTest17.FuzzTest_offer(intQueue29, intQueue37, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        fuzzTest45.FuzzTest_offer(intQueue48, intQueue52, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue62 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue66 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        fuzzTest59.FuzzTest_offer(intQueue62, intQueue66, (java.lang.Integer) 1, true);
        fuzzTest57.FuzzTest_offer(intQueue58, intQueue62, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue77 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue81 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        fuzzTest74.FuzzTest_offer(intQueue77, intQueue81, (java.lang.Integer) 1, true);
        fuzzTest45.FuzzTest_offer(intQueue62, intQueue77, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue37, intQueue62, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue4 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzzTest1.FuzzTest_offer(intQueue4, intQueue8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        fuzzTest13.FuzzTest_offer(intQueue16, intQueue20, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        fuzzTest25.FuzzTest_offer(intQueue28, intQueue32, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue40 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzzTest13.FuzzTest_offer(intQueue32, intQueue40, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        fuzzTest45.FuzzTest_offer(intQueue48, intQueue52, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_offer(intQueue32, intQueue48, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue63 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue67 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        fuzzTest60.FuzzTest_offer(intQueue63, intQueue67, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue75 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        fuzzTest1.FuzzTest_offer(intQueue67, intQueue75, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue83 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue87 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue87, intArray86);
        fuzzTest80.FuzzTest_offer(intQueue83, intQueue87, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue67, intQueue83, (java.lang.Integer) 1, false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue4 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzzTest1.FuzzTest_offer(intQueue4, intQueue8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue18 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue22 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        fuzzTest15.FuzzTest_offer(intQueue18, intQueue22, (java.lang.Integer) 1, true);
        fuzzTest13.FuzzTest_offer(intQueue14, intQueue18, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest30.FuzzTest_offer(intQueue33, intQueue37, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_offer(intQueue18, intQueue33, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        fuzzTest45.FuzzTest_offer(intQueue48, intQueue52, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue62 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue66 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        fuzzTest59.FuzzTest_offer(intQueue62, intQueue66, (java.lang.Integer) 1, true);
        fuzzTest57.FuzzTest_offer(intQueue58, intQueue62, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue77 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue81 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        fuzzTest74.FuzzTest_offer(intQueue77, intQueue81, (java.lang.Integer) 1, true);
        fuzzTest45.FuzzTest_offer(intQueue62, intQueue77, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue18, intQueue77, (java.lang.Integer) 1, false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue5 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue9 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzzTest2.FuzzTest_offer(intQueue5, intQueue9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_offer(intQueue1, intQueue5, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzzTest18.FuzzTest_offer(intQueue21, intQueue25, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest30.FuzzTest_offer(intQueue33, intQueue37, (java.lang.Integer) 1, true);
        fuzzTest17.FuzzTest_offer(intQueue21, intQueue33, (java.lang.Integer) 100, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = null;
        fuzzTest0.FuzzTest_offer(intQueue21, intQueue45, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzzTest49.FuzzTest_offer(intQueue52, intQueue56, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue64 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue68 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        fuzzTest61.FuzzTest_offer(intQueue64, intQueue68, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = null;
        fuzzTest49.FuzzTest_offer(intQueue68, intQueue73, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue78 = null;
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue82 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue86 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        fuzzTest79.FuzzTest_offer(intQueue82, intQueue86, (java.lang.Integer) 1, true);
        fuzzTest77.FuzzTest_offer(intQueue78, intQueue82, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue68, intQueue82, (java.lang.Integer) 0, false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, 10, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzzTest18.FuzzTest_offer(intQueue21, intQueue25, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest30.FuzzTest_offer(intQueue33, intQueue37, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        fuzzTest18.FuzzTest_offer(intQueue37, intQueue45, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue54 = null;
        fuzzTest18.FuzzTest_offer(intQueue52, intQueue54, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue61 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue65 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        fuzzTest58.FuzzTest_offer(intQueue61, intQueue65, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue72 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzzTest18.FuzzTest_offer(intQueue61, intQueue72, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue16, intQueue72, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue4 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzzTest1.FuzzTest_offer(intQueue4, intQueue8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        fuzzTest13.FuzzTest_offer(intQueue16, intQueue20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        fuzzTest1.FuzzTest_offer(intQueue20, intQueue28, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue35 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = null;
        fuzzTest1.FuzzTest_offer(intQueue35, intQueue37, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        fuzzTest41.FuzzTest_offer(intQueue44, intQueue48, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        fuzzTest1.FuzzTest_offer(intQueue44, intQueue55, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue63 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue67 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        fuzzTest60.FuzzTest_offer(intQueue63, intQueue67, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue44, intQueue63, (java.lang.Integer) 10, false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_offer(intQueue15, intQueue19, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue24 = null;
        fuzzTest0.FuzzTest_offer(intQueue19, intQueue24, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        fuzzTest29.FuzzTest_offer(intQueue32, intQueue36, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        fuzzTest41.FuzzTest_offer(intQueue44, intQueue48, (java.lang.Integer) 1, true);
        fuzzTest28.FuzzTest_offer(intQueue32, intQueue44, (java.lang.Integer) 100, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = null;
        fuzzTest0.FuzzTest_offer(intQueue32, intQueue56, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 100, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue64 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue69 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzzTest66.FuzzTest_offer(intQueue69, intQueue73, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue64, intQueue73, (java.lang.Integer) 10, false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_offer(intQueue15, intQueue19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzzTest0.FuzzTest_offer(intQueue19, intQueue27, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = null;
        fuzzTest0.FuzzTest_offer(intQueue34, intQueue36, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest40.FuzzTest_offer(intQueue43, intQueue47, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue59 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        fuzzTest52.FuzzTest_offer(intQueue55, intQueue59, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue67 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        fuzzTest40.FuzzTest_offer(intQueue59, intQueue67, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue72 = null;
        fuzzTest0.FuzzTest_offer(intQueue59, intQueue72, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, (-1), 100, 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue81 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue86 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue90 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue90, intArray89);
        fuzzTest83.FuzzTest_offer(intQueue86, intQueue90, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue81, intQueue90, (java.lang.Integer) 0, false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        fuzzTest13.FuzzTest_offer(intQueue16, intQueue20, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_offer(intQueue12, intQueue20, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue28 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue29 = null;
        fuzzTest0.FuzzTest_offer(intQueue28, intQueue29, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue35 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        fuzzTest38.FuzzTest_offer(intQueue41, intQueue45, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue53 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue57 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzzTest50.FuzzTest_offer(intQueue53, intQueue57, (java.lang.Integer) 1, true);
        fuzzTest37.FuzzTest_offer(intQueue41, intQueue53, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue35, intQueue53, (java.lang.Integer) 100, false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue5 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue9 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzzTest2.FuzzTest_offer(intQueue5, intQueue9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_offer(intQueue1, intQueue5, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10, 10, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue26 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue30 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        fuzzTest23.FuzzTest_offer(intQueue26, intQueue30, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10, 0, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue39 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        fuzzTest41.FuzzTest_offer(intQueue44, intQueue48, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue60 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        fuzzTest53.FuzzTest_offer(intQueue56, intQueue60, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue68 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        fuzzTest41.FuzzTest_offer(intQueue60, intQueue68, (java.lang.Integer) 1, true);
        fuzzTest23.FuzzTest_offer(intQueue39, intQueue68, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue21, intQueue39, (java.lang.Integer) 100, false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue11 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        fuzzTest4.FuzzTest_offer(intQueue7, intQueue11, (java.lang.Integer) 1, true);
        fuzzTest2.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue23 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzzTest20.FuzzTest_offer(intQueue23, intQueue27, (java.lang.Integer) 1, true);
        fuzzTest2.FuzzTest_offer(intQueue19, intQueue23, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue40 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        fuzzTest37.FuzzTest_offer(intQueue40, intQueue44, (java.lang.Integer) 1, true);
        fuzzTest35.FuzzTest_offer(intQueue36, intQueue40, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue52 = null;
        fuzzTest2.FuzzTest_offer(intQueue36, intQueue52, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 100, 100, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue61 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-1), 10, 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue67 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        fuzzTest2.FuzzTest_offer(intQueue61, intQueue67, (java.lang.Integer) 0, false);
        fuzzTest0.FuzzTest_offer(intQueue1, intQueue61, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue78 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue82 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        fuzzTest75.FuzzTest_offer(intQueue78, intQueue82, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue89 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue89, intArray88);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue82, intQueue89, (java.lang.Integer) 1, false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_offer(intQueue1, intQueue2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue10 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest7.FuzzTest_offer(intQueue10, intQueue14, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue22 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue26 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        fuzzTest19.FuzzTest_offer(intQueue22, intQueue26, (java.lang.Integer) 1, true);
        fuzzTest6.FuzzTest_offer(intQueue10, intQueue22, (java.lang.Integer) 100, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue38 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue42 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        fuzzTest35.FuzzTest_offer(intQueue38, intQueue42, (java.lang.Integer) 1, true);
        fuzzTest6.FuzzTest_offer(intQueue34, intQueue38, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue54 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzzTest51.FuzzTest_offer(intQueue54, intQueue58, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue66 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue70 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        fuzzTest63.FuzzTest_offer(intQueue66, intQueue70, (java.lang.Integer) 1, true);
        fuzzTest50.FuzzTest_offer(intQueue54, intQueue66, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue38, intQueue66, (java.lang.Integer) 0, false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_offer(intQueue15, intQueue19, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue29 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzzTest26.FuzzTest_offer(intQueue29, intQueue33, (java.lang.Integer) 1, true);
        fuzzTest24.FuzzTest_offer(intQueue25, intQueue29, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        fuzzTest41.FuzzTest_offer(intQueue44, intQueue48, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_offer(intQueue29, intQueue44, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue61 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue65 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        fuzzTest58.FuzzTest_offer(intQueue61, intQueue65, (java.lang.Integer) 1, true);
        fuzzTest56.FuzzTest_offer(intQueue57, intQueue61, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = null;
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue77 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue81 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        fuzzTest74.FuzzTest_offer(intQueue77, intQueue81, (java.lang.Integer) 1, true);
        fuzzTest56.FuzzTest_offer(intQueue73, intQueue77, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue44, intQueue77, (java.lang.Integer) 10, false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_offer(intQueue15, intQueue19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzzTest0.FuzzTest_offer(intQueue19, intQueue27, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = null;
        fuzzTest0.FuzzTest_offer(intQueue34, intQueue36, (java.lang.Integer) 10, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue40 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = null;
        fuzzTest0.FuzzTest_offer(intQueue40, intQueue41, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue46 = null;
        fuzzTest0.FuzzTest_offer(intQueue45, intQueue46, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10, 1, 10, 1 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue61 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue65 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        fuzzTest58.FuzzTest_offer(intQueue61, intQueue65, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue77 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        fuzzTest70.FuzzTest_offer(intQueue73, intQueue77, (java.lang.Integer) 1, true);
        fuzzTest57.FuzzTest_offer(intQueue61, intQueue73, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue55, intQueue73, (java.lang.Integer) 10, false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue5 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue9 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzzTest2.FuzzTest_offer(intQueue5, intQueue9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_offer(intQueue1, intQueue5, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzzTest18.FuzzTest_offer(intQueue21, intQueue25, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest30.FuzzTest_offer(intQueue33, intQueue37, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        fuzzTest18.FuzzTest_offer(intQueue37, intQueue45, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_offer(intQueue17, intQueue45, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue60 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        fuzzTest53.FuzzTest_offer(intQueue56, intQueue60, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue68 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue72 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzzTest65.FuzzTest_offer(intQueue68, intQueue72, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue80 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        fuzzTest53.FuzzTest_offer(intQueue72, intQueue80, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue87 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue87, intArray86);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue80, intQueue87, (java.lang.Integer) 10, false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue5 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue9 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzzTest2.FuzzTest_offer(intQueue5, intQueue9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_offer(intQueue1, intQueue5, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue21 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzzTest18.FuzzTest_offer(intQueue21, intQueue25, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_offer(intQueue17, intQueue21, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = null;
        fuzzTest0.FuzzTest_offer(intQueue33, intQueue34, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest40.FuzzTest_offer(intQueue43, intQueue47, (java.lang.Integer) 1, true);
        fuzzTest38.FuzzTest_offer(intQueue39, intQueue43, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = null;
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzzTest38.FuzzTest_offer(intQueue55, intQueue58, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue67 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue71 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        fuzzTest64.FuzzTest_offer(intQueue67, intQueue71, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue79 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue83 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        fuzzTest76.FuzzTest_offer(intQueue79, intQueue83, (java.lang.Integer) 1, true);
        fuzzTest63.FuzzTest_offer(intQueue67, intQueue79, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue58, intQueue79, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_offer(intQueue15, intQueue19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue27 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzzTest0.FuzzTest_offer(intQueue19, intQueue27, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue34 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = null;
        fuzzTest0.FuzzTest_offer(intQueue34, intQueue36, (java.lang.Integer) 10, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue40 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = null;
        fuzzTest0.FuzzTest_offer(intQueue40, intQueue41, (java.lang.Integer) 0, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue46 = null;
        fuzzTest0.FuzzTest_offer(intQueue45, intQueue46, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 0, 1, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue60 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue64 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        fuzzTest57.FuzzTest_offer(intQueue60, intQueue64, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue69 = null;
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue77 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        fuzzTest70.FuzzTest_offer(intQueue73, intQueue77, (java.lang.Integer) 1, true);
        fuzzTest57.FuzzTest_offer(intQueue69, intQueue77, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue55, intQueue77, (java.lang.Integer) 100, false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_offer(intQueue1, intQueue2, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue13 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue17 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        fuzzTest10.FuzzTest_offer(intQueue13, intQueue17, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue26 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue30 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        fuzzTest23.FuzzTest_offer(intQueue26, intQueue30, (java.lang.Integer) 1, true);
        fuzzTest10.FuzzTest_offer(intQueue22, intQueue30, (java.lang.Integer) 1, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue38 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue39 = null;
        fuzzTest10.FuzzTest_offer(intQueue38, intQueue39, (java.lang.Integer) 10, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = null;
        fuzzTest10.FuzzTest_offer(intQueue43, intQueue44, (java.lang.Integer) (-1), true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue50 = null;
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue54 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzzTest51.FuzzTest_offer(intQueue54, intQueue58, (java.lang.Integer) 1, true);
        fuzzTest49.FuzzTest_offer(intQueue50, intQueue54, (java.lang.Integer) 10, true);
        fuzzTest10.FuzzTest_offer(intQueue48, intQueue54, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue8, intQueue54, (java.lang.Integer) 0, false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue5 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue9 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzzTest2.FuzzTest_offer(intQueue5, intQueue9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_offer(intQueue1, intQueue5, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 100, (-1), (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue23 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = null;
        fuzzTest0.FuzzTest_offer(intQueue23, intQueue25, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        fuzzTest29.FuzzTest_offer(intQueue32, intQueue36, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        fuzzTest41.FuzzTest_offer(intQueue44, intQueue48, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue56 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzzTest29.FuzzTest_offer(intQueue48, intQueue56, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue64 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue68 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        fuzzTest61.FuzzTest_offer(intQueue64, intQueue68, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = null;
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue77 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue81 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        fuzzTest74.FuzzTest_offer(intQueue77, intQueue81, (java.lang.Integer) 1, true);
        fuzzTest61.FuzzTest_offer(intQueue73, intQueue81, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue48, intQueue81, (java.lang.Integer) 0, false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_offer(intQueue1, intQueue2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue11 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        fuzzTest8.FuzzTest_offer(intQueue11, intQueue15, (java.lang.Integer) 1, true);
        fuzzTest6.FuzzTest_offer(intQueue7, intQueue11, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 100, (-1), (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue29 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue31 = null;
        fuzzTest6.FuzzTest_offer(intQueue29, intQueue31, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue40 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue44 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        fuzzTest37.FuzzTest_offer(intQueue40, intQueue44, (java.lang.Integer) 1, true);
        fuzzTest35.FuzzTest_offer(intQueue36, intQueue40, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, (-1), 1, (-1), 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue58 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzzTest6.FuzzTest_offer(intQueue36, intQueue58, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, 0, (-1), 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue68 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue58, intQueue68, (java.lang.Integer) 0, false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue5 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue9 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzzTest2.FuzzTest_offer(intQueue5, intQueue9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_offer(intQueue1, intQueue5, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 100, (-1), (-1), (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue23 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = null;
        fuzzTest0.FuzzTest_offer(intQueue23, intQueue25, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest30.FuzzTest_offer(intQueue33, intQueue37, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue49 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        fuzzTest42.FuzzTest_offer(intQueue45, intQueue49, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue57 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzzTest30.FuzzTest_offer(intQueue49, intQueue57, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue62 = null;
        fuzzTest29.FuzzTest_offer(intQueue57, intQueue62, (java.lang.Integer) 0, false);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue66 = null;
        fuzzTest0.FuzzTest_offer(intQueue57, intQueue66, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue73 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue77 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        fuzzTest70.FuzzTest_offer(intQueue73, intQueue77, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue85 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue89 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue89, intArray88);
        fuzzTest82.FuzzTest_offer(intQueue85, intQueue89, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue77, intQueue85, (java.lang.Integer) 10, false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_offer(intQueue3, intQueue7, (java.lang.Integer) 1, true);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        fuzzTest13.FuzzTest_offer(intQueue16, intQueue20, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_offer(intQueue12, intQueue20, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue31 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue35 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzzTest28.FuzzTest_offer(intQueue31, intQueue35, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue47 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest40.FuzzTest_offer(intQueue43, intQueue47, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_offer(intQueue31, intQueue43, (java.lang.Integer) 1, false);
    }
}

