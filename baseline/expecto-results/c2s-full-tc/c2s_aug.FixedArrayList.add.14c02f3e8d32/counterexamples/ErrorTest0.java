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
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection3 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection7, intArray6);
        fuzzTest0.FuzzTest_add(intCollection3, intCollection7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection15 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection19 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection19, intArray18);
        fuzzTest12.FuzzTest_add(intCollection15, intCollection19, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection27 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection31 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection31, intArray30);
        fuzzTest24.FuzzTest_add(intCollection27, intCollection31, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection39 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection39, intArray38);
        fuzzTest12.FuzzTest_add(intCollection31, intCollection39, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection47 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection51 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection51, intArray50);
        fuzzTest44.FuzzTest_add(intCollection47, intCollection51, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection60 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection64 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection64, intArray63);
        fuzzTest57.FuzzTest_add(intCollection60, intCollection64, (java.lang.Integer) 1, true);
        fuzzTest44.FuzzTest_add(intCollection56, intCollection64, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection75 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection79 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection79, intArray78);
        fuzzTest72.FuzzTest_add(intCollection75, intCollection79, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_add(intCollection64, intCollection75, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 0, 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection90 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection90, intArray89);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection64, intCollection90, (java.lang.Integer) 0, true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection3 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection7, intArray6);
        fuzzTest0.FuzzTest_add(intCollection3, intCollection7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection15 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection19 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection19, intArray18);
        fuzzTest12.FuzzTest_add(intCollection15, intCollection19, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection28 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection32 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection32, intArray31);
        fuzzTest25.FuzzTest_add(intCollection28, intCollection32, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection41 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection45 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection45, intArray44);
        fuzzTest38.FuzzTest_add(intCollection41, intCollection45, (java.lang.Integer) 1, true);
        fuzzTest25.FuzzTest_add(intCollection37, intCollection45, (java.lang.Integer) 1, false);
        fuzzTest12.FuzzTest_add(intCollection24, intCollection37, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection59 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection63 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection63, intArray62);
        fuzzTest56.FuzzTest_add(intCollection59, intCollection63, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection69 = null;
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection73 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection77 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection77, intArray76);
        fuzzTest70.FuzzTest_add(intCollection73, intCollection77, (java.lang.Integer) 1, true);
        fuzzTest68.FuzzTest_add(intCollection69, intCollection73, (java.lang.Integer) 10, true);
        fuzzTest12.FuzzTest_add(intCollection59, intCollection73, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 100, 10, 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection92 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection92, intArray91);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection59, intCollection92, (java.lang.Integer) 10, false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection3 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection7, intArray6);
        fuzzTest0.FuzzTest_add(intCollection3, intCollection7, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection16 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection20 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection20, intArray19);
        fuzzTest13.FuzzTest_add(intCollection16, intCollection20, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection29 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection33 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection33, intArray32);
        fuzzTest26.FuzzTest_add(intCollection29, intCollection33, (java.lang.Integer) 1, true);
        fuzzTest13.FuzzTest_add(intCollection25, intCollection33, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_add(intCollection12, intCollection25, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection47 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection52 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection56 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection56, intArray55);
        fuzzTest49.FuzzTest_add(intCollection52, intCollection56, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection64 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection68 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection68, intArray67);
        fuzzTest61.FuzzTest_add(intCollection64, intCollection68, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection76 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection76, intArray75);
        fuzzTest49.FuzzTest_add(intCollection68, intCollection76, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection47, intCollection76, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection4 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection8 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection8, intArray7);
        fuzzTest1.FuzzTest_add(intCollection4, intCollection8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection16 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection20 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection20, intArray19);
        fuzzTest13.FuzzTest_add(intCollection16, intCollection20, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection29 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection33 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection33, intArray32);
        fuzzTest26.FuzzTest_add(intCollection29, intCollection33, (java.lang.Integer) 1, true);
        fuzzTest13.FuzzTest_add(intCollection25, intCollection33, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection44 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection48 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection48, intArray47);
        fuzzTest41.FuzzTest_add(intCollection44, intCollection48, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection56 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection60 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection60, intArray59);
        fuzzTest53.FuzzTest_add(intCollection56, intCollection60, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection68 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection68, intArray67);
        fuzzTest41.FuzzTest_add(intCollection60, intCollection68, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intCollection33, intCollection60, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 0, 0 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection80 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection80, intArray79);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection60, intCollection80, (java.lang.Integer) 100, true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection3 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection7, intArray6);
        fuzzTest0.FuzzTest_add(intCollection3, intCollection7, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection16 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection20 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection20, intArray19);
        fuzzTest13.FuzzTest_add(intCollection16, intCollection20, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intCollection12, intCollection20, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection31 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection35 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection35, intArray34);
        fuzzTest28.FuzzTest_add(intCollection31, intCollection35, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection40 = null;
        fuzzTest0.FuzzTest_add(intCollection31, intCollection40, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection49 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection53 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection53, intArray52);
        fuzzTest46.FuzzTest_add(intCollection49, intCollection53, (java.lang.Integer) 1, true);
        fuzzTest44.FuzzTest_add(intCollection45, intCollection49, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection64 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection68 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection68, intArray67);
        fuzzTest61.FuzzTest_add(intCollection64, intCollection68, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection76 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection80 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection80, intArray79);
        fuzzTest73.FuzzTest_add(intCollection76, intCollection80, (java.lang.Integer) 1, true);
        fuzzTest44.FuzzTest_add(intCollection64, intCollection80, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 100, 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection91 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection91, intArray90);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection64, intCollection91, (java.lang.Integer) 10, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection3 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection7, intArray6);
        fuzzTest0.FuzzTest_add(intCollection3, intCollection7, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection15 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection15, intArray14);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection17 = null;
        fuzzTest0.FuzzTest_add(intCollection15, intCollection17, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection24 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection24, intArray23);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection28 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection28, intArray27);
        fuzzTest21.FuzzTest_add(intCollection24, intCollection28, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection36 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection40 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection40, intArray39);
        fuzzTest33.FuzzTest_add(intCollection36, intCollection40, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection28, intCollection40, (java.lang.Integer) 10, false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection5 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection9 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection9, intArray8);
        fuzzTest2.FuzzTest_add(intCollection5, intCollection9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intCollection1, intCollection5, (java.lang.Integer) 10, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection17 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection18 = null;
        fuzzTest0.FuzzTest_add(intCollection17, intCollection18, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection25 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection29 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection29, intArray28);
        fuzzTest22.FuzzTest_add(intCollection25, intCollection29, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection37 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection41 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection41, intArray40);
        fuzzTest34.FuzzTest_add(intCollection37, intCollection41, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection46 = null;
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection50 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection54 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection54, intArray53);
        fuzzTest47.FuzzTest_add(intCollection50, intCollection54, (java.lang.Integer) 1, true);
        fuzzTest34.FuzzTest_add(intCollection46, intCollection54, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection65 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection69 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection69, intArray68);
        fuzzTest62.FuzzTest_add(intCollection65, intCollection69, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection74 = null;
        fuzzTest34.FuzzTest_add(intCollection65, intCollection74, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection29, intCollection65, (java.lang.Integer) 100, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection3 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection7, intArray6);
        fuzzTest0.FuzzTest_add(intCollection3, intCollection7, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection16 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection20 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection20, intArray19);
        fuzzTest13.FuzzTest_add(intCollection16, intCollection20, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intCollection12, intCollection20, (java.lang.Integer) 1, false);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection32 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection36 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection36, intArray35);
        fuzzTest29.FuzzTest_add(intCollection32, intCollection36, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intCollection28, intCollection32, (java.lang.Integer) 0, false);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection44 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection45 = null;
        fuzzTest0.FuzzTest_add(intCollection44, intCollection45, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1) };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection51 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection54 = null;
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection58 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection62 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection62, intArray61);
        fuzzTest55.FuzzTest_add(intCollection58, intCollection62, (java.lang.Integer) 1, true);
        fuzzTest53.FuzzTest_add(intCollection54, intCollection58, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection73 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection77 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection77, intArray76);
        fuzzTest70.FuzzTest_add(intCollection73, intCollection77, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection82 = null;
        fuzzTest53.FuzzTest_add(intCollection77, intCollection82, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection51, intCollection77, (java.lang.Integer) 10, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection6 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection10 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection10, intArray9);
        fuzzTest3.FuzzTest_add(intCollection6, intCollection10, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intCollection2, intCollection6, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection21 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection25 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection25, intArray24);
        fuzzTest18.FuzzTest_add(intCollection21, intCollection25, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection33 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection37 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection37, intArray36);
        fuzzTest30.FuzzTest_add(intCollection33, intCollection37, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intCollection21, intCollection37, (java.lang.Integer) (-1), true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection45 = null;
        fuzzTest0.FuzzTest_add(intCollection37, intCollection45, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection52 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection56 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection56, intArray55);
        fuzzTest49.FuzzTest_add(intCollection52, intCollection56, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection61 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection62 = null;
        fuzzTest49.FuzzTest_add(intCollection61, intCollection62, (java.lang.Integer) 0, false);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection66 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection67 = null;
        fuzzTest49.FuzzTest_add(intCollection66, intCollection67, (java.lang.Integer) 100, false);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection71 = null;
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection75 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection79 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection79, intArray78);
        fuzzTest72.FuzzTest_add(intCollection75, intCollection79, (java.lang.Integer) 1, true);
        fuzzTest49.FuzzTest_add(intCollection71, intCollection75, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 100, 10, 0 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection91 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection91, intArray90);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection75, intCollection91, (java.lang.Integer) 10, true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection3 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection7, intArray6);
        fuzzTest0.FuzzTest_add(intCollection3, intCollection7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection15 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection19 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection19, intArray18);
        fuzzTest12.FuzzTest_add(intCollection15, intCollection19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection27 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection27, intArray26);
        fuzzTest0.FuzzTest_add(intCollection19, intCollection27, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection32 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection33 = null;
        fuzzTest0.FuzzTest_add(intCollection32, intCollection33, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection40 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection40, intArray39);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection44 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection44, intArray43);
        fuzzTest37.FuzzTest_add(intCollection40, intCollection44, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection52 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection56 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection56, intArray55);
        fuzzTest49.FuzzTest_add(intCollection52, intCollection56, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection64 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection68 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection68, intArray67);
        fuzzTest61.FuzzTest_add(intCollection64, intCollection68, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection76 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection76, intArray75);
        fuzzTest49.FuzzTest_add(intCollection68, intCollection76, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection40, intCollection68, (java.lang.Integer) 10, false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection3 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection7, intArray6);
        fuzzTest0.FuzzTest_add(intCollection3, intCollection7, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection15 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection15, intArray14);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection17 = null;
        fuzzTest0.FuzzTest_add(intCollection15, intCollection17, (java.lang.Integer) 100, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection21 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection22 = null;
        fuzzTest0.FuzzTest_add(intCollection21, intCollection22, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection28 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection28, intArray27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection33 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection37 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection37, intArray36);
        fuzzTest30.FuzzTest_add(intCollection33, intCollection37, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection47 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection51 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection51, intArray50);
        fuzzTest44.FuzzTest_add(intCollection47, intCollection51, (java.lang.Integer) 1, true);
        fuzzTest42.FuzzTest_add(intCollection43, intCollection47, (java.lang.Integer) 10, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection59 = null;
        fuzzTest30.FuzzTest_add(intCollection43, intCollection59, (java.lang.Integer) 0, true);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 1, 100, (-1), 1 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection69 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection69, intArray68);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection71 = null;
        fuzzTest30.FuzzTest_add(intCollection69, intCollection71, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 1, 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection79 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection79, intArray78);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection81 = null;
        fuzzTest30.FuzzTest_add(intCollection79, intCollection81, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection28, intCollection79, (java.lang.Integer) 1, true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection3 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection7, intArray6);
        fuzzTest0.FuzzTest_add(intCollection3, intCollection7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection15 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection19 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection19, intArray18);
        fuzzTest12.FuzzTest_add(intCollection15, intCollection19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection27 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection27, intArray26);
        fuzzTest0.FuzzTest_add(intCollection19, intCollection27, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection32 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection33 = null;
        fuzzTest0.FuzzTest_add(intCollection32, intCollection33, (java.lang.Integer) 100, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection37 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection38 = null;
        fuzzTest0.FuzzTest_add(intCollection37, intCollection38, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection44 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection44, intArray43);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection49 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection53 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection53, intArray52);
        fuzzTest46.FuzzTest_add(intCollection49, intCollection53, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1, 1 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection61 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection61, intArray60);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection63 = null;
        fuzzTest46.FuzzTest_add(intCollection61, intCollection63, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection44, intCollection61, (java.lang.Integer) 1, false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection5 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection9 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection9, intArray8);
        fuzzTest2.FuzzTest_add(intCollection5, intCollection9, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intCollection1, intCollection5, (java.lang.Integer) 10, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection21 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection25 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection25, intArray24);
        fuzzTest18.FuzzTest_add(intCollection21, intCollection25, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection34 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection38 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection38, intArray37);
        fuzzTest31.FuzzTest_add(intCollection34, intCollection38, (java.lang.Integer) 1, true);
        fuzzTest18.FuzzTest_add(intCollection30, intCollection38, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_add(intCollection17, intCollection38, (java.lang.Integer) 10, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection49 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection50 = null;
        fuzzTest0.FuzzTest_add(intCollection49, intCollection50, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection54 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection55 = null;
        fuzzTest0.FuzzTest_add(intCollection54, intCollection55, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10, 10, 0 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection63 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection63, intArray62);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection68 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection72 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection72, intArray71);
        fuzzTest65.FuzzTest_add(intCollection68, intCollection72, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection63, intCollection68, (java.lang.Integer) 100, false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection3 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection7 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection7, intArray6);
        fuzzTest0.FuzzTest_add(intCollection3, intCollection7, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection12 = null;
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection13 = null;
        fuzzTest0.FuzzTest_add(intCollection12, intCollection13, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection20 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection24 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection24, intArray23);
        fuzzTest17.FuzzTest_add(intCollection20, intCollection24, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1, 1 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection32 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection32, intArray31);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection34 = null;
        fuzzTest17.FuzzTest_add(intCollection32, intCollection34, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection41 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection45 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection45, intArray44);
        fuzzTest38.FuzzTest_add(intCollection41, intCollection45, (java.lang.Integer) 1, true);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection50 = null;
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection54 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection58 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection58, intArray57);
        fuzzTest51.FuzzTest_add(intCollection54, intCollection58, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, 1 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection66 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection66, intArray65);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection68 = null;
        fuzzTest51.FuzzTest_add(intCollection66, intCollection68, (java.lang.Integer) 100, true);
        fuzzTest38.FuzzTest_add(intCollection50, intCollection68, (java.lang.Integer) (-1), false);
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection75 = null;
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection79 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection79, intArray78);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10 };
        c2s_aug.FixedArrayList<java.lang.Integer> intCollection83 = new c2s_aug.FixedArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intCollection83, intArray82);
        fuzzTest76.FuzzTest_add(intCollection79, intCollection83, (java.lang.Integer) 1, true);
        fuzzTest38.FuzzTest_add(intCollection75, intCollection79, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intCollection32, intCollection79, (java.lang.Integer) 100, false);
    }
}

