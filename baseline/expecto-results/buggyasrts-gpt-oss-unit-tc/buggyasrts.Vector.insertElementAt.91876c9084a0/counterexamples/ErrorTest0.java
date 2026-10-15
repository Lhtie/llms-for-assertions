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
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest20.FuzzTest_insertElementAt(intList28, intList34, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList19, intList34, (java.lang.Integer) 10, (int) '4');
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest42.FuzzTest_insertElementAt(intList50, intList56, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
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
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_insertElementAt(intList10, intList16, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest22.FuzzTest_insertElementAt(intList30, intList36, (java.lang.Integer) 2, 0);
        fuzzTest2.FuzzTest_insertElementAt(intList21, intList36, (java.lang.Integer) 10, (int) '4');
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest44.FuzzTest_insertElementAt(intList52, intList58, (java.lang.Integer) 2, 0);
        fuzzTest1.FuzzTest_insertElementAt(intList21, intList58, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList21, intList66, (java.lang.Integer) 2, (int) (byte) -1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_insertElementAt(intList9, intList15, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_insertElementAt(intList29, intList35, (java.lang.Integer) 2, 0);
        fuzzTest1.FuzzTest_insertElementAt(intList20, intList35, (java.lang.Integer) 10, (int) '4');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest43.FuzzTest_insertElementAt(intList51, intList57, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest63.FuzzTest_insertElementAt(intList71, intList77, (java.lang.Integer) 2, 0);
        fuzzTest43.FuzzTest_insertElementAt(intList62, intList77, (java.lang.Integer) 10, (int) '4');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList20, intList77, (java.lang.Integer) 1, (-1));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest19.FuzzTest_insertElementAt(intList27, intList33, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest38.FuzzTest_insertElementAt(intList46, intList52, (java.lang.Integer) 2, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList33, intList52, (java.lang.Integer) 0, (int) (byte) -1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_insertElementAt(intList9, intList15, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_insertElementAt(intList15, intList20, (java.lang.Integer) 10, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest24.FuzzTest_insertElementAt(intList32, intList38, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest43.FuzzTest_insertElementAt(intList51, intList57, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest62.FuzzTest_insertElementAt(intList70, intList76, (java.lang.Integer) 2, 0);
        fuzzTest24.FuzzTest_insertElementAt(intList51, intList76, (java.lang.Integer) 100, (int) (byte) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList51, intList84, (java.lang.Integer) (-1), (int) ' ');
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100, 10, 1, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest27.FuzzTest_insertElementAt(intList35, intList41, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_insertElementAt(intList41, intList46, (java.lang.Integer) 10, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList24, intList41, (java.lang.Integer) 0, (int) (short) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_insertElementAt(intList29, intList35, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_insertElementAt(intList35, intList40, (java.lang.Integer) 10, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest44.FuzzTest_insertElementAt(intList52, intList58, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest63.FuzzTest_insertElementAt(intList71, intList77, (java.lang.Integer) 2, 0);
        fuzzTest20.FuzzTest_insertElementAt(intList58, intList77, (java.lang.Integer) 100, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList19, intList77, (java.lang.Integer) 100, (int) (short) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest3.FuzzTest_insertElementAt(intList11, intList17, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest23.FuzzTest_insertElementAt(intList31, intList37, (java.lang.Integer) 2, 0);
        fuzzTest3.FuzzTest_insertElementAt(intList22, intList37, (java.lang.Integer) 10, (int) '4');
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest45.FuzzTest_insertElementAt(intList53, intList59, (java.lang.Integer) 2, 0);
        fuzzTest2.FuzzTest_insertElementAt(intList22, intList59, (java.lang.Integer) 0, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList59, (java.lang.Integer) 100, (int) (short) 1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest20.FuzzTest_insertElementAt(intList28, intList34, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList19, intList34, (java.lang.Integer) 10, (int) '4');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_insertElementAt(intList42, intList43, (java.lang.Integer) 0, (int) ' ');
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest49.FuzzTest_insertElementAt(intList57, intList63, (java.lang.Integer) 2, 0);
        fuzzTest47.FuzzTest_insertElementAt(intList48, intList57, (java.lang.Integer) 1, (int) (byte) -1);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 2, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList57, intList74, (java.lang.Integer) 0, (int) (byte) -1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_insertElementAt(intList9, intList15, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_insertElementAt(intList15, intList20, (java.lang.Integer) 10, (int) (short) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest25.FuzzTest_insertElementAt(intList33, intList39, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest45.FuzzTest_insertElementAt(intList53, intList59, (java.lang.Integer) 2, 0);
        fuzzTest25.FuzzTest_insertElementAt(intList44, intList59, (java.lang.Integer) 10, (int) '4');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_insertElementAt(intList67, intList68, (java.lang.Integer) 0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList24, intList67, (java.lang.Integer) 100, 2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_insertElementAt(intList10, intList16, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList10, (java.lang.Integer) 1, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest25.FuzzTest_insertElementAt(intList33, intList39, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList24, intList39, (java.lang.Integer) 2, (int) (byte) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_insertElementAt(intList47, intList48, (java.lang.Integer) 10, (int) (short) 100);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 100, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest59.FuzzTest_insertElementAt(intList67, intList73, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_insertElementAt(intList73, intList78, (java.lang.Integer) 10, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList56, intList78, (java.lang.Integer) 0, (int) (short) 1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_insertElementAt(intList10, intList16, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList10, (java.lang.Integer) 1, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest25.FuzzTest_insertElementAt(intList33, intList39, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList24, intList39, (java.lang.Integer) 2, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest48.FuzzTest_insertElementAt(intList56, intList62, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_insertElementAt(intList62, intList67, (java.lang.Integer) 10, (int) (short) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList62, intList71, (java.lang.Integer) 100, (int) (short) 1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest19.FuzzTest_insertElementAt(intList27, intList33, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest38.FuzzTest_insertElementAt(intList46, intList52, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest58.FuzzTest_insertElementAt(intList66, intList72, (java.lang.Integer) 2, 0);
        fuzzTest38.FuzzTest_insertElementAt(intList57, intList72, (java.lang.Integer) 10, (int) '4');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_insertElementAt(intList80, intList81, (java.lang.Integer) 0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList27, intList81, (java.lang.Integer) 2, (int) (short) 1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 2, 100, 2, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList26, intList28, (java.lang.Integer) 0, (int) (byte) 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList2, (java.lang.Integer) 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest7.FuzzTest_insertElementAt(intList15, intList21, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_insertElementAt(intList21, intList26, (java.lang.Integer) 10, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest30.FuzzTest_insertElementAt(intList38, intList44, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest50.FuzzTest_insertElementAt(intList58, intList64, (java.lang.Integer) 2, 0);
        fuzzTest30.FuzzTest_insertElementAt(intList49, intList64, (java.lang.Integer) 10, (int) '4');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList26, intList64, (java.lang.Integer) 0, (-1));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest19.FuzzTest_insertElementAt(intList27, intList33, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest40.FuzzTest_insertElementAt(intList48, intList54, (java.lang.Integer) 2, 0);
        fuzzTest38.FuzzTest_insertElementAt(intList39, intList48, (java.lang.Integer) 1, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest63.FuzzTest_insertElementAt(intList71, intList77, (java.lang.Integer) 2, 0);
        fuzzTest38.FuzzTest_insertElementAt(intList62, intList77, (java.lang.Integer) 2, (int) (byte) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_insertElementAt(intList85, intList86, (java.lang.Integer) 10, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList33, intList85, (java.lang.Integer) 10, 2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_insertElementAt(intList10, intList16, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList10, (java.lang.Integer) 1, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest26.FuzzTest_insertElementAt(intList34, intList40, (java.lang.Integer) 2, 0);
        fuzzTest24.FuzzTest_insertElementAt(intList25, intList34, (java.lang.Integer) 1, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest49.FuzzTest_insertElementAt(intList57, intList63, (java.lang.Integer) 2, 0);
        fuzzTest24.FuzzTest_insertElementAt(intList48, intList63, (java.lang.Integer) 2, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest72.FuzzTest_insertElementAt(intList80, intList86, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList91 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_insertElementAt(intList86, intList91, (java.lang.Integer) 10, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList48, intList91, (java.lang.Integer) 2, (int) (byte) 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList2, (java.lang.Integer) 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest7.FuzzTest_insertElementAt(intList15, intList21, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_insertElementAt(intList21, intList26, (java.lang.Integer) 10, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest30.FuzzTest_insertElementAt(intList38, intList44, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest50.FuzzTest_insertElementAt(intList58, intList64, (java.lang.Integer) 2, 0);
        fuzzTest30.FuzzTest_insertElementAt(intList49, intList64, (java.lang.Integer) 10, (int) '4');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_insertElementAt(intList72, intList73, (java.lang.Integer) 0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList26, intList73, (java.lang.Integer) 100, 2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_insertElementAt(intList10, intList16, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList10, (java.lang.Integer) 1, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest25.FuzzTest_insertElementAt(intList33, intList39, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList24, intList39, (java.lang.Integer) 2, (int) (byte) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_insertElementAt(intList47, intList48, (java.lang.Integer) 10, (int) (short) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest53.FuzzTest_insertElementAt(intList61, intList67, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest73.FuzzTest_insertElementAt(intList81, intList87, (java.lang.Integer) 2, 0);
        fuzzTest53.FuzzTest_insertElementAt(intList72, intList87, (java.lang.Integer) 10, (int) '4');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList52, intList72, (java.lang.Integer) (-1), (-1));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = null;
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest5.FuzzTest_insertElementAt(intList13, intList19, (java.lang.Integer) 2, 0);
        fuzzTest3.FuzzTest_insertElementAt(intList4, intList13, (java.lang.Integer) 1, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest28.FuzzTest_insertElementAt(intList36, intList42, (java.lang.Integer) 2, 0);
        fuzzTest3.FuzzTest_insertElementAt(intList27, intList42, (java.lang.Integer) 2, (int) (byte) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_insertElementAt(intList50, intList51, (java.lang.Integer) 10, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest55.FuzzTest_insertElementAt(intList63, intList69, (java.lang.Integer) 2, 0);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 1, 0, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest3.FuzzTest_insertElementAt(intList63, intList79, (java.lang.Integer) 100, (int) (byte) 10);
        fuzzTest1.FuzzTest_insertElementAt(intList2, intList63, (java.lang.Integer) 10, 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList63, intList87, (java.lang.Integer) 0, (-1));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest19.FuzzTest_insertElementAt(intList27, intList33, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest38.FuzzTest_insertElementAt(intList46, intList52, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest58.FuzzTest_insertElementAt(intList66, intList72, (java.lang.Integer) 2, 0);
        fuzzTest38.FuzzTest_insertElementAt(intList57, intList72, (java.lang.Integer) 10, (int) '4');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_insertElementAt(intList80, intList81, (java.lang.Integer) 0, (int) ' ');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_insertElementAt(intList85, intList86, (java.lang.Integer) 10, (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList33, intList86, (java.lang.Integer) (-1), 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList2, (java.lang.Integer) 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest6.FuzzTest_insertElementAt(intList14, intList20, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest26.FuzzTest_insertElementAt(intList34, intList40, (java.lang.Integer) 2, 0);
        fuzzTest6.FuzzTest_insertElementAt(intList25, intList40, (java.lang.Integer) 10, (int) '4');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList25, intList48, (java.lang.Integer) 1, (int) (byte) 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = null;
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest5.FuzzTest_insertElementAt(intList13, intList19, (java.lang.Integer) 2, 0);
        fuzzTest3.FuzzTest_insertElementAt(intList4, intList13, (java.lang.Integer) 1, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest28.FuzzTest_insertElementAt(intList36, intList42, (java.lang.Integer) 2, 0);
        fuzzTest3.FuzzTest_insertElementAt(intList27, intList42, (java.lang.Integer) 2, (int) (byte) 100);
        fuzzTest1.FuzzTest_insertElementAt(intList2, intList42, (java.lang.Integer) 0, (int) (byte) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList42, intList53, (java.lang.Integer) 100, (int) '4');
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, 100, 0, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest68.FuzzTest_insertElementAt(intList76, intList82, (java.lang.Integer) 2, 0);
        fuzzTest66.FuzzTest_insertElementAt(intList67, intList76, (java.lang.Integer) 1, (int) (byte) -1);
        fuzzTest57.FuzzTest_insertElementAt(intList64, intList76, (java.lang.Integer) 1, (int) (short) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList93 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList76, intList93, (java.lang.Integer) 10, (int) (byte) 1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest4.FuzzTest_insertElementAt(intList12, intList18, (java.lang.Integer) 2, 0);
        fuzzTest2.FuzzTest_insertElementAt(intList3, intList12, (java.lang.Integer) 1, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest27.FuzzTest_insertElementAt(intList35, intList41, (java.lang.Integer) 2, 0);
        fuzzTest2.FuzzTest_insertElementAt(intList26, intList41, (java.lang.Integer) 2, (int) (byte) 100);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList41, (java.lang.Integer) 0, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest52.FuzzTest_insertElementAt(intList60, intList66, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList66, intList71, (java.lang.Integer) 100, (int) (byte) 10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzzTest6.FuzzTest_insertElementAt(intList7, intList8, (java.lang.Integer) 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest15.FuzzTest_insertElementAt(intList23, intList29, (java.lang.Integer) 2, 0);
        fuzzTest13.FuzzTest_insertElementAt(intList14, intList23, (java.lang.Integer) 1, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = null;
        fuzzTest13.FuzzTest_insertElementAt(intList37, intList38, (java.lang.Integer) 1, 100);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest42.FuzzTest_insertElementAt(intList50, intList56, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = null;
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest63.FuzzTest_insertElementAt(intList71, intList77, (java.lang.Integer) 2, 0);
        fuzzTest61.FuzzTest_insertElementAt(intList62, intList71, (java.lang.Integer) 1, (int) (byte) -1);
        fuzzTest13.FuzzTest_insertElementAt(intList56, intList71, (java.lang.Integer) 0, 2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList88 = null;
        fuzzTest12.FuzzTest_insertElementAt(intList71, intList88, (java.lang.Integer) 1, (-1));
        buggyasrts.mut_000.Vector<java.lang.Integer> intList92 = null;
        fuzzTest6.FuzzTest_insertElementAt(intList71, intList92, (java.lang.Integer) 1, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList4, intList71, (java.lang.Integer) 2, (int) (byte) 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_insertElementAt(intList10, intList16, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList10, (java.lang.Integer) 1, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList24, intList25, (java.lang.Integer) 1, 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList29, intList30, (java.lang.Integer) 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest34.FuzzTest_insertElementAt(intList42, intList48, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 100, 0, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest64.FuzzTest_insertElementAt(intList72, intList78, (java.lang.Integer) 2, 0);
        fuzzTest62.FuzzTest_insertElementAt(intList63, intList72, (java.lang.Integer) 1, (int) (byte) -1);
        fuzzTest53.FuzzTest_insertElementAt(intList60, intList72, (java.lang.Integer) 1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList42, intList60, (java.lang.Integer) 0, (int) (byte) -1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 2, 1, 0, 2, 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest11.FuzzTest_insertElementAt(intList19, intList25, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_insertElementAt(intList25, intList30, (java.lang.Integer) 10, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest34.FuzzTest_insertElementAt(intList42, intList48, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest53.FuzzTest_insertElementAt(intList61, intList67, (java.lang.Integer) 2, 0);
        fuzzTest10.FuzzTest_insertElementAt(intList48, intList67, (java.lang.Integer) 100, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList67, (java.lang.Integer) 10, (int) (byte) 1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_insertElementAt(intList9, intList15, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_insertElementAt(intList15, intList20, (java.lang.Integer) 10, (int) (short) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest27.FuzzTest_insertElementAt(intList35, intList41, (java.lang.Integer) 2, 0);
        fuzzTest25.FuzzTest_insertElementAt(intList26, intList35, (java.lang.Integer) 1, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest50.FuzzTest_insertElementAt(intList58, intList64, (java.lang.Integer) 2, 0);
        fuzzTest25.FuzzTest_insertElementAt(intList49, intList64, (java.lang.Integer) 2, (int) (byte) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_insertElementAt(intList72, intList73, (java.lang.Integer) 10, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList24, intList73, (java.lang.Integer) 10, 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzzTest1.FuzzTest_insertElementAt(intList2, intList3, (java.lang.Integer) 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest8.FuzzTest_insertElementAt(intList16, intList22, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_insertElementAt(intList22, intList27, (java.lang.Integer) 10, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest31.FuzzTest_insertElementAt(intList39, intList45, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest50.FuzzTest_insertElementAt(intList58, intList64, (java.lang.Integer) 2, 0);
        fuzzTest7.FuzzTest_insertElementAt(intList45, intList64, (java.lang.Integer) 100, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest72.FuzzTest_insertElementAt(intList80, intList86, (java.lang.Integer) 2, 0);
        fuzzTest1.FuzzTest_insertElementAt(intList45, intList86, (java.lang.Integer) (-1), (int) (short) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList94 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList86, intList94, (java.lang.Integer) 10, (int) (short) 1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_insertElementAt(intList9, intList15, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_insertElementAt(intList15, intList20, (java.lang.Integer) 10, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest24.FuzzTest_insertElementAt(intList32, intList38, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest44.FuzzTest_insertElementAt(intList52, intList58, (java.lang.Integer) 2, 0);
        fuzzTest24.FuzzTest_insertElementAt(intList43, intList58, (java.lang.Integer) 10, (int) '4');
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest67.FuzzTest_insertElementAt(intList75, intList81, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_insertElementAt(intList81, intList86, (java.lang.Integer) 10, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList43, intList86, (java.lang.Integer) 100, (int) ' ');
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = null;
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = null;
        fuzzTest4.FuzzTest_insertElementAt(intList5, intList6, (java.lang.Integer) 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest10.FuzzTest_insertElementAt(intList18, intList24, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest31.FuzzTest_insertElementAt(intList39, intList45, (java.lang.Integer) 2, 0);
        fuzzTest29.FuzzTest_insertElementAt(intList30, intList39, (java.lang.Integer) 1, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest54.FuzzTest_insertElementAt(intList62, intList68, (java.lang.Integer) 2, 0);
        fuzzTest29.FuzzTest_insertElementAt(intList53, intList68, (java.lang.Integer) 2, (int) (byte) 100);
        fuzzTest4.FuzzTest_insertElementAt(intList24, intList68, (java.lang.Integer) 1, (int) (short) 0);
        fuzzTest2.FuzzTest_insertElementAt(intList3, intList24, (java.lang.Integer) 0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList24, (java.lang.Integer) 2, (int) (byte) 10);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_insertElementAt(intList9, intList15, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_insertElementAt(intList29, intList35, (java.lang.Integer) 2, 0);
        fuzzTest1.FuzzTest_insertElementAt(intList20, intList35, (java.lang.Integer) 10, (int) '4');
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest44.FuzzTest_insertElementAt(intList52, intList58, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = null;
        fuzzTest43.FuzzTest_insertElementAt(intList52, intList63, (java.lang.Integer) 0, 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList35, intList52, (java.lang.Integer) 10, (int) '#');
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 100, 100, 1, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest31.FuzzTest_insertElementAt(intList39, intList45, (java.lang.Integer) 2, 0);
        fuzzTest29.FuzzTest_insertElementAt(intList30, intList39, (java.lang.Integer) 1, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest54.FuzzTest_insertElementAt(intList62, intList68, (java.lang.Integer) 2, 0);
        fuzzTest29.FuzzTest_insertElementAt(intList53, intList68, (java.lang.Integer) 2, (int) (byte) 100);
        fuzzTest27.FuzzTest_insertElementAt(intList28, intList68, (java.lang.Integer) 0, (int) (byte) 100);
        fuzzTest0.FuzzTest_insertElementAt(intList25, intList28, (java.lang.Integer) 1, (int) (short) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_insertElementAt(intList82, intList83, (java.lang.Integer) 100, (int) ' ');
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 0, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList90, intList92, (java.lang.Integer) 10, 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_insertElementAt(intList10, intList16, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_insertElementAt(intList16, intList21, (java.lang.Integer) 10, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest25.FuzzTest_insertElementAt(intList33, intList39, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest44.FuzzTest_insertElementAt(intList52, intList58, (java.lang.Integer) 2, 0);
        fuzzTest1.FuzzTest_insertElementAt(intList39, intList58, (java.lang.Integer) 100, (int) (byte) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList39, intList66, (java.lang.Integer) 1, (int) (short) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, 2, 100, 1, (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest0.FuzzTest_insertElementAt(intList70, intList78, (java.lang.Integer) 100, (int) (short) 1);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 1, 2, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList89 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList87, intList89, (java.lang.Integer) 1, (int) (short) -1);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_insertElementAt(intList9, intList15, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_insertElementAt(intList29, intList35, (java.lang.Integer) 2, 0);
        fuzzTest1.FuzzTest_insertElementAt(intList20, intList35, (java.lang.Integer) 10, (int) '4');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_insertElementAt(intList43, intList44, (java.lang.Integer) 0, (int) ' ');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_insertElementAt(intList48, intList49, (java.lang.Integer) 10, (-1));
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest54.FuzzTest_insertElementAt(intList62, intList68, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_insertElementAt(intList68, intList73, (java.lang.Integer) 10, (int) (short) 100);
        fuzzTest0.FuzzTest_insertElementAt(intList48, intList73, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList80, intList81, (java.lang.Integer) 0, (-1));
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 1, (-1), 10, 0, 100, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList92 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList94 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList92, intList94, (java.lang.Integer) (-1), (int) (short) 10);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_insertElementAt(intList10, intList16, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList10, (java.lang.Integer) 1, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest25.FuzzTest_insertElementAt(intList33, intList39, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList24, intList39, (java.lang.Integer) 2, (int) (byte) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_insertElementAt(intList47, intList48, (java.lang.Integer) 10, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest52.FuzzTest_insertElementAt(intList60, intList66, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest72.FuzzTest_insertElementAt(intList80, intList86, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList91 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_insertElementAt(intList86, intList91, (java.lang.Integer) 10, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList66, intList91, (java.lang.Integer) 100, 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_insertElementAt(intList9, intList15, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest20.FuzzTest_insertElementAt(intList28, intList34, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest39.FuzzTest_insertElementAt(intList47, intList53, (java.lang.Integer) 2, 0);
        fuzzTest1.FuzzTest_insertElementAt(intList28, intList53, (java.lang.Integer) 100, (int) (byte) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList53, intList61, (java.lang.Integer) 2, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest67.FuzzTest_insertElementAt(intList75, intList81, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = null;
        fuzzTest66.FuzzTest_insertElementAt(intList75, intList86, (java.lang.Integer) 0, 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList91 = null;
        fuzzTest66.FuzzTest_insertElementAt(intList90, intList91, (java.lang.Integer) (-1), 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList65, intList90, (java.lang.Integer) 2, (int) (byte) -1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_insertElementAt(intList9, intList15, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_insertElementAt(intList15, intList20, (java.lang.Integer) 10, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest24.FuzzTest_insertElementAt(intList32, intList38, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest43.FuzzTest_insertElementAt(intList51, intList57, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList38, intList57, (java.lang.Integer) 100, (int) (byte) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList65, intList66, (java.lang.Integer) 1, (int) '4');
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest70.FuzzTest_insertElementAt(intList78, intList84, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList89 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList84, intList89, (java.lang.Integer) (-1), 2);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList2, (java.lang.Integer) 0, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest6.FuzzTest_insertElementAt(intList14, intList20, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest25.FuzzTest_insertElementAt(intList33, intList39, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest44.FuzzTest_insertElementAt(intList52, intList58, (java.lang.Integer) 2, 0);
        fuzzTest6.FuzzTest_insertElementAt(intList33, intList58, (java.lang.Integer) 100, (int) (byte) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList33, intList66, (java.lang.Integer) 2, (int) (byte) 1);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_insertElementAt(intList10, intList16, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest22.FuzzTest_insertElementAt(intList30, intList36, (java.lang.Integer) 2, 0);
        fuzzTest2.FuzzTest_insertElementAt(intList21, intList36, (java.lang.Integer) 10, (int) '4');
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_insertElementAt(intList44, intList45, (java.lang.Integer) 0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList45, (java.lang.Integer) 2, (int) (byte) -1);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_insertElementAt(intList8, intList14, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest19.FuzzTest_insertElementAt(intList27, intList33, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest38.FuzzTest_insertElementAt(intList46, intList52, (java.lang.Integer) 2, 0);
        fuzzTest0.FuzzTest_insertElementAt(intList27, intList52, (java.lang.Integer) 100, (int) (byte) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest62.FuzzTest_insertElementAt(intList70, intList76, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_insertElementAt(intList76, intList81, (java.lang.Integer) 10, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList60, intList81, (java.lang.Integer) 10, (int) (byte) 1);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList2, (java.lang.Integer) 0, (int) (byte) 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest7.FuzzTest_insertElementAt(intList15, intList21, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest26.FuzzTest_insertElementAt(intList34, intList40, (java.lang.Integer) 2, 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest45.FuzzTest_insertElementAt(intList53, intList59, (java.lang.Integer) 2, 0);
        fuzzTest7.FuzzTest_insertElementAt(intList34, intList59, (java.lang.Integer) 100, (int) (byte) 10);
        fuzzTest0.FuzzTest_insertElementAt(intList6, intList34, (java.lang.Integer) 2, (int) (short) 10);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList73, intList75, (java.lang.Integer) 1, 10);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_insertElementAt(intList9, intList15, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList9, intList20, (java.lang.Integer) 0, 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList24, intList25, (java.lang.Integer) (-1), 2);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest30.FuzzTest_insertElementAt(intList38, intList44, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_insertElementAt(intList44, intList49, (java.lang.Integer) 10, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 100, 0, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest64.FuzzTest_insertElementAt(intList72, intList78, (java.lang.Integer) 2, 0);
        fuzzTest62.FuzzTest_insertElementAt(intList63, intList72, (java.lang.Integer) 1, (int) (byte) -1);
        fuzzTest53.FuzzTest_insertElementAt(intList60, intList72, (java.lang.Integer) 1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList44, intList60, (java.lang.Integer) 1, (int) ' ');
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest3.FuzzTest_insertElementAt(intList11, intList17, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_insertElementAt(intList17, intList22, (java.lang.Integer) 10, (int) (short) 100);
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList22, (java.lang.Integer) 10, (int) (short) 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList29, intList30, (java.lang.Integer) 2, (int) '#');
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest35.FuzzTest_insertElementAt(intList43, intList49, (java.lang.Integer) 2, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = null;
        fuzzTest34.FuzzTest_insertElementAt(intList43, intList54, (java.lang.Integer) 0, 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = null;
        fuzzTest34.FuzzTest_insertElementAt(intList58, intList59, (java.lang.Integer) (-1), 2);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10, 2, 100, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList58, intList68, (java.lang.Integer) 100, (int) (short) -1);
    }
}

