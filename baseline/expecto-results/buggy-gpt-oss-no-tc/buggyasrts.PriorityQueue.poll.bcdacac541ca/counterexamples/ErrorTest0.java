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
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue3, intQueue7, (java.lang.Integer) 1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue3, intQueue7, (java.lang.Integer) 0);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue5 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 10, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue11 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        fuzzTest1.FuzzTest_poll(intQueue5, intQueue11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue19 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 10, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue25 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzzTest15.FuzzTest_poll(intQueue19, intQueue25, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_poll(intQueue5, intQueue25, (java.lang.Integer) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue33 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue39 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 10, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        fuzzTest35.FuzzTest_poll(intQueue39, intQueue45, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue33, intQueue45, (java.lang.Integer) (-1));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue5 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 10, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue11 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        fuzzTest1.FuzzTest_poll(intQueue5, intQueue11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 0, (-1), 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue26 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1, 10, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue32 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        fuzzTest22.FuzzTest_poll(intQueue26, intQueue32, (java.lang.Integer) 0);
        fuzzTest15.FuzzTest_poll(intQueue20, intQueue32, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_poll(intQueue11, intQueue20, (java.lang.Integer) 0);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue42 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue48 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 10, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue54 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        fuzzTest44.FuzzTest_poll(intQueue48, intQueue54, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue42, intQueue54, (java.lang.Integer) 0);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue1 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_poll(intQueue1, intQueue2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue10 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 10, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue16 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        fuzzTest6.FuzzTest_poll(intQueue10, intQueue16, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue24 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 10, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue30 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        fuzzTest20.FuzzTest_poll(intQueue24, intQueue30, (java.lang.Integer) 0);
        fuzzTest5.FuzzTest_poll(intQueue10, intQueue30, (java.lang.Integer) 1);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 0, 10, 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue41 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue45 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        fuzzTest5.FuzzTest_poll(intQueue41, intQueue45, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue50 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue51 = null;
        fuzzTest49.FuzzTest_poll(intQueue50, intQueue51, (java.lang.Integer) 100);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, (-1), 100 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue60 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue66 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, 10, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue72 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzzTest62.FuzzTest_poll(intQueue66, intQueue72, (java.lang.Integer) 0);
        fuzzTest55.FuzzTest_poll(intQueue60, intQueue72, (java.lang.Integer) 1);
        fuzzTest49.FuzzTest_poll(intQueue54, intQueue72, (java.lang.Integer) 10);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue80 = null;
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue85 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 1, 10, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue91 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue91, intArray90);
        fuzzTest81.FuzzTest_poll(intQueue85, intQueue91, (java.lang.Integer) 0);
        fuzzTest49.FuzzTest_poll(intQueue80, intQueue85, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue45, intQueue85, (java.lang.Integer) (-1));
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue4 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 10, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue10 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        fuzzTest0.FuzzTest_poll(intQueue4, intQueue10, (java.lang.Integer) 0);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue14 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue15 = null;
        fuzzTest0.FuzzTest_poll(intQueue14, intQueue15, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue23 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 10, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue29 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        fuzzTest19.FuzzTest_poll(intQueue23, intQueue29, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue37 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, 10, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue43 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzzTest33.FuzzTest_poll(intQueue37, intQueue43, (java.lang.Integer) 0);
        fuzzTest18.FuzzTest_poll(intQueue23, intQueue43, (java.lang.Integer) 1);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue49 = null;
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue50 = null;
        fuzzTest18.FuzzTest_poll(intQueue49, intQueue50, (java.lang.Integer) 10);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue55 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue57 = null;
        fuzzTest18.FuzzTest_poll(intQueue55, intQueue57, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue64 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 10, (-1) };
        buggyasrts.mut_000.PriorityQueue<java.lang.Integer> intQueue70 = new buggyasrts.mut_000.PriorityQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        fuzzTest60.FuzzTest_poll(intQueue64, intQueue70, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_poll(intQueue55, intQueue70, (java.lang.Integer) 1);
    }
}

