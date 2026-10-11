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
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_remove(intList15, intList19, (-1), (java.lang.Integer) 1);
        c2s_aug.LinkedList<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList28 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList32 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_remove(intList28, intList32, (-1), (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_remove(intList24, intList32, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList43 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList47 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_remove(intList43, intList47, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList55 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList59 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest52.FuzzTest_remove(intList55, intList59, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList67 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest40.FuzzTest_remove(intList59, intList67, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList32, intList59, 0, (java.lang.Integer) 100);
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
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList16 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_remove(intList21, intList25, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList33 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList37 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_remove(intList33, intList37, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList45 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest18.FuzzTest_remove(intList37, intList45, (int) '4', (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_remove(intList16, intList45, (int) (byte) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList61 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList65 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_remove(intList61, intList65, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList73 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList77 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest70.FuzzTest_remove(intList73, intList77, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList85 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest58.FuzzTest_remove(intList77, intList85, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList56, intList77, (int) (short) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList9 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_remove(intList5, intList9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList1, intList5, 10, (java.lang.Integer) (-1));
        c2s_aug.LinkedList<java.lang.Integer> intList17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_remove(intList21, intList25, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList34 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList43 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest36.FuzzTest_remove(intList39, intList43, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList55 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest48.FuzzTest_remove(intList51, intList55, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList63 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest36.FuzzTest_remove(intList55, intList63, (int) '4', (java.lang.Integer) 10);
        fuzzTest18.FuzzTest_remove(intList34, intList63, (int) (byte) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList17, intList34, (int) '#', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList77 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList81 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest74.FuzzTest_remove(intList77, intList81, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList88 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList77, intList88, (int) (byte) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList9 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_remove(intList5, intList9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList1, intList5, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList24 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_remove(intList20, intList24, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList34 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_remove(intList34, intList38, (-1), (java.lang.Integer) 1);
        fuzzTest29.FuzzTest_remove(intList30, intList34, 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_remove(intList20, intList30, (int) (short) 100, (java.lang.Integer) 10);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList57 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList61 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest54.FuzzTest_remove(intList57, intList61, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList69 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList73 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest66.FuzzTest_remove(intList69, intList73, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList81 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest54.FuzzTest_remove(intList73, intList81, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList52, intList73, 0, (java.lang.Integer) 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_remove(intList1, intList2, 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList9 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList13 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest6.FuzzTest_remove(intList9, intList13, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList22 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList26 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest19.FuzzTest_remove(intList22, intList26, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList34 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_remove(intList34, intList38, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList47 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_remove(intList52, intList56, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList64 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList68 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_remove(intList64, intList68, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList76 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest49.FuzzTest_remove(intList68, intList76, (int) '4', (java.lang.Integer) 10);
        fuzzTest31.FuzzTest_remove(intList47, intList76, (int) (byte) -1, (java.lang.Integer) 100);
        fuzzTest18.FuzzTest_remove(intList26, intList76, (int) (short) -1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList9, intList76, (int) (byte) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList8 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_remove(intList4, intList8, (-1), (java.lang.Integer) 1);
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList17 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_remove(intList17, intList21, (-1), (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_remove(intList13, intList21, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList32 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_remove(intList32, intList36, (-1), (java.lang.Integer) 1);
        c2s_aug.LinkedList<java.lang.Integer> intList41 = null;
        fuzzTest1.FuzzTest_remove(intList36, intList41, 100, (java.lang.Integer) (-1));
        c2s_aug.LinkedList<java.lang.Integer> intList45 = null;
        fuzzTest0.FuzzTest_remove(intList36, intList45, (int) (short) -1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), (-1), (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList59 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList52, intList59, 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_remove(intList15, intList19, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_remove(intList19, intList27, (int) '4', (java.lang.Integer) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList35 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-1), 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList40 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList35, intList40, (int) (byte) 1, (java.lang.Integer) 0);
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
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        c2s_aug.LinkedList<java.lang.Integer> intList12 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_remove(intList12, intList13, (int) (byte) -1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList24 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_remove(intList20, intList24, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList32 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_remove(intList32, intList36, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList44 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest17.FuzzTest_remove(intList36, intList44, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList50 = null;
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList54 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList58 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest51.FuzzTest_remove(intList54, intList58, (-1), (java.lang.Integer) 1);
        fuzzTest49.FuzzTest_remove(intList50, intList54, 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList36, intList54, (int) (short) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_remove(intList15, intList19, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_remove(intList19, intList27, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList35 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_remove(intList35, intList39, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList47 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_remove(intList47, intList51, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList39, intList51, (int) (byte) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_remove(intList1, intList2, 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList11 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest8.FuzzTest_remove(intList11, intList15, (-1), (java.lang.Integer) 1);
        fuzzTest6.FuzzTest_remove(intList7, intList11, 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        c2s_aug.LinkedList<java.lang.Integer> intList27 = null;
        fuzzTest6.FuzzTest_remove(intList25, intList27, 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList34 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_remove(intList34, intList38, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 0, 1, 100, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList48 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest6.FuzzTest_remove(intList38, intList48, (int) '4', (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList58 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList62 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest55.FuzzTest_remove(intList58, intList62, (-1), (java.lang.Integer) 1);
        fuzzTest53.FuzzTest_remove(intList54, intList58, 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList38, intList58, 0, (java.lang.Integer) 1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_remove(intList1, intList2, 10, (java.lang.Integer) 0);
        c2s_aug.LinkedList<java.lang.Integer> intList6 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList7 = null;
        fuzzTest0.FuzzTest_remove(intList6, intList7, 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList14 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList18 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest11.FuzzTest_remove(intList14, intList18, (-1), (java.lang.Integer) 1);
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList31 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_remove(intList27, intList31, (-1), (java.lang.Integer) 1);
        fuzzTest11.FuzzTest_remove(intList23, intList31, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList46 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest39.FuzzTest_remove(intList42, intList46, (-1), (java.lang.Integer) 1);
        c2s_aug.LinkedList<java.lang.Integer> intList51 = null;
        fuzzTest11.FuzzTest_remove(intList46, intList51, 100, (java.lang.Integer) (-1));
        c2s_aug.LinkedList<java.lang.Integer> intList55 = null;
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 1, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest11.FuzzTest_remove(intList55, intList60, (int) (byte) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList68 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList72 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_remove(intList68, intList72, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList60, intList72, (int) (short) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList1 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_remove(intList1, intList2, 10, (java.lang.Integer) 0);
        c2s_aug.LinkedList<java.lang.Integer> intList6 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList7 = null;
        fuzzTest0.FuzzTest_remove(intList6, intList7, (int) (short) 100, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList16 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        fuzzTest11.FuzzTest_remove(intList12, intList16, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList31 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList35 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest28.FuzzTest_remove(intList31, intList35, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList41 = null;
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList45 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList49 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest42.FuzzTest_remove(intList45, intList49, (-1), (java.lang.Integer) 1);
        fuzzTest40.FuzzTest_remove(intList41, intList45, 10, (java.lang.Integer) (-1));
        fuzzTest11.FuzzTest_remove(intList31, intList41, (int) (short) 100, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList63 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList67 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest60.FuzzTest_remove(intList63, intList67, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList31, intList63, (int) (byte) 0, (java.lang.Integer) 10);
    }
}

