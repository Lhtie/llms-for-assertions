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
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue3 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue7 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue13 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue13, intArray12);
        fuzzTest0.FuzzTest_clone(intQueue3, intQueue7, intQueue13);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, (-1), 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue21 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue26 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue30 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue36 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        fuzzTest23.FuzzTest_clone(intQueue26, intQueue30, intQueue36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue42 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue46 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue52 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        fuzzTest39.FuzzTest_clone(intQueue42, intQueue46, intQueue52);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue58 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue62 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue68 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        fuzzTest55.FuzzTest_clone(intQueue58, intQueue62, intQueue68);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue74 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue78 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue84 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue84, intArray83);
        fuzzTest71.FuzzTest_clone(intQueue74, intQueue78, intQueue84);
        fuzzTest23.FuzzTest_clone(intQueue52, intQueue62, intQueue78);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { (-1), 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue91 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue91, intArray90);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intQueue21, intQueue62, intQueue91);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue4 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue8 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue14 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest1.FuzzTest_clone(intQueue4, intQueue8, intQueue14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue20 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue24 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue30 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        fuzzTest17.FuzzTest_clone(intQueue20, intQueue24, intQueue30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue36 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue40 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue46 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        fuzzTest33.FuzzTest_clone(intQueue36, intQueue40, intQueue46);
        fuzzTest0.FuzzTest_clone(intQueue4, intQueue20, intQueue40);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue53 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue57 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue63 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzzTest50.FuzzTest_clone(intQueue53, intQueue57, intQueue63);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100, 0, 100, 100, 1 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue72 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10, 1 };
        buggyasrts.mut_000.ArrayDeque<java.lang.Integer> intQueue77 = new buggyasrts.mut_000.ArrayDeque<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intQueue53, intQueue72, intQueue77);
    }
}

