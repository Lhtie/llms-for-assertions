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
        c2s_aug.TreeList<java.lang.Integer> intList3 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList15 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList19 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_remove(intList15, intList19, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList28 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList32 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_remove(intList28, intList32, (-1), (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_remove(intList24, intList32, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList43 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList47 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_remove(intList43, intList47, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList55 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList59 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest52.FuzzTest_remove(intList55, intList59, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList67 = new c2s_aug.TreeList<java.lang.Integer>();
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
        c2s_aug.TreeList<java.lang.Integer> intList3 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.TreeList<java.lang.Integer> intList16 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList21 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList25 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_remove(intList21, intList25, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList33 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList37 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_remove(intList33, intList37, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList45 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest18.FuzzTest_remove(intList37, intList45, (int) '4', (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_remove(intList16, intList45, (int) (byte) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.TreeList<java.lang.Integer> intList56 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList61 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList65 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_remove(intList61, intList65, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList73 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList77 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest70.FuzzTest_remove(intList73, intList77, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList85 = new c2s_aug.TreeList<java.lang.Integer>();
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
        c2s_aug.TreeList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList5 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList9 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_remove(intList5, intList9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList1, intList5, 10, (java.lang.Integer) (-1));
        c2s_aug.TreeList<java.lang.Integer> intList17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList21 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList25 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_remove(intList21, intList25, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.TreeList<java.lang.Integer> intList34 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList39 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList43 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest36.FuzzTest_remove(intList39, intList43, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList51 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList55 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest48.FuzzTest_remove(intList51, intList55, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList63 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest36.FuzzTest_remove(intList55, intList63, (int) '4', (java.lang.Integer) 10);
        fuzzTest18.FuzzTest_remove(intList34, intList63, (int) (byte) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList17, intList34, (int) '#', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList77 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList81 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest74.FuzzTest_remove(intList77, intList81, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList88 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList77, intList88, (int) (byte) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList3 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.TreeList<java.lang.Integer> intList15 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList20 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList24 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_remove(intList20, intList24, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.TreeList<java.lang.Integer> intList33 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList38 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList42 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_remove(intList38, intList42, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList50 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList54 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest47.FuzzTest_remove(intList50, intList54, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList62 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest35.FuzzTest_remove(intList54, intList62, (int) '4', (java.lang.Integer) 10);
        fuzzTest17.FuzzTest_remove(intList33, intList62, (int) (byte) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList73 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList77 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest70.FuzzTest_remove(intList73, intList77, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList85 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList89 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        fuzzTest82.FuzzTest_remove(intList85, intList89, (-1), (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_remove(intList77, intList85, (int) '4', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList15, intList85, 1, (java.lang.Integer) 10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList4 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList8 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_remove(intList4, intList8, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList16 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList20 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList29 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList33 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_remove(intList29, intList33, (-1), (java.lang.Integer) 1);
        fuzzTest13.FuzzTest_remove(intList25, intList33, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList44 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList48 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_remove(intList44, intList48, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList53 = null;
        fuzzTest13.FuzzTest_remove(intList48, intList53, 100, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList60 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList64 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest57.FuzzTest_remove(intList60, intList64, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, (-1), 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList74 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest13.FuzzTest_remove(intList60, intList74, (int) (short) 100, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList8, intList74, 0, (java.lang.Integer) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList5 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList9 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_remove(intList5, intList9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList1, intList5, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList20 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList24 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_remove(intList20, intList24, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList34 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList38 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_remove(intList34, intList38, (-1), (java.lang.Integer) 1);
        fuzzTest29.FuzzTest_remove(intList30, intList34, 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_remove(intList20, intList30, (int) (short) 100, (java.lang.Integer) 10);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0 };
        c2s_aug.TreeList<java.lang.Integer> intList51 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList56 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList60 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_remove(intList56, intList60, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList51, intList56, 0, (java.lang.Integer) 100);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList4 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList8 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_remove(intList4, intList8, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList16 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList20 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList29 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList33 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_remove(intList29, intList33, (-1), (java.lang.Integer) 1);
        fuzzTest13.FuzzTest_remove(intList25, intList33, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList44 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList48 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_remove(intList44, intList48, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList53 = null;
        fuzzTest13.FuzzTest_remove(intList48, intList53, 100, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_remove(intList4, intList53, (int) (short) 100, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList63 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList67 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest60.FuzzTest_remove(intList63, intList67, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1, 1 };
        c2s_aug.TreeList<java.lang.Integer> intList75 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList63, intList75, 0, (java.lang.Integer) 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList3 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList15 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList19 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_remove(intList15, intList19, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.TreeList<java.lang.Integer> intList28 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList33 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList37 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_remove(intList33, intList37, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList45 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList49 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest42.FuzzTest_remove(intList45, intList49, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList57 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest30.FuzzTest_remove(intList49, intList57, (int) '4', (java.lang.Integer) 10);
        fuzzTest12.FuzzTest_remove(intList28, intList57, (int) (byte) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList68 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList72 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_remove(intList68, intList72, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList77 = null;
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList81 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList85 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest78.FuzzTest_remove(intList81, intList85, (-1), (java.lang.Integer) 1);
        fuzzTest65.FuzzTest_remove(intList77, intList85, (int) 'a', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList57, intList85, (int) (byte) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList6 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList10 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzzTest3.FuzzTest_remove(intList6, intList10, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList15 = null;
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList19 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList23 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest16.FuzzTest_remove(intList19, intList23, (-1), (java.lang.Integer) 1);
        fuzzTest3.FuzzTest_remove(intList15, intList23, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList34 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList38 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_remove(intList34, intList38, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList43 = null;
        fuzzTest3.FuzzTest_remove(intList38, intList43, 100, (java.lang.Integer) (-1));
        c2s_aug.TreeList<java.lang.Integer> intList47 = null;
        fuzzTest2.FuzzTest_remove(intList38, intList47, (int) (short) -1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.TreeList<java.lang.Integer> intList54 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList61 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList65 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_remove(intList61, intList65, (-1), (java.lang.Integer) 1);
        fuzzTest56.FuzzTest_remove(intList57, intList61, 10, (java.lang.Integer) (-1));
        fuzzTest2.FuzzTest_remove(intList54, intList57, 10, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_remove(intList1, intList57, (int) (byte) -1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 1, (-1), (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList83 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzztests.FuzzTest fuzzTest85 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList88 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList92 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        fuzzTest85.FuzzTest_remove(intList88, intList92, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList83, intList88, (int) (short) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList4 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList8 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_remove(intList4, intList8, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList17 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList21 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_remove(intList17, intList21, (-1), (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_remove(intList13, intList21, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList32 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList36 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_remove(intList32, intList36, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList41 = null;
        fuzzTest1.FuzzTest_remove(intList36, intList41, 100, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList48 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList52 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_remove(intList48, intList52, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100, (-1), 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList62 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest1.FuzzTest_remove(intList48, intList62, (int) (short) 100, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList70 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList74 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest67.FuzzTest_remove(intList70, intList74, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList79 = null;
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList83 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList87 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest80.FuzzTest_remove(intList83, intList87, (-1), (java.lang.Integer) 1);
        fuzzTest67.FuzzTest_remove(intList79, intList87, (int) 'a', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList48, intList87, 0, (java.lang.Integer) 1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList3 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList16 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList20 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList12, intList20, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList29 = null;
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 100 };
        c2s_aug.TreeList<java.lang.Integer> intList33 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest28.FuzzTest_remove(intList29, intList33, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList41 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList45 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest38.FuzzTest_remove(intList41, intList45, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList33, intList41, 1, (java.lang.Integer) 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList3 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList16 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList20 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList12, intList20, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList31 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList35 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest28.FuzzTest_remove(intList31, intList35, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList40 = null;
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList44 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList48 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_remove(intList44, intList48, (-1), (java.lang.Integer) 1);
        fuzzTest28.FuzzTest_remove(intList40, intList48, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList59 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList63 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_remove(intList59, intList63, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList40, intList59, 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList74 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList78 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest71.FuzzTest_remove(intList74, intList78, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10, 100 };
        c2s_aug.TreeList<java.lang.Integer> intList86 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList78, intList86, 0, (java.lang.Integer) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList3 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList16 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList20 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList12, intList16, (int) (short) 0, (java.lang.Integer) 10);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1 };
        c2s_aug.TreeList<java.lang.Integer> intList30 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList33 = null;
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 100 };
        c2s_aug.TreeList<java.lang.Integer> intList37 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest32.FuzzTest_remove(intList33, intList37, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList45 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList49 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest42.FuzzTest_remove(intList45, intList49, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList58 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList62 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest55.FuzzTest_remove(intList58, intList62, (-1), (java.lang.Integer) 1);
        fuzzTest42.FuzzTest_remove(intList54, intList62, (int) '4', (java.lang.Integer) 10);
        c2s_aug.TreeList<java.lang.Integer> intList70 = null;
        fuzzTest32.FuzzTest_remove(intList62, intList70, 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList30, intList62, (int) (byte) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList3 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 100 };
        c2s_aug.TreeList<java.lang.Integer> intList17 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest12.FuzzTest_remove(intList13, intList17, 0, (java.lang.Integer) 0);
        c2s_aug.TreeList<java.lang.Integer> intList22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList28 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList32 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_remove(intList28, intList32, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.TreeList<java.lang.Integer> intList41 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList46 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList50 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest43.FuzzTest_remove(intList46, intList50, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList58 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList62 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest55.FuzzTest_remove(intList58, intList62, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList70 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest43.FuzzTest_remove(intList62, intList70, (int) '4', (java.lang.Integer) 10);
        fuzzTest25.FuzzTest_remove(intList41, intList70, (int) (byte) -1, (java.lang.Integer) 100);
        fuzzTest23.FuzzTest_remove(intList24, intList70, 10, (java.lang.Integer) 100);
        fuzzTest12.FuzzTest_remove(intList22, intList70, (int) (byte) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList87 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList91 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        fuzzTest84.FuzzTest_remove(intList87, intList91, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList70, intList91, 1, (java.lang.Integer) 100);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList3 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList18 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList22 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest15.FuzzTest_remove(intList18, intList22, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList30 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList34 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest27.FuzzTest_remove(intList30, intList34, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList42 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest15.FuzzTest_remove(intList34, intList42, (int) '4', (java.lang.Integer) 10);
        fuzzTest13.FuzzTest_remove(intList14, intList34, 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList53 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList57 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest50.FuzzTest_remove(intList53, intList57, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList65 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList69 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest62.FuzzTest_remove(intList65, intList69, (-1), (java.lang.Integer) 1);
        fuzzTest13.FuzzTest_remove(intList57, intList65, (int) (byte) 100, (java.lang.Integer) 100);
        c2s_aug.TreeList<java.lang.Integer> intList77 = null;
        fuzzTest12.FuzzTest_remove(intList65, intList77, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList84 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList88 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest81.FuzzTest_remove(intList84, intList88, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList65, intList84, (int) (byte) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList1 = null;
        c2s_aug.TreeList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_remove(intList1, intList2, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList9 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList13 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest6.FuzzTest_remove(intList9, intList13, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList21 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList25 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_remove(intList21, intList25, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList33 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest6.FuzzTest_remove(intList25, intList33, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList41 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList45 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest38.FuzzTest_remove(intList41, intList45, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList50 = null;
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList54 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList58 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest51.FuzzTest_remove(intList54, intList58, (-1), (java.lang.Integer) 1);
        fuzzTest38.FuzzTest_remove(intList50, intList58, (int) 'a', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList33, intList58, 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList11 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzzTest4.FuzzTest_remove(intList7, intList11, (-1), (java.lang.Integer) 1);
        fuzzTest2.FuzzTest_remove(intList3, intList7, 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_remove(intList1, intList7, 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList25 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList29 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest22.FuzzTest_remove(intList25, intList29, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList35 = null;
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList39 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList43 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest36.FuzzTest_remove(intList39, intList43, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.TreeList<java.lang.Integer> intList52 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList57 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList61 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest54.FuzzTest_remove(intList57, intList61, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList69 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList73 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest66.FuzzTest_remove(intList69, intList73, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList81 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest54.FuzzTest_remove(intList73, intList81, (int) '4', (java.lang.Integer) 10);
        fuzzTest36.FuzzTest_remove(intList52, intList81, (int) (byte) -1, (java.lang.Integer) 100);
        fuzzTest34.FuzzTest_remove(intList35, intList81, 10, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList29, intList81, 0, (java.lang.Integer) 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList11 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzzTest4.FuzzTest_remove(intList7, intList11, (-1), (java.lang.Integer) 1);
        fuzzTest2.FuzzTest_remove(intList3, intList7, 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_remove(intList1, intList7, 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList25 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList29 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest22.FuzzTest_remove(intList25, intList29, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList37 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList41 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest34.FuzzTest_remove(intList37, intList41, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList49 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList53 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest46.FuzzTest_remove(intList49, intList53, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList61 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest34.FuzzTest_remove(intList53, intList61, (int) '4', (java.lang.Integer) 10);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, 100, 10, (-1), 10 };
        c2s_aug.TreeList<java.lang.Integer> intList72 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList77 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList81 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest74.FuzzTest_remove(intList77, intList81, (-1), (java.lang.Integer) 1);
        fuzzTest34.FuzzTest_remove(intList72, intList77, (int) '#', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList25, intList77, (int) (short) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList11 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzzTest4.FuzzTest_remove(intList7, intList11, (-1), (java.lang.Integer) 1);
        fuzzTest2.FuzzTest_remove(intList3, intList7, 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_remove(intList1, intList7, 10, (java.lang.Integer) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1), 1 };
        c2s_aug.TreeList<java.lang.Integer> intList25 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList32 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList36 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_remove(intList32, intList36, (-1), (java.lang.Integer) 1);
        fuzzTest27.FuzzTest_remove(intList28, intList32, 10, (java.lang.Integer) (-1));
        c2s_aug.TreeList<java.lang.Integer> intList44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList48 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList52 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_remove(intList48, intList52, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList61 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList65 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_remove(intList61, intList65, (-1), (java.lang.Integer) 1);
        fuzzTest45.FuzzTest_remove(intList57, intList65, (int) '4', (java.lang.Integer) 10);
        fuzzTest27.FuzzTest_remove(intList44, intList65, 0, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList25, intList65, 0, (java.lang.Integer) 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList3 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 100 };
        c2s_aug.TreeList<java.lang.Integer> intList17 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest12.FuzzTest_remove(intList13, intList17, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList26 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList30 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest23.FuzzTest_remove(intList26, intList30, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList35 = null;
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList39 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList43 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest36.FuzzTest_remove(intList39, intList43, (-1), (java.lang.Integer) 1);
        fuzzTest23.FuzzTest_remove(intList35, intList43, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList54 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList58 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest51.FuzzTest_remove(intList54, intList58, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList63 = null;
        fuzzTest23.FuzzTest_remove(intList58, intList63, 100, (java.lang.Integer) (-1));
        c2s_aug.TreeList<java.lang.Integer> intList67 = null;
        fuzzTest22.FuzzTest_remove(intList58, intList67, (int) (short) -1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1, 100, 0, 100, 10 };
        c2s_aug.TreeList<java.lang.Integer> intList77 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList82 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList86 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest79.FuzzTest_remove(intList82, intList86, (-1), (java.lang.Integer) 1);
        fuzzTest22.FuzzTest_remove(intList77, intList86, (int) (byte) 0, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList17, intList86, (int) (short) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList11 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzzTest4.FuzzTest_remove(intList7, intList11, (-1), (java.lang.Integer) 1);
        fuzzTest2.FuzzTest_remove(intList3, intList7, 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_remove(intList1, intList7, 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList25 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList29 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest22.FuzzTest_remove(intList25, intList29, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList37 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList41 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest34.FuzzTest_remove(intList37, intList41, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList49 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest22.FuzzTest_remove(intList41, intList49, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList57 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList61 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest54.FuzzTest_remove(intList57, intList61, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList70 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList74 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest67.FuzzTest_remove(intList70, intList74, (-1), (java.lang.Integer) 1);
        fuzzTest54.FuzzTest_remove(intList66, intList74, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList49, intList74, (int) (short) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList5 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList9 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_remove(intList5, intList9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList1, intList5, (int) '4', (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList20 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList24 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_remove(intList20, intList24, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList33 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList37 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_remove(intList33, intList37, (-1), (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_remove(intList29, intList37, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList48 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList52 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_remove(intList48, intList52, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList61 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList65 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_remove(intList61, intList65, (-1), (java.lang.Integer) 1);
        fuzzTest45.FuzzTest_remove(intList57, intList61, (int) (short) 0, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList37, intList61, (int) (short) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList4 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList8 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_remove(intList4, intList8, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList16 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList20 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList29 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList33 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_remove(intList29, intList33, (-1), (java.lang.Integer) 1);
        fuzzTest13.FuzzTest_remove(intList25, intList33, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList44 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList48 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_remove(intList44, intList48, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList53 = null;
        fuzzTest13.FuzzTest_remove(intList48, intList53, 100, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_remove(intList4, intList53, (int) (short) 100, (java.lang.Integer) 100);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList62 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        c2s_aug.TreeList<java.lang.Integer> intList64 = null;
        fuzzTest0.FuzzTest_remove(intList62, intList64, (int) (byte) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList71 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList75 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest68.FuzzTest_remove(intList71, intList75, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { (-1), 10, 1, (-1), 10 };
        c2s_aug.TreeList<java.lang.Integer> intList86 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList75, intList86, (int) (short) 0, (java.lang.Integer) (-1));
    }
}

