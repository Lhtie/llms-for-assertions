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
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet32 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet36 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        fuzzTest29.FuzzTest_add(intSet32, intSet36, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet44 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet48 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        fuzzTest41.FuzzTest_add(intSet44, intSet48, (-1), (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_add(intSet36, intSet48, (int) (short) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet59 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet63 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzzTest56.FuzzTest_add(intSet59, intSet63, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet36, intSet59, (int) (byte) 1, (java.lang.Integer) 0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet3 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet15 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet19 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_add(intSet15, intSet19, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet28 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet32 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest25.FuzzTest_add(intSet28, intSet32, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet40 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet44 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzzTest37.FuzzTest_add(intSet40, intSet44, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet52 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet56 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        fuzzTest49.FuzzTest_add(intSet52, intSet56, (-1), (java.lang.Integer) 1);
        fuzzTest25.FuzzTest_add(intSet44, intSet56, (int) (short) 0, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet67 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzzTest24.FuzzTest_add(intSet44, intSet67, (int) (short) -1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet15, intSet44, 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet3 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet15 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet19 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_add(intSet15, intSet19, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet27 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzzTest0.FuzzTest_add(intSet19, intSet27, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet37 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet41 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzzTest34.FuzzTest_add(intSet37, intSet41, (-1), (java.lang.Integer) 1);
        fuzzTest32.FuzzTest_add(intSet33, intSet37, 10, (java.lang.Integer) (-1));
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet49 = null;
        fuzzTest0.FuzzTest_add(intSet33, intSet49, (int) (byte) 0, (java.lang.Integer) 10);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet53 = null;
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet55 = null;
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet59 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet63 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzzTest56.FuzzTest_add(intSet59, intSet63, (-1), (java.lang.Integer) 1);
        fuzzTest54.FuzzTest_add(intSet55, intSet59, 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_add(intSet53, intSet59, (int) (byte) 100, (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet74 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet75 = null;
        fuzzTest0.FuzzTest_add(intSet74, intSet75, 0, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet82 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet86 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        fuzzTest79.FuzzTest_add(intSet82, intSet86, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 10, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet94 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet94, intArray93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet82, intSet94, (int) (short) 1, (java.lang.Integer) 10);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet3 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet15 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet19 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_add(intSet15, intSet19, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet27 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzzTest0.FuzzTest_add(intSet19, intSet27, (int) '4', (java.lang.Integer) 10);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet36 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet40 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest33.FuzzTest_add(intSet36, intSet40, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intSet32, intSet36, (int) (short) 100, (java.lang.Integer) 100);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet48 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet49 = null;
        fuzzTest0.FuzzTest_add(intSet48, intSet49, (int) (byte) 100, (java.lang.Integer) 10);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet53 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet54 = null;
        fuzzTest0.FuzzTest_add(intSet53, intSet54, (int) 'a', (java.lang.Integer) 100);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet60 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet65 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet69 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzzTest62.FuzzTest_add(intSet65, intSet69, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet60, intSet65, (int) (short) 1, (java.lang.Integer) (-1));
    }
}

