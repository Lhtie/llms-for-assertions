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
        c2s_aug.ArrayList<java.lang.Integer> intList3 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList7 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 0, 0 };
        c2s_aug.ArrayList<java.lang.Integer> intList16 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList23 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList27 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest20.FuzzTest_add(intList23, intList27, (java.lang.Integer) 1, true);
        fuzzTest18.FuzzTest_add(intList19, intList23, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList38 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList42 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_add(intList38, intList42, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList48 = null;
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList52 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList56 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_add(intList52, intList56, (java.lang.Integer) 1, true);
        fuzzTest47.FuzzTest_add(intList48, intList52, (java.lang.Integer) 10, true);
        fuzzTest18.FuzzTest_add(intList38, intList48, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 100, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList71 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList76 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList80 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest73.FuzzTest_add(intList76, intList80, (java.lang.Integer) 1, true);
        fuzzTest18.FuzzTest_add(intList71, intList80, (java.lang.Integer) (-1), false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList16, intList71, (java.lang.Integer) 1, false);
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
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList16 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList20 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList28 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList32 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_add(intList28, intList32, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ArrayList<java.lang.Integer> intList40 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest13.FuzzTest_add(intList32, intList40, (java.lang.Integer) 1, true);
        c2s_aug.ArrayList<java.lang.Integer> intList45 = null;
        fuzzTest12.FuzzTest_add(intList32, intList45, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList52 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList56 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_add(intList52, intList56, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList64 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList68 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_add(intList64, intList68, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.ArrayList<java.lang.Integer> intList76 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest49.FuzzTest_add(intList68, intList76, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList32, intList76, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList6 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList10 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzzTest3.FuzzTest_add(intList6, intList10, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intList2, intList6, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList21 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList25 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_add(intList21, intList25, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 1, 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList35 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest1.FuzzTest_add(intList25, intList35, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList43 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList47 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_add(intList43, intList47, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList55 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList59 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest52.FuzzTest_add(intList55, intList59, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList67 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList71 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest64.FuzzTest_add(intList67, intList71, (java.lang.Integer) 1, true);
        fuzzTest40.FuzzTest_add(intList59, intList71, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList82 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList86 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest79.FuzzTest_add(intList82, intList86, (java.lang.Integer) 1, true);
        c2s_aug.ArrayList<java.lang.Integer> intList91 = null;
        fuzzTest40.FuzzTest_add(intList86, intList91, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList25, intList86, (java.lang.Integer) 10, false);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList4 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList8 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        c2s_aug.ArrayList<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList17 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList21 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_add(intList17, intList21, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intList13, intList21, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10, 10, (-1) };
        c2s_aug.ArrayList<java.lang.Integer> intList33 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList37 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest1.FuzzTest_add(intList33, intList37, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList46 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList50 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest43.FuzzTest_add(intList46, intList50, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList58 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList62 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest55.FuzzTest_add(intList58, intList62, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList70 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList74 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest67.FuzzTest_add(intList70, intList74, (java.lang.Integer) 1, true);
        fuzzTest43.FuzzTest_add(intList62, intList74, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, (-1) };
        c2s_aug.ArrayList<java.lang.Integer> intList85 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest42.FuzzTest_add(intList62, intList85, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList37, intList62, (java.lang.Integer) 10, false);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList3 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList7 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        c2s_aug.ArrayList<java.lang.Integer> intList12 = null;
        c2s_aug.ArrayList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList12, intList13, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList20 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList24 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (java.lang.Integer) 1, true);
        c2s_aug.ArrayList<java.lang.Integer> intList29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList33 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList37 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_add(intList33, intList37, (java.lang.Integer) 1, true);
        fuzzTest17.FuzzTest_add(intList29, intList37, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10, 10, (-1) };
        c2s_aug.ArrayList<java.lang.Integer> intList49 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList53 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest17.FuzzTest_add(intList49, intList53, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList61 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList65 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_add(intList61, intList65, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList53, intList65, (java.lang.Integer) 10, false);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList3 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList7 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        c2s_aug.ArrayList<java.lang.Integer> intList12 = null;
        c2s_aug.ArrayList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList12, intList13, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList20 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList24 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList30 = null;
        c2s_aug.ArrayList<java.lang.Integer> intList31 = null;
        fuzzTest29.FuzzTest_add(intList30, intList31, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        c2s_aug.ArrayList<java.lang.Integer> intList36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList40 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList44 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest37.FuzzTest_add(intList40, intList44, (java.lang.Integer) 1, true);
        fuzzTest35.FuzzTest_add(intList36, intList40, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        c2s_aug.ArrayList<java.lang.Integer> intList55 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        c2s_aug.ArrayList<java.lang.Integer> intList59 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest52.FuzzTest_add(intList55, intList59, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { (-1), 1, 0, 1 };
        c2s_aug.ArrayList<java.lang.Integer> intList69 = new c2s_aug.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest35.FuzzTest_add(intList59, intList69, (java.lang.Integer) 10, true);
        c2s_aug.ArrayList<java.lang.Integer> intList74 = null;
        fuzzTest29.FuzzTest_add(intList69, intList74, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList24, intList69, (java.lang.Integer) (-1), false);
    }
}

