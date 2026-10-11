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
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection3 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection7, intArray6);
        fuzzTest0.FuzzTest_add(intCollection3, intCollection7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection15 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection19 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection19, intArray18);
        fuzzTest12.FuzzTest_add(intCollection15, intCollection19, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection27 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection31 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection31, intArray30);
        fuzzTest24.FuzzTest_add(intCollection27, intCollection31, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection19, intCollection31, (java.lang.Integer) 10, true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 0 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection4 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection11 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection11, intArray10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection15 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection15, intArray14);
        fuzzTest8.FuzzTest_add(intCollection11, intCollection15, (java.lang.Integer) 1, true);
        fuzzTest6.FuzzTest_add(intCollection7, intCollection11, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection26 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection26, intArray25);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection30 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection30, intArray29);
        fuzzTest23.FuzzTest_add(intCollection26, intCollection30, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection38 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection42 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection42, intArray41);
        fuzzTest35.FuzzTest_add(intCollection38, intCollection42, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection50 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection50, intArray49);
        fuzzTest23.FuzzTest_add(intCollection42, intCollection50, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection58 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection62 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection62, intArray61);
        fuzzTest55.FuzzTest_add(intCollection58, intCollection62, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection71 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection75 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection75, intArray74);
        fuzzTest68.FuzzTest_add(intCollection71, intCollection75, (java.lang.Integer) 1, true);
        fuzzTest55.FuzzTest_add(intCollection67, intCollection75, (java.lang.Integer) 1, false);
        fuzzTest6.FuzzTest_add(intCollection50, intCollection75, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection4, intCollection75, (java.lang.Integer) 10, false);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection3 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection7, intArray6);
        fuzzTest0.FuzzTest_add(intCollection3, intCollection7, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection16 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection20 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection20, intArray19);
        fuzzTest13.FuzzTest_add(intCollection16, intCollection20, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intCollection12, intCollection20, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection31 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection35 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection35, intArray34);
        fuzzTest28.FuzzTest_add(intCollection31, intCollection35, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection43 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection47 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection47, intArray46);
        fuzzTest40.FuzzTest_add(intCollection43, intCollection47, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection55 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection59 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection59, intArray58);
        fuzzTest52.FuzzTest_add(intCollection55, intCollection59, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection67 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection67, intArray66);
        fuzzTest40.FuzzTest_add(intCollection59, intCollection67, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection76 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection76, intArray75);
        fuzzTest28.FuzzTest_add(intCollection67, intCollection76, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection84 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection84, intArray83);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection88 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection88, intArray87);
        fuzzTest81.FuzzTest_add(intCollection84, intCollection88, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection76, intCollection88, (java.lang.Integer) 10, true);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection6 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection10 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection10, intArray9);
        fuzzTest3.FuzzTest_add(intCollection6, intCollection10, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intCollection2, intCollection6, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection23 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection27 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection27, intArray26);
        fuzzTest20.FuzzTest_add(intCollection23, intCollection27, (java.lang.Integer) 1, true);
        fuzzTest18.FuzzTest_add(intCollection19, intCollection23, (java.lang.Integer) 10, true);
        fuzzTest0.FuzzTest_add(intCollection6, intCollection19, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection43 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection47 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection47, intArray46);
        fuzzTest40.FuzzTest_add(intCollection43, intCollection47, (java.lang.Integer) 1, true);
        fuzzTest38.FuzzTest_add(intCollection39, intCollection43, (java.lang.Integer) 10, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection55 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection56 = null;
        fuzzTest38.FuzzTest_add(intCollection55, intCollection56, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection63 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection67 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection67, intArray66);
        fuzzTest60.FuzzTest_add(intCollection63, intCollection67, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection75 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection79 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection79, intArray78);
        fuzzTest72.FuzzTest_add(intCollection75, intCollection79, (java.lang.Integer) 1, true);
        fuzzTest38.FuzzTest_add(intCollection67, intCollection75, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 1, 100, 0, 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection92 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection92, intArray91);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection75, intCollection92, (java.lang.Integer) 10, true);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection3 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection7, intArray6);
        fuzzTest0.FuzzTest_add(intCollection3, intCollection7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection15 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection19 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection19, intArray18);
        fuzzTest12.FuzzTest_add(intCollection15, intCollection19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection27 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection27, intArray26);
        fuzzTest0.FuzzTest_add(intCollection19, intCollection27, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection35 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection39 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection39, intArray38);
        fuzzTest32.FuzzTest_add(intCollection35, intCollection39, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection44 = null;
        fuzzTest0.FuzzTest_add(intCollection35, intCollection44, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection48 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection49 = null;
        fuzzTest0.FuzzTest_add(intCollection48, intCollection49, (java.lang.Integer) 100, false);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection53 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection54 = null;
        fuzzTest0.FuzzTest_add(intCollection53, intCollection54, (java.lang.Integer) 0, false);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection58 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection59 = null;
        fuzzTest0.FuzzTest_add(intCollection58, intCollection59, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection66 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection66, intArray65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection70 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection70, intArray69);
        fuzzTest63.FuzzTest_add(intCollection66, intCollection70, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 100, 10, 10, 1 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection81 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection81, intArray80);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection66, intCollection81, (java.lang.Integer) 1, false);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection3 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection7, intArray6);
        fuzzTest0.FuzzTest_add(intCollection3, intCollection7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection15 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection19 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection19, intArray18);
        fuzzTest12.FuzzTest_add(intCollection15, intCollection19, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection24 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection25 = null;
        fuzzTest12.FuzzTest_add(intCollection24, intCollection25, (java.lang.Integer) (-1), false);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection29 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection30 = null;
        fuzzTest12.FuzzTest_add(intCollection29, intCollection30, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection37 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection41 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection41, intArray40);
        fuzzTest34.FuzzTest_add(intCollection37, intCollection41, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection46 = null;
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection50 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection54 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection54, intArray53);
        fuzzTest47.FuzzTest_add(intCollection50, intCollection54, (java.lang.Integer) 1, true);
        fuzzTest34.FuzzTest_add(intCollection46, intCollection54, (java.lang.Integer) 1, false);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection62 = null;
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 1, 1 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection67 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection67, intArray66);
        fuzzTest34.FuzzTest_add(intCollection62, intCollection67, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { (-1), 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection75 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection75, intArray74);
        fuzzTest12.FuzzTest_add(intCollection67, intCollection75, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection83 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection83, intArray82);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection87 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection87, intArray86);
        fuzzTest80.FuzzTest_add(intCollection83, intCollection87, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection75, intCollection87, (java.lang.Integer) 10, false);
    }
}

