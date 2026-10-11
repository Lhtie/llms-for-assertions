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
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList3, intList7, (java.lang.Integer) 1, 1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzzTest8.FuzzTest_setElementAt(intList11, intList13, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_setElementAt(intList20, intList22, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_setElementAt(intList29, intList31, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest8.FuzzTest_setElementAt(intList20, intList31, (java.lang.Integer) 1, 0);
        fuzzTest0.FuzzTest_setElementAt(intList6, intList31, (java.lang.Integer) 100, (int) (short) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = null;
        fuzzTest53.FuzzTest_setElementAt(intList56, intList58, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = null;
        fuzzTest62.FuzzTest_setElementAt(intList65, intList67, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = null;
        fuzzTest71.FuzzTest_setElementAt(intList74, intList76, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest53.FuzzTest_setElementAt(intList65, intList76, (java.lang.Integer) 1, 0);
        fuzzTest45.FuzzTest_setElementAt(intList51, intList76, (java.lang.Integer) 100, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList43, intList51, (java.lang.Integer) 100, (int) (short) 100);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_setElementAt(intList3, intList5, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_setElementAt(intList12, intList14, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_setElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest0.FuzzTest_setElementAt(intList12, intList23, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = null;
        fuzzTest30.FuzzTest_setElementAt(intList33, intList35, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = null;
        fuzzTest39.FuzzTest_setElementAt(intList42, intList44, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = null;
        fuzzTest48.FuzzTest_setElementAt(intList51, intList53, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = null;
        fuzzTest57.FuzzTest_setElementAt(intList60, intList62, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        fuzzTest66.FuzzTest_setElementAt(intList69, intList71, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest48.FuzzTest_setElementAt(intList60, intList71, (java.lang.Integer) 1, 0);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest39.FuzzTest_setElementAt(intList71, intList81, (java.lang.Integer) 1, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList33, intList81, (java.lang.Integer) 10, (int) ' ');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = null;
        fuzzTest1.FuzzTest_setElementAt(intList4, intList6, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_setElementAt(intList13, intList15, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzzTest19.FuzzTest_setElementAt(intList22, intList24, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest1.FuzzTest_setElementAt(intList13, intList24, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = null;
        fuzzTest31.FuzzTest_setElementAt(intList34, intList36, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = null;
        fuzzTest40.FuzzTest_setElementAt(intList43, intList45, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = null;
        fuzzTest49.FuzzTest_setElementAt(intList52, intList54, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest31.FuzzTest_setElementAt(intList43, intList54, (java.lang.Integer) 1, 0);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest1.FuzzTest_setElementAt(intList54, intList63, (java.lang.Integer) 100, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = null;
        fuzzTest74.FuzzTest_setElementAt(intList77, intList79, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest68.FuzzTest_setElementAt(intList72, intList77, (java.lang.Integer) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList63, intList72, (java.lang.Integer) 10, 100);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = null;
        fuzzTest7.FuzzTest_setElementAt(intList10, intList12, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest1.FuzzTest_setElementAt(intList5, intList10, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzzTest25.FuzzTest_setElementAt(intList28, intList30, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest19.FuzzTest_setElementAt(intList23, intList28, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = null;
        fuzzTest37.FuzzTest_setElementAt(intList40, intList42, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = null;
        fuzzTest46.FuzzTest_setElementAt(intList49, intList51, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzzTest55.FuzzTest_setElementAt(intList58, intList60, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest37.FuzzTest_setElementAt(intList49, intList60, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = null;
        fuzzTest73.FuzzTest_setElementAt(intList76, intList78, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest67.FuzzTest_setElementAt(intList71, intList76, (java.lang.Integer) 1, 0);
        fuzzTest19.FuzzTest_setElementAt(intList49, intList71, (java.lang.Integer) 10, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList5, intList49, (java.lang.Integer) 100, (int) 'a');
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_setElementAt(intList3, intList5, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_setElementAt(intList12, intList14, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_setElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest0.FuzzTest_setElementAt(intList12, intList23, (java.lang.Integer) 1, 0);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest35.FuzzTest_setElementAt(intList38, intList40, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = null;
        fuzzTest44.FuzzTest_setElementAt(intList47, intList49, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = null;
        fuzzTest53.FuzzTest_setElementAt(intList56, intList58, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest35.FuzzTest_setElementAt(intList47, intList58, (java.lang.Integer) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList33, intList47, (java.lang.Integer) 10, (int) (byte) 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = null;
        fuzzTest6.FuzzTest_setElementAt(intList9, intList11, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest0.FuzzTest_setElementAt(intList4, intList9, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_setElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzzTest0.FuzzTest_setElementAt(intList23, intList27, (java.lang.Integer) 0, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = null;
        fuzzTest31.FuzzTest_setElementAt(intList34, intList36, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = null;
        fuzzTest40.FuzzTest_setElementAt(intList43, intList45, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = null;
        fuzzTest49.FuzzTest_setElementAt(intList52, intList54, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest31.FuzzTest_setElementAt(intList43, intList54, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = null;
        fuzzTest67.FuzzTest_setElementAt(intList70, intList72, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest61.FuzzTest_setElementAt(intList65, intList70, (java.lang.Integer) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList43, intList70, (java.lang.Integer) 0, (int) (byte) 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_setElementAt(intList3, intList5, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_setElementAt(intList12, intList14, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_setElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_setElementAt(intList30, intList32, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest9.FuzzTest_setElementAt(intList21, intList32, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = null;
        fuzzTest39.FuzzTest_setElementAt(intList42, intList44, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = null;
        fuzzTest48.FuzzTest_setElementAt(intList51, intList53, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = null;
        fuzzTest57.FuzzTest_setElementAt(intList60, intList62, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest39.FuzzTest_setElementAt(intList51, intList62, (java.lang.Integer) 1, 0);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest9.FuzzTest_setElementAt(intList62, intList71, (java.lang.Integer) 100, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = null;
        fuzzTest76.FuzzTest_setElementAt(intList79, intList81, (java.lang.Integer) (-1), (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = null;
        fuzzTest9.FuzzTest_setElementAt(intList79, intList85, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 100, (-1), 100, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList94 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList94, intArray93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList79, intList94, (java.lang.Integer) 100, 10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_setElementAt(intList3, intList5, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = null;
        fuzzTest15.FuzzTest_setElementAt(intList18, intList20, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest9.FuzzTest_setElementAt(intList13, intList18, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_setElementAt(intList30, intList32, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = null;
        fuzzTest36.FuzzTest_setElementAt(intList39, intList41, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest45.FuzzTest_setElementAt(intList48, intList50, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest27.FuzzTest_setElementAt(intList39, intList50, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = null;
        fuzzTest63.FuzzTest_setElementAt(intList66, intList68, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest57.FuzzTest_setElementAt(intList61, intList66, (java.lang.Integer) 1, 0);
        fuzzTest9.FuzzTest_setElementAt(intList39, intList61, (java.lang.Integer) 10, 0);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList89 = null;
        fuzzTest84.FuzzTest_setElementAt(intList87, intList89, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest78.FuzzTest_setElementAt(intList82, intList87, (java.lang.Integer) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList61, intList82, (java.lang.Integer) 1, (int) 'a');
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = null;
        fuzzTest7.FuzzTest_setElementAt(intList10, intList12, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest1.FuzzTest_setElementAt(intList5, intList10, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzzTest19.FuzzTest_setElementAt(intList22, intList24, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = null;
        fuzzTest28.FuzzTest_setElementAt(intList31, intList33, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest1.FuzzTest_setElementAt(intList24, intList33, (java.lang.Integer) 100, (int) (byte) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = null;
        fuzzTest49.FuzzTest_setElementAt(intList52, intList54, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = null;
        fuzzTest58.FuzzTest_setElementAt(intList61, intList63, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = null;
        fuzzTest67.FuzzTest_setElementAt(intList70, intList72, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest49.FuzzTest_setElementAt(intList61, intList72, (java.lang.Integer) 1, 0);
        fuzzTest41.FuzzTest_setElementAt(intList47, intList72, (java.lang.Integer) 100, (int) (short) 100);
        fuzzTest1.FuzzTest_setElementAt(intList40, intList47, (java.lang.Integer) 0, 0);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList47, intList87, (java.lang.Integer) 100, 100);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_setElementAt(intList3, intList5, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_setElementAt(intList12, intList14, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_setElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest0.FuzzTest_setElementAt(intList12, intList23, (java.lang.Integer) 1, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = null;
        fuzzTest37.FuzzTest_setElementAt(intList40, intList42, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest31.FuzzTest_setElementAt(intList35, intList40, (java.lang.Integer) 1, 0);
        fuzzTest0.FuzzTest_setElementAt(intList30, intList35, (java.lang.Integer) 1, (int) (byte) 1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = null;
        fuzzTest58.FuzzTest_setElementAt(intList61, intList63, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest52.FuzzTest_setElementAt(intList56, intList61, (java.lang.Integer) 1, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = null;
        fuzzTest0.FuzzTest_setElementAt(intList56, intList70, (java.lang.Integer) 0, 0);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList77, intList81, (java.lang.Integer) 10, (int) (short) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = null;
        fuzzTest6.FuzzTest_setElementAt(intList9, intList11, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest0.FuzzTest_setElementAt(intList4, intList9, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_setElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_setElementAt(intList30, intList32, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = null;
        fuzzTest36.FuzzTest_setElementAt(intList39, intList41, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest18.FuzzTest_setElementAt(intList30, intList41, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = null;
        fuzzTest54.FuzzTest_setElementAt(intList57, intList59, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest48.FuzzTest_setElementAt(intList52, intList57, (java.lang.Integer) 1, 0);
        fuzzTest0.FuzzTest_setElementAt(intList30, intList52, (java.lang.Integer) 10, 0);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = null;
        fuzzTest75.FuzzTest_setElementAt(intList78, intList80, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest69.FuzzTest_setElementAt(intList73, intList78, (java.lang.Integer) 1, 0);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { (-1), (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList73, intList90, (java.lang.Integer) 100, (int) 'a');
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = null;
        fuzzTest8.FuzzTest_setElementAt(intList11, intList13, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest2.FuzzTest_setElementAt(intList6, intList11, (java.lang.Integer) 1, 0);
        fuzzTest0.FuzzTest_setElementAt(intList1, intList11, (java.lang.Integer) 10, (-1));
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = null;
        fuzzTest29.FuzzTest_setElementAt(intList32, intList34, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest23.FuzzTest_setElementAt(intList27, intList32, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = null;
        fuzzTest47.FuzzTest_setElementAt(intList50, intList52, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest41.FuzzTest_setElementAt(intList45, intList50, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = null;
        fuzzTest59.FuzzTest_setElementAt(intList62, intList64, (java.lang.Integer) (-1), (int) (byte) -1);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 1, 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest41.FuzzTest_setElementAt(intList64, intList73, (java.lang.Integer) 1, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList27, intList73, (java.lang.Integer) 10, (int) 'a');
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = null;
        fuzzTest6.FuzzTest_setElementAt(intList9, intList11, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest0.FuzzTest_setElementAt(intList4, intList9, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_setElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_setElementAt(intList30, intList32, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest0.FuzzTest_setElementAt(intList23, intList32, (java.lang.Integer) 100, (int) (byte) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest0.FuzzTest_setElementAt(intList39, intList40, (java.lang.Integer) 0, (int) (byte) 1);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = null;
        fuzzTest54.FuzzTest_setElementAt(intList57, intList59, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest48.FuzzTest_setElementAt(intList52, intList57, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        fuzzTest66.FuzzTest_setElementAt(intList69, intList71, (java.lang.Integer) (-1), (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = null;
        fuzzTest48.FuzzTest_setElementAt(intList71, intList75, (java.lang.Integer) 0, (int) (byte) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = null;
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10, (-1), 100, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest48.FuzzTest_setElementAt(intList79, intList85, (java.lang.Integer) (-1), (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList46, intList85, (java.lang.Integer) 10, 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_setElementAt(intList3, intList5, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = null;
        fuzzTest15.FuzzTest_setElementAt(intList18, intList20, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest9.FuzzTest_setElementAt(intList13, intList18, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = null;
        fuzzTest33.FuzzTest_setElementAt(intList36, intList38, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest27.FuzzTest_setElementAt(intList31, intList36, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest45.FuzzTest_setElementAt(intList48, intList50, (java.lang.Integer) (-1), (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = null;
        fuzzTest27.FuzzTest_setElementAt(intList50, intList54, (java.lang.Integer) 0, (int) (byte) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = null;
        fuzzTest27.FuzzTest_setElementAt(intList58, intList59, (java.lang.Integer) 10, 1);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = null;
        fuzzTest69.FuzzTest_setElementAt(intList72, intList74, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest63.FuzzTest_setElementAt(intList67, intList72, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = null;
        fuzzTest81.FuzzTest_setElementAt(intList84, intList86, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest27.FuzzTest_setElementAt(intList72, intList86, (java.lang.Integer) 100, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList13, intList72, (java.lang.Integer) 100, (int) '4');
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 1, (-1), 1, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_setElementAt(intList12, intList14, (java.lang.Integer) (-1), (int) (byte) -1);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), 0, 100, 1, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = null;
        fuzzTest32.FuzzTest_setElementAt(intList35, intList37, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest26.FuzzTest_setElementAt(intList30, intList35, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = null;
        fuzzTest44.FuzzTest_setElementAt(intList47, intList49, (java.lang.Integer) (-1), (int) (byte) -1);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 1, 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest26.FuzzTest_setElementAt(intList49, intList58, (java.lang.Integer) 1, (int) (byte) 100);
        fuzzTest9.FuzzTest_setElementAt(intList24, intList49, (java.lang.Integer) 1, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList7, intList24, (java.lang.Integer) 0, (int) '4');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = null;
        fuzzTest6.FuzzTest_setElementAt(intList9, intList11, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest0.FuzzTest_setElementAt(intList4, intList9, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_setElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzzTest0.FuzzTest_setElementAt(intList23, intList27, (java.lang.Integer) 0, (int) (byte) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = null;
        fuzzTest0.FuzzTest_setElementAt(intList31, intList32, (java.lang.Integer) 10, 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = null;
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = null;
        fuzzTest44.FuzzTest_setElementAt(intList47, intList49, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest38.FuzzTest_setElementAt(intList42, intList47, (java.lang.Integer) 1, 0);
        fuzzTest36.FuzzTest_setElementAt(intList37, intList47, (java.lang.Integer) 10, (-1));
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = null;
        fuzzTest65.FuzzTest_setElementAt(intList68, intList70, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest59.FuzzTest_setElementAt(intList63, intList68, (java.lang.Integer) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList47, intList63, (java.lang.Integer) 0, (int) ' ');
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = null;
        fuzzTest6.FuzzTest_setElementAt(intList9, intList11, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest0.FuzzTest_setElementAt(intList4, intList9, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_setElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) (byte) -1);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 1, 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest0.FuzzTest_setElementAt(intList23, intList32, (java.lang.Integer) 1, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = null;
        fuzzTest43.FuzzTest_setElementAt(intList46, intList48, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest37.FuzzTest_setElementAt(intList41, intList46, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzzTest55.FuzzTest_setElementAt(intList58, intList60, (java.lang.Integer) (-1), (int) (byte) -1);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 1, 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest37.FuzzTest_setElementAt(intList60, intList69, (java.lang.Integer) 1, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = null;
        fuzzTest80.FuzzTest_setElementAt(intList83, intList85, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest74.FuzzTest_setElementAt(intList78, intList83, (java.lang.Integer) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList69, intList78, (java.lang.Integer) 10, (int) 'a');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = null;
        fuzzTest6.FuzzTest_setElementAt(intList9, intList11, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest0.FuzzTest_setElementAt(intList4, intList9, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_setElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = null;
        fuzzTest0.FuzzTest_setElementAt(intList23, intList27, (java.lang.Integer) 0, (int) (byte) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = null;
        fuzzTest0.FuzzTest_setElementAt(intList31, intList32, (java.lang.Integer) 10, 1);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = null;
        fuzzTest40.FuzzTest_setElementAt(intList43, intList45, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = null;
        fuzzTest49.FuzzTest_setElementAt(intList52, intList54, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = null;
        fuzzTest58.FuzzTest_setElementAt(intList61, intList63, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest40.FuzzTest_setElementAt(intList52, intList63, (java.lang.Integer) 1, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = null;
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = null;
        fuzzTest77.FuzzTest_setElementAt(intList80, intList82, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest71.FuzzTest_setElementAt(intList75, intList80, (java.lang.Integer) 1, 0);
        fuzzTest40.FuzzTest_setElementAt(intList70, intList80, (java.lang.Integer) (-1), (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList38, intList80, (java.lang.Integer) 100, (int) '4');
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList11 = null;
        fuzzTest6.FuzzTest_setElementAt(intList9, intList11, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest0.FuzzTest_setElementAt(intList4, intList9, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_setElementAt(intList21, intList23, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_setElementAt(intList30, intList32, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest0.FuzzTest_setElementAt(intList23, intList32, (java.lang.Integer) 100, (int) (byte) 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = null;
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 10, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest0.FuzzTest_setElementAt(intList39, intList44, (java.lang.Integer) 0, 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = null;
        fuzzTest0.FuzzTest_setElementAt(intList49, intList50, (java.lang.Integer) 1, 100);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10, 10, 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = null;
        fuzzTest0.FuzzTest_setElementAt(intList59, intList61, (java.lang.Integer) 0, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = null;
        fuzzTest65.FuzzTest_setElementAt(intList68, intList70, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList79 = null;
        fuzzTest74.FuzzTest_setElementAt(intList77, intList79, (java.lang.Integer) (-1), (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList68, intList77, (java.lang.Integer) 0, 100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = null;
        fuzzTest1.FuzzTest_setElementAt(intList4, intList6, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_setElementAt(intList13, intList15, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = null;
        fuzzTest19.FuzzTest_setElementAt(intList22, intList24, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = null;
        fuzzTest28.FuzzTest_setElementAt(intList31, intList33, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest10.FuzzTest_setElementAt(intList22, intList33, (java.lang.Integer) 1, 0);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest1.FuzzTest_setElementAt(intList33, intList43, (java.lang.Integer) 1, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = null;
        fuzzTest48.FuzzTest_setElementAt(intList51, intList53, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest0.FuzzTest_setElementAt(intList33, intList51, (java.lang.Integer) 10, (int) (short) -1);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = null;
        fuzzTest66.FuzzTest_setElementAt(intList69, intList71, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest60.FuzzTest_setElementAt(intList64, intList69, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList89 = null;
        fuzzTest84.FuzzTest_setElementAt(intList87, intList89, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest78.FuzzTest_setElementAt(intList82, intList87, (java.lang.Integer) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList69, intList82, (java.lang.Integer) 0, (int) (short) 1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_setElementAt(intList3, intList5, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_setElementAt(intList20, intList22, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_setElementAt(intList29, intList31, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = null;
        fuzzTest35.FuzzTest_setElementAt(intList38, intList40, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = null;
        fuzzTest44.FuzzTest_setElementAt(intList47, intList49, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest26.FuzzTest_setElementAt(intList38, intList49, (java.lang.Integer) 1, 0);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest17.FuzzTest_setElementAt(intList49, intList59, (java.lang.Integer) 1, (int) (byte) 100);
        fuzzTest9.FuzzTest_setElementAt(intList15, intList49, (java.lang.Integer) (-1), 100);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = null;
        fuzzTest0.FuzzTest_setElementAt(intList49, intList67, (java.lang.Integer) 100, (int) (byte) 1);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = null;
        fuzzTest82.FuzzTest_setElementAt(intList85, intList87, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest76.FuzzTest_setElementAt(intList80, intList85, (java.lang.Integer) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList74, intList85, (java.lang.Integer) 0, (int) ' ');
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_setElementAt(intList1, intList2, (java.lang.Integer) (-1), (int) 'a');
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = null;
        fuzzTest12.FuzzTest_setElementAt(intList15, intList17, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest6.FuzzTest_setElementAt(intList10, intList15, (java.lang.Integer) 1, 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = null;
        fuzzTest24.FuzzTest_setElementAt(intList27, intList29, (java.lang.Integer) (-1), (int) (byte) -1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = null;
        fuzzTest6.FuzzTest_setElementAt(intList29, intList33, (java.lang.Integer) 0, (int) (byte) 0);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = null;
        fuzzTest6.FuzzTest_setElementAt(intList37, intList38, (java.lang.Integer) 10, 1);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-1), 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = null;
        fuzzTest49.FuzzTest_setElementAt(intList52, intList54, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest43.FuzzTest_setElementAt(intList47, intList52, (java.lang.Integer) 1, 0);
        fuzzTest6.FuzzTest_setElementAt(intList42, intList47, (java.lang.Integer) 100, (int) (short) 0);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList69 = null;
        fuzzTest64.FuzzTest_setElementAt(intList67, intList69, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = null;
        fuzzTest73.FuzzTest_setElementAt(intList76, intList78, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList85 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = null;
        fuzzTest82.FuzzTest_setElementAt(intList85, intList87, (java.lang.Integer) (-1), (int) (byte) -1);
        fuzzTest64.FuzzTest_setElementAt(intList76, intList87, (java.lang.Integer) 1, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_setElementAt(intList47, intList76, (java.lang.Integer) 100, 10);
    }
}

