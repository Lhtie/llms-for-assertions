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
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet8, intSet14, (java.lang.Integer) 2, false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet18 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest12.FuzzTest_add(intSet18, intSet20, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet18, intSet24, (java.lang.Integer) 1, false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet8, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet12, intSet13, (java.lang.Integer) 10, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest15.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = null;
        fuzzTest27.FuzzTest_add(intSet33, intSet35, (java.lang.Integer) (-1), false);
        fuzzTest14.FuzzTest_add(intSet21, intSet35, (java.lang.Integer) 0, true);
        fuzzTest12.FuzzTest_add(intSet13, intSet35, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet55 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = null;
        fuzzTest49.FuzzTest_add(intSet55, intSet57, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet67 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet69 = null;
        fuzzTest61.FuzzTest_add(intSet67, intSet69, (java.lang.Integer) (-1), false);
        fuzzTest48.FuzzTest_add(intSet55, intSet69, (java.lang.Integer) 0, true);
        fuzzTest46.FuzzTest_add(intSet47, intSet69, (java.lang.Integer) 0, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_add(intSet69, intSet79, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet13, intSet79, (java.lang.Integer) 1, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet7 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_add(intSet7, intSet9, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet19 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_add(intSet19, intSet21, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet7, intSet21, (java.lang.Integer) 0, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet28 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet28, intSet29, (java.lang.Integer) 10, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = null;
        fuzzTest4.FuzzTest_add(intSet10, intSet12, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest16.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzzTest3.FuzzTest_add(intSet10, intSet24, (java.lang.Integer) 0, true);
        fuzzTest1.FuzzTest_add(intSet2, intSet24, (java.lang.Integer) 0, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet24, intSet34, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet46 = null;
        fuzzTest38.FuzzTest_add(intSet44, intSet46, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet60 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = null;
        fuzzTest54.FuzzTest_add(intSet60, intSet62, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet72 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet74 = null;
        fuzzTest66.FuzzTest_add(intSet72, intSet74, (java.lang.Integer) (-1), false);
        fuzzTest53.FuzzTest_add(intSet60, intSet74, (java.lang.Integer) 0, true);
        fuzzTest51.FuzzTest_add(intSet52, intSet74, (java.lang.Integer) 0, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_add(intSet74, intSet84, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet44, intSet84, (java.lang.Integer) 0, false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = null;
        fuzzTest4.FuzzTest_add(intSet10, intSet12, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest16.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzzTest3.FuzzTest_add(intSet10, intSet24, (java.lang.Integer) 0, true);
        fuzzTest1.FuzzTest_add(intSet2, intSet24, (java.lang.Integer) 0, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet24, intSet34, (java.lang.Integer) 100, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet47 = null;
        fuzzTest39.FuzzTest_add(intSet45, intSet47, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet58 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet60 = null;
        fuzzTest52.FuzzTest_add(intSet58, intSet60, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet70 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest64.FuzzTest_add(intSet70, intSet72, (java.lang.Integer) (-1), false);
        fuzzTest51.FuzzTest_add(intSet58, intSet72, (java.lang.Integer) 0, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_add(intSet72, intSet79, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet38, intSet79, (java.lang.Integer) 0, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest2.FuzzTest_add(intSet8, intSet10, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet20 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest14.FuzzTest_add(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzzTest1.FuzzTest_add(intSet8, intSet22, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet8, intSet31, (java.lang.Integer) 0, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet19 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_add(intSet19, intSet21, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest25.FuzzTest_add(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzzTest12.FuzzTest_add(intSet19, intSet33, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest44.FuzzTest_add(intSet50, intSet52, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest56.FuzzTest_add(intSet62, intSet64, (java.lang.Integer) (-1), false);
        fuzzTest43.FuzzTest_add(intSet50, intSet64, (java.lang.Integer) 0, true);
        fuzzTest41.FuzzTest_add(intSet42, intSet64, (java.lang.Integer) 0, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_add(intSet64, intSet74, (java.lang.Integer) 100, false);
        fuzzTest0.FuzzTest_add(intSet33, intSet64, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet81 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0, 10, 1, 0, 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet88 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet81, intSet88, (java.lang.Integer) 1, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet7 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_add(intSet7, intSet9, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet19 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_add(intSet19, intSet21, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet7, intSet21, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest28.FuzzTest_add(intSet34, intSet36, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet47 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest41.FuzzTest_add(intSet47, intSet49, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest53.FuzzTest_add(intSet59, intSet61, (java.lang.Integer) (-1), false);
        fuzzTest40.FuzzTest_add(intSet47, intSet61, (java.lang.Integer) 0, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_add(intSet61, intSet68, (java.lang.Integer) 1, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet72 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet68, intSet72, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet20 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest14.FuzzTest_add(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = null;
        fuzzTest26.FuzzTest_add(intSet32, intSet34, (java.lang.Integer) (-1), false);
        fuzzTest13.FuzzTest_add(intSet20, intSet34, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet47 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest41.FuzzTest_add(intSet47, intSet49, (java.lang.Integer) (-1), false);
        fuzzTest12.FuzzTest_add(intSet34, intSet47, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 10, (-1), 100, (-1), 2 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet63 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet47, intSet63, (java.lang.Integer) 0, false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet9 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet11 = null;
        fuzzTest3.FuzzTest_add(intSet9, intSet11, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest15.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest2.FuzzTest_add(intSet9, intSet23, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intSet1, intSet23, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = null;
        fuzzTest33.FuzzTest_add(intSet39, intSet41, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet46 = null;
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzzTest45.FuzzTest_add(intSet46, intSet51, (java.lang.Integer) (-1), true);
        fuzzTest0.FuzzTest_add(intSet41, intSet51, (java.lang.Integer) 1, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = null;
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet66 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        fuzzTest60.FuzzTest_add(intSet61, intSet66, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet59, intSet66, (java.lang.Integer) 1, false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet7 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_add(intSet7, intSet9, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet19 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_add(intSet19, intSet21, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet7, intSet21, (java.lang.Integer) 0, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet28 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet28, intSet29, (java.lang.Integer) 2, false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet9 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet9, intArray8);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet11 = null;
        fuzzTest3.FuzzTest_add(intSet9, intSet11, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest15.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest2.FuzzTest_add(intSet9, intSet23, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intSet1, intSet23, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 100, (-1), 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet38 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet46 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet48 = null;
        fuzzTest40.FuzzTest_add(intSet46, intSet48, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet58 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet60 = null;
        fuzzTest52.FuzzTest_add(intSet58, intSet60, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 2, 100, 10, (-1), 2 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet71 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        fuzzTest40.FuzzTest_add(intSet58, intSet71, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet38, intSet58, (java.lang.Integer) 0, false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet8, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest16.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest28.FuzzTest_add(intSet34, intSet36, (java.lang.Integer) (-1), false);
        fuzzTest15.FuzzTest_add(intSet22, intSet36, (java.lang.Integer) 0, true);
        fuzzTest13.FuzzTest_add(intSet14, intSet36, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest46.FuzzTest_add(intSet52, intSet54, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = null;
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet64 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        fuzzTest58.FuzzTest_add(intSet59, intSet64, (java.lang.Integer) (-1), true);
        fuzzTest13.FuzzTest_add(intSet54, intSet64, (java.lang.Integer) 1, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet72 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(intSet72, intSet73, (java.lang.Integer) 100, true);
        fuzzTest0.FuzzTest_add(intSet12, intSet73, (java.lang.Integer) 10, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet82 = null;
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet87 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        fuzzTest81.FuzzTest_add(intSet82, intSet87, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet80, intSet87, (java.lang.Integer) 2, false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = null;
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest2.FuzzTest_add(intSet3, intSet8, (java.lang.Integer) (-1), true);
        fuzzTest0.FuzzTest_add(intSet1, intSet3, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest17.FuzzTest_add(intSet23, intSet25, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest29.FuzzTest_add(intSet35, intSet37, (java.lang.Integer) (-1), false);
        fuzzTest16.FuzzTest_add(intSet23, intSet37, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest44.FuzzTest_add(intSet50, intSet52, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = null;
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        fuzzTest56.FuzzTest_add(intSet57, intSet62, (java.lang.Integer) (-1), true);
        fuzzTest16.FuzzTest_add(intSet50, intSet62, (java.lang.Integer) 2, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet70 = null;
        fuzzTest0.FuzzTest_add(intSet62, intSet70, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), (-1), 2 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet78 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet82 = null;
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet87 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        fuzzTest81.FuzzTest_add(intSet82, intSet87, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet92 = null;
        fuzzTest80.FuzzTest_add(intSet87, intSet92, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet78, intSet87, (java.lang.Integer) 0, false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        fuzzTest0.FuzzTest_add(intSet1, intSet6, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet17 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet19 = null;
        fuzzTest11.FuzzTest_add(intSet17, intSet19, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest23.FuzzTest_add(intSet29, intSet31, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 2, 100, 10, (-1), 2 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet42 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest11.FuzzTest_add(intSet29, intSet42, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet53 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest47.FuzzTest_add(intSet53, intSet55, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet65 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet67 = null;
        fuzzTest59.FuzzTest_add(intSet65, intSet67, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 2, 100, 10, (-1), 2 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet78 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        fuzzTest47.FuzzTest_add(intSet65, intSet78, (java.lang.Integer) 10, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet42, intSet78, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest2.FuzzTest_add(intSet8, intSet10, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet20 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest14.FuzzTest_add(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzzTest1.FuzzTest_add(intSet8, intSet22, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest29.FuzzTest_add(intSet35, intSet37, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet22, intSet35, (java.lang.Integer) 10, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = null;
        fuzzTest0.FuzzTest_add(intSet44, intSet45, (java.lang.Integer) 2, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = null;
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest51.FuzzTest_add(intSet52, intSet57, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = null;
        fuzzTest50.FuzzTest_add(intSet57, intSet62, (java.lang.Integer) 0, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet66 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet67 = null;
        fuzzTest50.FuzzTest_add(intSet66, intSet67, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet77 = null;
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet82 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        fuzzTest76.FuzzTest_add(intSet77, intSet82, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet87 = null;
        fuzzTest75.FuzzTest_add(intSet82, intSet87, (java.lang.Integer) 0, true);
        fuzzTest50.FuzzTest_add(intSet73, intSet82, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet49, intSet73, (java.lang.Integer) 100, false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet19 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_add(intSet19, intSet21, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest25.FuzzTest_add(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzzTest12.FuzzTest_add(intSet19, intSet33, (java.lang.Integer) 0, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet33, intSet40, (java.lang.Integer) 1, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest46.FuzzTest_add(intSet52, intSet54, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet64 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet66 = null;
        fuzzTest58.FuzzTest_add(intSet64, intSet66, (java.lang.Integer) (-1), false);
        fuzzTest45.FuzzTest_add(intSet52, intSet66, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intSet44, intSet52, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 10, 1, (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet81 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet83 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet81, intSet83, (java.lang.Integer) 10, false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = null;
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest2.FuzzTest_add(intSet3, intSet8, (java.lang.Integer) (-1), true);
        fuzzTest0.FuzzTest_add(intSet1, intSet3, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest16.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest28.FuzzTest_add(intSet34, intSet36, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 2, 100, 10, (-1), 2 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet47 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest16.FuzzTest_add(intSet34, intSet47, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet54 = null;
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest53.FuzzTest_add(intSet54, intSet59, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest52.FuzzTest_add(intSet59, intSet64, (java.lang.Integer) 0, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet68 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet69 = null;
        fuzzTest52.FuzzTest_add(intSet68, intSet69, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet75 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet79 = null;
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet84 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        fuzzTest78.FuzzTest_add(intSet79, intSet84, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet89 = null;
        fuzzTest77.FuzzTest_add(intSet84, intSet89, (java.lang.Integer) 0, true);
        fuzzTest52.FuzzTest_add(intSet75, intSet84, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet34, intSet75, (java.lang.Integer) 2, false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_add(intSet6, intSet8, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet14 = null;
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet19 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest13.FuzzTest_add(intSet14, intSet19, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest12.FuzzTest_add(intSet19, intSet24, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest28.FuzzTest_add(intSet34, intSet36, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet47 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest41.FuzzTest_add(intSet47, intSet49, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest53.FuzzTest_add(intSet59, intSet61, (java.lang.Integer) (-1), false);
        fuzzTest40.FuzzTest_add(intSet47, intSet61, (java.lang.Integer) 0, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_add(intSet61, intSet68, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet19, intSet68, (java.lang.Integer) 0, false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = null;
        fuzzTest4.FuzzTest_add(intSet10, intSet12, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest16.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzzTest3.FuzzTest_add(intSet10, intSet24, (java.lang.Integer) 0, true);
        fuzzTest1.FuzzTest_add(intSet2, intSet24, (java.lang.Integer) 0, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intSet24, intSet34, (java.lang.Integer) 100, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet47 = null;
        fuzzTest39.FuzzTest_add(intSet45, intSet47, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet38, intSet47, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet60 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = null;
        fuzzTest54.FuzzTest_add(intSet60, intSet62, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet72 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet74 = null;
        fuzzTest66.FuzzTest_add(intSet72, intSet74, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, 2, 100, 10, (-1), 2 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet85 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        fuzzTest54.FuzzTest_add(intSet72, intSet85, (java.lang.Integer) 10, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet90 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet85, intSet90, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest2.FuzzTest_add(intSet8, intSet10, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet20 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest14.FuzzTest_add(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzzTest1.FuzzTest_add(intSet8, intSet22, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest29.FuzzTest_add(intSet35, intSet37, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet22, intSet35, (java.lang.Integer) 10, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = null;
        fuzzTest0.FuzzTest_add(intSet44, intSet45, (java.lang.Integer) 2, true);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1) };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet63 = null;
        fuzzTest55.FuzzTest_add(intSet61, intSet63, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet75 = null;
        fuzzTest67.FuzzTest_add(intSet73, intSet75, (java.lang.Integer) (-1), false);
        fuzzTest54.FuzzTest_add(intSet61, intSet75, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet88 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet90 = null;
        fuzzTest82.FuzzTest_add(intSet88, intSet90, (java.lang.Integer) (-1), false);
        fuzzTest53.FuzzTest_add(intSet75, intSet88, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet51, intSet88, (java.lang.Integer) 1, false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = null;
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest2.FuzzTest_add(intSet3, intSet8, (java.lang.Integer) (-1), true);
        fuzzTest0.FuzzTest_add(intSet1, intSet3, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet25 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet27 = null;
        fuzzTest19.FuzzTest_add(intSet25, intSet27, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet37 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = null;
        fuzzTest31.FuzzTest_add(intSet37, intSet39, (java.lang.Integer) (-1), false);
        fuzzTest18.FuzzTest_add(intSet25, intSet39, (java.lang.Integer) 0, true);
        fuzzTest16.FuzzTest_add(intSet17, intSet39, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzzTest0.FuzzTest_add(intSet39, intSet51, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet56 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = null;
        fuzzTest0.FuzzTest_add(intSet56, intSet57, (java.lang.Integer) 2, false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet67 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet69 = null;
        fuzzTest61.FuzzTest_add(intSet67, intSet69, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet67, intSet73, (java.lang.Integer) 100, false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet7 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_add(intSet7, intSet9, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet19 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_add(intSet19, intSet21, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet7, intSet21, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), (-1), 100 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = null;
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet40 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest34.FuzzTest_add(intSet35, intSet40, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet46 = null;
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzzTest45.FuzzTest_add(intSet46, intSet51, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet56 = null;
        fuzzTest34.FuzzTest_add(intSet51, intSet56, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet32, intSet51, (java.lang.Integer) 1, false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = null;
        fuzzTest4.FuzzTest_add(intSet10, intSet12, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest16.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzzTest3.FuzzTest_add(intSet10, intSet24, (java.lang.Integer) 0, true);
        fuzzTest1.FuzzTest_add(intSet2, intSet24, (java.lang.Integer) 0, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = null;
        fuzzTest0.FuzzTest_add(intSet24, intSet34, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = null;
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet44 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzzTest38.FuzzTest_add(intSet39, intSet44, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = null;
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet56 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        fuzzTest50.FuzzTest_add(intSet51, intSet56, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest49.FuzzTest_add(intSet56, intSet61, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet44, intSet56, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet10, intArray9);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet12 = null;
        fuzzTest4.FuzzTest_add(intSet10, intSet12, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest16.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzzTest3.FuzzTest_add(intSet10, intSet24, (java.lang.Integer) 0, true);
        fuzzTest1.FuzzTest_add(intSet2, intSet24, (java.lang.Integer) 0, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = null;
        fuzzTest0.FuzzTest_add(intSet24, intSet34, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet47 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest41.FuzzTest_add(intSet47, intSet49, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest53.FuzzTest_add(intSet59, intSet61, (java.lang.Integer) (-1), false);
        fuzzTest40.FuzzTest_add(intSet47, intSet61, (java.lang.Integer) 0, true);
        fuzzTest38.FuzzTest_add(intSet39, intSet61, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1, 2, 2 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet75 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet39, intSet75, (java.lang.Integer) 0, false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest2.FuzzTest_add(intSet8, intSet10, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet1, intSet10, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet18 = null;
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        fuzzTest17.FuzzTest_add(intSet18, intSet23, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest29.FuzzTest_add(intSet35, intSet37, (java.lang.Integer) (-1), false);
        fuzzTest17.FuzzTest_add(intSet28, intSet37, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet53 = null;
        fuzzTest45.FuzzTest_add(intSet51, intSet53, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet63 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet65 = null;
        fuzzTest57.FuzzTest_add(intSet63, intSet65, (java.lang.Integer) (-1), false);
        fuzzTest44.FuzzTest_add(intSet51, intSet65, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet74 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        fuzzTest17.FuzzTest_add(intSet65, intSet74, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet81 = null;
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet86 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        fuzzTest80.FuzzTest_add(intSet81, intSet86, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet91 = null;
        fuzzTest79.FuzzTest_add(intSet86, intSet91, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet74, intSet86, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest2.FuzzTest_add(intSet8, intSet10, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest17.FuzzTest_add(intSet23, intSet25, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet37 = null;
        fuzzTest29.FuzzTest_add(intSet35, intSet37, (java.lang.Integer) (-1), false);
        fuzzTest16.FuzzTest_add(intSet23, intSet37, (java.lang.Integer) 0, true);
        fuzzTest14.FuzzTest_add(intSet15, intSet37, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet53 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest47.FuzzTest_add(intSet53, intSet55, (java.lang.Integer) (-1), false);
        fuzzTest2.FuzzTest_add(intSet37, intSet53, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_add(intSet1, intSet37, (java.lang.Integer) 1, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet65 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet66 = null;
        fuzzTest0.FuzzTest_add(intSet65, intSet66, (java.lang.Integer) 1, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet70 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1, 10, 0, 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet76 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet70, intSet76, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = null;
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest2.FuzzTest_add(intSet3, intSet8, (java.lang.Integer) (-1), true);
        fuzzTest0.FuzzTest_add(intSet1, intSet3, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet16 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet17 = null;
        fuzzTest0.FuzzTest_add(intSet16, intSet17, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest23.FuzzTest_add(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = null;
        fuzzTest35.FuzzTest_add(intSet41, intSet43, (java.lang.Integer) (-1), false);
        fuzzTest22.FuzzTest_add(intSet29, intSet43, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet56 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet58 = null;
        fuzzTest50.FuzzTest_add(intSet56, intSet58, (java.lang.Integer) (-1), false);
        fuzzTest21.FuzzTest_add(intSet43, intSet56, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet67 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet56, intSet67, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet10 = null;
        fuzzTest2.FuzzTest_add(intSet8, intSet10, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet1, intSet10, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest17.FuzzTest_add(intSet23, intSet25, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet30 = null;
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        fuzzTest29.FuzzTest_add(intSet30, intSet35, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = null;
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet46 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzzTest40.FuzzTest_add(intSet41, intSet46, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet51 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest40.FuzzTest_add(intSet51, intSet52, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest56.FuzzTest_add(intSet62, intSet64, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet68 = null;
        fuzzTest40.FuzzTest_add(intSet62, intSet68, (java.lang.Integer) 2, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_add(intSet62, intSet72, (java.lang.Integer) 2, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet23, intSet72, (java.lang.Integer) 0, false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet2 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet7 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest1.FuzzTest_add(intSet2, intSet7, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = null;
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet18 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        fuzzTest12.FuzzTest_add(intSet13, intSet18, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest1.FuzzTest_add(intSet18, intSet23, (java.lang.Integer) 1, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet27 = null;
        fuzzTest0.FuzzTest_add(intSet23, intSet27, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet32 = null;
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet37 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzzTest31.FuzzTest_add(intSet32, intSet37, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = null;
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest44.FuzzTest_add(intSet45, intSet50, (java.lang.Integer) (-1), true);
        fuzzTest42.FuzzTest_add(intSet43, intSet45, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet58 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest42.FuzzTest_add(intSet58, intSet59, (java.lang.Integer) 100, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet65 = null;
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet70 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        fuzzTest64.FuzzTest_add(intSet65, intSet70, (java.lang.Integer) (-1), true);
        fuzzTest42.FuzzTest_add(intSet63, intSet70, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet37, intSet70, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = null;
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest2.FuzzTest_add(intSet3, intSet8, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest1.FuzzTest_add(intSet8, intSet13, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet19 = null;
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        fuzzTest18.FuzzTest_add(intSet19, intSet24, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = null;
        fuzzTest17.FuzzTest_add(intSet24, intSet29, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet41 = null;
        fuzzTest33.FuzzTest_add(intSet39, intSet41, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet56 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet58 = null;
        fuzzTest50.FuzzTest_add(intSet56, intSet58, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet68 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet70 = null;
        fuzzTest62.FuzzTest_add(intSet68, intSet70, (java.lang.Integer) (-1), false);
        fuzzTest49.FuzzTest_add(intSet56, intSet70, (java.lang.Integer) 0, true);
        fuzzTest47.FuzzTest_add(intSet48, intSet70, (java.lang.Integer) 0, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_add(intSet70, intSet80, (java.lang.Integer) 100, false);
        fuzzTest33.FuzzTest_add(intSet45, intSet70, (java.lang.Integer) 100, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet87 = null;
        fuzzTest17.FuzzTest_add(intSet45, intSet87, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet8, intSet45, (java.lang.Integer) 1, false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = null;
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest2.FuzzTest_add(intSet3, intSet8, (java.lang.Integer) (-1), true);
        fuzzTest0.FuzzTest_add(intSet1, intSet3, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet16 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet17 = null;
        fuzzTest0.FuzzTest_add(intSet16, intSet17, (java.lang.Integer) 1, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest0.FuzzTest_add(intSet21, intSet22, (java.lang.Integer) 2, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet33 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet35 = null;
        fuzzTest27.FuzzTest_add(intSet33, intSet35, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet47 = null;
        fuzzTest39.FuzzTest_add(intSet45, intSet47, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet57 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest51.FuzzTest_add(intSet57, intSet59, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 2, 100, 10, (-1), 2 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet70 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        fuzzTest39.FuzzTest_add(intSet57, intSet70, (java.lang.Integer) 10, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet75 = null;
        fuzzTest27.FuzzTest_add(intSet70, intSet75, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet26, intSet70, (java.lang.Integer) 2, false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet3 = null;
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest2.FuzzTest_add(intSet3, intSet8, (java.lang.Integer) (-1), true);
        fuzzTest0.FuzzTest_add(intSet1, intSet3, (java.lang.Integer) (-1), false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet16 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet17 = null;
        fuzzTest0.FuzzTest_add(intSet16, intSet17, (java.lang.Integer) 1, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet21 = null;
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet24 = null;
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        fuzzTest23.FuzzTest_add(intSet24, intSet29, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet34 = null;
        fuzzTest22.FuzzTest_add(intSet29, intSet34, (java.lang.Integer) 0, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet38 = null;
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet39 = null;
        fuzzTest22.FuzzTest_add(intSet38, intSet39, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet45 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet49 = null;
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet54 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzzTest48.FuzzTest_add(intSet49, intSet54, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest47.FuzzTest_add(intSet54, intSet59, (java.lang.Integer) 0, true);
        fuzzTest22.FuzzTest_add(intSet45, intSet54, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10, 0, 2, 2, 0 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet72 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet74 = null;
        fuzzTest22.FuzzTest_add(intSet72, intSet74, (java.lang.Integer) 100, false);
        fuzzTest0.FuzzTest_add(intSet21, intSet74, (java.lang.Integer) 2, false);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet81 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 1, 0, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet86 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet81, intSet86, (java.lang.Integer) 100, false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet2 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet7 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzzTest1.FuzzTest_add(intSet2, intSet7, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet13 = null;
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet18 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        fuzzTest12.FuzzTest_add(intSet13, intSet18, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest1.FuzzTest_add(intSet18, intSet23, (java.lang.Integer) 1, true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet27 = null;
        fuzzTest0.FuzzTest_add(intSet23, intSet27, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet38 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest32.FuzzTest_add(intSet38, intSet40, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet52 = null;
        fuzzTest44.FuzzTest_add(intSet50, intSet52, (java.lang.Integer) (-1), false);
        fuzzTest31.FuzzTest_add(intSet38, intSet52, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet60 = null;
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet62 = null;
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet67 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzzTest61.FuzzTest_add(intSet62, intSet67, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet73 = null;
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 2, 2, 1 };
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet78 = new buggycodes.mut_041.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        fuzzTest72.FuzzTest_add(intSet73, intSet78, (java.lang.Integer) (-1), true);
        buggycodes.mut_041.TreeSet<java.lang.Integer> intSet83 = null;
        fuzzTest61.FuzzTest_add(intSet78, intSet83, (java.lang.Integer) 1, true);
        fuzzTest59.FuzzTest_add(intSet60, intSet78, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet38, intSet78, (java.lang.Integer) 2, false);
    }
}

