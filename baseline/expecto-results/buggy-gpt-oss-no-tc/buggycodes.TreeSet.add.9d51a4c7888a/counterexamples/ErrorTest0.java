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
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet7 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet3, intSet7, (java.lang.Integer) 1, true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet11 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest8.FuzzTest_add(intSet11, intSet13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet20 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest17.FuzzTest_add(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest26.FuzzTest_add(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet38 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest35.FuzzTest_add(intSet38, intSet40, (java.lang.Integer) (-1), false);
        fuzzTest17.FuzzTest_add(intSet29, intSet40, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest8.FuzzTest_add(intSet40, intSet50, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intSet6, intSet40, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet61 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet63 = null;
        fuzzTest58.FuzzTest_add(intSet61, intSet63, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet70 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest67.FuzzTest_add(intSet70, intSet72, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet79 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet81 = null;
        fuzzTest76.FuzzTest_add(intSet79, intSet81, (java.lang.Integer) (-1), false);
        fuzzTest58.FuzzTest_add(intSet70, intSet81, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 100, 1, 1, (-1), 100 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet94 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet94, intArray93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet70, intSet94, (java.lang.Integer) 0, true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet11 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest8.FuzzTest_add(intSet11, intSet13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet20 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest17.FuzzTest_add(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest26.FuzzTest_add(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzzTest8.FuzzTest_add(intSet20, intSet31, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_add(intSet6, intSet31, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet44 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet46 = null;
        fuzzTest41.FuzzTest_add(intSet44, intSet46, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet53 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest50.FuzzTest_add(intSet53, intSet55, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet62 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest59.FuzzTest_add(intSet62, intSet64, (java.lang.Integer) (-1), false);
        fuzzTest41.FuzzTest_add(intSet53, intSet64, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet74 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet76 = null;
        fuzzTest71.FuzzTest_add(intSet74, intSet76, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet53, intSet74, (java.lang.Integer) 100, true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 1, 100, (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet14 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet19 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet21 = null;
        fuzzTest16.FuzzTest_add(intSet19, intSet21, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet28 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet30 = null;
        fuzzTest25.FuzzTest_add(intSet28, intSet30, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet37 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet39 = null;
        fuzzTest34.FuzzTest_add(intSet37, intSet39, (java.lang.Integer) (-1), false);
        fuzzTest16.FuzzTest_add(intSet28, intSet39, (java.lang.Integer) 1, false);
        fuzzTest8.FuzzTest_add(intSet14, intSet39, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet6, intSet14, (java.lang.Integer) 0, true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzzTest0.FuzzTest_add(intSet12, intSet23, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet33 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet38 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest35.FuzzTest_add(intSet38, intSet40, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet47 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet49 = null;
        fuzzTest44.FuzzTest_add(intSet47, intSet49, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet59 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet64 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet66 = null;
        fuzzTest61.FuzzTest_add(intSet64, intSet66, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet73 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet75 = null;
        fuzzTest70.FuzzTest_add(intSet73, intSet75, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet82 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet84 = null;
        fuzzTest79.FuzzTest_add(intSet82, intSet84, (java.lang.Integer) (-1), false);
        fuzzTest61.FuzzTest_add(intSet73, intSet84, (java.lang.Integer) 1, false);
        fuzzTest53.FuzzTest_add(intSet59, intSet84, (java.lang.Integer) 100, false);
        fuzzTest35.FuzzTest_add(intSet49, intSet59, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet33, intSet59, (java.lang.Integer) 10, true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet7 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet30 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest27.FuzzTest_add(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzzTest9.FuzzTest_add(intSet21, intSet32, (java.lang.Integer) 1, false);
        fuzzTest1.FuzzTest_add(intSet7, intSet32, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet44 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet52 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet57 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest54.FuzzTest_add(intSet57, intSet59, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet66 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet68 = null;
        fuzzTest63.FuzzTest_add(intSet66, intSet68, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet75 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet77 = null;
        fuzzTest72.FuzzTest_add(intSet75, intSet77, (java.lang.Integer) (-1), false);
        fuzzTest54.FuzzTest_add(intSet66, intSet77, (java.lang.Integer) 1, false);
        fuzzTest46.FuzzTest_add(intSet52, intSet77, (java.lang.Integer) 100, false);
        fuzzTest1.FuzzTest_add(intSet44, intSet52, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 1, 100 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet93 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet93, intArray92);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet52, intSet93, (java.lang.Integer) 0, true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), 10, (-1), (-1), 1 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet7 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 10, 0, (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet14 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet7, intSet14, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet11 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest8.FuzzTest_add(intSet11, intSet13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet20 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest17.FuzzTest_add(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest26.FuzzTest_add(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet38 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest35.FuzzTest_add(intSet38, intSet40, (java.lang.Integer) (-1), false);
        fuzzTest17.FuzzTest_add(intSet29, intSet40, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest8.FuzzTest_add(intSet40, intSet50, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intSet6, intSet40, (java.lang.Integer) (-1), true);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet58 = null;
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet59 = null;
        fuzzTest0.FuzzTest_add(intSet58, intSet59, (java.lang.Integer) 0, false);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, (-1), 10, (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet68 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 0, 10, 1 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet75 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet68, intSet75, (java.lang.Integer) (-1), true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet11 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest8.FuzzTest_add(intSet11, intSet13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet20 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest17.FuzzTest_add(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest26.FuzzTest_add(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzzTest8.FuzzTest_add(intSet20, intSet31, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_add(intSet6, intSet31, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet44 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet46 = null;
        fuzzTest41.FuzzTest_add(intSet44, intSet46, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet53 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet55 = null;
        fuzzTest50.FuzzTest_add(intSet53, intSet55, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet62 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet64 = null;
        fuzzTest59.FuzzTest_add(intSet62, intSet64, (java.lang.Integer) (-1), false);
        fuzzTest41.FuzzTest_add(intSet53, intSet64, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1, (-1), 10, 1, 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet77 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet82 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet84 = null;
        fuzzTest79.FuzzTest_add(intSet82, intSet84, (java.lang.Integer) (-1), false);
        fuzzTest41.FuzzTest_add(intSet77, intSet82, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet94 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet94, intArray93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet77, intSet94, (java.lang.Integer) 0, true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet11 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest8.FuzzTest_add(intSet11, intSet13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet20 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest17.FuzzTest_add(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest26.FuzzTest_add(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet38 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest35.FuzzTest_add(intSet38, intSet40, (java.lang.Integer) (-1), false);
        fuzzTest17.FuzzTest_add(intSet29, intSet40, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest8.FuzzTest_add(intSet40, intSet50, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intSet6, intSet40, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet61 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet63 = null;
        fuzzTest58.FuzzTest_add(intSet61, intSet63, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet70 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet72 = null;
        fuzzTest67.FuzzTest_add(intSet70, intSet72, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet61, intSet70, (java.lang.Integer) 100, true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet8 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet13 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet15 = null;
        fuzzTest10.FuzzTest_add(intSet13, intSet15, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet22 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet24 = null;
        fuzzTest19.FuzzTest_add(intSet22, intSet24, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet31 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet33 = null;
        fuzzTest28.FuzzTest_add(intSet31, intSet33, (java.lang.Integer) (-1), false);
        fuzzTest10.FuzzTest_add(intSet22, intSet33, (java.lang.Integer) 1, false);
        fuzzTest2.FuzzTest_add(intSet8, intSet33, (java.lang.Integer) 100, false);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet46 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet48 = null;
        fuzzTest43.FuzzTest_add(intSet46, intSet48, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet55 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet57 = null;
        fuzzTest52.FuzzTest_add(intSet55, intSet57, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet64 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet66 = null;
        fuzzTest61.FuzzTest_add(intSet64, intSet66, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet73 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet75 = null;
        fuzzTest70.FuzzTest_add(intSet73, intSet75, (java.lang.Integer) (-1), false);
        fuzzTest52.FuzzTest_add(intSet64, intSet75, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet85 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        fuzzTest43.FuzzTest_add(intSet75, intSet85, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intSet8, intSet75, (java.lang.Integer) (-1), true);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 100 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet95 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet95, intArray94);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet8, intSet95, (java.lang.Integer) 1, true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 10, (-1), (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet11 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest8.FuzzTest_add(intSet11, intSet13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet20 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest17.FuzzTest_add(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest26.FuzzTest_add(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet38 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest35.FuzzTest_add(intSet38, intSet40, (java.lang.Integer) (-1), false);
        fuzzTest17.FuzzTest_add(intSet29, intSet40, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest8.FuzzTest_add(intSet40, intSet50, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet58 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet60 = null;
        fuzzTest55.FuzzTest_add(intSet58, intSet60, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet67 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet69 = null;
        fuzzTest64.FuzzTest_add(intSet67, intSet69, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet76 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet78 = null;
        fuzzTest73.FuzzTest_add(intSet76, intSet78, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet85 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet87 = null;
        fuzzTest82.FuzzTest_add(intSet85, intSet87, (java.lang.Integer) (-1), false);
        fuzzTest64.FuzzTest_add(intSet76, intSet87, (java.lang.Integer) 1, false);
        fuzzTest8.FuzzTest_add(intSet58, intSet76, (java.lang.Integer) 10, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet6, intSet76, (java.lang.Integer) 0, true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet6 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet11 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet11, intArray10);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet13 = null;
        fuzzTest8.FuzzTest_add(intSet11, intSet13, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet20 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet22 = null;
        fuzzTest17.FuzzTest_add(intSet20, intSet22, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet29 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet31 = null;
        fuzzTest26.FuzzTest_add(intSet29, intSet31, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet38 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet40 = null;
        fuzzTest35.FuzzTest_add(intSet38, intSet40, (java.lang.Integer) (-1), false);
        fuzzTest17.FuzzTest_add(intSet29, intSet40, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet50 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        fuzzTest8.FuzzTest_add(intSet40, intSet50, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intSet6, intSet40, (java.lang.Integer) (-1), true);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet58 = null;
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10, 100, 1 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet63 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        fuzzTest0.FuzzTest_add(intSet58, intSet63, (java.lang.Integer) (-1), true);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet68 = null;
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet69 = null;
        fuzzTest0.FuzzTest_add(intSet68, intSet69, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet75 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet80 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet82 = null;
        fuzzTest77.FuzzTest_add(intSet80, intSet82, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet75, intSet80, (java.lang.Integer) 0, true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, (-1), 10, 1, (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet7 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet10 = null;
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet14 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet16 = null;
        fuzzTest11.FuzzTest_add(intSet14, intSet16, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet23 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet23, intArray22);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet25 = null;
        fuzzTest20.FuzzTest_add(intSet23, intSet25, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet32 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet34 = null;
        fuzzTest29.FuzzTest_add(intSet32, intSet34, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet41 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet43 = null;
        fuzzTest38.FuzzTest_add(intSet41, intSet43, (java.lang.Integer) (-1), false);
        fuzzTest20.FuzzTest_add(intSet32, intSet43, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet53 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        fuzzTest11.FuzzTest_add(intSet43, intSet53, (java.lang.Integer) 1, true);
        fuzzTest9.FuzzTest_add(intSet10, intSet53, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, 100, 0, (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet66 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet68 = null;
        fuzzTest9.FuzzTest_add(intSet66, intSet68, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet7, intSet66, (java.lang.Integer) 1, true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet3 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet3, intArray2);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet5 = null;
        fuzzTest0.FuzzTest_add(intSet3, intSet5, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet12 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet14 = null;
        fuzzTest9.FuzzTest_add(intSet12, intSet14, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet21 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet23 = null;
        fuzzTest18.FuzzTest_add(intSet21, intSet23, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet30 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet32 = null;
        fuzzTest27.FuzzTest_add(intSet30, intSet32, (java.lang.Integer) (-1), false);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet39 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet41 = null;
        fuzzTest36.FuzzTest_add(intSet39, intSet41, (java.lang.Integer) (-1), false);
        fuzzTest18.FuzzTest_add(intSet30, intSet41, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, (-1), 10, 1, 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet54 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet59 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet61 = null;
        fuzzTest56.FuzzTest_add(intSet59, intSet61, (java.lang.Integer) (-1), false);
        fuzzTest18.FuzzTest_add(intSet54, intSet59, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet70 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { (-1), 1 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet75 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        fuzzTest18.FuzzTest_add(intSet70, intSet75, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10, (-1), 100, 100, (-1) };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet86 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        fuzzTest9.FuzzTest_add(intSet75, intSet86, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 1 };
        buggycodes.mut_042.TreeSet<java.lang.Integer> intSet93 = new buggycodes.mut_042.TreeSet<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet93, intArray92);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intSet86, intSet93, (java.lang.Integer) 0, true);
    }
}

