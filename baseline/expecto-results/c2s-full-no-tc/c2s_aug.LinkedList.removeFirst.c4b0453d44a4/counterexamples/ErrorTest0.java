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
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeFirst(intList3, intList7, (java.lang.Integer) 1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeFirst(intList3, intList7, (java.lang.Integer) 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList11 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzzTest1.FuzzTest_removeFirst(intList5, intList11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest15.FuzzTest_removeFirst(intList19, intList25, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_removeFirst(intList5, intList25, (java.lang.Integer) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList33 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList45 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest35.FuzzTest_removeFirst(intList39, intList45, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeFirst(intList33, intList45, (java.lang.Integer) (-1));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList11 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzzTest1.FuzzTest_removeFirst(intList5, intList11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest15.FuzzTest_removeFirst(intList19, intList25, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_removeFirst(intList5, intList25, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList35 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList41 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest31.FuzzTest_removeFirst(intList35, intList41, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList49 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList55 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest45.FuzzTest_removeFirst(intList49, intList55, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList64 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList70 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest60.FuzzTest_removeFirst(intList64, intList70, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList78 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList84 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest74.FuzzTest_removeFirst(intList78, intList84, (java.lang.Integer) 0);
        fuzzTest59.FuzzTest_removeFirst(intList64, intList84, (java.lang.Integer) 1);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList93 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        fuzzTest45.FuzzTest_removeFirst(intList84, intList93, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeFirst(intList35, intList93, (java.lang.Integer) 100);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList11 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzzTest1.FuzzTest_removeFirst(intList5, intList11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 0, (-1), 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList26 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList32 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest22.FuzzTest_removeFirst(intList26, intList32, (java.lang.Integer) 0);
        fuzzTest15.FuzzTest_removeFirst(intList20, intList32, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_removeFirst(intList11, intList20, (java.lang.Integer) 0);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList48 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList54 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest44.FuzzTest_removeFirst(intList48, intList54, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeFirst(intList42, intList54, (java.lang.Integer) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList11 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzzTest1.FuzzTest_removeFirst(intList5, intList11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest15.FuzzTest_removeFirst(intList19, intList25, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_removeFirst(intList5, intList25, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest32.FuzzTest_removeFirst(intList36, intList42, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList50 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest46.FuzzTest_removeFirst(intList50, intList56, (java.lang.Integer) 0);
        fuzzTest31.FuzzTest_removeFirst(intList36, intList56, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1), 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList67 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList73 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList79 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest69.FuzzTest_removeFirst(intList73, intList79, (java.lang.Integer) 0);
        fuzzTest62.FuzzTest_removeFirst(intList67, intList79, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeFirst(intList36, intList67, (java.lang.Integer) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, (-1), 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList11 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList17 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest7.FuzzTest_removeFirst(intList11, intList17, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_removeFirst(intList5, intList17, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList33 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest23.FuzzTest_removeFirst(intList27, intList33, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList41 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList47 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest37.FuzzTest_removeFirst(intList41, intList47, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList62 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest52.FuzzTest_removeFirst(intList56, intList62, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList70 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList76 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest66.FuzzTest_removeFirst(intList70, intList76, (java.lang.Integer) 0);
        fuzzTest51.FuzzTest_removeFirst(intList56, intList76, (java.lang.Integer) 1);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList85 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest37.FuzzTest_removeFirst(intList76, intList85, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeFirst(intList27, intList85, (java.lang.Integer) (-1));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 1, 0, 100, 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest11.FuzzTest_removeFirst(intList15, intList21, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList29 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList35 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest25.FuzzTest_removeFirst(intList29, intList35, (java.lang.Integer) 0);
        fuzzTest10.FuzzTest_removeFirst(intList15, intList35, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList46 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest42.FuzzTest_removeFirst(intList46, intList52, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList66 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest56.FuzzTest_removeFirst(intList60, intList66, (java.lang.Integer) 0);
        fuzzTest41.FuzzTest_removeFirst(intList46, intList66, (java.lang.Integer) 1);
        fuzzTest9.FuzzTest_removeFirst(intList15, intList46, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeFirst(intList7, intList46, (java.lang.Integer) (-1));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList11 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzzTest1.FuzzTest_removeFirst(intList5, intList11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 0, (-1), 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList26 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList32 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest22.FuzzTest_removeFirst(intList26, intList32, (java.lang.Integer) 0);
        fuzzTest15.FuzzTest_removeFirst(intList20, intList32, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_removeFirst(intList11, intList20, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList44 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList50 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest40.FuzzTest_removeFirst(intList44, intList50, (java.lang.Integer) 0);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        c2s_aug.LinkedList<java.lang.Integer> intList58 = null;
        fuzzTest40.FuzzTest_removeFirst(intList56, intList58, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, (-1), 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList66 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList72 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList78 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest68.FuzzTest_removeFirst(intList72, intList78, (java.lang.Integer) 0);
        fuzzTest61.FuzzTest_removeFirst(intList66, intList78, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeFirst(intList56, intList66, (java.lang.Integer) 10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList10 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzzTest0.FuzzTest_removeFirst(intList4, intList10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest15.FuzzTest_removeFirst(intList19, intList25, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList33 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest29.FuzzTest_removeFirst(intList33, intList39, (java.lang.Integer) 0);
        fuzzTest14.FuzzTest_removeFirst(intList19, intList39, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1), 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList50 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList62 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest52.FuzzTest_removeFirst(intList56, intList62, (java.lang.Integer) 0);
        fuzzTest45.FuzzTest_removeFirst(intList50, intList62, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeFirst(intList19, intList50, (java.lang.Integer) 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_removeFirst(intList1, intList2, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList9 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest5.FuzzTest_removeFirst(intList9, intList15, (java.lang.Integer) 0);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest5.FuzzTest_removeFirst(intList21, intList23, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList30 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest26.FuzzTest_removeFirst(intList30, intList36, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList44 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList50 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest40.FuzzTest_removeFirst(intList44, intList50, (java.lang.Integer) 0);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 0, (-1), 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList59 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest26.FuzzTest_removeFirst(intList44, intList59, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeFirst(intList21, intList44, (java.lang.Integer) 10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, (-1), 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList13 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest9.FuzzTest_removeFirst(intList13, intList19, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_removeFirst(intList7, intList19, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_removeFirst(intList1, intList7, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList31 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList37 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest27.FuzzTest_removeFirst(intList31, intList37, (java.lang.Integer) 0);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList43 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        c2s_aug.LinkedList<java.lang.Integer> intList45 = null;
        fuzzTest27.FuzzTest_removeFirst(intList43, intList45, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList58 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest48.FuzzTest_removeFirst(intList52, intList58, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList66 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList72 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest62.FuzzTest_removeFirst(intList66, intList72, (java.lang.Integer) 0);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { (-1), 0, (-1), 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList81 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest48.FuzzTest_removeFirst(intList66, intList81, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeFirst(intList43, intList81, (java.lang.Integer) 100);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_removeFirst(intList1, intList2, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList10 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList16 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest6.FuzzTest_removeFirst(intList10, intList16, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList24 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList30 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest20.FuzzTest_removeFirst(intList24, intList30, (java.lang.Integer) 0);
        fuzzTest5.FuzzTest_removeFirst(intList10, intList30, (java.lang.Integer) 1);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 0, 10, 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList41 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList45 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest5.FuzzTest_removeFirst(intList41, intList45, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList54 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest50.FuzzTest_removeFirst(intList54, intList60, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList68 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList74 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest64.FuzzTest_removeFirst(intList68, intList74, (java.lang.Integer) 0);
        fuzzTest49.FuzzTest_removeFirst(intList54, intList74, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeFirst(intList45, intList54, (java.lang.Integer) 0);
    }
}

