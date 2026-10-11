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
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList1, intList2, (java.lang.Integer) 10, 10);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0, 100, 1, (-1), (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList12, intList14, (java.lang.Integer) 100, (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList18, intList19, (java.lang.Integer) 100, (int) (short) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList23, intList24, (java.lang.Integer) 0, (int) '#');
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest28.FuzzTest_insertElementAt(intList29, intList30, (java.lang.Integer) 10, 10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = null;
        fuzzTest28.FuzzTest_insertElementAt(intList34, intList35, (java.lang.Integer) 0, 1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest39.FuzzTest_insertElementAt(intList42, intList46, (java.lang.Integer) 1, 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = null;
        fuzzTest28.FuzzTest_insertElementAt(intList42, intList51, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = null;
        fuzzTest0.FuzzTest_insertElementAt(intList42, intList55, (java.lang.Integer) (-1), 0);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest59.FuzzTest_insertElementAt(intList62, intList66, (java.lang.Integer) 1, 1);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest71.FuzzTest_insertElementAt(intList74, intList78, (java.lang.Integer) 1, 1);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest59.FuzzTest_insertElementAt(intList78, intList86, (java.lang.Integer) 1, (int) (byte) 100);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { (-1), 1, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList95 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList95, intArray94);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_insertElementAt(intList78, intList95, (java.lang.Integer) (-1), (int) (byte) 1);
    }
}

