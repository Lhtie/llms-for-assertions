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
        c2s_aug.Stack<java.lang.Integer> intList3 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList7 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_push(intList3, intList7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList15 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList19 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_push(intList15, intList19, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList27 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList31 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_push(intList27, intList31, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList39 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest12.FuzzTest_push(intList31, intList39, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList47 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList51 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_push(intList47, intList51, (java.lang.Integer) 1, (java.lang.Integer) 1);
        c2s_aug.Stack<java.lang.Integer> intList56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList60 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList64 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest57.FuzzTest_push(intList60, intList64, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest44.FuzzTest_push(intList56, intList64, (java.lang.Integer) 1, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList75 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList79 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest72.FuzzTest_push(intList75, intList79, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_push(intList64, intList75, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 0, 100 };
        c2s_aug.Stack<java.lang.Integer> intList90 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList64, intList90, (java.lang.Integer) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList3 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList7 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_push(intList3, intList7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        c2s_aug.Stack<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList16 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList20 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_push(intList16, intList20, (java.lang.Integer) 1, (java.lang.Integer) 1);
        c2s_aug.Stack<java.lang.Integer> intList25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList29 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList33 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_push(intList29, intList33, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest13.FuzzTest_push(intList25, intList33, (java.lang.Integer) 1, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_push(intList12, intList25, (java.lang.Integer) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList47 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList51 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_push(intList47, intList51, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList61 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList65 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_push(intList61, intList65, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest56.FuzzTest_push(intList57, intList61, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList47, intList61, (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList5 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList9 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_push(intList5, intList9, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_push(intList1, intList5, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList18 = null;
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList22 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList26 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest19.FuzzTest_push(intList22, intList26, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_push(intList18, intList22, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList37 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList41 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest34.FuzzTest_push(intList37, intList41, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList49 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList53 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest46.FuzzTest_push(intList49, intList53, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList61 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest34.FuzzTest_push(intList53, intList61, (java.lang.Integer) 1, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList22, intList61, (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList5 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList9 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_push(intList5, intList9, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_push(intList1, intList5, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { (-1) };
        c2s_aug.Stack<java.lang.Integer> intList19 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList24 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList28 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest21.FuzzTest_push(intList24, intList28, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList36 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList40 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_push(intList36, intList40, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList48 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest21.FuzzTest_push(intList40, intList48, (java.lang.Integer) 1, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList19, intList48, (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList3 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList7 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_push(intList3, intList7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList16 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList21 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList25 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_push(intList21, intList25, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList33 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList37 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_push(intList33, intList37, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList45 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest18.FuzzTest_push(intList37, intList45, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_push(intList16, intList45, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10, 10, 0 };
        c2s_aug.Stack<java.lang.Integer> intList57 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList62 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList66 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest59.FuzzTest_push(intList62, intList66, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList74 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList78 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest71.FuzzTest_push(intList74, intList78, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList86 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest59.FuzzTest_push(intList78, intList86, (java.lang.Integer) 1, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList57, intList86, (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList4 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList8 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_push(intList4, intList8, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList16 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList20 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_push(intList16, intList20, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList28 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest1.FuzzTest_push(intList20, intList28, (java.lang.Integer) 1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1 };
        c2s_aug.Stack<java.lang.Integer> intList35 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        c2s_aug.Stack<java.lang.Integer> intList37 = null;
        fuzzTest1.FuzzTest_push(intList35, intList37, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList44 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList48 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_push(intList44, intList48, (java.lang.Integer) 1, (java.lang.Integer) 1);
        c2s_aug.Stack<java.lang.Integer> intList53 = null;
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList57 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList61 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest54.FuzzTest_push(intList57, intList61, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest41.FuzzTest_push(intList53, intList61, (java.lang.Integer) 1, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList35, intList61, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList3 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList7 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_push(intList3, intList7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList16 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList21 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList25 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_push(intList21, intList25, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList33 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList37 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_push(intList33, intList37, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList45 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest18.FuzzTest_push(intList37, intList45, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_push(intList16, intList45, (java.lang.Integer) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList56 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList60 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_push(intList56, intList60, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList70 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList74 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest67.FuzzTest_push(intList70, intList74, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest65.FuzzTest_push(intList66, intList70, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList56, intList70, (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList3 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList7 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_push(intList3, intList7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList15 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList19 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_push(intList15, intList19, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList27 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_push(intList19, intList27, (java.lang.Integer) 1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1 };
        c2s_aug.Stack<java.lang.Integer> intList34 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        c2s_aug.Stack<java.lang.Integer> intList36 = null;
        fuzzTest0.FuzzTest_push(intList34, intList36, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList43 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList47 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_push(intList43, intList47, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList58 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList62 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest55.FuzzTest_push(intList58, intList62, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest53.FuzzTest_push(intList54, intList58, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, 1, 1, 10, 10 };
        c2s_aug.Stack<java.lang.Integer> intList76 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest52.FuzzTest_push(intList54, intList76, (java.lang.Integer) 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList47, intList76, (java.lang.Integer) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList3 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList7 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_push(intList3, intList7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList15 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList19 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_push(intList15, intList19, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList29 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList33 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_push(intList29, intList33, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest24.FuzzTest_push(intList25, intList29, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList44 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList48 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_push(intList44, intList48, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList56 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList60 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_push(intList56, intList60, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList68 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest41.FuzzTest_push(intList60, intList68, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList76 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList80 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest73.FuzzTest_push(intList76, intList80, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest24.FuzzTest_push(intList68, intList80, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList15, intList80, (java.lang.Integer) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList3 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList7 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_push(intList3, intList7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        c2s_aug.Stack<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList16 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList20 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_push(intList16, intList20, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_push(intList12, intList20, (java.lang.Integer) 1, (java.lang.Integer) 0);
        c2s_aug.Stack<java.lang.Integer> intList28 = null;
        c2s_aug.Stack<java.lang.Integer> intList29 = null;
        fuzzTest0.FuzzTest_push(intList28, intList29, (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList36 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList40 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_push(intList36, intList40, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList49 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList54 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList58 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest51.FuzzTest_push(intList54, intList58, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList66 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList70 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest63.FuzzTest_push(intList66, intList70, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList78 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest51.FuzzTest_push(intList70, intList78, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzzTest33.FuzzTest_push(intList49, intList78, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { (-1), 10, 0 };
        c2s_aug.Stack<java.lang.Integer> intList90 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList78, intList90, (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList1 = null;
        c2s_aug.Stack<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_push(intList1, intList2, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList9 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList13 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest6.FuzzTest_push(intList9, intList13, (java.lang.Integer) 1, (java.lang.Integer) 1);
        c2s_aug.Stack<java.lang.Integer> intList18 = null;
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList22 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList26 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest19.FuzzTest_push(intList22, intList26, (java.lang.Integer) 1, (java.lang.Integer) 1);
        c2s_aug.Stack<java.lang.Integer> intList31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList35 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList39 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_push(intList35, intList39, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest19.FuzzTest_push(intList31, intList39, (java.lang.Integer) 1, (java.lang.Integer) 0);
        fuzzTest6.FuzzTest_push(intList18, intList39, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList53 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList57 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest50.FuzzTest_push(intList53, intList57, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_push(intList18, intList53, (java.lang.Integer) (-1), (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList68 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList72 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_push(intList68, intList72, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 100, 100, 10, 1 };
        c2s_aug.Stack<java.lang.Integer> intList83 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList68, intList83, (java.lang.Integer) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList3 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList7 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_push(intList3, intList7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList15 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList19 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_push(intList15, intList19, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList27 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_push(intList19, intList27, (java.lang.Integer) 1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1 };
        c2s_aug.Stack<java.lang.Integer> intList34 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        c2s_aug.Stack<java.lang.Integer> intList36 = null;
        fuzzTest0.FuzzTest_push(intList34, intList36, (java.lang.Integer) 10, (java.lang.Integer) 100);
        c2s_aug.Stack<java.lang.Integer> intList40 = null;
        c2s_aug.Stack<java.lang.Integer> intList41 = null;
        fuzzTest0.FuzzTest_push(intList40, intList41, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList48 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList52 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_push(intList48, intList52, (java.lang.Integer) 1, (java.lang.Integer) 1);
        c2s_aug.Stack<java.lang.Integer> intList57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList61 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList65 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_push(intList61, intList65, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest45.FuzzTest_push(intList57, intList65, (java.lang.Integer) 1, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList74 = null;
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList78 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList82 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest75.FuzzTest_push(intList78, intList82, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest73.FuzzTest_push(intList74, intList78, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList65, intList78, (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList1 = null;
        c2s_aug.Stack<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_push(intList1, intList2, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList11 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList15 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest8.FuzzTest_push(intList11, intList15, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest6.FuzzTest_push(intList7, intList11, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        c2s_aug.Stack<java.lang.Integer> intList23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList27 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList31 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_push(intList27, intList31, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest6.FuzzTest_push(intList23, intList27, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList43 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList47 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_push(intList43, intList47, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList55 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList59 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest52.FuzzTest_push(intList55, intList59, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList67 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest40.FuzzTest_push(intList59, intList67, (java.lang.Integer) 1, (java.lang.Integer) 10);
        c2s_aug.Stack<java.lang.Integer> intList72 = null;
        fuzzTest39.FuzzTest_push(intList67, intList72, (java.lang.Integer) 10, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList27, intList67, (java.lang.Integer) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList5 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList9 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_push(intList5, intList9, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_push(intList1, intList5, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList18 = null;
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList22 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList26 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest19.FuzzTest_push(intList22, intList26, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_push(intList18, intList22, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        c2s_aug.Stack<java.lang.Integer> intList34 = null;
        fuzzTest0.FuzzTest_push(intList18, intList34, (java.lang.Integer) 100, (java.lang.Integer) 10);
        c2s_aug.Stack<java.lang.Integer> intList38 = null;
        c2s_aug.Stack<java.lang.Integer> intList39 = null;
        fuzzTest0.FuzzTest_push(intList38, intList39, (java.lang.Integer) (-1), (java.lang.Integer) 10);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-1), 0 };
        c2s_aug.Stack<java.lang.Integer> intList46 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList52 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList56 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_push(intList52, intList56, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList64 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList68 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_push(intList64, intList68, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList76 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest49.FuzzTest_push(intList68, intList76, (java.lang.Integer) 1, (java.lang.Integer) 10);
        c2s_aug.Stack<java.lang.Integer> intList81 = null;
        fuzzTest48.FuzzTest_push(intList76, intList81, (java.lang.Integer) 10, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList46, intList76, (java.lang.Integer) (-1), (java.lang.Integer) 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList3 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList8 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList12 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest5.FuzzTest_push(intList8, intList12, (java.lang.Integer) 1, (java.lang.Integer) 1);
        c2s_aug.Stack<java.lang.Integer> intList17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList21 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList25 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_push(intList21, intList25, (java.lang.Integer) 1, (java.lang.Integer) 1);
        c2s_aug.Stack<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList34 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList38 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_push(intList34, intList38, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest18.FuzzTest_push(intList30, intList38, (java.lang.Integer) 1, (java.lang.Integer) 0);
        fuzzTest5.FuzzTest_push(intList17, intList30, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList52 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList57 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList61 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest54.FuzzTest_push(intList57, intList61, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest5.FuzzTest_push(intList52, intList61, (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_push(intList3, intList61, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList75 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList79 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest72.FuzzTest_push(intList75, intList79, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-1), 0, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList88 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList75, intList88, (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList1 = null;
        c2s_aug.Stack<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_push(intList1, intList2, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList8 = null;
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList12 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList16 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest9.FuzzTest_push(intList12, intList16, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest7.FuzzTest_push(intList8, intList12, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 0, 1, 1, 10, 10 };
        c2s_aug.Stack<java.lang.Integer> intList30 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest6.FuzzTest_push(intList8, intList30, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList38 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList42 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_push(intList38, intList42, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList50 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList54 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest47.FuzzTest_push(intList50, intList54, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList62 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList66 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest59.FuzzTest_push(intList62, intList66, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Stack<java.lang.Integer> intList74 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest47.FuzzTest_push(intList66, intList74, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzzTest6.FuzzTest_push(intList42, intList74, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10, 0, (-1), 100 };
        c2s_aug.Stack<java.lang.Integer> intList87 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList42, intList87, (java.lang.Integer) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList5 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList9 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_push(intList5, intList9, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_push(intList1, intList5, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0 };
        c2s_aug.Stack<java.lang.Integer> intList19 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList24 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList28 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest21.FuzzTest_push(intList24, intList28, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_push(intList19, intList24, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList42 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList46 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest39.FuzzTest_push(intList42, intList46, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest37.FuzzTest_push(intList38, intList42, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, 1, 1, 10, 10 };
        c2s_aug.Stack<java.lang.Integer> intList60 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest36.FuzzTest_push(intList38, intList60, (java.lang.Integer) 0, (java.lang.Integer) 0);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList67 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList72 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList76 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest69.FuzzTest_push(intList72, intList76, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest36.FuzzTest_push(intList67, intList72, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 100, 1, (-1), (-1) };
        c2s_aug.Stack<java.lang.Integer> intList89 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList72, intList89, (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList3 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList7 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_push(intList3, intList7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList15 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList19 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_push(intList15, intList19, (java.lang.Integer) 1, (java.lang.Integer) 1);
        c2s_aug.Stack<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList28 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList32 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_push(intList28, intList32, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_push(intList24, intList32, (java.lang.Integer) 1, (java.lang.Integer) 0);
        c2s_aug.Stack<java.lang.Integer> intList40 = null;
        fuzzTest0.FuzzTest_push(intList24, intList40, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug.Stack<java.lang.Integer> intList46 = null;
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        c2s_aug.Stack<java.lang.Integer> intList50 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        c2s_aug.Stack<java.lang.Integer> intList54 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest47.FuzzTest_push(intList50, intList54, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest45.FuzzTest_push(intList46, intList50, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, 1, 1, 10, 10 };
        c2s_aug.Stack<java.lang.Integer> intList68 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest44.FuzzTest_push(intList46, intList68, (java.lang.Integer) 0, (java.lang.Integer) 0);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { (-1), 100, 0 };
        c2s_aug.Stack<java.lang.Integer> intList77 = new c2s_aug.Stack<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_push(intList68, intList77, (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }
}

