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
        c2s_aug.TreeList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList5 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList9 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_add(intList5, intList9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList1, intList5, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList20 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList24 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList32 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList36 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_add(intList32, intList36, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList44 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList48 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_add(intList44, intList48, (-1), (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_add(intList36, intList48, (int) (short) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList59 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList63 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_add(intList59, intList63, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList36, intList59, 0, (java.lang.Integer) 100);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList5 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList9 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_add(intList5, intList9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList1, intList5, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList20 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList24 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList32 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList36 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_add(intList32, intList36, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList44 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest17.FuzzTest_add(intList36, intList44, (int) '4', (java.lang.Integer) 10);
        c2s_aug.TreeList<java.lang.Integer> intList49 = null;
        fuzzTest0.FuzzTest_add(intList44, intList49, 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList56 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList60 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_add(intList56, intList60, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList68 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList72 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_add(intList68, intList72, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList77 = null;
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList81 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList85 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest78.FuzzTest_add(intList81, intList85, (-1), (java.lang.Integer) 1);
        fuzzTest65.FuzzTest_add(intList77, intList85, (int) 'a', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList56, intList85, (int) (short) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList5 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList9 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_add(intList5, intList9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList1, intList5, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList20 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList24 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList32 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList36 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_add(intList32, intList36, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList44 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest17.FuzzTest_add(intList36, intList44, (int) '4', (java.lang.Integer) 10);
        c2s_aug.TreeList<java.lang.Integer> intList49 = null;
        fuzzTest0.FuzzTest_add(intList44, intList49, 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList56 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList60 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_add(intList56, intList60, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList68 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList72 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_add(intList68, intList72, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList80 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList84 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest77.FuzzTest_add(intList80, intList84, (-1), (java.lang.Integer) 1);
        fuzzTest53.FuzzTest_add(intList72, intList84, (int) (short) 0, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.TreeList<java.lang.Integer> intList95 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList95, intArray94);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList84, intList95, (int) (short) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList5 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList9 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_add(intList5, intList9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList1, intList5, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList20 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList24 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList32 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList36 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_add(intList32, intList36, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList44 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest17.FuzzTest_add(intList36, intList44, (int) '4', (java.lang.Integer) 10);
        c2s_aug.TreeList<java.lang.Integer> intList49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList53 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList57 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest50.FuzzTest_add(intList53, intList57, (-1), (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_add(intList49, intList53, (int) (short) 100, (java.lang.Integer) 100);
        c2s_aug.TreeList<java.lang.Integer> intList65 = null;
        c2s_aug.TreeList<java.lang.Integer> intList66 = null;
        fuzzTest17.FuzzTest_add(intList65, intList66, (int) '#', (java.lang.Integer) 10);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0 };
        c2s_aug.TreeList<java.lang.Integer> intList72 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList76 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest17.FuzzTest_add(intList72, intList76, (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList84 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList72, intList84, 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList3 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList15 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList19 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList27 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList31 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_add(intList27, intList31, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList39 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest12.FuzzTest_add(intList31, intList39, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList47 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList51 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_add(intList47, intList51, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList60 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList64 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest57.FuzzTest_add(intList60, intList64, (-1), (java.lang.Integer) 1);
        fuzzTest44.FuzzTest_add(intList56, intList64, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList75 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList79 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest72.FuzzTest_add(intList75, intList79, (-1), (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_add(intList64, intList75, (int) (short) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 0, 0, 10, 100, 1 };
        c2s_aug.TreeList<java.lang.Integer> intList93 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList75, intList93, 0, (java.lang.Integer) 1);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList11 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzzTest4.FuzzTest_add(intList7, intList11, (-1), (java.lang.Integer) 1);
        fuzzTest2.FuzzTest_add(intList3, intList7, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList23 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList27 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest20.FuzzTest_add(intList23, intList27, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList35 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList39 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_add(intList35, intList39, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList47 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList51 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_add(intList47, intList51, (-1), (java.lang.Integer) 1);
        fuzzTest20.FuzzTest_add(intList39, intList51, (int) (short) 0, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, (-1) };
        c2s_aug.TreeList<java.lang.Integer> intList62 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest19.FuzzTest_add(intList39, intList62, (int) (short) -1, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_add(intList7, intList39, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList72 = null;
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList76 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList80 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest73.FuzzTest_add(intList76, intList80, (-1), (java.lang.Integer) 1);
        fuzzTest71.FuzzTest_add(intList72, intList76, 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 1, 100 };
        c2s_aug.TreeList<java.lang.Integer> intList91 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        fuzzTest70.FuzzTest_add(intList76, intList91, (-1), (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList7, intList91, 1, (java.lang.Integer) 100);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList3 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList7 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList12 = null;
        c2s_aug.TreeList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList12, intList13, (int) ' ', (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList20 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList24 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList32 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList36 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_add(intList32, intList36, (-1), (java.lang.Integer) 1);
        c2s_aug.TreeList<java.lang.Integer> intList41 = null;
        c2s_aug.TreeList<java.lang.Integer> intList42 = null;
        fuzzTest29.FuzzTest_add(intList41, intList42, (int) ' ', (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug.TreeList<java.lang.Integer> intList48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.TreeList<java.lang.Integer> intList52 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.TreeList<java.lang.Integer> intList56 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_add(intList52, intList56, (-1), (java.lang.Integer) 1);
        fuzzTest47.FuzzTest_add(intList48, intList52, 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 100 };
        c2s_aug.TreeList<java.lang.Integer> intList67 = new c2s_aug.TreeList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest46.FuzzTest_add(intList52, intList67, (-1), (java.lang.Integer) 0);
        c2s_aug.TreeList<java.lang.Integer> intList72 = null;
        fuzzTest29.FuzzTest_add(intList52, intList72, (int) (byte) -1, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList20, intList52, (int) (short) 0, (java.lang.Integer) 100);
    }
}

