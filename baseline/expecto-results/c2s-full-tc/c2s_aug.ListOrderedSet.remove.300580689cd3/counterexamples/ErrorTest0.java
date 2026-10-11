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
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet3 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet15 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet19 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_remove(intSet15, intSet19, (-1), (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet28 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet32 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest25.FuzzTest_remove(intSet28, intSet32, (-1), (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_remove(intSet24, intSet32, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet43 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet47 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest40.FuzzTest_remove(intSet43, intSet47, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet55 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet59 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest52.FuzzTest_remove(intSet55, intSet59, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet67 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzzTest40.FuzzTest_remove(intSet59, intSet67, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet32, intSet59, 0, (java.lang.Integer) 100);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet3 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (-1), (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet16 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet20 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet28 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet32 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest25.FuzzTest_remove(intSet28, intSet32, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet40 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest13.FuzzTest_remove(intSet32, intSet40, (int) '4', (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_remove(intSet12, intSet32, (int) (short) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet51 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet55 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        fuzzTest48.FuzzTest_remove(intSet51, intSet55, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet63 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet67 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzzTest60.FuzzTest_remove(intSet63, intSet67, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet75 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzzTest48.FuzzTest_remove(intSet67, intSet75, (int) '4', (java.lang.Integer) 10);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet82 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet75, intSet82, (int) (byte) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet3 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet16 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet21 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet25 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest18.FuzzTest_remove(intSet21, intSet25, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet33 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet37 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzzTest30.FuzzTest_remove(intSet33, intSet37, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet45 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest18.FuzzTest_remove(intSet37, intSet45, (int) '4', (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_remove(intSet16, intSet45, (int) (byte) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet56 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet60 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest53.FuzzTest_remove(intSet56, intSet60, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet68 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet72 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest65.FuzzTest_remove(intSet68, intSet72, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet80 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet84 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        fuzzTest77.FuzzTest_remove(intSet80, intSet84, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet92 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet92, intArray91);
        fuzzTest65.FuzzTest_remove(intSet84, intSet92, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet56, intSet84, 0, (java.lang.Integer) 10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet3 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet15 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet19 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_remove(intSet15, intSet19, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet27 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet31 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        fuzzTest24.FuzzTest_remove(intSet27, intSet31, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet39 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest12.FuzzTest_remove(intSet31, intSet39, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet47 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet51 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzzTest44.FuzzTest_remove(intSet47, intSet51, (-1), (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet60 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet64 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        fuzzTest57.FuzzTest_remove(intSet60, intSet64, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet72 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet76 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        fuzzTest69.FuzzTest_remove(intSet72, intSet76, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet84 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        fuzzTest57.FuzzTest_remove(intSet76, intSet84, (int) '4', (java.lang.Integer) 10);
        fuzzTest44.FuzzTest_remove(intSet56, intSet76, (int) (short) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet39, intSet76, (int) (byte) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet3 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (-1), (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet16 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet20 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intSet12, intSet20, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet31 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet35 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        fuzzTest28.FuzzTest_remove(intSet31, intSet35, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet44 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet49 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet53 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        fuzzTest46.FuzzTest_remove(intSet49, intSet53, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet61 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet65 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        fuzzTest58.FuzzTest_remove(intSet61, intSet65, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet73 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest46.FuzzTest_remove(intSet65, intSet73, (int) '4', (java.lang.Integer) 10);
        fuzzTest28.FuzzTest_remove(intSet44, intSet73, (int) (byte) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet84 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet88 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        fuzzTest81.FuzzTest_remove(intSet84, intSet88, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet44, intSet88, (int) (short) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet4 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet8 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest1.FuzzTest_remove(intSet4, intSet8, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet16 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet20 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intSet8, intSet16, (int) '4', (java.lang.Integer) 100);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0, 100, 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet33 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet38 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet42 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest35.FuzzTest_remove(intSet38, intSet42, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet33, intSet38, (int) (byte) 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet4 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet8 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest1.FuzzTest_remove(intSet4, intSet8, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet16 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet20 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet28 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet32 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest25.FuzzTest_remove(intSet28, intSet32, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet40 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet44 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzzTest37.FuzzTest_remove(intSet40, intSet44, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet52 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest25.FuzzTest_remove(intSet44, intSet52, (int) '4', (java.lang.Integer) 10);
        fuzzTest1.FuzzTest_remove(intSet20, intSet44, (int) (short) 10, (java.lang.Integer) 1);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 100, 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet64 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet20, intSet64, 0, (java.lang.Integer) 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet5 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet9 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzzTest2.FuzzTest_remove(intSet5, intSet9, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet17 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet21 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        fuzzTest14.FuzzTest_remove(intSet17, intSet21, (-1), (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet30 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet34 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest27.FuzzTest_remove(intSet30, intSet34, (-1), (java.lang.Integer) 1);
        fuzzTest14.FuzzTest_remove(intSet26, intSet34, (int) 'a', (java.lang.Integer) 0);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet42 = null;
        fuzzTest2.FuzzTest_remove(intSet34, intSet42, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intSet1, intSet34, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet53 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet57 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest50.FuzzTest_remove(intSet53, intSet57, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet65 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet69 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzzTest62.FuzzTest_remove(intSet65, intSet69, (-1), (java.lang.Integer) 1);
        fuzzTest49.FuzzTest_remove(intSet57, intSet65, (int) '4', (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet80 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet84 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        fuzzTest77.FuzzTest_remove(intSet80, intSet84, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet57, intSet84, (int) (short) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet5 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet9 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        fuzzTest2.FuzzTest_remove(intSet5, intSet9, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet17 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet21 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        fuzzTest14.FuzzTest_remove(intSet17, intSet21, (-1), (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet30 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet34 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        fuzzTest27.FuzzTest_remove(intSet30, intSet34, (-1), (java.lang.Integer) 1);
        fuzzTest14.FuzzTest_remove(intSet26, intSet34, (int) 'a', (java.lang.Integer) 0);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet42 = null;
        fuzzTest2.FuzzTest_remove(intSet34, intSet42, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_remove(intSet1, intSet34, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet52 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet56 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        fuzzTest49.FuzzTest_remove(intSet52, intSet56, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, (-1), 1, 0 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet66 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet52, intSet66, (int) (byte) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet4 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet8 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest1.FuzzTest_remove(intSet4, intSet8, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet16 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet20 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (-1), (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet29 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet33 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest26.FuzzTest_remove(intSet29, intSet33, (-1), (java.lang.Integer) 1);
        fuzzTest13.FuzzTest_remove(intSet25, intSet33, (int) 'a', (java.lang.Integer) 0);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet41 = null;
        fuzzTest1.FuzzTest_remove(intSet33, intSet41, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet50 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet54 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzzTest47.FuzzTest_remove(intSet50, intSet54, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet62 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet66 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        fuzzTest59.FuzzTest_remove(intSet62, intSet66, (-1), (java.lang.Integer) 1);
        fuzzTest46.FuzzTest_remove(intSet54, intSet62, (int) '4', (java.lang.Integer) 100);
        fuzzTest1.FuzzTest_remove(intSet45, intSet62, (-1), (java.lang.Integer) (-1));
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1), 1 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet80 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet62, intSet80, 0, (java.lang.Integer) 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet3 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet15 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet19 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_remove(intSet15, intSet19, (-1), (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet28 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet32 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest25.FuzzTest_remove(intSet28, intSet32, (-1), (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_remove(intSet24, intSet32, (int) 'a', (java.lang.Integer) 0);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet40 = null;
        fuzzTest0.FuzzTest_remove(intSet32, intSet40, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet48 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet52 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest45.FuzzTest_remove(intSet48, intSet52, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet60 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet64 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        fuzzTest57.FuzzTest_remove(intSet60, intSet64, (-1), (java.lang.Integer) 1);
        fuzzTest44.FuzzTest_remove(intSet52, intSet60, (int) '4', (java.lang.Integer) 100);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet72 = null;
        fuzzTest0.FuzzTest_remove(intSet60, intSet72, (int) (short) 10, (java.lang.Integer) 0);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet76 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet77 = null;
        fuzzTest0.FuzzTest_remove(intSet76, intSet77, 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet84 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { (-1), 0 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet89 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet84, intSet89, (int) (byte) 1, (java.lang.Integer) 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet3 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (-1), (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet12 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet13 = null;
        fuzzTest0.FuzzTest_remove(intSet12, intSet13, (int) (byte) 100, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet21 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet25 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest18.FuzzTest_remove(intSet21, intSet25, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet33 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet37 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzzTest30.FuzzTest_remove(intSet33, intSet37, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet45 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet49 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzzTest42.FuzzTest_remove(intSet45, intSet49, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet57 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest30.FuzzTest_remove(intSet49, intSet57, (int) '4', (java.lang.Integer) 10);
        fuzzTest17.FuzzTest_remove(intSet25, intSet49, (int) 'a', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet68 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet72 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest65.FuzzTest_remove(intSet68, intSet72, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet80 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet84 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        fuzzTest77.FuzzTest_remove(intSet80, intSet84, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet92 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet92, intArray91);
        fuzzTest65.FuzzTest_remove(intSet84, intSet92, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet25, intSet84, (int) (byte) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet3 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet15 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet19 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_remove(intSet15, intSet19, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet27 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzzTest0.FuzzTest_remove(intSet19, intSet27, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet35 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet39 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest32.FuzzTest_remove(intSet35, intSet39, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet47 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet51 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzzTest44.FuzzTest_remove(intSet47, intSet51, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet39, intSet47, 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet4 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet8 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest1.FuzzTest_remove(intSet4, intSet8, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet16 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet20 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet28 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet32 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest25.FuzzTest_remove(intSet28, intSet32, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet40 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest13.FuzzTest_remove(intSet32, intSet40, (int) '4', (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_remove(intSet8, intSet32, (int) 'a', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet51 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet55 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        fuzzTest48.FuzzTest_remove(intSet51, intSet55, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet63 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet67 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzzTest60.FuzzTest_remove(intSet63, intSet67, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet75 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzzTest48.FuzzTest_remove(intSet67, intSet75, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet83 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet87 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        fuzzTest80.FuzzTest_remove(intSet83, intSet87, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet67, intSet87, 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet1 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, 1, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet9 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet13 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        fuzzTest6.FuzzTest_remove(intSet9, intSet13, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet21 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet25 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest18.FuzzTest_remove(intSet21, intSet25, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet33 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet37 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzzTest30.FuzzTest_remove(intSet33, intSet37, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet45 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet49 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzzTest42.FuzzTest_remove(intSet45, intSet49, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet57 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest30.FuzzTest_remove(intSet49, intSet57, (int) '4', (java.lang.Integer) 10);
        fuzzTest6.FuzzTest_remove(intSet25, intSet49, (-1), (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet68 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet72 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest65.FuzzTest_remove(intSet68, intSet72, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet49, intSet72, 0, (java.lang.Integer) 1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet3 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet15 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet19 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_remove(intSet15, intSet19, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet27 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzzTest0.FuzzTest_remove(intSet19, intSet27, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet35 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet39 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest32.FuzzTest_remove(intSet35, intSet39, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet48 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet52 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest45.FuzzTest_remove(intSet48, intSet52, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet60 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet64 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        fuzzTest57.FuzzTest_remove(intSet60, intSet64, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet72 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet76 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        fuzzTest69.FuzzTest_remove(intSet72, intSet76, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet84 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        fuzzTest57.FuzzTest_remove(intSet76, intSet84, (int) '4', (java.lang.Integer) 10);
        fuzzTest44.FuzzTest_remove(intSet52, intSet76, (int) 'a', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet39, intSet52, (int) (short) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet1 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet9 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet13 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        fuzzTest6.FuzzTest_remove(intSet9, intSet13, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet21 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet25 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest18.FuzzTest_remove(intSet21, intSet25, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet33 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest6.FuzzTest_remove(intSet25, intSet33, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet41 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet45 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest38.FuzzTest_remove(intSet41, intSet45, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet54 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet59 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet63 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzzTest56.FuzzTest_remove(intSet59, intSet63, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet71 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet75 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzzTest68.FuzzTest_remove(intSet71, intSet75, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet83 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        fuzzTest56.FuzzTest_remove(intSet75, intSet83, (int) '4', (java.lang.Integer) 10);
        fuzzTest38.FuzzTest_remove(intSet54, intSet83, (int) (byte) -1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet33, intSet83, (int) (short) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet3 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet15 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet19 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest12.FuzzTest_remove(intSet15, intSet19, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet27 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet31 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        fuzzTest24.FuzzTest_remove(intSet27, intSet31, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet39 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet43 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        fuzzTest36.FuzzTest_remove(intSet39, intSet43, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet51 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet55 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        fuzzTest48.FuzzTest_remove(intSet51, intSet55, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet63 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet67 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzzTest60.FuzzTest_remove(intSet63, intSet67, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet75 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzzTest48.FuzzTest_remove(intSet67, intSet75, (int) '4', (java.lang.Integer) 10);
        fuzzTest24.FuzzTest_remove(intSet43, intSet67, (-1), (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet15, intSet43, 0, (java.lang.Integer) 1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet3 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (-1), (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet12 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet13 = null;
        fuzzTest0.FuzzTest_remove(intSet12, intSet13, (int) (byte) 100, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet20 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet24 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest17.FuzzTest_remove(intSet20, intSet24, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet33 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet37 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzzTest30.FuzzTest_remove(intSet33, intSet37, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet45 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet49 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        fuzzTest42.FuzzTest_remove(intSet45, intSet49, (-1), (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet58 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet62 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest55.FuzzTest_remove(intSet58, intSet62, (-1), (java.lang.Integer) 1);
        fuzzTest42.FuzzTest_remove(intSet54, intSet62, (int) 'a', (java.lang.Integer) 0);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet70 = null;
        fuzzTest30.FuzzTest_remove(intSet62, intSet70, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet77 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet81 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        fuzzTest74.FuzzTest_remove(intSet77, intSet81, (-1), (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet86 = null;
        fuzzTest30.FuzzTest_remove(intSet77, intSet86, 100, (java.lang.Integer) (-1));
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet90 = null;
        fuzzTest29.FuzzTest_remove(intSet77, intSet90, (int) '#', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet24, intSet77, (int) (short) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet1 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, 10, (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet6 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = null;
        fuzzTest0.FuzzTest_remove(intSet6, intSet7, (int) (short) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet16 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet20 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest13.FuzzTest_remove(intSet16, intSet20, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet28 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet32 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest25.FuzzTest_remove(intSet28, intSet32, (-1), (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_remove(intSet20, intSet28, (int) '4', (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet43 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet47 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest40.FuzzTest_remove(intSet43, intSet47, (-1), (java.lang.Integer) 1);
        fuzzTest11.FuzzTest_remove(intSet28, intSet43, (int) (short) -1, (java.lang.Integer) 100);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet55 = null;
        fuzzTest0.FuzzTest_remove(intSet28, intSet55, (int) (short) 10, (java.lang.Integer) 100);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet62 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, (-1), (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet68 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet62, intSet68, (int) (short) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet3 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest0.FuzzTest_remove(intSet3, intSet7, (-1), (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet12 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet13 = null;
        fuzzTest0.FuzzTest_remove(intSet12, intSet13, (int) (byte) 100, (java.lang.Integer) (-1));
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet21 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet25 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest18.FuzzTest_remove(intSet21, intSet25, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet33 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet37 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzzTest30.FuzzTest_remove(intSet33, intSet37, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet45 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest18.FuzzTest_remove(intSet37, intSet45, (int) '4', (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_remove(intSet17, intSet37, (int) ' ', (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet56 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet60 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        fuzzTest53.FuzzTest_remove(intSet56, intSet60, (-1), (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet65 = null;
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet69 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet73 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest66.FuzzTest_remove(intSet69, intSet73, (-1), (java.lang.Integer) 1);
        fuzzTest53.FuzzTest_remove(intSet65, intSet73, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet84 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet88 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        fuzzTest81.FuzzTest_remove(intSet84, intSet88, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet73, intSet84, 0, (java.lang.Integer) 10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet1 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet2 = null;
        fuzzTest0.FuzzTest_remove(intSet1, intSet2, 10, (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet6 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet7 = null;
        fuzzTest0.FuzzTest_remove(intSet6, intSet7, (int) (short) 1, (java.lang.Integer) 10);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet11 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet12 = null;
        fuzzTest0.FuzzTest_remove(intSet11, intSet12, (int) '#', (java.lang.Integer) 10);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet16 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet17 = null;
        fuzzTest0.FuzzTest_remove(intSet16, intSet17, (int) (short) 100, (java.lang.Integer) 100);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet21 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet22 = null;
        fuzzTest0.FuzzTest_remove(intSet21, intSet22, (int) (byte) 100, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet27 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet28 = null;
        fuzzTest26.FuzzTest_remove(intSet27, intSet28, (int) (short) 0, (java.lang.Integer) (-1));
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet32 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet33 = null;
        fuzzTest26.FuzzTest_remove(intSet32, intSet33, (int) ' ', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet41 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet45 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzzTest38.FuzzTest_remove(intSet41, intSet45, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet53 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet57 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest50.FuzzTest_remove(intSet53, intSet57, (-1), (java.lang.Integer) 1);
        fuzzTest37.FuzzTest_remove(intSet45, intSet53, (int) '4', (java.lang.Integer) 100);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet65 = null;
        fuzzTest26.FuzzTest_remove(intSet53, intSet65, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet72 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet76 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        fuzzTest69.FuzzTest_remove(intSet72, intSet76, (-1), (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet81 = null;
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet85 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet89 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        fuzzTest82.FuzzTest_remove(intSet85, intSet89, (-1), (java.lang.Integer) 1);
        fuzzTest69.FuzzTest_remove(intSet81, intSet89, (int) 'a', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet53, intSet89, (int) (byte) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet4 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet8 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest1.FuzzTest_remove(intSet4, intSet8, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10, 0, 0 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet17 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet22 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet26 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        fuzzTest19.FuzzTest_remove(intSet22, intSet26, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet34 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet38 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzzTest31.FuzzTest_remove(intSet34, intSet38, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet46 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzzTest19.FuzzTest_remove(intSet38, intSet46, (int) '4', (java.lang.Integer) 10);
        fuzzTest1.FuzzTest_remove(intSet17, intSet46, (int) (byte) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet57 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet61 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        fuzzTest54.FuzzTest_remove(intSet57, intSet61, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet69 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet73 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzzTest66.FuzzTest_remove(intSet69, intSet73, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet81 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        fuzzTest54.FuzzTest_remove(intSet73, intSet81, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet46, intSet81, 1, (java.lang.Integer) 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet3 = null;
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet4 = null;
        fuzzTest2.FuzzTest_remove(intSet3, intSet4, 10, (java.lang.Integer) 1);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet8 = null;
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet14 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet18 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        fuzzTest11.FuzzTest_remove(intSet14, intSet18, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet26 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet30 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        fuzzTest23.FuzzTest_remove(intSet26, intSet30, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet38 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzzTest11.FuzzTest_remove(intSet30, intSet38, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet47 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet51 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzzTest44.FuzzTest_remove(intSet47, intSet51, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet59 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet63 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzzTest56.FuzzTest_remove(intSet59, intSet63, (-1), (java.lang.Integer) 1);
        fuzzTest43.FuzzTest_remove(intSet51, intSet59, (int) '4', (java.lang.Integer) 100);
        fuzzTest10.FuzzTest_remove(intSet30, intSet59, (int) '4', (java.lang.Integer) 100);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet74 = null;
        fuzzTest9.FuzzTest_remove(intSet30, intSet74, (int) '4', (java.lang.Integer) (-1));
        fuzzTest2.FuzzTest_remove(intSet8, intSet30, (int) (byte) 10, (java.lang.Integer) 0);
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet81 = null;
        fuzzTest1.FuzzTest_remove(intSet30, intSet81, 100, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest85 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet88 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 10 };
        c2s_aug.ListOrderedSet<java.lang.Integer> intSet92 = new c2s_aug.ListOrderedSet<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet92, intArray91);
        fuzzTest85.FuzzTest_remove(intSet88, intSet92, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intSet30, intSet88, 0, (java.lang.Integer) 10);
    }
}

