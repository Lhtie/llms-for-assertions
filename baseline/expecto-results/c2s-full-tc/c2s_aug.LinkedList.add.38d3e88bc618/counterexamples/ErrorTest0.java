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
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList28 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList32 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_add(intList28, intList32, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_add(intList24, intList32, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList43 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList47 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_add(intList43, intList47, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList55 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList59 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest52.FuzzTest_add(intList55, intList59, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList67 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest40.FuzzTest_add(intList59, intList67, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList32, intList59, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList16 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList28 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList32 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_add(intList28, intList32, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList40 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest13.FuzzTest_add(intList32, intList40, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList12, intList32, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList55 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest48.FuzzTest_add(intList51, intList55, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList63 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList67 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest60.FuzzTest_add(intList63, intList67, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList75 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest48.FuzzTest_add(intList67, intList75, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList82 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList75, intList82, (java.lang.Integer) 100, false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList16 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList8, intList16, (java.lang.Integer) 0, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList16 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList28 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest1.FuzzTest_add(intList20, intList28, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_add(intList38, intList42, (java.lang.Integer) 1, true);
        fuzzTest33.FuzzTest_add(intList34, intList38, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList28, intList38, (java.lang.Integer) 0, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList40 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList32, intList36, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), (-1), 10, 10, 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList54 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList59 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList63 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_add(intList59, intList63, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList71 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList75 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest68.FuzzTest_add(intList71, intList75, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList83 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest56.FuzzTest_add(intList75, intList83, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList54, intList83, (java.lang.Integer) 10, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList9 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_add(intList5, intList9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList1, intList5, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList29 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest22.FuzzTest_add(intList25, intList29, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList43 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList47 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_add(intList43, intList47, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList55 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList59 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest52.FuzzTest_add(intList55, intList59, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList67 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest40.FuzzTest_add(intList59, intList67, (java.lang.Integer) 1, true);
        fuzzTest22.FuzzTest_add(intList38, intList67, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList20, intList67, (java.lang.Integer) 10, false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList9 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_add(intList5, intList9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList1, intList5, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList24 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList33 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList37 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_add(intList33, intList37, (java.lang.Integer) 1, true);
        fuzzTest17.FuzzTest_add(intList29, intList37, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList48 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_add(intList48, intList52, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList37, intList48, (java.lang.Integer) 1, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList16 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList12, intList20, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList31 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList35 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest28.FuzzTest_add(intList31, intList35, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList43 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList47 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_add(intList43, intList47, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList61 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList65 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_add(intList61, intList65, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList73 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList77 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest70.FuzzTest_add(intList73, intList77, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList85 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest58.FuzzTest_add(intList77, intList85, (java.lang.Integer) 1, true);
        fuzzTest40.FuzzTest_add(intList56, intList85, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList31, intList85, (java.lang.Integer) 0, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList16 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList28 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest1.FuzzTest_add(intList20, intList28, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_add(intList38, intList42, (java.lang.Integer) 1, true);
        fuzzTest33.FuzzTest_add(intList34, intList38, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList28, intList38, (java.lang.Integer) 1, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList35 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_add(intList35, intList39, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList47 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_add(intList47, intList51, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList59 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest32.FuzzTest_add(intList51, intList59, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, 0, 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList68 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        c2s_aug.LinkedList<java.lang.Integer> intList70 = null;
        fuzzTest32.FuzzTest_add(intList68, intList70, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 10, 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList78 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList68, intList78, (java.lang.Integer) 0, false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList31 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_add(intList27, intList31, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest12.FuzzTest_add(intList31, intList39, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, (-1), 100, 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList49 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList31, intList49, (java.lang.Integer) 100, false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList9 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_add(intList5, intList9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList1, intList5, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList24 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList33 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_add(intList38, intList42, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList50 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList54 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest47.FuzzTest_add(intList50, intList54, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList62 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest35.FuzzTest_add(intList54, intList62, (java.lang.Integer) 1, true);
        fuzzTest17.FuzzTest_add(intList33, intList62, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList73 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList77 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest70.FuzzTest_add(intList73, intList77, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList62, intList77, (java.lang.Integer) 0, false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_add(intList38, intList42, (java.lang.Integer) 1, true);
        fuzzTest33.FuzzTest_add(intList34, intList38, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_add(intList32, intList38, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList61 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList65 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_add(intList61, intList65, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList56, intList65, (java.lang.Integer) 1, false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList40 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList32, intList36, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList55 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest48.FuzzTest_add(intList51, intList55, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList63 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList67 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest60.FuzzTest_add(intList63, intList67, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList75 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest48.FuzzTest_add(intList67, intList75, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList84 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList88 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest81.FuzzTest_add(intList84, intList88, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList93 = null;
        fuzzTest80.FuzzTest_add(intList88, intList93, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList75, intList88, (java.lang.Integer) 1, false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList16 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList30 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList34 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_add(intList30, intList34, (java.lang.Integer) 1, true);
        fuzzTest25.FuzzTest_add(intList26, intList30, (java.lang.Integer) 10, true);
        c2s_aug.LinkedList<java.lang.Integer> intList42 = null;
        fuzzTest13.FuzzTest_add(intList30, intList42, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intList12, intList42, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_add(intList52, intList56, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList62 = null;
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList66 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList70 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest63.FuzzTest_add(intList66, intList70, (java.lang.Integer) 1, true);
        fuzzTest61.FuzzTest_add(intList62, intList66, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList56, intList66, (java.lang.Integer) 10, false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList9 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_add(intList5, intList9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList1, intList5, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList24 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList32 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_add(intList32, intList36, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList44 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList48 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_add(intList44, intList48, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest29.FuzzTest_add(intList48, intList56, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0, 0, 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList65 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        c2s_aug.LinkedList<java.lang.Integer> intList67 = null;
        fuzzTest29.FuzzTest_add(intList65, intList67, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList24, intList65, (java.lang.Integer) 1, false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList17 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_add(intList17, intList21, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_add(intList13, intList17, (java.lang.Integer) 10, true);
        c2s_aug.LinkedList<java.lang.Integer> intList29 = null;
        fuzzTest0.FuzzTest_add(intList17, intList29, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList40 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList49 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList53 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest46.FuzzTest_add(intList49, intList53, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList61 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList65 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_add(intList61, intList65, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList73 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest46.FuzzTest_add(intList65, intList73, (java.lang.Integer) 1, true);
        fuzzTest33.FuzzTest_add(intList45, intList65, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), 10, 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList85 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList65, intList85, (java.lang.Integer) 1, false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList16 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList28 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest1.FuzzTest_add(intList20, intList28, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 0, 0, 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList37 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        c2s_aug.LinkedList<java.lang.Integer> intList39 = null;
        fuzzTest1.FuzzTest_add(intList37, intList39, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList46 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList50 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest43.FuzzTest_add(intList46, intList50, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList37, intList50, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList16 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList30 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList34 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_add(intList30, intList34, (java.lang.Integer) 1, true);
        fuzzTest25.FuzzTest_add(intList26, intList30, (java.lang.Integer) 10, true);
        c2s_aug.LinkedList<java.lang.Integer> intList42 = null;
        fuzzTest13.FuzzTest_add(intList30, intList42, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intList12, intList42, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_add(intList52, intList56, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList61 = null;
        fuzzTest0.FuzzTest_add(intList56, intList61, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList69 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList73 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest66.FuzzTest_add(intList69, intList73, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList78 = null;
        fuzzTest65.FuzzTest_add(intList73, intList78, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList85 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList89 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        fuzzTest82.FuzzTest_add(intList85, intList89, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList73, intList85, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList16 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList30 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList34 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_add(intList30, intList34, (java.lang.Integer) 1, true);
        fuzzTest25.FuzzTest_add(intList26, intList30, (java.lang.Integer) 10, true);
        c2s_aug.LinkedList<java.lang.Integer> intList42 = null;
        fuzzTest13.FuzzTest_add(intList30, intList42, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intList12, intList42, (java.lang.Integer) 100, false);
        c2s_aug.LinkedList<java.lang.Integer> intList49 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList50 = null;
        fuzzTest0.FuzzTest_add(intList49, intList50, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList57 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList61 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest54.FuzzTest_add(intList57, intList61, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList70 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList74 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest67.FuzzTest_add(intList70, intList74, (java.lang.Integer) 1, true);
        fuzzTest54.FuzzTest_add(intList66, intList74, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList85 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList89 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        fuzzTest82.FuzzTest_add(intList85, intList89, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList74, intList89, (java.lang.Integer) 0, false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList8, intList13, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList31 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_add(intList27, intList31, (java.lang.Integer) 1, true);
        fuzzTest22.FuzzTest_add(intList23, intList27, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList46 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest39.FuzzTest_add(intList42, intList46, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList54 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList58 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest51.FuzzTest_add(intList54, intList58, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList66 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest39.FuzzTest_add(intList58, intList66, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0, 0, 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList75 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        c2s_aug.LinkedList<java.lang.Integer> intList77 = null;
        fuzzTest39.FuzzTest_add(intList75, intList77, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList84 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList88 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest81.FuzzTest_add(intList84, intList88, (java.lang.Integer) 1, true);
        fuzzTest22.FuzzTest_add(intList75, intList84, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList20, intList75, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_add(intList38, intList42, (java.lang.Integer) 1, true);
        fuzzTest33.FuzzTest_add(intList34, intList38, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_add(intList32, intList38, (java.lang.Integer) 100, false);
        c2s_aug.LinkedList<java.lang.Integer> intList53 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList54 = null;
        fuzzTest0.FuzzTest_add(intList53, intList54, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList61 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList65 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_add(intList61, intList65, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList73 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList77 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest70.FuzzTest_add(intList73, intList77, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList65, intList77, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_add(intList38, intList42, (java.lang.Integer) 1, true);
        fuzzTest33.FuzzTest_add(intList34, intList38, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_add(intList32, intList38, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10, 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList61 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList65 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_add(intList61, intList65, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList56, intList65, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList74 = null;
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList78 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList82 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest75.FuzzTest_add(intList78, intList82, (java.lang.Integer) 1, true);
        fuzzTest73.FuzzTest_add(intList74, intList78, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList92 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList78, intList92, (java.lang.Integer) 10, false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList8, intList13, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList24 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList32 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_add(intList32, intList36, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList44 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest17.FuzzTest_add(intList36, intList44, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_add(intList52, intList56, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList64 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList68 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_add(intList64, intList68, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList76 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest49.FuzzTest_add(intList68, intList76, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList44, intList68, (java.lang.Integer) 100, false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList4, intList13, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList24 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList33 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_add(intList38, intList42, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList50 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList54 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest47.FuzzTest_add(intList50, intList54, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList62 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest35.FuzzTest_add(intList54, intList62, (java.lang.Integer) 1, true);
        fuzzTest17.FuzzTest_add(intList33, intList62, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList73 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList77 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest70.FuzzTest_add(intList73, intList77, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList62, intList73, (java.lang.Integer) 0, false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList17 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_add(intList17, intList21, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_add(intList13, intList17, (java.lang.Integer) 10, true);
        c2s_aug.LinkedList<java.lang.Integer> intList29 = null;
        fuzzTest0.FuzzTest_add(intList17, intList29, (java.lang.Integer) 1, false);
        c2s_aug.LinkedList<java.lang.Integer> intList33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList37 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList41 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest34.FuzzTest_add(intList37, intList41, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList33, intList41, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_add(intList52, intList56, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList64 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList68 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_add(intList64, intList68, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList76 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest49.FuzzTest_add(intList68, intList76, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList84 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList88 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest81.FuzzTest_add(intList84, intList88, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList68, intList84, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList40 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList45 = null;
        fuzzTest32.FuzzTest_add(intList40, intList45, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList53 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList57 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest50.FuzzTest_add(intList53, intList57, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList62 = null;
        fuzzTest49.FuzzTest_add(intList53, intList62, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList40, intList53, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList9 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_add(intList5, intList9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList1, intList5, (java.lang.Integer) 10, true);
        c2s_aug.LinkedList<java.lang.Integer> intList17 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList18 = null;
        fuzzTest0.FuzzTest_add(intList17, intList18, (java.lang.Integer) 0, true);
        c2s_aug.LinkedList<java.lang.Integer> intList22 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest0.FuzzTest_add(intList22, intList23, (java.lang.Integer) (-1), false);
        c2s_aug.LinkedList<java.lang.Integer> intList27 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList28 = null;
        fuzzTest0.FuzzTest_add(intList27, intList28, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList35 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_add(intList35, intList39, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList47 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_add(intList47, intList51, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList65 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList69 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest62.FuzzTest_add(intList65, intList69, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList77 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList81 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest74.FuzzTest_add(intList77, intList81, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList89 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        fuzzTest62.FuzzTest_add(intList81, intList89, (java.lang.Integer) 1, true);
        fuzzTest44.FuzzTest_add(intList60, intList89, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList35, intList60, (java.lang.Integer) 10, false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 0, 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        c2s_aug.LinkedList<java.lang.Integer> intList38 = null;
        fuzzTest0.FuzzTest_add(intList36, intList38, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList45 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList49 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest42.FuzzTest_add(intList45, intList49, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList55 = null;
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList59 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList63 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_add(intList59, intList63, (java.lang.Integer) 1, true);
        fuzzTest54.FuzzTest_add(intList55, intList59, (java.lang.Integer) 10, true);
        c2s_aug.LinkedList<java.lang.Integer> intList71 = null;
        fuzzTest42.FuzzTest_add(intList59, intList71, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList79 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList83 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest76.FuzzTest_add(intList79, intList83, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList88 = null;
        fuzzTest75.FuzzTest_add(intList79, intList88, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList59, intList79, (java.lang.Integer) 1, false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList17 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_add(intList17, intList21, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList26 = null;
        fuzzTest13.FuzzTest_add(intList17, intList26, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intList12, intList17, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList40 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList48 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_add(intList48, intList52, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest33.FuzzTest_add(intList52, intList60, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList68 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList72 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_add(intList68, intList72, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList52, intList68, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList16 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList28 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest1.FuzzTest_add(intList20, intList28, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList37 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList41 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest34.FuzzTest_add(intList37, intList41, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList50 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList55 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList59 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest52.FuzzTest_add(intList55, intList59, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList67 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList71 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest64.FuzzTest_add(intList67, intList71, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList79 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest52.FuzzTest_add(intList71, intList79, (java.lang.Integer) 1, true);
        fuzzTest34.FuzzTest_add(intList50, intList79, (java.lang.Integer) (-1), false);
        c2s_aug.LinkedList<java.lang.Integer> intList87 = null;
        fuzzTest33.FuzzTest_add(intList79, intList87, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList28, intList79, (java.lang.Integer) 10, false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList17 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_add(intList17, intList21, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList26 = null;
        fuzzTest13.FuzzTest_add(intList17, intList26, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intList12, intList17, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList40 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList46 = null;
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList50 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList54 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest47.FuzzTest_add(intList50, intList54, (java.lang.Integer) 1, true);
        fuzzTest45.FuzzTest_add(intList46, intList50, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList65 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList69 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest62.FuzzTest_add(intList65, intList69, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList77 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList81 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest74.FuzzTest_add(intList77, intList81, (java.lang.Integer) 1, true);
        fuzzTest45.FuzzTest_add(intList65, intList81, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList36, intList81, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList17 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_add(intList17, intList21, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_add(intList13, intList17, (java.lang.Integer) 10, true);
        c2s_aug.LinkedList<java.lang.Integer> intList29 = null;
        fuzzTest0.FuzzTest_add(intList17, intList29, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_add(intList38, intList42, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList47 = null;
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList55 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest48.FuzzTest_add(intList51, intList55, (java.lang.Integer) 1, true);
        fuzzTest35.FuzzTest_add(intList47, intList55, (java.lang.Integer) 1, false);
        fuzzTest33.FuzzTest_add(intList34, intList55, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList70 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList74 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest67.FuzzTest_add(intList70, intList74, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList79 = null;
        fuzzTest66.FuzzTest_add(intList74, intList79, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList55, intList74, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList29 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList33 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_add(intList29, intList33, (java.lang.Integer) 1, true);
        fuzzTest24.FuzzTest_add(intList25, intList29, (java.lang.Integer) 10, true);
        c2s_aug.LinkedList<java.lang.Integer> intList41 = null;
        fuzzTest12.FuzzTest_add(intList29, intList41, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList46 = null;
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList50 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList54 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest47.FuzzTest_add(intList50, intList54, (java.lang.Integer) 1, true);
        fuzzTest45.FuzzTest_add(intList46, intList50, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList29, intList50, (java.lang.Integer) 1, false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList9 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_add(intList5, intList9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList1, intList5, (java.lang.Integer) 10, true);
        c2s_aug.LinkedList<java.lang.Integer> intList17 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList18 = null;
        fuzzTest0.FuzzTest_add(intList17, intList18, (java.lang.Integer) 0, true);
        c2s_aug.LinkedList<java.lang.Integer> intList22 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest0.FuzzTest_add(intList22, intList23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList31 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList35 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest28.FuzzTest_add(intList31, intList35, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList40 = null;
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList44 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList48 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_add(intList44, intList48, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_add(intList56, intList60, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList68 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest41.FuzzTest_add(intList60, intList68, (java.lang.Integer) 1, true);
        fuzzTest28.FuzzTest_add(intList40, intList60, (java.lang.Integer) 0, true);
        c2s_aug.LinkedList<java.lang.Integer> intList76 = null;
        fuzzTest27.FuzzTest_add(intList60, intList76, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList83 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList87 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest80.FuzzTest_add(intList83, intList87, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList60, intList87, (java.lang.Integer) 0, false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList18 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList22 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest15.FuzzTest_add(intList18, intList22, (java.lang.Integer) 1, true);
        fuzzTest13.FuzzTest_add(intList14, intList18, (java.lang.Integer) 10, true);
        c2s_aug.LinkedList<java.lang.Integer> intList30 = null;
        fuzzTest1.FuzzTest_add(intList18, intList30, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList37 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList41 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest34.FuzzTest_add(intList37, intList41, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList30, intList41, (java.lang.Integer) (-1), false);
        c2s_aug.LinkedList<java.lang.Integer> intList49 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList50 = null;
        fuzzTest0.FuzzTest_add(intList49, intList50, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList58 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList62 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest55.FuzzTest_add(intList58, intList62, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList67 = null;
        fuzzTest54.FuzzTest_add(intList62, intList67, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList72 = null;
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList76 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList80 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest73.FuzzTest_add(intList76, intList80, (java.lang.Integer) 1, true);
        fuzzTest71.FuzzTest_add(intList72, intList76, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList62, intList76, (java.lang.Integer) 1, false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList9 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_add(intList5, intList9, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest1.FuzzTest_add(intList9, intList14, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList22 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList26 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest19.FuzzTest_add(intList22, intList26, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList31 = null;
        fuzzTest18.FuzzTest_add(intList22, intList31, (java.lang.Integer) 0, true);
        c2s_aug.LinkedList<java.lang.Integer> intList35 = null;
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList43 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest36.FuzzTest_add(intList39, intList43, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList55 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest48.FuzzTest_add(intList51, intList55, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList63 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest36.FuzzTest_add(intList55, intList63, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList68 = null;
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList70 = null;
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList74 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList78 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest71.FuzzTest_add(intList74, intList78, (java.lang.Integer) 1, true);
        fuzzTest69.FuzzTest_add(intList70, intList74, (java.lang.Integer) 10, true);
        fuzzTest36.FuzzTest_add(intList68, intList74, (java.lang.Integer) 100, false);
        fuzzTest18.FuzzTest_add(intList35, intList74, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList9, intList74, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList17 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_add(intList17, intList21, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList26 = null;
        fuzzTest13.FuzzTest_add(intList17, intList26, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intList12, intList17, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList40 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList48 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_add(intList48, intList52, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest33.FuzzTest_add(intList52, intList60, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList65 = null;
        fuzzTest0.FuzzTest_add(intList52, intList65, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 0, 100, 100, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList75 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList80 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList75, intList80, (java.lang.Integer) 100, false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList16 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList28 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest1.FuzzTest_add(intList20, intList28, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList40 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList48 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_add(intList48, intList52, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest33.FuzzTest_add(intList52, intList60, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList20, intList52, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList4, intList13, (java.lang.Integer) 0, true);
        c2s_aug.LinkedList<java.lang.Integer> intList17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_add(intList21, intList25, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList33 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList37 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_add(intList33, intList37, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList45 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest18.FuzzTest_add(intList37, intList45, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList50 = null;
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_add(intList56, intList60, (java.lang.Integer) 1, true);
        fuzzTest51.FuzzTest_add(intList52, intList56, (java.lang.Integer) 10, true);
        fuzzTest18.FuzzTest_add(intList50, intList56, (java.lang.Integer) 100, false);
        fuzzTest0.FuzzTest_add(intList17, intList56, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList77 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList81 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest74.FuzzTest_add(intList77, intList81, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 0, 0, 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList91 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList81, intList91, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList8, intList13, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_add(intList21, intList25, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList30 = null;
        fuzzTest17.FuzzTest_add(intList21, intList30, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList37 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList41 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest34.FuzzTest_add(intList37, intList41, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList47 = null;
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList55 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest48.FuzzTest_add(intList51, intList55, (java.lang.Integer) 1, true);
        fuzzTest46.FuzzTest_add(intList47, intList51, (java.lang.Integer) 10, true);
        c2s_aug.LinkedList<java.lang.Integer> intList63 = null;
        fuzzTest34.FuzzTest_add(intList51, intList63, (java.lang.Integer) 1, false);
        c2s_aug.LinkedList<java.lang.Integer> intList67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList71 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList75 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest68.FuzzTest_add(intList71, intList75, (java.lang.Integer) 1, true);
        fuzzTest34.FuzzTest_add(intList67, intList75, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList21, intList75, (java.lang.Integer) 100, false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList4, intList13, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList24 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList32 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_add(intList32, intList36, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList44 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest17.FuzzTest_add(intList36, intList44, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_add(intList52, intList56, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList36, intList56, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList6 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList10 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzzTest3.FuzzTest_add(intList6, intList10, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList15 = null;
        fuzzTest2.FuzzTest_add(intList10, intList15, (java.lang.Integer) 0, false);
        c2s_aug.LinkedList<java.lang.Integer> intList19 = null;
        fuzzTest1.FuzzTest_add(intList10, intList19, (java.lang.Integer) (-1), false);
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest0.FuzzTest_add(intList10, intList23, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList30 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList34 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_add(intList30, intList34, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList43 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList48 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_add(intList48, intList52, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList64 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest57.FuzzTest_add(intList60, intList64, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList72 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest45.FuzzTest_add(intList64, intList72, (java.lang.Integer) 1, true);
        fuzzTest27.FuzzTest_add(intList43, intList72, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList83 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList87 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest80.FuzzTest_add(intList83, intList87, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList43, intList83, (java.lang.Integer) 1, false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList4, intList13, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest17.FuzzTest_add(intList21, intList23, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList31 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList35 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest28.FuzzTest_add(intList31, intList35, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList41 = null;
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList45 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList49 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest42.FuzzTest_add(intList45, intList49, (java.lang.Integer) 1, true);
        fuzzTest40.FuzzTest_add(intList41, intList45, (java.lang.Integer) 10, true);
        c2s_aug.LinkedList<java.lang.Integer> intList57 = null;
        fuzzTest28.FuzzTest_add(intList45, intList57, (java.lang.Integer) 1, false);
        c2s_aug.LinkedList<java.lang.Integer> intList61 = null;
        fuzzTest27.FuzzTest_add(intList45, intList61, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList21, intList45, (java.lang.Integer) 1, false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList17 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_add(intList17, intList21, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList29 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList33 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_add(intList29, intList33, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList41 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest14.FuzzTest_add(intList33, intList41, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intList13, intList33, (java.lang.Integer) 0, true);
        c2s_aug.LinkedList<java.lang.Integer> intList49 = null;
        fuzzTest0.FuzzTest_add(intList33, intList49, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList58 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList62 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest55.FuzzTest_add(intList58, intList62, (java.lang.Integer) 1, true);
        fuzzTest53.FuzzTest_add(intList54, intList58, (java.lang.Integer) 10, true);
        c2s_aug.LinkedList<java.lang.Integer> intList70 = null;
        fuzzTest0.FuzzTest_add(intList58, intList70, (java.lang.Integer) (-1), true);
        c2s_aug.LinkedList<java.lang.Integer> intList74 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList75 = null;
        fuzzTest0.FuzzTest_add(intList74, intList75, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList81 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList87 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        c2s_aug.LinkedList<java.lang.Integer> intList89 = null;
        fuzzTest83.FuzzTest_add(intList87, intList89, (java.lang.Integer) 0, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList81, intList87, (java.lang.Integer) 0, false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 0, 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        c2s_aug.LinkedList<java.lang.Integer> intList38 = null;
        fuzzTest0.FuzzTest_add(intList36, intList38, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList46 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList50 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest43.FuzzTest_add(intList46, intList50, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList55 = null;
        fuzzTest42.FuzzTest_add(intList46, intList55, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList63 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList67 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest60.FuzzTest_add(intList63, intList67, (java.lang.Integer) 1, true);
        c2s_aug.LinkedList<java.lang.Integer> intList72 = null;
        fuzzTest59.FuzzTest_add(intList63, intList72, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList46, intList63, (java.lang.Integer) (-1), false);
    }
}

