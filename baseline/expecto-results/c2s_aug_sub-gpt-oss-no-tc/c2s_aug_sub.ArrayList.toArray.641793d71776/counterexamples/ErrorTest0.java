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
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest0.FuzzTest_toArray(intList3, intList7, intArray11);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList17 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest14.FuzzTest_toArray(intList17, intList21, intArray25);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] {};
        fuzzTest0.FuzzTest_toArray(intList13, intList21, intArray27);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList45 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest38.FuzzTest_toArray(intList41, intList45, intArray49);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList54 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest51.FuzzTest_toArray(intList54, intList58, intArray62);
        fuzzTest29.FuzzTest_toArray(intList36, intList45, intArray62);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList69 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0 };
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList45, intList69, intArray72);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest0.FuzzTest_toArray(intList3, intList7, intArray11);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList16 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest13.FuzzTest_toArray(intList16, intList20, intArray24);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList33 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest26.FuzzTest_toArray(intList29, intList33, intArray37);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList42 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList46 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest39.FuzzTest_toArray(intList42, intList46, intArray50);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList56 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList60 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest53.FuzzTest_toArray(intList56, intList60, intArray64);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] {};
        fuzzTest39.FuzzTest_toArray(intList52, intList60, intArray66);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList71 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList75 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest68.FuzzTest_toArray(intList71, intList75, intArray79);
        fuzzTest13.FuzzTest_toArray(intList29, intList60, intArray79);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList85 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 1 };
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList60, intList85, intArray88);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 0, 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList5 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList14 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest7.FuzzTest_toArray(intList10, intList14, intArray18);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest20.FuzzTest_toArray(intList23, intList27, intArray31);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest34.FuzzTest_toArray(intList37, intList41, intArray45);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] {};
        fuzzTest20.FuzzTest_toArray(intList33, intList41, intArray47);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList56 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest49.FuzzTest_toArray(intList52, intList56, intArray60);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList62 = null;
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 0, 10, 10, 10 };
        fuzzTest20.FuzzTest_toArray(intList52, intList62, intArray68);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList71 = null;
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { (-1) };
        fuzzTest20.FuzzTest_toArray(intList70, intList71, intArray73);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList5, intList10, intArray73);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, (-1), 100 };
        fuzzTest0.FuzzTest_toArray(intList1, intList2, intArray6);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList15 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest17.FuzzTest_toArray(intList20, intList24, intArray28);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList33 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest30.FuzzTest_toArray(intList33, intList37, intArray41);
        fuzzTest8.FuzzTest_toArray(intList15, intList24, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1), 1, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList53 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList57 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest50.FuzzTest_toArray(intList53, intList57, intArray61);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] {};
        fuzzTest8.FuzzTest_toArray(intList48, intList57, intArray63);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList67 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0 };
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList48, intList67, intArray70);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList17 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest10.FuzzTest_toArray(intList13, intList17, intArray21);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest23.FuzzTest_toArray(intList26, intList30, intArray34);
        fuzzTest1.FuzzTest_toArray(intList8, intList17, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1), 1, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList46 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList50 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest43.FuzzTest_toArray(intList46, intList50, intArray54);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] {};
        fuzzTest1.FuzzTest_toArray(intList41, intList50, intArray56);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList61 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest58.FuzzTest_toArray(intList61, intList65, intArray69);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = null;
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList76 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList80 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest73.FuzzTest_toArray(intList76, intList80, intArray84);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 1, 1, 1 };
        fuzzTest71.FuzzTest_toArray(intList72, intList76, intArray89);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList41, intList61, intArray89);
    }
}

