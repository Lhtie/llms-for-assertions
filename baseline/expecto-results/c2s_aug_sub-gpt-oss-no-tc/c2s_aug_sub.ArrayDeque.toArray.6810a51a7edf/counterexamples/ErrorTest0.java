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
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue7 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue12 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue16 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest9.FuzzTest_toArray(intQueue12, intQueue16, intArray20);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue25 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue29 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest22.FuzzTest_toArray(intQueue25, intQueue29, intArray33);
        fuzzTest0.FuzzTest_toArray(intQueue7, intQueue16, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue39 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue43 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest36.FuzzTest_toArray(intQueue39, intQueue43, intArray47);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue53 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue57 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest50.FuzzTest_toArray(intQueue53, intQueue57, intArray61);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] {};
        fuzzTest36.FuzzTest_toArray(intQueue49, intQueue57, intArray63);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0, 100, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue69 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        java.lang.Integer[] intArray71 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue57, intQueue69, intArray71);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue4 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue8 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest1.FuzzTest_toArray(intQueue4, intQueue8, intArray12);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue21 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue26 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue30 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest23.FuzzTest_toArray(intQueue26, intQueue30, intArray34);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue39 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue43 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest36.FuzzTest_toArray(intQueue39, intQueue43, intArray47);
        fuzzTest14.FuzzTest_toArray(intQueue21, intQueue30, intArray47);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue53 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue57 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest50.FuzzTest_toArray(intQueue53, intQueue57, intArray61);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] {};
        fuzzTest1.FuzzTest_toArray(intQueue21, intQueue57, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, (-1), 0, 0 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue70 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        java.lang.Integer[] intArray72 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue21, intQueue70, intArray72);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue3 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue7 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest0.FuzzTest_toArray(intQueue3, intQueue7, intArray11);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue17 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue21 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest14.FuzzTest_toArray(intQueue17, intQueue21, intArray25);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] {};
        fuzzTest0.FuzzTest_toArray(intQueue13, intQueue21, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-1), 1, 0, 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue34 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue39 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue43 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest36.FuzzTest_toArray(intQueue39, intQueue43, intArray47);
        java.lang.Integer[] intArray49 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue34, intQueue43, intArray49);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue3 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue7 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest0.FuzzTest_toArray(intQueue3, intQueue7, intArray11);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue16 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue20 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest13.FuzzTest_toArray(intQueue16, intQueue20, intArray24);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue33 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue38 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue42 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest35.FuzzTest_toArray(intQueue38, intQueue42, intArray46);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue51 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue55 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest48.FuzzTest_toArray(intQueue51, intQueue55, intArray59);
        fuzzTest26.FuzzTest_toArray(intQueue33, intQueue42, intArray59);
        java.lang.Integer[] intArray62 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue16, intQueue33, intArray62);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue3 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue7 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest0.FuzzTest_toArray(intQueue3, intQueue7, intArray11);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue16 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue20 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest13.FuzzTest_toArray(intQueue16, intQueue20, intArray24);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue29 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue33 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest26.FuzzTest_toArray(intQueue29, intQueue33, intArray37);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue42 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue46 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest39.FuzzTest_toArray(intQueue42, intQueue46, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue55 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue60 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue64 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest57.FuzzTest_toArray(intQueue60, intQueue64, intArray68);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue70 = null;
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue74 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue78 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest71.FuzzTest_toArray(intQueue74, intQueue78, intArray82);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] {};
        fuzzTest57.FuzzTest_toArray(intQueue70, intQueue78, intArray84);
        fuzzTest26.FuzzTest_toArray(intQueue42, intQueue55, intArray84);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 1 };
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue16, intQueue55, intArray88);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue3 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue7 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest0.FuzzTest_toArray(intQueue3, intQueue7, intArray11);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { (-1), 100, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue17 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue26 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue31 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue35 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest28.FuzzTest_toArray(intQueue31, intQueue35, intArray39);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue44 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue48 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest41.FuzzTest_toArray(intQueue44, intQueue48, intArray52);
        fuzzTest19.FuzzTest_toArray(intQueue26, intQueue35, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0 };
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue17, intQueue35, intArray56);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue3 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue7 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest0.FuzzTest_toArray(intQueue3, intQueue7, intArray11);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue17 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue21 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest14.FuzzTest_toArray(intQueue17, intQueue21, intArray25);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] {};
        fuzzTest0.FuzzTest_toArray(intQueue13, intQueue21, intArray27);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue32 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue36 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest29.FuzzTest_toArray(intQueue32, intQueue36, intArray40);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue50 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue55 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue59 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest52.FuzzTest_toArray(intQueue55, intQueue59, intArray63);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue68 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue72 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest65.FuzzTest_toArray(intQueue68, intQueue72, intArray76);
        fuzzTest43.FuzzTest_toArray(intQueue50, intQueue59, intArray76);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue82 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue86 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest79.FuzzTest_toArray(intQueue82, intQueue86, intArray90);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 0, 10 };
        fuzzTest42.FuzzTest_toArray(intQueue50, intQueue82, intArray94);
        java.lang.Integer[] intArray96 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue36, intQueue50, intArray96);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue1 = null;
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue10 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue15 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue19 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest12.FuzzTest_toArray(intQueue15, intQueue19, intArray23);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue28 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue32 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest25.FuzzTest_toArray(intQueue28, intQueue32, intArray36);
        fuzzTest3.FuzzTest_toArray(intQueue10, intQueue19, intArray36);
        fuzzTest0.FuzzTest_toArray(intQueue1, intQueue2, intArray36);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue43 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue47 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest40.FuzzTest_toArray(intQueue43, intQueue47, intArray51);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue56 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue60 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest53.FuzzTest_toArray(intQueue56, intQueue60, intArray64);
        java.lang.Integer[] intArray66 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue43, intQueue60, intArray66);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue4 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue8 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest1.FuzzTest_toArray(intQueue4, intQueue8, intArray12);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue21 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue26 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue30 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest23.FuzzTest_toArray(intQueue26, intQueue30, intArray34);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue39 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue43 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest36.FuzzTest_toArray(intQueue39, intQueue43, intArray47);
        fuzzTest14.FuzzTest_toArray(intQueue21, intQueue30, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, (-1), 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue54 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, (-1), 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue60 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue65 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue69 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest62.FuzzTest_toArray(intQueue65, intQueue69, intArray73);
        fuzzTest14.FuzzTest_toArray(intQueue54, intQueue60, intArray73);
        java.lang.Integer[] intArray76 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue8, intQueue54, intArray76);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 1, 0, 0 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue6 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue15 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue20 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue24 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest17.FuzzTest_toArray(intQueue20, intQueue24, intArray28);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue33 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue37 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest30.FuzzTest_toArray(intQueue33, intQueue37, intArray41);
        fuzzTest8.FuzzTest_toArray(intQueue15, intQueue24, intArray41);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue47 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue51 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest44.FuzzTest_toArray(intQueue47, intQueue51, intArray55);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue61 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue65 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest58.FuzzTest_toArray(intQueue61, intQueue65, intArray69);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] {};
        fuzzTest44.FuzzTest_toArray(intQueue57, intQueue65, intArray71);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue76 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue80 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest73.FuzzTest_toArray(intQueue76, intQueue80, intArray84);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue86 = null;
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 1, 0, 10, 10, 10 };
        fuzzTest44.FuzzTest_toArray(intQueue76, intQueue86, intArray92);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue6, intQueue15, intArray92);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue3 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue7 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest0.FuzzTest_toArray(intQueue3, intQueue7, intArray11);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue16 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue20 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest13.FuzzTest_toArray(intQueue16, intQueue20, intArray24);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue34 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue39 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue43 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest36.FuzzTest_toArray(intQueue39, intQueue43, intArray47);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue52 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue56 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest49.FuzzTest_toArray(intQueue52, intQueue56, intArray60);
        fuzzTest27.FuzzTest_toArray(intQueue34, intQueue43, intArray60);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, 100, 1 };
        fuzzTest13.FuzzTest_toArray(intQueue26, intQueue34, intArray66);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue71 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue75 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest68.FuzzTest_toArray(intQueue71, intQueue75, intArray79);
        java.lang.Integer[] intArray81 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue34, intQueue75, intArray81);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue4 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue8 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest1.FuzzTest_toArray(intQueue4, intQueue8, intArray12);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue14 = null;
        java.lang.Integer[] intArray15 = null;
        fuzzTest0.FuzzTest_toArray(intQueue4, intQueue14, intArray15);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue20 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue24 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest17.FuzzTest_toArray(intQueue20, intQueue24, intArray28);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue33 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue37 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest30.FuzzTest_toArray(intQueue33, intQueue37, intArray41);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue47 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue51 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest44.FuzzTest_toArray(intQueue47, intQueue51, intArray55);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] {};
        fuzzTest30.FuzzTest_toArray(intQueue43, intQueue51, intArray57);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue62 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue66 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest59.FuzzTest_toArray(intQueue62, intQueue66, intArray70);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue72 = null;
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 0, 10, 10, 10 };
        fuzzTest30.FuzzTest_toArray(intQueue62, intQueue72, intArray78);
        java.lang.Integer[] intArray80 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue24, intQueue62, intArray80);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue3 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue7 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest0.FuzzTest_toArray(intQueue3, intQueue7, intArray11);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue17 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue21 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest14.FuzzTest_toArray(intQueue17, intQueue21, intArray25);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] {};
        fuzzTest0.FuzzTest_toArray(intQueue13, intQueue21, intArray27);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue32 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue36 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest29.FuzzTest_toArray(intQueue32, intQueue36, intArray40);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue42 = null;
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, 0, 10, 10, 10 };
        fuzzTest0.FuzzTest_toArray(intQueue32, intQueue42, intArray48);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue53 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue57 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest50.FuzzTest_toArray(intQueue53, intQueue57, intArray61);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10, 0, (-1), 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue68 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        java.lang.Integer[] intArray70 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue53, intQueue68, intArray70);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue4 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue8 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest1.FuzzTest_toArray(intQueue4, intQueue8, intArray12);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue18 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue22 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest15.FuzzTest_toArray(intQueue18, intQueue22, intArray26);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] {};
        fuzzTest1.FuzzTest_toArray(intQueue14, intQueue22, intArray28);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue33 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue37 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest30.FuzzTest_toArray(intQueue33, intQueue37, intArray41);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue50 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue55 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue59 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest52.FuzzTest_toArray(intQueue55, intQueue59, intArray63);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue68 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue72 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest65.FuzzTest_toArray(intQueue68, intQueue72, intArray76);
        fuzzTest43.FuzzTest_toArray(intQueue50, intQueue59, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100 };
        fuzzTest1.FuzzTest_toArray(intQueue33, intQueue59, intArray80);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { (-1), 0, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue86 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        java.lang.Integer[] intArray88 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue59, intQueue86, intArray88);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue8 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue13 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue17 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest10.FuzzTest_toArray(intQueue13, intQueue17, intArray21);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue26 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue30 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest23.FuzzTest_toArray(intQueue26, intQueue30, intArray34);
        fuzzTest1.FuzzTest_toArray(intQueue8, intQueue17, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, (-1), 1 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue41 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0, (-1), 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue47 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue52 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue56 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest49.FuzzTest_toArray(intQueue52, intQueue56, intArray60);
        fuzzTest1.FuzzTest_toArray(intQueue41, intQueue47, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue65 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.lang.Integer[] intArray67 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue41, intQueue65, intArray67);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue8 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue13 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue17 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest10.FuzzTest_toArray(intQueue13, intQueue17, intArray21);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue26 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue30 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest23.FuzzTest_toArray(intQueue26, intQueue30, intArray34);
        fuzzTest1.FuzzTest_toArray(intQueue8, intQueue17, intArray34);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue41 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue45 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest38.FuzzTest_toArray(intQueue41, intQueue45, intArray49);
        java.lang.Integer[] intArray51 = null;
        fuzzTest1.FuzzTest_toArray(intQueue37, intQueue41, intArray51);
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue53 = null;
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue57 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue62 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue66 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest59.FuzzTest_toArray(intQueue62, intQueue66, intArray70);
        fuzzTest1.FuzzTest_toArray(intQueue53, intQueue57, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100, 100, (-1) };
        c2s_aug_sub.ArrayDeque<java.lang.Integer> intQueue77 = new c2s_aug_sub.ArrayDeque<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray79 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue57, intQueue77, intArray79);
    }
}

