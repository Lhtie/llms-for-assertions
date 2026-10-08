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
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue7 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue3, intQueue7, (java.util.Collection<java.lang.Integer>) intList13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue20 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList30 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest17.FuzzTest_PriorityQueue(intQueue20, intQueue24, (java.util.Collection<java.lang.Integer>) intList30);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 1, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList46 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest17.FuzzTest_PriorityQueue(intQueue37, intQueue41, (java.util.Collection<java.lang.Integer>) intList46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue60 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList66 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest53.FuzzTest_PriorityQueue(intQueue56, intQueue60, (java.util.Collection<java.lang.Integer>) intList66);
        fuzzTest16.FuzzTest_PriorityQueue(intQueue37, intQueue51, (java.util.Collection<java.lang.Integer>) intQueue56);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, (-1), (-1), (-1), 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue76 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.util.Collection<java.lang.Integer> intCollection78 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue37, intQueue76, intCollection78);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest1.FuzzTest_PriorityQueue(intQueue4, intQueue8, (java.util.Collection<java.lang.Integer>) intList14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue20 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList30 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest17.FuzzTest_PriorityQueue(intQueue20, intQueue24, (java.util.Collection<java.lang.Integer>) intList30);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 1, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue37 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList46 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest17.FuzzTest_PriorityQueue(intQueue37, intQueue41, (java.util.Collection<java.lang.Integer>) intList46);
        java.util.Collection<java.lang.Integer> intCollection49 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue41, intCollection49);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue7 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue12 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue16 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest9.FuzzTest_PriorityQueue(intQueue12, intQueue16, (java.util.Collection<java.lang.Integer>) intList22);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue1, intQueue7, (java.util.Collection<java.lang.Integer>) intQueue12);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue30 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue39 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList45 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest32.FuzzTest_PriorityQueue(intQueue35, intQueue39, (java.util.Collection<java.lang.Integer>) intList45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 1, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue52 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList61 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest32.FuzzTest_PriorityQueue(intQueue52, intQueue56, (java.util.Collection<java.lang.Integer>) intList61);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = null;
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, 0, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue71 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue76 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue80 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList86 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest73.FuzzTest_PriorityQueue(intQueue76, intQueue80, (java.util.Collection<java.lang.Integer>) intList86);
        fuzzTest64.FuzzTest_PriorityQueue(intQueue65, intQueue71, (java.util.Collection<java.lang.Integer>) intQueue76);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue30, intQueue56, (java.util.Collection<java.lang.Integer>) intQueue65);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue7 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue12 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue16 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest9.FuzzTest_PriorityQueue(intQueue12, intQueue16, (java.util.Collection<java.lang.Integer>) intList22);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue1, intQueue7, (java.util.Collection<java.lang.Integer>) intQueue12);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue29 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest26.FuzzTest_PriorityQueue(intQueue29, intQueue33, (java.util.Collection<java.lang.Integer>) intList39);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue46 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue50 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList56 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest43.FuzzTest_PriorityQueue(intQueue46, intQueue50, (java.util.Collection<java.lang.Integer>) intList56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 1, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue67 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList72 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest43.FuzzTest_PriorityQueue(intQueue63, intQueue67, (java.util.Collection<java.lang.Integer>) intList72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue82 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue86 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList92 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        fuzzTest79.FuzzTest_PriorityQueue(intQueue82, intQueue86, (java.util.Collection<java.lang.Integer>) intList92);
        fuzzTest42.FuzzTest_PriorityQueue(intQueue63, intQueue77, (java.util.Collection<java.lang.Integer>) intQueue82);
        java.util.Collection<java.lang.Integer> intCollection96 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue29, intQueue77, intCollection96);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest2.FuzzTest_PriorityQueue(intQueue5, intQueue9, (java.util.Collection<java.lang.Integer>) intList15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue21 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest18.FuzzTest_PriorityQueue(intQueue21, intQueue25, (java.util.Collection<java.lang.Integer>) intList31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 1, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue38 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest18.FuzzTest_PriorityQueue(intQueue38, intQueue42, (java.util.Collection<java.lang.Integer>) intList47);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue1, intQueue5, (java.util.Collection<java.lang.Integer>) intQueue42);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue53 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue58 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        java.util.Collection<java.lang.Integer> intCollection60 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue53, intQueue58, intCollection60);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest2.FuzzTest_PriorityQueue(intQueue5, intQueue9, (java.util.Collection<java.lang.Integer>) intList15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue21 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest18.FuzzTest_PriorityQueue(intQueue21, intQueue25, (java.util.Collection<java.lang.Integer>) intList31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 1, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue38 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest18.FuzzTest_PriorityQueue(intQueue38, intQueue42, (java.util.Collection<java.lang.Integer>) intList47);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue1, intQueue5, (java.util.Collection<java.lang.Integer>) intQueue42);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue54 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue58 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest51.FuzzTest_PriorityQueue(intQueue54, intQueue58, (java.util.Collection<java.lang.Integer>) intList64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue69 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue72 = null;
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, 0, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue78 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue83 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue87 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue87, intArray86);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList93 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        fuzzTest80.FuzzTest_PriorityQueue(intQueue83, intQueue87, (java.util.Collection<java.lang.Integer>) intList93);
        fuzzTest71.FuzzTest_PriorityQueue(intQueue72, intQueue78, (java.util.Collection<java.lang.Integer>) intQueue83);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue58, intQueue69, (java.util.Collection<java.lang.Integer>) intQueue72);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest1.FuzzTest_PriorityQueue(intQueue4, intQueue8, (java.util.Collection<java.lang.Integer>) intList14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue18 = null;
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 0, 0, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue29 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest26.FuzzTest_PriorityQueue(intQueue29, intQueue33, (java.util.Collection<java.lang.Integer>) intList39);
        fuzzTest17.FuzzTest_PriorityQueue(intQueue18, intQueue24, (java.util.Collection<java.lang.Integer>) intQueue29);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue45 = null;
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, 0, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue60 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList66 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest53.FuzzTest_PriorityQueue(intQueue56, intQueue60, (java.util.Collection<java.lang.Integer>) intList66);
        fuzzTest44.FuzzTest_PriorityQueue(intQueue45, intQueue51, (java.util.Collection<java.lang.Integer>) intQueue56);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue70 = null;
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue74 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue78 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList84 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest71.FuzzTest_PriorityQueue(intQueue74, intQueue78, (java.util.Collection<java.lang.Integer>) intList84);
        fuzzTest43.FuzzTest_PriorityQueue(intQueue45, intQueue70, (java.util.Collection<java.lang.Integer>) intList84);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue88 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue89 = null;
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 0, 10, (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList95 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList95, intArray94);
        fuzzTest43.FuzzTest_PriorityQueue(intQueue88, intQueue89, (java.util.Collection<java.lang.Integer>) intList95);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue29, (java.util.Collection<java.lang.Integer>) intQueue89);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest1.FuzzTest_PriorityQueue(intQueue4, intQueue8, (java.util.Collection<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 1, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue21 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue25 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList30 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest1.FuzzTest_PriorityQueue(intQueue21, intQueue25, (java.util.Collection<java.lang.Integer>) intList30);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10, 100, 1, 10, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue39 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue48 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList54 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest41.FuzzTest_PriorityQueue(intQueue44, intQueue48, (java.util.Collection<java.lang.Integer>) intList54);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue60 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue64 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList70 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest57.FuzzTest_PriorityQueue(intQueue60, intQueue64, (java.util.Collection<java.lang.Integer>) intList70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1, 1, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue81 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList86 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest57.FuzzTest_PriorityQueue(intQueue77, intQueue81, (java.util.Collection<java.lang.Integer>) intList86);
        fuzzTest1.FuzzTest_PriorityQueue(intQueue39, intQueue48, (java.util.Collection<java.lang.Integer>) intQueue77);
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 10, 1, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue94 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue94, intArray93);
        java.util.Collection<java.lang.Integer> intCollection96 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue77, intQueue94, intCollection96);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = null;
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 0, 0, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest11.FuzzTest_PriorityQueue(intQueue14, intQueue18, (java.util.Collection<java.lang.Integer>) intList24);
        fuzzTest2.FuzzTest_PriorityQueue(intQueue3, intQueue9, (java.util.Collection<java.lang.Integer>) intQueue14);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue29 = null;
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 0, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest37.FuzzTest_PriorityQueue(intQueue40, intQueue44, (java.util.Collection<java.lang.Integer>) intList50);
        fuzzTest28.FuzzTest_PriorityQueue(intQueue29, intQueue35, (java.util.Collection<java.lang.Integer>) intQueue40);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue1, intQueue9, (java.util.Collection<java.lang.Integer>) intQueue29);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue62 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue66 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList72 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest59.FuzzTest_PriorityQueue(intQueue62, intQueue66, (java.util.Collection<java.lang.Integer>) intList72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 1, (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue79 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue83 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList88 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest59.FuzzTest_PriorityQueue(intQueue79, intQueue83, (java.util.Collection<java.lang.Integer>) intList88);
        java.util.Collection<java.lang.Integer> intCollection91 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue57, intQueue83, intCollection91);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue7 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue3, intQueue7, (java.util.Collection<java.lang.Integer>) intList13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest16.FuzzTest_PriorityQueue(intQueue19, intQueue23, (java.util.Collection<java.lang.Integer>) intList29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue36 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue39 = null;
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, 0, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue45 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue50 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue54 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList60 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest47.FuzzTest_PriorityQueue(intQueue50, intQueue54, (java.util.Collection<java.lang.Integer>) intList60);
        fuzzTest38.FuzzTest_PriorityQueue(intQueue39, intQueue45, (java.util.Collection<java.lang.Integer>) intQueue50);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = null;
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, 0, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue71 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue76 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue80 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList86 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest73.FuzzTest_PriorityQueue(intQueue76, intQueue80, (java.util.Collection<java.lang.Integer>) intList86);
        fuzzTest64.FuzzTest_PriorityQueue(intQueue65, intQueue71, (java.util.Collection<java.lang.Integer>) intQueue76);
        fuzzTest32.FuzzTest_PriorityQueue(intQueue36, intQueue50, (java.util.Collection<java.lang.Integer>) intQueue71);
        java.util.Collection<java.lang.Integer> intCollection91 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue23, intQueue71, intCollection91);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue7 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue3, intQueue7, (java.util.Collection<java.lang.Integer>) intList13);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue16 = null;
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue20 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue24 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList30 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest17.FuzzTest_PriorityQueue(intQueue20, intQueue24, (java.util.Collection<java.lang.Integer>) intList30);
        java.util.Collection<java.lang.Integer> intCollection33 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue16, intQueue24, intCollection33);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue36 = null;
        java.util.Collection<java.lang.Integer> intCollection37 = null;
        fuzzTest0.FuzzTest_PriorityQueue(intQueue35, intQueue36, intCollection37);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue42 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue46 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest39.FuzzTest_PriorityQueue(intQueue42, intQueue46, (java.util.Collection<java.lang.Integer>) intList52);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue55 = null;
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue59 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList69 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest56.FuzzTest_PriorityQueue(intQueue59, intQueue63, (java.util.Collection<java.lang.Integer>) intList69);
        java.util.Collection<java.lang.Integer> intCollection72 = null;
        fuzzTest39.FuzzTest_PriorityQueue(intQueue55, intQueue63, intCollection72);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue81 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList87 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest74.FuzzTest_PriorityQueue(intQueue77, intQueue81, (java.util.Collection<java.lang.Integer>) intList87);
        java.util.Collection<java.lang.Integer> intCollection90 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue63, intQueue81, intCollection90);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = null;
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 0, 0, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest11.FuzzTest_PriorityQueue(intQueue14, intQueue18, (java.util.Collection<java.lang.Integer>) intList24);
        fuzzTest2.FuzzTest_PriorityQueue(intQueue3, intQueue9, (java.util.Collection<java.lang.Integer>) intQueue14);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue29 = null;
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 0, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest37.FuzzTest_PriorityQueue(intQueue40, intQueue44, (java.util.Collection<java.lang.Integer>) intList50);
        fuzzTest28.FuzzTest_PriorityQueue(intQueue29, intQueue35, (java.util.Collection<java.lang.Integer>) intQueue40);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue1, intQueue9, (java.util.Collection<java.lang.Integer>) intQueue29);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100, (-1), 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue59 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue62 = null;
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, 0, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue68 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue73 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue77 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList83 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest70.FuzzTest_PriorityQueue(intQueue73, intQueue77, (java.util.Collection<java.lang.Integer>) intList83);
        fuzzTest61.FuzzTest_PriorityQueue(intQueue62, intQueue68, (java.util.Collection<java.lang.Integer>) intQueue73);
        java.util.Collection<java.lang.Integer> intCollection87 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue59, intQueue68, intCollection87);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue7 = null;
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 0, 0, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue13 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue18 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest15.FuzzTest_PriorityQueue(intQueue18, intQueue22, (java.util.Collection<java.lang.Integer>) intList28);
        fuzzTest6.FuzzTest_PriorityQueue(intQueue7, intQueue13, (java.util.Collection<java.lang.Integer>) intQueue18);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = null;
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 0, 100, 1 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue39 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue44 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue48 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList54 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest41.FuzzTest_PriorityQueue(intQueue44, intQueue48, (java.util.Collection<java.lang.Integer>) intList54);
        fuzzTest32.FuzzTest_PriorityQueue(intQueue33, intQueue39, (java.util.Collection<java.lang.Integer>) intQueue44);
        fuzzTest0.FuzzTest_PriorityQueue(intQueue4, intQueue18, (java.util.Collection<java.lang.Integer>) intQueue39);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10, 10, (-1), 10, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-1), (-1), 1, 100, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue73 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.util.Collection<java.lang.Integer> intCollection75 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_PriorityQueue(intQueue65, intQueue73, intCollection75);
    }
}

