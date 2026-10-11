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
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_clone(intList3, intList7, intList13);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, (-1), 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList26 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList30 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest23.FuzzTest_clone(intList26, intList30, intList36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList42 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest39.FuzzTest_clone(intList42, intList46, intList52);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList58 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList62 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList68 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest55.FuzzTest_clone(intList58, intList62, intList68);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList74 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList78 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList84 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest71.FuzzTest_clone(intList74, intList78, intList84);
        fuzzTest23.FuzzTest_clone(intList52, intList62, intList78);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { (-1), 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList91 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList21, intList62, intList91);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList4 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest1.FuzzTest_clone(intList4, intList8, intList14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList30 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest17.FuzzTest_clone(intList20, intList24, intList30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest33.FuzzTest_clone(intList36, intList40, intList46);
        fuzzTest0.FuzzTest_clone(intList4, intList20, intList40);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList53 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList63 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest50.FuzzTest_clone(intList53, intList57, intList63);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100, 0, 100, 100, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList77 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList53, intList72, intList77);
    }
}

