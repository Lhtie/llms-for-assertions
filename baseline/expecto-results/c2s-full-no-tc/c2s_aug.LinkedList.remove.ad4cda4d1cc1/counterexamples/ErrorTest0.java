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
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList6 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList11 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzzTest8.FuzzTest_remove(intList11, intList13, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        c2s_aug.LinkedList<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_remove(intList20, intList22, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList29 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        c2s_aug.LinkedList<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_remove(intList29, intList31, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest8.FuzzTest_remove(intList20, intList31, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList6, intList31, (int) ' ', (java.lang.Integer) 10);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList43 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        c2s_aug.LinkedList<java.lang.Integer> intList58 = null;
        fuzzTest53.FuzzTest_remove(intList56, intList58, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList65 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        c2s_aug.LinkedList<java.lang.Integer> intList67 = null;
        fuzzTest62.FuzzTest_remove(intList65, intList67, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList74 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        c2s_aug.LinkedList<java.lang.Integer> intList76 = null;
        fuzzTest71.FuzzTest_remove(intList74, intList76, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest53.FuzzTest_remove(intList65, intList76, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest45.FuzzTest_remove(intList51, intList76, (int) ' ', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList43, intList51, (int) (byte) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList13 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        c2s_aug.LinkedList<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_remove(intList13, intList15, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList22 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        c2s_aug.LinkedList<java.lang.Integer> intList24 = null;
        fuzzTest19.FuzzTest_remove(intList22, intList24, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList31 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        c2s_aug.LinkedList<java.lang.Integer> intList33 = null;
        fuzzTest28.FuzzTest_remove(intList31, intList33, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList40 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        c2s_aug.LinkedList<java.lang.Integer> intList42 = null;
        fuzzTest37.FuzzTest_remove(intList40, intList42, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest19.FuzzTest_remove(intList31, intList42, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest10.FuzzTest_remove(intList42, intList52, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        c2s_aug.LinkedList<java.lang.Integer> intList62 = null;
        fuzzTest57.FuzzTest_remove(intList60, intList62, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest9.FuzzTest_remove(intList42, intList60, 1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { (-1), 0, 10, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList74 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList60, intList74, (int) (byte) 1, (java.lang.Integer) 10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_remove(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList12, intList23, (int) (short) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList33 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        c2s_aug.LinkedList<java.lang.Integer> intList35 = null;
        fuzzTest30.FuzzTest_remove(intList33, intList35, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        c2s_aug.LinkedList<java.lang.Integer> intList44 = null;
        fuzzTest39.FuzzTest_remove(intList42, intList44, (int) (short) -1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList33, intList42, 10, (java.lang.Integer) 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_remove(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList12, intList21, (int) '#', (java.lang.Integer) 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        c2s_aug.LinkedList<java.lang.Integer> intList6 = null;
        fuzzTest1.FuzzTest_remove(intList4, intList6, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList13 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        c2s_aug.LinkedList<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_remove(intList13, intList15, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList22 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        c2s_aug.LinkedList<java.lang.Integer> intList24 = null;
        fuzzTest19.FuzzTest_remove(intList22, intList24, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest1.FuzzTest_remove(intList13, intList24, (int) (short) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList34 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        c2s_aug.LinkedList<java.lang.Integer> intList36 = null;
        fuzzTest31.FuzzTest_remove(intList34, intList36, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList43 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        c2s_aug.LinkedList<java.lang.Integer> intList45 = null;
        fuzzTest40.FuzzTest_remove(intList43, intList45, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        c2s_aug.LinkedList<java.lang.Integer> intList54 = null;
        fuzzTest49.FuzzTest_remove(intList52, intList54, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest31.FuzzTest_remove(intList43, intList54, (int) (short) 1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList13, intList43, 1, (java.lang.Integer) 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList13 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        c2s_aug.LinkedList<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_remove(intList13, intList15, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList9, intList15, (int) (byte) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList28 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList33 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        c2s_aug.LinkedList<java.lang.Integer> intList35 = null;
        fuzzTest30.FuzzTest_remove(intList33, intList35, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        c2s_aug.LinkedList<java.lang.Integer> intList44 = null;
        fuzzTest39.FuzzTest_remove(intList42, intList44, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        c2s_aug.LinkedList<java.lang.Integer> intList53 = null;
        fuzzTest48.FuzzTest_remove(intList51, intList53, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest30.FuzzTest_remove(intList42, intList53, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest22.FuzzTest_remove(intList28, intList53, (int) ' ', (java.lang.Integer) 10);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-1), (-1), 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList67 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList72 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        c2s_aug.LinkedList<java.lang.Integer> intList74 = null;
        fuzzTest69.FuzzTest_remove(intList72, intList74, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest22.FuzzTest_remove(intList67, intList74, (int) (byte) 100, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList84 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        c2s_aug.LinkedList<java.lang.Integer> intList86 = null;
        fuzzTest81.FuzzTest_remove(intList84, intList86, (int) '#', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList67, intList84, (-1), (java.lang.Integer) 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList13 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        c2s_aug.LinkedList<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_remove(intList13, intList15, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList9, intList15, (int) (byte) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList28 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList33 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        c2s_aug.LinkedList<java.lang.Integer> intList35 = null;
        fuzzTest30.FuzzTest_remove(intList33, intList35, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        c2s_aug.LinkedList<java.lang.Integer> intList44 = null;
        fuzzTest39.FuzzTest_remove(intList42, intList44, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        c2s_aug.LinkedList<java.lang.Integer> intList53 = null;
        fuzzTest48.FuzzTest_remove(intList51, intList53, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest30.FuzzTest_remove(intList42, intList53, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest22.FuzzTest_remove(intList28, intList53, (int) ' ', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList66 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        c2s_aug.LinkedList<java.lang.Integer> intList68 = null;
        fuzzTest63.FuzzTest_remove(intList66, intList68, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList75 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        c2s_aug.LinkedList<java.lang.Integer> intList77 = null;
        fuzzTest72.FuzzTest_remove(intList75, intList77, (int) '#', (java.lang.Integer) 0);
        fuzzTest22.FuzzTest_remove(intList66, intList75, (int) (byte) 0, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 10, (-1), (-1), 0, 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList90 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList66, intList90, (int) 'a', (java.lang.Integer) 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_remove(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList30 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        c2s_aug.LinkedList<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_remove(intList30, intList32, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest9.FuzzTest_remove(intList21, intList32, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest0.FuzzTest_remove(intList32, intList42, (int) '4', (java.lang.Integer) 10);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList49 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, (-1), (-1), 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList49, intList56, (int) (short) 1, (java.lang.Integer) 10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList6 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList11 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzzTest8.FuzzTest_remove(intList11, intList13, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        c2s_aug.LinkedList<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_remove(intList20, intList22, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList29 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        c2s_aug.LinkedList<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_remove(intList29, intList31, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest8.FuzzTest_remove(intList20, intList31, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList6, intList31, (int) ' ', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList44 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        c2s_aug.LinkedList<java.lang.Integer> intList46 = null;
        fuzzTest41.FuzzTest_remove(intList44, intList46, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 10, 1, 0, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest0.FuzzTest_remove(intList44, intList56, 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList64 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        c2s_aug.LinkedList<java.lang.Integer> intList66 = null;
        fuzzTest61.FuzzTest_remove(intList64, intList66, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList73 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        c2s_aug.LinkedList<java.lang.Integer> intList75 = null;
        fuzzTest70.FuzzTest_remove(intList73, intList75, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList82 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        c2s_aug.LinkedList<java.lang.Integer> intList84 = null;
        fuzzTest79.FuzzTest_remove(intList82, intList84, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest61.FuzzTest_remove(intList73, intList84, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { (-1), 10, 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList95 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList95, intArray94);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList73, intList95, 1, (java.lang.Integer) 100);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_remove(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList30 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        c2s_aug.LinkedList<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_remove(intList30, intList32, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        c2s_aug.LinkedList<java.lang.Integer> intList41 = null;
        fuzzTest36.FuzzTest_remove(intList39, intList41, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest18.FuzzTest_remove(intList30, intList41, (int) (short) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        c2s_aug.LinkedList<java.lang.Integer> intList53 = null;
        fuzzTest48.FuzzTest_remove(intList51, intList53, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        c2s_aug.LinkedList<java.lang.Integer> intList62 = null;
        fuzzTest57.FuzzTest_remove(intList60, intList62, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList69 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        c2s_aug.LinkedList<java.lang.Integer> intList71 = null;
        fuzzTest66.FuzzTest_remove(intList69, intList71, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest48.FuzzTest_remove(intList60, intList71, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest9.FuzzTest_remove(intList30, intList71, 10, (java.lang.Integer) 100);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList83 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList30, intList83, 1, (java.lang.Integer) 10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList13 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        c2s_aug.LinkedList<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_remove(intList13, intList15, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList22 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        c2s_aug.LinkedList<java.lang.Integer> intList24 = null;
        fuzzTest19.FuzzTest_remove(intList22, intList24, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList31 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        c2s_aug.LinkedList<java.lang.Integer> intList33 = null;
        fuzzTest28.FuzzTest_remove(intList31, intList33, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest10.FuzzTest_remove(intList22, intList33, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList9, intList33, 100, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList46 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        c2s_aug.LinkedList<java.lang.Integer> intList48 = null;
        fuzzTest43.FuzzTest_remove(intList46, intList48, (int) '#', (java.lang.Integer) 0);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10, (-1), 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList56 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList46, intList56, 100, (java.lang.Integer) 100);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_remove(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList12, intList23, (int) (short) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList33 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        c2s_aug.LinkedList<java.lang.Integer> intList35 = null;
        fuzzTest30.FuzzTest_remove(intList33, intList35, (int) '#', (java.lang.Integer) 0);
        c2s_aug.LinkedList<java.lang.Integer> intList39 = null;
        fuzzTest0.FuzzTest_remove(intList33, intList39, (int) (short) 100, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList46 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        c2s_aug.LinkedList<java.lang.Integer> intList48 = null;
        fuzzTest43.FuzzTest_remove(intList46, intList48, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList55 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList46, intList55, (int) (byte) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        c2s_aug.LinkedList<java.lang.Integer> intList6 = null;
        fuzzTest1.FuzzTest_remove(intList4, intList6, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        c2s_aug.LinkedList<java.lang.Integer> intList17 = null;
        fuzzTest12.FuzzTest_remove(intList15, intList17, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, 100, 0, 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList31 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest12.FuzzTest_remove(intList27, intList31, 0, (java.lang.Integer) 0);
        fuzzTest10.FuzzTest_remove(intList11, intList27, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList4, intList27, 1, (java.lang.Integer) 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList18 = null;
        fuzzTest0.FuzzTest_remove(intList12, intList18, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        c2s_aug.LinkedList<java.lang.Integer> intList27 = null;
        fuzzTest22.FuzzTest_remove(intList25, intList27, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList37 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        c2s_aug.LinkedList<java.lang.Integer> intList44 = null;
        fuzzTest39.FuzzTest_remove(intList42, intList44, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        c2s_aug.LinkedList<java.lang.Integer> intList53 = null;
        fuzzTest48.FuzzTest_remove(intList51, intList53, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        c2s_aug.LinkedList<java.lang.Integer> intList62 = null;
        fuzzTest57.FuzzTest_remove(intList60, intList62, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest39.FuzzTest_remove(intList51, intList62, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest31.FuzzTest_remove(intList37, intList62, (int) ' ', (java.lang.Integer) 10);
        c2s_aug.LinkedList<java.lang.Integer> intList72 = null;
        fuzzTest22.FuzzTest_remove(intList37, intList72, (-1), (java.lang.Integer) (-1));
        c2s_aug.LinkedList<java.lang.Integer> intList76 = null;
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1, 1, 1, 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList82 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest22.FuzzTest_remove(intList76, intList82, 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { (-1), 0, 100, (-1), 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList93 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList82, intList93, (int) (byte) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        c2s_aug.LinkedList<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_remove(intList20, intList22, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList29 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        c2s_aug.LinkedList<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_remove(intList29, intList31, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        c2s_aug.LinkedList<java.lang.Integer> intList40 = null;
        fuzzTest35.FuzzTest_remove(intList38, intList40, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest17.FuzzTest_remove(intList29, intList40, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest9.FuzzTest_remove(intList15, intList40, (int) ' ', (java.lang.Integer) 10);
        c2s_aug.LinkedList<java.lang.Integer> intList50 = null;
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList53 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest9.FuzzTest_remove(intList50, intList53, (int) (short) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList61 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        c2s_aug.LinkedList<java.lang.Integer> intList63 = null;
        fuzzTest58.FuzzTest_remove(intList61, intList63, (int) '#', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList53, intList61, (int) (byte) -1, (java.lang.Integer) (-1));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_remove(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList12, intList23, (int) (short) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList33 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        c2s_aug.LinkedList<java.lang.Integer> intList35 = null;
        fuzzTest30.FuzzTest_remove(intList33, intList35, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        c2s_aug.LinkedList<java.lang.Integer> intList44 = null;
        fuzzTest39.FuzzTest_remove(intList42, intList44, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        c2s_aug.LinkedList<java.lang.Integer> intList53 = null;
        fuzzTest48.FuzzTest_remove(intList51, intList53, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        c2s_aug.LinkedList<java.lang.Integer> intList62 = null;
        fuzzTest57.FuzzTest_remove(intList60, intList62, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest39.FuzzTest_remove(intList51, intList62, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList72 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest30.FuzzTest_remove(intList62, intList72, (int) '4', (java.lang.Integer) 10);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100, (-1), 1, 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList82 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList72, intList82, (int) (byte) 100, (java.lang.Integer) 100);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList18 = null;
        fuzzTest0.FuzzTest_remove(intList12, intList18, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        c2s_aug.LinkedList<java.lang.Integer> intList27 = null;
        fuzzTest22.FuzzTest_remove(intList25, intList27, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 100, 0, 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList37 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList41 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest22.FuzzTest_remove(intList37, intList41, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList49 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        c2s_aug.LinkedList<java.lang.Integer> intList51 = null;
        fuzzTest46.FuzzTest_remove(intList49, intList51, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList58 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        c2s_aug.LinkedList<java.lang.Integer> intList60 = null;
        fuzzTest55.FuzzTest_remove(intList58, intList60, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList67 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        c2s_aug.LinkedList<java.lang.Integer> intList69 = null;
        fuzzTest64.FuzzTest_remove(intList67, intList69, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList76 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        c2s_aug.LinkedList<java.lang.Integer> intList78 = null;
        fuzzTest73.FuzzTest_remove(intList76, intList78, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest55.FuzzTest_remove(intList67, intList78, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList88 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest46.FuzzTest_remove(intList78, intList88, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList37, intList88, (int) ' ', (java.lang.Integer) 1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 100, 0, 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList24 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList28 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest9.FuzzTest_remove(intList24, intList28, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList44 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        c2s_aug.LinkedList<java.lang.Integer> intList46 = null;
        fuzzTest41.FuzzTest_remove(intList44, intList46, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList53 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        c2s_aug.LinkedList<java.lang.Integer> intList55 = null;
        fuzzTest50.FuzzTest_remove(intList53, intList55, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList62 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        c2s_aug.LinkedList<java.lang.Integer> intList64 = null;
        fuzzTest59.FuzzTest_remove(intList62, intList64, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest41.FuzzTest_remove(intList53, intList64, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest33.FuzzTest_remove(intList39, intList64, (int) ' ', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList77 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        c2s_aug.LinkedList<java.lang.Integer> intList79 = null;
        fuzzTest74.FuzzTest_remove(intList77, intList79, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList86 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        c2s_aug.LinkedList<java.lang.Integer> intList88 = null;
        fuzzTest83.FuzzTest_remove(intList86, intList88, (int) '#', (java.lang.Integer) 0);
        fuzzTest33.FuzzTest_remove(intList77, intList86, (int) (byte) 0, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList28, intList86, (int) ' ', (java.lang.Integer) 100);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList4 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        c2s_aug.LinkedList<java.lang.Integer> intList6 = null;
        fuzzTest1.FuzzTest_remove(intList4, intList6, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList13 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        c2s_aug.LinkedList<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_remove(intList13, intList15, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList22 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        c2s_aug.LinkedList<java.lang.Integer> intList24 = null;
        fuzzTest19.FuzzTest_remove(intList22, intList24, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest1.FuzzTest_remove(intList13, intList24, (int) (short) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList34 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        c2s_aug.LinkedList<java.lang.Integer> intList36 = null;
        fuzzTest31.FuzzTest_remove(intList34, intList36, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList43 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest1.FuzzTest_remove(intList36, intList43, (int) (byte) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        c2s_aug.LinkedList<java.lang.Integer> intList53 = null;
        fuzzTest48.FuzzTest_remove(intList51, intList53, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        c2s_aug.LinkedList<java.lang.Integer> intList62 = null;
        fuzzTest57.FuzzTest_remove(intList60, intList62, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList66 = null;
        fuzzTest48.FuzzTest_remove(intList60, intList66, (int) (short) -1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList43, intList60, 100, (java.lang.Integer) 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 10, 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList5 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList10 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        c2s_aug.LinkedList<java.lang.Integer> intList12 = null;
        fuzzTest7.FuzzTest_remove(intList10, intList12, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList22 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        c2s_aug.LinkedList<java.lang.Integer> intList29 = null;
        fuzzTest24.FuzzTest_remove(intList27, intList29, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        c2s_aug.LinkedList<java.lang.Integer> intList38 = null;
        fuzzTest33.FuzzTest_remove(intList36, intList38, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList45 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        c2s_aug.LinkedList<java.lang.Integer> intList47 = null;
        fuzzTest42.FuzzTest_remove(intList45, intList47, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest24.FuzzTest_remove(intList36, intList47, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest16.FuzzTest_remove(intList22, intList47, (int) ' ', (java.lang.Integer) 10);
        c2s_aug.LinkedList<java.lang.Integer> intList57 = null;
        fuzzTest7.FuzzTest_remove(intList22, intList57, (-1), (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList5, intList22, (int) '#', (java.lang.Integer) 1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_remove(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList30 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        c2s_aug.LinkedList<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_remove(intList30, intList32, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest9.FuzzTest_remove(intList21, intList32, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest0.FuzzTest_remove(intList32, intList42, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList50 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        c2s_aug.LinkedList<java.lang.Integer> intList52 = null;
        fuzzTest47.FuzzTest_remove(intList50, intList52, (int) '#', (java.lang.Integer) 0);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList58 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList50, intList58, (int) '#', (java.lang.Integer) 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList10 = null;
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList14 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        c2s_aug.LinkedList<java.lang.Integer> intList16 = null;
        fuzzTest11.FuzzTest_remove(intList14, intList16, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, 100, 0, 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList26 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList30 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest11.FuzzTest_remove(intList26, intList30, 0, (java.lang.Integer) 0);
        fuzzTest9.FuzzTest_remove(intList10, intList26, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList43 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        c2s_aug.LinkedList<java.lang.Integer> intList45 = null;
        fuzzTest40.FuzzTest_remove(intList43, intList45, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 100, 0, 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList55 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList59 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest40.FuzzTest_remove(intList55, intList59, 0, (java.lang.Integer) 0);
        fuzzTest38.FuzzTest_remove(intList39, intList55, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList26, intList55, (int) '4', (java.lang.Integer) 100);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList18 = null;
        fuzzTest0.FuzzTest_remove(intList12, intList18, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        c2s_aug.LinkedList<java.lang.Integer> intList27 = null;
        fuzzTest22.FuzzTest_remove(intList25, intList27, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 100, 0, 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList37 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList41 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest22.FuzzTest_remove(intList37, intList41, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList49 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        c2s_aug.LinkedList<java.lang.Integer> intList51 = null;
        fuzzTest46.FuzzTest_remove(intList49, intList51, (int) (short) -1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList41, intList49, (int) ' ', (java.lang.Integer) 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 100, 0, 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList24 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList28 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest9.FuzzTest_remove(intList24, intList28, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList36 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        c2s_aug.LinkedList<java.lang.Integer> intList38 = null;
        fuzzTest33.FuzzTest_remove(intList36, intList38, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList45 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        c2s_aug.LinkedList<java.lang.Integer> intList47 = null;
        fuzzTest42.FuzzTest_remove(intList45, intList47, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList51 = null;
        fuzzTest33.FuzzTest_remove(intList45, intList51, (int) (short) -1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList28, intList45, (int) (byte) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_remove(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList12, intList23, (int) (short) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList33 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        c2s_aug.LinkedList<java.lang.Integer> intList35 = null;
        fuzzTest30.FuzzTest_remove(intList33, intList35, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        c2s_aug.LinkedList<java.lang.Integer> intList44 = null;
        fuzzTest39.FuzzTest_remove(intList42, intList44, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        c2s_aug.LinkedList<java.lang.Integer> intList53 = null;
        fuzzTest48.FuzzTest_remove(intList51, intList53, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest30.FuzzTest_remove(intList42, intList53, (int) (short) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList63 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        c2s_aug.LinkedList<java.lang.Integer> intList65 = null;
        fuzzTest60.FuzzTest_remove(intList63, intList65, (int) '#', (java.lang.Integer) 0);
        c2s_aug.LinkedList<java.lang.Integer> intList69 = null;
        fuzzTest30.FuzzTest_remove(intList63, intList69, (int) (short) 100, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList76 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        c2s_aug.LinkedList<java.lang.Integer> intList78 = null;
        fuzzTest73.FuzzTest_remove(intList76, intList78, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1, 100, 0, 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList88 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList92 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        fuzzTest73.FuzzTest_remove(intList88, intList92, 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList63, intList92, (int) (short) 10, (java.lang.Integer) 1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        c2s_aug.LinkedList<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_remove(intList20, intList22, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList29 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        c2s_aug.LinkedList<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_remove(intList29, intList31, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        c2s_aug.LinkedList<java.lang.Integer> intList40 = null;
        fuzzTest35.FuzzTest_remove(intList38, intList40, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest17.FuzzTest_remove(intList29, intList40, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest9.FuzzTest_remove(intList15, intList40, (int) ' ', (java.lang.Integer) 10);
        c2s_aug.LinkedList<java.lang.Integer> intList50 = null;
        fuzzTest0.FuzzTest_remove(intList15, intList50, (-1), (java.lang.Integer) (-1));
        c2s_aug.LinkedList<java.lang.Integer> intList54 = null;
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, 1, 1, 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest0.FuzzTest_remove(intList54, intList60, 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList67 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList72 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        c2s_aug.LinkedList<java.lang.Integer> intList74 = null;
        fuzzTest69.FuzzTest_remove(intList72, intList74, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 1, 100, 0, 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList84 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList88 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest69.FuzzTest_remove(intList84, intList88, 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList67, intList88, (int) (byte) -1, (java.lang.Integer) 1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_remove(intList21, intList23, (int) '#', (java.lang.Integer) 0);
        c2s_aug.LinkedList<java.lang.Integer> intList27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList31 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        c2s_aug.LinkedList<java.lang.Integer> intList33 = null;
        fuzzTest28.FuzzTest_remove(intList31, intList33, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList40 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        c2s_aug.LinkedList<java.lang.Integer> intList42 = null;
        fuzzTest37.FuzzTest_remove(intList40, intList42, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList49 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        c2s_aug.LinkedList<java.lang.Integer> intList51 = null;
        fuzzTest46.FuzzTest_remove(intList49, intList51, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest28.FuzzTest_remove(intList40, intList51, (int) (short) 1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList62 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        c2s_aug.LinkedList<java.lang.Integer> intList64 = null;
        fuzzTest59.FuzzTest_remove(intList62, intList64, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList71 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        c2s_aug.LinkedList<java.lang.Integer> intList73 = null;
        fuzzTest68.FuzzTest_remove(intList71, intList73, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList77 = null;
        fuzzTest59.FuzzTest_remove(intList71, intList77, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest28.FuzzTest_remove(intList58, intList71, (int) (short) -1, (java.lang.Integer) (-1));
        fuzzTest18.FuzzTest_remove(intList27, intList71, 100, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList12, intList71, (int) '#', (java.lang.Integer) (-1));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList13 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        c2s_aug.LinkedList<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_remove(intList13, intList15, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList30 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        c2s_aug.LinkedList<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_remove(intList30, intList32, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        c2s_aug.LinkedList<java.lang.Integer> intList41 = null;
        fuzzTest36.FuzzTest_remove(intList39, intList41, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList48 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        c2s_aug.LinkedList<java.lang.Integer> intList50 = null;
        fuzzTest45.FuzzTest_remove(intList48, intList50, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest27.FuzzTest_remove(intList39, intList50, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest19.FuzzTest_remove(intList25, intList50, (int) ' ', (java.lang.Integer) 10);
        c2s_aug.LinkedList<java.lang.Integer> intList60 = null;
        fuzzTest10.FuzzTest_remove(intList25, intList60, (-1), (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_remove(intList9, intList60, 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList70 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        c2s_aug.LinkedList<java.lang.Integer> intList72 = null;
        fuzzTest67.FuzzTest_remove(intList70, intList72, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList79 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        c2s_aug.LinkedList<java.lang.Integer> intList81 = null;
        fuzzTest76.FuzzTest_remove(intList79, intList81, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList85 = null;
        fuzzTest67.FuzzTest_remove(intList79, intList85, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList91 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList79, intList91, (int) (byte) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList13 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        c2s_aug.LinkedList<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_remove(intList13, intList15, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList22 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        c2s_aug.LinkedList<java.lang.Integer> intList24 = null;
        fuzzTest19.FuzzTest_remove(intList22, intList24, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList28 = null;
        fuzzTest10.FuzzTest_remove(intList22, intList28, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList9, intList28, (int) ' ', (java.lang.Integer) 10);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList37 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1), 0, 1, 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList45 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList37, intList45, (int) '4', (java.lang.Integer) (-1));
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
        c2s_aug.LinkedList<java.lang.Integer> intList6 = null;
        fuzzTest1.FuzzTest_remove(intList4, intList6, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList16 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_remove(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList30 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        c2s_aug.LinkedList<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_remove(intList30, intList32, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        c2s_aug.LinkedList<java.lang.Integer> intList41 = null;
        fuzzTest36.FuzzTest_remove(intList39, intList41, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest18.FuzzTest_remove(intList30, intList41, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest10.FuzzTest_remove(intList16, intList41, (int) ' ', (java.lang.Integer) 10);
        c2s_aug.LinkedList<java.lang.Integer> intList51 = null;
        fuzzTest1.FuzzTest_remove(intList16, intList51, (-1), (java.lang.Integer) (-1));
        c2s_aug.LinkedList<java.lang.Integer> intList55 = null;
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1, 1, 1, 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList61 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest1.FuzzTest_remove(intList55, intList61, 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList69 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        c2s_aug.LinkedList<java.lang.Integer> intList71 = null;
        fuzzTest66.FuzzTest_remove(intList69, intList71, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList78 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        c2s_aug.LinkedList<java.lang.Integer> intList80 = null;
        fuzzTest75.FuzzTest_remove(intList78, intList80, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList84 = null;
        fuzzTest66.FuzzTest_remove(intList78, intList84, (int) (short) -1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList61, intList78, (int) (byte) -1, (java.lang.Integer) 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList6 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList11 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzzTest8.FuzzTest_remove(intList11, intList13, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        c2s_aug.LinkedList<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_remove(intList20, intList22, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList29 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        c2s_aug.LinkedList<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_remove(intList29, intList31, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest8.FuzzTest_remove(intList20, intList31, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList6, intList31, (int) ' ', (java.lang.Integer) 10);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList44 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        c2s_aug.LinkedList<java.lang.Integer> intList46 = null;
        fuzzTest0.FuzzTest_remove(intList44, intList46, (int) ' ', (java.lang.Integer) 10);
        c2s_aug.LinkedList<java.lang.Integer> intList50 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList51 = null;
        fuzzTest0.FuzzTest_remove(intList50, intList51, 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList58 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        c2s_aug.LinkedList<java.lang.Integer> intList60 = null;
        fuzzTest55.FuzzTest_remove(intList58, intList60, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList67 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        c2s_aug.LinkedList<java.lang.Integer> intList69 = null;
        fuzzTest64.FuzzTest_remove(intList67, intList69, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 100, 0, 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList79 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList83 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest64.FuzzTest_remove(intList79, intList83, 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList58, intList79, 100, (java.lang.Integer) 1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList24 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList29 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        c2s_aug.LinkedList<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_remove(intList29, intList31, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        c2s_aug.LinkedList<java.lang.Integer> intList40 = null;
        fuzzTest35.FuzzTest_remove(intList38, intList40, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList47 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        c2s_aug.LinkedList<java.lang.Integer> intList49 = null;
        fuzzTest44.FuzzTest_remove(intList47, intList49, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest26.FuzzTest_remove(intList38, intList49, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest18.FuzzTest_remove(intList24, intList49, (int) ' ', (java.lang.Integer) 10);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10, 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList62 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        c2s_aug.LinkedList<java.lang.Integer> intList64 = null;
        fuzzTest18.FuzzTest_remove(intList62, intList64, (int) ' ', (java.lang.Integer) 10);
        c2s_aug.LinkedList<java.lang.Integer> intList68 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList69 = null;
        fuzzTest18.FuzzTest_remove(intList68, intList69, 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList76 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        c2s_aug.LinkedList<java.lang.Integer> intList78 = null;
        fuzzTest73.FuzzTest_remove(intList76, intList78, (int) '#', (java.lang.Integer) 0);
        c2s_aug.LinkedList<java.lang.Integer> intList82 = null;
        fuzzTest18.FuzzTest_remove(intList76, intList82, (int) ' ', (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList12, intList76, (int) (short) 10, (java.lang.Integer) 1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_remove(intList21, intList23, (int) '#', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList12, intList21, (int) (byte) -1, (java.lang.Integer) 100);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList13 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        c2s_aug.LinkedList<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_remove(intList13, intList15, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList9, intList15, (int) (byte) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList25 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        c2s_aug.LinkedList<java.lang.Integer> intList27 = null;
        fuzzTest22.FuzzTest_remove(intList25, intList27, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList37 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList42 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        c2s_aug.LinkedList<java.lang.Integer> intList44 = null;
        fuzzTest39.FuzzTest_remove(intList42, intList44, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList51 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        c2s_aug.LinkedList<java.lang.Integer> intList53 = null;
        fuzzTest48.FuzzTest_remove(intList51, intList53, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList60 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        c2s_aug.LinkedList<java.lang.Integer> intList62 = null;
        fuzzTest57.FuzzTest_remove(intList60, intList62, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest39.FuzzTest_remove(intList51, intList62, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest31.FuzzTest_remove(intList37, intList62, (int) ' ', (java.lang.Integer) 10);
        c2s_aug.LinkedList<java.lang.Integer> intList72 = null;
        fuzzTest22.FuzzTest_remove(intList37, intList72, (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0, 1, 1, 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList81 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList37, intList81, 100, (java.lang.Integer) 100);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) '#', (java.lang.Integer) 0);
        c2s_aug.LinkedList<java.lang.Integer> intList18 = null;
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList22 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        c2s_aug.LinkedList<java.lang.Integer> intList24 = null;
        fuzzTest19.FuzzTest_remove(intList22, intList24, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList31 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        c2s_aug.LinkedList<java.lang.Integer> intList33 = null;
        fuzzTest28.FuzzTest_remove(intList31, intList33, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList40 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        c2s_aug.LinkedList<java.lang.Integer> intList42 = null;
        fuzzTest37.FuzzTest_remove(intList40, intList42, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest19.FuzzTest_remove(intList31, intList42, (int) (short) 1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList53 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        c2s_aug.LinkedList<java.lang.Integer> intList55 = null;
        fuzzTest50.FuzzTest_remove(intList53, intList55, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList62 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        c2s_aug.LinkedList<java.lang.Integer> intList64 = null;
        fuzzTest59.FuzzTest_remove(intList62, intList64, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList68 = null;
        fuzzTest50.FuzzTest_remove(intList62, intList68, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest19.FuzzTest_remove(intList49, intList62, (int) (short) -1, (java.lang.Integer) (-1));
        fuzzTest9.FuzzTest_remove(intList18, intList62, 100, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList81 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        c2s_aug.LinkedList<java.lang.Integer> intList83 = null;
        fuzzTest78.FuzzTest_remove(intList81, intList83, (int) (short) -1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList62, intList81, (int) (short) -1, (java.lang.Integer) 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList13 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        c2s_aug.LinkedList<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_remove(intList13, intList15, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList9, intList15, (int) (byte) 0, (java.lang.Integer) (-1));
        c2s_aug.LinkedList<java.lang.Integer> intList22 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest0.FuzzTest_remove(intList22, intList23, (-1), (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList30 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        c2s_aug.LinkedList<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_remove(intList30, intList32, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        c2s_aug.LinkedList<java.lang.Integer> intList41 = null;
        fuzzTest36.FuzzTest_remove(intList39, intList41, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList48 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        c2s_aug.LinkedList<java.lang.Integer> intList50 = null;
        fuzzTest45.FuzzTest_remove(intList48, intList50, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList57 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        c2s_aug.LinkedList<java.lang.Integer> intList59 = null;
        fuzzTest54.FuzzTest_remove(intList57, intList59, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest36.FuzzTest_remove(intList48, intList59, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList69 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest27.FuzzTest_remove(intList59, intList69, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList77 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        c2s_aug.LinkedList<java.lang.Integer> intList79 = null;
        fuzzTest74.FuzzTest_remove(intList77, intList79, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList86 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        c2s_aug.LinkedList<java.lang.Integer> intList88 = null;
        fuzzTest83.FuzzTest_remove(intList86, intList88, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList92 = null;
        fuzzTest74.FuzzTest_remove(intList86, intList92, (int) (short) -1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList69, intList86, 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, 0, (-1), 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList7 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        c2s_aug.LinkedList<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_remove(intList20, intList22, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList29 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        c2s_aug.LinkedList<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_remove(intList29, intList31, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        c2s_aug.LinkedList<java.lang.Integer> intList40 = null;
        fuzzTest35.FuzzTest_remove(intList38, intList40, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest17.FuzzTest_remove(intList29, intList40, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest9.FuzzTest_remove(intList15, intList40, (int) ' ', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList53 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        c2s_aug.LinkedList<java.lang.Integer> intList55 = null;
        fuzzTest50.FuzzTest_remove(intList53, intList55, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList62 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        c2s_aug.LinkedList<java.lang.Integer> intList64 = null;
        fuzzTest59.FuzzTest_remove(intList62, intList64, (int) '#', (java.lang.Integer) 0);
        fuzzTest9.FuzzTest_remove(intList53, intList62, (int) (byte) 0, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList7, intList62, (int) (short) -1, (java.lang.Integer) 10);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList13 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        c2s_aug.LinkedList<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_remove(intList13, intList15, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList9, intList15, (int) (byte) 0, (java.lang.Integer) (-1));
        c2s_aug.LinkedList<java.lang.Integer> intList22 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest0.FuzzTest_remove(intList22, intList23, (-1), (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList30 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        c2s_aug.LinkedList<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_remove(intList30, intList32, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList39 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        c2s_aug.LinkedList<java.lang.Integer> intList41 = null;
        fuzzTest36.FuzzTest_remove(intList39, intList41, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList45 = null;
        fuzzTest27.FuzzTest_remove(intList39, intList45, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList52 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        c2s_aug.LinkedList<java.lang.Integer> intList54 = null;
        fuzzTest49.FuzzTest_remove(intList52, intList54, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList61 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        c2s_aug.LinkedList<java.lang.Integer> intList63 = null;
        fuzzTest58.FuzzTest_remove(intList61, intList63, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList67 = null;
        fuzzTest49.FuzzTest_remove(intList61, intList67, (int) (short) -1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList39, intList61, (int) '4', (java.lang.Integer) (-1));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 100, 0, 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList15 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList19 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest0.FuzzTest_remove(intList15, intList19, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList27 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        c2s_aug.LinkedList<java.lang.Integer> intList29 = null;
        fuzzTest24.FuzzTest_remove(intList27, intList29, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList37 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        c2s_aug.LinkedList<java.lang.Integer> intList39 = null;
        fuzzTest34.FuzzTest_remove(intList37, intList39, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest24.FuzzTest_remove(intList33, intList39, (int) (byte) 0, (java.lang.Integer) (-1));
        c2s_aug.LinkedList<java.lang.Integer> intList46 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList47 = null;
        fuzzTest24.FuzzTest_remove(intList46, intList47, 1, (java.lang.Integer) 0);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList54 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        c2s_aug.LinkedList<java.lang.Integer> intList56 = null;
        fuzzTest24.FuzzTest_remove(intList54, intList56, 0, (java.lang.Integer) 1);
        c2s_aug.LinkedList<java.lang.Integer> intList60 = null;
        fuzzTest0.FuzzTest_remove(intList54, intList60, (int) (short) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList67 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        c2s_aug.LinkedList<java.lang.Integer> intList69 = null;
        fuzzTest64.FuzzTest_remove(intList67, intList69, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList76 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        c2s_aug.LinkedList<java.lang.Integer> intList78 = null;
        fuzzTest73.FuzzTest_remove(intList76, intList78, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1, 100, 0, 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList88 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList92 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        fuzzTest73.FuzzTest_remove(intList88, intList92, 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList67, intList88, (int) (short) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList6 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList11 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzzTest8.FuzzTest_remove(intList11, intList13, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        c2s_aug.LinkedList<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_remove(intList20, intList22, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList29 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        c2s_aug.LinkedList<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_remove(intList29, intList31, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest8.FuzzTest_remove(intList20, intList31, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList6, intList31, (int) ' ', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList44 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        c2s_aug.LinkedList<java.lang.Integer> intList46 = null;
        fuzzTest41.FuzzTest_remove(intList44, intList46, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug.LinkedList<java.lang.Integer> intList51 = null;
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList55 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        c2s_aug.LinkedList<java.lang.Integer> intList57 = null;
        fuzzTest52.FuzzTest_remove(intList55, intList57, (int) '#', (java.lang.Integer) 0);
        fuzzTest50.FuzzTest_remove(intList51, intList55, (int) (byte) 0, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList44, intList51, (int) 'a', (java.lang.Integer) 1);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 0, 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList71 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList76 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        c2s_aug.LinkedList<java.lang.Integer> intList78 = null;
        fuzzTest73.FuzzTest_remove(intList76, intList78, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1, 100, 0, 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList88 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList92 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        fuzzTest73.FuzzTest_remove(intList88, intList92, 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList71, intList88, (int) (short) -1, (java.lang.Integer) (-1));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        c2s_aug.LinkedList<java.lang.Integer> intList6 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList11 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        c2s_aug.LinkedList<java.lang.Integer> intList13 = null;
        fuzzTest8.FuzzTest_remove(intList11, intList13, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList20 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        c2s_aug.LinkedList<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_remove(intList20, intList22, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList29 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        c2s_aug.LinkedList<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_remove(intList29, intList31, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList38 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        c2s_aug.LinkedList<java.lang.Integer> intList40 = null;
        fuzzTest35.FuzzTest_remove(intList38, intList40, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest17.FuzzTest_remove(intList29, intList40, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.LinkedList<java.lang.Integer> intList50 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest8.FuzzTest_remove(intList40, intList50, (int) '4', (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_remove(intList6, intList40, (int) (short) 100, (java.lang.Integer) (-1));
        c2s_aug.LinkedList<java.lang.Integer> intList58 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList59 = null;
        fuzzTest0.FuzzTest_remove(intList58, intList59, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList66 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        c2s_aug.LinkedList<java.lang.Integer> intList68 = null;
        fuzzTest63.FuzzTest_remove(intList66, intList68, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 100, 0, 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList78 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList82 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest63.FuzzTest_remove(intList78, intList82, 0, (java.lang.Integer) 0);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 1, (-1), (-1), 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList92 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList82, intList92, (int) (byte) -1, (java.lang.Integer) 0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList3 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug.LinkedList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_remove(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList12 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        c2s_aug.LinkedList<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_remove(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList21 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        c2s_aug.LinkedList<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_remove(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList12, intList23, (int) (short) 1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList34 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        c2s_aug.LinkedList<java.lang.Integer> intList36 = null;
        fuzzTest31.FuzzTest_remove(intList34, intList36, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList43 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        c2s_aug.LinkedList<java.lang.Integer> intList45 = null;
        fuzzTest40.FuzzTest_remove(intList43, intList45, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.LinkedList<java.lang.Integer> intList49 = null;
        fuzzTest31.FuzzTest_remove(intList43, intList49, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intList30, intList43, (int) (short) -1, (java.lang.Integer) (-1));
        c2s_aug.LinkedList<java.lang.Integer> intList56 = null;
        c2s_aug.LinkedList<java.lang.Integer> intList57 = null;
        fuzzTest0.FuzzTest_remove(intList56, intList57, (int) (short) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList64 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        c2s_aug.LinkedList<java.lang.Integer> intList66 = null;
        fuzzTest61.FuzzTest_remove(intList64, intList66, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        c2s_aug.LinkedList<java.lang.Integer> intList73 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        c2s_aug.LinkedList<java.lang.Integer> intList75 = null;
        fuzzTest70.FuzzTest_remove(intList73, intList75, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, 100, 0, 0, 1 };
        c2s_aug.LinkedList<java.lang.Integer> intList85 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 100 };
        c2s_aug.LinkedList<java.lang.Integer> intList89 = new c2s_aug.LinkedList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        fuzzTest70.FuzzTest_remove(intList85, intList89, 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList64, intList89, (int) (short) -1, (java.lang.Integer) 0);
    }
}

