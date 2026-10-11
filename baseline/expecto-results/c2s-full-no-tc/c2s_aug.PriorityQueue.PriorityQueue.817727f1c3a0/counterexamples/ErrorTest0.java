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
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue3 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue7 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.util.Comparator<java.lang.Integer> intComparator10 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue3, intQueue7, (-1), intComparator10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue3 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue7 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.util.Comparator<java.lang.Integer> intComparator10 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue3, intQueue7, 0, intComparator10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue10 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.util.Comparator<java.lang.Integer> intComparator13 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue10, (int) (byte) 0, intComparator13);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.util.Comparator<java.lang.Integer> intComparator12 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue5, intQueue9, (int) (byte) 10, intComparator12);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.util.Comparator<java.lang.Integer> intComparator25 = null;
        fuzzTest14.FuzzTest_PriorityQueue(intQueue18, intQueue22, (int) (byte) 10, intComparator25);
        java.util.Comparator<java.lang.Integer> intComparator28 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue9, intQueue22, (int) '4', intComparator28);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue34 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue38 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        java.util.Comparator<java.lang.Integer> intComparator41 = null;
        fuzzTest30.FuzzTest_PriorityQueue(intQueue34, intQueue38, (int) (byte) 10, intComparator41);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, 1, 1, (-1), 100 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue49 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.util.Comparator<java.lang.Integer> intComparator52 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue34, intQueue49, (int) (short) 0, intComparator52);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.util.Comparator<java.lang.Integer> intComparator12 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue5, intQueue9, (int) (byte) 10, intComparator12);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.util.Comparator<java.lang.Integer> intComparator25 = null;
        fuzzTest14.FuzzTest_PriorityQueue(intQueue18, intQueue22, (int) (byte) 10, intComparator25);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue31 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.util.Comparator<java.lang.Integer> intComparator38 = null;
        fuzzTest27.FuzzTest_PriorityQueue(intQueue31, intQueue35, (int) (byte) 10, intComparator38);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue45 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue49 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.util.Comparator<java.lang.Integer> intComparator52 = null;
        fuzzTest41.FuzzTest_PriorityQueue(intQueue45, intQueue49, (int) (byte) 10, intComparator52);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue58 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue62 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.util.Comparator<java.lang.Integer> intComparator65 = null;
        fuzzTest54.FuzzTest_PriorityQueue(intQueue58, intQueue62, (int) (byte) 10, intComparator65);
        java.util.Comparator<java.lang.Integer> intComparator68 = null;
        fuzzTest40.FuzzTest_PriorityQueue(intQueue49, intQueue62, (int) '4', intComparator68);
        java.util.Comparator<java.lang.Integer> intComparator71 = null;
        fuzzTest14.FuzzTest_PriorityQueue(intQueue31, intQueue49, (int) (byte) 1, intComparator71);
        java.util.Comparator<java.lang.Integer> intComparator74 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue5, intQueue31, 10, intComparator74);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue80 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue84 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue84, intArray83);
        java.util.Comparator<java.lang.Integer> intComparator87 = null;
        fuzzTest76.FuzzTest_PriorityQueue(intQueue80, intQueue84, (int) (byte) 10, intComparator87);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue92 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue92, intArray91);
        java.util.Comparator<java.lang.Integer> intComparator95 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue84, intQueue92, (int) (byte) -1, intComparator95);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.util.Comparator<java.lang.Integer> intComparator12 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue5, intQueue9, (int) (byte) 10, intComparator12);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.util.Comparator<java.lang.Integer> intComparator25 = null;
        fuzzTest14.FuzzTest_PriorityQueue(intQueue18, intQueue22, (int) (byte) 10, intComparator25);
        java.util.Comparator<java.lang.Integer> intComparator28 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue9, intQueue22, (int) '4', intComparator28);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue39 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.util.Comparator<java.lang.Integer> intComparator42 = null;
        fuzzTest31.FuzzTest_PriorityQueue(intQueue35, intQueue39, (int) (byte) 10, intComparator42);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue48 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue52 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.util.Comparator<java.lang.Integer> intComparator55 = null;
        fuzzTest44.FuzzTest_PriorityQueue(intQueue48, intQueue52, (int) (byte) 10, intComparator55);
        java.util.Comparator<java.lang.Integer> intComparator58 = null;
        fuzzTest30.FuzzTest_PriorityQueue(intQueue39, intQueue52, (int) '4', intComparator58);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0, 10, 0, 0 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue65 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.util.Comparator<java.lang.Integer> intComparator68 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue52, intQueue65, (int) (short) 0, intComparator68);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.util.Comparator<java.lang.Integer> intComparator11 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue8, (int) (byte) 10, intComparator11);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue17 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue21 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.util.Comparator<java.lang.Integer> intComparator24 = null;
        fuzzTest13.FuzzTest_PriorityQueue(intQueue17, intQueue21, (int) (byte) 10, intComparator24);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue31 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.util.Comparator<java.lang.Integer> intComparator38 = null;
        fuzzTest27.FuzzTest_PriorityQueue(intQueue31, intQueue35, (int) (byte) 10, intComparator38);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue44 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue48 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.util.Comparator<java.lang.Integer> intComparator51 = null;
        fuzzTest40.FuzzTest_PriorityQueue(intQueue44, intQueue48, (int) (byte) 10, intComparator51);
        java.util.Comparator<java.lang.Integer> intComparator54 = null;
        fuzzTest26.FuzzTest_PriorityQueue(intQueue35, intQueue48, (int) '4', intComparator54);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue56 = null;
        java.util.Comparator<java.lang.Integer> intComparator58 = null;
        fuzzTest13.FuzzTest_PriorityQueue(intQueue35, intQueue56, 0, intComparator58);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue65 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue69 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        java.util.Comparator<java.lang.Integer> intComparator72 = null;
        fuzzTest61.FuzzTest_PriorityQueue(intQueue65, intQueue69, (int) (byte) 10, intComparator72);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue78 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue82 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        java.util.Comparator<java.lang.Integer> intComparator85 = null;
        fuzzTest74.FuzzTest_PriorityQueue(intQueue78, intQueue82, (int) (byte) 10, intComparator85);
        java.util.Comparator<java.lang.Integer> intComparator88 = null;
        fuzzTest60.FuzzTest_PriorityQueue(intQueue69, intQueue82, (int) '4', intComparator88);
        java.util.Comparator<java.lang.Integer> intComparator91 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue35, intQueue69, (int) (byte) -1, intComparator91);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.util.Comparator<java.lang.Integer> intComparator11 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue8, (int) (byte) 10, intComparator11);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 0 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue16 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue26 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.util.Comparator<java.lang.Integer> intComparator29 = null;
        fuzzTest18.FuzzTest_PriorityQueue(intQueue22, intQueue26, (int) (byte) 10, intComparator29);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue39 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.util.Comparator<java.lang.Integer> intComparator42 = null;
        fuzzTest31.FuzzTest_PriorityQueue(intQueue35, intQueue39, (int) (byte) 10, intComparator42);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue48 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue52 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.util.Comparator<java.lang.Integer> intComparator55 = null;
        fuzzTest44.FuzzTest_PriorityQueue(intQueue48, intQueue52, (int) (byte) 10, intComparator55);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue62 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue66 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.util.Comparator<java.lang.Integer> intComparator69 = null;
        fuzzTest58.FuzzTest_PriorityQueue(intQueue62, intQueue66, (int) (byte) 10, intComparator69);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue75 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue79 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        java.util.Comparator<java.lang.Integer> intComparator82 = null;
        fuzzTest71.FuzzTest_PriorityQueue(intQueue75, intQueue79, (int) (byte) 10, intComparator82);
        java.util.Comparator<java.lang.Integer> intComparator85 = null;
        fuzzTest57.FuzzTest_PriorityQueue(intQueue66, intQueue79, (int) '4', intComparator85);
        java.util.Comparator<java.lang.Integer> intComparator88 = null;
        fuzzTest31.FuzzTest_PriorityQueue(intQueue48, intQueue66, (int) (byte) 1, intComparator88);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue92 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue92, intArray91);
        java.util.Comparator<java.lang.Integer> intComparator95 = null;
        fuzzTest18.FuzzTest_PriorityQueue(intQueue66, intQueue92, (int) (short) 1, intComparator95);
        java.util.Comparator<java.lang.Integer> intComparator98 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue16, intQueue92, 0, intComparator98);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.util.Comparator<java.lang.Integer> intComparator11 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue8, (int) (byte) 10, intComparator11);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue17 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue21 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.util.Comparator<java.lang.Integer> intComparator24 = null;
        fuzzTest13.FuzzTest_PriorityQueue(intQueue17, intQueue21, (int) (byte) 10, intComparator24);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue30 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue34 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        java.util.Comparator<java.lang.Integer> intComparator37 = null;
        fuzzTest26.FuzzTest_PriorityQueue(intQueue30, intQueue34, (int) (byte) 10, intComparator37);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue44 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue48 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.util.Comparator<java.lang.Integer> intComparator51 = null;
        fuzzTest40.FuzzTest_PriorityQueue(intQueue44, intQueue48, (int) (byte) 10, intComparator51);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue57 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue61 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.util.Comparator<java.lang.Integer> intComparator64 = null;
        fuzzTest53.FuzzTest_PriorityQueue(intQueue57, intQueue61, (int) (byte) 10, intComparator64);
        java.util.Comparator<java.lang.Integer> intComparator67 = null;
        fuzzTest39.FuzzTest_PriorityQueue(intQueue48, intQueue61, (int) '4', intComparator67);
        java.util.Comparator<java.lang.Integer> intComparator70 = null;
        fuzzTest13.FuzzTest_PriorityQueue(intQueue30, intQueue48, (int) (byte) 1, intComparator70);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue76 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue80 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        java.util.Comparator<java.lang.Integer> intComparator83 = null;
        fuzzTest72.FuzzTest_PriorityQueue(intQueue76, intQueue80, (int) (byte) 10, intComparator83);
        java.util.Comparator<java.lang.Integer> intComparator86 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue30, intQueue76, (-1), intComparator86);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.util.Comparator<java.lang.Integer> intComparator11 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue8, (int) (byte) 10, intComparator11);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue17 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue21 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.util.Comparator<java.lang.Integer> intComparator24 = null;
        fuzzTest13.FuzzTest_PriorityQueue(intQueue17, intQueue21, (int) (byte) 10, intComparator24);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue31 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.util.Comparator<java.lang.Integer> intComparator38 = null;
        fuzzTest27.FuzzTest_PriorityQueue(intQueue31, intQueue35, (int) (byte) 10, intComparator38);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue44 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue48 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.util.Comparator<java.lang.Integer> intComparator51 = null;
        fuzzTest40.FuzzTest_PriorityQueue(intQueue44, intQueue48, (int) (byte) 10, intComparator51);
        java.util.Comparator<java.lang.Integer> intComparator54 = null;
        fuzzTest26.FuzzTest_PriorityQueue(intQueue35, intQueue48, (int) '4', intComparator54);
        java.util.Comparator<java.lang.Integer> intComparator57 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue17, intQueue48, (int) (short) -1, intComparator57);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue6 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue10 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.util.Comparator<java.lang.Integer> intComparator13 = null;
        fuzzTest2.FuzzTest_PriorityQueue(intQueue6, intQueue10, (int) (byte) 10, intComparator13);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.util.Comparator<java.lang.Integer> intComparator26 = null;
        fuzzTest15.FuzzTest_PriorityQueue(intQueue19, intQueue23, (int) (byte) 10, intComparator26);
        java.util.Comparator<java.lang.Integer> intComparator29 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue10, intQueue23, (int) '4', intComparator29);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue36 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue40 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.util.Comparator<java.lang.Integer> intComparator43 = null;
        fuzzTest32.FuzzTest_PriorityQueue(intQueue36, intQueue40, (int) (byte) 10, intComparator43);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue49 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue53 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.util.Comparator<java.lang.Integer> intComparator56 = null;
        fuzzTest45.FuzzTest_PriorityQueue(intQueue49, intQueue53, (int) (byte) 10, intComparator56);
        java.util.Comparator<java.lang.Integer> intComparator59 = null;
        fuzzTest31.FuzzTest_PriorityQueue(intQueue40, intQueue53, (int) '4', intComparator59);
        java.util.Comparator<java.lang.Integer> intComparator62 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue23, intQueue53, (int) (short) -1, intComparator62);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue7 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue11 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        java.util.Comparator<java.lang.Integer> intComparator14 = null;
        fuzzTest3.FuzzTest_PriorityQueue(intQueue7, intQueue11, (int) (byte) 10, intComparator14);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue21 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue25 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.util.Comparator<java.lang.Integer> intComparator28 = null;
        fuzzTest17.FuzzTest_PriorityQueue(intQueue21, intQueue25, (int) (byte) 10, intComparator28);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue34 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue38 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        java.util.Comparator<java.lang.Integer> intComparator41 = null;
        fuzzTest30.FuzzTest_PriorityQueue(intQueue34, intQueue38, (int) (byte) 10, intComparator41);
        java.util.Comparator<java.lang.Integer> intComparator44 = null;
        fuzzTest16.FuzzTest_PriorityQueue(intQueue25, intQueue38, (int) '4', intComparator44);
        java.util.Comparator<java.lang.Integer> intComparator47 = null;
        fuzzTest2.FuzzTest_PriorityQueue(intQueue11, intQueue25, (int) '4', intComparator47);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue53 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue57 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.util.Comparator<java.lang.Integer> intComparator60 = null;
        fuzzTest49.FuzzTest_PriorityQueue(intQueue53, intQueue57, (int) (byte) 10, intComparator60);
        java.util.Comparator<java.lang.Integer> intComparator63 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue11, intQueue57, (int) ' ', intComparator63);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue70 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue74 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        java.util.Comparator<java.lang.Integer> intComparator77 = null;
        fuzzTest66.FuzzTest_PriorityQueue(intQueue70, intQueue74, (int) (byte) 10, intComparator77);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue83 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue87 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue87, intArray86);
        java.util.Comparator<java.lang.Integer> intComparator90 = null;
        fuzzTest79.FuzzTest_PriorityQueue(intQueue83, intQueue87, (int) (byte) 10, intComparator90);
        java.util.Comparator<java.lang.Integer> intComparator93 = null;
        fuzzTest65.FuzzTest_PriorityQueue(intQueue74, intQueue87, (int) '4', intComparator93);
        java.util.Comparator<java.lang.Integer> intComparator96 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue11, intQueue87, (int) (short) -1, intComparator96);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.util.Comparator<java.lang.Integer> intComparator11 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue8, (int) (byte) 10, intComparator11);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.util.Comparator<java.lang.Integer> intComparator25 = null;
        fuzzTest14.FuzzTest_PriorityQueue(intQueue18, intQueue22, (int) (byte) 10, intComparator25);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue32 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue36 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.util.Comparator<java.lang.Integer> intComparator39 = null;
        fuzzTest28.FuzzTest_PriorityQueue(intQueue32, intQueue36, (int) (byte) 10, intComparator39);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue45 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue49 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.util.Comparator<java.lang.Integer> intComparator52 = null;
        fuzzTest41.FuzzTest_PriorityQueue(intQueue45, intQueue49, (int) (byte) 10, intComparator52);
        java.util.Comparator<java.lang.Integer> intComparator55 = null;
        fuzzTest27.FuzzTest_PriorityQueue(intQueue36, intQueue49, (int) '4', intComparator55);
        java.util.Comparator<java.lang.Integer> intComparator58 = null;
        fuzzTest13.FuzzTest_PriorityQueue(intQueue22, intQueue36, (int) '4', intComparator58);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 1, (-1), (-1), 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue66 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue72 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue76 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.util.Comparator<java.lang.Integer> intComparator79 = null;
        fuzzTest68.FuzzTest_PriorityQueue(intQueue72, intQueue76, (int) (byte) 10, intComparator79);
        java.util.Comparator<java.lang.Integer> intComparator82 = null;
        fuzzTest13.FuzzTest_PriorityQueue(intQueue66, intQueue76, (int) 'a', intComparator82);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 0, 0, (-1), 10 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue89 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue89, intArray88);
        java.util.Comparator<java.lang.Integer> intComparator92 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue66, intQueue89, (int) (byte) 0, intComparator92);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.util.Comparator<java.lang.Integer> intComparator11 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue8, (int) (byte) 10, intComparator11);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10, 0, 10, 10, 100 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue26 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue30 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.util.Comparator<java.lang.Integer> intComparator33 = null;
        fuzzTest22.FuzzTest_PriorityQueue(intQueue26, intQueue30, (int) (byte) 10, intComparator33);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue39 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.util.Comparator<java.lang.Integer> intComparator46 = null;
        fuzzTest35.FuzzTest_PriorityQueue(intQueue39, intQueue43, (int) (byte) 10, intComparator46);
        java.util.Comparator<java.lang.Integer> intComparator49 = null;
        fuzzTest21.FuzzTest_PriorityQueue(intQueue30, intQueue43, (int) '4', intComparator49);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue55 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue59 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        java.util.Comparator<java.lang.Integer> intComparator62 = null;
        fuzzTest51.FuzzTest_PriorityQueue(intQueue55, intQueue59, (int) (byte) 10, intComparator62);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue69 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue73 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.util.Comparator<java.lang.Integer> intComparator76 = null;
        fuzzTest65.FuzzTest_PriorityQueue(intQueue69, intQueue73, (int) (byte) 10, intComparator76);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue82 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue86 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        java.util.Comparator<java.lang.Integer> intComparator89 = null;
        fuzzTest78.FuzzTest_PriorityQueue(intQueue82, intQueue86, (int) (byte) 10, intComparator89);
        java.util.Comparator<java.lang.Integer> intComparator92 = null;
        fuzzTest64.FuzzTest_PriorityQueue(intQueue73, intQueue86, (int) '4', intComparator92);
        java.util.Comparator<java.lang.Integer> intComparator95 = null;
        fuzzTest21.FuzzTest_PriorityQueue(intQueue59, intQueue86, (int) 'a', intComparator95);
        java.util.Comparator<java.lang.Integer> intComparator98 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue19, intQueue59, 0, intComparator98);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue6 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue10 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.util.Comparator<java.lang.Integer> intComparator13 = null;
        fuzzTest2.FuzzTest_PriorityQueue(intQueue6, intQueue10, (int) (byte) 10, intComparator13);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.util.Comparator<java.lang.Integer> intComparator26 = null;
        fuzzTest15.FuzzTest_PriorityQueue(intQueue19, intQueue23, (int) (byte) 10, intComparator26);
        java.util.Comparator<java.lang.Integer> intComparator29 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue10, intQueue23, (int) '4', intComparator29);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue31 = null;
        java.util.Comparator<java.lang.Integer> intComparator33 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue23, intQueue31, 100, intComparator33);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue39 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.util.Comparator<java.lang.Integer> intComparator46 = null;
        fuzzTest35.FuzzTest_PriorityQueue(intQueue39, intQueue43, (int) (byte) 10, intComparator46);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue52 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue56 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.util.Comparator<java.lang.Integer> intComparator59 = null;
        fuzzTest48.FuzzTest_PriorityQueue(intQueue52, intQueue56, (int) (byte) 10, intComparator59);
        java.util.Comparator<java.lang.Integer> intComparator62 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue39, intQueue56, 0, intComparator62);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.util.Comparator<java.lang.Integer> intComparator12 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue5, intQueue9, (int) (byte) 10, intComparator12);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.util.Comparator<java.lang.Integer> intComparator25 = null;
        fuzzTest14.FuzzTest_PriorityQueue(intQueue18, intQueue22, (int) (byte) 10, intComparator25);
        java.util.Comparator<java.lang.Integer> intComparator28 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue9, intQueue22, (int) '4', intComparator28);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10, (-1), 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue34 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue41 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue45 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.util.Comparator<java.lang.Integer> intComparator48 = null;
        fuzzTest37.FuzzTest_PriorityQueue(intQueue41, intQueue45, (int) (byte) 10, intComparator48);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue55 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue59 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        java.util.Comparator<java.lang.Integer> intComparator62 = null;
        fuzzTest51.FuzzTest_PriorityQueue(intQueue55, intQueue59, (int) (byte) 10, intComparator62);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue68 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue72 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        java.util.Comparator<java.lang.Integer> intComparator75 = null;
        fuzzTest64.FuzzTest_PriorityQueue(intQueue68, intQueue72, (int) (byte) 10, intComparator75);
        java.util.Comparator<java.lang.Integer> intComparator78 = null;
        fuzzTest50.FuzzTest_PriorityQueue(intQueue59, intQueue72, (int) '4', intComparator78);
        java.util.Comparator<java.lang.Integer> intComparator81 = null;
        fuzzTest36.FuzzTest_PriorityQueue(intQueue45, intQueue59, (int) '4', intComparator81);
        java.util.Comparator<java.lang.Integer> intComparator84 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue34, intQueue45, 0, intComparator84);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.util.Comparator<java.lang.Integer> intComparator11 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue8, (int) (byte) 10, intComparator11);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.util.Comparator<java.lang.Integer> intComparator25 = null;
        fuzzTest14.FuzzTest_PriorityQueue(intQueue18, intQueue22, (int) (byte) 10, intComparator25);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue31 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.util.Comparator<java.lang.Integer> intComparator38 = null;
        fuzzTest27.FuzzTest_PriorityQueue(intQueue31, intQueue35, (int) (byte) 10, intComparator38);
        java.util.Comparator<java.lang.Integer> intComparator41 = null;
        fuzzTest13.FuzzTest_PriorityQueue(intQueue22, intQueue35, (int) '4', intComparator41);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue48 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue52 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.util.Comparator<java.lang.Integer> intComparator55 = null;
        fuzzTest44.FuzzTest_PriorityQueue(intQueue48, intQueue52, (int) (byte) 10, intComparator55);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue61 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue65 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.util.Comparator<java.lang.Integer> intComparator68 = null;
        fuzzTest57.FuzzTest_PriorityQueue(intQueue61, intQueue65, (int) (byte) 10, intComparator68);
        java.util.Comparator<java.lang.Integer> intComparator71 = null;
        fuzzTest43.FuzzTest_PriorityQueue(intQueue52, intQueue65, (int) '4', intComparator71);
        java.util.Comparator<java.lang.Integer> intComparator74 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue22, intQueue52, (int) (byte) -1, intComparator74);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue6 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue10 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.util.Comparator<java.lang.Integer> intComparator13 = null;
        fuzzTest2.FuzzTest_PriorityQueue(intQueue6, intQueue10, (int) (byte) 10, intComparator13);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.util.Comparator<java.lang.Integer> intComparator26 = null;
        fuzzTest15.FuzzTest_PriorityQueue(intQueue19, intQueue23, (int) (byte) 10, intComparator26);
        java.util.Comparator<java.lang.Integer> intComparator29 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue10, intQueue23, (int) '4', intComparator29);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue31 = null;
        java.util.Comparator<java.lang.Integer> intComparator33 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue23, intQueue31, 100, intComparator33);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue35 = null;
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue36 = null;
        java.util.Comparator<java.lang.Integer> intComparator38 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue35, intQueue36, (int) (byte) 10, intComparator38);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue40 = null;
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue41 = null;
        java.util.Comparator<java.lang.Integer> intComparator43 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue40, intQueue41, (-1), intComparator43);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue49 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue53 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.util.Comparator<java.lang.Integer> intComparator56 = null;
        fuzzTest45.FuzzTest_PriorityQueue(intQueue49, intQueue53, (int) (byte) 10, intComparator56);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue62 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue66 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.util.Comparator<java.lang.Integer> intComparator69 = null;
        fuzzTest58.FuzzTest_PriorityQueue(intQueue62, intQueue66, (int) (byte) 10, intComparator69);
        java.util.Comparator<java.lang.Integer> intComparator72 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue49, intQueue62, (-1), intComparator72);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue6 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue10 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.util.Comparator<java.lang.Integer> intComparator13 = null;
        fuzzTest2.FuzzTest_PriorityQueue(intQueue6, intQueue10, (int) (byte) 10, intComparator13);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.util.Comparator<java.lang.Integer> intComparator26 = null;
        fuzzTest15.FuzzTest_PriorityQueue(intQueue19, intQueue23, (int) (byte) 10, intComparator26);
        java.util.Comparator<java.lang.Integer> intComparator29 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue10, intQueue23, (int) '4', intComparator29);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue31 = null;
        java.util.Comparator<java.lang.Integer> intComparator33 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue23, intQueue31, 100, intComparator33);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue39 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.util.Comparator<java.lang.Integer> intComparator46 = null;
        fuzzTest35.FuzzTest_PriorityQueue(intQueue39, intQueue43, (int) (byte) 10, intComparator46);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue53 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue57 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.util.Comparator<java.lang.Integer> intComparator60 = null;
        fuzzTest49.FuzzTest_PriorityQueue(intQueue53, intQueue57, (int) (byte) 10, intComparator60);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue66 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue70 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        java.util.Comparator<java.lang.Integer> intComparator73 = null;
        fuzzTest62.FuzzTest_PriorityQueue(intQueue66, intQueue70, (int) (byte) 10, intComparator73);
        java.util.Comparator<java.lang.Integer> intComparator76 = null;
        fuzzTest48.FuzzTest_PriorityQueue(intQueue57, intQueue70, (int) '4', intComparator76);
        java.util.Comparator<java.lang.Integer> intComparator79 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue39, intQueue70, (int) (short) -1, intComparator79);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.util.Comparator<java.lang.Integer> intComparator12 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue5, intQueue9, (int) (byte) 10, intComparator12);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.util.Comparator<java.lang.Integer> intComparator26 = null;
        fuzzTest15.FuzzTest_PriorityQueue(intQueue19, intQueue23, (int) (byte) 10, intComparator26);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue33 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue37 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.util.Comparator<java.lang.Integer> intComparator40 = null;
        fuzzTest29.FuzzTest_PriorityQueue(intQueue33, intQueue37, (int) (byte) 10, intComparator40);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue46 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue50 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.util.Comparator<java.lang.Integer> intComparator53 = null;
        fuzzTest42.FuzzTest_PriorityQueue(intQueue46, intQueue50, (int) (byte) 10, intComparator53);
        java.util.Comparator<java.lang.Integer> intComparator56 = null;
        fuzzTest28.FuzzTest_PriorityQueue(intQueue37, intQueue50, (int) '4', intComparator56);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue58 = null;
        java.util.Comparator<java.lang.Integer> intComparator60 = null;
        fuzzTest15.FuzzTest_PriorityQueue(intQueue37, intQueue58, 0, intComparator60);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue66 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue70 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        java.util.Comparator<java.lang.Integer> intComparator73 = null;
        fuzzTest62.FuzzTest_PriorityQueue(intQueue66, intQueue70, (int) (byte) 10, intComparator73);
        java.util.Comparator<java.lang.Integer> intComparator76 = null;
        fuzzTest14.FuzzTest_PriorityQueue(intQueue58, intQueue70, (int) (short) -1, intComparator76);
        java.util.Comparator<java.lang.Integer> intComparator79 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue9, intQueue70, 0, intComparator79);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.util.Comparator<java.lang.Integer> intComparator11 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue8, (int) (byte) 10, intComparator11);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.util.Comparator<java.lang.Integer> intComparator25 = null;
        fuzzTest14.FuzzTest_PriorityQueue(intQueue18, intQueue22, (int) (byte) 10, intComparator25);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue31 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.util.Comparator<java.lang.Integer> intComparator38 = null;
        fuzzTest27.FuzzTest_PriorityQueue(intQueue31, intQueue35, (int) (byte) 10, intComparator38);
        java.util.Comparator<java.lang.Integer> intComparator41 = null;
        fuzzTest13.FuzzTest_PriorityQueue(intQueue22, intQueue35, (int) '4', intComparator41);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue47 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue51 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.util.Comparator<java.lang.Integer> intComparator54 = null;
        fuzzTest43.FuzzTest_PriorityQueue(intQueue47, intQueue51, (int) (byte) 10, intComparator54);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue61 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue65 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.util.Comparator<java.lang.Integer> intComparator68 = null;
        fuzzTest57.FuzzTest_PriorityQueue(intQueue61, intQueue65, (int) (byte) 10, intComparator68);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue74 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue78 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        java.util.Comparator<java.lang.Integer> intComparator81 = null;
        fuzzTest70.FuzzTest_PriorityQueue(intQueue74, intQueue78, (int) (byte) 10, intComparator81);
        java.util.Comparator<java.lang.Integer> intComparator84 = null;
        fuzzTest56.FuzzTest_PriorityQueue(intQueue65, intQueue78, (int) '4', intComparator84);
        java.util.Comparator<java.lang.Integer> intComparator87 = null;
        fuzzTest13.FuzzTest_PriorityQueue(intQueue51, intQueue78, (int) 'a', intComparator87);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 100, 100 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue92 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue92, intArray91);
        java.util.Comparator<java.lang.Integer> intComparator95 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue78, intQueue92, (int) (short) 0, intComparator95);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.util.Comparator<java.lang.Integer> intComparator12 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue5, intQueue9, (int) (byte) 10, intComparator12);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.util.Comparator<java.lang.Integer> intComparator25 = null;
        fuzzTest14.FuzzTest_PriorityQueue(intQueue18, intQueue22, (int) (byte) 10, intComparator25);
        java.util.Comparator<java.lang.Integer> intComparator28 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue9, intQueue22, (int) '4', intComparator28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, (-1), 10 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue41 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue45 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.util.Comparator<java.lang.Integer> intComparator48 = null;
        fuzzTest37.FuzzTest_PriorityQueue(intQueue41, intQueue45, (int) (byte) 10, intComparator48);
        java.util.Comparator<java.lang.Integer> intComparator51 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue35, intQueue45, (int) (byte) 0, intComparator51);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.util.Comparator<java.lang.Integer> intComparator12 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue5, intQueue9, (int) (byte) 10, intComparator12);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.util.Comparator<java.lang.Integer> intComparator26 = null;
        fuzzTest15.FuzzTest_PriorityQueue(intQueue19, intQueue23, (int) (byte) 10, intComparator26);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue32 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue36 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.util.Comparator<java.lang.Integer> intComparator39 = null;
        fuzzTest28.FuzzTest_PriorityQueue(intQueue32, intQueue36, (int) (byte) 10, intComparator39);
        java.util.Comparator<java.lang.Integer> intComparator42 = null;
        fuzzTest14.FuzzTest_PriorityQueue(intQueue23, intQueue36, (int) '4', intComparator42);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue44 = null;
        java.util.Comparator<java.lang.Integer> intComparator46 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue23, intQueue44, 0, intComparator46);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue52 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue56 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.util.Comparator<java.lang.Integer> intComparator59 = null;
        fuzzTest48.FuzzTest_PriorityQueue(intQueue52, intQueue56, (int) (byte) 10, intComparator59);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue61 = null;
        java.util.Comparator<java.lang.Integer> intComparator63 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue56, intQueue61, 10, intComparator63);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue65 = null;
        java.util.Comparator<java.lang.Integer> intComparator67 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue61, intQueue65, 0, intComparator67);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue73 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue77 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.util.Comparator<java.lang.Integer> intComparator80 = null;
        fuzzTest69.FuzzTest_PriorityQueue(intQueue73, intQueue77, (int) (byte) 10, intComparator80);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue86 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue90 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue90, intArray89);
        java.util.Comparator<java.lang.Integer> intComparator93 = null;
        fuzzTest82.FuzzTest_PriorityQueue(intQueue86, intQueue90, (int) (byte) 10, intComparator93);
        java.util.Comparator<java.lang.Integer> intComparator96 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue77, intQueue86, (int) (short) 0, intComparator96);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.util.Comparator<java.lang.Integer> intComparator11 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue8, (int) (byte) 10, intComparator11);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.util.Comparator<java.lang.Integer> intComparator25 = null;
        fuzzTest14.FuzzTest_PriorityQueue(intQueue18, intQueue22, (int) (byte) 10, intComparator25);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue31 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.util.Comparator<java.lang.Integer> intComparator38 = null;
        fuzzTest27.FuzzTest_PriorityQueue(intQueue31, intQueue35, (int) (byte) 10, intComparator38);
        java.util.Comparator<java.lang.Integer> intComparator41 = null;
        fuzzTest13.FuzzTest_PriorityQueue(intQueue22, intQueue35, (int) '4', intComparator41);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue47 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue51 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.util.Comparator<java.lang.Integer> intComparator54 = null;
        fuzzTest43.FuzzTest_PriorityQueue(intQueue47, intQueue51, (int) (byte) 10, intComparator54);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue61 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue65 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.util.Comparator<java.lang.Integer> intComparator68 = null;
        fuzzTest57.FuzzTest_PriorityQueue(intQueue61, intQueue65, (int) (byte) 10, intComparator68);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue74 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue78 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        java.util.Comparator<java.lang.Integer> intComparator81 = null;
        fuzzTest70.FuzzTest_PriorityQueue(intQueue74, intQueue78, (int) (byte) 10, intComparator81);
        java.util.Comparator<java.lang.Integer> intComparator84 = null;
        fuzzTest56.FuzzTest_PriorityQueue(intQueue65, intQueue78, (int) '4', intComparator84);
        java.util.Comparator<java.lang.Integer> intComparator87 = null;
        fuzzTest13.FuzzTest_PriorityQueue(intQueue47, intQueue78, (int) (byte) 100, intComparator87);
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { (-1), 100, 10, 0 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue94 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue94, intArray93);
        java.util.Comparator<java.lang.Integer> intComparator97 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue47, intQueue94, 0, intComparator97);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.util.Comparator<java.lang.Integer> intComparator11 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue8, (int) (byte) 10, intComparator11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 1, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue25 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue29 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.util.Comparator<java.lang.Integer> intComparator32 = null;
        fuzzTest21.FuzzTest_PriorityQueue(intQueue25, intQueue29, (int) (byte) 10, intComparator32);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue39 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.util.Comparator<java.lang.Integer> intComparator46 = null;
        fuzzTest35.FuzzTest_PriorityQueue(intQueue39, intQueue43, (int) (byte) 10, intComparator46);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue52 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue56 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.util.Comparator<java.lang.Integer> intComparator59 = null;
        fuzzTest48.FuzzTest_PriorityQueue(intQueue52, intQueue56, (int) (byte) 10, intComparator59);
        java.util.Comparator<java.lang.Integer> intComparator62 = null;
        fuzzTest34.FuzzTest_PriorityQueue(intQueue43, intQueue56, (int) '4', intComparator62);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue64 = null;
        java.util.Comparator<java.lang.Integer> intComparator66 = null;
        fuzzTest21.FuzzTest_PriorityQueue(intQueue43, intQueue64, 0, intComparator66);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue72 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue76 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.util.Comparator<java.lang.Integer> intComparator79 = null;
        fuzzTest68.FuzzTest_PriorityQueue(intQueue72, intQueue76, (int) (byte) 10, intComparator79);
        java.util.Comparator<java.lang.Integer> intComparator82 = null;
        fuzzTest20.FuzzTest_PriorityQueue(intQueue64, intQueue76, (int) (short) -1, intComparator82);
        java.util.Comparator<java.lang.Integer> intComparator85 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue18, intQueue76, 0, intComparator85);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue6 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue10 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.util.Comparator<java.lang.Integer> intComparator13 = null;
        fuzzTest2.FuzzTest_PriorityQueue(intQueue6, intQueue10, (int) (byte) 10, intComparator13);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.util.Comparator<java.lang.Integer> intComparator26 = null;
        fuzzTest15.FuzzTest_PriorityQueue(intQueue19, intQueue23, (int) (byte) 10, intComparator26);
        java.util.Comparator<java.lang.Integer> intComparator29 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue10, intQueue23, (int) '4', intComparator29);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue31 = null;
        java.util.Comparator<java.lang.Integer> intComparator33 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue23, intQueue31, 100, intComparator33);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue35 = null;
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue36 = null;
        java.util.Comparator<java.lang.Integer> intComparator38 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue35, intQueue36, (int) (short) -1, intComparator38);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, (-1), (-1), 1, 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue46 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue53 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue57 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.util.Comparator<java.lang.Integer> intComparator60 = null;
        fuzzTest49.FuzzTest_PriorityQueue(intQueue53, intQueue57, (int) (byte) 10, intComparator60);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue67 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue71 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        java.util.Comparator<java.lang.Integer> intComparator74 = null;
        fuzzTest63.FuzzTest_PriorityQueue(intQueue67, intQueue71, (int) (byte) 10, intComparator74);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue80 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue84 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue84, intArray83);
        java.util.Comparator<java.lang.Integer> intComparator87 = null;
        fuzzTest76.FuzzTest_PriorityQueue(intQueue80, intQueue84, (int) (byte) 10, intComparator87);
        java.util.Comparator<java.lang.Integer> intComparator90 = null;
        fuzzTest62.FuzzTest_PriorityQueue(intQueue71, intQueue84, (int) '4', intComparator90);
        java.util.Comparator<java.lang.Integer> intComparator93 = null;
        fuzzTest48.FuzzTest_PriorityQueue(intQueue57, intQueue71, (int) '4', intComparator93);
        java.util.Comparator<java.lang.Integer> intComparator96 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue46, intQueue71, 0, intComparator96);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.util.Comparator<java.lang.Integer> intComparator11 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue8, (int) (byte) 10, intComparator11);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.util.Comparator<java.lang.Integer> intComparator25 = null;
        fuzzTest14.FuzzTest_PriorityQueue(intQueue18, intQueue22, (int) (byte) 10, intComparator25);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue32 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue36 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.util.Comparator<java.lang.Integer> intComparator39 = null;
        fuzzTest28.FuzzTest_PriorityQueue(intQueue32, intQueue36, (int) (byte) 10, intComparator39);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue45 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue49 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.util.Comparator<java.lang.Integer> intComparator52 = null;
        fuzzTest41.FuzzTest_PriorityQueue(intQueue45, intQueue49, (int) (byte) 10, intComparator52);
        java.util.Comparator<java.lang.Integer> intComparator55 = null;
        fuzzTest27.FuzzTest_PriorityQueue(intQueue36, intQueue49, (int) '4', intComparator55);
        java.util.Comparator<java.lang.Integer> intComparator58 = null;
        fuzzTest13.FuzzTest_PriorityQueue(intQueue22, intQueue36, (int) '4', intComparator58);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 1, (-1), (-1), 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue66 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue72 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue76 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.util.Comparator<java.lang.Integer> intComparator79 = null;
        fuzzTest68.FuzzTest_PriorityQueue(intQueue72, intQueue76, (int) (byte) 10, intComparator79);
        java.util.Comparator<java.lang.Integer> intComparator82 = null;
        fuzzTest13.FuzzTest_PriorityQueue(intQueue66, intQueue76, (int) 'a', intComparator82);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue88 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue88, intArray87);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue92 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue92, intArray91);
        java.util.Comparator<java.lang.Integer> intComparator95 = null;
        fuzzTest84.FuzzTest_PriorityQueue(intQueue88, intQueue92, (int) (byte) 10, intComparator95);
        java.util.Comparator<java.lang.Integer> intComparator98 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue76, intQueue92, (int) (short) 0, intComparator98);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue6 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue10 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.util.Comparator<java.lang.Integer> intComparator13 = null;
        fuzzTest2.FuzzTest_PriorityQueue(intQueue6, intQueue10, (int) (byte) 10, intComparator13);
        java.util.Comparator<java.lang.Integer> intComparator16 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue1, intQueue6, (int) (byte) 0, intComparator16);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue26 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.util.Comparator<java.lang.Integer> intComparator29 = null;
        fuzzTest18.FuzzTest_PriorityQueue(intQueue22, intQueue26, (int) (byte) 10, intComparator29);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue36 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue40 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.util.Comparator<java.lang.Integer> intComparator43 = null;
        fuzzTest32.FuzzTest_PriorityQueue(intQueue36, intQueue40, (int) (byte) 10, intComparator43);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue50 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue54 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.util.Comparator<java.lang.Integer> intComparator57 = null;
        fuzzTest46.FuzzTest_PriorityQueue(intQueue50, intQueue54, (int) (byte) 10, intComparator57);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue63 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue67 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        java.util.Comparator<java.lang.Integer> intComparator70 = null;
        fuzzTest59.FuzzTest_PriorityQueue(intQueue63, intQueue67, (int) (byte) 10, intComparator70);
        java.util.Comparator<java.lang.Integer> intComparator73 = null;
        fuzzTest45.FuzzTest_PriorityQueue(intQueue54, intQueue67, (int) '4', intComparator73);
        java.util.Comparator<java.lang.Integer> intComparator76 = null;
        fuzzTest31.FuzzTest_PriorityQueue(intQueue40, intQueue54, (int) '4', intComparator76);
        java.util.Comparator<java.lang.Integer> intComparator79 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue26, intQueue54, (int) (byte) 0, intComparator79);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.util.Comparator<java.lang.Integer> intComparator12 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue5, intQueue9, (int) (byte) 10, intComparator12);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.util.Comparator<java.lang.Integer> intComparator26 = null;
        fuzzTest15.FuzzTest_PriorityQueue(intQueue19, intQueue23, (int) (byte) 10, intComparator26);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue32 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue36 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.util.Comparator<java.lang.Integer> intComparator39 = null;
        fuzzTest28.FuzzTest_PriorityQueue(intQueue32, intQueue36, (int) (byte) 10, intComparator39);
        java.util.Comparator<java.lang.Integer> intComparator42 = null;
        fuzzTest14.FuzzTest_PriorityQueue(intQueue23, intQueue36, (int) '4', intComparator42);
        java.util.Comparator<java.lang.Integer> intComparator45 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue9, intQueue23, (int) '4', intComparator45);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue47 = null;
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 1, (-1), 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue54 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.util.Comparator<java.lang.Integer> intComparator57 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue47, intQueue54, 0, intComparator57);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue64 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue68 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        java.util.Comparator<java.lang.Integer> intComparator71 = null;
        fuzzTest60.FuzzTest_PriorityQueue(intQueue64, intQueue68, (int) (byte) 10, intComparator71);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue77 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue81 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        java.util.Comparator<java.lang.Integer> intComparator84 = null;
        fuzzTest73.FuzzTest_PriorityQueue(intQueue77, intQueue81, (int) (byte) 10, intComparator84);
        java.util.Comparator<java.lang.Integer> intComparator87 = null;
        fuzzTest59.FuzzTest_PriorityQueue(intQueue68, intQueue81, (int) '4', intComparator87);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 0, 1, (-1), 10, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue95 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue95, intArray94);
        java.util.Comparator<java.lang.Integer> intComparator98 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue68, intQueue95, (int) (byte) -1, intComparator98);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue6 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue10 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.util.Comparator<java.lang.Integer> intComparator13 = null;
        fuzzTest2.FuzzTest_PriorityQueue(intQueue6, intQueue10, (int) (byte) 10, intComparator13);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.util.Comparator<java.lang.Integer> intComparator26 = null;
        fuzzTest15.FuzzTest_PriorityQueue(intQueue19, intQueue23, (int) (byte) 10, intComparator26);
        java.util.Comparator<java.lang.Integer> intComparator29 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue10, intQueue23, (int) '4', intComparator29);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue31 = null;
        java.util.Comparator<java.lang.Integer> intComparator33 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue23, intQueue31, 100, intComparator33);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue41 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue45 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.util.Comparator<java.lang.Integer> intComparator48 = null;
        fuzzTest37.FuzzTest_PriorityQueue(intQueue41, intQueue45, (int) (byte) 10, intComparator48);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue54 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue58 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        java.util.Comparator<java.lang.Integer> intComparator61 = null;
        fuzzTest50.FuzzTest_PriorityQueue(intQueue54, intQueue58, (int) (byte) 10, intComparator61);
        java.util.Comparator<java.lang.Integer> intComparator64 = null;
        fuzzTest36.FuzzTest_PriorityQueue(intQueue45, intQueue58, (int) '4', intComparator64);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue66 = null;
        java.util.Comparator<java.lang.Integer> intComparator68 = null;
        fuzzTest35.FuzzTest_PriorityQueue(intQueue58, intQueue66, 100, intComparator68);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue71 = null;
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue76 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue80 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        java.util.Comparator<java.lang.Integer> intComparator83 = null;
        fuzzTest72.FuzzTest_PriorityQueue(intQueue76, intQueue80, (int) (byte) 10, intComparator83);
        java.util.Comparator<java.lang.Integer> intComparator86 = null;
        fuzzTest70.FuzzTest_PriorityQueue(intQueue71, intQueue76, (int) (byte) 0, intComparator86);
        java.util.Comparator<java.lang.Integer> intComparator89 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue58, intQueue76, (-1), intComparator89);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue7 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue11 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        java.util.Comparator<java.lang.Integer> intComparator14 = null;
        fuzzTest3.FuzzTest_PriorityQueue(intQueue7, intQueue11, (int) (byte) 10, intComparator14);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue20 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue24 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        java.util.Comparator<java.lang.Integer> intComparator27 = null;
        fuzzTest16.FuzzTest_PriorityQueue(intQueue20, intQueue24, (int) (byte) 10, intComparator27);
        java.util.Comparator<java.lang.Integer> intComparator30 = null;
        fuzzTest2.FuzzTest_PriorityQueue(intQueue11, intQueue24, (int) '4', intComparator30);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue36 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue40 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.util.Comparator<java.lang.Integer> intComparator43 = null;
        fuzzTest32.FuzzTest_PriorityQueue(intQueue36, intQueue40, (int) (byte) 10, intComparator43);
        java.util.Comparator<java.lang.Integer> intComparator46 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue11, intQueue36, (int) (byte) 100, intComparator46);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue54 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue58 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        java.util.Comparator<java.lang.Integer> intComparator61 = null;
        fuzzTest50.FuzzTest_PriorityQueue(intQueue54, intQueue58, (int) (byte) 10, intComparator61);
        java.util.Comparator<java.lang.Integer> intComparator64 = null;
        fuzzTest48.FuzzTest_PriorityQueue(intQueue49, intQueue54, (int) (byte) 0, intComparator64);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, (-1), (-1), 100, 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue72 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue78 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue82 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        java.util.Comparator<java.lang.Integer> intComparator85 = null;
        fuzzTest74.FuzzTest_PriorityQueue(intQueue78, intQueue82, (int) (byte) 10, intComparator85);
        java.util.Comparator<java.lang.Integer> intComparator88 = null;
        fuzzTest48.FuzzTest_PriorityQueue(intQueue72, intQueue82, (int) 'a', intComparator88);
        java.util.Comparator<java.lang.Integer> intComparator91 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue11, intQueue82, (int) (byte) -1, intComparator91);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue2 = null;
        java.util.Comparator<java.lang.Integer> intComparator4 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue1, intQueue2, (-1), intComparator4);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue11 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue15 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.util.Comparator<java.lang.Integer> intComparator18 = null;
        fuzzTest7.FuzzTest_PriorityQueue(intQueue11, intQueue15, (int) (byte) 10, intComparator18);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue24 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue28 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.util.Comparator<java.lang.Integer> intComparator31 = null;
        fuzzTest20.FuzzTest_PriorityQueue(intQueue24, intQueue28, (int) (byte) 10, intComparator31);
        java.util.Comparator<java.lang.Integer> intComparator34 = null;
        fuzzTest6.FuzzTest_PriorityQueue(intQueue15, intQueue28, (int) '4', intComparator34);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue46 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        java.util.Comparator<java.lang.Integer> intComparator49 = null;
        fuzzTest38.FuzzTest_PriorityQueue(intQueue42, intQueue46, (int) (byte) 10, intComparator49);
        java.util.Comparator<java.lang.Integer> intComparator52 = null;
        fuzzTest36.FuzzTest_PriorityQueue(intQueue37, intQueue42, (int) (byte) 0, intComparator52);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, (-1), (-1), 100, 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue60 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue66 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue70 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        java.util.Comparator<java.lang.Integer> intComparator73 = null;
        fuzzTest62.FuzzTest_PriorityQueue(intQueue66, intQueue70, (int) (byte) 10, intComparator73);
        java.util.Comparator<java.lang.Integer> intComparator76 = null;
        fuzzTest36.FuzzTest_PriorityQueue(intQueue60, intQueue70, (int) 'a', intComparator76);
        java.util.Comparator<java.lang.Integer> intComparator79 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue15, intQueue60, 0, intComparator79);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.util.Comparator<java.lang.Integer> intComparator11 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue8, (int) (byte) 10, intComparator11);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.util.Comparator<java.lang.Integer> intComparator25 = null;
        fuzzTest14.FuzzTest_PriorityQueue(intQueue18, intQueue22, (int) (byte) 10, intComparator25);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue31 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.util.Comparator<java.lang.Integer> intComparator38 = null;
        fuzzTest27.FuzzTest_PriorityQueue(intQueue31, intQueue35, (int) (byte) 10, intComparator38);
        java.util.Comparator<java.lang.Integer> intComparator41 = null;
        fuzzTest13.FuzzTest_PriorityQueue(intQueue22, intQueue35, (int) '4', intComparator41);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue43 = null;
        java.util.Comparator<java.lang.Integer> intComparator45 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue22, intQueue43, 0, intComparator45);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue51 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue55 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.util.Comparator<java.lang.Integer> intComparator58 = null;
        fuzzTest47.FuzzTest_PriorityQueue(intQueue51, intQueue55, (int) (byte) 10, intComparator58);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue60 = null;
        java.util.Comparator<java.lang.Integer> intComparator62 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue55, intQueue60, 10, intComparator62);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue65 = null;
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue70 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue74 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        java.util.Comparator<java.lang.Integer> intComparator77 = null;
        fuzzTest66.FuzzTest_PriorityQueue(intQueue70, intQueue74, (int) (byte) 10, intComparator77);
        java.util.Comparator<java.lang.Integer> intComparator80 = null;
        fuzzTest64.FuzzTest_PriorityQueue(intQueue65, intQueue70, (int) (byte) 0, intComparator80);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue86 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue90 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue90, intArray89);
        java.util.Comparator<java.lang.Integer> intComparator93 = null;
        fuzzTest82.FuzzTest_PriorityQueue(intQueue86, intQueue90, (int) (byte) 10, intComparator93);
        java.util.Comparator<java.lang.Integer> intComparator96 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue70, intQueue86, (int) (byte) -1, intComparator96);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.util.Comparator<java.lang.Integer> intComparator12 = null;
        fuzzTest1.FuzzTest_PriorityQueue(intQueue5, intQueue9, (int) (byte) 10, intComparator12);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.util.Comparator<java.lang.Integer> intComparator26 = null;
        fuzzTest15.FuzzTest_PriorityQueue(intQueue19, intQueue23, (int) (byte) 10, intComparator26);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue32 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue36 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.util.Comparator<java.lang.Integer> intComparator39 = null;
        fuzzTest28.FuzzTest_PriorityQueue(intQueue32, intQueue36, (int) (byte) 10, intComparator39);
        java.util.Comparator<java.lang.Integer> intComparator42 = null;
        fuzzTest14.FuzzTest_PriorityQueue(intQueue23, intQueue36, (int) '4', intComparator42);
        java.util.Comparator<java.lang.Integer> intComparator45 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue9, intQueue23, (int) '4', intComparator45);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue47 = null;
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 1, (-1), 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue54 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.util.Comparator<java.lang.Integer> intComparator57 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue47, intQueue54, 0, intComparator57);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue61 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue63 = null;
        java.util.Comparator<java.lang.Integer> intComparator65 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue61, intQueue63, (int) (byte) -1, intComparator65);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue71 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue75 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        java.util.Comparator<java.lang.Integer> intComparator78 = null;
        fuzzTest67.FuzzTest_PriorityQueue(intQueue71, intQueue75, (int) (byte) 10, intComparator78);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue84 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue84, intArray83);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1 };
        c2s_aug.PriorityQueue<java.lang.Integer> intQueue88 = new c2s_aug.PriorityQueue<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue88, intArray87);
        java.util.Comparator<java.lang.Integer> intComparator91 = null;
        fuzzTest80.FuzzTest_PriorityQueue(intQueue84, intQueue88, (int) (byte) 10, intComparator91);
        java.util.Comparator<java.lang.Integer> intComparator94 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue75, intQueue88, (int) (short) 0, intComparator94);
    }
}

