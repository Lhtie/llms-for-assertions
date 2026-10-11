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
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue7 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue3, intQueue7, (java.lang.Integer) 1, true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue11 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue13 = null;
        fuzzTest8.FuzzTest_add(intQueue11, intQueue13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue20 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue22 = null;
        fuzzTest17.FuzzTest_add(intQueue20, intQueue22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue29 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue31 = null;
        fuzzTest26.FuzzTest_add(intQueue29, intQueue31, (java.lang.Integer) (-1), false);
        fuzzTest8.FuzzTest_add(intQueue20, intQueue31, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_add(intQueue6, intQueue31, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue43 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue51 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue56 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue58 = null;
        fuzzTest53.FuzzTest_add(intQueue56, intQueue58, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue65 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue67 = null;
        fuzzTest62.FuzzTest_add(intQueue65, intQueue67, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue74 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue76 = null;
        fuzzTest71.FuzzTest_add(intQueue74, intQueue76, (java.lang.Integer) (-1), false);
        fuzzTest53.FuzzTest_add(intQueue65, intQueue76, (java.lang.Integer) 1, false);
        fuzzTest45.FuzzTest_add(intQueue51, intQueue76, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue43, intQueue51, (java.lang.Integer) 100, false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest0.FuzzTest_add(intQueue3, intQueue5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue12 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue14 = null;
        fuzzTest9.FuzzTest_add(intQueue12, intQueue14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue21 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue23 = null;
        fuzzTest18.FuzzTest_add(intQueue21, intQueue23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intQueue12, intQueue23, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue33 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue35 = null;
        fuzzTest30.FuzzTest_add(intQueue33, intQueue35, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue42 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue44 = null;
        fuzzTest39.FuzzTest_add(intQueue42, intQueue44, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue51 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue53 = null;
        fuzzTest48.FuzzTest_add(intQueue51, intQueue53, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue60 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue62 = null;
        fuzzTest57.FuzzTest_add(intQueue60, intQueue62, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue69 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue71 = null;
        fuzzTest66.FuzzTest_add(intQueue69, intQueue71, (java.lang.Integer) (-1), false);
        fuzzTest48.FuzzTest_add(intQueue60, intQueue71, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue81 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        fuzzTest39.FuzzTest_add(intQueue71, intQueue81, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue33, intQueue81, (java.lang.Integer) 10, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue11 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue13 = null;
        fuzzTest8.FuzzTest_add(intQueue11, intQueue13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue20 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue22 = null;
        fuzzTest17.FuzzTest_add(intQueue20, intQueue22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue29 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue31 = null;
        fuzzTest26.FuzzTest_add(intQueue29, intQueue31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue38 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue40 = null;
        fuzzTest35.FuzzTest_add(intQueue38, intQueue40, (java.lang.Integer) (-1), false);
        fuzzTest17.FuzzTest_add(intQueue29, intQueue40, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue50 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        fuzzTest8.FuzzTest_add(intQueue40, intQueue50, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intQueue6, intQueue40, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, (-1), 0, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue63 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue68 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue70 = null;
        fuzzTest65.FuzzTest_add(intQueue68, intQueue70, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue77 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue79 = null;
        fuzzTest74.FuzzTest_add(intQueue77, intQueue79, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue86 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue88 = null;
        fuzzTest83.FuzzTest_add(intQueue86, intQueue88, (java.lang.Integer) (-1), false);
        fuzzTest65.FuzzTest_add(intQueue77, intQueue88, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue63, intQueue77, (java.lang.Integer) 0, true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 0, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue5 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 1, 1, 0, 1 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue13 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue5, intQueue13, (java.lang.Integer) 100, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest0.FuzzTest_add(intQueue3, intQueue5, (java.lang.Integer) (-1), false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue13 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue15 = null;
        fuzzTest10.FuzzTest_add(intQueue13, intQueue15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue22 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue24 = null;
        fuzzTest19.FuzzTest_add(intQueue22, intQueue24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue31 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue33 = null;
        fuzzTest28.FuzzTest_add(intQueue31, intQueue33, (java.lang.Integer) (-1), false);
        fuzzTest10.FuzzTest_add(intQueue22, intQueue33, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_add(intQueue9, intQueue33, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue46 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue48 = null;
        fuzzTest43.FuzzTest_add(intQueue46, intQueue48, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue55 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue57 = null;
        fuzzTest52.FuzzTest_add(intQueue55, intQueue57, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue64 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue66 = null;
        fuzzTest61.FuzzTest_add(intQueue64, intQueue66, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue73 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue75 = null;
        fuzzTest70.FuzzTest_add(intQueue73, intQueue75, (java.lang.Integer) (-1), false);
        fuzzTest52.FuzzTest_add(intQueue64, intQueue75, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue46, intQueue64, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue4 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = null;
        fuzzTest1.FuzzTest_add(intQueue4, intQueue6, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue16 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue21 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue23 = null;
        fuzzTest18.FuzzTest_add(intQueue21, intQueue23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue30 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue32 = null;
        fuzzTest27.FuzzTest_add(intQueue30, intQueue32, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue39 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue41 = null;
        fuzzTest36.FuzzTest_add(intQueue39, intQueue41, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue48 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue50 = null;
        fuzzTest45.FuzzTest_add(intQueue48, intQueue50, (java.lang.Integer) (-1), false);
        fuzzTest27.FuzzTest_add(intQueue39, intQueue50, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue60 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        fuzzTest18.FuzzTest_add(intQueue50, intQueue60, (java.lang.Integer) 1, true);
        fuzzTest10.FuzzTest_add(intQueue16, intQueue50, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10, 0, 1, 0, 1 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue74 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue76 = null;
        fuzzTest10.FuzzTest_add(intQueue74, intQueue76, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue4, intQueue74, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue4 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = null;
        fuzzTest1.FuzzTest_add(intQueue4, intQueue6, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue13 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue15 = null;
        fuzzTest10.FuzzTest_add(intQueue13, intQueue15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue22 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue24 = null;
        fuzzTest19.FuzzTest_add(intQueue22, intQueue24, (java.lang.Integer) (-1), false);
        fuzzTest1.FuzzTest_add(intQueue13, intQueue24, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue34 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue36 = null;
        fuzzTest31.FuzzTest_add(intQueue34, intQueue36, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue43 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue45 = null;
        fuzzTest40.FuzzTest_add(intQueue43, intQueue45, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue52 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue54 = null;
        fuzzTest49.FuzzTest_add(intQueue52, intQueue54, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue61 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue63 = null;
        fuzzTest58.FuzzTest_add(intQueue61, intQueue63, (java.lang.Integer) (-1), false);
        fuzzTest40.FuzzTest_add(intQueue52, intQueue63, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue73 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzzTest31.FuzzTest_add(intQueue63, intQueue73, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intQueue13, intQueue73, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue84 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue84, intArray83);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue88 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue88, intArray87);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue84, intQueue88, (java.lang.Integer) 0, true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue11 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue13 = null;
        fuzzTest8.FuzzTest_add(intQueue11, intQueue13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue20 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue22 = null;
        fuzzTest17.FuzzTest_add(intQueue20, intQueue22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue29 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue31 = null;
        fuzzTest26.FuzzTest_add(intQueue29, intQueue31, (java.lang.Integer) (-1), false);
        fuzzTest8.FuzzTest_add(intQueue20, intQueue31, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_add(intQueue6, intQueue31, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-1), 1, 0, 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue46 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue51 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue53 = null;
        fuzzTest48.FuzzTest_add(intQueue51, intQueue53, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue46, intQueue51, (java.lang.Integer) 1, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue5 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue7 = null;
        fuzzTest2.FuzzTest_add(intQueue5, intQueue7, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue14 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue16 = null;
        fuzzTest11.FuzzTest_add(intQueue14, intQueue16, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue23 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue25 = null;
        fuzzTest20.FuzzTest_add(intQueue23, intQueue25, (java.lang.Integer) (-1), false);
        fuzzTest2.FuzzTest_add(intQueue14, intQueue25, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue35 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue37 = null;
        fuzzTest32.FuzzTest_add(intQueue35, intQueue37, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue44 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue46 = null;
        fuzzTest41.FuzzTest_add(intQueue44, intQueue46, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue53 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue55 = null;
        fuzzTest50.FuzzTest_add(intQueue53, intQueue55, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue62 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue64 = null;
        fuzzTest59.FuzzTest_add(intQueue62, intQueue64, (java.lang.Integer) (-1), false);
        fuzzTest41.FuzzTest_add(intQueue53, intQueue64, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue74 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        fuzzTest32.FuzzTest_add(intQueue64, intQueue74, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intQueue14, intQueue74, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue84 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue84, intArray83);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue14, intQueue84, (java.lang.Integer) 0, true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest0.FuzzTest_add(intQueue3, intQueue5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue12 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue14 = null;
        fuzzTest9.FuzzTest_add(intQueue12, intQueue14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue21 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue23 = null;
        fuzzTest18.FuzzTest_add(intQueue21, intQueue23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue30 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue32 = null;
        fuzzTest27.FuzzTest_add(intQueue30, intQueue32, (java.lang.Integer) (-1), false);
        fuzzTest9.FuzzTest_add(intQueue21, intQueue32, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10, 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue42 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue21, intQueue42, (java.lang.Integer) 1, false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue11 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue13 = null;
        fuzzTest8.FuzzTest_add(intQueue11, intQueue13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue20 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue22 = null;
        fuzzTest17.FuzzTest_add(intQueue20, intQueue22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue29 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue31 = null;
        fuzzTest26.FuzzTest_add(intQueue29, intQueue31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue38 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue40 = null;
        fuzzTest35.FuzzTest_add(intQueue38, intQueue40, (java.lang.Integer) (-1), false);
        fuzzTest17.FuzzTest_add(intQueue29, intQueue40, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue50 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        fuzzTest8.FuzzTest_add(intQueue40, intQueue50, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intQueue6, intQueue40, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue61 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue63 = null;
        fuzzTest58.FuzzTest_add(intQueue61, intQueue63, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue70 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue72 = null;
        fuzzTest67.FuzzTest_add(intQueue70, intQueue72, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue79 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue81 = null;
        fuzzTest76.FuzzTest_add(intQueue79, intQueue81, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest85 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue88 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue88, intArray87);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue90 = null;
        fuzzTest85.FuzzTest_add(intQueue88, intQueue90, (java.lang.Integer) (-1), false);
        fuzzTest67.FuzzTest_add(intQueue79, intQueue90, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue61, intQueue79, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest0.FuzzTest_add(intQueue3, intQueue5, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 0, 100, 10, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue14 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue20 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue22 = null;
        fuzzTest17.FuzzTest_add(intQueue20, intQueue22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue29 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue31 = null;
        fuzzTest26.FuzzTest_add(intQueue29, intQueue31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue38 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue40 = null;
        fuzzTest35.FuzzTest_add(intQueue38, intQueue40, (java.lang.Integer) (-1), false);
        fuzzTest17.FuzzTest_add(intQueue29, intQueue40, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue50 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue52 = null;
        fuzzTest47.FuzzTest_add(intQueue50, intQueue52, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue59 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue61 = null;
        fuzzTest56.FuzzTest_add(intQueue59, intQueue61, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue68 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue70 = null;
        fuzzTest65.FuzzTest_add(intQueue68, intQueue70, (java.lang.Integer) (-1), false);
        fuzzTest47.FuzzTest_add(intQueue59, intQueue70, (java.lang.Integer) 1, false);
        fuzzTest16.FuzzTest_add(intQueue29, intQueue70, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue14, intQueue29, (java.lang.Integer) 100, false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest0.FuzzTest_add(intQueue3, intQueue5, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 0, 1, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue13 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue18 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue20 = null;
        fuzzTest15.FuzzTest_add(intQueue18, intQueue20, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue27 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue29 = null;
        fuzzTest24.FuzzTest_add(intQueue27, intQueue29, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue36 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue38 = null;
        fuzzTest33.FuzzTest_add(intQueue36, intQueue38, (java.lang.Integer) (-1), false);
        fuzzTest15.FuzzTest_add(intQueue27, intQueue38, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue48 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue50 = null;
        fuzzTest45.FuzzTest_add(intQueue48, intQueue50, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue57 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue59 = null;
        fuzzTest54.FuzzTest_add(intQueue57, intQueue59, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue66 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue68 = null;
        fuzzTest63.FuzzTest_add(intQueue66, intQueue68, (java.lang.Integer) (-1), false);
        fuzzTest45.FuzzTest_add(intQueue57, intQueue68, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 10, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue79 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        fuzzTest15.FuzzTest_add(intQueue68, intQueue79, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { (-1), 1, 1, (-1), 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue90 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue90, intArray89);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue92 = null;
        fuzzTest15.FuzzTest_add(intQueue90, intQueue92, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue13, intQueue90, (java.lang.Integer) 0, true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest0.FuzzTest_add(intQueue3, intQueue5, (java.lang.Integer) (-1), false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue13 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue15 = null;
        fuzzTest10.FuzzTest_add(intQueue13, intQueue15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue22 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue24 = null;
        fuzzTest19.FuzzTest_add(intQueue22, intQueue24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue31 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue33 = null;
        fuzzTest28.FuzzTest_add(intQueue31, intQueue33, (java.lang.Integer) (-1), false);
        fuzzTest10.FuzzTest_add(intQueue22, intQueue33, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_add(intQueue9, intQueue33, (java.lang.Integer) 10, true);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue47 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue49 = null;
        fuzzTest44.FuzzTest_add(intQueue47, intQueue49, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intQueue43, intQueue47, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue59 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue61 = null;
        fuzzTest56.FuzzTest_add(intQueue59, intQueue61, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 10, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue69 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue59, intQueue69, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_add(intQueue1, intQueue2, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue12 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue17 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue19 = null;
        fuzzTest14.FuzzTest_add(intQueue17, intQueue19, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue26 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue28 = null;
        fuzzTest23.FuzzTest_add(intQueue26, intQueue28, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue35 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue37 = null;
        fuzzTest32.FuzzTest_add(intQueue35, intQueue37, (java.lang.Integer) (-1), false);
        fuzzTest14.FuzzTest_add(intQueue26, intQueue37, (java.lang.Integer) 1, false);
        fuzzTest6.FuzzTest_add(intQueue12, intQueue37, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue49 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue51 = null;
        fuzzTest6.FuzzTest_add(intQueue49, intQueue51, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue58 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue60 = null;
        fuzzTest55.FuzzTest_add(intQueue58, intQueue60, (java.lang.Integer) (-1), false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue64 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue65 = null;
        fuzzTest55.FuzzTest_add(intQueue64, intQueue65, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue73 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue75 = null;
        fuzzTest70.FuzzTest_add(intQueue73, intQueue75, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue82 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue84 = null;
        fuzzTest79.FuzzTest_add(intQueue82, intQueue84, (java.lang.Integer) (-1), false);
        fuzzTest69.FuzzTest_add(intQueue75, intQueue82, (java.lang.Integer) 10, false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue91 = null;
        fuzzTest55.FuzzTest_add(intQueue82, intQueue91, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue49, intQueue82, (java.lang.Integer) 0, false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest0.FuzzTest_add(intQueue3, intQueue5, (java.lang.Integer) (-1), false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue9 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue10 = null;
        fuzzTest0.FuzzTest_add(intQueue9, intQueue10, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, (-1), (-1), 0, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue21 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue29 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue34 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue36 = null;
        fuzzTest31.FuzzTest_add(intQueue34, intQueue36, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue43 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue45 = null;
        fuzzTest40.FuzzTest_add(intQueue43, intQueue45, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue52 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue54 = null;
        fuzzTest49.FuzzTest_add(intQueue52, intQueue54, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue61 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue63 = null;
        fuzzTest58.FuzzTest_add(intQueue61, intQueue63, (java.lang.Integer) (-1), false);
        fuzzTest40.FuzzTest_add(intQueue52, intQueue63, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue73 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzzTest31.FuzzTest_add(intQueue63, intQueue73, (java.lang.Integer) 1, true);
        fuzzTest23.FuzzTest_add(intQueue29, intQueue63, (java.lang.Integer) (-1), true);
        fuzzTest14.FuzzTest_add(intQueue21, intQueue63, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 100, 1, (-1), 1 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue89 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue89, intArray88);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue21, intQueue89, (java.lang.Integer) 0, false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest0.FuzzTest_add(intQueue3, intQueue5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue12 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue14 = null;
        fuzzTest9.FuzzTest_add(intQueue12, intQueue14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue21 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue23 = null;
        fuzzTest18.FuzzTest_add(intQueue21, intQueue23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intQueue12, intQueue23, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue33 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue35 = null;
        fuzzTest30.FuzzTest_add(intQueue33, intQueue35, (java.lang.Integer) (-1), false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue39 = null;
        fuzzTest0.FuzzTest_add(intQueue33, intQueue39, (java.lang.Integer) 0, true);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue43 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue44 = null;
        fuzzTest0.FuzzTest_add(intQueue43, intQueue44, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10, 1, 10, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue53 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue58 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue60 = null;
        fuzzTest55.FuzzTest_add(intQueue58, intQueue60, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10, 0, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue68 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 1, 1, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue76 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        fuzzTest55.FuzzTest_add(intQueue68, intQueue76, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue53, intQueue76, (java.lang.Integer) 10, true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest0.FuzzTest_add(intQueue3, intQueue5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue12 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue14 = null;
        fuzzTest9.FuzzTest_add(intQueue12, intQueue14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue21 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue23 = null;
        fuzzTest18.FuzzTest_add(intQueue21, intQueue23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intQueue12, intQueue23, (java.lang.Integer) 1, false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue30 = null;
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 100, (-1), (-1), 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue37 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest0.FuzzTest_add(intQueue30, intQueue37, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue45 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue47 = null;
        fuzzTest42.FuzzTest_add(intQueue45, intQueue47, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10, 0, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue55 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 1, 1, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue63 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzzTest42.FuzzTest_add(intQueue55, intQueue63, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue71 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue73 = null;
        fuzzTest68.FuzzTest_add(intQueue71, intQueue73, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10, 0, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue81 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 100, 1, 1, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue89 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue89, intArray88);
        fuzzTest68.FuzzTest_add(intQueue81, intQueue89, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue63, intQueue89, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue11 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue13 = null;
        fuzzTest8.FuzzTest_add(intQueue11, intQueue13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue20 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue22 = null;
        fuzzTest17.FuzzTest_add(intQueue20, intQueue22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue29 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue31 = null;
        fuzzTest26.FuzzTest_add(intQueue29, intQueue31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue38 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue40 = null;
        fuzzTest35.FuzzTest_add(intQueue38, intQueue40, (java.lang.Integer) (-1), false);
        fuzzTest17.FuzzTest_add(intQueue29, intQueue40, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue50 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        fuzzTest8.FuzzTest_add(intQueue40, intQueue50, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intQueue6, intQueue40, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10, 0, 1, 0, 1 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue64 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue66 = null;
        fuzzTest0.FuzzTest_add(intQueue64, intQueue66, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue73 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue75 = null;
        fuzzTest70.FuzzTest_add(intQueue73, intQueue75, (java.lang.Integer) (-1), false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue79 = null;
        fuzzTest0.FuzzTest_add(intQueue73, intQueue79, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue86 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue88 = null;
        fuzzTest83.FuzzTest_add(intQueue86, intQueue88, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue94 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue94, intArray93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue86, intQueue94, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_add(intQueue1, intQueue2, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue10 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue12 = null;
        fuzzTest7.FuzzTest_add(intQueue10, intQueue12, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue19 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue21 = null;
        fuzzTest16.FuzzTest_add(intQueue19, intQueue21, (java.lang.Integer) (-1), false);
        fuzzTest6.FuzzTest_add(intQueue12, intQueue19, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue33 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue35 = null;
        fuzzTest30.FuzzTest_add(intQueue33, intQueue35, (java.lang.Integer) (-1), false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue39 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue40 = null;
        fuzzTest30.FuzzTest_add(intQueue39, intQueue40, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue50 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue55 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue57 = null;
        fuzzTest52.FuzzTest_add(intQueue55, intQueue57, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue64 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue66 = null;
        fuzzTest61.FuzzTest_add(intQueue64, intQueue66, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue73 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue75 = null;
        fuzzTest70.FuzzTest_add(intQueue73, intQueue75, (java.lang.Integer) (-1), false);
        fuzzTest52.FuzzTest_add(intQueue64, intQueue75, (java.lang.Integer) 1, false);
        fuzzTest44.FuzzTest_add(intQueue50, intQueue75, (java.lang.Integer) 100, false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue85 = null;
        fuzzTest30.FuzzTest_add(intQueue50, intQueue85, (java.lang.Integer) 100, false);
        fuzzTest28.FuzzTest_add(intQueue29, intQueue50, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue19, intQueue50, (java.lang.Integer) 10, true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest0.FuzzTest_add(intQueue3, intQueue5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue12 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue14 = null;
        fuzzTest9.FuzzTest_add(intQueue12, intQueue14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue21 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue23 = null;
        fuzzTest18.FuzzTest_add(intQueue21, intQueue23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue30 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue32 = null;
        fuzzTest27.FuzzTest_add(intQueue30, intQueue32, (java.lang.Integer) (-1), false);
        fuzzTest9.FuzzTest_add(intQueue21, intQueue32, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue42 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        fuzzTest0.FuzzTest_add(intQueue32, intQueue42, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue50 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue52 = null;
        fuzzTest47.FuzzTest_add(intQueue50, intQueue52, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue59 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue61 = null;
        fuzzTest56.FuzzTest_add(intQueue59, intQueue61, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue68 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue70 = null;
        fuzzTest65.FuzzTest_add(intQueue68, intQueue70, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue77 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue79 = null;
        fuzzTest74.FuzzTest_add(intQueue77, intQueue79, (java.lang.Integer) (-1), false);
        fuzzTest56.FuzzTest_add(intQueue68, intQueue79, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue50, intQueue68, (java.lang.Integer) 0, true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest0.FuzzTest_add(intQueue3, intQueue5, (java.lang.Integer) (-1), false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue9 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue10 = null;
        fuzzTest0.FuzzTest_add(intQueue9, intQueue10, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue18 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue20 = null;
        fuzzTest15.FuzzTest_add(intQueue18, intQueue20, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue27 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue29 = null;
        fuzzTest24.FuzzTest_add(intQueue27, intQueue29, (java.lang.Integer) (-1), false);
        fuzzTest14.FuzzTest_add(intQueue20, intQueue27, (java.lang.Integer) 10, false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue36 = null;
        fuzzTest0.FuzzTest_add(intQueue27, intQueue36, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue43 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue45 = null;
        fuzzTest40.FuzzTest_add(intQueue43, intQueue45, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue52 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue54 = null;
        fuzzTest49.FuzzTest_add(intQueue52, intQueue54, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10, 0, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue62 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 1, 1, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue70 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        fuzzTest49.FuzzTest_add(intQueue62, intQueue70, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue43, intQueue62, (java.lang.Integer) 100, true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue8 = null;
        fuzzTest3.FuzzTest_add(intQueue6, intQueue8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue15 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue17 = null;
        fuzzTest12.FuzzTest_add(intQueue15, intQueue17, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue24 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue26 = null;
        fuzzTest21.FuzzTest_add(intQueue24, intQueue26, (java.lang.Integer) (-1), false);
        fuzzTest3.FuzzTest_add(intQueue15, intQueue26, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue36 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue38 = null;
        fuzzTest33.FuzzTest_add(intQueue36, intQueue38, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue45 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue47 = null;
        fuzzTest42.FuzzTest_add(intQueue45, intQueue47, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue54 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue56 = null;
        fuzzTest51.FuzzTest_add(intQueue54, intQueue56, (java.lang.Integer) (-1), false);
        fuzzTest33.FuzzTest_add(intQueue45, intQueue56, (java.lang.Integer) 1, false);
        fuzzTest2.FuzzTest_add(intQueue15, intQueue56, (java.lang.Integer) 0, false);
        fuzzTest0.FuzzTest_add(intQueue1, intQueue56, (java.lang.Integer) (-1), true);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue69 = null;
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue73 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue75 = null;
        fuzzTest70.FuzzTest_add(intQueue73, intQueue75, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intQueue69, intQueue75, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue85 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue87 = null;
        fuzzTest82.FuzzTest_add(intQueue85, intQueue87, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 1, 0, 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue95 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue95, intArray94);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue85, intQueue95, (java.lang.Integer) 100, false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue4 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = null;
        fuzzTest1.FuzzTest_add(intQueue4, intQueue6, (java.lang.Integer) (-1), false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue10 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue11 = null;
        fuzzTest1.FuzzTest_add(intQueue10, intQueue11, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue19 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue21 = null;
        fuzzTest16.FuzzTest_add(intQueue19, intQueue21, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue28 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue30 = null;
        fuzzTest25.FuzzTest_add(intQueue28, intQueue30, (java.lang.Integer) (-1), false);
        fuzzTest15.FuzzTest_add(intQueue21, intQueue28, (java.lang.Integer) 10, false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue37 = null;
        fuzzTest1.FuzzTest_add(intQueue28, intQueue37, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue42 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue43 = null;
        fuzzTest41.FuzzTest_add(intQueue42, intQueue43, (java.lang.Integer) 0, true);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue47 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue48 = null;
        fuzzTest41.FuzzTest_add(intQueue47, intQueue48, (java.lang.Integer) 10, true);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue52 = null;
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, (-1), 1 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue57 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzzTest41.FuzzTest_add(intQueue52, intQueue57, (java.lang.Integer) (-1), true);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue62 = null;
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, 1, 100, 1 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue68 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        fuzzTest41.FuzzTest_add(intQueue62, intQueue68, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue28, intQueue68, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue4 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = null;
        fuzzTest1.FuzzTest_add(intQueue4, intQueue6, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue13 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue15 = null;
        fuzzTest10.FuzzTest_add(intQueue13, intQueue15, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intQueue6, intQueue13, (java.lang.Integer) 10, false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue22 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue23 = null;
        fuzzTest0.FuzzTest_add(intQueue22, intQueue23, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 1 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue30 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue35 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue37 = null;
        fuzzTest32.FuzzTest_add(intQueue35, intQueue37, (java.lang.Integer) (-1), false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue41 = null;
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue45 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue47 = null;
        fuzzTest42.FuzzTest_add(intQueue45, intQueue47, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue54 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue56 = null;
        fuzzTest51.FuzzTest_add(intQueue54, intQueue56, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue63 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue65 = null;
        fuzzTest60.FuzzTest_add(intQueue63, intQueue65, (java.lang.Integer) (-1), false);
        fuzzTest42.FuzzTest_add(intQueue54, intQueue65, (java.lang.Integer) 10, true);
        fuzzTest32.FuzzTest_add(intQueue41, intQueue65, (java.lang.Integer) 10, true);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue75 = null;
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue79 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue81 = null;
        fuzzTest76.FuzzTest_add(intQueue79, intQueue81, (java.lang.Integer) (-1), false);
        fuzzTest32.FuzzTest_add(intQueue75, intQueue79, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue30, intQueue79, (java.lang.Integer) 100, true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_add(intQueue1, intQueue2, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue12 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue17 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue19 = null;
        fuzzTest14.FuzzTest_add(intQueue17, intQueue19, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue26 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue28 = null;
        fuzzTest23.FuzzTest_add(intQueue26, intQueue28, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue35 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue37 = null;
        fuzzTest32.FuzzTest_add(intQueue35, intQueue37, (java.lang.Integer) (-1), false);
        fuzzTest14.FuzzTest_add(intQueue26, intQueue37, (java.lang.Integer) 1, false);
        fuzzTest6.FuzzTest_add(intQueue12, intQueue37, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue49 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue51 = null;
        fuzzTest6.FuzzTest_add(intQueue49, intQueue51, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue59 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue61 = null;
        fuzzTest56.FuzzTest_add(intQueue59, intQueue61, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10, 0, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue69 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100, 1, 1, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue77 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        fuzzTest56.FuzzTest_add(intQueue69, intQueue77, (java.lang.Integer) 1, true);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue82 = null;
        fuzzTest55.FuzzTest_add(intQueue69, intQueue82, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue49, intQueue69, (java.lang.Integer) 100, true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_add(intQueue1, intQueue2, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue9 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue11 = null;
        fuzzTest6.FuzzTest_add(intQueue9, intQueue11, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10, 0, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue19 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 1, 1, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue27 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzzTest6.FuzzTest_add(intQueue19, intQueue27, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue33 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue34 = null;
        fuzzTest32.FuzzTest_add(intQueue33, intQueue34, (java.lang.Integer) 0, true);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue38 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue39 = null;
        fuzzTest32.FuzzTest_add(intQueue38, intQueue39, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 1, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue47 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue52 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue54 = null;
        fuzzTest49.FuzzTest_add(intQueue52, intQueue54, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10, 0, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue62 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 1, 1, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue70 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        fuzzTest49.FuzzTest_add(intQueue62, intQueue70, (java.lang.Integer) 1, true);
        fuzzTest32.FuzzTest_add(intQueue47, intQueue62, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue27, intQueue47, (java.lang.Integer) 10, false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue4 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = null;
        fuzzTest1.FuzzTest_add(intQueue4, intQueue6, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue13 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue15 = null;
        fuzzTest10.FuzzTest_add(intQueue13, intQueue15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue22 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue24 = null;
        fuzzTest19.FuzzTest_add(intQueue22, intQueue24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue31 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue33 = null;
        fuzzTest28.FuzzTest_add(intQueue31, intQueue33, (java.lang.Integer) (-1), false);
        fuzzTest10.FuzzTest_add(intQueue22, intQueue33, (java.lang.Integer) 1, false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue40 = null;
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue44 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue46 = null;
        fuzzTest41.FuzzTest_add(intQueue44, intQueue46, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue53 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue55 = null;
        fuzzTest50.FuzzTest_add(intQueue53, intQueue55, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue62 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue64 = null;
        fuzzTest59.FuzzTest_add(intQueue62, intQueue64, (java.lang.Integer) (-1), false);
        fuzzTest41.FuzzTest_add(intQueue53, intQueue64, (java.lang.Integer) 10, true);
        fuzzTest10.FuzzTest_add(intQueue40, intQueue64, (java.lang.Integer) 0, false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue74 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue75 = null;
        fuzzTest10.FuzzTest_add(intQueue74, intQueue75, (java.lang.Integer) 10, true);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue79 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue80 = null;
        fuzzTest10.FuzzTest_add(intQueue79, intQueue80, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10, 1 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue87 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue87, intArray86);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue89 = null;
        fuzzTest10.FuzzTest_add(intQueue87, intQueue89, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue4, intQueue87, (java.lang.Integer) 0, false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue5 = null;
        fuzzTest0.FuzzTest_add(intQueue3, intQueue5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue12 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue14 = null;
        fuzzTest9.FuzzTest_add(intQueue12, intQueue14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue21 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue23 = null;
        fuzzTest18.FuzzTest_add(intQueue21, intQueue23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intQueue12, intQueue23, (java.lang.Integer) 1, false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue34 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue36 = null;
        fuzzTest31.FuzzTest_add(intQueue34, intQueue36, (java.lang.Integer) (-1), false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue40 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue41 = null;
        fuzzTest31.FuzzTest_add(intQueue40, intQueue41, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue49 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue51 = null;
        fuzzTest46.FuzzTest_add(intQueue49, intQueue51, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue58 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue60 = null;
        fuzzTest55.FuzzTest_add(intQueue58, intQueue60, (java.lang.Integer) (-1), false);
        fuzzTest45.FuzzTest_add(intQueue51, intQueue58, (java.lang.Integer) 10, false);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue67 = null;
        fuzzTest31.FuzzTest_add(intQueue58, intQueue67, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_add(intQueue30, intQueue58, (java.lang.Integer) 1, true);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue74 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue75 = null;
        fuzzTest0.FuzzTest_add(intQueue74, intQueue75, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 1 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue81 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue86 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue88 = null;
        fuzzTest83.FuzzTest_add(intQueue86, intQueue88, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intQueue81, intQueue86, (java.lang.Integer) (-1), true);
    }
}

