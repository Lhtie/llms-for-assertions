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
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue9 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue15 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest1.FuzzTest_toArray(intQueue9, intQueue15, intArray23);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 100, (-1), 0, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue31 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest33.FuzzTest_toArray(intQueue41, intQueue47, intArray55);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue71 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest57.FuzzTest_toArray(intQueue65, intQueue71, intArray79);
        fuzzTest1.FuzzTest_toArray(intQueue31, intQueue47, intArray79);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue82 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray83 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue47, intQueue82, intArray83);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue1 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue4 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue20 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest6.FuzzTest_toArray(intQueue14, intQueue20, intArray28);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue30 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue46 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest32.FuzzTest_toArray(intQueue40, intQueue46, intArray54);
        fuzzTest6.FuzzTest_toArray(intQueue30, intQueue31, intArray54);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10, 10, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue74 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue80 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest66.FuzzTest_toArray(intQueue74, intQueue80, intArray88);
        fuzzTest58.FuzzTest_toArray(intQueue63, intQueue65, intArray88);
        java.lang.Integer[] intArray96 = new java.lang.Integer[] { (-1), 2, (-1), (-1), 2 };
        fuzzTest6.FuzzTest_toArray(intQueue57, intQueue63, intArray96);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue1, intQueue4, intArray96);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue16 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest8.FuzzTest_toArray(intQueue16, intQueue22, intArray30);
        fuzzTest0.FuzzTest_toArray(intQueue5, intQueue7, intArray30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue47 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest33.FuzzTest_toArray(intQueue41, intQueue47, intArray55);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10, 10, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue62 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue73 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue79 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest65.FuzzTest_toArray(intQueue73, intQueue79, intArray87);
        fuzzTest57.FuzzTest_toArray(intQueue62, intQueue64, intArray87);
        java.lang.Integer[] intArray90 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue41, intQueue64, intArray90);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue10 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue16 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest2.FuzzTest_toArray(intQueue10, intQueue16, intArray24);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest26.FuzzTest_toArray(intQueue34, intQueue40, intArray48);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue58 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue64 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest50.FuzzTest_toArray(intQueue58, intQueue64, intArray72);
        fuzzTest1.FuzzTest_toArray(intQueue16, intQueue34, intArray72);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue75 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray76 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue34, intQueue75, intArray76);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 10, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue6 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue17 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest9.FuzzTest_toArray(intQueue17, intQueue23, intArray31);
        fuzzTest1.FuzzTest_toArray(intQueue6, intQueue8, intArray31);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue43 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue49 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest35.FuzzTest_toArray(intQueue43, intQueue49, intArray57);
        fuzzTest0.FuzzTest_toArray(intQueue8, intQueue34, intArray57);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10, 10, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue65 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue76 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue82 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest68.FuzzTest_toArray(intQueue76, intQueue82, intArray90);
        fuzzTest60.FuzzTest_toArray(intQueue65, intQueue67, intArray90);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue93 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray94 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue67, intQueue93, intArray94);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue16 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest8.FuzzTest_toArray(intQueue16, intQueue22, intArray30);
        fuzzTest0.FuzzTest_toArray(intQueue5, intQueue7, intArray30);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = null;
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 1, (-1) };
        fuzzTest0.FuzzTest_toArray(intQueue33, intQueue34, intArray38);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue40 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray42 = null;
        fuzzTest0.FuzzTest_toArray(intQueue40, intQueue41, intArray42);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, (-1), 0, (-1), 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue50 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue52 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray53 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue50, intQueue52, intArray53);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 10, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue6 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue17 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue23 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest9.FuzzTest_toArray(intQueue17, intQueue23, intArray31);
        fuzzTest1.FuzzTest_toArray(intQueue6, intQueue8, intArray31);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10, 10, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue39 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue50 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest42.FuzzTest_toArray(intQueue50, intQueue56, intArray64);
        fuzzTest34.FuzzTest_toArray(intQueue39, intQueue41, intArray64);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue67 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue68 = null;
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, 1, (-1) };
        fuzzTest34.FuzzTest_toArray(intQueue67, intQueue68, intArray72);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue74 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue75 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray76 = null;
        fuzzTest34.FuzzTest_toArray(intQueue74, intQueue75, intArray76);
        java.lang.Integer[] intArray78 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue6, intQueue75, intArray78);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue5 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue16 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue22 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest8.FuzzTest_toArray(intQueue16, intQueue22, intArray30);
        fuzzTest0.FuzzTest_toArray(intQueue5, intQueue7, intArray30);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue33 = null;
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue34 = null;
        java.lang.Integer[] intArray35 = null;
        fuzzTest0.FuzzTest_toArray(intQueue33, intQueue34, intArray35);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue45 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest37.FuzzTest_toArray(intQueue45, intQueue51, intArray59);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue62 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10, 10, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue69 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue80 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue86 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest72.FuzzTest_toArray(intQueue80, intQueue86, intArray94);
        fuzzTest64.FuzzTest_toArray(intQueue69, intQueue71, intArray94);
        fuzzTest61.FuzzTest_toArray(intQueue62, intQueue63, intArray94);
        java.lang.Integer[] intArray98 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue51, intQueue62, intArray98);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue8 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue14 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest0.FuzzTest_toArray(intQueue8, intQueue14, intArray22);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue32 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue38 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest24.FuzzTest_toArray(intQueue32, intQueue38, intArray46);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue49 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10, 10, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue56 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue67 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue73 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest59.FuzzTest_toArray(intQueue67, intQueue73, intArray81);
        fuzzTest51.FuzzTest_toArray(intQueue56, intQueue58, intArray81);
        fuzzTest48.FuzzTest_toArray(intQueue49, intQueue50, intArray81);
        java.lang.Integer[] intArray85 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue38, intQueue49, intArray85);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue3 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue13 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue19 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest5.FuzzTest_toArray(intQueue13, intQueue19, intArray27);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 100, (-1), 0, 10 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue35 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue45 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue51 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest37.FuzzTest_toArray(intQueue45, intQueue51, intArray59);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue69 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue75 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest61.FuzzTest_toArray(intQueue69, intQueue75, intArray83);
        fuzzTest5.FuzzTest_toArray(intQueue35, intQueue51, intArray83);
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue86 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 100, 0 };
        c2s_aug_sub.PriorityQueue<java.lang.Integer> intQueue90 = new c2s_aug_sub.PriorityQueue<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue90, intArray89);
        java.lang.Integer[] intArray92 = null;
        fuzzTest5.FuzzTest_toArray(intQueue86, intQueue90, intArray92);
        java.lang.Integer[] intArray94 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intQueue3, intQueue86, intArray94);
    }
}

