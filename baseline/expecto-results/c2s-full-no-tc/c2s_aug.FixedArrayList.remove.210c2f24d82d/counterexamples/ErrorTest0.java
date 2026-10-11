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
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection3 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection7, intArray6);
        fuzzTest0.FuzzTest_remove(intCollection3, intCollection7, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 0, 0 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection16 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection23 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection27 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection27, intArray26);
        fuzzTest20.FuzzTest_remove(intCollection23, intCollection27, (-1), (java.lang.Integer) 1);
        fuzzTest18.FuzzTest_remove(intCollection19, intCollection23, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection38 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection42 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection42, intArray41);
        fuzzTest35.FuzzTest_remove(intCollection38, intCollection42, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection52 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection56 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection56, intArray55);
        fuzzTest49.FuzzTest_remove(intCollection52, intCollection56, (-1), (java.lang.Integer) 1);
        fuzzTest47.FuzzTest_remove(intCollection48, intCollection52, 10, (java.lang.Integer) (-1));
        fuzzTest18.FuzzTest_remove(intCollection38, intCollection48, (int) (short) 100, (java.lang.Integer) 10);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 100, 1 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection71 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection71, intArray70);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection76 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection80 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection80, intArray79);
        fuzzTest73.FuzzTest_remove(intCollection76, intCollection80, (-1), (java.lang.Integer) 1);
        fuzzTest18.FuzzTest_remove(intCollection71, intCollection80, (-1), (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intCollection16, intCollection71, 1, (java.lang.Integer) 0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection3 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection7, intArray6);
        fuzzTest0.FuzzTest_remove(intCollection3, intCollection7, (-1), (java.lang.Integer) 1);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection12 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection13 = null;
        fuzzTest0.FuzzTest_remove(intCollection12, intCollection13, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection20 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection24 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection24, intArray23);
        fuzzTest17.FuzzTest_remove(intCollection20, intCollection24, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection32 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection36 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection36, intArray35);
        fuzzTest29.FuzzTest_remove(intCollection32, intCollection36, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection44 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection48 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection48, intArray47);
        fuzzTest41.FuzzTest_remove(intCollection44, intCollection48, (-1), (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_remove(intCollection36, intCollection48, (int) (short) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection59 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection63 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection63, intArray62);
        fuzzTest56.FuzzTest_remove(intCollection59, intCollection63, (-1), (java.lang.Integer) 1);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection68 = null;
        fuzzTest17.FuzzTest_remove(intCollection63, intCollection68, (int) (byte) 100, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection75 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection79 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection79, intArray78);
        fuzzTest72.FuzzTest_remove(intCollection75, intCollection79, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intCollection63, intCollection79, (int) (byte) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection4 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection8 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection8, intArray7);
        fuzzTest1.FuzzTest_remove(intCollection4, intCollection8, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection16 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection20 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection20, intArray19);
        fuzzTest13.FuzzTest_remove(intCollection16, intCollection20, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection28 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection28, intArray27);
        fuzzTest1.FuzzTest_remove(intCollection20, intCollection28, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection36 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection40 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection40, intArray39);
        fuzzTest33.FuzzTest_remove(intCollection36, intCollection40, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection48 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection52 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection52, intArray51);
        fuzzTest45.FuzzTest_remove(intCollection48, intCollection52, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection60 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection60, intArray59);
        fuzzTest33.FuzzTest_remove(intCollection52, intCollection60, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection68 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection72 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection72, intArray71);
        fuzzTest65.FuzzTest_remove(intCollection68, intCollection72, (-1), (java.lang.Integer) 1);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection77 = null;
        fuzzTest33.FuzzTest_remove(intCollection68, intCollection77, 0, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intCollection20, intCollection68, 0, (java.lang.Integer) 10);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection5 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection9 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection9, intArray8);
        fuzzTest2.FuzzTest_remove(intCollection5, intCollection9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intCollection1, intCollection5, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection20 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection24 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection24, intArray23);
        fuzzTest17.FuzzTest_remove(intCollection20, intCollection24, (-1), (java.lang.Integer) 1);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection33 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection37 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection37, intArray36);
        fuzzTest30.FuzzTest_remove(intCollection33, intCollection37, (-1), (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_remove(intCollection29, intCollection37, (int) 'a', (java.lang.Integer) 0);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10, 10, (-1) };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection49 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection53 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection53, intArray52);
        fuzzTest17.FuzzTest_remove(intCollection49, intCollection53, 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection61 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection65 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection65, intArray64);
        fuzzTest58.FuzzTest_remove(intCollection61, intCollection65, (-1), (java.lang.Integer) 1);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection70 = null;
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection74 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection78 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection78, intArray77);
        fuzzTest71.FuzzTest_remove(intCollection74, intCollection78, (-1), (java.lang.Integer) 1);
        fuzzTest58.FuzzTest_remove(intCollection70, intCollection78, (int) 'a', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intCollection49, intCollection78, 1, (java.lang.Integer) 10);
    }
}

