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
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        fuzzTest17.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_union(intUnionFind12, intUnionFind24, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        fuzzTest31.FuzzTest_union(intUnionFind32, intUnionFind33, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = null;
        fuzzTest37.FuzzTest_union(intUnionFind38, intUnionFind39, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_union(intUnionFind43, intUnionFind44, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = null;
        fuzzTest48.FuzzTest_union(intUnionFind49, intUnionFind50, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_union(intUnionFind54, intUnionFind55, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest31.FuzzTest_union(intUnionFind43, intUnionFind55, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind63 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = null;
        fuzzTest62.FuzzTest_union(intUnionFind63, intUnionFind64, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind68 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_union(intUnionFind68, intUnionFind69, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind74 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind75 = null;
        fuzzTest73.FuzzTest_union(intUnionFind74, intUnionFind75, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind79 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_union(intUnionFind79, intUnionFind80, (java.lang.Integer) 1, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind84 = null;
        fuzzTest62.FuzzTest_union(intUnionFind80, intUnionFind84, (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind55, intUnionFind80, (java.lang.Integer) 2, (java.lang.Integer) (-1));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        fuzzTest17.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_union(intUnionFind29, intUnionFind30, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind36 = null;
        fuzzTest34.FuzzTest_union(intUnionFind35, intUnionFind36, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_union(intUnionFind40, intUnionFind41, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind47 = null;
        fuzzTest45.FuzzTest_union(intUnionFind46, intUnionFind47, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_union(intUnionFind51, intUnionFind52, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest28.FuzzTest_union(intUnionFind40, intUnionFind52, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest6.FuzzTest_union(intUnionFind24, intUnionFind52, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind65 = null;
        fuzzTest63.FuzzTest_union(intUnionFind64, intUnionFind65, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind69 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_union(intUnionFind69, intUnionFind70, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind75 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind76 = null;
        fuzzTest74.FuzzTest_union(intUnionFind75, intUnionFind76, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_union(intUnionFind80, intUnionFind81, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest62.FuzzTest_union(intUnionFind70, intUnionFind81, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind52, intUnionFind81, (java.lang.Integer) (-1), (java.lang.Integer) 10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_union(intUnionFind2, intUnionFind3, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        fuzzTest12.FuzzTest_union(intUnionFind13, intUnionFind14, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_union(intUnionFind8, intUnionFind19, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = null;
        fuzzTest26.FuzzTest_union(intUnionFind27, intUnionFind28, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_union(intUnionFind32, intUnionFind33, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = null;
        fuzzTest37.FuzzTest_union(intUnionFind38, intUnionFind39, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_union(intUnionFind43, intUnionFind44, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = null;
        fuzzTest48.FuzzTest_union(intUnionFind49, intUnionFind50, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind54 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_union(intUnionFind54, intUnionFind55, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind60 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind61 = null;
        fuzzTest59.FuzzTest_union(intUnionFind60, intUnionFind61, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind66 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind67 = null;
        fuzzTest65.FuzzTest_union(intUnionFind66, intUnionFind67, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind71 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_union(intUnionFind71, intUnionFind72, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind77 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind78 = null;
        fuzzTest76.FuzzTest_union(intUnionFind77, intUnionFind78, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind82 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_union(intUnionFind82, intUnionFind83, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest59.FuzzTest_union(intUnionFind71, intUnionFind83, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest37.FuzzTest_union(intUnionFind55, intUnionFind83, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind33, intUnionFind83, (java.lang.Integer) (-1), (java.lang.Integer) 2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzzTest11.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_union(intUnionFind17, intUnionFind18, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = null;
        fuzzTest22.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_union(intUnionFind28, intUnionFind29, (java.lang.Integer) 1, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        fuzzTest11.FuzzTest_union(intUnionFind29, intUnionFind33, (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        fuzzTest38.FuzzTest_union(intUnionFind39, intUnionFind40, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_union(intUnionFind44, intUnionFind45, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = null;
        fuzzTest49.FuzzTest_union(intUnionFind50, intUnionFind51, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_union(intUnionFind55, intUnionFind56, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest37.FuzzTest_union(intUnionFind45, intUnionFind56, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind29, intUnionFind45, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        fuzzTest12.FuzzTest_union(intUnionFind13, intUnionFind14, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind25 = null;
        fuzzTest23.FuzzTest_union(intUnionFind24, intUnionFind25, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_union(intUnionFind29, intUnionFind30, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind36 = null;
        fuzzTest34.FuzzTest_union(intUnionFind35, intUnionFind36, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind42 = null;
        fuzzTest40.FuzzTest_union(intUnionFind41, intUnionFind42, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_union(intUnionFind46, intUnionFind47, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind52 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind53 = null;
        fuzzTest51.FuzzTest_union(intUnionFind52, intUnionFind53, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_union(intUnionFind57, intUnionFind58, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest34.FuzzTest_union(intUnionFind46, intUnionFind58, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest12.FuzzTest_union(intUnionFind30, intUnionFind58, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind11, intUnionFind30, (java.lang.Integer) 2, (java.lang.Integer) 1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_union(intUnionFind3, intUnionFind4, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_union(intUnionFind8, intUnionFind9, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind15 = null;
        fuzzTest13.FuzzTest_union(intUnionFind14, intUnionFind15, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_union(intUnionFind19, intUnionFind20, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_union(intUnionFind9, intUnionFind20, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzzTest0.FuzzTest_union(intUnionFind20, intUnionFind27, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        fuzzTest32.FuzzTest_union(intUnionFind33, intUnionFind34, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_union(intUnionFind38, intUnionFind39, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = null;
        fuzzTest43.FuzzTest_union(intUnionFind44, intUnionFind45, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_union(intUnionFind49, intUnionFind50, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest31.FuzzTest_union(intUnionFind39, intUnionFind50, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind59 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind60 = null;
        fuzzTest58.FuzzTest_union(intUnionFind59, intUnionFind60, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_union(intUnionFind64, intUnionFind65, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind70 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind71 = null;
        fuzzTest69.FuzzTest_union(intUnionFind70, intUnionFind71, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_union(intUnionFind75, intUnionFind76, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest57.FuzzTest_union(intUnionFind65, intUnionFind76, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind39, intUnionFind65, (java.lang.Integer) 10, (java.lang.Integer) 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        fuzzTest17.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_union(intUnionFind12, intUnionFind24, (java.lang.Integer) 1, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        fuzzTest32.FuzzTest_union(intUnionFind33, intUnionFind34, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_union(intUnionFind38, intUnionFind39, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = null;
        fuzzTest43.FuzzTest_union(intUnionFind44, intUnionFind45, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_union(intUnionFind49, intUnionFind50, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind56 = null;
        fuzzTest54.FuzzTest_union(intUnionFind55, intUnionFind56, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind61 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind62 = null;
        fuzzTest60.FuzzTest_union(intUnionFind61, intUnionFind62, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind66 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_union(intUnionFind66, intUnionFind67, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind72 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind73 = null;
        fuzzTest71.FuzzTest_union(intUnionFind72, intUnionFind73, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_union(intUnionFind77, intUnionFind78, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest54.FuzzTest_union(intUnionFind66, intUnionFind78, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest32.FuzzTest_union(intUnionFind50, intUnionFind78, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind31, intUnionFind50, (java.lang.Integer) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        fuzzTest17.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_union(intUnionFind12, intUnionFind24, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        fuzzTest31.FuzzTest_union(intUnionFind32, intUnionFind33, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind37 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_union(intUnionFind37, intUnionFind38, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_union(intUnionFind43, intUnionFind44, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind48 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_union(intUnionFind48, intUnionFind49, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind54 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = null;
        fuzzTest53.FuzzTest_union(intUnionFind54, intUnionFind55, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind60 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind61 = null;
        fuzzTest59.FuzzTest_union(intUnionFind60, intUnionFind61, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind65 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_union(intUnionFind65, intUnionFind66, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind71 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind72 = null;
        fuzzTest70.FuzzTest_union(intUnionFind71, intUnionFind72, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind76 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_union(intUnionFind76, intUnionFind77, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest53.FuzzTest_union(intUnionFind65, intUnionFind77, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest31.FuzzTest_union(intUnionFind49, intUnionFind77, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind77, intUnionFind87, (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_union(intUnionFind3, intUnionFind4, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_union(intUnionFind8, intUnionFind9, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind15 = null;
        fuzzTest13.FuzzTest_union(intUnionFind14, intUnionFind15, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_union(intUnionFind19, intUnionFind20, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_union(intUnionFind9, intUnionFind20, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzzTest0.FuzzTest_union(intUnionFind20, intUnionFind27, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        fuzzTest31.FuzzTest_union(intUnionFind32, intUnionFind33, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind37 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_union(intUnionFind37, intUnionFind38, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = null;
        fuzzTest43.FuzzTest_union(intUnionFind44, intUnionFind45, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_union(intUnionFind49, intUnionFind50, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind56 = null;
        fuzzTest54.FuzzTest_union(intUnionFind55, intUnionFind56, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_union(intUnionFind60, intUnionFind61, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest42.FuzzTest_union(intUnionFind50, intUnionFind61, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind38, intUnionFind50, (java.lang.Integer) 100, (java.lang.Integer) 10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind9 = null;
        fuzzTest7.FuzzTest_union(intUnionFind8, intUnionFind9, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_union(intUnionFind13, intUnionFind14, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind20 = null;
        fuzzTest18.FuzzTest_union(intUnionFind19, intUnionFind20, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_union(intUnionFind24, intUnionFind25, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest6.FuzzTest_union(intUnionFind14, intUnionFind25, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = null;
        fuzzTest33.FuzzTest_union(intUnionFind34, intUnionFind35, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = null;
        fuzzTest39.FuzzTest_union(intUnionFind40, intUnionFind41, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_union(intUnionFind45, intUnionFind46, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind52 = null;
        fuzzTest50.FuzzTest_union(intUnionFind51, intUnionFind52, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_union(intUnionFind56, intUnionFind57, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest33.FuzzTest_union(intUnionFind45, intUnionFind57, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind65 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind66 = null;
        fuzzTest64.FuzzTest_union(intUnionFind65, intUnionFind66, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_union(intUnionFind70, intUnionFind71, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest32.FuzzTest_union(intUnionFind45, intUnionFind71, (java.lang.Integer) 0, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind25, intUnionFind71, (java.lang.Integer) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzzTest11.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_union(intUnionFind17, intUnionFind18, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = null;
        fuzzTest22.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_union(intUnionFind29, intUnionFind30, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_union(intUnionFind34, intUnionFind35, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = null;
        fuzzTest39.FuzzTest_union(intUnionFind40, intUnionFind41, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_union(intUnionFind45, intUnionFind46, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest22.FuzzTest_union(intUnionFind34, intUnionFind46, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_union(intUnionFind18, intUnionFind46, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind58 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind59 = null;
        fuzzTest57.FuzzTest_union(intUnionFind58, intUnionFind59, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind63 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_union(intUnionFind63, intUnionFind64, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind69 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind70 = null;
        fuzzTest68.FuzzTest_union(intUnionFind69, intUnionFind70, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_union(intUnionFind74, intUnionFind75, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest56.FuzzTest_union(intUnionFind64, intUnionFind75, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind83 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind84 = null;
        fuzzTest82.FuzzTest_union(intUnionFind83, intUnionFind84, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind88 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_union(intUnionFind88, intUnionFind89, (java.lang.Integer) 1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind75, intUnionFind89, (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind9 = null;
        fuzzTest7.FuzzTest_union(intUnionFind8, intUnionFind9, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind15 = null;
        fuzzTest13.FuzzTest_union(intUnionFind14, intUnionFind15, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_union(intUnionFind19, intUnionFind20, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind25 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind26 = null;
        fuzzTest24.FuzzTest_union(intUnionFind25, intUnionFind26, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_union(intUnionFind30, intUnionFind31, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest7.FuzzTest_union(intUnionFind19, intUnionFind31, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        fuzzTest38.FuzzTest_union(intUnionFind39, intUnionFind40, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_union(intUnionFind44, intUnionFind45, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest6.FuzzTest_union(intUnionFind19, intUnionFind45, (java.lang.Integer) 0, (java.lang.Integer) 10);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind52 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_union(intUnionFind52, intUnionFind53, (java.lang.Integer) 1, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_union(intUnionFind57, intUnionFind58, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind63 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = null;
        fuzzTest62.FuzzTest_union(intUnionFind63, intUnionFind64, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind68 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_union(intUnionFind68, intUnionFind69, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind58, intUnionFind69, (java.lang.Integer) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        fuzzTest17.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_union(intUnionFind12, intUnionFind24, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        fuzzTest31.FuzzTest_union(intUnionFind32, intUnionFind33, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_union(intUnionFind37, intUnionFind38, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_union(intUnionFind43, intUnionFind44, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_union(intUnionFind48, intUnionFind49, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind37, intUnionFind48, (java.lang.Integer) 1, (java.lang.Integer) 2);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzzTest11.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_union(intUnionFind17, intUnionFind18, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = null;
        fuzzTest22.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_union(intUnionFind28, intUnionFind29, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = null;
        fuzzTest33.FuzzTest_union(intUnionFind34, intUnionFind35, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = null;
        fuzzTest39.FuzzTest_union(intUnionFind40, intUnionFind41, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_union(intUnionFind45, intUnionFind46, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind52 = null;
        fuzzTest50.FuzzTest_union(intUnionFind51, intUnionFind52, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_union(intUnionFind56, intUnionFind57, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest33.FuzzTest_union(intUnionFind45, intUnionFind57, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest11.FuzzTest_union(intUnionFind29, intUnionFind57, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind67 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind57, intUnionFind67, (java.lang.Integer) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzzTest11.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_union(intUnionFind17, intUnionFind18, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind25 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind26 = null;
        fuzzTest24.FuzzTest_union(intUnionFind25, intUnionFind26, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_union(intUnionFind30, intUnionFind31, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind36 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind37 = null;
        fuzzTest35.FuzzTest_union(intUnionFind36, intUnionFind37, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_union(intUnionFind41, intUnionFind42, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest23.FuzzTest_union(intUnionFind31, intUnionFind42, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = null;
        fuzzTest22.FuzzTest_union(intUnionFind42, intUnionFind49, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_union(intUnionFind17, intUnionFind49, (java.lang.Integer) 100, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind58 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind59 = null;
        fuzzTest57.FuzzTest_union(intUnionFind58, intUnionFind59, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind63 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_union(intUnionFind63, intUnionFind64, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind69 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind70 = null;
        fuzzTest68.FuzzTest_union(intUnionFind69, intUnionFind70, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind74 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_union(intUnionFind74, intUnionFind75, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest56.FuzzTest_union(intUnionFind64, intUnionFind75, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind83 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind84 = null;
        fuzzTest82.FuzzTest_union(intUnionFind83, intUnionFind84, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_union(intUnionFind88, intUnionFind89, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind75, intUnionFind89, (java.lang.Integer) 2, (java.lang.Integer) (-1));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind20 = null;
        fuzzTest18.FuzzTest_union(intUnionFind19, intUnionFind20, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind25 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind26 = null;
        fuzzTest24.FuzzTest_union(intUnionFind25, intUnionFind26, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_union(intUnionFind30, intUnionFind31, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind36 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind37 = null;
        fuzzTest35.FuzzTest_union(intUnionFind36, intUnionFind37, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_union(intUnionFind41, intUnionFind42, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest18.FuzzTest_union(intUnionFind30, intUnionFind42, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = null;
        fuzzTest49.FuzzTest_union(intUnionFind50, intUnionFind51, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_union(intUnionFind55, intUnionFind56, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_union(intUnionFind30, intUnionFind56, (java.lang.Integer) 0, (java.lang.Integer) 10);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind63 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_union(intUnionFind63, intUnionFind64, (java.lang.Integer) 1, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind68 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_union(intUnionFind68, intUnionFind69, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind13, intUnionFind69, (java.lang.Integer) 2, (java.lang.Integer) 2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_union(intUnionFind2, intUnionFind3, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        fuzzTest12.FuzzTest_union(intUnionFind13, intUnionFind14, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind25 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind26 = null;
        fuzzTest24.FuzzTest_union(intUnionFind25, intUnionFind26, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_union(intUnionFind30, intUnionFind31, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind36 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind37 = null;
        fuzzTest35.FuzzTest_union(intUnionFind36, intUnionFind37, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_union(intUnionFind41, intUnionFind42, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest23.FuzzTest_union(intUnionFind31, intUnionFind42, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = null;
        fuzzTest12.FuzzTest_union(intUnionFind31, intUnionFind49, (java.lang.Integer) 100, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind54 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = null;
        fuzzTest53.FuzzTest_union(intUnionFind54, intUnionFind55, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind59 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_union(intUnionFind59, intUnionFind60, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind65 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind66 = null;
        fuzzTest64.FuzzTest_union(intUnionFind65, intUnionFind66, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_union(intUnionFind70, intUnionFind71, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_union(intUnionFind60, intUnionFind71, (java.lang.Integer) (-1), (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind7, intUnionFind60, (java.lang.Integer) 2, (java.lang.Integer) 2);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_union(intUnionFind3, intUnionFind4, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_union(intUnionFind8, intUnionFind9, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind15 = null;
        fuzzTest13.FuzzTest_union(intUnionFind14, intUnionFind15, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_union(intUnionFind19, intUnionFind20, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_union(intUnionFind9, intUnionFind20, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzzTest0.FuzzTest_union(intUnionFind20, intUnionFind27, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        fuzzTest32.FuzzTest_union(intUnionFind33, intUnionFind34, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_union(intUnionFind38, intUnionFind39, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = null;
        fuzzTest43.FuzzTest_union(intUnionFind44, intUnionFind45, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_union(intUnionFind49, intUnionFind50, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest31.FuzzTest_union(intUnionFind39, intUnionFind50, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind57 = null;
        fuzzTest0.FuzzTest_union(intUnionFind39, intUnionFind57, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind62 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind63 = null;
        fuzzTest61.FuzzTest_union(intUnionFind62, intUnionFind63, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind67 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_union(intUnionFind67, intUnionFind68, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind73 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind74 = null;
        fuzzTest72.FuzzTest_union(intUnionFind73, intUnionFind74, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_union(intUnionFind78, intUnionFind79, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind67, intUnionFind78, (java.lang.Integer) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind4 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind5 = null;
        fuzzTest3.FuzzTest_union(intUnionFind4, intUnionFind5, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_union(intUnionFind9, intUnionFind10, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        fuzzTest2.FuzzTest_union(intUnionFind9, intUnionFind14, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind9, (java.lang.Integer) 2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind22 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = null;
        fuzzTest21.FuzzTest_union(intUnionFind22, intUnionFind23, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_union(intUnionFind27, intUnionFind28, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        fuzzTest32.FuzzTest_union(intUnionFind33, intUnionFind34, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_union(intUnionFind38, intUnionFind39, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind28, intUnionFind39, (java.lang.Integer) 0, (java.lang.Integer) 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_union(intUnionFind2, intUnionFind3, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        fuzzTest0.FuzzTest_union(intUnionFind7, intUnionFind12, (java.lang.Integer) 1, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        fuzzTest17.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind31 = null;
        fuzzTest29.FuzzTest_union(intUnionFind30, intUnionFind31, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_union(intUnionFind35, intUnionFind36, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind42 = null;
        fuzzTest40.FuzzTest_union(intUnionFind41, intUnionFind42, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_union(intUnionFind46, intUnionFind47, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest28.FuzzTest_union(intUnionFind36, intUnionFind47, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind54 = null;
        fuzzTest17.FuzzTest_union(intUnionFind36, intUnionFind54, (java.lang.Integer) 100, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind59 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind60 = null;
        fuzzTest58.FuzzTest_union(intUnionFind59, intUnionFind60, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_union(intUnionFind64, intUnionFind65, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind70 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind71 = null;
        fuzzTest69.FuzzTest_union(intUnionFind70, intUnionFind71, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_union(intUnionFind75, intUnionFind76, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_union(intUnionFind65, intUnionFind76, (java.lang.Integer) (-1), (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind16, intUnionFind65, (java.lang.Integer) 2, (java.lang.Integer) 10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_union(intUnionFind2, intUnionFind3, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        fuzzTest12.FuzzTest_union(intUnionFind13, intUnionFind14, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_union(intUnionFind8, intUnionFind19, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = null;
        fuzzTest26.FuzzTest_union(intUnionFind27, intUnionFind28, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_union(intUnionFind32, intUnionFind33, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        fuzzTest38.FuzzTest_union(intUnionFind39, intUnionFind40, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_union(intUnionFind44, intUnionFind45, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = null;
        fuzzTest37.FuzzTest_union(intUnionFind44, intUnionFind49, (java.lang.Integer) 1, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind33, intUnionFind44, (java.lang.Integer) (-1), (java.lang.Integer) 10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        fuzzTest17.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_union(intUnionFind12, intUnionFind24, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        fuzzTest32.FuzzTest_union(intUnionFind33, intUnionFind34, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_union(intUnionFind38, intUnionFind39, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = null;
        fuzzTest43.FuzzTest_union(intUnionFind44, intUnionFind45, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_union(intUnionFind49, intUnionFind50, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest31.FuzzTest_union(intUnionFind39, intUnionFind50, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind60 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind61 = null;
        fuzzTest59.FuzzTest_union(intUnionFind60, intUnionFind61, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind65 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_union(intUnionFind65, intUnionFind66, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind71 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind72 = null;
        fuzzTest70.FuzzTest_union(intUnionFind71, intUnionFind72, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind76 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind77 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_union(intUnionFind76, intUnionFind77, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest58.FuzzTest_union(intUnionFind66, intUnionFind77, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind84 = null;
        fuzzTest57.FuzzTest_union(intUnionFind77, intUnionFind84, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind50, intUnionFind77, (java.lang.Integer) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_union(intUnionFind2, intUnionFind3, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind10 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind11 = null;
        fuzzTest9.FuzzTest_union(intUnionFind10, intUnionFind11, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest15.FuzzTest_union(intUnionFind16, intUnionFind17, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind21 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_union(intUnionFind21, intUnionFind22, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = null;
        fuzzTest26.FuzzTest_union(intUnionFind27, intUnionFind28, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_union(intUnionFind32, intUnionFind33, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest9.FuzzTest_union(intUnionFind21, intUnionFind33, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind42 = null;
        fuzzTest40.FuzzTest_union(intUnionFind41, intUnionFind42, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_union(intUnionFind46, intUnionFind47, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest8.FuzzTest_union(intUnionFind21, intUnionFind47, (java.lang.Integer) 0, (java.lang.Integer) 10);
        fuzzTest1.FuzzTest_union(intUnionFind7, intUnionFind47, (java.lang.Integer) 10, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind59 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind60 = null;
        fuzzTest58.FuzzTest_union(intUnionFind59, intUnionFind60, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_union(intUnionFind64, intUnionFind65, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind70 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind71 = null;
        fuzzTest69.FuzzTest_union(intUnionFind70, intUnionFind71, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_union(intUnionFind75, intUnionFind76, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest57.FuzzTest_union(intUnionFind65, intUnionFind76, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind47, intUnionFind76, (java.lang.Integer) 1, (java.lang.Integer) 2);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzzTest11.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_union(intUnionFind17, intUnionFind18, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind25 = null;
        fuzzTest23.FuzzTest_union(intUnionFind24, intUnionFind25, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_union(intUnionFind29, intUnionFind30, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind36 = null;
        fuzzTest34.FuzzTest_union(intUnionFind35, intUnionFind36, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_union(intUnionFind40, intUnionFind41, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest22.FuzzTest_union(intUnionFind30, intUnionFind41, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = null;
        fuzzTest48.FuzzTest_union(intUnionFind49, intUnionFind50, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind54 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_union(intUnionFind54, intUnionFind55, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind60 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind61 = null;
        fuzzTest59.FuzzTest_union(intUnionFind60, intUnionFind61, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind66 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind67 = null;
        fuzzTest65.FuzzTest_union(intUnionFind66, intUnionFind67, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind71 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_union(intUnionFind71, intUnionFind72, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind77 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind78 = null;
        fuzzTest76.FuzzTest_union(intUnionFind77, intUnionFind78, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind82 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_union(intUnionFind82, intUnionFind83, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest59.FuzzTest_union(intUnionFind71, intUnionFind83, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest22.FuzzTest_union(intUnionFind54, intUnionFind71, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind17, intUnionFind54, (java.lang.Integer) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzzTest11.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        fuzzTest17.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_union(intUnionFind29, intUnionFind30, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_union(intUnionFind34, intUnionFind35, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest11.FuzzTest_union(intUnionFind23, intUnionFind35, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_union(intUnionFind43, intUnionFind44, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_union(intUnionFind48, intUnionFind49, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind35, intUnionFind49, (java.lang.Integer) 0, (java.lang.Integer) 2);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzzTest11.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_union(intUnionFind17, intUnionFind18, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = null;
        fuzzTest22.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_union(intUnionFind29, intUnionFind30, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_union(intUnionFind34, intUnionFind35, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = null;
        fuzzTest39.FuzzTest_union(intUnionFind40, intUnionFind41, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_union(intUnionFind45, intUnionFind46, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest22.FuzzTest_union(intUnionFind34, intUnionFind46, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_union(intUnionFind18, intUnionFind46, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind57 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind58 = null;
        fuzzTest56.FuzzTest_union(intUnionFind57, intUnionFind58, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind62 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_union(intUnionFind62, intUnionFind63, (java.lang.Integer) 1, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind67 = null;
        fuzzTest0.FuzzTest_union(intUnionFind62, intUnionFind67, (java.lang.Integer) 0, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind73 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind74 = null;
        fuzzTest72.FuzzTest_union(intUnionFind73, intUnionFind74, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_union(intUnionFind78, intUnionFind79, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind71, intUnionFind78, (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        fuzzTest17.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind31 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = null;
        fuzzTest30.FuzzTest_union(intUnionFind31, intUnionFind32, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind36 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_union(intUnionFind36, intUnionFind37, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind42 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = null;
        fuzzTest41.FuzzTest_union(intUnionFind42, intUnionFind43, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind47 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_union(intUnionFind47, intUnionFind48, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest29.FuzzTest_union(intUnionFind37, intUnionFind48, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = null;
        fuzzTest28.FuzzTest_union(intUnionFind48, intUnionFind55, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        fuzzTest6.FuzzTest_union(intUnionFind23, intUnionFind55, (java.lang.Integer) 100, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind63 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = null;
        fuzzTest62.FuzzTest_union(intUnionFind63, intUnionFind64, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind68 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_union(intUnionFind68, intUnionFind69, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind23, intUnionFind68, (java.lang.Integer) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        fuzzTest17.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_union(intUnionFind29, intUnionFind30, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_union(intUnionFind34, intUnionFind35, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = null;
        fuzzTest39.FuzzTest_union(intUnionFind40, intUnionFind41, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind47 = null;
        fuzzTest45.FuzzTest_union(intUnionFind46, intUnionFind47, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_union(intUnionFind51, intUnionFind52, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind57 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind58 = null;
        fuzzTest56.FuzzTest_union(intUnionFind57, intUnionFind58, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest56.FuzzTest_union(intUnionFind62, intUnionFind63, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest39.FuzzTest_union(intUnionFind51, intUnionFind63, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest17.FuzzTest_union(intUnionFind35, intUnionFind63, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_union(intUnionFind35, intUnionFind73, (java.lang.Integer) 1, (java.lang.Integer) 100);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind77 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind73, intUnionFind77, (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind3 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind4 = null;
        fuzzTest2.FuzzTest_union(intUnionFind3, intUnionFind4, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_union(intUnionFind8, intUnionFind9, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind15 = null;
        fuzzTest13.FuzzTest_union(intUnionFind14, intUnionFind15, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_union(intUnionFind19, intUnionFind20, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_union(intUnionFind9, intUnionFind20, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_union(intUnionFind29, intUnionFind30, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_union(intUnionFind34, intUnionFind35, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = null;
        fuzzTest39.FuzzTest_union(intUnionFind40, intUnionFind41, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_union(intUnionFind45, intUnionFind46, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest27.FuzzTest_union(intUnionFind35, intUnionFind46, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind20, intUnionFind46, (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzzTest11.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_union(intUnionFind17, intUnionFind18, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind26 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzzTest25.FuzzTest_union(intUnionFind26, intUnionFind27, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_union(intUnionFind31, intUnionFind32, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind36 = null;
        fuzzTest24.FuzzTest_union(intUnionFind31, intUnionFind36, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest22.FuzzTest_union(intUnionFind23, intUnionFind31, (java.lang.Integer) 2, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_union(intUnionFind17, intUnionFind23, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind48 = null;
        fuzzTest46.FuzzTest_union(intUnionFind47, intUnionFind48, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_union(intUnionFind52, intUnionFind53, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind58 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind59 = null;
        fuzzTest57.FuzzTest_union(intUnionFind58, intUnionFind59, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind63 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_union(intUnionFind63, intUnionFind64, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind53, intUnionFind64, (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        fuzzTest12.FuzzTest_union(intUnionFind13, intUnionFind14, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_union(intUnionFind11, intUnionFind18, (java.lang.Integer) 1, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = null;
        fuzzTest27.FuzzTest_union(intUnionFind28, intUnionFind29, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_union(intUnionFind33, intUnionFind34, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = null;
        fuzzTest39.FuzzTest_union(intUnionFind40, intUnionFind41, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_union(intUnionFind45, intUnionFind46, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest27.FuzzTest_union(intUnionFind38, intUnionFind45, (java.lang.Integer) 1, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind26, intUnionFind45, (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind4 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind5 = null;
        fuzzTest3.FuzzTest_union(intUnionFind4, intUnionFind5, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_union(intUnionFind9, intUnionFind10, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        fuzzTest2.FuzzTest_union(intUnionFind9, intUnionFind14, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind9, (java.lang.Integer) 2, (java.lang.Integer) 0);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind21 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind22 = null;
        fuzzTest0.FuzzTest_union(intUnionFind21, intUnionFind22, (java.lang.Integer) 1, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind26 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzzTest0.FuzzTest_union(intUnionFind26, intUnionFind27, (java.lang.Integer) 10, (java.lang.Integer) 0);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = null;
        fuzzTest33.FuzzTest_union(intUnionFind34, intUnionFind35, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = null;
        fuzzTest39.FuzzTest_union(intUnionFind40, intUnionFind41, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_union(intUnionFind45, intUnionFind46, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind52 = null;
        fuzzTest50.FuzzTest_union(intUnionFind51, intUnionFind52, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_union(intUnionFind56, intUnionFind57, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest33.FuzzTest_union(intUnionFind45, intUnionFind57, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind65 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind66 = null;
        fuzzTest64.FuzzTest_union(intUnionFind65, intUnionFind66, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest64.FuzzTest_union(intUnionFind70, intUnionFind71, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest32.FuzzTest_union(intUnionFind45, intUnionFind71, (java.lang.Integer) 0, (java.lang.Integer) 10);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind78 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_union(intUnionFind78, intUnionFind79, (java.lang.Integer) 1, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_union(intUnionFind83, intUnionFind84, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind31, intUnionFind83, (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind11 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        fuzzTest0.FuzzTest_union(intUnionFind11, intUnionFind12, (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        fuzzTest16.FuzzTest_union(intUnionFind17, intUnionFind18, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind22 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_union(intUnionFind22, intUnionFind23, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = null;
        fuzzTest27.FuzzTest_union(intUnionFind28, intUnionFind29, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = null;
        fuzzTest33.FuzzTest_union(intUnionFind34, intUnionFind35, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_union(intUnionFind39, intUnionFind40, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = null;
        fuzzTest44.FuzzTest_union(intUnionFind45, intUnionFind46, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_union(intUnionFind50, intUnionFind51, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest27.FuzzTest_union(intUnionFind39, intUnionFind51, (java.lang.Integer) 1, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind58 = null;
        fuzzTest16.FuzzTest_union(intUnionFind51, intUnionFind58, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind63 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = null;
        fuzzTest62.FuzzTest_union(intUnionFind63, intUnionFind64, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind68 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_union(intUnionFind68, intUnionFind69, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind74 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind75 = null;
        fuzzTest73.FuzzTest_union(intUnionFind74, intUnionFind75, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind79 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_union(intUnionFind79, intUnionFind80, (java.lang.Integer) 1, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind84 = null;
        fuzzTest62.FuzzTest_union(intUnionFind80, intUnionFind84, (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind51, intUnionFind80, (java.lang.Integer) 100, (java.lang.Integer) 2);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_union(intUnionFind2, intUnionFind3, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_union(intUnionFind15, intUnionFind16, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind20 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_union(intUnionFind20, intUnionFind21, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind26 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzzTest25.FuzzTest_union(intUnionFind26, intUnionFind27, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind31 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_union(intUnionFind31, intUnionFind32, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest13.FuzzTest_union(intUnionFind21, intUnionFind32, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = null;
        fuzzTest12.FuzzTest_union(intUnionFind32, intUnionFind39, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_union(intUnionFind8, intUnionFind39, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind48 = null;
        fuzzTest46.FuzzTest_union(intUnionFind47, intUnionFind48, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_union(intUnionFind52, intUnionFind53, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind58 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind59 = null;
        fuzzTest57.FuzzTest_union(intUnionFind58, intUnionFind59, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind63 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_union(intUnionFind63, intUnionFind64, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind69 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind70 = null;
        fuzzTest68.FuzzTest_union(intUnionFind69, intUnionFind70, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind74 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_union(intUnionFind74, intUnionFind75, (java.lang.Integer) 1, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind79 = null;
        fuzzTest57.FuzzTest_union(intUnionFind75, intUnionFind79, (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind53, intUnionFind75, (java.lang.Integer) 1, (java.lang.Integer) 2);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        fuzzTest12.FuzzTest_union(intUnionFind13, intUnionFind14, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_union(intUnionFind11, intUnionFind18, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = null;
        fuzzTest27.FuzzTest_union(intUnionFind28, intUnionFind29, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_union(intUnionFind33, intUnionFind34, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        fuzzTest38.FuzzTest_union(intUnionFind39, intUnionFind40, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_union(intUnionFind44, intUnionFind45, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest26.FuzzTest_union(intUnionFind34, intUnionFind45, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind53 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind54 = null;
        fuzzTest52.FuzzTest_union(intUnionFind53, intUnionFind54, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind58 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_union(intUnionFind58, intUnionFind59, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = null;
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind67 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind68 = null;
        fuzzTest66.FuzzTest_union(intUnionFind67, intUnionFind68, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_union(intUnionFind72, intUnionFind73, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind77 = null;
        fuzzTest65.FuzzTest_union(intUnionFind72, intUnionFind77, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest63.FuzzTest_union(intUnionFind64, intUnionFind72, (java.lang.Integer) 2, (java.lang.Integer) 0);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind84 = null;
        fuzzTest52.FuzzTest_union(intUnionFind72, intUnionFind84, (java.lang.Integer) 1, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind34, intUnionFind72, (java.lang.Integer) 100, (java.lang.Integer) 2);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind4 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind5 = null;
        fuzzTest3.FuzzTest_union(intUnionFind4, intUnionFind5, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind9 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest3.FuzzTest_union(intUnionFind9, intUnionFind10, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        fuzzTest2.FuzzTest_union(intUnionFind9, intUnionFind14, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind9, (java.lang.Integer) 2, (java.lang.Integer) 0);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = null;
        fuzzTest22.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_union(intUnionFind28, intUnionFind29, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind36 = null;
        fuzzTest34.FuzzTest_union(intUnionFind35, intUnionFind36, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_union(intUnionFind40, intUnionFind41, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind47 = null;
        fuzzTest45.FuzzTest_union(intUnionFind46, intUnionFind47, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_union(intUnionFind51, intUnionFind52, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest33.FuzzTest_union(intUnionFind41, intUnionFind52, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind59 = null;
        fuzzTest22.FuzzTest_union(intUnionFind41, intUnionFind59, (java.lang.Integer) 100, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind65 = null;
        fuzzTest63.FuzzTest_union(intUnionFind64, intUnionFind65, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind69 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_union(intUnionFind69, intUnionFind70, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind75 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind76 = null;
        fuzzTest74.FuzzTest_union(intUnionFind75, intUnionFind76, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind80 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest74.FuzzTest_union(intUnionFind80, intUnionFind81, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest22.FuzzTest_union(intUnionFind70, intUnionFind81, (java.lang.Integer) (-1), (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind21, intUnionFind70, (java.lang.Integer) 1, (java.lang.Integer) 10);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_union(intUnionFind2, intUnionFind3, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        fuzzTest0.FuzzTest_union(intUnionFind7, intUnionFind12, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        fuzzTest16.FuzzTest_union(intUnionFind17, intUnionFind18, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind22 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_union(intUnionFind22, intUnionFind23, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = null;
        fuzzTest27.FuzzTest_union(intUnionFind28, intUnionFind29, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_union(intUnionFind33, intUnionFind34, (java.lang.Integer) 1, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = null;
        fuzzTest16.FuzzTest_union(intUnionFind34, intUnionFind38, (java.lang.Integer) 10, (java.lang.Integer) 0);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = null;
        fuzzTest44.FuzzTest_union(intUnionFind45, intUnionFind46, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_union(intUnionFind50, intUnionFind51, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind56 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind57 = null;
        fuzzTest55.FuzzTest_union(intUnionFind56, intUnionFind57, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_union(intUnionFind61, intUnionFind62, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest43.FuzzTest_union(intUnionFind51, intUnionFind62, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest16.FuzzTest_union(intUnionFind42, intUnionFind51, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind74 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind75 = null;
        fuzzTest73.FuzzTest_union(intUnionFind74, intUnionFind75, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind79 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest73.FuzzTest_union(intUnionFind79, intUnionFind80, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind84 = null;
        fuzzTest72.FuzzTest_union(intUnionFind79, intUnionFind84, (java.lang.Integer) 1, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind51, intUnionFind79, (java.lang.Integer) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        fuzzTest12.FuzzTest_union(intUnionFind13, intUnionFind14, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind25 = null;
        fuzzTest23.FuzzTest_union(intUnionFind24, intUnionFind25, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_union(intUnionFind29, intUnionFind30, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest11.FuzzTest_union(intUnionFind19, intUnionFind30, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = null;
        fuzzTest37.FuzzTest_union(intUnionFind38, intUnionFind39, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_union(intUnionFind43, intUnionFind44, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind48 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_union(intUnionFind48, intUnionFind49, (java.lang.Integer) 100, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind56 = null;
        fuzzTest54.FuzzTest_union(intUnionFind55, intUnionFind56, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind60 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_union(intUnionFind60, intUnionFind61, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind66 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind67 = null;
        fuzzTest65.FuzzTest_union(intUnionFind66, intUnionFind67, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind71 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_union(intUnionFind71, intUnionFind72, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest53.FuzzTest_union(intUnionFind61, intUnionFind72, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind80 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind81 = null;
        fuzzTest79.FuzzTest_union(intUnionFind80, intUnionFind81, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_union(intUnionFind85, intUnionFind86, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest37.FuzzTest_union(intUnionFind72, intUnionFind85, (java.lang.Integer) 100, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind19, intUnionFind72, (java.lang.Integer) (-1), (java.lang.Integer) 2);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        fuzzTest17.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_union(intUnionFind12, intUnionFind24, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        fuzzTest31.FuzzTest_union(intUnionFind32, intUnionFind33, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind37 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_union(intUnionFind37, intUnionFind38, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_union(intUnionFind43, intUnionFind44, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind48 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_union(intUnionFind48, intUnionFind49, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind54 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = null;
        fuzzTest53.FuzzTest_union(intUnionFind54, intUnionFind55, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_union(intUnionFind59, intUnionFind60, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind65 = null;
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind68 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind69 = null;
        fuzzTest67.FuzzTest_union(intUnionFind68, intUnionFind69, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind73 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_union(intUnionFind73, intUnionFind74, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind78 = null;
        fuzzTest66.FuzzTest_union(intUnionFind73, intUnionFind78, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest64.FuzzTest_union(intUnionFind65, intUnionFind73, (java.lang.Integer) 2, (java.lang.Integer) 0);
        fuzzTest42.FuzzTest_union(intUnionFind59, intUnionFind65, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind37, intUnionFind59, (java.lang.Integer) 100, (java.lang.Integer) 2);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        fuzzTest17.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind31 = null;
        fuzzTest29.FuzzTest_union(intUnionFind30, intUnionFind31, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_union(intUnionFind35, intUnionFind36, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_union(intUnionFind28, intUnionFind35, (java.lang.Integer) 1, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = null;
        fuzzTest6.FuzzTest_union(intUnionFind35, intUnionFind43, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = null;
        fuzzTest48.FuzzTest_union(intUnionFind49, intUnionFind50, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind54 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_union(intUnionFind54, intUnionFind55, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind60 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind61 = null;
        fuzzTest59.FuzzTest_union(intUnionFind60, intUnionFind61, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind65 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_union(intUnionFind65, intUnionFind66, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest47.FuzzTest_union(intUnionFind55, intUnionFind66, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind35, intUnionFind55, (java.lang.Integer) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        fuzzTest12.FuzzTest_union(intUnionFind13, intUnionFind14, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind25 = null;
        fuzzTest23.FuzzTest_union(intUnionFind24, intUnionFind25, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_union(intUnionFind29, intUnionFind30, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest6.FuzzTest_union(intUnionFind18, intUnionFind30, (java.lang.Integer) 1, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind37 = null;
        fuzzTest0.FuzzTest_union(intUnionFind18, intUnionFind37, (java.lang.Integer) 100, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_union(intUnionFind43, intUnionFind44, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_union(intUnionFind48, intUnionFind49, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind41, intUnionFind48, (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzzTest11.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_union(intUnionFind17, intUnionFind18, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = null;
        fuzzTest22.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_union(intUnionFind28, intUnionFind29, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = null;
        fuzzTest33.FuzzTest_union(intUnionFind34, intUnionFind35, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = null;
        fuzzTest39.FuzzTest_union(intUnionFind40, intUnionFind41, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_union(intUnionFind45, intUnionFind46, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind52 = null;
        fuzzTest50.FuzzTest_union(intUnionFind51, intUnionFind52, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_union(intUnionFind56, intUnionFind57, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest33.FuzzTest_union(intUnionFind45, intUnionFind57, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest11.FuzzTest_union(intUnionFind29, intUnionFind57, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind68 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind69 = null;
        fuzzTest67.FuzzTest_union(intUnionFind68, intUnionFind69, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind73 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_union(intUnionFind73, intUnionFind74, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind78 = null;
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind80 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind81 = null;
        fuzzTest79.FuzzTest_union(intUnionFind80, intUnionFind81, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_union(intUnionFind85, intUnionFind86, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest67.FuzzTest_union(intUnionFind78, intUnionFind85, (java.lang.Integer) 1, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind29, intUnionFind85, (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind15 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzzTest14.FuzzTest_union(intUnionFind15, intUnionFind16, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind20 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind21 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_union(intUnionFind20, intUnionFind21, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind25 = null;
        fuzzTest13.FuzzTest_union(intUnionFind20, intUnionFind25, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest11.FuzzTest_union(intUnionFind12, intUnionFind20, (java.lang.Integer) 2, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        fuzzTest32.FuzzTest_union(intUnionFind33, intUnionFind34, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        fuzzTest38.FuzzTest_union(intUnionFind39, intUnionFind40, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_union(intUnionFind44, intUnionFind45, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = null;
        fuzzTest49.FuzzTest_union(intUnionFind50, intUnionFind51, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_union(intUnionFind55, intUnionFind56, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest32.FuzzTest_union(intUnionFind44, intUnionFind56, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = null;
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind67 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind68 = null;
        fuzzTest66.FuzzTest_union(intUnionFind67, intUnionFind68, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_union(intUnionFind72, intUnionFind73, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind77 = null;
        fuzzTest65.FuzzTest_union(intUnionFind72, intUnionFind77, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest63.FuzzTest_union(intUnionFind64, intUnionFind72, (java.lang.Integer) 2, (java.lang.Integer) 0);
        fuzzTest11.FuzzTest_union(intUnionFind56, intUnionFind72, (java.lang.Integer) 10, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind87 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind72, intUnionFind87, (java.lang.Integer) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_union(intUnionFind2, intUnionFind3, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        fuzzTest0.FuzzTest_union(intUnionFind7, intUnionFind12, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        fuzzTest16.FuzzTest_union(intUnionFind17, intUnionFind18, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind22 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_union(intUnionFind22, intUnionFind23, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = null;
        fuzzTest27.FuzzTest_union(intUnionFind28, intUnionFind29, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_union(intUnionFind33, intUnionFind34, (java.lang.Integer) 1, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = null;
        fuzzTest16.FuzzTest_union(intUnionFind34, intUnionFind38, (java.lang.Integer) 10, (java.lang.Integer) 0);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = null;
        fuzzTest44.FuzzTest_union(intUnionFind45, intUnionFind46, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_union(intUnionFind50, intUnionFind51, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = null;
        fuzzTest43.FuzzTest_union(intUnionFind50, intUnionFind55, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest16.FuzzTest_union(intUnionFind42, intUnionFind55, (java.lang.Integer) 1, (java.lang.Integer) 100);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind62 = null;
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind65 = null;
        fuzzTest63.FuzzTest_union(intUnionFind64, intUnionFind65, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_union(intUnionFind69, intUnionFind70, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest16.FuzzTest_union(intUnionFind62, intUnionFind70, (java.lang.Integer) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind78 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind79 = null;
        fuzzTest77.FuzzTest_union(intUnionFind78, intUnionFind79, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_union(intUnionFind83, intUnionFind84, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind89 = null;
        fuzzTest77.FuzzTest_union(intUnionFind88, intUnionFind89, (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind70, intUnionFind88, (java.lang.Integer) 2, (java.lang.Integer) 2);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind11 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind11, intUnionFind12, (java.lang.Integer) 100, (java.lang.Integer) 100);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind16 = null;
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        fuzzTest17.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_union(intUnionFind16, intUnionFind23, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind31 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = null;
        fuzzTest0.FuzzTest_union(intUnionFind31, intUnionFind32, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind36 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind37 = null;
        fuzzTest0.FuzzTest_union(intUnionFind36, intUnionFind37, (java.lang.Integer) 100, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_union(intUnionFind43, intUnionFind44, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind48 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_union(intUnionFind48, intUnionFind49, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind54 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = null;
        fuzzTest53.FuzzTest_union(intUnionFind54, intUnionFind55, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind59 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest53.FuzzTest_union(intUnionFind59, intUnionFind60, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest41.FuzzTest_union(intUnionFind49, intUnionFind60, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind68 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind69 = null;
        fuzzTest67.FuzzTest_union(intUnionFind68, intUnionFind69, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind73 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_union(intUnionFind73, intUnionFind74, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind79 = null;
        fuzzTest67.FuzzTest_union(intUnionFind78, intUnionFind79, (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind60, intUnionFind78, (java.lang.Integer) 2, (java.lang.Integer) 1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind11 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind11, intUnionFind12, (java.lang.Integer) 100, (java.lang.Integer) 100);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest0.FuzzTest_union(intUnionFind16, intUnionFind17, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind22 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = null;
        fuzzTest21.FuzzTest_union(intUnionFind22, intUnionFind23, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_union(intUnionFind27, intUnionFind28, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = null;
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind36 = null;
        fuzzTest34.FuzzTest_union(intUnionFind35, intUnionFind36, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_union(intUnionFind40, intUnionFind41, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind47 = null;
        fuzzTest45.FuzzTest_union(intUnionFind46, intUnionFind47, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_union(intUnionFind51, intUnionFind52, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest33.FuzzTest_union(intUnionFind41, intUnionFind52, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest21.FuzzTest_union(intUnionFind32, intUnionFind52, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind63 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = null;
        fuzzTest62.FuzzTest_union(intUnionFind63, intUnionFind64, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind69 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind70 = null;
        fuzzTest68.FuzzTest_union(intUnionFind69, intUnionFind70, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind74 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_union(intUnionFind74, intUnionFind75, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind80 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind81 = null;
        fuzzTest79.FuzzTest_union(intUnionFind80, intUnionFind81, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind85 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind86 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_union(intUnionFind85, intUnionFind86, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest62.FuzzTest_union(intUnionFind74, intUnionFind86, (java.lang.Integer) 1, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind52, intUnionFind86, (java.lang.Integer) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_union(intUnionFind2, intUnionFind3, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        fuzzTest0.FuzzTest_union(intUnionFind7, intUnionFind12, (java.lang.Integer) 1, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest0.FuzzTest_union(intUnionFind16, intUnionFind17, (java.lang.Integer) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind22 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = null;
        fuzzTest21.FuzzTest_union(intUnionFind22, intUnionFind23, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest21.FuzzTest_union(intUnionFind27, intUnionFind28, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        fuzzTest32.FuzzTest_union(intUnionFind33, intUnionFind34, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_union(intUnionFind38, intUnionFind39, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = null;
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = null;
        fuzzTest44.FuzzTest_union(intUnionFind45, intUnionFind46, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_union(intUnionFind50, intUnionFind51, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest32.FuzzTest_union(intUnionFind43, intUnionFind50, (java.lang.Integer) 1, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind58 = null;
        fuzzTest21.FuzzTest_union(intUnionFind50, intUnionFind58, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind63 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = null;
        fuzzTest62.FuzzTest_union(intUnionFind63, intUnionFind64, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind68 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_union(intUnionFind68, intUnionFind69, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind50, intUnionFind68, (java.lang.Integer) 0, (java.lang.Integer) 2);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_union(intUnionFind2, intUnionFind3, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        fuzzTest0.FuzzTest_union(intUnionFind7, intUnionFind12, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        fuzzTest16.FuzzTest_union(intUnionFind17, intUnionFind18, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind22 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_union(intUnionFind22, intUnionFind23, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest16.FuzzTest_union(intUnionFind27, intUnionFind28, (java.lang.Integer) 100, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = null;
        fuzzTest33.FuzzTest_union(intUnionFind34, intUnionFind35, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_union(intUnionFind39, intUnionFind40, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind45 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind46 = null;
        fuzzTest44.FuzzTest_union(intUnionFind45, intUnionFind46, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_union(intUnionFind50, intUnionFind51, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest32.FuzzTest_union(intUnionFind40, intUnionFind51, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind59 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind60 = null;
        fuzzTest58.FuzzTest_union(intUnionFind59, intUnionFind60, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind64 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_union(intUnionFind64, intUnionFind65, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest16.FuzzTest_union(intUnionFind51, intUnionFind64, (java.lang.Integer) 100, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind73 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind74 = null;
        fuzzTest72.FuzzTest_union(intUnionFind73, intUnionFind74, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_union(intUnionFind78, intUnionFind79, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind84 = null;
        fuzzTest72.FuzzTest_union(intUnionFind83, intUnionFind84, (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind64, intUnionFind83, (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        fuzzTest12.FuzzTest_union(intUnionFind13, intUnionFind14, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind26 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzzTest25.FuzzTest_union(intUnionFind26, intUnionFind27, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind31 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_union(intUnionFind31, intUnionFind32, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind37 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = null;
        fuzzTest36.FuzzTest_union(intUnionFind37, intUnionFind38, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind42 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_union(intUnionFind42, intUnionFind43, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest24.FuzzTest_union(intUnionFind32, intUnionFind43, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = null;
        fuzzTest23.FuzzTest_union(intUnionFind43, intUnionFind50, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        fuzzTest11.FuzzTest_union(intUnionFind19, intUnionFind50, (java.lang.Integer) 1, (java.lang.Integer) 100);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind50, intUnionFind57, (java.lang.Integer) 0, (java.lang.Integer) 100);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind61 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind62 = null;
        fuzzTest0.FuzzTest_union(intUnionFind61, intUnionFind62, (java.lang.Integer) 0, (java.lang.Integer) 0);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind66 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind67 = null;
        fuzzTest0.FuzzTest_union(intUnionFind66, intUnionFind67, (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind72 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind73 = null;
        fuzzTest71.FuzzTest_union(intUnionFind72, intUnionFind73, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind77 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_union(intUnionFind77, intUnionFind78, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind83 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind84 = null;
        fuzzTest82.FuzzTest_union(intUnionFind83, intUnionFind84, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind89 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest82.FuzzTest_union(intUnionFind88, intUnionFind89, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind78, intUnionFind89, (java.lang.Integer) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        fuzzTest12.FuzzTest_union(intUnionFind13, intUnionFind14, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_union(intUnionFind11, intUnionFind18, (java.lang.Integer) 1, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind26 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzzTest0.FuzzTest_union(intUnionFind26, intUnionFind27, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        fuzzTest31.FuzzTest_union(intUnionFind32, intUnionFind33, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind37 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_union(intUnionFind37, intUnionFind38, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = null;
        fuzzTest42.FuzzTest_union(intUnionFind43, intUnionFind44, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind48 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest42.FuzzTest_union(intUnionFind48, intUnionFind49, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind38, intUnionFind48, (java.lang.Integer) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind11 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind11, intUnionFind12, (java.lang.Integer) 100, (java.lang.Integer) 100);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest0.FuzzTest_union(intUnionFind16, intUnionFind17, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind21 = null;
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = null;
        fuzzTest22.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_union(intUnionFind28, intUnionFind29, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_union(intUnionFind21, intUnionFind29, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind37 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = null;
        fuzzTest36.FuzzTest_union(intUnionFind37, intUnionFind38, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind42 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_union(intUnionFind42, intUnionFind43, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind47 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind43, intUnionFind47, (java.lang.Integer) 10, (java.lang.Integer) 2);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind14 = null;
        fuzzTest12.FuzzTest_union(intUnionFind13, intUnionFind14, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind26 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzzTest25.FuzzTest_union(intUnionFind26, intUnionFind27, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind31 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_union(intUnionFind31, intUnionFind32, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind37 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = null;
        fuzzTest36.FuzzTest_union(intUnionFind37, intUnionFind38, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind42 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_union(intUnionFind42, intUnionFind43, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest24.FuzzTest_union(intUnionFind32, intUnionFind43, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = null;
        fuzzTest23.FuzzTest_union(intUnionFind43, intUnionFind50, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        fuzzTest11.FuzzTest_union(intUnionFind19, intUnionFind50, (java.lang.Integer) 1, (java.lang.Integer) 100);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind50, intUnionFind57, (java.lang.Integer) 0, (java.lang.Integer) 100);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind61 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind62 = null;
        fuzzTest0.FuzzTest_union(intUnionFind61, intUnionFind62, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind67 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind68 = null;
        fuzzTest66.FuzzTest_union(intUnionFind67, intUnionFind68, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind72 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest66.FuzzTest_union(intUnionFind72, intUnionFind73, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind78 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind79 = null;
        fuzzTest77.FuzzTest_union(intUnionFind78, intUnionFind79, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_union(intUnionFind83, intUnionFind84, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind72, intUnionFind83, (java.lang.Integer) (-1), (java.lang.Integer) 2);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind3 = null;
        fuzzTest1.FuzzTest_union(intUnionFind2, intUnionFind3, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        fuzzTest0.FuzzTest_union(intUnionFind7, intUnionFind12, (java.lang.Integer) 1, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind16 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = null;
        fuzzTest0.FuzzTest_union(intUnionFind16, intUnionFind17, (java.lang.Integer) 10, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind21 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind22 = null;
        fuzzTest0.FuzzTest_union(intUnionFind21, intUnionFind22, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind27 = null;
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind31 = null;
        fuzzTest29.FuzzTest_union(intUnionFind30, intUnionFind31, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_union(intUnionFind35, intUnionFind36, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind40 = null;
        fuzzTest28.FuzzTest_union(intUnionFind35, intUnionFind40, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest26.FuzzTest_union(intUnionFind27, intUnionFind35, (java.lang.Integer) 2, (java.lang.Integer) 0);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind47 = null;
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind51 = null;
        fuzzTest49.FuzzTest_union(intUnionFind50, intUnionFind51, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_union(intUnionFind55, intUnionFind56, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind61 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind62 = null;
        fuzzTest60.FuzzTest_union(intUnionFind61, intUnionFind62, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest60.FuzzTest_union(intUnionFind66, intUnionFind67, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzzTest48.FuzzTest_union(intUnionFind56, intUnionFind67, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest26.FuzzTest_union(intUnionFind47, intUnionFind67, (java.lang.Integer) 2, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind78 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind79 = null;
        fuzzTest77.FuzzTest_union(intUnionFind78, intUnionFind79, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_union(intUnionFind83, intUnionFind84, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind88 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind89 = null;
        fuzzTest77.FuzzTest_union(intUnionFind88, intUnionFind89, (java.lang.Integer) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind67, intUnionFind88, (java.lang.Integer) 100, (java.lang.Integer) 100);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind8 = null;
        fuzzTest6.FuzzTest_union(intUnionFind7, intUnionFind8, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind19 = null;
        fuzzTest17.FuzzTest_union(intUnionFind18, intUnionFind19, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind23 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_union(intUnionFind23, intUnionFind24, (java.lang.Integer) 1, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind28 = null;
        fuzzTest6.FuzzTest_union(intUnionFind24, intUnionFind28, (java.lang.Integer) 10, (java.lang.Integer) 0);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind32 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind33 = null;
        fuzzTest6.FuzzTest_union(intUnionFind32, intUnionFind33, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind38 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = null;
        fuzzTest37.FuzzTest_union(intUnionFind38, intUnionFind39, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind43 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind44 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_union(intUnionFind43, intUnionFind44, (java.lang.Integer) 2, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind49 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind50 = null;
        fuzzTest48.FuzzTest_union(intUnionFind49, intUnionFind50, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind54 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_union(intUnionFind54, intUnionFind55, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind60 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind61 = null;
        fuzzTest59.FuzzTest_union(intUnionFind60, intUnionFind61, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind65 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind66 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_union(intUnionFind65, intUnionFind66, (java.lang.Integer) 1, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind70 = null;
        fuzzTest48.FuzzTest_union(intUnionFind66, intUnionFind70, (java.lang.Integer) 10, (java.lang.Integer) 0);
        fuzzTest6.FuzzTest_union(intUnionFind43, intUnionFind66, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind78 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind79 = null;
        fuzzTest77.FuzzTest_union(intUnionFind78, intUnionFind79, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind83 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind84 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_union(intUnionFind83, intUnionFind84, (java.lang.Integer) 2, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind43, intUnionFind83, (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind1 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind2 = null;
        fuzzTest0.FuzzTest_union(intUnionFind1, intUnionFind2, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind6 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_union(intUnionFind6, intUnionFind7, (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind12 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind13 = null;
        fuzzTest11.FuzzTest_union(intUnionFind12, intUnionFind13, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind17 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_union(intUnionFind17, intUnionFind18, (java.lang.Integer) 1, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind22 = null;
        fuzzTest0.FuzzTest_union(intUnionFind18, intUnionFind22, (java.lang.Integer) 10, (java.lang.Integer) 0);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind29 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind30 = null;
        fuzzTest28.FuzzTest_union(intUnionFind29, intUnionFind30, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_union(intUnionFind34, intUnionFind35, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind39 = null;
        fuzzTest27.FuzzTest_union(intUnionFind34, intUnionFind39, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzzTest0.FuzzTest_union(intUnionFind26, intUnionFind39, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind47 = null;
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind48 = null;
        fuzzTest46.FuzzTest_union(intUnionFind47, intUnionFind48, (java.lang.Integer) 0, (java.lang.Integer) 2);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind52 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_union(intUnionFind52, intUnionFind53, (java.lang.Integer) 2, (java.lang.Integer) 1);
        naturalness.mut_000.UnionFind<java.lang.Integer> intUnionFind57 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_union(intUnionFind53, intUnionFind57, (java.lang.Integer) 2, (java.lang.Integer) 100);
    }
}

