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
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addElement(intUnionFind14, intUnionFind15, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind15, intUnionFind20, (java.lang.Integer) 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addElement(intUnionFind14, intUnionFind15, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_addElement(intUnionFind23, intUnionFind24, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_addElement(intUnionFind15, intUnionFind23, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addElement(intUnionFind34, intUnionFind35, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_addElement(intUnionFind39, intUnionFind40, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind35, intUnionFind40, (java.lang.Integer) (-1));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addElement(intUnionFind12, intUnionFind13, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_addElement(intUnionFind21, intUnionFind22, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addElement(intUnionFind34, intUnionFind35, (java.lang.Integer) 0);
        fuzzTest11.FuzzTest_addElement(intUnionFind26, intUnionFind34, (java.lang.Integer) 10);
        fuzzTest5.FuzzTest_addElement(intUnionFind8, intUnionFind34, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind8, intUnionFind48, (java.lang.Integer) (-1));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind3, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_addElement(intUnionFind13, intUnionFind14, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_addElement(intUnionFind18, intUnionFind19, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_addElement(intUnionFind22, intUnionFind23, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_addElement(intUnionFind27, intUnionFind28, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_addElement(intUnionFind31, intUnionFind32, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_addElement(intUnionFind36, intUnionFind37, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_addElement(intUnionFind40, intUnionFind41, (java.lang.Integer) 0);
        fuzzTest17.FuzzTest_addElement(intUnionFind32, intUnionFind40, (java.lang.Integer) 10);
        fuzzTest11.FuzzTest_addElement(intUnionFind14, intUnionFind40, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_addElement(intUnionFind7, intUnionFind40, (java.lang.Integer) 1);
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind40, intUnionFind50, (java.lang.Integer) 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addElement(intUnionFind17, intUnionFind18, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_addElement(intUnionFind22, intUnionFind23, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_addElement(intUnionFind26, intUnionFind27, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_addElement(intUnionFind31, intUnionFind32, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_addElement(intUnionFind35, intUnionFind36, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addElement(intUnionFind40, intUnionFind41, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addElement(intUnionFind44, intUnionFind45, (java.lang.Integer) 0);
        fuzzTest21.FuzzTest_addElement(intUnionFind36, intUnionFind44, (java.lang.Integer) 10);
        fuzzTest15.FuzzTest_addElement(intUnionFind18, intUnionFind44, (java.lang.Integer) (-1));
        fuzzTest5.FuzzTest_addElement(intUnionFind11, intUnionFind44, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_addElement(intUnionFind55, intUnionFind56, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind44, intUnionFind56, (java.lang.Integer) 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addElement(intUnionFind12, intUnionFind13, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_addElement(intUnionFind21, intUnionFind22, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addElement(intUnionFind34, intUnionFind35, (java.lang.Integer) 0);
        fuzzTest11.FuzzTest_addElement(intUnionFind26, intUnionFind34, (java.lang.Integer) 10);
        fuzzTest5.FuzzTest_addElement(intUnionFind8, intUnionFind34, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind8, intUnionFind44, (java.lang.Integer) 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addElement(intUnionFind12, intUnionFind13, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addElement(intUnionFind17, intUnionFind18, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addElement(intUnionFind21, intUnionFind22, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addElement(intUnionFind26, intUnionFind27, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_addElement(intUnionFind35, intUnionFind36, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_addElement(intUnionFind39, intUnionFind40, (java.lang.Integer) 0);
        fuzzTest16.FuzzTest_addElement(intUnionFind31, intUnionFind39, (java.lang.Integer) 10);
        fuzzTest10.FuzzTest_addElement(intUnionFind13, intUnionFind39, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_addElement(intUnionFind7, intUnionFind39, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_addElement(intUnionFind50, intUnionFind51, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_addElement(intUnionFind54, intUnionFind55, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addElement(intUnionFind59, intUnionFind60, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addElement(intUnionFind63, intUnionFind64, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addElement(intUnionFind68, intUnionFind69, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addElement(intUnionFind72, intUnionFind73, (java.lang.Integer) 0);
        fuzzTest49.FuzzTest_addElement(intUnionFind64, intUnionFind72, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_addElement(intUnionFind79, intUnionFind80, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_addElement(intUnionFind83, intUnionFind84, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind72, intUnionFind84, (java.lang.Integer) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        fuzzTest6.FuzzTest_addElement(intUnionFind21, intUnionFind29, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_addElement(intUnionFind37, intUnionFind38, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_addElement(intUnionFind42, intUnionFind43, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_addElement(intUnionFind46, intUnionFind47, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_addElement(intUnionFind51, intUnionFind52, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_addElement(intUnionFind55, intUnionFind56, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_addElement(intUnionFind60, intUnionFind61, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_addElement(intUnionFind64, intUnionFind65, (java.lang.Integer) 0);
        fuzzTest41.FuzzTest_addElement(intUnionFind56, intUnionFind64, (java.lang.Integer) 10);
        fuzzTest35.FuzzTest_addElement(intUnionFind38, intUnionFind64, (java.lang.Integer) (-1));
        fuzzTest5.FuzzTest_addElement(intUnionFind21, intUnionFind64, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_addElement(intUnionFind75, intUnionFind76, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind21, intUnionFind76, (java.lang.Integer) 100);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 0);
        fuzzTest5.FuzzTest_addElement(intUnionFind20, intUnionFind28, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_addElement(intUnionFind35, intUnionFind36, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_addElement(intUnionFind39, intUnionFind40, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind20, intUnionFind40, (java.lang.Integer) 1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 0);
        fuzzTest5.FuzzTest_addElement(intUnionFind20, intUnionFind28, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_addElement(intUnionFind35, intUnionFind36, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_addElement(intUnionFind39, intUnionFind40, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_addElement(intUnionFind44, intUnionFind45, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_addElement(intUnionFind48, intUnionFind49, (java.lang.Integer) 0);
        fuzzTest5.FuzzTest_addElement(intUnionFind39, intUnionFind49, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_addElement(intUnionFind55, intUnionFind56, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_addElement(intUnionFind59, intUnionFind60, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_addElement(intUnionFind64, intUnionFind65, (java.lang.Integer) 0);
        fuzzTest5.FuzzTest_addElement(intUnionFind60, intUnionFind64, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_addElement(intUnionFind71, intUnionFind72, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind60, intUnionFind72, (java.lang.Integer) 10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind14 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addElement(intUnionFind14, intUnionFind15, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_addElement(intUnionFind23, intUnionFind24, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_addElement(intUnionFind15, intUnionFind23, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_addElement(intUnionFind31, intUnionFind32, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_addElement(intUnionFind36, intUnionFind37, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_addElement(intUnionFind40, intUnionFind41, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addElement(intUnionFind45, intUnionFind46, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addElement(intUnionFind49, intUnionFind50, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_addElement(intUnionFind54, intUnionFind55, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_addElement(intUnionFind58, intUnionFind59, (java.lang.Integer) 0);
        fuzzTest35.FuzzTest_addElement(intUnionFind50, intUnionFind58, (java.lang.Integer) 10);
        fuzzTest29.FuzzTest_addElement(intUnionFind32, intUnionFind58, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addElement(intUnionFind68, intUnionFind69, (java.lang.Integer) 0);
        fuzzTest29.FuzzTest_addElement(intUnionFind66, intUnionFind69, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_addElement(intUnionFind75, intUnionFind76, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_addElement(intUnionFind79, intUnionFind80, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind69, intUnionFind80, (java.lang.Integer) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_addElement(intUnionFind34, intUnionFind35, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_addElement(intUnionFind38, intUnionFind39, (java.lang.Integer) 0);
        fuzzTest15.FuzzTest_addElement(intUnionFind30, intUnionFind38, (java.lang.Integer) 10);
        fuzzTest9.FuzzTest_addElement(intUnionFind12, intUnionFind38, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addElement(intUnionFind48, intUnionFind49, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_addElement(intUnionFind53, intUnionFind54, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_addElement(intUnionFind57, intUnionFind58, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_addElement(intUnionFind62, intUnionFind63, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_addElement(intUnionFind66, intUnionFind67, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_addElement(intUnionFind71, intUnionFind72, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_addElement(intUnionFind75, intUnionFind76, (java.lang.Integer) 0);
        fuzzTest52.FuzzTest_addElement(intUnionFind67, intUnionFind75, (java.lang.Integer) 10);
        fuzzTest46.FuzzTest_addElement(intUnionFind49, intUnionFind75, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest84.FuzzTest_addElement(intUnionFind85, intUnionFind86, (java.lang.Integer) 0);
        fuzzTest46.FuzzTest_addElement(intUnionFind83, intUnionFind86, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind12, intUnionFind86, (java.lang.Integer) 100);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind23 = null;
        fuzzTest21.FuzzTest_addElement(intUnionFind22, intUnionFind23, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_addElement(intUnionFind27, intUnionFind28, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_addElement(intUnionFind38, intUnionFind39, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_addElement(intUnionFind42, intUnionFind43, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addElement(intUnionFind51, intUnionFind52, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_addElement(intUnionFind56, intUnionFind57, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_addElement(intUnionFind60, intUnionFind61, (java.lang.Integer) 0);
        fuzzTest37.FuzzTest_addElement(intUnionFind52, intUnionFind60, (java.lang.Integer) 10);
        fuzzTest31.FuzzTest_addElement(intUnionFind34, intUnionFind60, (java.lang.Integer) (-1));
        fuzzTest21.FuzzTest_addElement(intUnionFind27, intUnionFind60, (java.lang.Integer) 1);
        fuzzTest19.FuzzTest_addElement(intUnionFind20, intUnionFind60, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addElement(intUnionFind20, intUnionFind72, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind7, intUnionFind72, (java.lang.Integer) 2);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_addElement(intUnionFind34, intUnionFind35, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_addElement(intUnionFind38, intUnionFind39, (java.lang.Integer) 0);
        fuzzTest15.FuzzTest_addElement(intUnionFind30, intUnionFind38, (java.lang.Integer) 10);
        fuzzTest9.FuzzTest_addElement(intUnionFind12, intUnionFind38, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addElement(intUnionFind48, intUnionFind49, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_addElement(intUnionFind53, intUnionFind54, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_addElement(intUnionFind57, intUnionFind58, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_addElement(intUnionFind62, intUnionFind63, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_addElement(intUnionFind66, intUnionFind67, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_addElement(intUnionFind71, intUnionFind72, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_addElement(intUnionFind75, intUnionFind76, (java.lang.Integer) 0);
        fuzzTest52.FuzzTest_addElement(intUnionFind67, intUnionFind75, (java.lang.Integer) 10);
        fuzzTest46.FuzzTest_addElement(intUnionFind49, intUnionFind75, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest84.FuzzTest_addElement(intUnionFind85, intUnionFind86, (java.lang.Integer) 0);
        fuzzTest46.FuzzTest_addElement(intUnionFind83, intUnionFind86, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind38, intUnionFind86, (java.lang.Integer) 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind3, intUnionFind4, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addElement(intUnionFind12, intUnionFind13, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_addElement(intUnionFind21, intUnionFind22, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_addElement(intUnionFind17, intUnionFind25, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        fuzzTest31.FuzzTest_addElement(intUnionFind32, intUnionFind33, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_addElement(intUnionFind37, intUnionFind38, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addElement(intUnionFind48, intUnionFind49, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addElement(intUnionFind52, intUnionFind53, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_addElement(intUnionFind57, intUnionFind58, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_addElement(intUnionFind61, intUnionFind62, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_addElement(intUnionFind66, intUnionFind67, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_addElement(intUnionFind70, intUnionFind71, (java.lang.Integer) 0);
        fuzzTest47.FuzzTest_addElement(intUnionFind62, intUnionFind70, (java.lang.Integer) 10);
        fuzzTest41.FuzzTest_addElement(intUnionFind44, intUnionFind70, (java.lang.Integer) (-1));
        fuzzTest31.FuzzTest_addElement(intUnionFind38, intUnionFind70, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_addElement(intUnionFind25, intUnionFind38, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_addElement(intUnionFind83, intUnionFind84, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind38, intUnionFind84, (java.lang.Integer) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 0);
        fuzzTest5.FuzzTest_addElement(intUnionFind20, intUnionFind28, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_addElement(intUnionFind35, intUnionFind36, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_addElement(intUnionFind39, intUnionFind40, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_addElement(intUnionFind44, intUnionFind45, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_addElement(intUnionFind48, intUnionFind49, (java.lang.Integer) 0);
        fuzzTest5.FuzzTest_addElement(intUnionFind39, intUnionFind49, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_addElement(intUnionFind55, intUnionFind56, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_addElement(intUnionFind59, intUnionFind60, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_addElement(intUnionFind64, intUnionFind65, (java.lang.Integer) 0);
        fuzzTest5.FuzzTest_addElement(intUnionFind60, intUnionFind64, (java.lang.Integer) 10);
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind60, intUnionFind70, (java.lang.Integer) 2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind3, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        fuzzTest6.FuzzTest_addElement(intUnionFind21, intUnionFind29, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_addElement(intUnionFind3, intUnionFind29, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_addElement(intUnionFind39, intUnionFind40, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_addElement(intUnionFind37, intUnionFind39, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_addElement(intUnionFind52, intUnionFind53, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_addElement(intUnionFind56, intUnionFind57, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_addElement(intUnionFind61, intUnionFind62, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_addElement(intUnionFind65, intUnionFind66, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_addElement(intUnionFind70, intUnionFind71, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_addElement(intUnionFind74, intUnionFind75, (java.lang.Integer) 0);
        fuzzTest51.FuzzTest_addElement(intUnionFind66, intUnionFind74, (java.lang.Integer) 10);
        fuzzTest45.FuzzTest_addElement(intUnionFind48, intUnionFind74, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_addElement(intUnionFind83, intUnionFind84, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind87 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_addElement(intUnionFind87, intUnionFind88, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind74, intUnionFind88, (java.lang.Integer) 10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind3, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        fuzzTest6.FuzzTest_addElement(intUnionFind21, intUnionFind29, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_addElement(intUnionFind3, intUnionFind29, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_addElement(intUnionFind38, intUnionFind39, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind39, intUnionFind48, (java.lang.Integer) 1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addElement(intUnionFind26, intUnionFind27, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_addElement(intUnionFind31, intUnionFind32, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_addElement(intUnionFind35, intUnionFind36, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addElement(intUnionFind40, intUnionFind41, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addElement(intUnionFind44, intUnionFind45, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_addElement(intUnionFind49, intUnionFind50, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_addElement(intUnionFind53, intUnionFind54, (java.lang.Integer) 0);
        fuzzTest30.FuzzTest_addElement(intUnionFind45, intUnionFind53, (java.lang.Integer) 10);
        fuzzTest24.FuzzTest_addElement(intUnionFind27, intUnionFind53, (java.lang.Integer) (-1));
        fuzzTest14.FuzzTest_addElement(intUnionFind21, intUnionFind53, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind53, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_addElement(intUnionFind66, intUnionFind67, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind67, intUnionFind70, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_addElement(intUnionFind74, intUnionFind75, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_addElement(intUnionFind79, intUnionFind80, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_addElement(intUnionFind83, intUnionFind84, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind75, intUnionFind84, (java.lang.Integer) 2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addElement(intUnionFind12, intUnionFind13, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addElement(intUnionFind17, intUnionFind18, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addElement(intUnionFind21, intUnionFind22, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addElement(intUnionFind26, intUnionFind27, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_addElement(intUnionFind35, intUnionFind36, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_addElement(intUnionFind39, intUnionFind40, (java.lang.Integer) 0);
        fuzzTest16.FuzzTest_addElement(intUnionFind31, intUnionFind39, (java.lang.Integer) 10);
        fuzzTest10.FuzzTest_addElement(intUnionFind13, intUnionFind39, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_addElement(intUnionFind6, intUnionFind39, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_addElement(intUnionFind50, intUnionFind51, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_addElement(intUnionFind54, intUnionFind55, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addElement(intUnionFind59, intUnionFind60, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addElement(intUnionFind63, intUnionFind64, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addElement(intUnionFind68, intUnionFind69, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addElement(intUnionFind72, intUnionFind73, (java.lang.Integer) 0);
        fuzzTest49.FuzzTest_addElement(intUnionFind64, intUnionFind72, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_addElement(intUnionFind79, intUnionFind80, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_addElement(intUnionFind83, intUnionFind84, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind72, intUnionFind84, (java.lang.Integer) (-1));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind23 = null;
        fuzzTest21.FuzzTest_addElement(intUnionFind22, intUnionFind23, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_addElement(intUnionFind27, intUnionFind28, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_addElement(intUnionFind38, intUnionFind39, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_addElement(intUnionFind42, intUnionFind43, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addElement(intUnionFind51, intUnionFind52, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_addElement(intUnionFind56, intUnionFind57, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_addElement(intUnionFind60, intUnionFind61, (java.lang.Integer) 0);
        fuzzTest37.FuzzTest_addElement(intUnionFind52, intUnionFind60, (java.lang.Integer) 10);
        fuzzTest31.FuzzTest_addElement(intUnionFind34, intUnionFind60, (java.lang.Integer) (-1));
        fuzzTest21.FuzzTest_addElement(intUnionFind27, intUnionFind60, (java.lang.Integer) 1);
        fuzzTest19.FuzzTest_addElement(intUnionFind20, intUnionFind60, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_addElement(intUnionFind73, intUnionFind74, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_addElement(intUnionFind77, intUnionFind78, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind82 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_addElement(intUnionFind82, intUnionFind83, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind86 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind87 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_addElement(intUnionFind86, intUnionFind87, (java.lang.Integer) 0);
        fuzzTest19.FuzzTest_addElement(intUnionFind78, intUnionFind86, (java.lang.Integer) 10);
        fuzzTest5.FuzzTest_addElement(intUnionFind16, intUnionFind86, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind94 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind86, intUnionFind94, (java.lang.Integer) (-1));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 0);
        fuzzTest5.FuzzTest_addElement(intUnionFind20, intUnionFind28, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_addElement(intUnionFind35, intUnionFind36, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_addElement(intUnionFind39, intUnionFind40, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_addElement(intUnionFind44, intUnionFind45, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_addElement(intUnionFind48, intUnionFind49, (java.lang.Integer) 0);
        fuzzTest5.FuzzTest_addElement(intUnionFind39, intUnionFind49, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_addElement(intUnionFind55, intUnionFind56, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_addElement(intUnionFind59, intUnionFind60, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_addElement(intUnionFind64, intUnionFind65, (java.lang.Integer) 0);
        fuzzTest5.FuzzTest_addElement(intUnionFind60, intUnionFind64, (java.lang.Integer) 10);
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind64, intUnionFind70, (java.lang.Integer) 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        fuzzTest6.FuzzTest_addElement(intUnionFind21, intUnionFind29, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = null;
        fuzzTest35.FuzzTest_addElement(intUnionFind36, intUnionFind37, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_addElement(intUnionFind41, intUnionFind42, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_addElement(intUnionFind52, intUnionFind53, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_addElement(intUnionFind56, intUnionFind57, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_addElement(intUnionFind61, intUnionFind62, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_addElement(intUnionFind65, intUnionFind66, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_addElement(intUnionFind70, intUnionFind71, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_addElement(intUnionFind74, intUnionFind75, (java.lang.Integer) 0);
        fuzzTest51.FuzzTest_addElement(intUnionFind66, intUnionFind74, (java.lang.Integer) 10);
        fuzzTest45.FuzzTest_addElement(intUnionFind48, intUnionFind74, (java.lang.Integer) (-1));
        fuzzTest35.FuzzTest_addElement(intUnionFind42, intUnionFind74, (java.lang.Integer) (-1));
        fuzzTest5.FuzzTest_addElement(intUnionFind29, intUnionFind42, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest86 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind87 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest86.FuzzTest_addElement(intUnionFind87, intUnionFind88, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind91 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind92 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest86.FuzzTest_addElement(intUnionFind91, intUnionFind92, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind29, intUnionFind92, (java.lang.Integer) (-1));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addElement(intUnionFind12, intUnionFind13, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_addElement(intUnionFind21, intUnionFind22, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addElement(intUnionFind34, intUnionFind35, (java.lang.Integer) 0);
        fuzzTest11.FuzzTest_addElement(intUnionFind26, intUnionFind34, (java.lang.Integer) 10);
        fuzzTest5.FuzzTest_addElement(intUnionFind8, intUnionFind34, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addElement(intUnionFind45, intUnionFind46, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_addElement(intUnionFind50, intUnionFind51, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_addElement(intUnionFind54, intUnionFind55, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addElement(intUnionFind59, intUnionFind60, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addElement(intUnionFind63, intUnionFind64, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addElement(intUnionFind68, intUnionFind69, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addElement(intUnionFind72, intUnionFind73, (java.lang.Integer) 0);
        fuzzTest49.FuzzTest_addElement(intUnionFind64, intUnionFind72, (java.lang.Integer) 10);
        fuzzTest43.FuzzTest_addElement(intUnionFind46, intUnionFind72, (java.lang.Integer) (-1));
        fuzzTest5.FuzzTest_addElement(intUnionFind42, intUnionFind72, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_addElement(intUnionFind83, intUnionFind84, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind87 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_addElement(intUnionFind87, intUnionFind88, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind72, intUnionFind88, (java.lang.Integer) 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind14 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind14, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_addElement(intUnionFind23, intUnionFind24, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_addElement(intUnionFind32, intUnionFind33, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_addElement(intUnionFind37, intUnionFind38, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_addElement(intUnionFind41, intUnionFind42, (java.lang.Integer) 0);
        fuzzTest18.FuzzTest_addElement(intUnionFind33, intUnionFind41, (java.lang.Integer) 10);
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        fuzzTest17.FuzzTest_addElement(intUnionFind41, intUnionFind47, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_addElement(intUnionFind52, intUnionFind53, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_addElement(intUnionFind57, intUnionFind58, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_addElement(intUnionFind61, intUnionFind62, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_addElement(intUnionFind66, intUnionFind67, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_addElement(intUnionFind70, intUnionFind71, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_addElement(intUnionFind75, intUnionFind76, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_addElement(intUnionFind79, intUnionFind80, (java.lang.Integer) 0);
        fuzzTest56.FuzzTest_addElement(intUnionFind71, intUnionFind79, (java.lang.Integer) 10);
        fuzzTest50.FuzzTest_addElement(intUnionFind53, intUnionFind79, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind87 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest88 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind89 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind90 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest88.FuzzTest_addElement(intUnionFind89, intUnionFind90, (java.lang.Integer) 0);
        fuzzTest50.FuzzTest_addElement(intUnionFind87, intUnionFind90, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind41, intUnionFind90, (java.lang.Integer) 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_addElement(intUnionFind4, intUnionFind5, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addElement(intUnionFind9, intUnionFind10, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addElement(intUnionFind13, intUnionFind14, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_addElement(intUnionFind18, intUnionFind19, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_addElement(intUnionFind22, intUnionFind23, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_addElement(intUnionFind27, intUnionFind28, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_addElement(intUnionFind31, intUnionFind32, (java.lang.Integer) 0);
        fuzzTest8.FuzzTest_addElement(intUnionFind23, intUnionFind31, (java.lang.Integer) 10);
        fuzzTest2.FuzzTest_addElement(intUnionFind5, intUnionFind31, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_addElement(intUnionFind41, intUnionFind42, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_addElement(intUnionFind39, intUnionFind42, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        fuzzTest1.FuzzTest_addElement(intUnionFind42, intUnionFind47, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_addElement(intUnionFind51, intUnionFind52, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind42, intUnionFind52, (java.lang.Integer) 100);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        fuzzTest6.FuzzTest_addElement(intUnionFind21, intUnionFind29, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_addElement(intUnionFind36, intUnionFind37, (java.lang.Integer) 0);
        fuzzTest5.FuzzTest_addElement(intUnionFind29, intUnionFind36, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_addElement(intUnionFind44, intUnionFind45, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_addElement(intUnionFind49, intUnionFind50, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_addElement(intUnionFind53, intUnionFind54, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_addElement(intUnionFind58, intUnionFind59, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_addElement(intUnionFind62, intUnionFind63, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_addElement(intUnionFind67, intUnionFind68, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_addElement(intUnionFind71, intUnionFind72, (java.lang.Integer) 0);
        fuzzTest48.FuzzTest_addElement(intUnionFind63, intUnionFind71, (java.lang.Integer) 10);
        fuzzTest42.FuzzTest_addElement(intUnionFind45, intUnionFind71, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind81 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest80.FuzzTest_addElement(intUnionFind81, intUnionFind82, (java.lang.Integer) 0);
        fuzzTest42.FuzzTest_addElement(intUnionFind79, intUnionFind82, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind36, intUnionFind82, (java.lang.Integer) 0);
    }
}

