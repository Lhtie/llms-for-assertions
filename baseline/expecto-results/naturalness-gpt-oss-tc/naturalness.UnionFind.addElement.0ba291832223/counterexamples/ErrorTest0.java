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
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) (-1));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) (-1));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind9, intUnionFind10, (java.lang.Integer) 10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = null;
        fuzzTest10.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        fuzzTest24.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 2);
        fuzzTest10.FuzzTest_addElement(intUnionFind21, intUnionFind29, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind9, intUnionFind21, (java.lang.Integer) 10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzzTest11.FuzzTest_addElement(intUnionFind12, intUnionFind13, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = null;
        fuzzTest20.FuzzTest_addElement(intUnionFind21, intUnionFind22, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 2);
        fuzzTest6.FuzzTest_addElement(intUnionFind17, intUnionFind25, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind17, (java.lang.Integer) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_addElement(intUnionFind3, intUnionFind4, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind8, (java.lang.Integer) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = null;
        fuzzTest9.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        fuzzTest23.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 2);
        fuzzTest9.FuzzTest_addElement(intUnionFind20, intUnionFind28, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind20, intUnionFind34, (java.lang.Integer) 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = null;
        fuzzTest10.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        fuzzTest19.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 2);
        fuzzTest5.FuzzTest_addElement(intUnionFind16, intUnionFind24, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = null;
        fuzzTest32.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_addElement(intUnionFind37, intUnionFind38, (java.lang.Integer) 2);
        fuzzTest30.FuzzTest_addElement(intUnionFind31, intUnionFind37, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind16, intUnionFind31, (java.lang.Integer) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind19, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzzTest25.FuzzTest_addElement(intUnionFind26, intUnionFind27, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind31, intUnionFind34, (java.lang.Integer) 2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = null;
        fuzzTest10.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        fuzzTest19.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 2);
        fuzzTest5.FuzzTest_addElement(intUnionFind16, intUnionFind24, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind16, intUnionFind30, (java.lang.Integer) 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_addElement(intUnionFind3, intUnionFind4, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind7, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        fuzzTest19.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        fuzzTest14.FuzzTest_addElement(intUnionFind25, intUnionFind33, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_addElement(intUnionFind13, intUnionFind33, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = null;
        fuzzTest51.FuzzTest_addElement(intUnionFind52, intUnionFind53, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        fuzzTest56.FuzzTest_addElement(intUnionFind57, intUnionFind58, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_addElement(intUnionFind61, intUnionFind62, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = null;
        fuzzTest65.FuzzTest_addElement(intUnionFind66, intUnionFind67, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_addElement(intUnionFind70, intUnionFind71, (java.lang.Integer) 2);
        fuzzTest51.FuzzTest_addElement(intUnionFind62, intUnionFind70, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind70, intUnionFind76, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind41, intUnionFind76, (java.lang.Integer) 10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_addElement(intUnionFind3, intUnionFind4, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind7, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        fuzzTest19.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        fuzzTest14.FuzzTest_addElement(intUnionFind25, intUnionFind33, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_addElement(intUnionFind13, intUnionFind33, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        fuzzTest41.FuzzTest_addElement(intUnionFind42, intUnionFind43, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = null;
        fuzzTest46.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addElement(intUnionFind51, intUnionFind52, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        fuzzTest55.FuzzTest_addElement(intUnionFind56, intUnionFind57, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_addElement(intUnionFind60, intUnionFind61, (java.lang.Integer) 2);
        fuzzTest41.FuzzTest_addElement(intUnionFind52, intUnionFind60, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = null;
        fuzzTest67.FuzzTest_addElement(intUnionFind68, intUnionFind69, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addElement(intUnionFind72, intUnionFind73, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_addElement(intUnionFind72, intUnionFind76, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_addElement(intUnionFind72, intUnionFind79, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind84 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind85 = null;
        fuzzTest83.FuzzTest_addElement(intUnionFind84, intUnionFind85, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind88 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest83.FuzzTest_addElement(intUnionFind88, intUnionFind89, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind92 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_addElement(intUnionFind88, intUnionFind92, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind79, intUnionFind92, (java.lang.Integer) 100);
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
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind18 = null;
        fuzzTest16.FuzzTest_addElement(intUnionFind17, intUnionFind18, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addElement(intUnionFind21, intUnionFind22, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind21, intUnionFind25, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = null;
        fuzzTest33.FuzzTest_addElement(intUnionFind34, intUnionFind35, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_addElement(intUnionFind38, intUnionFind39, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 2);
        fuzzTest28.FuzzTest_addElement(intUnionFind39, intUnionFind47, (java.lang.Integer) 100);
        fuzzTest14.FuzzTest_addElement(intUnionFind25, intUnionFind47, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        fuzzTest55.FuzzTest_addElement(intUnionFind56, intUnionFind57, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = null;
        fuzzTest60.FuzzTest_addElement(intUnionFind61, intUnionFind62, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_addElement(intUnionFind65, intUnionFind66, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = null;
        fuzzTest69.FuzzTest_addElement(intUnionFind70, intUnionFind71, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_addElement(intUnionFind74, intUnionFind75, (java.lang.Integer) 2);
        fuzzTest55.FuzzTest_addElement(intUnionFind66, intUnionFind74, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind74, intUnionFind80, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind80, (java.lang.Integer) 10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = null;
        fuzzTest9.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        fuzzTest23.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 2);
        fuzzTest9.FuzzTest_addElement(intUnionFind20, intUnionFind28, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind28, intUnionFind34, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = null;
        fuzzTest39.FuzzTest_addElement(intUnionFind40, intUnionFind41, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addElement(intUnionFind44, intUnionFind45, (java.lang.Integer) 2);
        fuzzTest37.FuzzTest_addElement(intUnionFind38, intUnionFind44, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = null;
        fuzzTest50.FuzzTest_addElement(intUnionFind51, intUnionFind52, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        fuzzTest55.FuzzTest_addElement(intUnionFind56, intUnionFind57, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_addElement(intUnionFind60, intUnionFind61, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = null;
        fuzzTest64.FuzzTest_addElement(intUnionFind65, intUnionFind66, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_addElement(intUnionFind69, intUnionFind70, (java.lang.Integer) 2);
        fuzzTest50.FuzzTest_addElement(intUnionFind61, intUnionFind69, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind38, intUnionFind61, (java.lang.Integer) 100);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_addElement(intUnionFind3, intUnionFind4, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind7, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_addElement(intUnionFind19, intUnionFind23, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        fuzzTest26.FuzzTest_addElement(intUnionFind27, intUnionFind28, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        fuzzTest31.FuzzTest_addElement(intUnionFind32, intUnionFind33, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_addElement(intUnionFind36, intUnionFind37, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = null;
        fuzzTest40.FuzzTest_addElement(intUnionFind41, intUnionFind42, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_addElement(intUnionFind45, intUnionFind46, (java.lang.Integer) 2);
        fuzzTest26.FuzzTest_addElement(intUnionFind37, intUnionFind45, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = null;
        fuzzTest52.FuzzTest_addElement(intUnionFind53, intUnionFind54, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_addElement(intUnionFind57, intUnionFind58, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_addElement(intUnionFind57, intUnionFind61, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_addElement(intUnionFind57, intUnionFind64, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_addElement(intUnionFind23, intUnionFind57, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind69, intUnionFind70, (java.lang.Integer) 100);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind19, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind3, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind6, intUnionFind10, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind20, intUnionFind24, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind13, intUnionFind24, (java.lang.Integer) 1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_addElement(intUnionFind3, intUnionFind4, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addElement(intUnionFind7, intUnionFind11, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        fuzzTest19.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        fuzzTest14.FuzzTest_addElement(intUnionFind25, intUnionFind33, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind33, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_addElement(intUnionFind47, intUnionFind51, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        fuzzTest54.FuzzTest_addElement(intUnionFind55, intUnionFind56, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = null;
        fuzzTest59.FuzzTest_addElement(intUnionFind60, intUnionFind61, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_addElement(intUnionFind64, intUnionFind65, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        fuzzTest68.FuzzTest_addElement(intUnionFind69, intUnionFind70, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_addElement(intUnionFind73, intUnionFind74, (java.lang.Integer) 2);
        fuzzTest54.FuzzTest_addElement(intUnionFind65, intUnionFind73, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind51, intUnionFind65, (java.lang.Integer) (-1));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind3, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind6, intUnionFind10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 2);
        fuzzTest13.FuzzTest_addElement(intUnionFind14, intUnionFind20, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_addElement(intUnionFind33, intUnionFind37, (java.lang.Integer) (-1));
        fuzzTest13.FuzzTest_addElement(intUnionFind26, intUnionFind37, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = null;
        fuzzTest44.FuzzTest_addElement(intUnionFind45, intUnionFind46, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addElement(intUnionFind49, intUnionFind50, (java.lang.Integer) 2);
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind49, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = null;
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = null;
        fuzzTest57.FuzzTest_addElement(intUnionFind58, intUnionFind59, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_addElement(intUnionFind62, intUnionFind63, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_addElement(intUnionFind62, intUnionFind66, (java.lang.Integer) (-1));
        fuzzTest42.FuzzTest_addElement(intUnionFind55, intUnionFind66, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind37, intUnionFind66, (java.lang.Integer) 2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        fuzzTest3.FuzzTest_addElement(intUnionFind4, intUnionFind5, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_addElement(intUnionFind8, intUnionFind9, (java.lang.Integer) 2);
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind8, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind18 = null;
        fuzzTest16.FuzzTest_addElement(intUnionFind17, intUnionFind18, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addElement(intUnionFind21, intUnionFind22, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind21, intUnionFind25, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_addElement(intUnionFind14, intUnionFind25, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind25, intUnionFind30, (java.lang.Integer) 10);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_addElement(intUnionFind3, intUnionFind4, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addElement(intUnionFind7, intUnionFind11, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        fuzzTest19.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        fuzzTest14.FuzzTest_addElement(intUnionFind25, intUnionFind33, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind33, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_addElement(intUnionFind47, intUnionFind51, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        fuzzTest56.FuzzTest_addElement(intUnionFind57, intUnionFind58, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_addElement(intUnionFind61, intUnionFind62, (java.lang.Integer) 2);
        fuzzTest54.FuzzTest_addElement(intUnionFind55, intUnionFind61, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = null;
        fuzzTest69.FuzzTest_addElement(intUnionFind70, intUnionFind71, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_addElement(intUnionFind74, intUnionFind75, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_addElement(intUnionFind74, intUnionFind78, (java.lang.Integer) (-1));
        fuzzTest54.FuzzTest_addElement(intUnionFind67, intUnionFind78, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind51, intUnionFind78, (java.lang.Integer) (-1));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = null;
        fuzzTest20.FuzzTest_addElement(intUnionFind21, intUnionFind22, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = null;
        fuzzTest29.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addElement(intUnionFind34, intUnionFind35, (java.lang.Integer) 2);
        fuzzTest15.FuzzTest_addElement(intUnionFind26, intUnionFind34, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind34, intUnionFind40, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind34, (java.lang.Integer) 10);
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = null;
        fuzzTest46.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addElement(intUnionFind51, intUnionFind52, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        fuzzTest55.FuzzTest_addElement(intUnionFind56, intUnionFind57, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = null;
        fuzzTest60.FuzzTest_addElement(intUnionFind61, intUnionFind62, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_addElement(intUnionFind65, intUnionFind66, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = null;
        fuzzTest69.FuzzTest_addElement(intUnionFind70, intUnionFind71, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_addElement(intUnionFind74, intUnionFind75, (java.lang.Integer) 2);
        fuzzTest55.FuzzTest_addElement(intUnionFind66, intUnionFind74, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addElement(intUnionFind74, intUnionFind80, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind45, intUnionFind80, (java.lang.Integer) 100);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind9 = null;
        fuzzTest7.FuzzTest_addElement(intUnionFind8, intUnionFind9, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_addElement(intUnionFind12, intUnionFind13, (java.lang.Integer) 2);
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind12, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = null;
        fuzzTest20.FuzzTest_addElement(intUnionFind21, intUnionFind22, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_addElement(intUnionFind25, intUnionFind29, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = null;
        fuzzTest32.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = null;
        fuzzTest37.FuzzTest_addElement(intUnionFind38, intUnionFind39, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_addElement(intUnionFind42, intUnionFind43, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = null;
        fuzzTest46.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addElement(intUnionFind51, intUnionFind52, (java.lang.Integer) 2);
        fuzzTest32.FuzzTest_addElement(intUnionFind43, intUnionFind51, (java.lang.Integer) 100);
        fuzzTest18.FuzzTest_addElement(intUnionFind29, intUnionFind51, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_addElement(intUnionFind6, intUnionFind51, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = null;
        fuzzTest61.FuzzTest_addElement(intUnionFind62, intUnionFind63, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_addElement(intUnionFind66, intUnionFind67, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind67, intUnionFind70, (java.lang.Integer) 1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind3, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzzTest11.FuzzTest_addElement(intUnionFind12, intUnionFind13, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addElement(intUnionFind16, intUnionFind20, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        fuzzTest23.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = null;
        fuzzTest37.FuzzTest_addElement(intUnionFind38, intUnionFind39, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_addElement(intUnionFind42, intUnionFind43, (java.lang.Integer) 2);
        fuzzTest23.FuzzTest_addElement(intUnionFind34, intUnionFind42, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = null;
        fuzzTest49.FuzzTest_addElement(intUnionFind50, intUnionFind51, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_addElement(intUnionFind54, intUnionFind55, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_addElement(intUnionFind54, intUnionFind58, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind54, intUnionFind61, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_addElement(intUnionFind20, intUnionFind54, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = null;
        fuzzTest66.FuzzTest_addElement(intUnionFind67, intUnionFind68, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = null;
        fuzzTest71.FuzzTest_addElement(intUnionFind72, intUnionFind73, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind76 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_addElement(intUnionFind76, intUnionFind77, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind81 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind82 = null;
        fuzzTest80.FuzzTest_addElement(intUnionFind81, intUnionFind82, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind85 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest80.FuzzTest_addElement(intUnionFind85, intUnionFind86, (java.lang.Integer) 2);
        fuzzTest66.FuzzTest_addElement(intUnionFind77, intUnionFind85, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind20, intUnionFind77, (java.lang.Integer) 100);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind9 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        fuzzTest8.FuzzTest_addElement(intUnionFind9, intUnionFind10, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addElement(intUnionFind13, intUnionFind14, (java.lang.Integer) 2);
        fuzzTest6.FuzzTest_addElement(intUnionFind7, intUnionFind13, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = null;
        fuzzTest20.FuzzTest_addElement(intUnionFind21, intUnionFind22, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzzTest25.FuzzTest_addElement(intUnionFind26, intUnionFind27, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = null;
        fuzzTest34.FuzzTest_addElement(intUnionFind35, intUnionFind36, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_addElement(intUnionFind39, intUnionFind40, (java.lang.Integer) 2);
        fuzzTest20.FuzzTest_addElement(intUnionFind31, intUnionFind39, (java.lang.Integer) 100);
        fuzzTest6.FuzzTest_addElement(intUnionFind19, intUnionFind39, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind19, (java.lang.Integer) 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        fuzzTest19.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        fuzzTest14.FuzzTest_addElement(intUnionFind25, intUnionFind33, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind33, intUnionFind39, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = null;
        fuzzTest47.FuzzTest_addElement(intUnionFind48, intUnionFind49, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addElement(intUnionFind52, intUnionFind53, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        fuzzTest56.FuzzTest_addElement(intUnionFind57, intUnionFind58, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_addElement(intUnionFind61, intUnionFind62, (java.lang.Integer) 2);
        fuzzTest42.FuzzTest_addElement(intUnionFind53, intUnionFind61, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind39, intUnionFind53, (java.lang.Integer) 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind19, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        fuzzTest26.FuzzTest_addElement(intUnionFind27, intUnionFind28, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_addElement(intUnionFind31, intUnionFind32, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addElement(intUnionFind31, intUnionFind35, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind31, intUnionFind38, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = null;
        fuzzTest44.FuzzTest_addElement(intUnionFind45, intUnionFind46, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addElement(intUnionFind49, intUnionFind50, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_addElement(intUnionFind49, intUnionFind53, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        fuzzTest56.FuzzTest_addElement(intUnionFind57, intUnionFind58, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = null;
        fuzzTest61.FuzzTest_addElement(intUnionFind62, intUnionFind63, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_addElement(intUnionFind66, intUnionFind67, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = null;
        fuzzTest70.FuzzTest_addElement(intUnionFind71, intUnionFind72, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_addElement(intUnionFind75, intUnionFind76, (java.lang.Integer) 2);
        fuzzTest56.FuzzTest_addElement(intUnionFind67, intUnionFind75, (java.lang.Integer) 100);
        fuzzTest42.FuzzTest_addElement(intUnionFind53, intUnionFind75, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind41, intUnionFind53, (java.lang.Integer) 100);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind9 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        fuzzTest8.FuzzTest_addElement(intUnionFind9, intUnionFind10, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addElement(intUnionFind13, intUnionFind14, (java.lang.Integer) 2);
        fuzzTest6.FuzzTest_addElement(intUnionFind7, intUnionFind13, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind7, (java.lang.Integer) 100);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_addElement(intUnionFind3, intUnionFind4, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind7, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        fuzzTest19.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        fuzzTest14.FuzzTest_addElement(intUnionFind25, intUnionFind33, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_addElement(intUnionFind13, intUnionFind33, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        fuzzTest41.FuzzTest_addElement(intUnionFind42, intUnionFind43, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = null;
        fuzzTest46.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addElement(intUnionFind51, intUnionFind52, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        fuzzTest55.FuzzTest_addElement(intUnionFind56, intUnionFind57, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_addElement(intUnionFind60, intUnionFind61, (java.lang.Integer) 2);
        fuzzTest41.FuzzTest_addElement(intUnionFind52, intUnionFind60, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = null;
        fuzzTest66.FuzzTest_addElement(intUnionFind67, intUnionFind68, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_addElement(intUnionFind71, intUnionFind72, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind52, intUnionFind72, (java.lang.Integer) 1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = null;
        fuzzTest10.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest9.FuzzTest_addElement(intUnionFind15, intUnionFind19, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        fuzzTest23.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 2);
        fuzzTest9.FuzzTest_addElement(intUnionFind22, intUnionFind29, (java.lang.Integer) 10);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind29, intUnionFind34, (java.lang.Integer) 1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzzTest11.FuzzTest_addElement(intUnionFind12, intUnionFind13, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addElement(intUnionFind16, intUnionFind20, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        fuzzTest23.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = null;
        fuzzTest37.FuzzTest_addElement(intUnionFind38, intUnionFind39, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_addElement(intUnionFind42, intUnionFind43, (java.lang.Integer) 2);
        fuzzTest23.FuzzTest_addElement(intUnionFind34, intUnionFind42, (java.lang.Integer) 100);
        fuzzTest9.FuzzTest_addElement(intUnionFind20, intUnionFind42, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind42, intUnionFind50, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = null;
        fuzzTest53.FuzzTest_addElement(intUnionFind54, intUnionFind55, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_addElement(intUnionFind58, intUnionFind59, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = null;
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = null;
        fuzzTest64.FuzzTest_addElement(intUnionFind65, intUnionFind66, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_addElement(intUnionFind69, intUnionFind70, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_addElement(intUnionFind69, intUnionFind73, (java.lang.Integer) (-1));
        fuzzTest53.FuzzTest_addElement(intUnionFind62, intUnionFind73, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind73, intUnionFind78, (java.lang.Integer) 10);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_addElement(intUnionFind3, intUnionFind4, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind7, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind20, intUnionFind24, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_addElement(intUnionFind13, intUnionFind24, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = null;
        fuzzTest29.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addElement(intUnionFind34, intUnionFind35, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = null;
        fuzzTest38.FuzzTest_addElement(intUnionFind39, intUnionFind40, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = null;
        fuzzTest43.FuzzTest_addElement(intUnionFind44, intUnionFind45, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_addElement(intUnionFind48, intUnionFind49, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = null;
        fuzzTest52.FuzzTest_addElement(intUnionFind53, intUnionFind54, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_addElement(intUnionFind57, intUnionFind58, (java.lang.Integer) 2);
        fuzzTest38.FuzzTest_addElement(intUnionFind49, intUnionFind57, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind35, intUnionFind49, (java.lang.Integer) 100);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind19, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = null;
        fuzzTest30.FuzzTest_addElement(intUnionFind31, intUnionFind32, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = null;
        fuzzTest35.FuzzTest_addElement(intUnionFind36, intUnionFind37, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_addElement(intUnionFind40, intUnionFind41, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = null;
        fuzzTest44.FuzzTest_addElement(intUnionFind45, intUnionFind46, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addElement(intUnionFind49, intUnionFind50, (java.lang.Integer) 2);
        fuzzTest30.FuzzTest_addElement(intUnionFind41, intUnionFind49, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        fuzzTest55.FuzzTest_addElement(intUnionFind56, intUnionFind57, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_addElement(intUnionFind60, intUnionFind61, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = null;
        fuzzTest65.FuzzTest_addElement(intUnionFind66, intUnionFind67, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_addElement(intUnionFind70, intUnionFind71, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_addElement(intUnionFind70, intUnionFind74, (java.lang.Integer) (-1));
        fuzzTest30.FuzzTest_addElement(intUnionFind61, intUnionFind70, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind29, intUnionFind61, (java.lang.Integer) 2);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind3, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind6, intUnionFind10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind14 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        fuzzTest13.FuzzTest_addElement(intUnionFind14, intUnionFind15, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_addElement(intUnionFind18, intUnionFind19, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        fuzzTest24.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind29, intUnionFind33, (java.lang.Integer) (-1));
        fuzzTest13.FuzzTest_addElement(intUnionFind22, intUnionFind33, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = null;
        fuzzTest38.FuzzTest_addElement(intUnionFind39, intUnionFind40, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = null;
        fuzzTest48.FuzzTest_addElement(intUnionFind49, intUnionFind50, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_addElement(intUnionFind53, intUnionFind54, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addElement(intUnionFind53, intUnionFind57, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = null;
        fuzzTest61.FuzzTest_addElement(intUnionFind62, intUnionFind63, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_addElement(intUnionFind66, intUnionFind67, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_addElement(intUnionFind66, intUnionFind70, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = null;
        fuzzTest47.FuzzTest_addElement(intUnionFind70, intUnionFind73, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind77 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind78 = null;
        fuzzTest76.FuzzTest_addElement(intUnionFind77, intUnionFind78, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind81 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_addElement(intUnionFind81, intUnionFind82, (java.lang.Integer) 2);
        fuzzTest38.FuzzTest_addElement(intUnionFind70, intUnionFind81, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind33, intUnionFind70, (java.lang.Integer) 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind19, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzzTest25.FuzzTest_addElement(intUnionFind26, intUnionFind27, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = null;
        fuzzTest35.FuzzTest_addElement(intUnionFind36, intUnionFind37, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_addElement(intUnionFind40, intUnionFind41, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_addElement(intUnionFind40, intUnionFind44, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_addElement(intUnionFind31, intUnionFind40, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = null;
        fuzzTest50.FuzzTest_addElement(intUnionFind51, intUnionFind52, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        fuzzTest55.FuzzTest_addElement(intUnionFind56, intUnionFind57, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_addElement(intUnionFind60, intUnionFind61, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = null;
        fuzzTest64.FuzzTest_addElement(intUnionFind65, intUnionFind66, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_addElement(intUnionFind69, intUnionFind70, (java.lang.Integer) 2);
        fuzzTest50.FuzzTest_addElement(intUnionFind61, intUnionFind69, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_addElement(intUnionFind49, intUnionFind69, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind77, intUnionFind78, (java.lang.Integer) 2);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_addElement(intUnionFind3, intUnionFind4, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind7, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind14 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        fuzzTest13.FuzzTest_addElement(intUnionFind14, intUnionFind15, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_addElement(intUnionFind18, intUnionFind19, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind23 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        fuzzTest22.FuzzTest_addElement(intUnionFind23, intUnionFind24, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        fuzzTest27.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_addElement(intUnionFind32, intUnionFind33, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = null;
        fuzzTest36.FuzzTest_addElement(intUnionFind37, intUnionFind38, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_addElement(intUnionFind41, intUnionFind42, (java.lang.Integer) 2);
        fuzzTest22.FuzzTest_addElement(intUnionFind33, intUnionFind41, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_addElement(intUnionFind41, intUnionFind47, (java.lang.Integer) 1);
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind47, intUnionFind50, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        fuzzTest54.FuzzTest_addElement(intUnionFind55, intUnionFind56, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_addElement(intUnionFind59, intUnionFind60, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_addElement(intUnionFind59, intUnionFind63, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        fuzzTest68.FuzzTest_addElement(intUnionFind69, intUnionFind70, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_addElement(intUnionFind73, intUnionFind74, (java.lang.Integer) 2);
        fuzzTest66.FuzzTest_addElement(intUnionFind67, intUnionFind73, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind79 = null;
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind82 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind83 = null;
        fuzzTest81.FuzzTest_addElement(intUnionFind82, intUnionFind83, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind86 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind87 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_addElement(intUnionFind86, intUnionFind87, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind90 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest80.FuzzTest_addElement(intUnionFind86, intUnionFind90, (java.lang.Integer) (-1));
        fuzzTest66.FuzzTest_addElement(intUnionFind79, intUnionFind90, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind63, intUnionFind90, (java.lang.Integer) 2);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind3, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind6, intUnionFind10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind20, intUnionFind24, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        fuzzTest27.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = null;
        fuzzTest32.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_addElement(intUnionFind37, intUnionFind38, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        fuzzTest41.FuzzTest_addElement(intUnionFind42, intUnionFind43, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_addElement(intUnionFind46, intUnionFind47, (java.lang.Integer) 2);
        fuzzTest27.FuzzTest_addElement(intUnionFind38, intUnionFind46, (java.lang.Integer) 100);
        fuzzTest13.FuzzTest_addElement(intUnionFind24, intUnionFind46, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        fuzzTest55.FuzzTest_addElement(intUnionFind56, intUnionFind57, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_addElement(intUnionFind60, intUnionFind61, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_addElement(intUnionFind60, intUnionFind64, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        fuzzTest68.FuzzTest_addElement(intUnionFind69, intUnionFind70, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_addElement(intUnionFind73, intUnionFind74, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addElement(intUnionFind73, intUnionFind77, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind80 = null;
        fuzzTest54.FuzzTest_addElement(intUnionFind77, intUnionFind80, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind24, intUnionFind77, (java.lang.Integer) (-1));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind3, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind6, intUnionFind10, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind13, intUnionFind20, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzzTest25.FuzzTest_addElement(intUnionFind26, intUnionFind27, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = null;
        fuzzTest30.FuzzTest_addElement(intUnionFind31, intUnionFind32, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_addElement(intUnionFind35, intUnionFind36, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = null;
        fuzzTest39.FuzzTest_addElement(intUnionFind40, intUnionFind41, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addElement(intUnionFind44, intUnionFind45, (java.lang.Integer) 2);
        fuzzTest25.FuzzTest_addElement(intUnionFind36, intUnionFind44, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = null;
        fuzzTest51.FuzzTest_addElement(intUnionFind52, intUnionFind53, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_addElement(intUnionFind56, intUnionFind57, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_addElement(intUnionFind56, intUnionFind60, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addElement(intUnionFind56, intUnionFind63, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        fuzzTest68.FuzzTest_addElement(intUnionFind69, intUnionFind70, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_addElement(intUnionFind73, intUnionFind74, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_addElement(intUnionFind73, intUnionFind77, (java.lang.Integer) (-1));
        fuzzTest25.FuzzTest_addElement(intUnionFind66, intUnionFind77, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind77, intUnionFind82, (java.lang.Integer) (-1));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind3, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind6, intUnionFind10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_addElement(intUnionFind19, intUnionFind23, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind23, intUnionFind26, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = null;
        fuzzTest29.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addElement(intUnionFind34, intUnionFind35, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = null;
        fuzzTest40.FuzzTest_addElement(intUnionFind41, intUnionFind42, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_addElement(intUnionFind45, intUnionFind46, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addElement(intUnionFind45, intUnionFind49, (java.lang.Integer) (-1));
        fuzzTest29.FuzzTest_addElement(intUnionFind38, intUnionFind49, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        fuzzTest56.FuzzTest_addElement(intUnionFind57, intUnionFind58, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_addElement(intUnionFind61, intUnionFind62, (java.lang.Integer) 2);
        fuzzTest54.FuzzTest_addElement(intUnionFind55, intUnionFind61, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = null;
        fuzzTest69.FuzzTest_addElement(intUnionFind70, intUnionFind71, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_addElement(intUnionFind74, intUnionFind75, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_addElement(intUnionFind74, intUnionFind78, (java.lang.Integer) (-1));
        fuzzTest54.FuzzTest_addElement(intUnionFind67, intUnionFind78, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind49, intUnionFind78, (java.lang.Integer) 10);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind19, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        fuzzTest26.FuzzTest_addElement(intUnionFind27, intUnionFind28, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_addElement(intUnionFind31, intUnionFind32, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addElement(intUnionFind31, intUnionFind35, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind31, intUnionFind38, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = null;
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = null;
        fuzzTest53.FuzzTest_addElement(intUnionFind54, intUnionFind55, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_addElement(intUnionFind58, intUnionFind59, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_addElement(intUnionFind58, intUnionFind62, (java.lang.Integer) (-1));
        fuzzTest42.FuzzTest_addElement(intUnionFind51, intUnionFind62, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind41, intUnionFind62, (java.lang.Integer) (-1));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind3, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind6, intUnionFind10, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind13, intUnionFind20, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzzTest25.FuzzTest_addElement(intUnionFind26, intUnionFind27, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind31, intUnionFind34, (java.lang.Integer) 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = null;
        fuzzTest9.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        fuzzTest23.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 2);
        fuzzTest9.FuzzTest_addElement(intUnionFind20, intUnionFind28, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind28, intUnionFind34, (java.lang.Integer) 1);
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind37, intUnionFind38, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind41, intUnionFind42, (java.lang.Integer) 0);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        fuzzTest3.FuzzTest_addElement(intUnionFind4, intUnionFind5, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_addElement(intUnionFind8, intUnionFind9, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind8, intUnionFind12, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = null;
        fuzzTest20.FuzzTest_addElement(intUnionFind21, intUnionFind22, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = null;
        fuzzTest29.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addElement(intUnionFind34, intUnionFind35, (java.lang.Integer) 2);
        fuzzTest15.FuzzTest_addElement(intUnionFind26, intUnionFind34, (java.lang.Integer) 100);
        fuzzTest1.FuzzTest_addElement(intUnionFind12, intUnionFind34, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = null;
        fuzzTest48.FuzzTest_addElement(intUnionFind49, intUnionFind50, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_addElement(intUnionFind53, intUnionFind54, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addElement(intUnionFind53, intUnionFind57, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = null;
        fuzzTest61.FuzzTest_addElement(intUnionFind62, intUnionFind63, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_addElement(intUnionFind66, intUnionFind67, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_addElement(intUnionFind66, intUnionFind70, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = null;
        fuzzTest47.FuzzTest_addElement(intUnionFind70, intUnionFind73, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind73, intUnionFind76, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind12, intUnionFind76, (java.lang.Integer) 100);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind19, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        fuzzTest26.FuzzTest_addElement(intUnionFind27, intUnionFind28, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_addElement(intUnionFind31, intUnionFind32, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addElement(intUnionFind31, intUnionFind35, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind31, intUnionFind38, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind41, intUnionFind42, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        fuzzTest45.FuzzTest_addElement(intUnionFind46, intUnionFind47, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_addElement(intUnionFind50, intUnionFind51, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind51, intUnionFind54, (java.lang.Integer) 10);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_addElement(intUnionFind3, intUnionFind4, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind9 = null;
        fuzzTest7.FuzzTest_addElement(intUnionFind8, intUnionFind9, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_addElement(intUnionFind12, intUnionFind13, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind18 = null;
        fuzzTest16.FuzzTest_addElement(intUnionFind17, intUnionFind18, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_addElement(intUnionFind21, intUnionFind22, (java.lang.Integer) 2);
        fuzzTest2.FuzzTest_addElement(intUnionFind13, intUnionFind21, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_addElement(intUnionFind33, intUnionFind37, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind33, intUnionFind40, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        fuzzTest45.FuzzTest_addElement(intUnionFind46, intUnionFind47, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_addElement(intUnionFind50, intUnionFind51, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addElement(intUnionFind50, intUnionFind54, (java.lang.Integer) (-1));
        fuzzTest2.FuzzTest_addElement(intUnionFind43, intUnionFind54, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind54, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = null;
        fuzzTest64.FuzzTest_addElement(intUnionFind65, intUnionFind66, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_addElement(intUnionFind69, intUnionFind70, (java.lang.Integer) 2);
        fuzzTest62.FuzzTest_addElement(intUnionFind63, intUnionFind69, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind61, intUnionFind63, (java.lang.Integer) 0);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_addElement(intUnionFind3, intUnionFind4, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind7, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind20, intUnionFind24, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_addElement(intUnionFind13, intUnionFind24, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = null;
        fuzzTest30.FuzzTest_addElement(intUnionFind31, intUnionFind32, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_addElement(intUnionFind35, intUnionFind36, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = null;
        fuzzTest39.FuzzTest_addElement(intUnionFind40, intUnionFind41, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = null;
        fuzzTest44.FuzzTest_addElement(intUnionFind45, intUnionFind46, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addElement(intUnionFind49, intUnionFind50, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = null;
        fuzzTest53.FuzzTest_addElement(intUnionFind54, intUnionFind55, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_addElement(intUnionFind58, intUnionFind59, (java.lang.Integer) 2);
        fuzzTest39.FuzzTest_addElement(intUnionFind50, intUnionFind58, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_addElement(intUnionFind58, intUnionFind64, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_addElement(intUnionFind29, intUnionFind64, (java.lang.Integer) 1);
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind69, intUnionFind70, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind76 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind77 = null;
        fuzzTest75.FuzzTest_addElement(intUnionFind76, intUnionFind77, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind80 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest75.FuzzTest_addElement(intUnionFind80, intUnionFind81, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_addElement(intUnionFind80, intUnionFind84, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind73, intUnionFind84, (java.lang.Integer) 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind3, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 2);
        fuzzTest1.FuzzTest_addElement(intUnionFind12, intUnionFind20, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        fuzzTest27.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_addElement(intUnionFind32, intUnionFind33, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_addElement(intUnionFind32, intUnionFind36, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addElement(intUnionFind32, intUnionFind39, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = null;
        fuzzTest44.FuzzTest_addElement(intUnionFind45, intUnionFind46, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addElement(intUnionFind49, intUnionFind50, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_addElement(intUnionFind49, intUnionFind53, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_addElement(intUnionFind42, intUnionFind53, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = null;
        fuzzTest58.FuzzTest_addElement(intUnionFind59, intUnionFind60, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = null;
        fuzzTest63.FuzzTest_addElement(intUnionFind64, intUnionFind65, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_addElement(intUnionFind68, intUnionFind69, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = null;
        fuzzTest72.FuzzTest_addElement(intUnionFind73, intUnionFind74, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind77 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_addElement(intUnionFind77, intUnionFind78, (java.lang.Integer) 2);
        fuzzTest58.FuzzTest_addElement(intUnionFind69, intUnionFind77, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind53, intUnionFind69, (java.lang.Integer) 1);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_addElement(intUnionFind3, intUnionFind4, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind7, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        fuzzTest19.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        fuzzTest14.FuzzTest_addElement(intUnionFind25, intUnionFind33, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_addElement(intUnionFind13, intUnionFind33, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_addElement(intUnionFind47, intUnionFind51, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        fuzzTest56.FuzzTest_addElement(intUnionFind57, intUnionFind58, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_addElement(intUnionFind61, intUnionFind62, (java.lang.Integer) 2);
        fuzzTest54.FuzzTest_addElement(intUnionFind55, intUnionFind61, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind51, intUnionFind55, (java.lang.Integer) 1);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind19, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        fuzzTest26.FuzzTest_addElement(intUnionFind27, intUnionFind28, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_addElement(intUnionFind31, intUnionFind32, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addElement(intUnionFind31, intUnionFind35, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind31, intUnionFind38, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = null;
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = null;
        fuzzTest43.FuzzTest_addElement(intUnionFind44, intUnionFind45, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_addElement(intUnionFind48, intUnionFind49, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind48, intUnionFind52, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_addElement(intUnionFind41, intUnionFind52, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = null;
        fuzzTest58.FuzzTest_addElement(intUnionFind59, intUnionFind60, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addElement(intUnionFind63, intUnionFind64, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = null;
        fuzzTest69.FuzzTest_addElement(intUnionFind70, intUnionFind71, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_addElement(intUnionFind74, intUnionFind75, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_addElement(intUnionFind74, intUnionFind78, (java.lang.Integer) (-1));
        fuzzTest58.FuzzTest_addElement(intUnionFind67, intUnionFind78, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_addElement(intUnionFind57, intUnionFind67, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind86 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind85, intUnionFind86, (java.lang.Integer) 100);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = null;
        fuzzTest9.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        fuzzTest23.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 2);
        fuzzTest9.FuzzTest_addElement(intUnionFind20, intUnionFind28, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind28, intUnionFind34, (java.lang.Integer) 1);
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind37, intUnionFind38, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = null;
        fuzzTest47.FuzzTest_addElement(intUnionFind48, intUnionFind49, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addElement(intUnionFind52, intUnionFind53, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        fuzzTest56.FuzzTest_addElement(intUnionFind57, intUnionFind58, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_addElement(intUnionFind61, intUnionFind62, (java.lang.Integer) 2);
        fuzzTest42.FuzzTest_addElement(intUnionFind53, intUnionFind61, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind41, intUnionFind53, (java.lang.Integer) (-1));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind19, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzzTest25.FuzzTest_addElement(intUnionFind26, intUnionFind27, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = null;
        fuzzTest34.FuzzTest_addElement(intUnionFind35, intUnionFind36, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = null;
        fuzzTest39.FuzzTest_addElement(intUnionFind40, intUnionFind41, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addElement(intUnionFind44, intUnionFind45, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = null;
        fuzzTest48.FuzzTest_addElement(intUnionFind49, intUnionFind50, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_addElement(intUnionFind53, intUnionFind54, (java.lang.Integer) 2);
        fuzzTest34.FuzzTest_addElement(intUnionFind45, intUnionFind53, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_addElement(intUnionFind53, intUnionFind59, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = null;
        fuzzTest64.FuzzTest_addElement(intUnionFind65, intUnionFind66, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_addElement(intUnionFind69, intUnionFind70, (java.lang.Integer) 2);
        fuzzTest62.FuzzTest_addElement(intUnionFind63, intUnionFind69, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = null;
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind77 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind78 = null;
        fuzzTest76.FuzzTest_addElement(intUnionFind77, intUnionFind78, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind81 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind82 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_addElement(intUnionFind81, intUnionFind82, (java.lang.Integer) 2);
        fuzzTest62.FuzzTest_addElement(intUnionFind75, intUnionFind82, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind59, intUnionFind82, (java.lang.Integer) 1);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = null;
        fuzzTest9.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        fuzzTest23.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 2);
        fuzzTest9.FuzzTest_addElement(intUnionFind20, intUnionFind28, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind28, intUnionFind34, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = null;
        fuzzTest37.FuzzTest_addElement(intUnionFind38, intUnionFind39, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = null;
        fuzzTest51.FuzzTest_addElement(intUnionFind52, intUnionFind53, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_addElement(intUnionFind56, intUnionFind57, (java.lang.Integer) 2);
        fuzzTest37.FuzzTest_addElement(intUnionFind48, intUnionFind56, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = null;
        fuzzTest63.FuzzTest_addElement(intUnionFind64, intUnionFind65, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_addElement(intUnionFind68, intUnionFind69, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_addElement(intUnionFind68, intUnionFind72, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_addElement(intUnionFind68, intUnionFind75, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind79 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind80 = null;
        fuzzTest78.FuzzTest_addElement(intUnionFind79, intUnionFind80, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind83 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_addElement(intUnionFind83, intUnionFind84, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind75, intUnionFind84, (java.lang.Integer) 2);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind3, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind6, intUnionFind10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 2);
        fuzzTest13.FuzzTest_addElement(intUnionFind14, intUnionFind20, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_addElement(intUnionFind33, intUnionFind37, (java.lang.Integer) (-1));
        fuzzTest13.FuzzTest_addElement(intUnionFind26, intUnionFind37, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = null;
        fuzzTest43.FuzzTest_addElement(intUnionFind44, intUnionFind45, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_addElement(intUnionFind48, intUnionFind49, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind48, intUnionFind52, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_addElement(intUnionFind26, intUnionFind48, (java.lang.Integer) 1);
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = null;
        fuzzTest58.FuzzTest_addElement(intUnionFind59, intUnionFind60, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addElement(intUnionFind63, intUnionFind64, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = null;
        fuzzTest69.FuzzTest_addElement(intUnionFind70, intUnionFind71, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_addElement(intUnionFind74, intUnionFind75, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_addElement(intUnionFind74, intUnionFind78, (java.lang.Integer) (-1));
        fuzzTest58.FuzzTest_addElement(intUnionFind67, intUnionFind78, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind57, intUnionFind78, (java.lang.Integer) 2);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind11, intUnionFind12, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind11, intUnionFind15, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind18, intUnionFind19, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind23 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        fuzzTest22.FuzzTest_addElement(intUnionFind23, intUnionFind24, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = null;
        fuzzTest29.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addElement(intUnionFind34, intUnionFind35, (java.lang.Integer) 2);
        fuzzTest27.FuzzTest_addElement(intUnionFind28, intUnionFind34, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_addElement(intUnionFind47, intUnionFind51, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        fuzzTest54.FuzzTest_addElement(intUnionFind55, intUnionFind56, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = null;
        fuzzTest59.FuzzTest_addElement(intUnionFind60, intUnionFind61, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_addElement(intUnionFind64, intUnionFind65, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        fuzzTest68.FuzzTest_addElement(intUnionFind69, intUnionFind70, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_addElement(intUnionFind73, intUnionFind74, (java.lang.Integer) 2);
        fuzzTest54.FuzzTest_addElement(intUnionFind65, intUnionFind73, (java.lang.Integer) 100);
        fuzzTest40.FuzzTest_addElement(intUnionFind51, intUnionFind73, (java.lang.Integer) 0);
        fuzzTest22.FuzzTest_addElement(intUnionFind28, intUnionFind73, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind19, intUnionFind28, (java.lang.Integer) 100);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = null;
        fuzzTest9.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        fuzzTest23.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 2);
        fuzzTest9.FuzzTest_addElement(intUnionFind20, intUnionFind28, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind28, intUnionFind34, (java.lang.Integer) 1);
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind37, intUnionFind38, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = null;
        fuzzTest47.FuzzTest_addElement(intUnionFind48, intUnionFind49, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addElement(intUnionFind52, intUnionFind53, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        fuzzTest56.FuzzTest_addElement(intUnionFind57, intUnionFind58, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_addElement(intUnionFind61, intUnionFind62, (java.lang.Integer) 2);
        fuzzTest42.FuzzTest_addElement(intUnionFind53, intUnionFind61, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = null;
        fuzzTest42.FuzzTest_addElement(intUnionFind67, intUnionFind68, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = null;
        fuzzTest73.FuzzTest_addElement(intUnionFind74, intUnionFind75, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind78 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_addElement(intUnionFind78, intUnionFind79, (java.lang.Integer) 2);
        fuzzTest71.FuzzTest_addElement(intUnionFind72, intUnionFind78, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind84 = null;
        fuzzTest42.FuzzTest_addElement(intUnionFind72, intUnionFind84, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind87 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_addElement(intUnionFind87, intUnionFind88, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind41, intUnionFind88, (java.lang.Integer) (-1));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_addElement(intUnionFind3, intUnionFind4, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind7, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        fuzzTest19.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        fuzzTest14.FuzzTest_addElement(intUnionFind25, intUnionFind33, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_addElement(intUnionFind13, intUnionFind33, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = null;
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = null;
        fuzzTest47.FuzzTest_addElement(intUnionFind48, intUnionFind49, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addElement(intUnionFind52, intUnionFind53, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        fuzzTest56.FuzzTest_addElement(intUnionFind57, intUnionFind58, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_addElement(intUnionFind61, intUnionFind62, (java.lang.Integer) 2);
        fuzzTest42.FuzzTest_addElement(intUnionFind53, intUnionFind61, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_addElement(intUnionFind41, intUnionFind61, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind69, intUnionFind70, (java.lang.Integer) 2);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind19, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = null;
        fuzzTest30.FuzzTest_addElement(intUnionFind31, intUnionFind32, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = null;
        fuzzTest35.FuzzTest_addElement(intUnionFind36, intUnionFind37, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_addElement(intUnionFind40, intUnionFind41, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = null;
        fuzzTest44.FuzzTest_addElement(intUnionFind45, intUnionFind46, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addElement(intUnionFind49, intUnionFind50, (java.lang.Integer) 2);
        fuzzTest30.FuzzTest_addElement(intUnionFind41, intUnionFind49, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_addElement(intUnionFind29, intUnionFind41, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = null;
        fuzzTest58.FuzzTest_addElement(intUnionFind59, intUnionFind60, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = null;
        fuzzTest63.FuzzTest_addElement(intUnionFind64, intUnionFind65, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_addElement(intUnionFind68, intUnionFind69, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = null;
        fuzzTest72.FuzzTest_addElement(intUnionFind73, intUnionFind74, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind77 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_addElement(intUnionFind77, intUnionFind78, (java.lang.Integer) 2);
        fuzzTest58.FuzzTest_addElement(intUnionFind69, intUnionFind77, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind57, intUnionFind69, (java.lang.Integer) 2);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind3, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind9 = null;
        fuzzTest7.FuzzTest_addElement(intUnionFind8, intUnionFind9, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_addElement(intUnionFind12, intUnionFind13, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind18 = null;
        fuzzTest16.FuzzTest_addElement(intUnionFind17, intUnionFind18, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind23 = null;
        fuzzTest21.FuzzTest_addElement(intUnionFind22, intUnionFind23, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_addElement(intUnionFind26, intUnionFind27, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = null;
        fuzzTest30.FuzzTest_addElement(intUnionFind31, intUnionFind32, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_addElement(intUnionFind35, intUnionFind36, (java.lang.Integer) 2);
        fuzzTest16.FuzzTest_addElement(intUnionFind27, intUnionFind35, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_addElement(intUnionFind35, intUnionFind41, (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_addElement(intUnionFind6, intUnionFind35, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = null;
        fuzzTest46.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addElement(intUnionFind51, intUnionFind52, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        fuzzTest55.FuzzTest_addElement(intUnionFind56, intUnionFind57, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = null;
        fuzzTest60.FuzzTest_addElement(intUnionFind61, intUnionFind62, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_addElement(intUnionFind65, intUnionFind66, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = null;
        fuzzTest69.FuzzTest_addElement(intUnionFind70, intUnionFind71, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_addElement(intUnionFind74, intUnionFind75, (java.lang.Integer) 2);
        fuzzTest55.FuzzTest_addElement(intUnionFind66, intUnionFind74, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addElement(intUnionFind74, intUnionFind80, (java.lang.Integer) 1);
        naturalness.UnionFind<java.lang.Integer> intUnionFind83 = null;
        fuzzTest1.FuzzTest_addElement(intUnionFind80, intUnionFind83, (java.lang.Integer) 10);
        naturalness.UnionFind<java.lang.Integer> intUnionFind86 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind80, intUnionFind86, (java.lang.Integer) 1);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_addElement(intUnionFind3, intUnionFind4, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_addElement(intUnionFind7, intUnionFind8, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind7, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 2);
        fuzzTest13.FuzzTest_addElement(intUnionFind14, intUnionFind20, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        fuzzTest26.FuzzTest_addElement(intUnionFind27, intUnionFind28, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = null;
        fuzzTest33.FuzzTest_addElement(intUnionFind34, intUnionFind35, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_addElement(intUnionFind38, intUnionFind39, (java.lang.Integer) 2);
        fuzzTest31.FuzzTest_addElement(intUnionFind32, intUnionFind38, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = null;
        fuzzTest46.FuzzTest_addElement(intUnionFind47, intUnionFind48, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_addElement(intUnionFind51, intUnionFind52, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_addElement(intUnionFind51, intUnionFind55, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = null;
        fuzzTest58.FuzzTest_addElement(intUnionFind59, intUnionFind60, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = null;
        fuzzTest63.FuzzTest_addElement(intUnionFind64, intUnionFind65, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_addElement(intUnionFind68, intUnionFind69, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = null;
        fuzzTest72.FuzzTest_addElement(intUnionFind73, intUnionFind74, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind77 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_addElement(intUnionFind77, intUnionFind78, (java.lang.Integer) 2);
        fuzzTest58.FuzzTest_addElement(intUnionFind69, intUnionFind77, (java.lang.Integer) 100);
        fuzzTest44.FuzzTest_addElement(intUnionFind55, intUnionFind77, (java.lang.Integer) 0);
        fuzzTest26.FuzzTest_addElement(intUnionFind32, intUnionFind77, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_addElement(intUnionFind20, intUnionFind32, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind89 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind90 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind89, intUnionFind90, (java.lang.Integer) 1);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        fuzzTest3.FuzzTest_addElement(intUnionFind4, intUnionFind5, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_addElement(intUnionFind8, intUnionFind9, (java.lang.Integer) 2);
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind8, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind20, intUnionFind24, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        fuzzTest14.FuzzTest_addElement(intUnionFind27, intUnionFind34, (java.lang.Integer) 10);
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = null;
        fuzzTest40.FuzzTest_addElement(intUnionFind41, intUnionFind42, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        fuzzTest45.FuzzTest_addElement(intUnionFind46, intUnionFind47, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_addElement(intUnionFind50, intUnionFind51, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        fuzzTest54.FuzzTest_addElement(intUnionFind55, intUnionFind56, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_addElement(intUnionFind59, intUnionFind60, (java.lang.Integer) 2);
        fuzzTest40.FuzzTest_addElement(intUnionFind51, intUnionFind59, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = null;
        fuzzTest66.FuzzTest_addElement(intUnionFind67, intUnionFind68, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_addElement(intUnionFind71, intUnionFind72, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_addElement(intUnionFind71, intUnionFind75, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_addElement(intUnionFind71, intUnionFind78, (java.lang.Integer) (-1));
        fuzzTest14.FuzzTest_addElement(intUnionFind39, intUnionFind78, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind2, intUnionFind78, (java.lang.Integer) (-1));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind6, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind9 = null;
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzzTest11.FuzzTest_addElement(intUnionFind12, intUnionFind13, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest10.FuzzTest_addElement(intUnionFind16, intUnionFind20, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_addElement(intUnionFind9, intUnionFind20, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        fuzzTest27.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind32 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_addElement(intUnionFind32, intUnionFind33, (java.lang.Integer) 2);
        fuzzTest25.FuzzTest_addElement(intUnionFind26, intUnionFind32, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = null;
        fuzzTest40.FuzzTest_addElement(intUnionFind41, intUnionFind42, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_addElement(intUnionFind45, intUnionFind46, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addElement(intUnionFind45, intUnionFind49, (java.lang.Integer) (-1));
        fuzzTest25.FuzzTest_addElement(intUnionFind38, intUnionFind49, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        fuzzTest54.FuzzTest_addElement(intUnionFind55, intUnionFind56, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_addElement(intUnionFind59, intUnionFind60, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind66 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = null;
        fuzzTest65.FuzzTest_addElement(intUnionFind66, intUnionFind67, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_addElement(intUnionFind70, intUnionFind71, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_addElement(intUnionFind70, intUnionFind74, (java.lang.Integer) (-1));
        fuzzTest54.FuzzTest_addElement(intUnionFind63, intUnionFind74, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind49, intUnionFind74, (java.lang.Integer) 0);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        fuzzTest19.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest19.FuzzTest_addElement(intUnionFind24, intUnionFind25, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        fuzzTest14.FuzzTest_addElement(intUnionFind25, intUnionFind33, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind39, intUnionFind40, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        fuzzTest45.FuzzTest_addElement(intUnionFind46, intUnionFind47, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_addElement(intUnionFind50, intUnionFind51, (java.lang.Integer) 2);
        fuzzTest43.FuzzTest_addElement(intUnionFind44, intUnionFind50, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind56 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind44, intUnionFind56, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind44, (java.lang.Integer) 1);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzzTest5.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest5.FuzzTest_addElement(intUnionFind10, intUnionFind11, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_addElement(intUnionFind11, intUnionFind19, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        fuzzTest27.FuzzTest_addElement(intUnionFind28, intUnionFind29, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = null;
        fuzzTest32.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_addElement(intUnionFind37, intUnionFind38, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        fuzzTest41.FuzzTest_addElement(intUnionFind42, intUnionFind43, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_addElement(intUnionFind46, intUnionFind47, (java.lang.Integer) 2);
        fuzzTest27.FuzzTest_addElement(intUnionFind38, intUnionFind46, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = null;
        fuzzTest53.FuzzTest_addElement(intUnionFind54, intUnionFind55, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_addElement(intUnionFind58, intUnionFind59, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_addElement(intUnionFind58, intUnionFind62, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_addElement(intUnionFind58, intUnionFind65, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = null;
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind71 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = null;
        fuzzTest70.FuzzTest_addElement(intUnionFind71, intUnionFind72, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind75 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_addElement(intUnionFind75, intUnionFind76, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_addElement(intUnionFind75, intUnionFind79, (java.lang.Integer) (-1));
        fuzzTest27.FuzzTest_addElement(intUnionFind68, intUnionFind79, (java.lang.Integer) 2);
        fuzzTest25.FuzzTest_addElement(intUnionFind26, intUnionFind79, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind86 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind79, intUnionFind86, (java.lang.Integer) (-1));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind4 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        fuzzTest3.FuzzTest_addElement(intUnionFind4, intUnionFind5, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind9 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = null;
        fuzzTest8.FuzzTest_addElement(intUnionFind9, intUnionFind10, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_addElement(intUnionFind13, intUnionFind14, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        fuzzTest17.FuzzTest_addElement(intUnionFind18, intUnionFind19, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_addElement(intUnionFind22, intUnionFind23, (java.lang.Integer) 2);
        fuzzTest3.FuzzTest_addElement(intUnionFind14, intUnionFind22, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = null;
        fuzzTest38.FuzzTest_addElement(intUnionFind39, intUnionFind40, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_addElement(intUnionFind43, intUnionFind47, (java.lang.Integer) (-1));
        fuzzTest3.FuzzTest_addElement(intUnionFind34, intUnionFind43, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = null;
        fuzzTest2.FuzzTest_addElement(intUnionFind34, intUnionFind52, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind52, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind60 = null;
        fuzzTest58.FuzzTest_addElement(intUnionFind59, intUnionFind60, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_addElement(intUnionFind63, intUnionFind64, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_addElement(intUnionFind63, intUnionFind67, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = null;
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = null;
        fuzzTest71.FuzzTest_addElement(intUnionFind72, intUnionFind73, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind76 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_addElement(intUnionFind76, intUnionFind77, (java.lang.Integer) 2);
        fuzzTest57.FuzzTest_addElement(intUnionFind70, intUnionFind77, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind84 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind85 = null;
        fuzzTest83.FuzzTest_addElement(intUnionFind84, intUnionFind85, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind88 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest83.FuzzTest_addElement(intUnionFind88, intUnionFind89, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind92 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_addElement(intUnionFind88, intUnionFind92, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind77, intUnionFind92, (java.lang.Integer) 1);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind1, intUnionFind2, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind5 = null;
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind8 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind9 = null;
        fuzzTest7.FuzzTest_addElement(intUnionFind8, intUnionFind9, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_addElement(intUnionFind12, intUnionFind13, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_addElement(intUnionFind12, intUnionFind16, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind22 = null;
        fuzzTest20.FuzzTest_addElement(intUnionFind21, intUnionFind22, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind25 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_addElement(intUnionFind25, intUnionFind26, (java.lang.Integer) 2);
        fuzzTest6.FuzzTest_addElement(intUnionFind19, intUnionFind26, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_addElement(intUnionFind5, intUnionFind26, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = null;
        fuzzTest33.FuzzTest_addElement(intUnionFind34, intUnionFind35, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind41 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind42 = null;
        fuzzTest40.FuzzTest_addElement(intUnionFind41, intUnionFind42, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_addElement(intUnionFind45, intUnionFind46, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_addElement(intUnionFind45, intUnionFind49, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = null;
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind55 = null;
        fuzzTest53.FuzzTest_addElement(intUnionFind54, intUnionFind55, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_addElement(intUnionFind58, intUnionFind59, (java.lang.Integer) 2);
        fuzzTest39.FuzzTest_addElement(intUnionFind52, intUnionFind59, (java.lang.Integer) 10);
        fuzzTest33.FuzzTest_addElement(intUnionFind38, intUnionFind59, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = null;
        fuzzTest66.FuzzTest_addElement(intUnionFind67, intUnionFind68, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = null;
        fuzzTest71.FuzzTest_addElement(intUnionFind72, intUnionFind73, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind76 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_addElement(intUnionFind76, intUnionFind77, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind81 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind82 = null;
        fuzzTest80.FuzzTest_addElement(intUnionFind81, intUnionFind82, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind85 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest80.FuzzTest_addElement(intUnionFind85, intUnionFind86, (java.lang.Integer) 2);
        fuzzTest66.FuzzTest_addElement(intUnionFind77, intUnionFind85, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind59, intUnionFind77, (java.lang.Integer) (-1));
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind3, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind6, intUnionFind10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_addElement(intUnionFind15, intUnionFind16, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_addElement(intUnionFind19, intUnionFind20, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_addElement(intUnionFind19, intUnionFind23, (java.lang.Integer) (-1));
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        fuzzTest0.FuzzTest_addElement(intUnionFind23, intUnionFind26, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind31 = null;
        fuzzTest29.FuzzTest_addElement(intUnionFind30, intUnionFind31, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_addElement(intUnionFind34, intUnionFind35, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind39 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind40 = null;
        fuzzTest38.FuzzTest_addElement(intUnionFind39, intUnionFind40, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind46 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind47 = null;
        fuzzTest45.FuzzTest_addElement(intUnionFind46, intUnionFind47, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind50 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_addElement(intUnionFind50, intUnionFind51, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_addElement(intUnionFind50, intUnionFind54, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind59 = null;
        fuzzTest57.FuzzTest_addElement(intUnionFind58, intUnionFind59, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind63 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind64 = null;
        fuzzTest62.FuzzTest_addElement(intUnionFind63, intUnionFind64, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind67 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_addElement(intUnionFind67, intUnionFind68, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind72 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind73 = null;
        fuzzTest71.FuzzTest_addElement(intUnionFind72, intUnionFind73, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind76 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_addElement(intUnionFind76, intUnionFind77, (java.lang.Integer) 2);
        fuzzTest57.FuzzTest_addElement(intUnionFind68, intUnionFind76, (java.lang.Integer) 100);
        fuzzTest43.FuzzTest_addElement(intUnionFind54, intUnionFind76, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind84 = null;
        fuzzTest38.FuzzTest_addElement(intUnionFind76, intUnionFind84, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind87 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind88 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_addElement(intUnionFind87, intUnionFind88, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind35, intUnionFind88, (java.lang.Integer) 1);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_addElement(intUnionFind2, intUnionFind3, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_addElement(intUnionFind6, intUnionFind7, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_addElement(intUnionFind6, intUnionFind10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest15.FuzzTest_addElement(intUnionFind16, intUnionFind17, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_addElement(intUnionFind20, intUnionFind21, (java.lang.Integer) 2);
        fuzzTest13.FuzzTest_addElement(intUnionFind14, intUnionFind20, (java.lang.Integer) 100);
        naturalness.UnionFind<java.lang.Integer> intUnionFind26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_addElement(intUnionFind29, intUnionFind30, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_addElement(intUnionFind33, intUnionFind34, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_addElement(intUnionFind33, intUnionFind37, (java.lang.Integer) (-1));
        fuzzTest13.FuzzTest_addElement(intUnionFind26, intUnionFind37, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_addElement(intUnionFind43, intUnionFind44, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind48 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind49 = null;
        fuzzTest47.FuzzTest_addElement(intUnionFind48, intUnionFind49, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind52 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_addElement(intUnionFind52, intUnionFind53, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.UnionFind<java.lang.Integer> intUnionFind57 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind58 = null;
        fuzzTest56.FuzzTest_addElement(intUnionFind57, intUnionFind58, (java.lang.Integer) 0);
        naturalness.UnionFind<java.lang.Integer> intUnionFind61 = null;
        naturalness.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_addElement(intUnionFind61, intUnionFind62, (java.lang.Integer) 2);
        fuzzTest42.FuzzTest_addElement(intUnionFind53, intUnionFind61, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_addElement(intUnionFind37, intUnionFind61, (java.lang.Integer) 2);
        naturalness.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addElement(intUnionFind69, intUnionFind70, (java.lang.Integer) 0);
    }
}

