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
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList5 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList1, intList5, (java.util.Collection<java.lang.Integer>) intList7);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList2, (java.util.Collection<java.lang.Integer>) intList9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList14 = null;
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList21 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest12.FuzzTest_ArrayList(intList13, intList14, (java.util.Collection<java.lang.Integer>) intList21);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest25.FuzzTest_ArrayList(intList26, intList27, (java.util.Collection<java.lang.Integer>) intList34);
        fuzzTest0.FuzzTest_ArrayList(intList14, intList24, (java.util.Collection<java.lang.Integer>) intList26);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList42 = null;
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList49 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest40.FuzzTest_ArrayList(intList41, intList42, (java.util.Collection<java.lang.Integer>) intList49);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList38, intList39, (java.util.Collection<java.lang.Integer>) intList41);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList2, (java.util.Collection<java.lang.Integer>) intList9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList14 = null;
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList21 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest12.FuzzTest_ArrayList(intList13, intList14, (java.util.Collection<java.lang.Integer>) intList21);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest25.FuzzTest_ArrayList(intList26, intList27, (java.util.Collection<java.lang.Integer>) intList34);
        fuzzTest0.FuzzTest_ArrayList(intList14, intList24, (java.util.Collection<java.lang.Integer>) intList26);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = null;
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-1), 2, 100, 10, 100, 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList46 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList50 = null;
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest48.FuzzTest_ArrayList(intList49, intList50, (java.util.Collection<java.lang.Integer>) intList57);
        fuzzTest0.FuzzTest_ArrayList(intList38, intList46, (java.util.Collection<java.lang.Integer>) intList50);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList63 = null;
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList70 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest61.FuzzTest_ArrayList(intList62, intList63, (java.util.Collection<java.lang.Integer>) intList70);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_ArrayList(intList62, intList73, (java.util.Collection<java.lang.Integer>) intList74);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList77 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList78 = null;
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList85 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest76.FuzzTest_ArrayList(intList77, intList78, (java.util.Collection<java.lang.Integer>) intList85);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 100, 10, 10, 1, 2, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList95 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList95, intArray94);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList97 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList77, intList95, (java.util.Collection<java.lang.Integer>) intList97);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList2, (java.util.Collection<java.lang.Integer>) intList9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList14 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList15 = null;
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest13.FuzzTest_ArrayList(intList14, intList15, (java.util.Collection<java.lang.Integer>) intList22);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest25.FuzzTest_ArrayList(intList26, intList27, (java.util.Collection<java.lang.Integer>) intList34);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_ArrayList(intList15, intList27, (java.util.Collection<java.lang.Integer>) intList37);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = null;
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest39.FuzzTest_ArrayList(intList40, intList41, (java.util.Collection<java.lang.Integer>) intList48);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList53 = null;
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList60 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest51.FuzzTest_ArrayList(intList52, intList53, (java.util.Collection<java.lang.Integer>) intList60);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = null;
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList72 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest63.FuzzTest_ArrayList(intList64, intList65, (java.util.Collection<java.lang.Integer>) intList72);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList76 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList77 = null;
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList84 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest75.FuzzTest_ArrayList(intList76, intList77, (java.util.Collection<java.lang.Integer>) intList84);
        fuzzTest39.FuzzTest_ArrayList(intList53, intList64, (java.util.Collection<java.lang.Integer>) intList84);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList88 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList89 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList90 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_ArrayList(intList88, intList89, (java.util.Collection<java.lang.Integer>) intList90);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList37, intList90, (java.util.Collection<java.lang.Integer>) intList92);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList5 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = null;
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest4.FuzzTest_ArrayList(intList5, intList6, (java.util.Collection<java.lang.Integer>) intList13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList17 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = null;
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest16.FuzzTest_ArrayList(intList17, intList18, (java.util.Collection<java.lang.Integer>) intList25);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList31 = null;
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest29.FuzzTest_ArrayList(intList30, intList31, (java.util.Collection<java.lang.Integer>) intList38);
        fuzzTest4.FuzzTest_ArrayList(intList18, intList28, (java.util.Collection<java.lang.Integer>) intList30);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = null;
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest42.FuzzTest_ArrayList(intList43, intList44, (java.util.Collection<java.lang.Integer>) intList51);
        fuzzTest2.FuzzTest_ArrayList(intList3, intList18, (java.util.Collection<java.lang.Integer>) intList43);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList1, intList3, (java.util.Collection<java.lang.Integer>) intList55);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList2, (java.util.Collection<java.lang.Integer>) intList9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList14 = null;
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList21 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest12.FuzzTest_ArrayList(intList13, intList14, (java.util.Collection<java.lang.Integer>) intList21);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest25.FuzzTest_ArrayList(intList26, intList27, (java.util.Collection<java.lang.Integer>) intList34);
        fuzzTest0.FuzzTest_ArrayList(intList14, intList24, (java.util.Collection<java.lang.Integer>) intList26);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, (-1), 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList42 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList46 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = null;
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList54 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest45.FuzzTest_ArrayList(intList46, intList47, (java.util.Collection<java.lang.Integer>) intList54);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList59 = null;
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList66 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest57.FuzzTest_ArrayList(intList58, intList59, (java.util.Collection<java.lang.Integer>) intList66);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList71 = null;
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList78 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest69.FuzzTest_ArrayList(intList70, intList71, (java.util.Collection<java.lang.Integer>) intList78);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList82 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList83 = null;
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList90 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        fuzzTest81.FuzzTest_ArrayList(intList82, intList83, (java.util.Collection<java.lang.Integer>) intList90);
        fuzzTest45.FuzzTest_ArrayList(intList59, intList70, (java.util.Collection<java.lang.Integer>) intList90);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList94 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList95 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList96 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_ArrayList(intList94, intList95, (java.util.Collection<java.lang.Integer>) intList96);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList42, intList44, (java.util.Collection<java.lang.Integer>) intList96);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest0.FuzzTest_ArrayList(intList1, intList2, (java.util.Collection<java.lang.Integer>) intList9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList14 = null;
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList21 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest12.FuzzTest_ArrayList(intList13, intList14, (java.util.Collection<java.lang.Integer>) intList21);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList25 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = null;
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest24.FuzzTest_ArrayList(intList25, intList26, (java.util.Collection<java.lang.Integer>) intList33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = null;
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList45 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest36.FuzzTest_ArrayList(intList37, intList38, (java.util.Collection<java.lang.Integer>) intList45);
        fuzzTest0.FuzzTest_ArrayList(intList14, intList25, (java.util.Collection<java.lang.Integer>) intList45);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList49 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList50 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_ArrayList(intList49, intList50, (java.util.Collection<java.lang.Integer>) intList51);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList53 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10, 100, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList61 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList62 = null;
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList69 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest60.FuzzTest_ArrayList(intList61, intList62, (java.util.Collection<java.lang.Integer>) intList69);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList74 = null;
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList81 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest72.FuzzTest_ArrayList(intList73, intList74, (java.util.Collection<java.lang.Integer>) intList81);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest85 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList87 = null;
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 1, 1, 10, 2, 10 };
        java.util.ArrayList<java.lang.Integer> intList94 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList94, intArray93);
        fuzzTest85.FuzzTest_ArrayList(intList86, intList87, (java.util.Collection<java.lang.Integer>) intList94);
        fuzzTest60.FuzzTest_ArrayList(intList74, intList84, (java.util.Collection<java.lang.Integer>) intList86);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_ArrayList(intList53, intList58, (java.util.Collection<java.lang.Integer>) intList86);
    }
}

