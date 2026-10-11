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
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (java.lang.Integer) 1, true);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet16 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_add(intSet16, intSet20, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intSet12, intSet20, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10, 10, (-1) };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet32 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet36 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet32, intSet36, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet5 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzzTest2.FuzzTest_add(intSet5, intSet9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intSet1, intSet5, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 100, (-1), 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        fuzzTest24.FuzzTest_add(intSet27, intSet31, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet39 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet43 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        fuzzTest36.FuzzTest_add(intSet39, intSet43, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet51 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet55 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        fuzzTest48.FuzzTest_add(intSet51, intSet55, (java.lang.Integer) 1, true);
        fuzzTest24.FuzzTest_add(intSet43, intSet55, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet66 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet70 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        fuzzTest63.FuzzTest_add(intSet66, intSet70, (java.lang.Integer) 1, true);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet75 = null;
        fuzzTest24.FuzzTest_add(intSet70, intSet75, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet22, intSet70, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet5 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzzTest2.FuzzTest_add(intSet5, intSet9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intSet1, intSet5, (java.lang.Integer) 10, true);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet17 = null;
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet18 = null;
        fuzzTest0.FuzzTest_add(intSet17, intSet18, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet25 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet29 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        fuzzTest22.FuzzTest_add(intSet25, intSet29, (java.lang.Integer) 1, true);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet42 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest35.FuzzTest_add(intSet38, intSet42, (java.lang.Integer) 1, true);
        fuzzTest22.FuzzTest_add(intSet34, intSet42, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, (-1), 100, 10, 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet56 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet42, intSet56, (java.lang.Integer) 10, true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet19 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_add(intSet15, intSet19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzzTest0.FuzzTest_add(intSet19, intSet27, (java.lang.Integer) 1, true);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest0.FuzzTest_add(intSet32, intSet33, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10, 0 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet40 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet47 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet51 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzzTest44.FuzzTest_add(intSet47, intSet51, (java.lang.Integer) 1, true);
        fuzzTest42.FuzzTest_add(intSet43, intSet47, (java.lang.Integer) 10, true);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet59 = null;
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet63 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet67 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzzTest60.FuzzTest_add(intSet63, intSet67, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet75 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet79 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        fuzzTest72.FuzzTest_add(intSet75, intSet79, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet87 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        fuzzTest60.FuzzTest_add(intSet79, intSet87, (java.lang.Integer) 1, true);
        fuzzTest42.FuzzTest_add(intSet59, intSet79, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet40, intSet79, (java.lang.Integer) 10, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet19 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_add(intSet15, intSet19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzzTest0.FuzzTest_add(intSet19, intSet27, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { (-1), 100, (-1), 0 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet37 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet40 = null;
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet44 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet48 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        fuzzTest41.FuzzTest_add(intSet44, intSet48, (java.lang.Integer) 1, true);
        fuzzTest39.FuzzTest_add(intSet40, intSet44, (java.lang.Integer) 10, true);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet60 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet64 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        fuzzTest57.FuzzTest_add(intSet60, intSet64, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet72 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet76 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        fuzzTest69.FuzzTest_add(intSet72, intSet76, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet84 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        fuzzTest57.FuzzTest_add(intSet76, intSet84, (java.lang.Integer) 1, true);
        fuzzTest39.FuzzTest_add(intSet56, intSet84, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet37, intSet84, (java.lang.Integer) 0, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet19 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_add(intSet15, intSet19, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        fuzzTest24.FuzzTest_add(intSet27, intSet31, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet39 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest12.FuzzTest_add(intSet31, intSet39, (java.lang.Integer) 1, true);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet44 = null;
        fuzzTest0.FuzzTest_add(intSet39, intSet44, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet51 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet56 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet60 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest53.FuzzTest_add(intSet56, intSet60, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet68 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet72 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest65.FuzzTest_add(intSet68, intSet72, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet80 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet84 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        fuzzTest77.FuzzTest_add(intSet80, intSet84, (java.lang.Integer) 1, true);
        fuzzTest53.FuzzTest_add(intSet72, intSet84, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet51, intSet72, (java.lang.Integer) 0, false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet5 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzzTest2.FuzzTest_add(intSet5, intSet9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intSet1, intSet9, (java.lang.Integer) 0, false);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet17 = null;
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet18 = null;
        fuzzTest0.FuzzTest_add(intSet17, intSet18, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        fuzzTest24.FuzzTest_add(intSet27, intSet31, (java.lang.Integer) 1, true);
        fuzzTest22.FuzzTest_add(intSet23, intSet27, (java.lang.Integer) 10, true);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet43 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet47 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest40.FuzzTest_add(intSet43, intSet47, (java.lang.Integer) 1, true);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet56 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet60 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest53.FuzzTest_add(intSet56, intSet60, (java.lang.Integer) 1, true);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet65 = null;
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet69 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet73 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest66.FuzzTest_add(intSet69, intSet73, (java.lang.Integer) 1, true);
        fuzzTest53.FuzzTest_add(intSet65, intSet73, (java.lang.Integer) 1, false);
        fuzzTest40.FuzzTest_add(intSet52, intSet73, (java.lang.Integer) 100, false);
        fuzzTest22.FuzzTest_add(intSet39, intSet73, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 0, 0, (-1), 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet92 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet92, intArray91);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet73, intSet92, (java.lang.Integer) 10, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet19 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_add(intSet15, intSet19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzzTest0.FuzzTest_add(intSet19, intSet27, (java.lang.Integer) 1, true);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet36 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet40 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest33.FuzzTest_add(intSet36, intSet40, (java.lang.Integer) 1, true);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet49 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet53 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        fuzzTest46.FuzzTest_add(intSet49, intSet53, (java.lang.Integer) 1, true);
        fuzzTest33.FuzzTest_add(intSet45, intSet53, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_add(intSet32, intSet53, (java.lang.Integer) 1, false);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet64 = null;
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet65 = null;
        fuzzTest0.FuzzTest_add(intSet64, intSet65, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1, 0, 10, 10, 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet75 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet80 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet84 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        fuzzTest77.FuzzTest_add(intSet80, intSet84, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet75, intSet84, (java.lang.Integer) 10, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, (-1), 0, 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet17 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet26 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        fuzzTest19.FuzzTest_add(intSet22, intSet26, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet34 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzzTest31.FuzzTest_add(intSet34, intSet38, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet46 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzzTest19.FuzzTest_add(intSet38, intSet46, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet56 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet60 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest53.FuzzTest_add(intSet56, intSet60, (java.lang.Integer) 1, true);
        fuzzTest51.FuzzTest_add(intSet52, intSet56, (java.lang.Integer) 10, true);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet68 = null;
        fuzzTest19.FuzzTest_add(intSet52, intSet68, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet75 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet79 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        fuzzTest72.FuzzTest_add(intSet75, intSet79, (java.lang.Integer) 1, true);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet84 = null;
        fuzzTest19.FuzzTest_add(intSet79, intSet84, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet17, intSet79, (java.lang.Integer) 0, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet19 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_add(intSet15, intSet19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzzTest0.FuzzTest_add(intSet19, intSet27, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 100, 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet36 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet41 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet45 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest38.FuzzTest_add(intSet41, intSet45, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet53 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet57 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest50.FuzzTest_add(intSet53, intSet57, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet65 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet69 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzzTest62.FuzzTest_add(intSet65, intSet69, (java.lang.Integer) 1, true);
        fuzzTest38.FuzzTest_add(intSet57, intSet69, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet80 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet84 = new buggyasrts.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        fuzzTest77.FuzzTest_add(intSet80, intSet84, (java.lang.Integer) 1, true);
        buggyasrts.mut_041.TreeSet<java.lang.Integer> intSet89 = null;
        fuzzTest38.FuzzTest_add(intSet84, intSet89, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet36, intSet84, (java.lang.Integer) (-1), true);
    }
}

