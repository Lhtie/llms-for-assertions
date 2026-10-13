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
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet14 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet14, (java.lang.Integer) 2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet6, intSet8, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 2, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet15 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet23 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        naturalness.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest17.FuzzTest_pollFirst(intSet23, intSet25, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet15, intSet23, (java.lang.Integer) 10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet6, intSet8, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet13 = null;
        naturalness.TreeSet<java.lang.Integer> intSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_pollFirst(intSet13, intSet14, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet18 = null;
        naturalness.TreeSet<java.lang.Integer> intSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_pollFirst(intSet18, intSet19, (java.lang.Integer) (-1));
        fuzzTest11.FuzzTest_pollFirst(intSet14, intSet19, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet26 = null;
        naturalness.TreeSet<java.lang.Integer> intSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_pollFirst(intSet26, intSet27, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet32 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        fuzzTest24.FuzzTest_pollFirst(intSet27, intSet32, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_pollFirst(intSet19, intSet27, (java.lang.Integer) 10);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-1), 100, 1, 10, 0 };
        naturalness.TreeSet<java.lang.Integer> intSet44 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet52 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        naturalness.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest46.FuzzTest_pollFirst(intSet52, intSet54, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet59 = null;
        naturalness.TreeSet<java.lang.Integer> intSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_pollFirst(intSet59, intSet60, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet64 = null;
        naturalness.TreeSet<java.lang.Integer> intSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_pollFirst(intSet64, intSet65, (java.lang.Integer) (-1));
        fuzzTest57.FuzzTest_pollFirst(intSet60, intSet65, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet72 = null;
        naturalness.TreeSet<java.lang.Integer> intSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_pollFirst(intSet72, intSet73, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet78 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        fuzzTest70.FuzzTest_pollFirst(intSet73, intSet78, (java.lang.Integer) 0);
        fuzzTest46.FuzzTest_pollFirst(intSet65, intSet73, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet44, intSet65, (java.lang.Integer) 100);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        naturalness.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_pollFirst(intSet2, intSet3, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest0.FuzzTest_pollFirst(intSet3, intSet8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet14 = null;
        naturalness.TreeSet<java.lang.Integer> intSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_pollFirst(intSet14, intSet15, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet20 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest12.FuzzTest_pollFirst(intSet15, intSet20, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet25 = null;
        naturalness.TreeSet<java.lang.Integer> intSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_pollFirst(intSet25, intSet26, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet20, intSet26, (java.lang.Integer) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet6, intSet8, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet13 = null;
        naturalness.TreeSet<java.lang.Integer> intSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_pollFirst(intSet13, intSet14, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet19 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzzTest11.FuzzTest_pollFirst(intSet14, intSet19, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet25 = null;
        naturalness.TreeSet<java.lang.Integer> intSet26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest24.FuzzTest_pollFirst(intSet25, intSet26, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet30 = null;
        naturalness.TreeSet<java.lang.Integer> intSet31 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest29.FuzzTest_pollFirst(intSet30, intSet31, (java.lang.Integer) (-1));
        fuzzTest23.FuzzTest_pollFirst(intSet26, intSet31, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_pollFirst(intSet14, intSet26, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 0, (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet42 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, 100, 10, 10 };
        naturalness.TreeSet<java.lang.Integer> intSet49 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet42, intSet49, (java.lang.Integer) 10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        naturalness.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_pollFirst(intSet2, intSet3, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet7 = null;
        naturalness.TreeSet<java.lang.Integer> intSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_pollFirst(intSet7, intSet8, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_pollFirst(intSet3, intSet8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet15 = null;
        naturalness.TreeSet<java.lang.Integer> intSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_pollFirst(intSet15, intSet16, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet21 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        fuzzTest13.FuzzTest_pollFirst(intSet16, intSet21, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet27 = null;
        naturalness.TreeSet<java.lang.Integer> intSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_pollFirst(intSet27, intSet28, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet33 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest25.FuzzTest_pollFirst(intSet28, intSet33, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_pollFirst(intSet16, intSet28, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet41 = null;
        naturalness.TreeSet<java.lang.Integer> intSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_pollFirst(intSet41, intSet42, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet47 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest39.FuzzTest_pollFirst(intSet42, intSet47, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet53 = null;
        naturalness.TreeSet<java.lang.Integer> intSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_pollFirst(intSet53, intSet54, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet58 = null;
        naturalness.TreeSet<java.lang.Integer> intSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_pollFirst(intSet58, intSet59, (java.lang.Integer) (-1));
        fuzzTest51.FuzzTest_pollFirst(intSet54, intSet59, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet47, intSet54, (java.lang.Integer) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_pollFirst(intSet1, intSet2, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet6 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        naturalness.TreeSet<java.lang.Integer> intSet9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest7.FuzzTest_pollFirst(intSet8, intSet9, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet14 = null;
        naturalness.TreeSet<java.lang.Integer> intSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_pollFirst(intSet14, intSet15, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet20 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest12.FuzzTest_pollFirst(intSet15, intSet20, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet30 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        naturalness.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest24.FuzzTest_pollFirst(intSet30, intSet32, (java.lang.Integer) (-1));
        fuzzTest7.FuzzTest_pollFirst(intSet15, intSet30, (java.lang.Integer) (-1));
        fuzzTest5.FuzzTest_pollFirst(intSet6, intSet30, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet42 = null;
        naturalness.TreeSet<java.lang.Integer> intSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_pollFirst(intSet42, intSet43, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet48 = null;
        naturalness.TreeSet<java.lang.Integer> intSet49 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest47.FuzzTest_pollFirst(intSet48, intSet49, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet54 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzzTest46.FuzzTest_pollFirst(intSet49, intSet54, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet64 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        naturalness.TreeSet<java.lang.Integer> intSet66 = null;
        fuzzTest58.FuzzTest_pollFirst(intSet64, intSet66, (java.lang.Integer) (-1));
        fuzzTest41.FuzzTest_pollFirst(intSet49, intSet64, (java.lang.Integer) (-1));
        fuzzTest39.FuzzTest_pollFirst(intSet40, intSet64, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_pollFirst(intSet6, intSet40, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet77 = null;
        naturalness.TreeSet<java.lang.Integer> intSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_pollFirst(intSet77, intSet78, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet83 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        fuzzTest75.FuzzTest_pollFirst(intSet78, intSet83, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest87 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet93 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet93, intArray92);
        naturalness.TreeSet<java.lang.Integer> intSet95 = null;
        fuzzTest87.FuzzTest_pollFirst(intSet93, intSet95, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet83, intSet93, (java.lang.Integer) 100);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        naturalness.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_pollFirst(intSet2, intSet3, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest0.FuzzTest_pollFirst(intSet3, intSet8, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet15 = null;
        naturalness.TreeSet<java.lang.Integer> intSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_pollFirst(intSet15, intSet16, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet21 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        fuzzTest13.FuzzTest_pollFirst(intSet16, intSet21, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_pollFirst(intSet12, intSet21, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet29 = null;
        naturalness.TreeSet<java.lang.Integer> intSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_pollFirst(intSet29, intSet30, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet34 = null;
        naturalness.TreeSet<java.lang.Integer> intSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_pollFirst(intSet34, intSet35, (java.lang.Integer) (-1));
        fuzzTest27.FuzzTest_pollFirst(intSet30, intSet35, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet42 = null;
        naturalness.TreeSet<java.lang.Integer> intSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_pollFirst(intSet42, intSet43, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet47 = null;
        naturalness.TreeSet<java.lang.Integer> intSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_pollFirst(intSet47, intSet48, (java.lang.Integer) (-1));
        fuzzTest40.FuzzTest_pollFirst(intSet43, intSet48, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_pollFirst(intSet35, intSet43, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet61 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        naturalness.TreeSet<java.lang.Integer> intSet63 = null;
        fuzzTest55.FuzzTest_pollFirst(intSet61, intSet63, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet68 = null;
        naturalness.TreeSet<java.lang.Integer> intSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_pollFirst(intSet68, intSet69, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet74 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        fuzzTest66.FuzzTest_pollFirst(intSet69, intSet74, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet61, intSet69, (java.lang.Integer) (-1));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        naturalness.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_pollFirst(intSet2, intSet3, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest0.FuzzTest_pollFirst(intSet3, intSet8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet14 = null;
        naturalness.TreeSet<java.lang.Integer> intSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_pollFirst(intSet14, intSet15, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet20 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest12.FuzzTest_pollFirst(intSet15, intSet20, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet20, intSet24, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet29 = null;
        naturalness.TreeSet<java.lang.Integer> intSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_pollFirst(intSet29, intSet30, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet35 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        fuzzTest27.FuzzTest_pollFirst(intSet30, intSet35, (java.lang.Integer) 0);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0, 2, 0, 1, 100, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet46 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet50 = null;
        naturalness.TreeSet<java.lang.Integer> intSet51 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest49.FuzzTest_pollFirst(intSet50, intSet51, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet56 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        fuzzTest48.FuzzTest_pollFirst(intSet51, intSet56, (java.lang.Integer) 0);
        fuzzTest27.FuzzTest_pollFirst(intSet46, intSet56, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet64 = null;
        naturalness.TreeSet<java.lang.Integer> intSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_pollFirst(intSet64, intSet65, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet70 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        fuzzTest62.FuzzTest_pollFirst(intSet65, intSet70, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet46, intSet70, (java.lang.Integer) 100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet6, intSet8, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet12 = null;
        naturalness.TreeSet<java.lang.Integer> intSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_pollFirst(intSet12, intSet13, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_pollFirst(intSet12, intSet16, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet21 = null;
        naturalness.TreeSet<java.lang.Integer> intSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_pollFirst(intSet21, intSet22, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet27 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzzTest19.FuzzTest_pollFirst(intSet22, intSet27, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet32 = null;
        naturalness.TreeSet<java.lang.Integer> intSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_pollFirst(intSet32, intSet33, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet38 = null;
        naturalness.TreeSet<java.lang.Integer> intSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_pollFirst(intSet38, intSet39, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet44 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzzTest36.FuzzTest_pollFirst(intSet39, intSet44, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet54 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        naturalness.TreeSet<java.lang.Integer> intSet56 = null;
        fuzzTest48.FuzzTest_pollFirst(intSet54, intSet56, (java.lang.Integer) (-1));
        fuzzTest31.FuzzTest_pollFirst(intSet39, intSet54, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet62 = null;
        naturalness.TreeSet<java.lang.Integer> intSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_pollFirst(intSet62, intSet63, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet68 = null;
        naturalness.TreeSet<java.lang.Integer> intSet69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest67.FuzzTest_pollFirst(intSet68, intSet69, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet73 = null;
        naturalness.TreeSet<java.lang.Integer> intSet74 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest72.FuzzTest_pollFirst(intSet73, intSet74, (java.lang.Integer) (-1));
        fuzzTest66.FuzzTest_pollFirst(intSet69, intSet74, (java.lang.Integer) 0);
        fuzzTest31.FuzzTest_pollFirst(intSet62, intSet69, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet27, intSet69, (java.lang.Integer) 2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet6, intSet8, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet12 = null;
        naturalness.TreeSet<java.lang.Integer> intSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_pollFirst(intSet12, intSet13, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_pollFirst(intSet12, intSet16, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet25 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        naturalness.TreeSet<java.lang.Integer> intSet27 = null;
        fuzzTest19.FuzzTest_pollFirst(intSet25, intSet27, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet32 = null;
        naturalness.TreeSet<java.lang.Integer> intSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_pollFirst(intSet32, intSet33, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet38 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzzTest30.FuzzTest_pollFirst(intSet33, intSet38, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet44 = null;
        naturalness.TreeSet<java.lang.Integer> intSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_pollFirst(intSet44, intSet45, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet50 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest42.FuzzTest_pollFirst(intSet45, intSet50, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest30.FuzzTest_pollFirst(intSet50, intSet54, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet58 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet60 = null;
        naturalness.TreeSet<java.lang.Integer> intSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest59.FuzzTest_pollFirst(intSet60, intSet61, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet66 = null;
        naturalness.TreeSet<java.lang.Integer> intSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_pollFirst(intSet66, intSet67, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet72 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest64.FuzzTest_pollFirst(intSet67, intSet72, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet82 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        naturalness.TreeSet<java.lang.Integer> intSet84 = null;
        fuzzTest76.FuzzTest_pollFirst(intSet82, intSet84, (java.lang.Integer) (-1));
        fuzzTest59.FuzzTest_pollFirst(intSet67, intSet82, (java.lang.Integer) (-1));
        fuzzTest57.FuzzTest_pollFirst(intSet58, intSet82, (java.lang.Integer) 100);
        fuzzTest19.FuzzTest_pollFirst(intSet54, intSet82, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest93 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet94 = null;
        naturalness.TreeSet<java.lang.Integer> intSet95 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest93.FuzzTest_pollFirst(intSet94, intSet95, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet82, intSet95, (java.lang.Integer) 2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        naturalness.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_pollFirst(intSet2, intSet3, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet7 = null;
        naturalness.TreeSet<java.lang.Integer> intSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_pollFirst(intSet7, intSet8, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_pollFirst(intSet3, intSet8, (java.lang.Integer) 0);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 10 };
        naturalness.TreeSet<java.lang.Integer> intSet16 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet24 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        naturalness.TreeSet<java.lang.Integer> intSet26 = null;
        fuzzTest18.FuzzTest_pollFirst(intSet24, intSet26, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet31 = null;
        naturalness.TreeSet<java.lang.Integer> intSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_pollFirst(intSet31, intSet32, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet36 = null;
        naturalness.TreeSet<java.lang.Integer> intSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_pollFirst(intSet36, intSet37, (java.lang.Integer) (-1));
        fuzzTest29.FuzzTest_pollFirst(intSet32, intSet37, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet44 = null;
        naturalness.TreeSet<java.lang.Integer> intSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_pollFirst(intSet44, intSet45, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet49 = null;
        naturalness.TreeSet<java.lang.Integer> intSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_pollFirst(intSet49, intSet50, (java.lang.Integer) (-1));
        fuzzTest42.FuzzTest_pollFirst(intSet45, intSet50, (java.lang.Integer) 0);
        fuzzTest18.FuzzTest_pollFirst(intSet32, intSet50, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet16, intSet32, (java.lang.Integer) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        naturalness.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_pollFirst(intSet2, intSet3, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet7 = null;
        naturalness.TreeSet<java.lang.Integer> intSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_pollFirst(intSet7, intSet8, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_pollFirst(intSet3, intSet8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet15 = null;
        naturalness.TreeSet<java.lang.Integer> intSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest14.FuzzTest_pollFirst(intSet15, intSet16, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet21 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        fuzzTest13.FuzzTest_pollFirst(intSet16, intSet21, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet27 = null;
        naturalness.TreeSet<java.lang.Integer> intSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_pollFirst(intSet27, intSet28, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet33 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzzTest25.FuzzTest_pollFirst(intSet28, intSet33, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_pollFirst(intSet16, intSet28, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet41 = null;
        naturalness.TreeSet<java.lang.Integer> intSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_pollFirst(intSet41, intSet42, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet47 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest39.FuzzTest_pollFirst(intSet42, intSet47, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet53 = null;
        naturalness.TreeSet<java.lang.Integer> intSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_pollFirst(intSet53, intSet54, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet58 = null;
        naturalness.TreeSet<java.lang.Integer> intSet59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest57.FuzzTest_pollFirst(intSet58, intSet59, (java.lang.Integer) (-1));
        fuzzTest51.FuzzTest_pollFirst(intSet54, intSet59, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet66 = null;
        naturalness.TreeSet<java.lang.Integer> intSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_pollFirst(intSet66, intSet67, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet72 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest64.FuzzTest_pollFirst(intSet67, intSet72, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet78 = null;
        naturalness.TreeSet<java.lang.Integer> intSet79 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest77.FuzzTest_pollFirst(intSet78, intSet79, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet84 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        fuzzTest76.FuzzTest_pollFirst(intSet79, intSet84, (java.lang.Integer) 0);
        fuzzTest51.FuzzTest_pollFirst(intSet67, intSet79, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet47, intSet79, (java.lang.Integer) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        naturalness.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_pollFirst(intSet2, intSet3, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest0.FuzzTest_pollFirst(intSet3, intSet8, (java.lang.Integer) 0);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, 2, 0, 1, 100, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet19 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet23 = null;
        naturalness.TreeSet<java.lang.Integer> intSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest22.FuzzTest_pollFirst(intSet23, intSet24, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet29 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        fuzzTest21.FuzzTest_pollFirst(intSet24, intSet29, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_pollFirst(intSet19, intSet29, (java.lang.Integer) 0);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 0 };
        naturalness.TreeSet<java.lang.Integer> intSet38 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet42 = null;
        naturalness.TreeSet<java.lang.Integer> intSet43 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest41.FuzzTest_pollFirst(intSet42, intSet43, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet48 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        fuzzTest40.FuzzTest_pollFirst(intSet43, intSet48, (java.lang.Integer) 0);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0, 2, 0, 1, 100, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet59 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet63 = null;
        naturalness.TreeSet<java.lang.Integer> intSet64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest62.FuzzTest_pollFirst(intSet63, intSet64, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet69 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        fuzzTest61.FuzzTest_pollFirst(intSet64, intSet69, (java.lang.Integer) 0);
        fuzzTest40.FuzzTest_pollFirst(intSet59, intSet69, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet38, intSet59, (java.lang.Integer) 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        naturalness.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_pollFirst(intSet2, intSet3, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest0.FuzzTest_pollFirst(intSet3, intSet8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet14 = null;
        naturalness.TreeSet<java.lang.Integer> intSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_pollFirst(intSet14, intSet15, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet20 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest12.FuzzTest_pollFirst(intSet15, intSet20, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet20, intSet24, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet29 = null;
        naturalness.TreeSet<java.lang.Integer> intSet30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_pollFirst(intSet29, intSet30, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet35 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        fuzzTest27.FuzzTest_pollFirst(intSet30, intSet35, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet45 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        naturalness.TreeSet<java.lang.Integer> intSet47 = null;
        fuzzTest39.FuzzTest_pollFirst(intSet45, intSet47, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet52 = null;
        naturalness.TreeSet<java.lang.Integer> intSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_pollFirst(intSet52, intSet53, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet58 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        fuzzTest50.FuzzTest_pollFirst(intSet53, intSet58, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet64 = null;
        naturalness.TreeSet<java.lang.Integer> intSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_pollFirst(intSet64, intSet65, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet69 = null;
        naturalness.TreeSet<java.lang.Integer> intSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_pollFirst(intSet69, intSet70, (java.lang.Integer) (-1));
        fuzzTest62.FuzzTest_pollFirst(intSet65, intSet70, (java.lang.Integer) 0);
        fuzzTest39.FuzzTest_pollFirst(intSet53, intSet65, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet35, intSet53, (java.lang.Integer) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        naturalness.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_pollFirst(intSet2, intSet3, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest0.FuzzTest_pollFirst(intSet3, intSet8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet14 = null;
        naturalness.TreeSet<java.lang.Integer> intSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_pollFirst(intSet14, intSet15, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet20 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest12.FuzzTest_pollFirst(intSet15, intSet20, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet20, intSet24, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet27 = null;
        naturalness.TreeSet<java.lang.Integer> intSet28 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet27, intSet28, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet32 = null;
        naturalness.TreeSet<java.lang.Integer> intSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_pollFirst(intSet32, intSet33, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet38 = null;
        naturalness.TreeSet<java.lang.Integer> intSet39 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest37.FuzzTest_pollFirst(intSet38, intSet39, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet44 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzzTest36.FuzzTest_pollFirst(intSet39, intSet44, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet51 = null;
        naturalness.TreeSet<java.lang.Integer> intSet52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest50.FuzzTest_pollFirst(intSet51, intSet52, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet57 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        fuzzTest49.FuzzTest_pollFirst(intSet52, intSet57, (java.lang.Integer) 0);
        fuzzTest36.FuzzTest_pollFirst(intSet48, intSet57, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet64 = null;
        naturalness.TreeSet<java.lang.Integer> intSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_pollFirst(intSet64, intSet65, (java.lang.Integer) (-1));
        fuzzTest31.FuzzTest_pollFirst(intSet57, intSet64, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet71 = null;
        naturalness.TreeSet<java.lang.Integer> intSet72 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest70.FuzzTest_pollFirst(intSet71, intSet72, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet57, intSet72, (java.lang.Integer) 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        naturalness.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_pollFirst(intSet2, intSet3, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet7 = null;
        naturalness.TreeSet<java.lang.Integer> intSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_pollFirst(intSet7, intSet8, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_pollFirst(intSet3, intSet8, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet16 = null;
        naturalness.TreeSet<java.lang.Integer> intSet17 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest15.FuzzTest_pollFirst(intSet16, intSet17, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet22 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        fuzzTest14.FuzzTest_pollFirst(intSet17, intSet22, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_pollFirst(intSet13, intSet17, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet34 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        naturalness.TreeSet<java.lang.Integer> intSet36 = null;
        fuzzTest28.FuzzTest_pollFirst(intSet34, intSet36, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet45 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        naturalness.TreeSet<java.lang.Integer> intSet47 = null;
        fuzzTest39.FuzzTest_pollFirst(intSet45, intSet47, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet52 = null;
        naturalness.TreeSet<java.lang.Integer> intSet53 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest51.FuzzTest_pollFirst(intSet52, intSet53, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet58 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        fuzzTest50.FuzzTest_pollFirst(intSet53, intSet58, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet64 = null;
        naturalness.TreeSet<java.lang.Integer> intSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_pollFirst(intSet64, intSet65, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet69 = null;
        naturalness.TreeSet<java.lang.Integer> intSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_pollFirst(intSet69, intSet70, (java.lang.Integer) (-1));
        fuzzTest62.FuzzTest_pollFirst(intSet65, intSet70, (java.lang.Integer) 0);
        fuzzTest39.FuzzTest_pollFirst(intSet53, intSet65, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet34, intSet53, (java.lang.Integer) 100);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        naturalness.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_pollFirst(intSet2, intSet3, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet7 = null;
        naturalness.TreeSet<java.lang.Integer> intSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_pollFirst(intSet7, intSet8, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_pollFirst(intSet3, intSet8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet19 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        naturalness.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest13.FuzzTest_pollFirst(intSet19, intSet21, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet26 = null;
        naturalness.TreeSet<java.lang.Integer> intSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_pollFirst(intSet26, intSet27, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet31 = null;
        naturalness.TreeSet<java.lang.Integer> intSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_pollFirst(intSet31, intSet32, (java.lang.Integer) (-1));
        fuzzTest24.FuzzTest_pollFirst(intSet27, intSet32, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet39 = null;
        naturalness.TreeSet<java.lang.Integer> intSet40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest38.FuzzTest_pollFirst(intSet39, intSet40, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet44 = null;
        naturalness.TreeSet<java.lang.Integer> intSet45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest43.FuzzTest_pollFirst(intSet44, intSet45, (java.lang.Integer) (-1));
        fuzzTest37.FuzzTest_pollFirst(intSet40, intSet45, (java.lang.Integer) 0);
        fuzzTest13.FuzzTest_pollFirst(intSet27, intSet45, (java.lang.Integer) 1);
        naturalness.TreeSet<java.lang.Integer> intSet52 = null;
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10, 0, (-1), 0, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet59 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest13.FuzzTest_pollFirst(intSet52, intSet59, (java.lang.Integer) 100);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 0, 10 };
        naturalness.TreeSet<java.lang.Integer> intSet67 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet75 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        naturalness.TreeSet<java.lang.Integer> intSet77 = null;
        fuzzTest69.FuzzTest_pollFirst(intSet75, intSet77, (java.lang.Integer) (-1));
        fuzzTest13.FuzzTest_pollFirst(intSet67, intSet75, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet84 = null;
        naturalness.TreeSet<java.lang.Integer> intSet85 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest83.FuzzTest_pollFirst(intSet84, intSet85, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest88 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet89 = null;
        naturalness.TreeSet<java.lang.Integer> intSet90 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest88.FuzzTest_pollFirst(intSet89, intSet90, (java.lang.Integer) (-1));
        fuzzTest82.FuzzTest_pollFirst(intSet85, intSet90, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet75, intSet90, (java.lang.Integer) (-1));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = null;
        naturalness.TreeSet<java.lang.Integer> intSet2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_pollFirst(intSet1, intSet2, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet7 = null;
        naturalness.TreeSet<java.lang.Integer> intSet8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest6.FuzzTest_pollFirst(intSet7, intSet8, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet13 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        fuzzTest5.FuzzTest_pollFirst(intSet8, intSet13, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet23 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        naturalness.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest17.FuzzTest_pollFirst(intSet23, intSet25, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_pollFirst(intSet8, intSet23, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet32 = null;
        naturalness.TreeSet<java.lang.Integer> intSet33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest31.FuzzTest_pollFirst(intSet32, intSet33, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet38 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        fuzzTest30.FuzzTest_pollFirst(intSet33, intSet38, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet45 = null;
        naturalness.TreeSet<java.lang.Integer> intSet46 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest44.FuzzTest_pollFirst(intSet45, intSet46, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet51 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        fuzzTest43.FuzzTest_pollFirst(intSet46, intSet51, (java.lang.Integer) 0);
        fuzzTest30.FuzzTest_pollFirst(intSet42, intSet51, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet59 = null;
        naturalness.TreeSet<java.lang.Integer> intSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_pollFirst(intSet59, intSet60, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet65 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        fuzzTest57.FuzzTest_pollFirst(intSet60, intSet65, (java.lang.Integer) 0);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, 2, 0, 1, 100, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet76 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet80 = null;
        naturalness.TreeSet<java.lang.Integer> intSet81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest79.FuzzTest_pollFirst(intSet80, intSet81, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet86 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        fuzzTest78.FuzzTest_pollFirst(intSet81, intSet86, (java.lang.Integer) 0);
        fuzzTest57.FuzzTest_pollFirst(intSet76, intSet86, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet51, intSet76, (java.lang.Integer) 1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet6, intSet8, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet13 = null;
        naturalness.TreeSet<java.lang.Integer> intSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_pollFirst(intSet13, intSet14, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet18 = null;
        naturalness.TreeSet<java.lang.Integer> intSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_pollFirst(intSet18, intSet19, (java.lang.Integer) (-1));
        fuzzTest11.FuzzTest_pollFirst(intSet14, intSet19, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet26 = null;
        naturalness.TreeSet<java.lang.Integer> intSet27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_pollFirst(intSet26, intSet27, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet31 = null;
        naturalness.TreeSet<java.lang.Integer> intSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_pollFirst(intSet31, intSet32, (java.lang.Integer) (-1));
        fuzzTest24.FuzzTest_pollFirst(intSet27, intSet32, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_pollFirst(intSet14, intSet32, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet41 = null;
        naturalness.TreeSet<java.lang.Integer> intSet42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest40.FuzzTest_pollFirst(intSet41, intSet42, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet47 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        fuzzTest39.FuzzTest_pollFirst(intSet42, intSet47, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet57 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        naturalness.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest51.FuzzTest_pollFirst(intSet57, intSet59, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet64 = null;
        naturalness.TreeSet<java.lang.Integer> intSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_pollFirst(intSet64, intSet65, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet69 = null;
        naturalness.TreeSet<java.lang.Integer> intSet70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest68.FuzzTest_pollFirst(intSet69, intSet70, (java.lang.Integer) (-1));
        fuzzTest62.FuzzTest_pollFirst(intSet65, intSet70, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet77 = null;
        naturalness.TreeSet<java.lang.Integer> intSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_pollFirst(intSet77, intSet78, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet82 = null;
        naturalness.TreeSet<java.lang.Integer> intSet83 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest81.FuzzTest_pollFirst(intSet82, intSet83, (java.lang.Integer) (-1));
        fuzzTest75.FuzzTest_pollFirst(intSet78, intSet83, (java.lang.Integer) 0);
        fuzzTest51.FuzzTest_pollFirst(intSet65, intSet83, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet47, intSet65, (java.lang.Integer) 2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet7 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        naturalness.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_pollFirst(intSet7, intSet9, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet14 = null;
        naturalness.TreeSet<java.lang.Integer> intSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_pollFirst(intSet14, intSet15, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet20 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest12.FuzzTest_pollFirst(intSet15, intSet20, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_pollFirst(intSet15, intSet24, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet33 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        naturalness.TreeSet<java.lang.Integer> intSet35 = null;
        fuzzTest27.FuzzTest_pollFirst(intSet33, intSet35, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet40 = null;
        naturalness.TreeSet<java.lang.Integer> intSet41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest39.FuzzTest_pollFirst(intSet40, intSet41, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet46 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        fuzzTest38.FuzzTest_pollFirst(intSet41, intSet46, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_pollFirst(intSet41, intSet50, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet56 = null;
        naturalness.TreeSet<java.lang.Integer> intSet57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest55.FuzzTest_pollFirst(intSet56, intSet57, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet62 = null;
        naturalness.TreeSet<java.lang.Integer> intSet63 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest61.FuzzTest_pollFirst(intSet62, intSet63, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet68 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        fuzzTest60.FuzzTest_pollFirst(intSet63, intSet68, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet78 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        naturalness.TreeSet<java.lang.Integer> intSet80 = null;
        fuzzTest72.FuzzTest_pollFirst(intSet78, intSet80, (java.lang.Integer) (-1));
        fuzzTest55.FuzzTest_pollFirst(intSet63, intSet78, (java.lang.Integer) (-1));
        fuzzTest53.FuzzTest_pollFirst(intSet54, intSet78, (java.lang.Integer) 100);
        fuzzTest1.FuzzTest_pollFirst(intSet50, intSet78, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest89 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet90 = null;
        naturalness.TreeSet<java.lang.Integer> intSet91 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest89.FuzzTest_pollFirst(intSet90, intSet91, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet78, intSet91, (java.lang.Integer) (-1));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet6, intSet8, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet13 = null;
        naturalness.TreeSet<java.lang.Integer> intSet14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_pollFirst(intSet13, intSet14, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet18 = null;
        naturalness.TreeSet<java.lang.Integer> intSet19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest17.FuzzTest_pollFirst(intSet18, intSet19, (java.lang.Integer) (-1));
        fuzzTest11.FuzzTest_pollFirst(intSet14, intSet19, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet27 = null;
        naturalness.TreeSet<java.lang.Integer> intSet28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest26.FuzzTest_pollFirst(intSet27, intSet28, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet33 = null;
        naturalness.TreeSet<java.lang.Integer> intSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_pollFirst(intSet33, intSet34, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet39 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        fuzzTest31.FuzzTest_pollFirst(intSet34, intSet39, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet49 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        naturalness.TreeSet<java.lang.Integer> intSet51 = null;
        fuzzTest43.FuzzTest_pollFirst(intSet49, intSet51, (java.lang.Integer) (-1));
        fuzzTest26.FuzzTest_pollFirst(intSet34, intSet49, (java.lang.Integer) (-1));
        fuzzTest24.FuzzTest_pollFirst(intSet25, intSet49, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_pollFirst(intSet14, intSet25, (java.lang.Integer) 0);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet63 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet66 = null;
        naturalness.TreeSet<java.lang.Integer> intSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_pollFirst(intSet66, intSet67, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet72 = null;
        naturalness.TreeSet<java.lang.Integer> intSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_pollFirst(intSet72, intSet73, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet78 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        fuzzTest70.FuzzTest_pollFirst(intSet73, intSet78, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet88 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        naturalness.TreeSet<java.lang.Integer> intSet90 = null;
        fuzzTest82.FuzzTest_pollFirst(intSet88, intSet90, (java.lang.Integer) (-1));
        fuzzTest65.FuzzTest_pollFirst(intSet73, intSet88, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet63, intSet88, (java.lang.Integer) 10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet3 = null;
        naturalness.TreeSet<java.lang.Integer> intSet4 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest2.FuzzTest_pollFirst(intSet3, intSet4, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet9 = null;
        naturalness.TreeSet<java.lang.Integer> intSet10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_pollFirst(intSet9, intSet10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet15 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzzTest7.FuzzTest_pollFirst(intSet10, intSet15, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet25 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        naturalness.TreeSet<java.lang.Integer> intSet27 = null;
        fuzzTest19.FuzzTest_pollFirst(intSet25, intSet27, (java.lang.Integer) (-1));
        fuzzTest2.FuzzTest_pollFirst(intSet10, intSet25, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_pollFirst(intSet1, intSet25, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet36 = null;
        naturalness.TreeSet<java.lang.Integer> intSet37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest35.FuzzTest_pollFirst(intSet36, intSet37, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet42 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest34.FuzzTest_pollFirst(intSet37, intSet42, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet47 = null;
        naturalness.TreeSet<java.lang.Integer> intSet48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest46.FuzzTest_pollFirst(intSet47, intSet48, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet53 = null;
        naturalness.TreeSet<java.lang.Integer> intSet54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest52.FuzzTest_pollFirst(intSet53, intSet54, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet59 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzzTest51.FuzzTest_pollFirst(intSet54, intSet59, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet63 = null;
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet66 = null;
        naturalness.TreeSet<java.lang.Integer> intSet67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest65.FuzzTest_pollFirst(intSet66, intSet67, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet72 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        fuzzTest64.FuzzTest_pollFirst(intSet67, intSet72, (java.lang.Integer) 0);
        fuzzTest51.FuzzTest_pollFirst(intSet63, intSet72, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet79 = null;
        naturalness.TreeSet<java.lang.Integer> intSet80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest78.FuzzTest_pollFirst(intSet79, intSet80, (java.lang.Integer) (-1));
        fuzzTest46.FuzzTest_pollFirst(intSet72, intSet79, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet42, intSet72, (java.lang.Integer) 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet6, intSet8, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet12 = null;
        naturalness.TreeSet<java.lang.Integer> intSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_pollFirst(intSet12, intSet13, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_pollFirst(intSet12, intSet16, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet21 = null;
        naturalness.TreeSet<java.lang.Integer> intSet22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_pollFirst(intSet21, intSet22, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet27 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        fuzzTest19.FuzzTest_pollFirst(intSet22, intSet27, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet34 = null;
        naturalness.TreeSet<java.lang.Integer> intSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_pollFirst(intSet34, intSet35, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet40 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest32.FuzzTest_pollFirst(intSet35, intSet40, (java.lang.Integer) 0);
        fuzzTest19.FuzzTest_pollFirst(intSet31, intSet40, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet53 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        naturalness.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest47.FuzzTest_pollFirst(intSet53, intSet55, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet58 = null;
        fuzzTest46.FuzzTest_pollFirst(intSet55, intSet58, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet64 = null;
        naturalness.TreeSet<java.lang.Integer> intSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_pollFirst(intSet64, intSet65, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet70 = null;
        naturalness.TreeSet<java.lang.Integer> intSet71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest69.FuzzTest_pollFirst(intSet70, intSet71, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet76 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        fuzzTest68.FuzzTest_pollFirst(intSet71, intSet76, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet86 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        naturalness.TreeSet<java.lang.Integer> intSet88 = null;
        fuzzTest80.FuzzTest_pollFirst(intSet86, intSet88, (java.lang.Integer) (-1));
        fuzzTest63.FuzzTest_pollFirst(intSet71, intSet86, (java.lang.Integer) (-1));
        fuzzTest61.FuzzTest_pollFirst(intSet62, intSet86, (java.lang.Integer) 100);
        naturalness.TreeSet<java.lang.Integer> intSet95 = null;
        fuzzTest46.FuzzTest_pollFirst(intSet62, intSet95, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet40, intSet62, (java.lang.Integer) 1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet7 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        naturalness.TreeSet<java.lang.Integer> intSet9 = null;
        fuzzTest1.FuzzTest_pollFirst(intSet7, intSet9, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet12 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet9, intSet12, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet21 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        naturalness.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest15.FuzzTest_pollFirst(intSet21, intSet23, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet28 = null;
        naturalness.TreeSet<java.lang.Integer> intSet29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest27.FuzzTest_pollFirst(intSet28, intSet29, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet33 = null;
        naturalness.TreeSet<java.lang.Integer> intSet34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest32.FuzzTest_pollFirst(intSet33, intSet34, (java.lang.Integer) (-1));
        fuzzTest26.FuzzTest_pollFirst(intSet29, intSet34, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet21, intSet34, (java.lang.Integer) (-1));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet6, intSet8, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet12 = null;
        naturalness.TreeSet<java.lang.Integer> intSet13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_pollFirst(intSet12, intSet13, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_pollFirst(intSet12, intSet16, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet26 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        naturalness.TreeSet<java.lang.Integer> intSet28 = null;
        fuzzTest20.FuzzTest_pollFirst(intSet26, intSet28, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest19.FuzzTest_pollFirst(intSet28, intSet31, (java.lang.Integer) 10);
        naturalness.TreeSet<java.lang.Integer> intSet34 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), (-1), 1, (-1), 1, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet42 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        fuzzTest19.FuzzTest_pollFirst(intSet34, intSet42, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet52 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        naturalness.TreeSet<java.lang.Integer> intSet54 = null;
        fuzzTest46.FuzzTest_pollFirst(intSet52, intSet54, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet59 = null;
        naturalness.TreeSet<java.lang.Integer> intSet60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest58.FuzzTest_pollFirst(intSet59, intSet60, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet64 = null;
        naturalness.TreeSet<java.lang.Integer> intSet65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest63.FuzzTest_pollFirst(intSet64, intSet65, (java.lang.Integer) (-1));
        fuzzTest57.FuzzTest_pollFirst(intSet60, intSet65, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet72 = null;
        naturalness.TreeSet<java.lang.Integer> intSet73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest71.FuzzTest_pollFirst(intSet72, intSet73, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet77 = null;
        naturalness.TreeSet<java.lang.Integer> intSet78 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest76.FuzzTest_pollFirst(intSet77, intSet78, (java.lang.Integer) (-1));
        fuzzTest70.FuzzTest_pollFirst(intSet73, intSet78, (java.lang.Integer) 0);
        fuzzTest46.FuzzTest_pollFirst(intSet60, intSet78, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet42, intSet60, (java.lang.Integer) 2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet6, intSet8, (java.lang.Integer) (-1));
        naturalness.TreeSet<java.lang.Integer> intSet11 = null;
        naturalness.TreeSet<java.lang.Integer> intSet12 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet11, intSet12, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet21 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        naturalness.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest15.FuzzTest_pollFirst(intSet21, intSet23, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 10, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet30 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet34 = null;
        naturalness.TreeSet<java.lang.Integer> intSet35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_pollFirst(intSet34, intSet35, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet40 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        fuzzTest32.FuzzTest_pollFirst(intSet35, intSet40, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet46 = null;
        naturalness.TreeSet<java.lang.Integer> intSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest45.FuzzTest_pollFirst(intSet46, intSet47, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet52 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzzTest44.FuzzTest_pollFirst(intSet47, intSet52, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet56 = null;
        fuzzTest32.FuzzTest_pollFirst(intSet52, intSet56, (java.lang.Integer) 0);
        fuzzTest15.FuzzTest_pollFirst(intSet30, intSet56, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_pollFirst(intSet56, intSet61, (java.lang.Integer) 2);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 100, 0, 1, (-1), 2 };
        naturalness.TreeSet<java.lang.Integer> intSet71 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        naturalness.TreeSet<java.lang.Integer> intSet73 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet71, intSet73, (java.lang.Integer) 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        naturalness.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_pollFirst(intSet2, intSet3, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest0.FuzzTest_pollFirst(intSet3, intSet8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet14 = null;
        naturalness.TreeSet<java.lang.Integer> intSet15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_pollFirst(intSet14, intSet15, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet20 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        fuzzTest12.FuzzTest_pollFirst(intSet15, intSet20, (java.lang.Integer) 0);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 2, 0, 1, 100, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet31 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet35 = null;
        naturalness.TreeSet<java.lang.Integer> intSet36 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest34.FuzzTest_pollFirst(intSet35, intSet36, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet41 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        fuzzTest33.FuzzTest_pollFirst(intSet36, intSet41, (java.lang.Integer) 0);
        fuzzTest12.FuzzTest_pollFirst(intSet31, intSet41, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet47 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet41, intSet47, (java.lang.Integer) 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet6 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        naturalness.TreeSet<java.lang.Integer> intSet8 = null;
        fuzzTest0.FuzzTest_pollFirst(intSet6, intSet8, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 10, 100 };
        naturalness.TreeSet<java.lang.Integer> intSet15 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet19 = null;
        naturalness.TreeSet<java.lang.Integer> intSet20 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest18.FuzzTest_pollFirst(intSet19, intSet20, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet25 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        fuzzTest17.FuzzTest_pollFirst(intSet20, intSet25, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet31 = null;
        naturalness.TreeSet<java.lang.Integer> intSet32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_pollFirst(intSet31, intSet32, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet37 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        fuzzTest29.FuzzTest_pollFirst(intSet32, intSet37, (java.lang.Integer) 0);
        naturalness.TreeSet<java.lang.Integer> intSet41 = null;
        fuzzTest17.FuzzTest_pollFirst(intSet37, intSet41, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_pollFirst(intSet15, intSet41, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet49 = null;
        naturalness.TreeSet<java.lang.Integer> intSet50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest48.FuzzTest_pollFirst(intSet49, intSet50, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet55 = null;
        naturalness.TreeSet<java.lang.Integer> intSet56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest54.FuzzTest_pollFirst(intSet55, intSet56, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet61 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        fuzzTest53.FuzzTest_pollFirst(intSet56, intSet61, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet71 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        naturalness.TreeSet<java.lang.Integer> intSet73 = null;
        fuzzTest65.FuzzTest_pollFirst(intSet71, intSet73, (java.lang.Integer) (-1));
        fuzzTest48.FuzzTest_pollFirst(intSet56, intSet71, (java.lang.Integer) (-1));
        fuzzTest46.FuzzTest_pollFirst(intSet47, intSet71, (java.lang.Integer) 100);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, 0, 1, 10 };
        naturalness.TreeSet<java.lang.Integer> intSet85 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet71, intSet85, (java.lang.Integer) 10);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet2 = null;
        naturalness.TreeSet<java.lang.Integer> intSet3 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest1.FuzzTest_pollFirst(intSet2, intSet3, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1) };
        naturalness.TreeSet<java.lang.Integer> intSet8 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzzTest0.FuzzTest_pollFirst(intSet3, intSet8, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        naturalness.TreeSet<java.lang.Integer> intSet18 = new naturalness.TreeSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        naturalness.TreeSet<java.lang.Integer> intSet20 = null;
        fuzzTest12.FuzzTest_pollFirst(intSet18, intSet20, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        naturalness.TreeSet<java.lang.Integer> intSet24 = null;
        naturalness.TreeSet<java.lang.Integer> intSet25 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest23.FuzzTest_pollFirst(intSet24, intSet25, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_pollFirst(intSet18, intSet25, (java.lang.Integer) 1);
    }
}

