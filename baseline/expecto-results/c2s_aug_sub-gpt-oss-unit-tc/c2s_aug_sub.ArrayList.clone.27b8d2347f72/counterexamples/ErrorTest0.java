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
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList4 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList1, intList4, intList6);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList5 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList1, intList5, intList7);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList4 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList15 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest6.FuzzTest_clone(intList7, intList8, intList15);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest1.FuzzTest_clone(intList4, intList8, intList24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = null;
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest27.FuzzTest_clone(intList28, intList29, intList36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList43 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = null;
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList54 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest45.FuzzTest_clone(intList46, intList47, intList54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList59 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest27.FuzzTest_clone(intList43, intList47, intList59);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList63 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList64 = null;
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList71 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest62.FuzzTest_clone(intList63, intList64, intList71);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList78 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList81 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList82 = null;
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList89 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        fuzzTest80.FuzzTest_clone(intList81, intList82, intList89);
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList94 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList94, intArray93);
        fuzzTest62.FuzzTest_clone(intList78, intList82, intList94);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList24, intList59, intList82);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList4 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList15 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest6.FuzzTest_clone(intList7, intList8, intList15);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest1.FuzzTest_clone(intList4, intList8, intList24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList34 = null;
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest32.FuzzTest_clone(intList33, intList34, intList41);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList50 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest27.FuzzTest_clone(intList30, intList34, intList50);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList53 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList4, intList30, intList53);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList4 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList15 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest6.FuzzTest_clone(intList7, intList8, intList15);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest1.FuzzTest_clone(intList4, intList8, intList24);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = null;
        fuzzTest0.FuzzTest_clone(intList8, intList27, intList28);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 0, 100, 2 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList43 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = null;
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList54 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest45.FuzzTest_clone(intList46, intList47, intList54);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList63 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest40.FuzzTest_clone(intList43, intList47, intList63);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList69 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = null;
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList80 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest71.FuzzTest_clone(intList72, intList73, intList80);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList89 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        fuzzTest66.FuzzTest_clone(intList69, intList73, intList89);
        fuzzTest38.FuzzTest_clone(intList39, intList47, intList89);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList30, intList36, intList47);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList4 = null;
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzzTest2.FuzzTest_clone(intList3, intList4, intList11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList22 = null;
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest20.FuzzTest_clone(intList21, intList22, intList29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList34 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest2.FuzzTest_clone(intList18, intList22, intList34);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = null;
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList46 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest37.FuzzTest_clone(intList38, intList39, intList46);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList1, intList18, intList39);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = null;
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzzTest1.FuzzTest_clone(intList2, intList3, intList10);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, 100, 2, 1, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList25 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = null;
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest27.FuzzTest_clone(intList28, intList29, intList36);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList45 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest22.FuzzTest_clone(intList25, intList29, intList45);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList49 = null;
        fuzzTest21.FuzzTest_clone(intList29, intList48, intList49);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList51 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList56 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList59 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList60 = null;
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList67 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest58.FuzzTest_clone(intList59, intList60, intList67);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList76 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest53.FuzzTest_clone(intList56, intList60, intList76);
        fuzzTest21.FuzzTest_clone(intList51, intList52, intList60);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList80 = null;
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList85 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 0, 2, (-1), 10, 2 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList93 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        fuzzTest21.FuzzTest_clone(intList80, intList85, intList93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList10, intList19, intList80);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest0.FuzzTest_clone(intList1, intList2, intList9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList16 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList25 = null;
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest23.FuzzTest_clone(intList24, intList25, intList32);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest18.FuzzTest_clone(intList21, intList25, intList41);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, 2, 2, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList49 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest12.FuzzTest_clone(intList16, intList25, intList49);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList56 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList61 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = null;
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest63.FuzzTest_clone(intList64, intList65, intList72);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList81 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest58.FuzzTest_clone(intList61, intList65, intList81);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 100, 2, 2, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList89 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        fuzzTest52.FuzzTest_clone(intList56, intList65, intList89);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList16, intList89, intList92);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = null;
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList14 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest5.FuzzTest_clone(intList6, intList7, intList14);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest0.FuzzTest_clone(intList3, intList7, intList23);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList26, intList27, intList28);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest0.FuzzTest_clone(intList1, intList2, intList9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList14 = null;
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest12.FuzzTest_clone(intList13, intList14, intList21);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList25 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList21, intList24, intList25);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList4 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList15 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest6.FuzzTest_clone(intList7, intList8, intList15);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest1.FuzzTest_clone(intList4, intList8, intList24);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = null;
        fuzzTest0.FuzzTest_clone(intList8, intList27, intList28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList33 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = null;
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest35.FuzzTest_clone(intList36, intList37, intList44);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList33, intList36, intList47);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList4 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList15 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest6.FuzzTest_clone(intList7, intList8, intList15);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest1.FuzzTest_clone(intList4, intList8, intList24);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = null;
        fuzzTest0.FuzzTest_clone(intList8, intList27, intList28);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList42 = null;
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList49 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest40.FuzzTest_clone(intList41, intList42, intList49);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest35.FuzzTest_clone(intList38, intList42, intList58);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList61 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList62 = null;
        fuzzTest34.FuzzTest_clone(intList42, intList61, intList62);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList64 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList32, intList61, intList64);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = null;
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzzTest1.FuzzTest_clone(intList2, intList3, intList10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList17 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = null;
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest19.FuzzTest_clone(intList20, intList21, intList28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList33 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest1.FuzzTest_clone(intList17, intList21, intList33);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList46 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList50 = null;
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList57 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest48.FuzzTest_clone(intList49, intList50, intList57);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList66 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest43.FuzzTest_clone(intList46, intList50, intList66);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 2, 2, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList74 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest37.FuzzTest_clone(intList41, intList50, intList74);
        fuzzTest0.FuzzTest_clone(intList21, intList36, intList50);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, (-1), (-1), 0, 1, 2 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList85 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 100, 10, 100, (-1), 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList93 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList95 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList85, intList93, intList95);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = null;
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList14 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest5.FuzzTest_clone(intList6, intList7, intList14);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest0.FuzzTest_clone(intList3, intList7, intList23);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList34 = null;
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest32.FuzzTest_clone(intList33, intList34, intList41);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList50 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest27.FuzzTest_clone(intList30, intList34, intList50);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList63 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList66 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList67 = null;
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList74 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest65.FuzzTest_clone(intList66, intList67, intList74);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList83 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest60.FuzzTest_clone(intList63, intList67, intList83);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 100, 2, 2, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList91 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        fuzzTest54.FuzzTest_clone(intList58, intList67, intList91);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList94 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_clone(intList53, intList67, intList94);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList96 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList26, intList94, intList96);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList4 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = null;
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList15 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest6.FuzzTest_clone(intList7, intList8, intList15);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest1.FuzzTest_clone(intList4, intList8, intList24);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 10, 2, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = null;
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest39.FuzzTest_clone(intList40, intList41, intList48);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList57 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest34.FuzzTest_clone(intList37, intList41, intList57);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clone(intList32, intList41, intList60);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList69 = null;
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList76 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest67.FuzzTest_clone(intList68, intList69, intList76);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList85 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest62.FuzzTest_clone(intList65, intList69, intList85);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList88 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList60, intList65, intList88);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList4 = null;
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzzTest2.FuzzTest_clone(intList3, intList4, intList11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList22 = null;
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest20.FuzzTest_clone(intList21, intList22, intList29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList34 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest2.FuzzTest_clone(intList18, intList22, intList34);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList40 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = null;
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList51 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest42.FuzzTest_clone(intList43, intList44, intList51);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList60 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest37.FuzzTest_clone(intList40, intList44, intList60);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_clone(intList22, intList40, intList63);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_clone(intList63, intList65, intList66);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList71 = null;
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList78 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest69.FuzzTest_clone(intList70, intList71, intList78);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList81 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList68, intList78, intList81);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest0.FuzzTest_clone(intList1, intList2, intList9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList16 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = null;
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest18.FuzzTest_clone(intList19, intList20, intList27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest0.FuzzTest_clone(intList16, intList20, intList32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = null;
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest35.FuzzTest_clone(intList36, intList37, intList44);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList51 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList54 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList55 = null;
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList62 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest53.FuzzTest_clone(intList54, intList55, intList62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList67 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest35.FuzzTest_clone(intList51, intList55, intList67);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = null;
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = null;
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList80 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest71.FuzzTest_clone(intList72, intList73, intList80);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_clone(intList70, intList72, intList83);
        fuzztests.FuzzTest fuzzTest85 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList87 = null;
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList94 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList94, intArray93);
        fuzzTest85.FuzzTest_clone(intList86, intList87, intList94);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList97 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList72, intList94, intList97);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = null;
        fuzzTest0.FuzzTest_clone(intList1, intList2, intList3);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList5 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = null;
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList16 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest7.FuzzTest_clone(intList8, intList9, intList16);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList34 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest25.FuzzTest_clone(intList26, intList27, intList34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest7.FuzzTest_clone(intList23, intList27, intList39);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList45 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList49 = null;
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList56 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest47.FuzzTest_clone(intList48, intList49, intList56);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest42.FuzzTest_clone(intList45, intList49, intList65);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_clone(intList27, intList45, intList68);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList71 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = null;
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList79 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest70.FuzzTest_clone(intList71, intList72, intList79);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList82 = null;
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList84 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList85 = null;
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList92 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        fuzzTest83.FuzzTest_clone(intList84, intList85, intList92);
        fuzzTest6.FuzzTest_clone(intList71, intList82, intList92);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList96 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList5, intList92, intList96);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList4 = null;
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzzTest2.FuzzTest_clone(intList3, intList4, intList11);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList14 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = null;
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList31 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest22.FuzzTest_clone(intList23, intList24, intList31);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList40 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest17.FuzzTest_clone(intList20, intList24, intList40);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = null;
        fuzzTest16.FuzzTest_clone(intList24, intList43, intList44);
        fuzzTest2.FuzzTest_clone(intList14, intList15, intList43);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = null;
        fuzzTest0.FuzzTest_clone(intList1, intList15, intList47);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList51 = null;
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest49.FuzzTest_clone(intList50, intList51, intList58);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList61 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList62 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList50, intList61, intList62);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest0.FuzzTest_clone(intList1, intList2, intList9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList14 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList15 = null;
        fuzzTest12.FuzzTest_clone(intList13, intList14, intList15);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = null;
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList31 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest22.FuzzTest_clone(intList23, intList24, intList31);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList40 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest17.FuzzTest_clone(intList20, intList24, intList40);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1), 10, 2, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList53 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList56 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList57 = null;
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList64 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest55.FuzzTest_clone(intList56, intList57, intList64);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest50.FuzzTest_clone(intList53, intList57, intList73);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_clone(intList48, intList57, intList76);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList78 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList14, intList76, intList78);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = null;
        fuzzTest0.FuzzTest_clone(intList1, intList2, intList3);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = null;
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest10.FuzzTest_clone(intList11, intList12, intList19);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest5.FuzzTest_clone(intList8, intList12, intList28);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList45 = null;
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest43.FuzzTest_clone(intList44, intList45, intList52);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList61 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest38.FuzzTest_clone(intList41, intList45, intList61);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 2, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList69 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest32.FuzzTest_clone(intList36, intList45, intList69);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_clone(intList31, intList45, intList72);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList76 = null;
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList83 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest74.FuzzTest_clone(intList75, intList76, intList83);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList86 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList31, intList83, intList86);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList4 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest11.FuzzTest_clone(intList12, intList13, intList20);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest6.FuzzTest_clone(intList9, intList13, intList29);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 2, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest0.FuzzTest_clone(intList4, intList13, intList37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList43 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = null;
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList54 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest45.FuzzTest_clone(intList46, intList47, intList54);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 100, 2, 0, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList63 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest40.FuzzTest_clone(intList43, intList47, intList63);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList66 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList67 = null;
        fuzzTest0.FuzzTest_clone(intList63, intList66, intList67);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList71 = null;
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList78 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest69.FuzzTest_clone(intList70, intList71, intList78);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList82 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList83 = null;
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList90 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        fuzzTest81.FuzzTest_clone(intList82, intList83, intList90);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList93 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList78, intList82, intList93);
    }
}

