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
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue8, intQueue14, (java.lang.Integer) 2);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue6 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue8 = null;
        fuzzTest0.FuzzTest_addLast(intQueue6, intQueue8, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue17 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue19 = null;
        fuzzTest11.FuzzTest_addLast(intQueue17, intQueue19, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-1), 2, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue26 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue34 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue36 = null;
        fuzzTest28.FuzzTest_addLast(intQueue34, intQueue36, (java.lang.Integer) (-1));
        fuzzTest11.FuzzTest_addLast(intQueue26, intQueue34, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue47 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue49 = null;
        fuzzTest41.FuzzTest_addLast(intQueue47, intQueue49, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 2, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue56 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue64 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue66 = null;
        fuzzTest58.FuzzTest_addLast(intQueue64, intQueue66, (java.lang.Integer) (-1));
        fuzzTest41.FuzzTest_addLast(intQueue56, intQueue64, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue26, intQueue64, (java.lang.Integer) 1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue1 = null;
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addLast(intQueue1, intQueue2, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue12 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue14 = null;
        fuzzTest6.FuzzTest_addLast(intQueue12, intQueue14, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 2, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue21 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue29 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue31 = null;
        fuzzTest23.FuzzTest_addLast(intQueue29, intQueue31, (java.lang.Integer) (-1));
        fuzzTest6.FuzzTest_addLast(intQueue21, intQueue29, (java.lang.Integer) 10);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addLast(intQueue29, intQueue36, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue46 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue48 = null;
        fuzzTest40.FuzzTest_addLast(intQueue46, intQueue48, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 2, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue55 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue63 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue65 = null;
        fuzzTest57.FuzzTest_addLast(intQueue63, intQueue65, (java.lang.Integer) (-1));
        fuzzTest40.FuzzTest_addLast(intQueue55, intQueue63, (java.lang.Integer) 10);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addLast(intQueue63, intQueue70, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue29, intQueue63, (java.lang.Integer) 1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue1 = null;
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addLast(intQueue1, intQueue2, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, 2, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue10 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue18 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue20 = null;
        fuzzTest12.FuzzTest_addLast(intQueue18, intQueue20, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1), 2, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue27 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue35 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue37 = null;
        fuzzTest29.FuzzTest_addLast(intQueue35, intQueue37, (java.lang.Integer) (-1));
        fuzzTest12.FuzzTest_addLast(intQueue27, intQueue35, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue48 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue50 = null;
        fuzzTest42.FuzzTest_addLast(intQueue48, intQueue50, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue60 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue62 = null;
        fuzzTest54.FuzzTest_addLast(intQueue60, intQueue62, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { (-1), 2, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue69 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue77 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue79 = null;
        fuzzTest71.FuzzTest_addLast(intQueue77, intQueue79, (java.lang.Integer) (-1));
        fuzzTest54.FuzzTest_addLast(intQueue69, intQueue77, (java.lang.Integer) 10);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_addLast(intQueue77, intQueue84, (java.lang.Integer) 100);
        fuzzTest12.FuzzTest_addLast(intQueue48, intQueue77, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue10, intQueue77, (java.lang.Integer) 1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue6 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue8 = null;
        fuzzTest0.FuzzTest_addLast(intQueue6, intQueue8, (java.lang.Integer) (-1));
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue11 = null;
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue12 = null;
        fuzzTest0.FuzzTest_addLast(intQueue11, intQueue12, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue16 = null;
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addLast(intQueue16, intQueue17, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue27 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue29 = null;
        fuzzTest21.FuzzTest_addLast(intQueue27, intQueue29, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 2, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue36 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue44 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue46 = null;
        fuzzTest38.FuzzTest_addLast(intQueue44, intQueue46, (java.lang.Integer) (-1));
        fuzzTest21.FuzzTest_addLast(intQueue36, intQueue44, (java.lang.Integer) 10);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_addLast(intQueue44, intQueue51, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue60 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue62 = null;
        fuzzTest54.FuzzTest_addLast(intQueue60, intQueue62, (java.lang.Integer) (-1));
        fuzzTest15.FuzzTest_addLast(intQueue44, intQueue60, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue73 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue75 = null;
        fuzzTest67.FuzzTest_addLast(intQueue73, intQueue75, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 2, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue82 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue90 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue90, intArray89);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue92 = null;
        fuzzTest84.FuzzTest_addLast(intQueue90, intQueue92, (java.lang.Integer) (-1));
        fuzzTest67.FuzzTest_addLast(intQueue82, intQueue90, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue44, intQueue82, (java.lang.Integer) (-1));
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue1 = null;
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addLast(intQueue1, intQueue2, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue6 = null;
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 0 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue9 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzzTest5.FuzzTest_addLast(intQueue6, intQueue9, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue13 = null;
        fuzzTest0.FuzzTest_addLast(intQueue9, intQueue13, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue25 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue27 = null;
        fuzzTest19.FuzzTest_addLast(intQueue25, intQueue27, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-1), 2, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue34 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue42 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue44 = null;
        fuzzTest36.FuzzTest_addLast(intQueue42, intQueue44, (java.lang.Integer) (-1));
        fuzzTest19.FuzzTest_addLast(intQueue34, intQueue42, (java.lang.Integer) 10);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_addLast(intQueue42, intQueue49, (java.lang.Integer) 100);
        fuzzTest16.FuzzTest_addLast(intQueue17, intQueue42, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue55 = null;
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue62 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue64 = null;
        fuzzTest56.FuzzTest_addLast(intQueue62, intQueue64, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 2, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue71 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue79 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue81 = null;
        fuzzTest73.FuzzTest_addLast(intQueue79, intQueue81, (java.lang.Integer) (-1));
        fuzzTest56.FuzzTest_addLast(intQueue71, intQueue79, (java.lang.Integer) 10);
        fuzzTest54.FuzzTest_addLast(intQueue55, intQueue79, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue17, intQueue79, (java.lang.Integer) 1);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue10 = null;
        fuzzTest2.FuzzTest_addLast(intQueue8, intQueue10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { (-1), 2, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue17 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue25 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue27 = null;
        fuzzTest19.FuzzTest_addLast(intQueue25, intQueue27, (java.lang.Integer) (-1));
        fuzzTest2.FuzzTest_addLast(intQueue17, intQueue25, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue38 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue40 = null;
        fuzzTest32.FuzzTest_addLast(intQueue38, intQueue40, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue50 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue52 = null;
        fuzzTest44.FuzzTest_addLast(intQueue50, intQueue52, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 2, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue59 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue67 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue69 = null;
        fuzzTest61.FuzzTest_addLast(intQueue67, intQueue69, (java.lang.Integer) (-1));
        fuzzTest44.FuzzTest_addLast(intQueue59, intQueue67, (java.lang.Integer) 10);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_addLast(intQueue67, intQueue74, (java.lang.Integer) 100);
        fuzzTest2.FuzzTest_addLast(intQueue38, intQueue67, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue1, intQueue38, (java.lang.Integer) 1);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue10 = null;
        fuzzTest2.FuzzTest_addLast(intQueue8, intQueue10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { (-1), 2, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue17 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue25 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue27 = null;
        fuzzTest19.FuzzTest_addLast(intQueue25, intQueue27, (java.lang.Integer) (-1));
        fuzzTest2.FuzzTest_addLast(intQueue17, intQueue25, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_addLast(intQueue1, intQueue25, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue40 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue42 = null;
        fuzzTest34.FuzzTest_addLast(intQueue40, intQueue42, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 2, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue49 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue57 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue59 = null;
        fuzzTest51.FuzzTest_addLast(intQueue57, intQueue59, (java.lang.Integer) (-1));
        fuzzTest34.FuzzTest_addLast(intQueue49, intQueue57, (java.lang.Integer) 10);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue64 = null;
        fuzzTest0.FuzzTest_addLast(intQueue49, intQueue64, (java.lang.Integer) 100);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue67 = null;
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue68 = null;
        fuzzTest0.FuzzTest_addLast(intQueue67, intQueue68, (java.lang.Integer) 10);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue71 = null;
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue72 = null;
        fuzzTest0.FuzzTest_addLast(intQueue71, intQueue72, (java.lang.Integer) 10);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, (-1), 100, (-1), 100, 2 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue82 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue90 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue90, intArray89);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue92 = null;
        fuzzTest84.FuzzTest_addLast(intQueue90, intQueue92, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue82, intQueue90, (java.lang.Integer) 1);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue10 = null;
        fuzzTest2.FuzzTest_addLast(intQueue8, intQueue10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { (-1), 2, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue17 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue25 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue27 = null;
        fuzzTest19.FuzzTest_addLast(intQueue25, intQueue27, (java.lang.Integer) (-1));
        fuzzTest2.FuzzTest_addLast(intQueue17, intQueue25, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_addLast(intQueue1, intQueue25, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue35 = null;
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_addLast(intQueue35, intQueue36, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue46 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue48 = null;
        fuzzTest40.FuzzTest_addLast(intQueue46, intQueue48, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 2, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue55 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue63 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue65 = null;
        fuzzTest57.FuzzTest_addLast(intQueue63, intQueue65, (java.lang.Integer) (-1));
        fuzzTest40.FuzzTest_addLast(intQueue55, intQueue63, (java.lang.Integer) 10);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addLast(intQueue63, intQueue70, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue74 = null;
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_addLast(intQueue74, intQueue75, (java.lang.Integer) (-1));
        fuzzTest34.FuzzTest_addLast(intQueue63, intQueue75, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 2 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue83 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue63, intQueue83, (java.lang.Integer) 100);
    }
}

