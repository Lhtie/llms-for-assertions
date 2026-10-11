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
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet19 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_remove(intSet15, intSet19, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet28 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet32 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest25.FuzzTest_remove(intSet28, intSet32, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_remove(intSet24, intSet32, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet43 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet47 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest40.FuzzTest_remove(intSet43, intSet47, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet55 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet59 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest52.FuzzTest_remove(intSet55, intSet59, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet67 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzzTest40.FuzzTest_remove(intSet59, intSet67, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet32, intSet59, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet16 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet28 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet32 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest25.FuzzTest_remove(intSet28, intSet32, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet40 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest13.FuzzTest_remove(intSet32, intSet40, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_remove(intSet12, intSet32, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet51 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet55 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        fuzzTest48.FuzzTest_remove(intSet51, intSet55, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet63 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet67 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzzTest60.FuzzTest_remove(intSet63, intSet67, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet75 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzzTest48.FuzzTest_remove(intSet67, intSet75, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet82 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet75, intSet82, (java.lang.Integer) 100, false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet4 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest1.FuzzTest_remove(intSet4, intSet8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet16 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet8, intSet16, (java.lang.Integer) 0, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet4 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest1.FuzzTest_remove(intSet4, intSet8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet16 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet28 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        fuzzTest1.FuzzTest_remove(intSet20, intSet28, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet42 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest35.FuzzTest_remove(intSet38, intSet42, (java.lang.Integer) 1, true);
        fuzzTest33.FuzzTest_remove(intSet34, intSet38, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet28, intSet38, (java.lang.Integer) 0, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet19 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_remove(intSet15, intSet19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzzTest0.FuzzTest_remove(intSet19, intSet27, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet36 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet40 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest33.FuzzTest_remove(intSet36, intSet40, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_remove(intSet32, intSet36, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), (-1), 10, 10, 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet54 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet59 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet63 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzzTest56.FuzzTest_remove(intSet59, intSet63, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet71 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet75 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzzTest68.FuzzTest_remove(intSet71, intSet75, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet83 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        fuzzTest56.FuzzTest_remove(intSet75, intSet83, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet54, intSet83, (java.lang.Integer) 10, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet5 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzzTest2.FuzzTest_remove(intSet5, intSet9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_remove(intSet1, intSet5, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet25 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet29 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        fuzzTest22.FuzzTest_remove(intSet25, intSet29, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10, 0, 0 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet43 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet47 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest40.FuzzTest_remove(intSet43, intSet47, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet55 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet59 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest52.FuzzTest_remove(intSet55, intSet59, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet67 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzzTest40.FuzzTest_remove(intSet59, intSet67, (java.lang.Integer) 1, true);
        fuzzTest22.FuzzTest_remove(intSet38, intSet67, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet20, intSet67, (java.lang.Integer) 10, false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet5 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzzTest2.FuzzTest_remove(intSet5, intSet9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_remove(intSet1, intSet5, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet24 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest17.FuzzTest_remove(intSet20, intSet24, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet33 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet37 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzzTest30.FuzzTest_remove(intSet33, intSet37, (java.lang.Integer) 1, true);
        fuzzTest17.FuzzTest_remove(intSet29, intSet37, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet48 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet52 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest45.FuzzTest_remove(intSet48, intSet52, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet37, intSet48, (java.lang.Integer) 1, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet4 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest1.FuzzTest_remove(intSet4, intSet8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet16 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet28 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        fuzzTest1.FuzzTest_remove(intSet20, intSet28, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet36 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet40 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest33.FuzzTest_remove(intSet36, intSet40, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet49 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet53 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        fuzzTest46.FuzzTest_remove(intSet49, intSet53, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet61 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet65 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        fuzzTest58.FuzzTest_remove(intSet61, intSet65, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet73 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest46.FuzzTest_remove(intSet65, intSet73, (java.lang.Integer) 1, true);
        fuzzTest33.FuzzTest_remove(intSet45, intSet65, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet28, intSet65, (java.lang.Integer) 1, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet5 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzzTest2.FuzzTest_remove(intSet5, intSet9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_remove(intSet1, intSet5, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet21 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet25 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest18.FuzzTest_remove(intSet21, intSet25, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet34 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzzTest31.FuzzTest_remove(intSet34, intSet38, (java.lang.Integer) 1, true);
        fuzzTest18.FuzzTest_remove(intSet30, intSet38, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet49 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet53 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        fuzzTest46.FuzzTest_remove(intSet49, intSet53, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet62 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet66 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        fuzzTest59.FuzzTest_remove(intSet62, intSet66, (java.lang.Integer) 1, true);
        fuzzTest46.FuzzTest_remove(intSet58, intSet66, (java.lang.Integer) 1, false);
        fuzzTest17.FuzzTest_remove(intSet30, intSet66, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100, 10, (-1), 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet82 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet66, intSet82, (java.lang.Integer) 1, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet19 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_remove(intSet15, intSet19, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet31 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        fuzzTest24.FuzzTest_remove(intSet27, intSet31, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet39 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest12.FuzzTest_remove(intSet31, intSet39, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet48 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet52 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest45.FuzzTest_remove(intSet48, intSet52, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_remove(intSet44, intSet48, (java.lang.Integer) 100, false);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet60 = null;
        fuzzTest0.FuzzTest_remove(intSet48, intSet60, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10, 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet67 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet69 = null;
        fuzzTest0.FuzzTest_remove(intSet67, intSet69, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet76 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet80 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        fuzzTest73.FuzzTest_remove(intSet76, intSet80, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest85 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet88 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet92 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet92, intArray91);
        fuzzTest85.FuzzTest_remove(intSet88, intSet92, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet80, intSet92, (java.lang.Integer) 100, false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 0, 0 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet16 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet21 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet25 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest18.FuzzTest_remove(intSet21, intSet25, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet33 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet37 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzzTest30.FuzzTest_remove(intSet33, intSet37, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet45 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest18.FuzzTest_remove(intSet37, intSet45, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_remove(intSet16, intSet45, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet56 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet60 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest53.FuzzTest_remove(intSet56, intSet60, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet70 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet74 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        fuzzTest67.FuzzTest_remove(intSet70, intSet74, (java.lang.Integer) 1, true);
        fuzzTest65.FuzzTest_remove(intSet66, intSet70, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet56, intSet70, (java.lang.Integer) 1, false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet16 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet28 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet32 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest25.FuzzTest_remove(intSet28, intSet32, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet40 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest13.FuzzTest_remove(intSet32, intSet40, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_remove(intSet12, intSet32, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet51 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet55 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        fuzzTest48.FuzzTest_remove(intSet51, intSet55, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet61 = null;
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet65 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet69 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzzTest62.FuzzTest_remove(intSet65, intSet69, (java.lang.Integer) 1, true);
        fuzzTest60.FuzzTest_remove(intSet61, intSet65, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet51, intSet65, (java.lang.Integer) 0, false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet5 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzzTest2.FuzzTest_remove(intSet5, intSet9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_remove(intSet1, intSet5, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet24 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest17.FuzzTest_remove(intSet20, intSet24, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet32 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet36 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        fuzzTest29.FuzzTest_remove(intSet32, intSet36, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet44 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzzTest17.FuzzTest_remove(intSet36, intSet44, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet53 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet57 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest50.FuzzTest_remove(intSet53, intSet57, (java.lang.Integer) 1, true);
        fuzzTest17.FuzzTest_remove(intSet49, intSet53, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet68 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet72 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest65.FuzzTest_remove(intSet68, intSet72, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet77 = null;
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet81 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet85 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        fuzzTest78.FuzzTest_remove(intSet81, intSet85, (java.lang.Integer) 1, true);
        fuzzTest65.FuzzTest_remove(intSet77, intSet85, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet53, intSet85, (java.lang.Integer) 100, false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet16 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_remove(intSet12, intSet20, (java.lang.Integer) 1, false);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet28 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10, 1, 100, 0 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet34 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest0.FuzzTest_remove(intSet28, intSet34, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet42 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet46 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzzTest39.FuzzTest_remove(intSet42, intSet46, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet56 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet60 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest53.FuzzTest_remove(intSet56, intSet60, (java.lang.Integer) 1, true);
        fuzzTest51.FuzzTest_remove(intSet52, intSet56, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet46, intSet56, (java.lang.Integer) 1, false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet4 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest1.FuzzTest_remove(intSet4, intSet8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet16 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet29 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet33 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest26.FuzzTest_remove(intSet29, intSet33, (java.lang.Integer) 1, true);
        fuzzTest13.FuzzTest_remove(intSet25, intSet33, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet44 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet48 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        fuzzTest41.FuzzTest_remove(intSet44, intSet48, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet56 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet60 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest53.FuzzTest_remove(intSet56, intSet60, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet68 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        fuzzTest41.FuzzTest_remove(intSet60, intSet68, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet76 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet80 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        fuzzTest73.FuzzTest_remove(intSet76, intSet80, (java.lang.Integer) 1, true);
        fuzzTest13.FuzzTest_remove(intSet60, intSet80, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet8, intSet60, (java.lang.Integer) 100, false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet19 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_remove(intSet15, intSet19, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet31 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        fuzzTest24.FuzzTest_remove(intSet27, intSet31, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet39 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest12.FuzzTest_remove(intSet31, intSet39, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet49 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet53 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        fuzzTest46.FuzzTest_remove(intSet49, intSet53, (java.lang.Integer) 1, true);
        fuzzTest44.FuzzTest_remove(intSet45, intSet49, (java.lang.Integer) 10, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet61 = null;
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet65 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet69 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzzTest62.FuzzTest_remove(intSet65, intSet69, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet77 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet81 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        fuzzTest74.FuzzTest_remove(intSet77, intSet81, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet89 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        fuzzTest62.FuzzTest_remove(intSet81, intSet89, (java.lang.Integer) 1, true);
        fuzzTest44.FuzzTest_remove(intSet61, intSet81, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet31, intSet81, (java.lang.Integer) 0, false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet19 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_remove(intSet15, intSet19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet27 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzzTest0.FuzzTest_remove(intSet19, intSet27, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet36 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet38 = null;
        fuzzTest0.FuzzTest_remove(intSet36, intSet38, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet45 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet49 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzzTest42.FuzzTest_remove(intSet45, intSet49, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet57 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet61 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        fuzzTest54.FuzzTest_remove(intSet57, intSet61, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet49, intSet61, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet4 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest1.FuzzTest_remove(intSet4, intSet8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet16 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet28 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        fuzzTest1.FuzzTest_remove(intSet20, intSet28, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet35 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest1.FuzzTest_remove(intSet35, intSet37, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet46 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet50 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest43.FuzzTest_remove(intSet46, intSet50, (java.lang.Integer) 1, true);
        fuzzTest41.FuzzTest_remove(intSet42, intSet46, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet59 = null;
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet63 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet67 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzzTest60.FuzzTest_remove(intSet63, intSet67, (java.lang.Integer) 1, true);
        fuzzTest58.FuzzTest_remove(intSet59, intSet63, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet78 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet82 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        fuzzTest75.FuzzTest_remove(intSet78, intSet82, (java.lang.Integer) 1, true);
        fuzzTest41.FuzzTest_remove(intSet59, intSet82, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet35, intSet82, (java.lang.Integer) 1, false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet4 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest1.FuzzTest_remove(intSet4, intSet8, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10, 0, 0 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet17 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet22 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet26 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        fuzzTest19.FuzzTest_remove(intSet22, intSet26, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet34 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzzTest31.FuzzTest_remove(intSet34, intSet38, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet46 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzzTest19.FuzzTest_remove(intSet38, intSet46, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_remove(intSet17, intSet46, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet57 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet61 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        fuzzTest54.FuzzTest_remove(intSet57, intSet61, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet69 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet73 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest66.FuzzTest_remove(intSet69, intSet73, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet81 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        fuzzTest54.FuzzTest_remove(intSet73, intSet81, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet17, intSet81, (java.lang.Integer) 100, false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet5 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzzTest2.FuzzTest_remove(intSet5, intSet9, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest1.FuzzTest_remove(intSet9, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet22 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet26 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        fuzzTest19.FuzzTest_remove(intSet22, intSet26, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest18.FuzzTest_remove(intSet26, intSet31, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_remove(intSet14, intSet31, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet42 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet46 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzzTest39.FuzzTest_remove(intSet42, intSet46, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet51 = null;
        fuzzTest38.FuzzTest_remove(intSet46, intSet51, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet58 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet62 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest55.FuzzTest_remove(intSet58, intSet62, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet46, intSet62, (java.lang.Integer) 100, false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet5 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzzTest2.FuzzTest_remove(intSet5, intSet9, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest1.FuzzTest_remove(intSet9, intSet14, (java.lang.Integer) (-1), false);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet18 = null;
        fuzzTest0.FuzzTest_remove(intSet14, intSet18, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet25 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet29 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        fuzzTest22.FuzzTest_remove(intSet25, intSet29, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10, 0, 0 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet43 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet47 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest40.FuzzTest_remove(intSet43, intSet47, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet55 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet59 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest52.FuzzTest_remove(intSet55, intSet59, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet67 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzzTest40.FuzzTest_remove(intSet59, intSet67, (java.lang.Integer) 1, true);
        fuzzTest22.FuzzTest_remove(intSet38, intSet67, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 1 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet78 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet80 = null;
        fuzzTest22.FuzzTest_remove(intSet78, intSet80, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet87 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet91 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet91, intArray90);
        fuzzTest84.FuzzTest_remove(intSet87, intSet91, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet78, intSet91, (java.lang.Integer) 0, false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet4 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest1.FuzzTest_remove(intSet4, intSet8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet16 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10, 0, 0 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet29 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet34 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet38 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzzTest31.FuzzTest_remove(intSet34, intSet38, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet46 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet50 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest43.FuzzTest_remove(intSet46, intSet50, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet58 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        fuzzTest31.FuzzTest_remove(intSet50, intSet58, (java.lang.Integer) 1, true);
        fuzzTest13.FuzzTest_remove(intSet29, intSet58, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 1 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet69 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet71 = null;
        fuzzTest13.FuzzTest_remove(intSet69, intSet71, (java.lang.Integer) 100, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet75 = null;
        fuzzTest1.FuzzTest_remove(intSet69, intSet75, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet83 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet87 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        fuzzTest80.FuzzTest_remove(intSet83, intSet87, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet92 = null;
        fuzzTest79.FuzzTest_remove(intSet87, intSet92, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet69, intSet87, (java.lang.Integer) 0, false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet5 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzzTest2.FuzzTest_remove(intSet5, intSet9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_remove(intSet1, intSet5, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet18 = null;
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet22 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet26 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        fuzzTest19.FuzzTest_remove(intSet22, intSet26, (java.lang.Integer) 1, true);
        fuzzTest17.FuzzTest_remove(intSet18, intSet22, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet37 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet41 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzzTest34.FuzzTest_remove(intSet37, intSet41, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_remove(intSet18, intSet41, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet53 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet57 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest50.FuzzTest_remove(intSet53, intSet57, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet62 = null;
        fuzzTest49.FuzzTest_remove(intSet57, intSet62, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet70 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet74 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        fuzzTest67.FuzzTest_remove(intSet70, intSet74, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet79 = null;
        fuzzTest66.FuzzTest_remove(intSet74, intSet79, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet57, intSet74, (java.lang.Integer) 0, false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet4 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest1.FuzzTest_remove(intSet4, intSet8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet16 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet20 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet28 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        fuzzTest1.FuzzTest_remove(intSet20, intSet28, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest0.FuzzTest_remove(intSet28, intSet33, (java.lang.Integer) 0, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet37 = null;
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet38 = null;
        fuzzTest0.FuzzTest_remove(intSet37, intSet38, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet45 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet49 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzzTest42.FuzzTest_remove(intSet45, intSet49, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet58 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet62 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest55.FuzzTest_remove(intSet58, intSet62, (java.lang.Integer) 1, true);
        fuzzTest42.FuzzTest_remove(intSet54, intSet62, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet71 = null;
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet75 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet79 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        fuzzTest72.FuzzTest_remove(intSet75, intSet79, (java.lang.Integer) 1, true);
        fuzzTest70.FuzzTest_remove(intSet71, intSet75, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet62, intSet75, (java.lang.Integer) 10, false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet5 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet9 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzzTest2.FuzzTest_remove(intSet5, intSet9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_remove(intSet1, intSet5, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet18 = null;
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet22 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet26 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        fuzzTest19.FuzzTest_remove(intSet22, intSet26, (java.lang.Integer) 1, true);
        fuzzTest17.FuzzTest_remove(intSet18, intSet22, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet35 = null;
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet39 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet43 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        fuzzTest36.FuzzTest_remove(intSet39, intSet43, (java.lang.Integer) 1, true);
        fuzzTest34.FuzzTest_remove(intSet35, intSet39, (java.lang.Integer) 10, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet51 = null;
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet55 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet59 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest52.FuzzTest_remove(intSet55, intSet59, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet67 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet71 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        fuzzTest64.FuzzTest_remove(intSet67, intSet71, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet79 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        fuzzTest52.FuzzTest_remove(intSet71, intSet79, (java.lang.Integer) 1, true);
        fuzzTest34.FuzzTest_remove(intSet51, intSet71, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet22, intSet71, (java.lang.Integer) 1, false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet4 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet8 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest1.FuzzTest_remove(intSet4, intSet8, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest0.FuzzTest_remove(intSet8, intSet13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet21 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet25 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest18.FuzzTest_remove(intSet21, intSet25, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet30 = null;
        fuzzTest17.FuzzTest_remove(intSet25, intSet30, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet35 = null;
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet39 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet43 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        fuzzTest36.FuzzTest_remove(intSet39, intSet43, (java.lang.Integer) 1, true);
        fuzzTest34.FuzzTest_remove(intSet35, intSet39, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet56 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet60 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest53.FuzzTest_remove(intSet56, intSet60, (java.lang.Integer) 1, true);
        fuzzTest51.FuzzTest_remove(intSet52, intSet56, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet71 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet75 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzzTest68.FuzzTest_remove(intSet71, intSet75, (java.lang.Integer) 1, true);
        fuzzTest34.FuzzTest_remove(intSet52, intSet75, (java.lang.Integer) 0, false);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet83 = null;
        fuzzTest17.FuzzTest_remove(intSet75, intSet83, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 1, 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet91 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet91, intArray90);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet75, intSet91, (java.lang.Integer) 10, false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet3 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet7 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet12 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10, 100, 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet17 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        fuzzTest0.FuzzTest_remove(intSet12, intSet17, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet25 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet29 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        fuzzTest22.FuzzTest_remove(intSet25, intSet29, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet37 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet41 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzzTest34.FuzzTest_remove(intSet37, intSet41, (java.lang.Integer) 1, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet46 = null;
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet50 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet54 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzzTest47.FuzzTest_remove(intSet50, intSet54, (java.lang.Integer) 1, true);
        fuzzTest34.FuzzTest_remove(intSet46, intSet54, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet67 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet71 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        fuzzTest64.FuzzTest_remove(intSet67, intSet71, (java.lang.Integer) 1, true);
        fuzzTest62.FuzzTest_remove(intSet63, intSet67, (java.lang.Integer) 10, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet79 = null;
        fuzzTest34.FuzzTest_remove(intSet67, intSet79, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet25, intSet67, (java.lang.Integer) 10, false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet1 = null;
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet11 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet15 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest8.FuzzTest_remove(intSet11, intSet15, (java.lang.Integer) 1, true);
        fuzzTest6.FuzzTest_remove(intSet7, intSet11, (java.lang.Integer) 10, true);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet29 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet33 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest26.FuzzTest_remove(intSet29, intSet33, (java.lang.Integer) 1, true);
        fuzzTest24.FuzzTest_remove(intSet25, intSet29, (java.lang.Integer) 10, true);
        fuzzTest6.FuzzTest_remove(intSet23, intSet29, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet47 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet51 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzzTest44.FuzzTest_remove(intSet47, intSet51, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet59 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet63 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzzTest56.FuzzTest_remove(intSet59, intSet63, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet71 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        fuzzTest44.FuzzTest_remove(intSet63, intSet71, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, 0, 100 };
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet80 = new buggyasrts.mut_043.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        buggyasrts.mut_043.TreeSet<java.lang.Integer> intSet82 = null;
        fuzzTest44.FuzzTest_remove(intSet80, intSet82, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet29, intSet80, (java.lang.Integer) (-1), false);
    }
}

