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
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList16 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest13.FuzzTest_toArray(intList16, intList20, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList34 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest31.FuzzTest_toArray(intList34, intList38, intArray42);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest45.FuzzTest_toArray(intList48, intList52, intArray56);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] {};
        fuzzTest31.FuzzTest_toArray(intList44, intList52, intArray58);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList16, intList29, intArray58);
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
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest29.FuzzTest_toArray(intList32, intList36, intArray40);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList43 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest45.FuzzTest_toArray(intList48, intList52, intArray56);
        fuzzTest42.FuzzTest_toArray(intList43, intList44, intArray56);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList59 = null;
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10, 0, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList64 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] {};
        fuzzTest42.FuzzTest_toArray(intList59, intList64, intArray66);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList71 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList75 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest68.FuzzTest_toArray(intList71, intList75, intArray79);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList81 = null;
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList85 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList89 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest82.FuzzTest_toArray(intList85, intList89, intArray93);
        java.lang.Integer[] intArray95 = new java.lang.Integer[] {};
        fuzzTest68.FuzzTest_toArray(intList81, intList89, intArray95);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList36, intList64, intArray95);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), 0, 0, 10, 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList16 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest9.FuzzTest_toArray(intList12, intList16, intArray20);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList31 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList35 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest28.FuzzTest_toArray(intList31, intList35, intArray39);
        fuzzTest25.FuzzTest_toArray(intList26, intList27, intArray39);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList42 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList45 = null;
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10, 1, 100, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList51 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList56 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList60 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest53.FuzzTest_toArray(intList56, intList60, intArray64);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList74 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest67.FuzzTest_toArray(intList70, intList74, intArray78);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] {};
        fuzzTest53.FuzzTest_toArray(intList66, intList74, intArray80);
        fuzzTest44.FuzzTest_toArray(intList45, intList51, intArray80);
        fuzzTest25.FuzzTest_toArray(intList42, intList43, intArray80);
        fuzzTest22.FuzzTest_toArray(intList23, intList24, intArray80);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList7, intList12, intArray80);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest6.FuzzTest_toArray(intList9, intList13, intArray17);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest20.FuzzTest_toArray(intList23, intList27, intArray31);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] {};
        fuzzTest6.FuzzTest_toArray(intList19, intList27, intArray33);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10, 1, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest41.FuzzTest_toArray(intList44, intList48, intArray52);
        fuzzTest5.FuzzTest_toArray(intList27, intList39, intArray52);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList62 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest55.FuzzTest_toArray(intList58, intList62, intArray66);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList68 = null;
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList76 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest69.FuzzTest_toArray(intList72, intList76, intArray80);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] {};
        fuzzTest55.FuzzTest_toArray(intList68, intList76, intArray82);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList3, intList27, intArray82);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList5 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest2.FuzzTest_toArray(intList5, intList9, intArray13);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList22 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest15.FuzzTest_toArray(intList18, intList22, intArray26);
        fuzzTest0.FuzzTest_toArray(intList1, intList5, intArray26);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = null;
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        fuzzTest0.FuzzTest_toArray(intList29, intList30, intArray32);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList40 = null;
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest41.FuzzTest_toArray(intList44, intList48, intArray52);
        fuzzTest38.FuzzTest_toArray(intList39, intList40, intArray52);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList62 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest55.FuzzTest_toArray(intList58, intList62, intArray66);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList68 = null;
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList71 = null;
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList75 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList79 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 10 };
        fuzzTest72.FuzzTest_toArray(intList75, intList79, intArray83);
        fuzzTest69.FuzzTest_toArray(intList70, intList71, intArray83);
        fuzzTest38.FuzzTest_toArray(intList58, intList68, intArray83);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 100, 1, 10, 0 };
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList36, intList58, intArray91);
    }
}

