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
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList28 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList34 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest20.FuzzTest_insertElementAt(intList28, intList34, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList19, intList34, (java.lang.Integer) 10, (int) '4');
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList50 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList56 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest42.FuzzTest_insertElementAt(intList50, intList56, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList69 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList75 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest61.FuzzTest_insertElementAt(intList69, intList75, (java.lang.Integer) 2, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList56, intList75, (java.lang.Integer) (-1), (int) ' ');
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
        fuzzTest1.FuzzTest_insertElementAt(intList9, intList15, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_insertElementAt(intList29, intList35, (java.lang.Integer) 2, 0);
        fuzzTest1.FuzzTest_insertElementAt(intList20, intList35, (java.lang.Integer) 10, (int) '4');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList51 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList57 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest43.FuzzTest_insertElementAt(intList51, intList57, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList20, intList57, (java.lang.Integer) 0, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList65 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_insertElementAt(intList65, intList66, (java.lang.Integer) 0, (int) (byte) -1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList73 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest0.FuzzTest_insertElementAt(intList70, intList73, (java.lang.Integer) 1, (int) (short) 1);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList82 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        buggycodes.mut_000.Vector<java.lang.Integer> intList84 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList82, intList84, (java.lang.Integer) 2, 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList28 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList34 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest20.FuzzTest_insertElementAt(intList28, intList34, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList19, intList34, (java.lang.Integer) 10, (int) '4');
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList50 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList56 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest42.FuzzTest_insertElementAt(intList50, intList56, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList69 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList75 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest61.FuzzTest_insertElementAt(intList69, intList75, (java.lang.Integer) 2, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList50, intList75, (java.lang.Integer) 1, (int) ' ');
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
        fuzzTest1.FuzzTest_insertElementAt(intList9, intList15, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_insertElementAt(intList29, intList35, (java.lang.Integer) 2, 0);
        fuzzTest1.FuzzTest_insertElementAt(intList20, intList35, (java.lang.Integer) 10, (int) '4');
        buggycodes.mut_000.Vector<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList20, intList43, (java.lang.Integer) 1, (int) (byte) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList11 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList17 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest3.FuzzTest_insertElementAt(intList11, intList17, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList31 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList37 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest23.FuzzTest_insertElementAt(intList31, intList37, (java.lang.Integer) 2, 0);
        fuzzTest3.FuzzTest_insertElementAt(intList22, intList37, (java.lang.Integer) 10, (int) '4');
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList53 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList59 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest45.FuzzTest_insertElementAt(intList53, intList59, (java.lang.Integer) 2, 0);
        fuzzTest2.FuzzTest_insertElementAt(intList22, intList59, (java.lang.Integer) 0, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList67 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_insertElementAt(intList67, intList68, (java.lang.Integer) 0, (int) (byte) -1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList75 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest2.FuzzTest_insertElementAt(intList72, intList75, (java.lang.Integer) 1, (int) (short) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_insertElementAt(intList72, intList80, (java.lang.Integer) 10, (int) (byte) -1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList84 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList72, intList84, (java.lang.Integer) 10, (int) (short) 10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList27 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList33 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest19.FuzzTest_insertElementAt(intList27, intList33, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList38 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList33, intList38, (java.lang.Integer) 10, 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList43 = null;
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList50 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest42.FuzzTest_insertElementAt(intList43, intList50, (java.lang.Integer) 100, (int) '4');
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList56 = null;
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList63 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest55.FuzzTest_insertElementAt(intList56, intList63, (java.lang.Integer) 100, (int) '4');
        fuzzTest0.FuzzTest_insertElementAt(intList50, intList56, (java.lang.Integer) (-1), (int) '4');
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList79 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList85 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest71.FuzzTest_insertElementAt(intList79, intList85, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList90 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList79, intList90, (java.lang.Integer) 2, 10);
        buggycodes.mut_000.Vector<java.lang.Integer> intList94 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.Vector<java.lang.Integer> intList95 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList94, intList95, (java.lang.Integer) 2, 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList15 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_insertElementAt(intList9, intList15, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList15, intList20, (java.lang.Integer) 0, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList34 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList40 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest26.FuzzTest_insertElementAt(intList34, intList40, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList54 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList60 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest46.FuzzTest_insertElementAt(intList54, intList60, (java.lang.Integer) 2, 0);
        fuzzTest26.FuzzTest_insertElementAt(intList45, intList60, (java.lang.Integer) 10, (int) '4');
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList76 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList82 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest68.FuzzTest_insertElementAt(intList76, intList82, (java.lang.Integer) 2, 0);
        fuzzTest25.FuzzTest_insertElementAt(intList60, intList76, (java.lang.Integer) 1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList24, intList60, (java.lang.Integer) 0, (int) (byte) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList15 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_insertElementAt(intList9, intList15, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_insertElementAt(intList29, intList35, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList49 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList55 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest41.FuzzTest_insertElementAt(intList49, intList55, (java.lang.Integer) 2, 0);
        fuzzTest21.FuzzTest_insertElementAt(intList40, intList55, (java.lang.Integer) 10, (int) '4');
        fuzzTest1.FuzzTest_insertElementAt(intList20, intList55, (java.lang.Integer) 0, (int) 'a');
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList74 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList80 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest66.FuzzTest_insertElementAt(intList74, intList80, (java.lang.Integer) 2, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList20, intList74, (java.lang.Integer) 0, (int) ' ');
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList9 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList15 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_insertElementAt(intList9, intList15, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_insertElementAt(intList29, intList35, (java.lang.Integer) 2, 0);
        fuzzTest1.FuzzTest_insertElementAt(intList20, intList35, (java.lang.Integer) 10, (int) '4');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList51 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList57 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest43.FuzzTest_insertElementAt(intList51, intList57, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList20, intList57, (java.lang.Integer) 0, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.Vector<java.lang.Integer> intList66 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList65, intList66, (java.lang.Integer) 2, (int) (short) 10);
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
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_insertElementAt(intList29, intList35, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest20.FuzzTest_insertElementAt(intList35, intList40, (java.lang.Integer) 0, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList19, intList35, (java.lang.Integer) 2, (int) (short) -1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 2, (-1), 1, 100, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList53 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList63 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList69 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest55.FuzzTest_insertElementAt(intList63, intList69, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList83 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList89 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        fuzzTest75.FuzzTest_insertElementAt(intList83, intList89, (java.lang.Integer) 2, 0);
        fuzzTest55.FuzzTest_insertElementAt(intList74, intList89, (java.lang.Integer) 10, (int) '4');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList53, intList74, (java.lang.Integer) 2, (int) (byte) 1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList27 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList33 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest19.FuzzTest_insertElementAt(intList27, intList33, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList38 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList33, intList38, (java.lang.Integer) 10, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList44 = null;
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList51 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest43.FuzzTest_insertElementAt(intList44, intList51, (java.lang.Integer) 100, (int) '4');
        fuzzTest0.FuzzTest_insertElementAt(intList42, intList44, (java.lang.Integer) (-1), (int) '4');
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList68 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList74 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest60.FuzzTest_insertElementAt(intList68, intList74, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList79 = null;
        fuzzTest59.FuzzTest_insertElementAt(intList74, intList79, (java.lang.Integer) 0, 0);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 100, (-1), 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList87 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList74, intList87, (java.lang.Integer) 0, (int) ' ');
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList8, (java.lang.Integer) 100, (int) '4');
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList21 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList27 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest13.FuzzTest_insertElementAt(intList21, intList27, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList40 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList46 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest32.FuzzTest_insertElementAt(intList40, intList46, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList51 = null;
        fuzzTest13.FuzzTest_insertElementAt(intList46, intList51, (java.lang.Integer) 10, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList55 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList51, intList55, (java.lang.Integer) (-1), 2);
        buggycodes.mut_000.Vector<java.lang.Integer> intList59 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.Vector<java.lang.Integer> intList60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_insertElementAt(intList59, intList60, (java.lang.Integer) 2, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList72 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList78 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest64.FuzzTest_insertElementAt(intList72, intList78, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList83 = null;
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1, 0, 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList88 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest64.FuzzTest_insertElementAt(intList83, intList88, (java.lang.Integer) 100, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList93 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList88, intList93, (java.lang.Integer) 1, 2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList28 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList34 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest20.FuzzTest_insertElementAt(intList28, intList34, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList48 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList54 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest40.FuzzTest_insertElementAt(intList48, intList54, (java.lang.Integer) 2, 0);
        fuzzTest20.FuzzTest_insertElementAt(intList39, intList54, (java.lang.Integer) 10, (int) '4');
        fuzzTest0.FuzzTest_insertElementAt(intList19, intList54, (java.lang.Integer) 0, (int) 'a');
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList73 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList79 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest65.FuzzTest_insertElementAt(intList73, intList79, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList84 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList73, intList84, (java.lang.Integer) 10, (int) ' ');
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList8, (java.lang.Integer) 100, (int) '4');
        buggycodes.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList22 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList28 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest14.FuzzTest_insertElementAt(intList22, intList28, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList42 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList48 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest34.FuzzTest_insertElementAt(intList42, intList48, (java.lang.Integer) 2, 0);
        fuzzTest14.FuzzTest_insertElementAt(intList33, intList48, (java.lang.Integer) 10, (int) '4');
        fuzzTest0.FuzzTest_insertElementAt(intList13, intList33, (java.lang.Integer) 10, (int) ' ');
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList67 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList73 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest59.FuzzTest_insertElementAt(intList67, intList73, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList78 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList67, intList78, (java.lang.Integer) 100, (int) (byte) 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList19 = null;
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList24 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest0.FuzzTest_insertElementAt(intList19, intList24, (java.lang.Integer) 100, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList39 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList45 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest31.FuzzTest_insertElementAt(intList39, intList45, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList59 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList65 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest51.FuzzTest_insertElementAt(intList59, intList65, (java.lang.Integer) 2, 0);
        fuzzTest31.FuzzTest_insertElementAt(intList50, intList65, (java.lang.Integer) 10, (int) '4');
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList81 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList87 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest73.FuzzTest_insertElementAt(intList81, intList87, (java.lang.Integer) 2, 0);
        fuzzTest30.FuzzTest_insertElementAt(intList50, intList87, (java.lang.Integer) 0, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList29, intList87, (java.lang.Integer) (-1), (int) (byte) 1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList10 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList16 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_insertElementAt(intList10, intList16, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList21 = null;
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, 0, 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList26 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest2.FuzzTest_insertElementAt(intList21, intList26, (java.lang.Integer) 100, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList21, (java.lang.Integer) 0, 2);
        buggycodes.mut_000.Vector<java.lang.Integer> intList34 = null;
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList37 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest0.FuzzTest_insertElementAt(intList34, intList37, (java.lang.Integer) 100, (int) (byte) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList42 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList43 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList42, intList43, (java.lang.Integer) 1, 1);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 100, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList51 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList63 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList69 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest55.FuzzTest_insertElementAt(intList63, intList69, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList74 = null;
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 0, 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList79 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest55.FuzzTest_insertElementAt(intList74, intList79, (java.lang.Integer) 100, 0);
        fuzzTest53.FuzzTest_insertElementAt(intList54, intList74, (java.lang.Integer) 0, 2);
        buggycodes.mut_000.Vector<java.lang.Integer> intList87 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.Vector<java.lang.Integer> intList88 = null;
        fuzzTest53.FuzzTest_insertElementAt(intList87, intList88, (java.lang.Integer) 0, 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList51, intList87, (java.lang.Integer) 100, 10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList28 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList34 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest20.FuzzTest_insertElementAt(intList28, intList34, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList39 = null;
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 0, 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList44 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest20.FuzzTest_insertElementAt(intList39, intList44, (java.lang.Integer) 100, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList51 = null;
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList58 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest50.FuzzTest_insertElementAt(intList51, intList58, (java.lang.Integer) 100, (int) '4');
        fuzzTest20.FuzzTest_insertElementAt(intList49, intList58, (java.lang.Integer) (-1), (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList19, intList49, (java.lang.Integer) 10, (int) (short) 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList8, (java.lang.Integer) 100, (int) '4');
        buggycodes.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList22 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList28 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest14.FuzzTest_insertElementAt(intList22, intList28, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList42 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList48 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest34.FuzzTest_insertElementAt(intList42, intList48, (java.lang.Integer) 2, 0);
        fuzzTest14.FuzzTest_insertElementAt(intList33, intList48, (java.lang.Integer) 10, (int) '4');
        fuzzTest0.FuzzTest_insertElementAt(intList13, intList33, (java.lang.Integer) 10, (int) ' ');
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList62 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        buggycodes.mut_000.Vector<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList62, intList64, (java.lang.Integer) 10, 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList19 = null;
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList24 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest0.FuzzTest_insertElementAt(intList19, intList24, (java.lang.Integer) 100, 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList37 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList43 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest29.FuzzTest_insertElementAt(intList37, intList43, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList57 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList63 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest49.FuzzTest_insertElementAt(intList57, intList63, (java.lang.Integer) 2, 0);
        fuzzTest29.FuzzTest_insertElementAt(intList48, intList63, (java.lang.Integer) 10, (int) '4');
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList80 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList86 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest72.FuzzTest_insertElementAt(intList80, intList86, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList91 = null;
        fuzzTest71.FuzzTest_insertElementAt(intList86, intList91, (java.lang.Integer) 0, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList48, intList86, (java.lang.Integer) 10, (int) '#');
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList2, (java.lang.Integer) 100, (int) (byte) -1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList6 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList7 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList6, intList7, (java.lang.Integer) 10, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList21 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList27 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest13.FuzzTest_insertElementAt(intList21, intList27, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList32 = null;
        fuzzTest12.FuzzTest_insertElementAt(intList27, intList32, (java.lang.Integer) 0, 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList44 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList50 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest36.FuzzTest_insertElementAt(intList44, intList50, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList64 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList70 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest56.FuzzTest_insertElementAt(intList64, intList70, (java.lang.Integer) 2, 0);
        fuzzTest36.FuzzTest_insertElementAt(intList55, intList70, (java.lang.Integer) 10, (int) '4');
        fuzzTest11.FuzzTest_insertElementAt(intList32, intList55, (java.lang.Integer) (-1), (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList82 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList83 = null;
        fuzzTest81.FuzzTest_insertElementAt(intList82, intList83, (java.lang.Integer) 100, (int) (byte) -1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList87 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.Vector<java.lang.Integer> intList88 = null;
        fuzzTest81.FuzzTest_insertElementAt(intList87, intList88, (java.lang.Integer) 10, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList55, intList87, (java.lang.Integer) 10, 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList8, (java.lang.Integer) 100, (int) '4');
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-1), 10, 10, 1, 2, 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList20 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList23 = null;
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList30 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest22.FuzzTest_insertElementAt(intList23, intList30, (java.lang.Integer) 100, (int) '4');
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList43 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList49 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest35.FuzzTest_insertElementAt(intList43, intList49, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList54 = null;
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 0, 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList59 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest35.FuzzTest_insertElementAt(intList54, intList59, (java.lang.Integer) 100, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList64 = null;
        fuzzTest22.FuzzTest_insertElementAt(intList59, intList64, (java.lang.Integer) 100, (int) (short) 100);
        fuzzTest0.FuzzTest_insertElementAt(intList20, intList64, (java.lang.Integer) 1, (int) (short) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList71 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList72 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList71, intList72, (java.lang.Integer) 10, (int) (short) 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList76 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList77 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList76, intList77, (java.lang.Integer) (-1), (int) (short) 10);
        buggycodes.mut_000.Vector<java.lang.Integer> intList81 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList82 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList81, intList82, (java.lang.Integer) 0, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.Vector<java.lang.Integer> intList87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList86, intList87, (java.lang.Integer) 0, 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList2, (java.lang.Integer) 100, (int) (byte) -1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList6 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList7 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList6, intList7, (java.lang.Integer) 100, 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList19 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList25 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest11.FuzzTest_insertElementAt(intList19, intList25, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList30 = null;
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest11.FuzzTest_insertElementAt(intList30, intList35, (java.lang.Integer) 100, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList40 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList41 = null;
        fuzzTest11.FuzzTest_insertElementAt(intList40, intList41, (java.lang.Integer) 2, (int) (byte) 1);
        buggycodes.mut_000.Vector<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList54 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList60 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest46.FuzzTest_insertElementAt(intList54, intList60, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList65 = null;
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList75 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList81 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest67.FuzzTest_insertElementAt(intList75, intList81, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList86 = null;
        fuzzTest66.FuzzTest_insertElementAt(intList81, intList86, (java.lang.Integer) 0, 0);
        fuzzTest46.FuzzTest_insertElementAt(intList65, intList81, (java.lang.Integer) 2, (int) (short) -1);
        fuzzTest11.FuzzTest_insertElementAt(intList45, intList65, (java.lang.Integer) (-1), (int) '#');
        buggycodes.mut_000.Vector<java.lang.Integer> intList96 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList45, intList96, (java.lang.Integer) 0, (int) (byte) 10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList8, (java.lang.Integer) 100, (int) '4');
        buggycodes.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList22 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList28 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest14.FuzzTest_insertElementAt(intList22, intList28, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList13, intList28, (java.lang.Integer) (-1), (int) ' ');
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList38 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList48 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList54 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest40.FuzzTest_insertElementAt(intList48, intList54, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList59 = null;
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 0, 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList64 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest40.FuzzTest_insertElementAt(intList59, intList64, (java.lang.Integer) 100, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList71 = null;
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList78 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest70.FuzzTest_insertElementAt(intList71, intList78, (java.lang.Integer) 100, (int) '4');
        fuzzTest40.FuzzTest_insertElementAt(intList69, intList78, (java.lang.Integer) (-1), (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList38, intList69, (java.lang.Integer) 0, 1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList8 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList14 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList19 = null;
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList24 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest0.FuzzTest_insertElementAt(intList19, intList24, (java.lang.Integer) 100, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList29 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList29, intList30, (java.lang.Integer) 1, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggycodes.mut_000.Vector<java.lang.Integer> intList35 = null;
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList42 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest34.FuzzTest_insertElementAt(intList35, intList42, (java.lang.Integer) 100, (int) '4');
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList55 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 2, 1, 100 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList61 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest47.FuzzTest_insertElementAt(intList55, intList61, (java.lang.Integer) 2, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList66 = null;
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 0, 10 };
        buggycodes.mut_000.Vector<java.lang.Integer> intList71 = new buggycodes.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest47.FuzzTest_insertElementAt(intList66, intList71, (java.lang.Integer) 100, 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList76 = null;
        fuzzTest34.FuzzTest_insertElementAt(intList71, intList76, (java.lang.Integer) 100, (int) (short) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList80 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList81 = null;
        fuzzTest34.FuzzTest_insertElementAt(intList80, intList81, (java.lang.Integer) (-1), (int) (byte) 10);
        buggycodes.mut_000.Vector<java.lang.Integer> intList85 = null;
        buggycodes.mut_000.Vector<java.lang.Integer> intList86 = null;
        fuzzTest34.FuzzTest_insertElementAt(intList85, intList86, (java.lang.Integer) 1, (int) (short) 0);
        buggycodes.mut_000.Vector<java.lang.Integer> intList90 = fuzztests.FuzzTest.makeFuzzInput();
        buggycodes.mut_000.Vector<java.lang.Integer> intList91 = null;
        fuzzTest34.FuzzTest_insertElementAt(intList90, intList91, (java.lang.Integer) (-1), (int) (short) 100);
        buggycodes.mut_000.Vector<java.lang.Integer> intList95 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList90, intList95, (java.lang.Integer) 1, (int) (byte) 0);
    }
}

