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
        c2s_aug.Vector<java.lang.Integer> intList3 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_removeElementAt(intList3, intList7, (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList14 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList18 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest11.FuzzTest_removeElementAt(intList14, intList18, (-1));
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList25 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList29 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest22.FuzzTest_removeElementAt(intList25, intList29, (-1));
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList36 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList40 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_removeElementAt(intList36, intList40, (-1));
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList47 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest22.FuzzTest_removeElementAt(intList40, intList47, (int) '4');
        fuzzTest0.FuzzTest_removeElementAt(intList14, intList47, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList56 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList60 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_removeElementAt(intList56, intList60, (-1));
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList67 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList71 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest64.FuzzTest_removeElementAt(intList67, intList71, (-1));
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList78 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest53.FuzzTest_removeElementAt(intList71, intList78, (int) '4');
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList85 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList89 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        fuzzTest82.FuzzTest_removeElementAt(intList85, intList89, (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList78, intList89, 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList3 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_removeElementAt(intList3, intList7, (-1));
        c2s_aug.Vector<java.lang.Integer> intList11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList15 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList19 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_removeElementAt(intList15, intList19, (-1));
        fuzzTest0.FuzzTest_removeElementAt(intList11, intList19, (int) 'a');
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList28 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList32 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_removeElementAt(intList28, intList32, (-1));
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList39 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList43 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest36.FuzzTest_removeElementAt(intList39, intList43, (-1));
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList50 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest25.FuzzTest_removeElementAt(intList43, intList50, (int) '4');
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList57 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList61 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest54.FuzzTest_removeElementAt(intList57, intList61, (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList50, intList57, 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList3 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_removeElementAt(intList3, intList7, (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList14 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList18 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest11.FuzzTest_removeElementAt(intList14, intList18, (-1));
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList25 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList29 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest22.FuzzTest_removeElementAt(intList25, intList29, (-1));
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList36 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList40 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_removeElementAt(intList36, intList40, (-1));
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList47 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList51 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_removeElementAt(intList47, intList51, (-1));
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList58 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList62 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest55.FuzzTest_removeElementAt(intList58, intList62, (-1));
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList69 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest44.FuzzTest_removeElementAt(intList62, intList69, (int) '4');
        fuzzTest22.FuzzTest_removeElementAt(intList36, intList69, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList18, intList69, 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList5 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList9 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_removeElementAt(intList5, intList9, (-1));
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        c2s_aug.Vector<java.lang.Integer> intList18 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList23 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList27 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest20.FuzzTest_removeElementAt(intList23, intList27, (-1));
        fuzzTest2.FuzzTest_removeElementAt(intList18, intList23, (int) '4');
        fuzzTest0.FuzzTest_removeElementAt(intList1, intList23, (int) (byte) -1);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList37 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList43 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList47 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_removeElementAt(intList43, intList47, (-1));
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 100, (-1), 10 };
        c2s_aug.Vector<java.lang.Integer> intList56 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest39.FuzzTest_removeElementAt(intList47, intList56, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList37, intList56, 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList5 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList9 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_removeElementAt(intList5, intList9, (-1));
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        c2s_aug.Vector<java.lang.Integer> intList18 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList23 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList27 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest20.FuzzTest_removeElementAt(intList23, intList27, (-1));
        fuzzTest2.FuzzTest_removeElementAt(intList18, intList23, (int) '4');
        fuzzTest0.FuzzTest_removeElementAt(intList1, intList23, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList38 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList42 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_removeElementAt(intList38, intList42, (-1));
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList49 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList53 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest46.FuzzTest_removeElementAt(intList49, intList53, (-1));
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList60 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest35.FuzzTest_removeElementAt(intList53, intList60, (int) '4');
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList68 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList72 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_removeElementAt(intList68, intList72, (-1));
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 1, 100, (-1), 10 };
        c2s_aug.Vector<java.lang.Integer> intList81 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest64.FuzzTest_removeElementAt(intList72, intList81, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList60, intList72, (int) (byte) 1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList3 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_removeElementAt(intList3, intList7, (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList15 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList19 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_removeElementAt(intList15, intList19, (-1));
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList28 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList32 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_removeElementAt(intList28, intList32, (-1));
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        c2s_aug.Vector<java.lang.Integer> intList41 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList46 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList50 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest43.FuzzTest_removeElementAt(intList46, intList50, (-1));
        fuzzTest25.FuzzTest_removeElementAt(intList41, intList46, (int) '4');
        fuzzTest23.FuzzTest_removeElementAt(intList24, intList46, (int) (byte) -1);
        fuzzTest11.FuzzTest_removeElementAt(intList15, intList46, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList64 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList68 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_removeElementAt(intList64, intList68, (-1));
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        c2s_aug.Vector<java.lang.Integer> intList77 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList82 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList86 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest79.FuzzTest_removeElementAt(intList82, intList86, (-1));
        fuzzTest61.FuzzTest_removeElementAt(intList77, intList82, (int) '4');
        c2s_aug.Vector<java.lang.Integer> intList92 = null;
        fuzzTest60.FuzzTest_removeElementAt(intList82, intList92, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList15, intList82, 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList5 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList9 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_removeElementAt(intList5, intList9, (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList18 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList22 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest15.FuzzTest_removeElementAt(intList18, intList22, (-1));
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        c2s_aug.Vector<java.lang.Integer> intList31 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList36 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList40 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_removeElementAt(intList36, intList40, (-1));
        fuzzTest15.FuzzTest_removeElementAt(intList31, intList36, (int) '4');
        fuzzTest13.FuzzTest_removeElementAt(intList14, intList36, (int) (byte) -1);
        fuzzTest1.FuzzTest_removeElementAt(intList5, intList36, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList54 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList58 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest51.FuzzTest_removeElementAt(intList54, intList58, (-1));
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        c2s_aug.Vector<java.lang.Integer> intList67 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList72 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList76 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest69.FuzzTest_removeElementAt(intList72, intList76, (-1));
        fuzzTest51.FuzzTest_removeElementAt(intList67, intList72, (int) '4');
        c2s_aug.Vector<java.lang.Integer> intList82 = null;
        fuzzTest50.FuzzTest_removeElementAt(intList72, intList82, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList36, intList72, (int) (byte) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList4 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList8 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_removeElementAt(intList4, intList8, (-1));
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList15 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList19 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_removeElementAt(intList15, intList19, (-1));
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList26 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest1.FuzzTest_removeElementAt(intList19, intList26, (int) '4');
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList33 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList37 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_removeElementAt(intList33, intList37, (-1));
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList44 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList48 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_removeElementAt(intList44, intList48, (-1));
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList55 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest30.FuzzTest_removeElementAt(intList48, intList55, (int) '4');
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList62 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList66 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest59.FuzzTest_removeElementAt(intList62, intList66, (-1));
        fuzzTest1.FuzzTest_removeElementAt(intList48, intList66, 10);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList75 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList79 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest72.FuzzTest_removeElementAt(intList75, intList79, (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList48, intList79, (int) (byte) 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_removeElementAt(intList1, intList7, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList15 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList19 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_removeElementAt(intList15, intList19, (-1));
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        c2s_aug.Vector<java.lang.Integer> intList28 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList33 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList37 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_removeElementAt(intList33, intList37, (-1));
        fuzzTest12.FuzzTest_removeElementAt(intList28, intList33, (int) '4');
        c2s_aug.Vector<java.lang.Integer> intList43 = null;
        fuzzTest11.FuzzTest_removeElementAt(intList33, intList43, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList49 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList53 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest46.FuzzTest_removeElementAt(intList49, intList53, (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList60 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList64 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest57.FuzzTest_removeElementAt(intList60, intList64, (-1));
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        c2s_aug.Vector<java.lang.Integer> intList73 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList78 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList82 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest75.FuzzTest_removeElementAt(intList78, intList82, (-1));
        fuzzTest57.FuzzTest_removeElementAt(intList73, intList78, (int) '4');
        c2s_aug.Vector<java.lang.Integer> intList88 = null;
        fuzzTest46.FuzzTest_removeElementAt(intList73, intList88, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList33, intList73, (int) (byte) 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList4 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList8 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_removeElementAt(intList4, intList8, (-1));
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        c2s_aug.Vector<java.lang.Integer> intList17 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList22 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList26 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest19.FuzzTest_removeElementAt(intList22, intList26, (-1));
        fuzzTest1.FuzzTest_removeElementAt(intList17, intList22, (int) '4');
        c2s_aug.Vector<java.lang.Integer> intList32 = null;
        fuzzTest0.FuzzTest_removeElementAt(intList22, intList32, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList38 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList42 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_removeElementAt(intList38, intList42, (-1));
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        c2s_aug.Vector<java.lang.Integer> intList51 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList56 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList60 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_removeElementAt(intList56, intList60, (-1));
        fuzzTest35.FuzzTest_removeElementAt(intList51, intList56, (int) '4');
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList70 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList74 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest67.FuzzTest_removeElementAt(intList70, intList74, (-1));
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 1, 100, (-1), 10 };
        c2s_aug.Vector<java.lang.Integer> intList83 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest66.FuzzTest_removeElementAt(intList74, intList83, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList56, intList83, (int) (short) 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList3 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_removeElementAt(intList3, intList7, (-1));
        c2s_aug.Vector<java.lang.Integer> intList11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList15 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList19 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_removeElementAt(intList15, intList19, (-1));
        fuzzTest0.FuzzTest_removeElementAt(intList11, intList19, (int) 'a');
        c2s_aug.Vector<java.lang.Integer> intList25 = null;
        c2s_aug.Vector<java.lang.Integer> intList26 = null;
        fuzzTest0.FuzzTest_removeElementAt(intList25, intList26, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList32 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList36 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_removeElementAt(intList32, intList36, (-1));
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList44 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList48 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_removeElementAt(intList44, intList48, (-1));
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 100, (-1), 10 };
        c2s_aug.Vector<java.lang.Integer> intList57 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest40.FuzzTest_removeElementAt(intList48, intList57, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList36, intList48, 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_removeElementAt(intList1, intList7, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList15 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList19 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_removeElementAt(intList15, intList19, (-1));
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList28 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList32 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_removeElementAt(intList28, intList32, (-1));
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        c2s_aug.Vector<java.lang.Integer> intList41 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList46 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList50 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest43.FuzzTest_removeElementAt(intList46, intList50, (-1));
        fuzzTest25.FuzzTest_removeElementAt(intList41, intList46, (int) '4');
        fuzzTest23.FuzzTest_removeElementAt(intList24, intList46, (int) (byte) -1);
        fuzzTest11.FuzzTest_removeElementAt(intList15, intList46, (int) (byte) 1);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-1), (-1), 100 };
        c2s_aug.Vector<java.lang.Integer> intList64 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList46, intList64, (int) (byte) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList5 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList9 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_removeElementAt(intList5, intList9, (-1));
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        c2s_aug.Vector<java.lang.Integer> intList18 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList23 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList27 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest20.FuzzTest_removeElementAt(intList23, intList27, (-1));
        fuzzTest2.FuzzTest_removeElementAt(intList18, intList23, (int) '4');
        fuzzTest0.FuzzTest_removeElementAt(intList1, intList23, (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList36 = null;
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, 0, 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList42 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_removeElementAt(intList36, intList42, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList47 = null;
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 0, 0, 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList53 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest46.FuzzTest_removeElementAt(intList47, intList53, (int) (short) 100);
        c2s_aug.Vector<java.lang.Integer> intList57 = null;
        fuzzTest35.FuzzTest_removeElementAt(intList53, intList57, 1);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList63 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList67 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest60.FuzzTest_removeElementAt(intList63, intList67, (-1));
        fuzzTest0.FuzzTest_removeElementAt(intList57, intList63, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList76 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList80 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest73.FuzzTest_removeElementAt(intList76, intList80, (-1));
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList87 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList91 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        fuzzTest84.FuzzTest_removeElementAt(intList87, intList91, (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList80, intList87, 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList5 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList9 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_removeElementAt(intList5, intList9, (-1));
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList18 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList22 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzzTest15.FuzzTest_removeElementAt(intList18, intList22, (-1));
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        c2s_aug.Vector<java.lang.Integer> intList31 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList36 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList40 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_removeElementAt(intList36, intList40, (-1));
        fuzzTest15.FuzzTest_removeElementAt(intList31, intList36, (int) '4');
        fuzzTest13.FuzzTest_removeElementAt(intList14, intList36, (int) (byte) -1);
        fuzzTest1.FuzzTest_removeElementAt(intList5, intList36, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 0 };
        c2s_aug.Vector<java.lang.Integer> intList53 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        c2s_aug.Vector<java.lang.Integer> intList55 = null;
        fuzzTest50.FuzzTest_removeElementAt(intList53, intList55, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList5, intList53, (int) (byte) 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList3 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_removeElementAt(intList3, intList7, (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList14 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList18 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest11.FuzzTest_removeElementAt(intList14, intList18, (-1));
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList25 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest0.FuzzTest_removeElementAt(intList18, intList25, (int) '4');
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList32 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList36 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_removeElementAt(intList32, intList36, (-1));
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList44 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList48 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_removeElementAt(intList44, intList48, (-1));
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 100, (-1), 10 };
        c2s_aug.Vector<java.lang.Integer> intList57 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest40.FuzzTest_removeElementAt(intList48, intList57, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList32, intList48, 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        c2s_aug.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_removeElementAt(intList1, intList2, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList9 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList13 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest6.FuzzTest_removeElementAt(intList9, intList13, (-1));
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        c2s_aug.Vector<java.lang.Integer> intList22 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList27 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList31 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_removeElementAt(intList27, intList31, (-1));
        fuzzTest6.FuzzTest_removeElementAt(intList22, intList27, (int) '4');
        c2s_aug.Vector<java.lang.Integer> intList37 = null;
        fuzzTest5.FuzzTest_removeElementAt(intList27, intList37, (int) (byte) 0);
        c2s_aug.Vector<java.lang.Integer> intList40 = null;
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList44 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList48 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_removeElementAt(intList44, intList48, (-1));
        fuzzTest5.FuzzTest_removeElementAt(intList40, intList44, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList57 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList61 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest54.FuzzTest_removeElementAt(intList57, intList61, (-1));
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList68 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList72 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_removeElementAt(intList68, intList72, (-1));
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList79 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest54.FuzzTest_removeElementAt(intList72, intList79, (int) '4');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList44, intList72, 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_removeElementAt(intList1, intList7, (int) (short) 100);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 100 };
        c2s_aug.Vector<java.lang.Integer> intList14 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList17 = null;
        c2s_aug.Vector<java.lang.Integer> intList18 = null;
        fuzzTest16.FuzzTest_removeElementAt(intList17, intList18, (int) (short) -1);
        c2s_aug.Vector<java.lang.Integer> intList21 = null;
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 0 };
        c2s_aug.Vector<java.lang.Integer> intList24 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest16.FuzzTest_removeElementAt(intList21, intList24, 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList29 = null;
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 0, 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList35 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest28.FuzzTest_removeElementAt(intList29, intList35, (int) (short) 100);
        c2s_aug.Vector<java.lang.Integer> intList39 = null;
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList44 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList48 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_removeElementAt(intList44, intList48, (-1));
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, 100, (-1), 10 };
        c2s_aug.Vector<java.lang.Integer> intList57 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest40.FuzzTest_removeElementAt(intList48, intList57, (int) ' ');
        fuzzTest28.FuzzTest_removeElementAt(intList39, intList57, (int) ' ');
        c2s_aug.Vector<java.lang.Integer> intList63 = null;
        fuzzTest16.FuzzTest_removeElementAt(intList57, intList63, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList14, intList57, 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        c2s_aug.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_removeElementAt(intList1, intList2, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList8 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList12 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest5.FuzzTest_removeElementAt(intList8, intList12, (-1));
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList19 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList23 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest16.FuzzTest_removeElementAt(intList19, intList23, (-1));
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList30 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest5.FuzzTest_removeElementAt(intList23, intList30, (int) '4');
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList37 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList41 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest34.FuzzTest_removeElementAt(intList37, intList41, (-1));
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList48 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList52 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_removeElementAt(intList48, intList52, (-1));
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList59 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest34.FuzzTest_removeElementAt(intList52, intList59, (int) '4');
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList66 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList70 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest63.FuzzTest_removeElementAt(intList66, intList70, (-1));
        fuzzTest5.FuzzTest_removeElementAt(intList52, intList70, 10);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, 1 };
        c2s_aug.Vector<java.lang.Integer> intList79 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList52, intList79, 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 0, (-1) };
        c2s_aug.Vector<java.lang.Integer> intList7 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_removeElementAt(intList1, intList7, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList12 = null;
        c2s_aug.Vector<java.lang.Integer> intList13 = null;
        fuzzTest11.FuzzTest_removeElementAt(intList12, intList13, (int) (short) -1);
        c2s_aug.Vector<java.lang.Integer> intList16 = null;
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0 };
        c2s_aug.Vector<java.lang.Integer> intList19 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest11.FuzzTest_removeElementAt(intList16, intList19, 0);
        c2s_aug.Vector<java.lang.Integer> intList23 = null;
        fuzzTest0.FuzzTest_removeElementAt(intList16, intList23, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug.Vector<java.lang.Integer> intList27 = null;
        c2s_aug.Vector<java.lang.Integer> intList28 = null;
        fuzzTest26.FuzzTest_removeElementAt(intList27, intList28, (int) (short) -1);
        c2s_aug.Vector<java.lang.Integer> intList31 = null;
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0 };
        c2s_aug.Vector<java.lang.Integer> intList34 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest26.FuzzTest_removeElementAt(intList31, intList34, 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList41 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList45 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest38.FuzzTest_removeElementAt(intList41, intList45, (-1));
        c2s_aug.Vector<java.lang.Integer> intList49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList53 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList57 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest50.FuzzTest_removeElementAt(intList53, intList57, (-1));
        fuzzTest38.FuzzTest_removeElementAt(intList49, intList57, (int) 'a');
        c2s_aug.Vector<java.lang.Integer> intList63 = null;
        c2s_aug.Vector<java.lang.Integer> intList64 = null;
        fuzzTest38.FuzzTest_removeElementAt(intList63, intList64, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList71 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList75 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest68.FuzzTest_removeElementAt(intList71, intList75, (-1));
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 1, 100, (-1), 10 };
        c2s_aug.Vector<java.lang.Integer> intList84 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest67.FuzzTest_removeElementAt(intList75, intList84, (int) ' ');
        c2s_aug.Vector<java.lang.Integer> intList88 = null;
        fuzzTest38.FuzzTest_removeElementAt(intList84, intList88, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList34, intList84, (int) (short) 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList5 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList9 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_removeElementAt(intList5, intList9, (-1));
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 100, (-1), 10 };
        c2s_aug.Vector<java.lang.Integer> intList18 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest1.FuzzTest_removeElementAt(intList9, intList18, (int) ' ');
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList25 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList29 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest22.FuzzTest_removeElementAt(intList25, intList29, (-1));
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10, 0, 1, (-1), 100 };
        c2s_aug.Vector<java.lang.Integer> intList39 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        c2s_aug.Vector<java.lang.Integer> intList45 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        c2s_aug.Vector<java.lang.Integer> intList49 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest42.FuzzTest_removeElementAt(intList45, intList49, (-1));
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 100, (-1), 10 };
        c2s_aug.Vector<java.lang.Integer> intList58 = new c2s_aug.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest41.FuzzTest_removeElementAt(intList49, intList58, (int) ' ');
        fuzzTest22.FuzzTest_removeElementAt(intList39, intList49, (int) '#');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_removeElementAt(intList9, intList49, (int) (byte) 0);
    }
}

