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
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet7 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (java.lang.Integer) 1, true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet11 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest8.FuzzTest_add(intSet11, intSet13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet20 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest17.FuzzTest_add(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest26.FuzzTest_add(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzzTest8.FuzzTest_add(intSet20, intSet31, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_add(intSet6, intSet31, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet56 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet58 = null;
        fuzzTest53.FuzzTest_add(intSet56, intSet58, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet65 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet67 = null;
        fuzzTest62.FuzzTest_add(intSet65, intSet67, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet74 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet76 = null;
        fuzzTest71.FuzzTest_add(intSet74, intSet76, (java.lang.Integer) (-1), false);
        fuzzTest53.FuzzTest_add(intSet65, intSet76, (java.lang.Integer) 1, false);
        fuzzTest45.FuzzTest_add(intSet51, intSet76, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet43, intSet51, (java.lang.Integer) 100, false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet12, intSet23, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = null;
        fuzzTest30.FuzzTest_add(intSet33, intSet35, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet42 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = null;
        fuzzTest39.FuzzTest_add(intSet42, intSet44, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet53 = null;
        fuzzTest48.FuzzTest_add(intSet51, intSet53, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet60 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = null;
        fuzzTest57.FuzzTest_add(intSet60, intSet62, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet69 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet71 = null;
        fuzzTest66.FuzzTest_add(intSet69, intSet71, (java.lang.Integer) (-1), false);
        fuzzTest48.FuzzTest_add(intSet60, intSet71, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet81 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        fuzzTest39.FuzzTest_add(intSet71, intSet81, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet33, intSet81, (java.lang.Integer) 10, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet11 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest8.FuzzTest_add(intSet11, intSet13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet20 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest17.FuzzTest_add(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest26.FuzzTest_add(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet38 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest35.FuzzTest_add(intSet38, intSet40, (java.lang.Integer) (-1), false);
        fuzzTest17.FuzzTest_add(intSet29, intSet40, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest8.FuzzTest_add(intSet40, intSet50, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intSet6, intSet40, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, (-1), 0, 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet63 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet68 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet70 = null;
        fuzzTest65.FuzzTest_add(intSet68, intSet70, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet77 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet79 = null;
        fuzzTest74.FuzzTest_add(intSet77, intSet79, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet86 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet88 = null;
        fuzzTest83.FuzzTest_add(intSet86, intSet88, (java.lang.Integer) (-1), false);
        fuzzTest65.FuzzTest_add(intSet77, intSet88, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet63, intSet77, (java.lang.Integer) 0, true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 0, 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 1, 1, 0, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet5, intSet13, (java.lang.Integer) 100, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet4 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = null;
        fuzzTest1.FuzzTest_add(intSet4, intSet6, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest19.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzzTest1.FuzzTest_add(intSet13, intSet24, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest31.FuzzTest_add(intSet34, intSet36, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = null;
        fuzzTest40.FuzzTest_add(intSet43, intSet45, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest49.FuzzTest_add(intSet52, intSet54, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet63 = null;
        fuzzTest58.FuzzTest_add(intSet61, intSet63, (java.lang.Integer) (-1), false);
        fuzzTest40.FuzzTest_add(intSet52, intSet63, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest31.FuzzTest_add(intSet63, intSet73, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet13, intSet73, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet11 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest8.FuzzTest_add(intSet11, intSet13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet20 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest17.FuzzTest_add(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest26.FuzzTest_add(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzzTest8.FuzzTest_add(intSet20, intSet31, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_add(intSet6, intSet31, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet46 = null;
        fuzzTest41.FuzzTest_add(intSet44, intSet46, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet53 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest50.FuzzTest_add(intSet53, intSet55, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest59.FuzzTest_add(intSet62, intSet64, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet71 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = null;
        fuzzTest68.FuzzTest_add(intSet71, intSet73, (java.lang.Integer) (-1), false);
        fuzzTest50.FuzzTest_add(intSet62, intSet73, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet83 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        fuzzTest41.FuzzTest_add(intSet73, intSet83, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet90 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet90, intArray89);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet83, intSet90, (java.lang.Integer) 0, true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet12, intSet23, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = null;
        fuzzTest38.FuzzTest_add(intSet41, intSet43, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest47.FuzzTest_add(intSet50, intSet52, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest56.FuzzTest_add(intSet59, intSet61, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet68 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet70 = null;
        fuzzTest65.FuzzTest_add(intSet68, intSet70, (java.lang.Integer) (-1), false);
        fuzzTest47.FuzzTest_add(intSet59, intSet70, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet80 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        fuzzTest38.FuzzTest_add(intSet70, intSet80, (java.lang.Integer) 1, true);
        fuzzTest30.FuzzTest_add(intSet36, intSet70, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest88 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet91 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet91, intArray90);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet93 = null;
        fuzzTest88.FuzzTest_add(intSet91, intSet93, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet36, intSet91, (java.lang.Integer) 100, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet20 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest17.FuzzTest_add(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest26.FuzzTest_add(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet38 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest35.FuzzTest_add(intSet38, intSet40, (java.lang.Integer) (-1), false);
        fuzzTest17.FuzzTest_add(intSet29, intSet40, (java.lang.Integer) 1, false);
        fuzzTest9.FuzzTest_add(intSet15, intSet40, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet53 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet15, intSet53, (java.lang.Integer) 10, true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet4 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = null;
        fuzzTest1.FuzzTest_add(intSet4, intSet6, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest19.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest28.FuzzTest_add(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet40 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet42 = null;
        fuzzTest37.FuzzTest_add(intSet40, intSet42, (java.lang.Integer) (-1), false);
        fuzzTest19.FuzzTest_add(intSet31, intSet42, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest10.FuzzTest_add(intSet42, intSet52, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet4, intSet52, (java.lang.Integer) 10, false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest27.FuzzTest_add(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzzTest9.FuzzTest_add(intSet21, intSet32, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet42 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest0.FuzzTest_add(intSet32, intSet42, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, (-1), 1, 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10, 10, 1, 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet52, intSet59, (java.lang.Integer) 10, false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet14, intSet23, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = null;
        fuzzTest30.FuzzTest_add(intSet33, intSet35, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet42 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = null;
        fuzzTest39.FuzzTest_add(intSet42, intSet44, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet53 = null;
        fuzzTest48.FuzzTest_add(intSet51, intSet53, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet60 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = null;
        fuzzTest57.FuzzTest_add(intSet60, intSet62, (java.lang.Integer) (-1), false);
        fuzzTest39.FuzzTest_add(intSet51, intSet62, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet33, intSet51, (java.lang.Integer) 1, false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet25 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest27.FuzzTest_add(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = null;
        fuzzTest36.FuzzTest_add(intSet39, intSet41, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet48 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet50 = null;
        fuzzTest45.FuzzTest_add(intSet48, intSet50, (java.lang.Integer) (-1), false);
        fuzzTest27.FuzzTest_add(intSet39, intSet50, (java.lang.Integer) 1, false);
        fuzzTest19.FuzzTest_add(intSet25, intSet50, (java.lang.Integer) 100, false);
        fuzzTest9.FuzzTest_add(intSet15, intSet50, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet66 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet68 = null;
        fuzzTest63.FuzzTest_add(intSet66, intSet68, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 0, 10, (-1), (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet78 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        fuzzTest9.FuzzTest_add(intSet68, intSet78, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { (-1), (-1), 10, 1, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet89 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet78, intSet89, (java.lang.Integer) 1, false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet4 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = null;
        fuzzTest1.FuzzTest_add(intSet4, intSet6, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest19.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest28.FuzzTest_add(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet40 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet42 = null;
        fuzzTest37.FuzzTest_add(intSet40, intSet42, (java.lang.Integer) (-1), false);
        fuzzTest19.FuzzTest_add(intSet31, intSet42, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest10.FuzzTest_add(intSet42, intSet52, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet4, intSet52, (java.lang.Integer) 10, true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet7 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest27.FuzzTest_add(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = null;
        fuzzTest36.FuzzTest_add(intSet39, intSet41, (java.lang.Integer) (-1), false);
        fuzzTest18.FuzzTest_add(intSet30, intSet41, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzzTest9.FuzzTest_add(intSet41, intSet51, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intSet7, intSet41, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest59.FuzzTest_add(intSet62, intSet64, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet71 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = null;
        fuzzTest68.FuzzTest_add(intSet71, intSet73, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet80 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet82 = null;
        fuzzTest77.FuzzTest_add(intSet80, intSet82, (java.lang.Integer) (-1), false);
        fuzzTest59.FuzzTest_add(intSet71, intSet82, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet7, intSet71, (java.lang.Integer) 0, true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet4 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = null;
        fuzzTest1.FuzzTest_add(intSet4, intSet6, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet10, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet16 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest27.FuzzTest_add(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = null;
        fuzzTest36.FuzzTest_add(intSet39, intSet41, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet48 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet50 = null;
        fuzzTest45.FuzzTest_add(intSet48, intSet50, (java.lang.Integer) (-1), false);
        fuzzTest27.FuzzTest_add(intSet39, intSet50, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet60 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest18.FuzzTest_add(intSet50, intSet60, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet16, intSet60, (java.lang.Integer) 1, true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest19.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest28.FuzzTest_add(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzzTest10.FuzzTest_add(intSet22, intSet33, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_add(intSet9, intSet22, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet46 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet48 = null;
        fuzzTest43.FuzzTest_add(intSet46, intSet48, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet55 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = null;
        fuzzTest52.FuzzTest_add(intSet55, intSet57, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = null;
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet65 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet67 = null;
        fuzzTest62.FuzzTest_add(intSet65, intSet67, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet74 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet76 = null;
        fuzzTest71.FuzzTest_add(intSet74, intSet76, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet83 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet85 = null;
        fuzzTest80.FuzzTest_add(intSet83, intSet85, (java.lang.Integer) (-1), false);
        fuzzTest62.FuzzTest_add(intSet74, intSet85, (java.lang.Integer) 10, true);
        fuzzTest52.FuzzTest_add(intSet61, intSet74, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet46, intSet74, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        fuzzTest0.FuzzTest_add(intSet1, intSet5, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 0, (-1), 0, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest26.FuzzTest_add(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet38 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest35.FuzzTest_add(intSet38, intSet40, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet47 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest44.FuzzTest_add(intSet47, intSet49, (java.lang.Integer) (-1), false);
        fuzzTest26.FuzzTest_add(intSet38, intSet49, (java.lang.Integer) 1, false);
        fuzzTest18.FuzzTest_add(intSet24, intSet49, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest59.FuzzTest_add(intSet62, intSet64, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet71 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = null;
        fuzzTest68.FuzzTest_add(intSet71, intSet73, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet80 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet82 = null;
        fuzzTest77.FuzzTest_add(intSet80, intSet82, (java.lang.Integer) (-1), false);
        fuzzTest59.FuzzTest_add(intSet71, intSet82, (java.lang.Integer) 10, true);
        fuzzTest17.FuzzTest_add(intSet24, intSet82, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet15, intSet24, (java.lang.Integer) 0, true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet4 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = null;
        fuzzTest1.FuzzTest_add(intSet4, intSet6, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest19.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzzTest1.FuzzTest_add(intSet13, intSet24, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest31.FuzzTest_add(intSet34, intSet36, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = null;
        fuzzTest40.FuzzTest_add(intSet43, intSet45, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest49.FuzzTest_add(intSet52, intSet54, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet63 = null;
        fuzzTest58.FuzzTest_add(intSet61, intSet63, (java.lang.Integer) (-1), false);
        fuzzTest40.FuzzTest_add(intSet52, intSet63, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest31.FuzzTest_add(intSet63, intSet73, (java.lang.Integer) 1, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet78 = null;
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet82 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet84 = null;
        fuzzTest79.FuzzTest_add(intSet82, intSet84, (java.lang.Integer) (-1), false);
        fuzzTest31.FuzzTest_add(intSet78, intSet82, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet13, intSet82, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet18 = null;
        fuzzTest0.FuzzTest_add(intSet14, intSet18, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet25 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet27 = null;
        fuzzTest22.FuzzTest_add(intSet25, intSet27, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest32.FuzzTest_add(intSet35, intSet37, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet46 = null;
        fuzzTest41.FuzzTest_add(intSet44, intSet46, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet53 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest50.FuzzTest_add(intSet53, intSet55, (java.lang.Integer) (-1), false);
        fuzzTest32.FuzzTest_add(intSet44, intSet55, (java.lang.Integer) 10, true);
        fuzzTest22.FuzzTest_add(intSet31, intSet44, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet66 = null;
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet70 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        fuzzTest65.FuzzTest_add(intSet66, intSet70, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet44, intSet70, (java.lang.Integer) 1, false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet7 = null;
        fuzzTest2.FuzzTest_add(intSet5, intSet7, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet16 = null;
        fuzzTest11.FuzzTest_add(intSet14, intSet16, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest20.FuzzTest_add(intSet23, intSet25, (java.lang.Integer) (-1), false);
        fuzzTest2.FuzzTest_add(intSet14, intSet25, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_add(intSet1, intSet25, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet37 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet42 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = null;
        fuzzTest39.FuzzTest_add(intSet42, intSet44, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet53 = null;
        fuzzTest48.FuzzTest_add(intSet51, intSet53, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet60 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = null;
        fuzzTest57.FuzzTest_add(intSet60, intSet62, (java.lang.Integer) (-1), false);
        fuzzTest39.FuzzTest_add(intSet51, intSet62, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet37, intSet51, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet12, intSet23, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = null;
        fuzzTest38.FuzzTest_add(intSet41, intSet43, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest47.FuzzTest_add(intSet50, intSet52, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest56.FuzzTest_add(intSet59, intSet61, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet68 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet70 = null;
        fuzzTest65.FuzzTest_add(intSet68, intSet70, (java.lang.Integer) (-1), false);
        fuzzTest47.FuzzTest_add(intSet59, intSet70, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet80 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        fuzzTest38.FuzzTest_add(intSet70, intSet80, (java.lang.Integer) 1, true);
        fuzzTest30.FuzzTest_add(intSet36, intSet70, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 10, 0, 0, 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet93 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet93, intArray92);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet36, intSet93, (java.lang.Integer) 10, true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet12, intSet23, (java.lang.Integer) 1, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest31.FuzzTest_add(intSet34, intSet36, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = null;
        fuzzTest40.FuzzTest_add(intSet43, intSet45, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest49.FuzzTest_add(intSet52, intSet54, (java.lang.Integer) (-1), false);
        fuzzTest31.FuzzTest_add(intSet43, intSet54, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_add(intSet30, intSet54, (java.lang.Integer) 0, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet64 = null;
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet66 = null;
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet70 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        fuzzTest65.FuzzTest_add(intSet66, intSet70, (java.lang.Integer) 100, false);
        fuzzTest0.FuzzTest_add(intSet64, intSet66, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet80 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1, 10, 0, 0, 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet88 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet80, intSet88, (java.lang.Integer) 0, false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        fuzzTest0.FuzzTest_add(intSet1, intSet5, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest19.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest28.FuzzTest_add(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzzTest10.FuzzTest_add(intSet22, intSet33, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = null;
        fuzzTest40.FuzzTest_add(intSet43, intSet45, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet33, intSet43, (java.lang.Integer) 100, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet53 = null;
        fuzzTest0.FuzzTest_add(intSet52, intSet53, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet58 = null;
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest57.FuzzTest_add(intSet58, intSet62, (java.lang.Integer) 100, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet67 = null;
        fuzzTest0.FuzzTest_add(intSet58, intSet67, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet72 = null;
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet76 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        fuzzTest71.FuzzTest_add(intSet72, intSet76, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet84 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet76, intSet84, (java.lang.Integer) 10, true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        fuzzTest0.FuzzTest_add(intSet1, intSet5, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet16 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest27.FuzzTest_add(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = null;
        fuzzTest36.FuzzTest_add(intSet39, intSet41, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet48 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet50 = null;
        fuzzTest45.FuzzTest_add(intSet48, intSet50, (java.lang.Integer) (-1), false);
        fuzzTest27.FuzzTest_add(intSet39, intSet50, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet60 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest18.FuzzTest_add(intSet50, intSet60, (java.lang.Integer) 1, true);
        fuzzTest10.FuzzTest_add(intSet16, intSet50, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet69 = null;
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest68.FuzzTest_add(intSet69, intSet73, (java.lang.Integer) 100, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet78 = null;
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), (-1), 100, 100, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet85 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        fuzzTest68.FuzzTest_add(intSet78, intSet85, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet16, intSet85, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest27.FuzzTest_add(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzzTest9.FuzzTest_add(intSet21, intSet32, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet42 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest0.FuzzTest_add(intSet32, intSet42, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest47.FuzzTest_add(intSet50, intSet52, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest56.FuzzTest_add(intSet59, intSet61, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet52, intSet61, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-1), 0, 10, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet78 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet73, intSet78, (java.lang.Integer) 1, true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet12, intSet23, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet37 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = null;
        fuzzTest34.FuzzTest_add(intSet37, intSet39, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet46 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet48 = null;
        fuzzTest43.FuzzTest_add(intSet46, intSet48, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet55 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = null;
        fuzzTest52.FuzzTest_add(intSet55, intSet57, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet64 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet66 = null;
        fuzzTest61.FuzzTest_add(intSet64, intSet66, (java.lang.Integer) (-1), false);
        fuzzTest43.FuzzTest_add(intSet55, intSet66, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet76 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        fuzzTest34.FuzzTest_add(intSet66, intSet76, (java.lang.Integer) 1, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet81 = null;
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet85 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet87 = null;
        fuzzTest82.FuzzTest_add(intSet85, intSet87, (java.lang.Integer) (-1), false);
        fuzzTest34.FuzzTest_add(intSet81, intSet85, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet32, intSet85, (java.lang.Integer) 100, true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest19.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest28.FuzzTest_add(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzzTest10.FuzzTest_add(intSet22, intSet33, (java.lang.Integer) 1, false);
        fuzzTest2.FuzzTest_add(intSet8, intSet33, (java.lang.Integer) 100, false);
        fuzzTest0.FuzzTest_add(intSet1, intSet33, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = null;
        fuzzTest46.FuzzTest_add(intSet49, intSet51, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest0.FuzzTest_add(intSet49, intSet55, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, (-1), 100, 10, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet65 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet70 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest67.FuzzTest_add(intSet70, intSet72, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet79 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet81 = null;
        fuzzTest76.FuzzTest_add(intSet79, intSet81, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest85 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet88 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet90 = null;
        fuzzTest85.FuzzTest_add(intSet88, intSet90, (java.lang.Integer) (-1), false);
        fuzzTest67.FuzzTest_add(intSet79, intSet90, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet65, intSet79, (java.lang.Integer) 0, false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet4 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = null;
        fuzzTest1.FuzzTest_add(intSet4, intSet6, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest19.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest28.FuzzTest_add(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzzTest10.FuzzTest_add(intSet22, intSet33, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        fuzzTest1.FuzzTest_add(intSet33, intSet43, (java.lang.Integer) 1, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet48 = null;
        fuzzTest0.FuzzTest_add(intSet33, intSet48, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet55 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = null;
        fuzzTest52.FuzzTest_add(intSet55, intSet57, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet64 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet66 = null;
        fuzzTest61.FuzzTest_add(intSet64, intSet66, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet75 = null;
        fuzzTest70.FuzzTest_add(intSet73, intSet75, (java.lang.Integer) (-1), false);
        fuzzTest52.FuzzTest_add(intSet64, intSet75, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet84 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet64, intSet84, (java.lang.Integer) 1, false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet12, intSet23, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = null;
        fuzzTest38.FuzzTest_add(intSet41, intSet43, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest47.FuzzTest_add(intSet50, intSet52, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest56.FuzzTest_add(intSet59, intSet61, (java.lang.Integer) (-1), false);
        fuzzTest38.FuzzTest_add(intSet50, intSet61, (java.lang.Integer) 1, false);
        fuzzTest30.FuzzTest_add(intSet36, intSet61, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1, 1, (-1), 100, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet77 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet36, intSet77, (java.lang.Integer) 0, true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet12, intSet23, (java.lang.Integer) 1, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest31.FuzzTest_add(intSet34, intSet36, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = null;
        fuzzTest40.FuzzTest_add(intSet43, intSet45, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest49.FuzzTest_add(intSet52, intSet54, (java.lang.Integer) (-1), false);
        fuzzTest31.FuzzTest_add(intSet43, intSet54, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_add(intSet30, intSet54, (java.lang.Integer) 0, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet64 = null;
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet66 = null;
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet70 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        fuzzTest65.FuzzTest_add(intSet66, intSet70, (java.lang.Integer) 100, false);
        fuzzTest0.FuzzTest_add(intSet64, intSet66, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 1, 100, 0, 1, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet84 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 10, 10, 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet90 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet90, intArray89);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet84, intSet90, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        fuzzTest0.FuzzTest_add(intSet1, intSet5, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet20 = null;
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest19.FuzzTest_add(intSet20, intSet24, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = null;
        fuzzTest29.FuzzTest_add(intSet32, intSet34, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = null;
        fuzzTest38.FuzzTest_add(intSet41, intSet43, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest47.FuzzTest_add(intSet50, intSet52, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest56.FuzzTest_add(intSet59, intSet61, (java.lang.Integer) (-1), false);
        fuzzTest38.FuzzTest_add(intSet50, intSet61, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 1, 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet72 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet77 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet79 = null;
        fuzzTest74.FuzzTest_add(intSet77, intSet79, (java.lang.Integer) (-1), false);
        fuzzTest38.FuzzTest_add(intSet72, intSet79, (java.lang.Integer) 10, true);
        fuzzTest19.FuzzTest_add(intSet34, intSet72, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet13, intSet72, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet12, intSet23, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = null;
        fuzzTest30.FuzzTest_add(intSet33, intSet35, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet40 = null;
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzzTest39.FuzzTest_add(intSet40, intSet44, (java.lang.Integer) 100, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = null;
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), (-1), 100, 100, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet56 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        fuzzTest39.FuzzTest_add(intSet49, intSet56, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet33, intSet56, (java.lang.Integer) 0, true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        fuzzTest0.FuzzTest_add(intSet1, intSet5, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest19.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest28.FuzzTest_add(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzzTest10.FuzzTest_add(intSet22, intSet33, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = null;
        fuzzTest40.FuzzTest_add(intSet43, intSet45, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest49.FuzzTest_add(intSet52, intSet54, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet63 = null;
        fuzzTest58.FuzzTest_add(intSet61, intSet63, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet70 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest67.FuzzTest_add(intSet70, intSet72, (java.lang.Integer) (-1), false);
        fuzzTest49.FuzzTest_add(intSet61, intSet72, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet82 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        fuzzTest40.FuzzTest_add(intSet72, intSet82, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet22, intSet82, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet18 = null;
        fuzzTest0.FuzzTest_add(intSet14, intSet18, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest0.FuzzTest_add(intSet22, intSet23, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet30, intSet35, (java.lang.Integer) 100, false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet4 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet17 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet19 = null;
        fuzzTest14.FuzzTest_add(intSet17, intSet19, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet26 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet28 = null;
        fuzzTest23.FuzzTest_add(intSet26, intSet28, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest32.FuzzTest_add(intSet35, intSet37, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet46 = null;
        fuzzTest41.FuzzTest_add(intSet44, intSet46, (java.lang.Integer) (-1), false);
        fuzzTest23.FuzzTest_add(intSet35, intSet46, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet56 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        fuzzTest14.FuzzTest_add(intSet46, intSet56, (java.lang.Integer) 1, true);
        fuzzTest6.FuzzTest_add(intSet12, intSet46, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet4, intSet12, (java.lang.Integer) 1, true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest27.FuzzTest_add(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzzTest9.FuzzTest_add(intSet21, intSet32, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet42 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = null;
        fuzzTest39.FuzzTest_add(intSet42, intSet44, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet53 = null;
        fuzzTest48.FuzzTest_add(intSet51, intSet53, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet60 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = null;
        fuzzTest57.FuzzTest_add(intSet60, intSet62, (java.lang.Integer) (-1), false);
        fuzzTest39.FuzzTest_add(intSet51, intSet62, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, 1, 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet78 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet80 = null;
        fuzzTest75.FuzzTest_add(intSet78, intSet80, (java.lang.Integer) (-1), false);
        fuzzTest39.FuzzTest_add(intSet73, intSet80, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet21, intSet73, (java.lang.Integer) 10, false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet4 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = null;
        fuzzTest1.FuzzTest_add(intSet4, intSet6, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet10, (java.lang.Integer) 10, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet18 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest15.FuzzTest_add(intSet18, intSet20, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet27 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = null;
        fuzzTest24.FuzzTest_add(intSet27, intSet29, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet38 = null;
        fuzzTest33.FuzzTest_add(intSet36, intSet38, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet47 = null;
        fuzzTest42.FuzzTest_add(intSet45, intSet47, (java.lang.Integer) (-1), false);
        fuzzTest24.FuzzTest_add(intSet36, intSet47, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest15.FuzzTest_add(intSet47, intSet57, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intSet14, intSet57, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet66 = null;
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet70 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        fuzzTest65.FuzzTest_add(intSet66, intSet70, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet76 = null;
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet80 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        fuzzTest75.FuzzTest_add(intSet76, intSet80, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet70, intSet80, (java.lang.Integer) 100, false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet7 = null;
        fuzzTest2.FuzzTest_add(intSet5, intSet7, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet17 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest19.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest28.FuzzTest_add(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet40 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet42 = null;
        fuzzTest37.FuzzTest_add(intSet40, intSet42, (java.lang.Integer) (-1), false);
        fuzzTest19.FuzzTest_add(intSet31, intSet42, (java.lang.Integer) 1, false);
        fuzzTest11.FuzzTest_add(intSet17, intSet42, (java.lang.Integer) 100, false);
        fuzzTest1.FuzzTest_add(intSet7, intSet42, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest1.FuzzTest_add(intSet57, intSet59, (java.lang.Integer) 0, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet63 = null;
        fuzzTest0.FuzzTest_add(intSet57, intSet63, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet68 = null;
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet72 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest67.FuzzTest_add(intSet68, intSet72, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 1, 0, 0, 0, 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet83 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet72, intSet83, (java.lang.Integer) 10, false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet12, intSet23, (java.lang.Integer) 10, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        fuzzTest31.FuzzTest_add(intSet32, intSet36, (java.lang.Integer) 100, false);
        fuzzTest0.FuzzTest_add(intSet30, intSet36, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = null;
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzzTest44.FuzzTest_add(intSet45, intSet49, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest54.FuzzTest_add(intSet57, intSet59, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet66 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet68 = null;
        fuzzTest63.FuzzTest_add(intSet66, intSet68, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet75 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet77 = null;
        fuzzTest72.FuzzTest_add(intSet75, intSet77, (java.lang.Integer) (-1), false);
        fuzzTest54.FuzzTest_add(intSet66, intSet77, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet49, intSet66, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        fuzzTest0.FuzzTest_add(intSet1, intSet5, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1), (-1), 0, 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet17 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet25 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest27.FuzzTest_add(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = null;
        fuzzTest36.FuzzTest_add(intSet39, intSet41, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet48 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet50 = null;
        fuzzTest45.FuzzTest_add(intSet48, intSet50, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest54.FuzzTest_add(intSet57, intSet59, (java.lang.Integer) (-1), false);
        fuzzTest36.FuzzTest_add(intSet48, intSet59, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet69 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzzTest27.FuzzTest_add(intSet59, intSet69, (java.lang.Integer) 1, true);
        fuzzTest19.FuzzTest_add(intSet25, intSet59, (java.lang.Integer) (-1), true);
        fuzzTest10.FuzzTest_add(intSet17, intSet59, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 0, 100, 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet84 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet17, intSet84, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet4 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet9 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet11 = null;
        fuzzTest6.FuzzTest_add(intSet9, intSet11, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet18 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest15.FuzzTest_add(intSet18, intSet20, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet27 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = null;
        fuzzTest24.FuzzTest_add(intSet27, intSet29, (java.lang.Integer) (-1), false);
        fuzzTest6.FuzzTest_add(intSet18, intSet29, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet4, intSet18, (java.lang.Integer) 0, false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest27.FuzzTest_add(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzzTest9.FuzzTest_add(intSet21, intSet32, (java.lang.Integer) 10, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = null;
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest40.FuzzTest_add(intSet41, intSet45, (java.lang.Integer) 100, false);
        fuzzTest9.FuzzTest_add(intSet39, intSet45, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 100, 10, 100, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet45, intSet59, (java.lang.Integer) 0, false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest27.FuzzTest_add(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = null;
        fuzzTest36.FuzzTest_add(intSet39, intSet41, (java.lang.Integer) (-1), false);
        fuzzTest18.FuzzTest_add(intSet30, intSet41, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzzTest9.FuzzTest_add(intSet41, intSet51, (java.lang.Integer) 1, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet60 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = null;
        fuzzTest57.FuzzTest_add(intSet60, intSet62, (java.lang.Integer) (-1), false);
        fuzzTest9.FuzzTest_add(intSet56, intSet60, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet69 = null;
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10, 100, (-1), 1, 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet76 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        fuzzTest9.FuzzTest_add(intSet69, intSet76, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet84 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet86 = null;
        fuzzTest81.FuzzTest_add(intSet84, intSet86, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet76, intSet84, (java.lang.Integer) 0, true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        fuzzTest0.FuzzTest_add(intSet1, intSet5, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest19.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet28 = null;
        fuzzTest10.FuzzTest_add(intSet24, intSet28, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest10.FuzzTest_add(intSet32, intSet33, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet37 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet38 = null;
        fuzzTest10.FuzzTest_add(intSet37, intSet38, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = null;
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet47 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest42.FuzzTest_add(intSet43, intSet47, (java.lang.Integer) 100, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = null;
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), (-1), 100, 100, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest42.FuzzTest_add(intSet52, intSet59, (java.lang.Integer) 100, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest10.FuzzTest_add(intSet59, intSet64, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet69 = null;
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest68.FuzzTest_add(intSet69, intSet73, (java.lang.Integer) 100, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet78 = null;
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), (-1), 100, 100, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet85 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        fuzzTest68.FuzzTest_add(intSet78, intSet85, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet59, intSet85, (java.lang.Integer) 10, true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet4 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = null;
        fuzzTest1.FuzzTest_add(intSet4, intSet6, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest19.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest28.FuzzTest_add(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzzTest10.FuzzTest_add(intSet22, intSet33, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, 1, 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = null;
        fuzzTest46.FuzzTest_add(intSet49, intSet51, (java.lang.Integer) (-1), false);
        fuzzTest10.FuzzTest_add(intSet44, intSet51, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet63 = null;
        fuzzTest58.FuzzTest_add(intSet61, intSet63, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet68 = null;
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet72 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest67.FuzzTest_add(intSet68, intSet72, (java.lang.Integer) 100, false);
        fuzzTest10.FuzzTest_add(intSet61, intSet68, (java.lang.Integer) 0, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet80 = null;
        fuzzTest1.FuzzTest_add(intSet61, intSet80, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet85 = null;
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 0, 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet89 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        fuzzTest84.FuzzTest_add(intSet85, intSet89, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet61, intSet89, (java.lang.Integer) 10, false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet4 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = null;
        fuzzTest1.FuzzTest_add(intSet4, intSet6, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet10, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet19 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest14.FuzzTest_add(intSet15, intSet19, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet27 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = null;
        fuzzTest24.FuzzTest_add(intSet27, intSet29, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet38 = null;
        fuzzTest33.FuzzTest_add(intSet36, intSet38, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet47 = null;
        fuzzTest42.FuzzTest_add(intSet45, intSet47, (java.lang.Integer) (-1), false);
        fuzzTest24.FuzzTest_add(intSet36, intSet47, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest54.FuzzTest_add(intSet57, intSet59, (java.lang.Integer) (-1), false);
        fuzzTest14.FuzzTest_add(intSet47, intSet57, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 10, 100, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet71 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = null;
        fuzzTest14.FuzzTest_add(intSet71, intSet73, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet78 = null;
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet82 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        fuzzTest77.FuzzTest_add(intSet78, intSet82, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet71, intSet82, (java.lang.Integer) 10, true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet12, intSet23, (java.lang.Integer) 1, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest31.FuzzTest_add(intSet34, intSet36, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet30, intSet36, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = null;
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 0, 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet48 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        fuzzTest43.FuzzTest_add(intSet44, intSet48, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet56 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet58 = null;
        fuzzTest53.FuzzTest_add(intSet56, intSet58, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet65 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet67 = null;
        fuzzTest62.FuzzTest_add(intSet65, intSet67, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet74 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet76 = null;
        fuzzTest71.FuzzTest_add(intSet74, intSet76, (java.lang.Integer) (-1), false);
        fuzzTest53.FuzzTest_add(intSet65, intSet76, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet48, intSet65, (java.lang.Integer) 1, false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = null;
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = null;
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet16 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzzTest11.FuzzTest_add(intSet12, intSet16, (java.lang.Integer) 100, false);
        fuzzTest9.FuzzTest_add(intSet10, intSet16, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet27 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = null;
        fuzzTest24.FuzzTest_add(intSet27, intSet29, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet38 = null;
        fuzzTest33.FuzzTest_add(intSet36, intSet38, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet47 = null;
        fuzzTest42.FuzzTest_add(intSet45, intSet47, (java.lang.Integer) (-1), false);
        fuzzTest24.FuzzTest_add(intSet36, intSet47, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest54.FuzzTest_add(intSet57, intSet59, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet66 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet68 = null;
        fuzzTest63.FuzzTest_add(intSet66, intSet68, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet75 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet77 = null;
        fuzzTest72.FuzzTest_add(intSet75, intSet77, (java.lang.Integer) (-1), false);
        fuzzTest54.FuzzTest_add(intSet66, intSet77, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { (-1), (-1), (-1), (-1), (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet90 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet90, intArray89);
        fuzzTest24.FuzzTest_add(intSet77, intSet90, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet16, intSet90, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest20.FuzzTest_add(intSet23, intSet25, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = null;
        fuzzTest29.FuzzTest_add(intSet32, intSet34, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = null;
        fuzzTest38.FuzzTest_add(intSet41, intSet43, (java.lang.Integer) (-1), false);
        fuzzTest20.FuzzTest_add(intSet32, intSet43, (java.lang.Integer) 10, true);
        fuzzTest10.FuzzTest_add(intSet19, intSet32, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intSet9, intSet19, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = null;
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        fuzzTest56.FuzzTest_add(intSet57, intSet61, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, 10, 1, 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet71 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet61, intSet71, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet9 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet11 = null;
        fuzzTest6.FuzzTest_add(intSet9, intSet11, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet17 = null;
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        fuzzTest16.FuzzTest_add(intSet17, intSet21, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest26.FuzzTest_add(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet38 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest35.FuzzTest_add(intSet38, intSet40, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet47 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest44.FuzzTest_add(intSet47, intSet49, (java.lang.Integer) (-1), false);
        fuzzTest26.FuzzTest_add(intSet38, intSet49, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest56.FuzzTest_add(intSet59, intSet61, (java.lang.Integer) (-1), false);
        fuzzTest16.FuzzTest_add(intSet49, intSet59, (java.lang.Integer) 100, true);
        fuzzTest6.FuzzTest_add(intSet15, intSet59, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet74 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet76 = null;
        fuzzTest71.FuzzTest_add(intSet74, intSet76, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet59, intSet74, (java.lang.Integer) 10, false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { (-1), 10, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest12.FuzzTest_add(intSet13, intSet14, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet26 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest28.FuzzTest_add(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet40 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet42 = null;
        fuzzTest37.FuzzTest_add(intSet40, intSet42, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = null;
        fuzzTest46.FuzzTest_add(intSet49, intSet51, (java.lang.Integer) (-1), false);
        fuzzTest28.FuzzTest_add(intSet40, intSet51, (java.lang.Integer) 1, false);
        fuzzTest20.FuzzTest_add(intSet26, intSet51, (java.lang.Integer) 100, false);
        fuzzTest18.FuzzTest_add(intSet19, intSet26, (java.lang.Integer) 0, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest12.FuzzTest_add(intSet26, intSet64, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet10, intSet26, (java.lang.Integer) 10, false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        fuzzTest0.FuzzTest_add(intSet1, intSet5, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet11 = null;
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest10.FuzzTest_add(intSet11, intSet15, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest20.FuzzTest_add(intSet23, intSet25, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = null;
        fuzzTest29.FuzzTest_add(intSet32, intSet34, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = null;
        fuzzTest38.FuzzTest_add(intSet41, intSet43, (java.lang.Integer) (-1), false);
        fuzzTest20.FuzzTest_add(intSet32, intSet43, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet53 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest50.FuzzTest_add(intSet53, intSet55, (java.lang.Integer) (-1), false);
        fuzzTest10.FuzzTest_add(intSet43, intSet53, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 10, 100, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet67 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet69 = null;
        fuzzTest10.FuzzTest_add(intSet67, intSet69, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet76 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet67, intSet76, (java.lang.Integer) 1, true);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet4 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = null;
        fuzzTest1.FuzzTest_add(intSet4, intSet6, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet16 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest27.FuzzTest_add(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = null;
        fuzzTest36.FuzzTest_add(intSet39, intSet41, (java.lang.Integer) (-1), false);
        fuzzTest18.FuzzTest_add(intSet30, intSet41, (java.lang.Integer) 1, false);
        fuzzTest10.FuzzTest_add(intSet16, intSet41, (java.lang.Integer) 100, false);
        fuzzTest0.FuzzTest_add(intSet6, intSet41, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest54.FuzzTest_add(intSet57, intSet59, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet66 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet68 = null;
        fuzzTest63.FuzzTest_add(intSet66, intSet68, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet57, intSet68, (java.lang.Integer) 10, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet75 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet76 = null;
        fuzzTest0.FuzzTest_add(intSet75, intSet76, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet83 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet85 = null;
        fuzzTest80.FuzzTest_add(intSet83, intSet85, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet91 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet91, intArray90);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet83, intSet91, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet12, intSet23, (java.lang.Integer) 1, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest31.FuzzTest_add(intSet34, intSet36, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet30, intSet36, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet54 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet56 = null;
        fuzzTest51.FuzzTest_add(intSet54, intSet56, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet63 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet65 = null;
        fuzzTest60.FuzzTest_add(intSet63, intSet65, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet72 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet74 = null;
        fuzzTest69.FuzzTest_add(intSet72, intSet74, (java.lang.Integer) (-1), false);
        fuzzTest51.FuzzTest_add(intSet63, intSet74, (java.lang.Integer) 1, false);
        fuzzTest43.FuzzTest_add(intSet49, intSet74, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet85 = null;
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet89 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        fuzzTest84.FuzzTest_add(intSet85, intSet89, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet49, intSet89, (java.lang.Integer) 10, true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet12, intSet23, (java.lang.Integer) 10, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        fuzzTest31.FuzzTest_add(intSet32, intSet36, (java.lang.Integer) 100, false);
        fuzzTest0.FuzzTest_add(intSet30, intSet36, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = null;
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzzTest44.FuzzTest_add(intSet45, intSet49, (java.lang.Integer) 100, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest0.FuzzTest_add(intSet45, intSet54, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = null;
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = null;
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet65 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        fuzzTest60.FuzzTest_add(intSet61, intSet65, (java.lang.Integer) 100, false);
        fuzzTest58.FuzzTest_add(intSet59, intSet65, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1, 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet76 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet65, intSet76, (java.lang.Integer) 10, false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        fuzzTest0.FuzzTest_add(intSet1, intSet5, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest19.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest28.FuzzTest_add(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzzTest10.FuzzTest_add(intSet22, intSet33, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = null;
        fuzzTest40.FuzzTest_add(intSet43, intSet45, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet33, intSet43, (java.lang.Integer) 100, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet53 = null;
        fuzzTest0.FuzzTest_add(intSet52, intSet53, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet58 = null;
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest57.FuzzTest_add(intSet58, intSet62, (java.lang.Integer) 100, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet67 = null;
        fuzzTest0.FuzzTest_add(intSet58, intSet67, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet74 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet76 = null;
        fuzzTest71.FuzzTest_add(intSet74, intSet76, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet81 = null;
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 0, 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet85 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        fuzzTest80.FuzzTest_add(intSet81, intSet85, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet74, intSet85, (java.lang.Integer) 100, false);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        fuzzTest0.FuzzTest_add(intSet1, intSet5, (java.lang.Integer) 100, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = null;
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet16 = null;
        fuzzTest11.FuzzTest_add(intSet14, intSet16, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet10, intSet16, (java.lang.Integer) 100, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest0.FuzzTest_add(intSet23, intSet24, (java.lang.Integer) 10, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet28 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = null;
        fuzzTest0.FuzzTest_add(intSet28, intSet29, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet38 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest35.FuzzTest_add(intSet38, intSet40, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet47 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest44.FuzzTest_add(intSet47, intSet49, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet56 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet58 = null;
        fuzzTest53.FuzzTest_add(intSet56, intSet58, (java.lang.Integer) (-1), false);
        fuzzTest35.FuzzTest_add(intSet47, intSet58, (java.lang.Integer) 1, false);
        fuzzTest33.FuzzTest_add(intSet34, intSet58, (java.lang.Integer) 1, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet68 = null;
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet70 = null;
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet72 = null;
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet76 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        fuzzTest71.FuzzTest_add(intSet72, intSet76, (java.lang.Integer) 100, false);
        fuzzTest69.FuzzTest_add(intSet70, intSet76, (java.lang.Integer) 1, false);
        fuzzTest33.FuzzTest_add(intSet68, intSet76, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest87 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet90 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet90, intArray89);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet92 = null;
        fuzzTest87.FuzzTest_add(intSet90, intSet92, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet76, intSet90, (java.lang.Integer) 0, false);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet12, intSet23, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 1, 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = null;
        fuzzTest36.FuzzTest_add(intSet39, intSet41, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet34, intSet41, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = null;
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet53 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        fuzzTest48.FuzzTest_add(intSet49, intSet53, (java.lang.Integer) 100, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet58 = null;
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), (-1), 100, 100, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet65 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        fuzzTest48.FuzzTest_add(intSet58, intSet65, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1, (-1), 1, 1, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet76 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet65, intSet76, (java.lang.Integer) 0, true);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_add(intSet1, intSet2, (java.lang.Integer) 0, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet7 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet7, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = null;
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet16 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzzTest11.FuzzTest_add(intSet12, intSet16, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet26 = null;
        fuzzTest21.FuzzTest_add(intSet24, intSet26, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = null;
        fuzzTest30.FuzzTest_add(intSet33, intSet35, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet42 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = null;
        fuzzTest39.FuzzTest_add(intSet42, intSet44, (java.lang.Integer) (-1), false);
        fuzzTest21.FuzzTest_add(intSet33, intSet44, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 0, 1, 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet55 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet60 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = null;
        fuzzTest57.FuzzTest_add(intSet60, intSet62, (java.lang.Integer) (-1), false);
        fuzzTest21.FuzzTest_add(intSet55, intSet62, (java.lang.Integer) 10, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet69 = null;
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet75 = null;
        fuzzTest70.FuzzTest_add(intSet73, intSet75, (java.lang.Integer) (-1), false);
        fuzzTest21.FuzzTest_add(intSet69, intSet73, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet16, intSet73, (java.lang.Integer) 100, true);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet18 = null;
        fuzzTest0.FuzzTest_add(intSet14, intSet18, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest0.FuzzTest_add(intSet22, intSet23, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = null;
        fuzzTest36.FuzzTest_add(intSet39, intSet41, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet48 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet50 = null;
        fuzzTest45.FuzzTest_add(intSet48, intSet50, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest54.FuzzTest_add(intSet57, intSet59, (java.lang.Integer) (-1), false);
        fuzzTest36.FuzzTest_add(intSet48, intSet59, (java.lang.Integer) 1, false);
        fuzzTest28.FuzzTest_add(intSet34, intSet59, (java.lang.Integer) 100, false);
        fuzzTest0.FuzzTest_add(intSet27, intSet59, (java.lang.Integer) 0, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet72 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = null;
        fuzzTest0.FuzzTest_add(intSet72, intSet73, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 0, 10, 1, 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet82 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet85 = null;
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet89 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        fuzzTest84.FuzzTest_add(intSet85, intSet89, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet82, intSet89, (java.lang.Integer) 0, false);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet14, intSet23, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = null;
        fuzzTest30.FuzzTest_add(intSet33, intSet35, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet40 = null;
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzzTest39.FuzzTest_add(intSet40, intSet44, (java.lang.Integer) 100, false);
        fuzzTest0.FuzzTest_add(intSet35, intSet40, (java.lang.Integer) 10, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet53 = null;
        fuzzTest0.FuzzTest_add(intSet52, intSet53, (java.lang.Integer) 1, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet58 = null;
        fuzzTest0.FuzzTest_add(intSet57, intSet58, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet65 = null;
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet69 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzzTest64.FuzzTest_add(intSet65, intSet69, (java.lang.Integer) 100, false);
        fuzzTest62.FuzzTest_add(intSet63, intSet69, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet78 = null;
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet82 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        fuzzTest77.FuzzTest_add(intSet78, intSet82, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet69, intSet82, (java.lang.Integer) 100, false);
    }
}

