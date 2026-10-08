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
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList16 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest9.FuzzTest_set(intList12, intList16, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList7, intList16, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 1);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList34 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList43 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest36.FuzzTest_set(intList39, intList43, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest27.FuzzTest_set(intList34, intList43, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_set(intList26, intList34, (int) (short) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList60 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList64 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest57.FuzzTest_set(intList60, intList64, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList77 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList82 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList86 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest79.FuzzTest_set(intList82, intList86, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest70.FuzzTest_set(intList77, intList86, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList60, intList77, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList16 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest9.FuzzTest_set(intList12, intList16, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList7, intList16, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList33 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList42 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_set(intList38, intList42, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest26.FuzzTest_set(intList33, intList42, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList55 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList57 = null;
        fuzzTest52.FuzzTest_set(intList55, intList57, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_set(intList33, intList57, (int) (byte) 100, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 100, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList75 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList79 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest72.FuzzTest_set(intList75, intList79, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList70, intList75, (int) (byte) 0, (java.lang.Integer) (-1), (java.lang.Integer) 1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList6 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzzTest3.FuzzTest_set(intList6, intList10, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest16.FuzzTest_set(intList19, intList23, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest3.FuzzTest_set(intList23, intList32, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest1.FuzzTest_set(intList2, intList32, (int) '#', (java.lang.Integer) 100, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList49 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList54 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest51.FuzzTest_set(intList54, intList58, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest42.FuzzTest_set(intList49, intList58, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList32, intList58, 0, (java.lang.Integer) (-1), (java.lang.Integer) 10);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList16 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest9.FuzzTest_set(intList12, intList16, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList7, intList16, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList35 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_set(intList35, intList39, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_set(intList48, intList52, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList61 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest32.FuzzTest_set(intList52, intList61, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest26.FuzzTest_set(intList30, intList61, (int) (byte) 0, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList74 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList78 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest71.FuzzTest_set(intList74, intList78, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList61, intList74, (int) (short) 0, (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, 100, (java.lang.Integer) (-1), (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList14 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest7.FuzzTest_set(intList10, intList14, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest20.FuzzTest_set(intList23, intList27, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList40 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_set(intList36, intList40, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList49 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest20.FuzzTest_set(intList40, intList49, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        c2s_aug_sub.ArrayList<java.lang.Integer> intList55 = null;
        fuzzTest7.FuzzTest_set(intList40, intList55, (int) (short) 1, (java.lang.Integer) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList67 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList76 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest69.FuzzTest_set(intList72, intList76, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest60.FuzzTest_set(intList67, intList76, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList40, intList67, 0, (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) (short) 100, (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = null;
        fuzzTest7.FuzzTest_set(intList10, intList12, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 0, 10, 0, 0, 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 0, 0, 1, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest34.FuzzTest_set(intList37, intList41, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzzTest25.FuzzTest_set(intList32, intList41, (int) 'a', (java.lang.Integer) 1, (java.lang.Integer) 1);
        fuzzTest7.FuzzTest_set(intList23, intList41, (int) (short) -1, (java.lang.Integer) 10, (java.lang.Integer) 100);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 1, (-1), 0 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest7.FuzzTest_set(intList58, intList65, 100, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList74 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList76 = null;
        fuzzTest71.FuzzTest_set(intList74, intList76, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList58, intList74, (int) (byte) 0, (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_set(intList3, intList5, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = null;
        fuzzTest0.FuzzTest_set(intList10, intList11, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest0.FuzzTest_set(intList18, intList20, (int) 'a', (java.lang.Integer) 100, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, 10, 10, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList35 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = null;
        fuzzTest32.FuzzTest_set(intList35, intList37, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList45 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList51 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList56 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList60 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_set(intList56, intList60, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList69 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest66.FuzzTest_set(intList69, intList73, (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList82 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest53.FuzzTest_set(intList73, intList82, (int) '4', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest47.FuzzTest_set(intList51, intList82, (int) (byte) 0, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzzTest32.FuzzTest_set(intList45, intList51, 100, (java.lang.Integer) 100, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList30, intList45, (int) (short) 1, (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }
}

