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
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, (-1), (-1), 100, 0 };
        c2s_aug.ArrayList<java.lang.Integer> intList7 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList13 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList17 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { (-1), 10 };
        java.lang.Integer[] intArray22 = new java.lang.Integer[] {};
        fuzzTest10.FuzzTest_toArray(intList13, intList17, intArray21, intArray22);
        c2s_aug.ArrayList<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList28 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList32 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { (-1), 10 };
        java.lang.Integer[] intArray37 = new java.lang.Integer[] {};
        fuzzTest25.FuzzTest_toArray(intList28, intList32, intArray36, intArray37);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList42 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList46 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 10 };
        java.lang.Integer[] intArray51 = new java.lang.Integer[] {};
        fuzzTest39.FuzzTest_toArray(intList42, intList46, intArray50, intArray51);
        fuzzTest9.FuzzTest_toArray(intList17, intList24, intArray37, intArray51);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList57 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList61 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { (-1), 10 };
        java.lang.Integer[] intArray66 = new java.lang.Integer[] {};
        fuzzTest54.FuzzTest_toArray(intList57, intList61, intArray65, intArray66);
        java.lang.Integer[] intArray68 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList7, intList17, intArray66, intArray68);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList3 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList7 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), 10 };
        java.lang.Integer[] intArray12 = new java.lang.Integer[] {};
        fuzzTest0.FuzzTest_toArray(intList3, intList7, intArray11, intArray12);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList17 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList21 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-1), 10 };
        java.lang.Integer[] intArray26 = new java.lang.Integer[] {};
        fuzzTest14.FuzzTest_toArray(intList17, intList21, intArray25, intArray26);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList31 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList35 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-1), 10 };
        java.lang.Integer[] intArray40 = new java.lang.Integer[] {};
        fuzzTest28.FuzzTest_toArray(intList31, intList35, intArray39, intArray40);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList45 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList49 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 10 };
        java.lang.Integer[] intArray54 = new java.lang.Integer[] {};
        fuzzTest42.FuzzTest_toArray(intList45, intList49, intArray53, intArray54);
        java.lang.Integer[] intArray56 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList21, intList31, intArray54, intArray56);
    }
}

