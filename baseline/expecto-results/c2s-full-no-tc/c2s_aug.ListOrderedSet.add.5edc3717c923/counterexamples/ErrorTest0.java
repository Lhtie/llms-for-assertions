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
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet5 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet9 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzzTest2.FuzzTest_add(intSet5, intSet9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intSet1, intSet5, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet20 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet24 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest17.FuzzTest_add(intSet20, intSet24, (-1), (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet33 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet37 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzzTest30.FuzzTest_add(intSet33, intSet37, (-1), (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_add(intSet29, intSet37, (int) 'a', (java.lang.Integer) 0);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10, 10, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet49 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet53 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        fuzzTest17.FuzzTest_add(intSet49, intSet53, 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet61 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet65 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        fuzzTest58.FuzzTest_add(intSet61, intSet65, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet73 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet77 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        fuzzTest70.FuzzTest_add(intSet73, intSet77, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet85 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        fuzzTest58.FuzzTest_add(intSet77, intSet85, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet53, intSet85, (int) (short) 0, (java.lang.Integer) (-1));
    }
}

