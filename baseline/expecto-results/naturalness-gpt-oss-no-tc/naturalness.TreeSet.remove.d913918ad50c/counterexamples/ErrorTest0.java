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
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet7 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (java.lang.Integer) 1, true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet11 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        naturalness.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest8.FuzzTest_remove(intSet11, intSet13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet20 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        naturalness.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest17.FuzzTest_remove(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet29 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        naturalness.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest26.FuzzTest_remove(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet38 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        naturalness.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest35.FuzzTest_remove(intSet38, intSet40, (java.lang.Integer) (-1), false);
        fuzzTest17.FuzzTest_remove(intSet29, intSet40, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet50 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest8.FuzzTest_remove(intSet40, intSet50, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_remove(intSet6, intSet40, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet61 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        naturalness.TreeSet<java.lang.Integer> intSet63 = null;
        fuzzTest58.FuzzTest_remove(intSet61, intSet63, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet70 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        naturalness.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest67.FuzzTest_remove(intSet70, intSet72, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet79 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        naturalness.TreeSet<java.lang.Integer> intSet81 = null;
        fuzzTest76.FuzzTest_remove(intSet79, intSet81, (java.lang.Integer) (-1), false);
        fuzzTest58.FuzzTest_remove(intSet70, intSet81, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 100, 1, 1, (-1), 100 };
        naturalness.TreeSet<java.lang.Integer> intSet94 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet94, intArray93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet70, intSet94, (java.lang.Integer) 0, true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet7 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet12 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        naturalness.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_remove(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet21 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        naturalness.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_remove(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet30 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        naturalness.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest27.FuzzTest_remove(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzzTest9.FuzzTest_remove(intSet21, intSet32, (java.lang.Integer) 1, false);
        fuzzTest1.FuzzTest_remove(intSet7, intSet32, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        naturalness.TreeSet<java.lang.Integer> intSet44 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet52 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet57 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        naturalness.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest54.FuzzTest_remove(intSet57, intSet59, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet66 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        naturalness.TreeSet<java.lang.Integer> intSet68 = null;
        fuzzTest63.FuzzTest_remove(intSet66, intSet68, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet75 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        naturalness.TreeSet<java.lang.Integer> intSet77 = null;
        fuzzTest72.FuzzTest_remove(intSet75, intSet77, (java.lang.Integer) (-1), false);
        fuzzTest54.FuzzTest_remove(intSet66, intSet77, (java.lang.Integer) 1, false);
        fuzzTest46.FuzzTest_remove(intSet52, intSet77, (java.lang.Integer) 100, false);
        fuzzTest1.FuzzTest_remove(intSet44, intSet52, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 0, (-1), 100, 10 };
        naturalness.TreeSet<java.lang.Integer> intSet95 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet95, intArray94);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet52, intSet95, (java.lang.Integer) 10, true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_remove(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet12 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        naturalness.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_remove(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet21 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        naturalness.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_remove(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet30 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        naturalness.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest27.FuzzTest_remove(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzzTest9.FuzzTest_remove(intSet21, intSet32, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet42 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest0.FuzzTest_remove(intSet32, intSet42, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet50 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        naturalness.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest47.FuzzTest_remove(intSet50, intSet52, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet58 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet50, intSet58, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet4 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        naturalness.TreeSet<java.lang.Integer> intSet6 = null;
        fuzzTest1.FuzzTest_remove(intSet4, intSet6, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet13 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        naturalness.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_remove(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet22 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        naturalness.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest19.FuzzTest_remove(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzzTest1.FuzzTest_remove(intSet13, intSet24, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet37 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet42 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        naturalness.TreeSet<java.lang.Integer> intSet44 = null;
        fuzzTest39.FuzzTest_remove(intSet42, intSet44, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet51 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        naturalness.TreeSet<java.lang.Integer> intSet53 = null;
        fuzzTest48.FuzzTest_remove(intSet51, intSet53, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet60 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        naturalness.TreeSet<java.lang.Integer> intSet62 = null;
        fuzzTest57.FuzzTest_remove(intSet60, intSet62, (java.lang.Integer) (-1), false);
        fuzzTest39.FuzzTest_remove(intSet51, intSet62, (java.lang.Integer) 1, false);
        fuzzTest31.FuzzTest_remove(intSet37, intSet62, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet13, intSet37, (java.lang.Integer) 1, true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_remove(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet15 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet20 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        naturalness.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest17.FuzzTest_remove(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet29 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        naturalness.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest26.FuzzTest_remove(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet38 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        naturalness.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest35.FuzzTest_remove(intSet38, intSet40, (java.lang.Integer) (-1), false);
        fuzzTest17.FuzzTest_remove(intSet29, intSet40, (java.lang.Integer) 1, false);
        fuzzTest9.FuzzTest_remove(intSet15, intSet40, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet56 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet61 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        naturalness.TreeSet<java.lang.Integer> intSet63 = null;
        fuzzTest58.FuzzTest_remove(intSet61, intSet63, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet70 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        naturalness.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest67.FuzzTest_remove(intSet70, intSet72, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet79 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        naturalness.TreeSet<java.lang.Integer> intSet81 = null;
        fuzzTest76.FuzzTest_remove(intSet79, intSet81, (java.lang.Integer) (-1), false);
        fuzzTest58.FuzzTest_remove(intSet70, intSet81, (java.lang.Integer) 1, false);
        fuzzTest50.FuzzTest_remove(intSet56, intSet81, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet15, intSet56, (java.lang.Integer) 100, true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet5 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        naturalness.TreeSet<java.lang.Integer> intSet7 = null;
        fuzzTest2.FuzzTest_remove(intSet5, intSet7, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet14 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        naturalness.TreeSet<java.lang.Integer> intSet16 = null;
        fuzzTest11.FuzzTest_remove(intSet14, intSet16, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet23 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        naturalness.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest20.FuzzTest_remove(intSet23, intSet25, (java.lang.Integer) (-1), false);
        fuzzTest2.FuzzTest_remove(intSet14, intSet25, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_remove(intSet1, intSet25, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet38 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        naturalness.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest35.FuzzTest_remove(intSet38, intSet40, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet47 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        naturalness.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest44.FuzzTest_remove(intSet47, intSet49, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet56 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        naturalness.TreeSet<java.lang.Integer> intSet58 = null;
        fuzzTest53.FuzzTest_remove(intSet56, intSet58, (java.lang.Integer) (-1), false);
        fuzzTest35.FuzzTest_remove(intSet47, intSet58, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, (-1), 1 };
        naturalness.TreeSet<java.lang.Integer> intSet69 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1 };
        naturalness.TreeSet<java.lang.Integer> intSet73 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest35.FuzzTest_remove(intSet69, intSet73, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1), (-1), (-1), 1 };
        naturalness.TreeSet<java.lang.Integer> intSet83 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet69, intSet83, (java.lang.Integer) 10, true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest3.FuzzTest_remove(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet15 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        naturalness.TreeSet<java.lang.Integer> intSet17 = null;
        fuzzTest12.FuzzTest_remove(intSet15, intSet17, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet24 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        naturalness.TreeSet<java.lang.Integer> intSet26 = null;
        fuzzTest21.FuzzTest_remove(intSet24, intSet26, (java.lang.Integer) (-1), false);
        fuzzTest3.FuzzTest_remove(intSet15, intSet26, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, (-1), 1 };
        naturalness.TreeSet<java.lang.Integer> intSet37 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1 };
        naturalness.TreeSet<java.lang.Integer> intSet41 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzzTest3.FuzzTest_remove(intSet37, intSet41, (java.lang.Integer) 10, false);
        fuzzTest1.FuzzTest_remove(intSet2, intSet37, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10, (-1), 10, 10 };
        naturalness.TreeSet<java.lang.Integer> intSet54 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet37, intSet54, (java.lang.Integer) 0, true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_remove(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet12 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        naturalness.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_remove(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet21 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        naturalness.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_remove(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_remove(intSet12, intSet23, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 10, 0, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet35 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet40 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        naturalness.TreeSet<java.lang.Integer> intSet42 = null;
        fuzzTest37.FuzzTest_remove(intSet40, intSet42, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet49 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        naturalness.TreeSet<java.lang.Integer> intSet51 = null;
        fuzzTest46.FuzzTest_remove(intSet49, intSet51, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet58 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        naturalness.TreeSet<java.lang.Integer> intSet60 = null;
        fuzzTest55.FuzzTest_remove(intSet58, intSet60, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet67 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        naturalness.TreeSet<java.lang.Integer> intSet69 = null;
        fuzzTest64.FuzzTest_remove(intSet67, intSet69, (java.lang.Integer) (-1), false);
        fuzzTest46.FuzzTest_remove(intSet58, intSet69, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet79 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        fuzzTest37.FuzzTest_remove(intSet69, intSet79, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet35, intSet79, (java.lang.Integer) 1, true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet5 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        naturalness.TreeSet<java.lang.Integer> intSet7 = null;
        fuzzTest2.FuzzTest_remove(intSet5, intSet7, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet14 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        naturalness.TreeSet<java.lang.Integer> intSet16 = null;
        fuzzTest11.FuzzTest_remove(intSet14, intSet16, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet23 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        naturalness.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest20.FuzzTest_remove(intSet23, intSet25, (java.lang.Integer) (-1), false);
        fuzzTest2.FuzzTest_remove(intSet14, intSet25, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_remove(intSet1, intSet25, (java.lang.Integer) 100, false);
        naturalness.TreeSet<java.lang.Integer> intSet35 = null;
        naturalness.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest0.FuzzTest_remove(intSet35, intSet36, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet46 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet51 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        naturalness.TreeSet<java.lang.Integer> intSet53 = null;
        fuzzTest48.FuzzTest_remove(intSet51, intSet53, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet60 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        naturalness.TreeSet<java.lang.Integer> intSet62 = null;
        fuzzTest57.FuzzTest_remove(intSet60, intSet62, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet69 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        naturalness.TreeSet<java.lang.Integer> intSet71 = null;
        fuzzTest66.FuzzTest_remove(intSet69, intSet71, (java.lang.Integer) (-1), false);
        fuzzTest48.FuzzTest_remove(intSet60, intSet71, (java.lang.Integer) 1, false);
        fuzzTest40.FuzzTest_remove(intSet46, intSet71, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        naturalness.TreeSet<java.lang.Integer> intSet83 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet46, intSet83, (java.lang.Integer) 100, true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_remove(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet12 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        naturalness.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_remove(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet21 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        naturalness.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_remove(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_remove(intSet12, intSet23, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet33 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        naturalness.TreeSet<java.lang.Integer> intSet35 = null;
        fuzzTest30.FuzzTest_remove(intSet33, intSet35, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet42 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        naturalness.TreeSet<java.lang.Integer> intSet44 = null;
        fuzzTest39.FuzzTest_remove(intSet42, intSet44, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet51 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        naturalness.TreeSet<java.lang.Integer> intSet53 = null;
        fuzzTest48.FuzzTest_remove(intSet51, intSet53, (java.lang.Integer) (-1), false);
        fuzzTest30.FuzzTest_remove(intSet42, intSet53, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, (-1), 1 };
        naturalness.TreeSet<java.lang.Integer> intSet64 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1 };
        naturalness.TreeSet<java.lang.Integer> intSet68 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        fuzzTest30.FuzzTest_remove(intSet64, intSet68, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet76 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet68, intSet76, (java.lang.Integer) 10, true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_remove(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet12 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        naturalness.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_remove(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet21 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        naturalness.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_remove(intSet21, intSet23, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet12, intSet21, (java.lang.Integer) 0, true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet4 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        naturalness.TreeSet<java.lang.Integer> intSet6 = null;
        fuzzTest1.FuzzTest_remove(intSet4, intSet6, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet13 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        naturalness.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_remove(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet22 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        naturalness.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest19.FuzzTest_remove(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzzTest1.FuzzTest_remove(intSet13, intSet24, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet34 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        naturalness.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest31.FuzzTest_remove(intSet34, intSet36, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet43 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        naturalness.TreeSet<java.lang.Integer> intSet45 = null;
        fuzzTest40.FuzzTest_remove(intSet43, intSet45, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet52 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        naturalness.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest49.FuzzTest_remove(intSet52, intSet54, (java.lang.Integer) (-1), false);
        fuzzTest31.FuzzTest_remove(intSet43, intSet54, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, (-1), 1 };
        naturalness.TreeSet<java.lang.Integer> intSet65 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1 };
        naturalness.TreeSet<java.lang.Integer> intSet69 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzzTest31.FuzzTest_remove(intSet65, intSet69, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet13, intSet65, (java.lang.Integer) 0, true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_remove(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet12 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        naturalness.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_remove(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet21 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        naturalness.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_remove(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet30 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        naturalness.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest27.FuzzTest_remove(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzzTest9.FuzzTest_remove(intSet21, intSet32, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet42 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest0.FuzzTest_remove(intSet32, intSet42, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet50 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        naturalness.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest47.FuzzTest_remove(intSet50, intSet52, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet59 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        naturalness.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest56.FuzzTest_remove(intSet59, intSet61, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_remove(intSet52, intSet61, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { (-1), (-1), 100 };
        naturalness.TreeSet<java.lang.Integer> intSet72 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet77 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        naturalness.TreeSet<java.lang.Integer> intSet79 = null;
        fuzzTest74.FuzzTest_remove(intSet77, intSet79, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet72, intSet77, (java.lang.Integer) 0, true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet5 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        naturalness.TreeSet<java.lang.Integer> intSet7 = null;
        fuzzTest2.FuzzTest_remove(intSet5, intSet7, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet14 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        naturalness.TreeSet<java.lang.Integer> intSet16 = null;
        fuzzTest11.FuzzTest_remove(intSet14, intSet16, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet23 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        naturalness.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest20.FuzzTest_remove(intSet23, intSet25, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet32 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        naturalness.TreeSet<java.lang.Integer> intSet34 = null;
        fuzzTest29.FuzzTest_remove(intSet32, intSet34, (java.lang.Integer) (-1), false);
        fuzzTest11.FuzzTest_remove(intSet23, intSet34, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet44 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzzTest2.FuzzTest_remove(intSet34, intSet44, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet52 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        naturalness.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest49.FuzzTest_remove(intSet52, intSet54, (java.lang.Integer) (-1), false);
        fuzzTest1.FuzzTest_remove(intSet44, intSet52, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet64 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        naturalness.TreeSet<java.lang.Integer> intSet66 = null;
        fuzzTest61.FuzzTest_remove(intSet64, intSet66, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet73 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        naturalness.TreeSet<java.lang.Integer> intSet75 = null;
        fuzzTest70.FuzzTest_remove(intSet73, intSet75, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet82 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        naturalness.TreeSet<java.lang.Integer> intSet84 = null;
        fuzzTest79.FuzzTest_remove(intSet82, intSet84, (java.lang.Integer) (-1), false);
        fuzzTest61.FuzzTest_remove(intSet73, intSet84, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet52, intSet73, (java.lang.Integer) 100, true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet5 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        naturalness.TreeSet<java.lang.Integer> intSet7 = null;
        fuzzTest2.FuzzTest_remove(intSet5, intSet7, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet14 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        naturalness.TreeSet<java.lang.Integer> intSet16 = null;
        fuzzTest11.FuzzTest_remove(intSet14, intSet16, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet23 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        naturalness.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest20.FuzzTest_remove(intSet23, intSet25, (java.lang.Integer) (-1), false);
        fuzzTest2.FuzzTest_remove(intSet14, intSet25, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_remove(intSet1, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet38 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        naturalness.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest35.FuzzTest_remove(intSet38, intSet40, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet47 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        naturalness.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest44.FuzzTest_remove(intSet47, intSet49, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet56 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        naturalness.TreeSet<java.lang.Integer> intSet58 = null;
        fuzzTest53.FuzzTest_remove(intSet56, intSet58, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet65 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        naturalness.TreeSet<java.lang.Integer> intSet67 = null;
        fuzzTest62.FuzzTest_remove(intSet65, intSet67, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet74 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        naturalness.TreeSet<java.lang.Integer> intSet76 = null;
        fuzzTest71.FuzzTest_remove(intSet74, intSet76, (java.lang.Integer) (-1), false);
        fuzzTest53.FuzzTest_remove(intSet65, intSet76, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 0, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet86 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        fuzzTest44.FuzzTest_remove(intSet76, intSet86, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet38, intSet86, (java.lang.Integer) 100, true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet5 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        naturalness.TreeSet<java.lang.Integer> intSet7 = null;
        fuzzTest2.FuzzTest_remove(intSet5, intSet7, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet14 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        naturalness.TreeSet<java.lang.Integer> intSet16 = null;
        fuzzTest11.FuzzTest_remove(intSet14, intSet16, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet23 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        naturalness.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest20.FuzzTest_remove(intSet23, intSet25, (java.lang.Integer) (-1), false);
        fuzzTest2.FuzzTest_remove(intSet14, intSet25, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_remove(intSet1, intSet25, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet40 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        naturalness.TreeSet<java.lang.Integer> intSet42 = null;
        fuzzTest37.FuzzTest_remove(intSet40, intSet42, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet49 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        naturalness.TreeSet<java.lang.Integer> intSet51 = null;
        fuzzTest46.FuzzTest_remove(intSet49, intSet51, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet58 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        naturalness.TreeSet<java.lang.Integer> intSet60 = null;
        fuzzTest55.FuzzTest_remove(intSet58, intSet60, (java.lang.Integer) (-1), false);
        fuzzTest37.FuzzTest_remove(intSet49, intSet60, (java.lang.Integer) 1, false);
        fuzzTest35.FuzzTest_remove(intSet36, intSet49, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet70 = null;
        fuzzTest0.FuzzTest_remove(intSet49, intSet70, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet76 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10, 10, 1, 100, 0 };
        naturalness.TreeSet<java.lang.Integer> intSet84 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet76, intSet84, (java.lang.Integer) 0, true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_remove(intSet3, intSet5, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet9 = null;
        naturalness.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest0.FuzzTest_remove(intSet9, intSet10, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet18 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        naturalness.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest15.FuzzTest_remove(intSet18, intSet20, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet27 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        naturalness.TreeSet<java.lang.Integer> intSet29 = null;
        fuzzTest24.FuzzTest_remove(intSet27, intSet29, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet36 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        naturalness.TreeSet<java.lang.Integer> intSet38 = null;
        fuzzTest33.FuzzTest_remove(intSet36, intSet38, (java.lang.Integer) (-1), false);
        fuzzTest15.FuzzTest_remove(intSet27, intSet38, (java.lang.Integer) 1, false);
        naturalness.TreeSet<java.lang.Integer> intSet45 = null;
        fuzzTest14.FuzzTest_remove(intSet27, intSet45, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet52 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        naturalness.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest49.FuzzTest_remove(intSet52, intSet54, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet60 = null;
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet64 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        naturalness.TreeSet<java.lang.Integer> intSet66 = null;
        fuzzTest61.FuzzTest_remove(intSet64, intSet66, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet73 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        naturalness.TreeSet<java.lang.Integer> intSet75 = null;
        fuzzTest70.FuzzTest_remove(intSet73, intSet75, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet82 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        naturalness.TreeSet<java.lang.Integer> intSet84 = null;
        fuzzTest79.FuzzTest_remove(intSet82, intSet84, (java.lang.Integer) (-1), false);
        fuzzTest61.FuzzTest_remove(intSet73, intSet84, (java.lang.Integer) 1, false);
        fuzzTest59.FuzzTest_remove(intSet60, intSet73, (java.lang.Integer) (-1), false);
        fuzzTest49.FuzzTest_remove(intSet58, intSet73, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet27, intSet73, (java.lang.Integer) 1, true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet3 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        naturalness.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_remove(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        naturalness.TreeSet<java.lang.Integer> intSet12 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet17 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        naturalness.TreeSet<java.lang.Integer> intSet19 = null;
        fuzzTest14.FuzzTest_remove(intSet17, intSet19, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet26 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        naturalness.TreeSet<java.lang.Integer> intSet28 = null;
        fuzzTest23.FuzzTest_remove(intSet26, intSet28, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet35 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        naturalness.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest32.FuzzTest_remove(intSet35, intSet37, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet44 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        naturalness.TreeSet<java.lang.Integer> intSet46 = null;
        fuzzTest41.FuzzTest_remove(intSet44, intSet46, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet53 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        naturalness.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest50.FuzzTest_remove(intSet53, intSet55, (java.lang.Integer) (-1), false);
        fuzzTest32.FuzzTest_remove(intSet44, intSet55, (java.lang.Integer) 1, false);
        fuzzTest14.FuzzTest_remove(intSet28, intSet44, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 100, 0 };
        naturalness.TreeSet<java.lang.Integer> intSet69 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        naturalness.TreeSet<java.lang.Integer> intSet71 = null;
        fuzzTest14.FuzzTest_remove(intSet69, intSet71, (java.lang.Integer) 1, true);
        fuzzTest9.FuzzTest_remove(intSet12, intSet69, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0, 10, 1, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet83 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet69, intSet83, (java.lang.Integer) 1, true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet11 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        naturalness.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest8.FuzzTest_remove(intSet11, intSet13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet20 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        naturalness.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest17.FuzzTest_remove(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet29 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        naturalness.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest26.FuzzTest_remove(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzzTest8.FuzzTest_remove(intSet20, intSet31, (java.lang.Integer) 1, false);
        fuzzTest6.FuzzTest_remove(intSet7, intSet31, (java.lang.Integer) 1, true);
        naturalness.TreeSet<java.lang.Integer> intSet41 = null;
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet45 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        naturalness.TreeSet<java.lang.Integer> intSet47 = null;
        fuzzTest42.FuzzTest_remove(intSet45, intSet47, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet51 = null;
        naturalness.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest42.FuzzTest_remove(intSet51, intSet52, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0 };
        naturalness.TreeSet<java.lang.Integer> intSet58 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet63 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        naturalness.TreeSet<java.lang.Integer> intSet65 = null;
        fuzzTest60.FuzzTest_remove(intSet63, intSet65, (java.lang.Integer) (-1), false);
        fuzzTest42.FuzzTest_remove(intSet58, intSet65, (java.lang.Integer) 10, false);
        fuzzTest6.FuzzTest_remove(intSet41, intSet58, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet78 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        naturalness.TreeSet<java.lang.Integer> intSet80 = null;
        fuzzTest75.FuzzTest_remove(intSet78, intSet80, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet58, intSet78, (java.lang.Integer) 1, true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest3.FuzzTest_remove(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet15 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        naturalness.TreeSet<java.lang.Integer> intSet17 = null;
        fuzzTest12.FuzzTest_remove(intSet15, intSet17, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet24 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        naturalness.TreeSet<java.lang.Integer> intSet26 = null;
        fuzzTest21.FuzzTest_remove(intSet24, intSet26, (java.lang.Integer) (-1), false);
        fuzzTest3.FuzzTest_remove(intSet15, intSet26, (java.lang.Integer) 1, false);
        fuzzTest1.FuzzTest_remove(intSet2, intSet26, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1 };
        naturalness.TreeSet<java.lang.Integer> intSet38 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        naturalness.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest1.FuzzTest_remove(intSet38, intSet40, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet47 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        naturalness.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest44.FuzzTest_remove(intSet47, intSet49, (java.lang.Integer) (-1), false);
        naturalness.TreeSet<java.lang.Integer> intSet53 = null;
        fuzzTest1.FuzzTest_remove(intSet47, intSet53, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet61 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        naturalness.TreeSet<java.lang.Integer> intSet63 = null;
        fuzzTest58.FuzzTest_remove(intSet61, intSet63, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet70 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        naturalness.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest67.FuzzTest_remove(intSet70, intSet72, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        naturalness.TreeSet<java.lang.Integer> intSet79 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        naturalness.TreeSet<java.lang.Integer> intSet81 = null;
        fuzzTest76.FuzzTest_remove(intSet79, intSet81, (java.lang.Integer) (-1), false);
        fuzzTest58.FuzzTest_remove(intSet70, intSet81, (java.lang.Integer) 1, false);
        naturalness.TreeSet<java.lang.Integer> intSet88 = null;
        fuzzTest57.FuzzTest_remove(intSet70, intSet88, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet47, intSet70, (java.lang.Integer) 100, true);
    }
}

