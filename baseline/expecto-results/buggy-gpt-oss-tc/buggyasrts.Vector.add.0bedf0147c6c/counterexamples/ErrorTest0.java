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
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList3, intList7, (-1), (java.lang.Integer) 1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzzTest8.FuzzTest_add(intList11, intList13, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_add(intList20, intList22, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_add(intList29, intList31, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest35.FuzzTest_add(intList38, intList40, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest17.FuzzTest_add(intList29, intList40, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest8.FuzzTest_add(intList40, intList50, (int) '4', (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_add(intList6, intList40, (int) (short) 100, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = null;
        fuzzTest58.FuzzTest_add(intList61, intList63, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList61, intList69, (-1), (java.lang.Integer) 1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 100, (-1), 1, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = null;
        fuzzTest0.FuzzTest_add(intList15, intList17, 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = null;
        fuzzTest21.FuzzTest_add(intList24, intList26, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 1, (-1), (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = null;
        fuzzTest21.FuzzTest_add(intList35, intList37, (int) (byte) 0, (java.lang.Integer) 0);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest0.FuzzTest_add(intList37, intList44, (int) (byte) 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest0.FuzzTest_add(intList49, intList50, (int) '4', (java.lang.Integer) 100);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = null;
        fuzzTest58.FuzzTest_add(intList61, intList63, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-1), 100, (-1), 1, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = null;
        fuzzTest58.FuzzTest_add(intList73, intList75, 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList56, intList73, (int) (byte) -1, (java.lang.Integer) 100);
    }
}

