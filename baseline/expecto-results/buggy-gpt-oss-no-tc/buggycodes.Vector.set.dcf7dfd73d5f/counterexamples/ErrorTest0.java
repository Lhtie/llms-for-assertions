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
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, (-1) };
        buggycodes.mut_012.Vector<java.lang.Integer> intList4 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList9 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList13 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest6.FuzzTest_set(intList9, intList13, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList22 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList26 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest19.FuzzTest_set(intList22, intList26, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_012.Vector<java.lang.Integer> intList35 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest6.FuzzTest_set(intList26, intList35, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList4, intList35, (int) (byte) 0, (java.lang.Integer) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList3 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList7 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList16 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList20 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_set(intList16, intList20, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList29 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList33 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_set(intList29, intList33, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList20, intList33, (int) '4', (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1) };
        buggycodes.mut_012.Vector<java.lang.Integer> intList45 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList54 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList59 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList63 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_set(intList59, intList63, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest47.FuzzTest_set(intList54, intList63, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList45, intList54, 0, (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList7 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList12 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList16 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest9.FuzzTest_set(intList12, intList16, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList7, intList16, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList29 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList33 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_set(intList29, intList33, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList46 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList51 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList55 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest48.FuzzTest_set(intList51, intList55, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest39.FuzzTest_set(intList46, intList55, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_set(intList33, intList55, (int) (byte) 1, (java.lang.Integer) 10, (java.lang.Integer) 100);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { (-1), 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList72 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { (-1), 0 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList77 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList72, intList77, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList3 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList7 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_set(intList3, intList7, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList16 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList20 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_set(intList16, intList20, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), (-1), (-1) };
        buggycodes.mut_012.Vector<java.lang.Integer> intList30 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList35 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        buggycodes.mut_012.Vector<java.lang.Integer> intList37 = null;
        fuzzTest32.FuzzTest_set(intList35, intList37, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest13.FuzzTest_set(intList30, intList35, (int) (byte) 100, (java.lang.Integer) (-1), (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList49 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList53 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest46.FuzzTest_set(intList49, intList53, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList62 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList66 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest59.FuzzTest_set(intList62, intList66, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList75 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList79 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest72.FuzzTest_set(intList75, intList79, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest46.FuzzTest_set(intList66, intList79, (int) '4', (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList30, intList66, 0, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList3 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_012.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_set(intList3, intList5, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList13 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList17 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest10.FuzzTest_set(intList13, intList17, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggycodes.mut_012.Vector<java.lang.Integer> intList23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList27 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList31 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_set(intList27, intList31, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1), (-1), (-1) };
        buggycodes.mut_012.Vector<java.lang.Integer> intList41 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList46 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        buggycodes.mut_012.Vector<java.lang.Integer> intList48 = null;
        fuzzTest43.FuzzTest_set(intList46, intList48, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest24.FuzzTest_set(intList41, intList46, (int) (byte) 100, (java.lang.Integer) (-1), (java.lang.Integer) 10);
        fuzzTest10.FuzzTest_set(intList23, intList46, (int) '#', (java.lang.Integer) 100, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList64 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        buggycodes.mut_012.Vector<java.lang.Integer> intList66 = null;
        fuzzTest61.FuzzTest_set(intList64, intList66, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_012.Vector<java.lang.Integer> intList71 = null;
        buggycodes.mut_012.Vector<java.lang.Integer> intList72 = null;
        fuzzTest61.FuzzTest_set(intList71, intList72, (int) (short) -1, (java.lang.Integer) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList80 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10 };
        buggycodes.mut_012.Vector<java.lang.Integer> intList84 = new buggycodes.mut_012.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest77.FuzzTest_set(intList80, intList84, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        buggycodes.mut_012.Vector<java.lang.Integer> intList90 = null;
        fuzzTest61.FuzzTest_set(intList80, intList90, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList46, intList80, 0, (java.lang.Integer) 100, (java.lang.Integer) 0);
    }
}

