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
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_set(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList28 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList34 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest20.FuzzTest_set(intList28, intList34, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList49 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList55 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest41.FuzzTest_set(intList49, intList55, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest20.FuzzTest_set(intList40, intList55, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList40, intList65, (int) (byte) 10, (java.lang.Integer) (-1), (java.lang.Integer) 2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList15 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_set(intList9, intList15, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList30 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList36 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest22.FuzzTest_set(intList30, intList36, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_set(intList21, intList36, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList54 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList60 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest46.FuzzTest_set(intList54, intList60, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList75 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList81 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest67.FuzzTest_set(intList75, intList81, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest46.FuzzTest_set(intList66, intList81, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList21, intList81, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList15 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_set(intList9, intList15, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_set(intList29, intList35, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList50 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList56 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest42.FuzzTest_set(intList50, intList56, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest21.FuzzTest_set(intList41, intList56, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList9, intList41, (int) (byte) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList15 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_set(intList9, intList15, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_set(intList29, intList35, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList50 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList56 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest42.FuzzTest_set(intList50, intList56, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest21.FuzzTest_set(intList41, intList56, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList75 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList81 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest67.FuzzTest_set(intList75, intList81, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest21.FuzzTest_set(intList66, intList75, (int) (byte) -1, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList15, intList66, (int) (byte) 1, (java.lang.Integer) 2, (java.lang.Integer) 100);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList10 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggycodes.mut_000.Vector<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList10, intList12, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), 2, (-1), (-1), (-1), 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList24 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList34 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList40 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest26.FuzzTest_set(intList34, intList40, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_set(intList24, intList34, (int) (short) -1, (java.lang.Integer) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList58 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList64 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest50.FuzzTest_set(intList58, intList64, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList72 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList58, intList72, (int) ' ', (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList10 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggycodes.mut_000.Vector<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList10, intList12, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList19 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_set(intList29, intList35, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_set(intList19, intList29, (int) (byte) 10, (java.lang.Integer) 2, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList53 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList59 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest45.FuzzTest_set(intList53, intList59, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList69 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest0.FuzzTest_set(intList59, intList69, (int) (short) 1, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList76 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_set(intList76, intList77, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList85 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        buggycodes.mut_000.Vector<java.lang.Integer> intList87 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_set(intList85, intList87, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList85, intList92, (int) (byte) 0, (java.lang.Integer) 2, (java.lang.Integer) 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_set(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList22 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_set(intList22, intList23, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList36 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList42 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest28.FuzzTest_set(intList36, intList42, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList57 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList63 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest49.FuzzTest_set(intList57, intList63, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest28.FuzzTest_set(intList48, intList63, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 100);
        fuzzTest20.FuzzTest_set(intList23, intList48, (int) '#', (java.lang.Integer) 2, (java.lang.Integer) 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList48, intList77, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList10 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggycodes.mut_000.Vector<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList10, intList12, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 2, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggycodes.mut_000.Vector<java.lang.Integer> intList22 = null;
        fuzzTest0.FuzzTest_set(intList20, intList22, (int) (byte) 0, (java.lang.Integer) 2, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList41 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest27.FuzzTest_set(intList35, intList41, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList56 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList62 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest48.FuzzTest_set(intList56, intList62, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest27.FuzzTest_set(intList47, intList62, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList62, intList72, 0, (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList11 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        buggycodes.mut_000.Vector<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(intList11, intList13, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList19 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_set(intList19, intList20, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList28 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        buggycodes.mut_000.Vector<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_set(intList28, intList30, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList11, intList30, 0, (java.lang.Integer) 100, (java.lang.Integer) 10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_set(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_set(intList29, intList35, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_set(intList20, intList35, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList53 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList59 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest45.FuzzTest_set(intList53, intList59, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList65 = null;
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList69 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest45.FuzzTest_set(intList65, intList69, (int) ' ', (java.lang.Integer) 10, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList76 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_set(intList76, intList77, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList85 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        buggycodes.mut_000.Vector<java.lang.Integer> intList87 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_set(intList85, intList87, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList69, intList87, 0, (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList10 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggycodes.mut_000.Vector<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList10, intList12, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList19 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_set(intList19, intList20, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList26 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_set(intList26, intList27, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        buggycodes.mut_000.Vector<java.lang.Integer> intList37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_set(intList35, intList37, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList50 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList56 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest42.FuzzTest_set(intList50, intList56, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList71 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList77 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest63.FuzzTest_set(intList71, intList77, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest42.FuzzTest_set(intList62, intList77, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 100);
        fuzzTest18.FuzzTest_set(intList35, intList62, (int) '4', (java.lang.Integer) 2, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList17, intList62, 10, (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(intList8, intList9, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList17 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        buggycodes.mut_000.Vector<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(intList17, intList19, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 2, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList27 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = null;
        fuzzTest7.FuzzTest_set(intList27, intList29, (int) (byte) 0, (java.lang.Integer) 2, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_set(intList35, intList36, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList41 = null;
        fuzzTest7.FuzzTest_set(intList35, intList41, (int) (byte) -1, (java.lang.Integer) 10, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList46 = null;
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList49 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest7.FuzzTest_set(intList46, intList49, (int) (byte) 1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList56 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_set(intList56, intList57, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList65 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        buggycodes.mut_000.Vector<java.lang.Integer> intList67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_set(intList65, intList67, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList49, intList67, (int) (short) 0, (java.lang.Integer) 1, (java.lang.Integer) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList10 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggycodes.mut_000.Vector<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList10, intList12, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 2, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggycodes.mut_000.Vector<java.lang.Integer> intList22 = null;
        fuzzTest0.FuzzTest_set(intList20, intList22, (int) (byte) 0, (java.lang.Integer) 2, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList28 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_set(intList28, intList29, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList34 = null;
        fuzzTest0.FuzzTest_set(intList28, intList34, (int) (byte) -1, (java.lang.Integer) 10, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList39 = null;
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList42 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest0.FuzzTest_set(intList39, intList42, (int) (byte) 1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList49 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_set(intList49, intList50, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList58 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        buggycodes.mut_000.Vector<java.lang.Integer> intList60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_set(intList58, intList60, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList66 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_set(intList66, intList67, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList74 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_set(intList74, intList75, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList83 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        buggycodes.mut_000.Vector<java.lang.Integer> intList85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_set(intList83, intList85, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest65.FuzzTest_set(intList72, intList83, (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList58, intList72, (int) (short) 10, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList18 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(intList18, intList20, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_set(intList7, intList18, (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList30 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_set(intList30, intList31, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList36 = null;
        fuzzTest0.FuzzTest_set(intList30, intList36, 2, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList42 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(intList42, intList43, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList50 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_set(intList50, intList51, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList59 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        buggycodes.mut_000.Vector<java.lang.Integer> intList61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_set(intList59, intList61, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest41.FuzzTest_set(intList48, intList59, (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList78 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList84 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest70.FuzzTest_set(intList78, intList84, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList48, intList84, (int) ' ', (java.lang.Integer) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList18 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList24 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest10.FuzzTest_set(intList18, intList24, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList31 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_set(intList31, intList32, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList40 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        buggycodes.mut_000.Vector<java.lang.Integer> intList42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_set(intList40, intList42, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 2, (-1), (-1), (-1), 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList54 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList64 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList70 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest56.FuzzTest_set(intList64, intList70, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest30.FuzzTest_set(intList54, intList64, (int) (short) -1, (java.lang.Integer) 10, (java.lang.Integer) 1);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList83 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest10.FuzzTest_set(intList54, intList83, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest8.FuzzTest_set(intList9, intList83, (int) (byte) 1, (java.lang.Integer) 100, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList7, intList9, 0, (java.lang.Integer) 100, (java.lang.Integer) 2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(intList8, intList9, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList17 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        buggycodes.mut_000.Vector<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(intList17, intList19, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList25 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_set(intList25, intList26, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList34 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        buggycodes.mut_000.Vector<java.lang.Integer> intList36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_set(intList34, intList36, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList44 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        buggycodes.mut_000.Vector<java.lang.Integer> intList46 = null;
        fuzzTest24.FuzzTest_set(intList44, intList46, (int) (byte) 0, (java.lang.Integer) 2, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList52 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_set(intList52, intList53, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList58 = null;
        fuzzTest24.FuzzTest_set(intList52, intList58, (int) (byte) -1, (java.lang.Integer) 10, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList63 = null;
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList66 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest24.FuzzTest_set(intList63, intList66, (int) (byte) 1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList73 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_set(intList73, intList74, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList82 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        buggycodes.mut_000.Vector<java.lang.Integer> intList84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_set(intList82, intList84, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest7.FuzzTest_set(intList66, intList82, (int) (byte) 10, (java.lang.Integer) 1, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList93 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList82, intList93, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList10 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggycodes.mut_000.Vector<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList10, intList12, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList25 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList31 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest17.FuzzTest_set(intList25, intList31, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList38 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(intList38, intList39, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList25, intList39, (int) (byte) 0, (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList17 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_set(intList17, intList18, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList26 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        buggycodes.mut_000.Vector<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_set(intList26, intList28, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest8.FuzzTest_set(intList15, intList26, (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_set(intList7, intList26, (int) (short) 0, (java.lang.Integer) 0, (java.lang.Integer) 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList41 = null;
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList50 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList56 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest42.FuzzTest_set(intList50, intList56, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList62 = null;
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList66 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest42.FuzzTest_set(intList62, intList66, (int) ' ', (java.lang.Integer) 10, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_set(intList41, intList66, (int) '4', (java.lang.Integer) (-1), (java.lang.Integer) 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList76 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.Vector<java.lang.Integer> intList77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList76, intList77, (int) (short) 10, (java.lang.Integer) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList18 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(intList18, intList20, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_set(intList7, intList18, (int) '#', (java.lang.Integer) 2, (java.lang.Integer) 10);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1), 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList33 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList43 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList49 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest35.FuzzTest_set(intList43, intList49, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_set(intList33, intList43, (int) (short) 10, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList60 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_set(intList60, intList61, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList67 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_set(intList67, intList68, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList76 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        buggycodes.mut_000.Vector<java.lang.Integer> intList78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_set(intList76, intList78, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 2, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList86 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        buggycodes.mut_000.Vector<java.lang.Integer> intList88 = null;
        fuzzTest66.FuzzTest_set(intList86, intList88, (int) (byte) 0, (java.lang.Integer) 2, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList61, intList86, 10, (java.lang.Integer) 10, (java.lang.Integer) 10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList18 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(intList18, intList20, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_set(intList7, intList18, (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList30 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_set(intList30, intList31, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList36 = null;
        fuzzTest0.FuzzTest_set(intList30, intList36, 2, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList42 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(intList42, intList43, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList51 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        buggycodes.mut_000.Vector<java.lang.Integer> intList53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_set(intList51, intList53, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList60 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList70 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList76 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest62.FuzzTest_set(intList70, intList76, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest41.FuzzTest_set(intList60, intList70, (int) (byte) 10, (java.lang.Integer) 2, (java.lang.Integer) 10);
        buggycodes.mut_000.Vector<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList60, intList86, (int) (short) 0, (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList16 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList22 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest8.FuzzTest_set(intList16, intList22, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList37 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList43 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest29.FuzzTest_set(intList37, intList43, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest8.FuzzTest_set(intList28, intList43, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_set(intList3, intList28, (int) '#', (java.lang.Integer) 2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList65 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList71 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest57.FuzzTest_set(intList65, intList71, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList78 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_set(intList78, intList79, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList87 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        buggycodes.mut_000.Vector<java.lang.Integer> intList89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_set(intList87, intList89, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList65, intList89, 0, (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList10 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_set(intList10, intList11, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList19 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggycodes.mut_000.Vector<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_set(intList19, intList21, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_set(intList8, intList19, (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList31 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_set(intList31, intList32, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList37 = null;
        fuzzTest1.FuzzTest_set(intList31, intList37, 2, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList43 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_set(intList43, intList44, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList52 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        buggycodes.mut_000.Vector<java.lang.Integer> intList54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_set(intList52, intList54, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList62 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        buggycodes.mut_000.Vector<java.lang.Integer> intList64 = null;
        fuzzTest42.FuzzTest_set(intList62, intList64, (int) (byte) 0, (java.lang.Integer) 2, (java.lang.Integer) 10);
        buggycodes.mut_000.Vector<java.lang.Integer> intList69 = null;
        fuzzTest1.FuzzTest_set(intList62, intList69, 1, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList75 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_set(intList75, intList76, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList84 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        buggycodes.mut_000.Vector<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_set(intList84, intList86, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList62, intList86, (int) (short) 10, (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (short) -1, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList15 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList21 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest7.FuzzTest_set(intList15, intList21, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_set(intList29, intList30, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList43 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList49 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest35.FuzzTest_set(intList43, intList49, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList64 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList70 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest56.FuzzTest_set(intList64, intList70, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest35.FuzzTest_set(intList55, intList70, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 100);
        fuzzTest27.FuzzTest_set(intList30, intList55, (int) '#', (java.lang.Integer) 2, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList15, intList30, (int) (short) 1, (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (short) -1, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_set(intList8, intList9, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList16 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_set(intList16, intList17, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList25 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        buggycodes.mut_000.Vector<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_set(intList25, intList27, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest7.FuzzTest_set(intList14, intList25, (int) '#', (java.lang.Integer) 2, (java.lang.Integer) 10);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, (-1), 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList40 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList50 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList56 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest42.FuzzTest_set(intList50, intList56, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest7.FuzzTest_set(intList40, intList50, (int) (short) 10, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList67 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_set(intList67, intList68, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList75 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_set(intList75, intList76, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList84 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        buggycodes.mut_000.Vector<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_set(intList84, intList86, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest66.FuzzTest_set(intList73, intList84, (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList50, intList73, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_set(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_set(intList29, intList35, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_set(intList20, intList35, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList47 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_set(intList47, intList48, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList56 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        buggycodes.mut_000.Vector<java.lang.Integer> intList58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_set(intList56, intList58, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_set(intList45, intList58, (int) (short) 1, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList69 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_set(intList69, intList70, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_set(intList67, intList70, (int) (byte) 10, (java.lang.Integer) 2, (java.lang.Integer) 2);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, 2, 1, 0, 0 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList85 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzztests.FuzzTest fuzzTest87 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList88 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest87.FuzzTest_set(intList88, intList89, (int) (short) -1, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList85, intList89, (int) (short) 1, (java.lang.Integer) (-1), (java.lang.Integer) 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList18 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(intList18, intList20, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_set(intList7, intList18, (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList30 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_set(intList30, intList31, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList38 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(intList38, intList39, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList47 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggycodes.mut_000.Vector<java.lang.Integer> intList49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(intList47, intList49, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest29.FuzzTest_set(intList36, intList47, (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList59 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(intList59, intList60, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList68 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        buggycodes.mut_000.Vector<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_set(intList68, intList70, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList36, intList70, (int) (short) 10, (java.lang.Integer) 2, (java.lang.Integer) (-1));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList17 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_set(intList17, intList18, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList26 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        buggycodes.mut_000.Vector<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_set(intList26, intList28, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest8.FuzzTest_set(intList15, intList26, (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList37 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.Vector<java.lang.Integer> intList38 = null;
        fuzzTest8.FuzzTest_set(intList37, intList38, 10, (java.lang.Integer) 2, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_set(intList7, intList37, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList55 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList61 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest47.FuzzTest_set(intList55, intList61, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList67 = null;
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList71 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest47.FuzzTest_set(intList67, intList71, (int) ' ', (java.lang.Integer) 10, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList78 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_set(intList78, intList79, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList87 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        buggycodes.mut_000.Vector<java.lang.Integer> intList89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_set(intList87, intList89, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList71, intList89, (int) (short) 1, (java.lang.Integer) 2, (java.lang.Integer) 2);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList18 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(intList18, intList20, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_set(intList7, intList18, (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest0.FuzzTest_set(intList29, intList30, 100, (java.lang.Integer) 100, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList38 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_set(intList38, intList39, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList52 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList58 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest44.FuzzTest_set(intList52, intList58, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList73 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList79 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest65.FuzzTest_set(intList73, intList79, (int) (byte) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzzTest44.FuzzTest_set(intList64, intList79, (int) ' ', (java.lang.Integer) 100, (java.lang.Integer) 100);
        fuzzTest36.FuzzTest_set(intList39, intList64, (int) '#', (java.lang.Integer) 2, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList35, intList64, (int) (short) 0, (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList18 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_set(intList18, intList20, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_set(intList7, intList18, (int) '#', (java.lang.Integer) 2, (java.lang.Integer) 10);
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest0.FuzzTest_set(intList29, intList30, (-1), (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList36 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_set(intList36, intList37, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList45 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        buggycodes.mut_000.Vector<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_set(intList45, intList47, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList55 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        buggycodes.mut_000.Vector<java.lang.Integer> intList57 = null;
        fuzzTest35.FuzzTest_set(intList55, intList57, (int) (byte) 0, (java.lang.Integer) 2, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList63 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_set(intList63, intList64, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList69 = null;
        fuzzTest35.FuzzTest_set(intList63, intList69, (int) (byte) -1, (java.lang.Integer) 10, (java.lang.Integer) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList74 = null;
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList77 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest35.FuzzTest_set(intList74, intList77, (int) (byte) 1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList83 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList77, intList83, (int) (byte) 1, (java.lang.Integer) 1, (java.lang.Integer) 10);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList3 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_set(intList3, intList4, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList12 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_set(intList12, intList14, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 2, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList22 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggycodes.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzzTest2.FuzzTest_set(intList22, intList24, (int) (byte) 0, (java.lang.Integer) 2, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_set(intList1, intList24, 2, (java.lang.Integer) 2, (java.lang.Integer) 10);
        buggycodes.mut_000.Vector<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_set(intList35, intList36, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList43 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_set(intList43, intList44, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList51 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_set(intList51, intList52, (int) (byte) -1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList60 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        buggycodes.mut_000.Vector<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_set(intList60, intList62, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest42.FuzzTest_set(intList49, intList60, (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList71 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.Vector<java.lang.Integer> intList72 = null;
        fuzzTest42.FuzzTest_set(intList71, intList72, 10, (java.lang.Integer) 2, (java.lang.Integer) 0);
        fuzzTest34.FuzzTest_set(intList41, intList71, (int) 'a', (java.lang.Integer) 0, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList33, intList41, (int) (short) 1, (java.lang.Integer) 1, (java.lang.Integer) 100);
    }
}

