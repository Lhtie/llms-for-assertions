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
        buggycodes.mut_014.Vector<java.lang.Integer> intList3 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList7 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList15 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList19 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_remove(intList15, intList19, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList28 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList32 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_remove(intList28, intList32, (-1), (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_remove(intList24, intList32, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList43 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList47 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_remove(intList43, intList47, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList55 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList59 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest52.FuzzTest_remove(intList55, intList59, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_014.Vector<java.lang.Integer> intList67 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest40.FuzzTest_remove(intList59, intList67, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList32, intList59, 0, (java.lang.Integer) 100);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList3 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList7 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList15 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList19 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_remove(intList15, intList19, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList27 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList31 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_remove(intList27, intList31, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList36 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList40 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList44 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest37.FuzzTest_remove(intList40, intList44, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList52 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList56 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_remove(intList52, intList56, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_014.Vector<java.lang.Integer> intList64 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest37.FuzzTest_remove(intList56, intList64, (int) '4', (java.lang.Integer) 10);
        fuzzTest24.FuzzTest_remove(intList36, intList56, (int) (short) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList19, intList56, (int) (byte) 10, (java.lang.Integer) 10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList3 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList7 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList16 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList20 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList28 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList32 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_remove(intList28, intList32, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_014.Vector<java.lang.Integer> intList40 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest13.FuzzTest_remove(intList32, intList40, (int) '4', (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_remove(intList12, intList32, (int) (short) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList51 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList55 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest48.FuzzTest_remove(intList51, intList55, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList63 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList67 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest60.FuzzTest_remove(intList63, intList67, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList55, intList63, (int) '4', (java.lang.Integer) 100);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList3 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList7 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList15 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList19 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_remove(intList15, intList19, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList27 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList31 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_remove(intList27, intList31, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_014.Vector<java.lang.Integer> intList39 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest12.FuzzTest_remove(intList31, intList39, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList47 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList51 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_remove(intList47, intList51, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList39, intList51, (int) '#', (java.lang.Integer) 100);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10, 1 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList62 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList67 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList71 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest64.FuzzTest_remove(intList67, intList71, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList79 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList83 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest76.FuzzTest_remove(intList79, intList83, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_014.Vector<java.lang.Integer> intList91 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        fuzzTest64.FuzzTest_remove(intList83, intList91, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList62, intList91, 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList3 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList7 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList15 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList19 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_remove(intList15, intList19, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_014.Vector<java.lang.Integer> intList27 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_remove(intList19, intList27, (int) '4', (java.lang.Integer) 10);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList34 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10, (-1), 1 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList41 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList46 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList50 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest43.FuzzTest_remove(intList46, intList50, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList55 = null;
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList59 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList63 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_remove(intList59, intList63, (-1), (java.lang.Integer) 1);
        fuzzTest43.FuzzTest_remove(intList55, intList63, (int) 'a', (java.lang.Integer) 0);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 0, 0 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList74 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        buggycodes.mut_014.Vector<java.lang.Integer> intList76 = null;
        fuzzTest43.FuzzTest_remove(intList74, intList76, (int) 'a', (java.lang.Integer) (-1));
        fuzzTest36.FuzzTest_remove(intList41, intList74, (int) (short) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList34, intList41, (int) (byte) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList4 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList8 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_remove(intList4, intList8, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList17 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList21 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_remove(intList17, intList21, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList29 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList33 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_remove(intList29, intList33, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_014.Vector<java.lang.Integer> intList41 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest14.FuzzTest_remove(intList33, intList41, (int) '4', (java.lang.Integer) 10);
        fuzzTest1.FuzzTest_remove(intList13, intList33, (int) (short) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10, 10, 1, (-1), 0 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList55 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList60 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest1.FuzzTest_remove(intList55, intList60, 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList68 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList72 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_remove(intList68, intList72, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList77 = null;
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList81 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList85 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest78.FuzzTest_remove(intList81, intList85, (-1), (java.lang.Integer) 1);
        fuzzTest65.FuzzTest_remove(intList77, intList85, (int) 'a', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList60, intList85, (int) (byte) 100, (java.lang.Integer) 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList4 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList8 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_remove(intList4, intList8, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList17 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList21 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_remove(intList17, intList21, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10, 0, 0 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList30 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList35 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList39 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_remove(intList35, intList39, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList47 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList51 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_remove(intList47, intList51, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_014.Vector<java.lang.Integer> intList59 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest32.FuzzTest_remove(intList51, intList59, (int) '4', (java.lang.Integer) 10);
        fuzzTest14.FuzzTest_remove(intList30, intList59, (int) (byte) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10, 10, (-1) };
        buggycodes.mut_014.Vector<java.lang.Integer> intList71 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest13.FuzzTest_remove(intList59, intList71, 100, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList8, intList59, (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10, (-1), 1 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList7 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList12 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList16 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest9.FuzzTest_remove(intList12, intList16, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList21 = null;
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList25 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList29 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest22.FuzzTest_remove(intList25, intList29, (-1), (java.lang.Integer) 1);
        fuzzTest9.FuzzTest_remove(intList21, intList29, (int) 'a', (java.lang.Integer) 0);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 0, 0 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList40 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        buggycodes.mut_014.Vector<java.lang.Integer> intList42 = null;
        fuzzTest9.FuzzTest_remove(intList40, intList42, (int) 'a', (java.lang.Integer) (-1));
        fuzzTest2.FuzzTest_remove(intList7, intList40, (int) (short) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1), 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList52 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList57 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList61 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest54.FuzzTest_remove(intList57, intList61, (-1), (java.lang.Integer) 1);
        fuzzTest2.FuzzTest_remove(intList52, intList61, 100, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList72 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList76 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest69.FuzzTest_remove(intList72, intList76, (-1), (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_remove(intList61, intList76, (int) (short) 0, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList87 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList91 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        fuzzTest84.FuzzTest_remove(intList87, intList91, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList61, intList91, (-1), (java.lang.Integer) 10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList3 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList7 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList16 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList20 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList29 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList33 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_remove(intList29, intList33, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList42 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList46 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest39.FuzzTest_remove(intList42, intList46, (-1), (java.lang.Integer) 1);
        fuzzTest26.FuzzTest_remove(intList38, intList46, (int) 'a', (java.lang.Integer) 0);
        fuzzTest13.FuzzTest_remove(intList25, intList46, 100, (java.lang.Integer) 10);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10, 0, 1, 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList62 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, 10, 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList68 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest13.FuzzTest_remove(intList62, intList68, (int) (byte) 1, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_remove(intList12, intList62, (int) (short) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList79 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList83 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest76.FuzzTest_remove(intList79, intList83, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { (-1), 0 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList91 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList83, intList91, (int) '4', (java.lang.Integer) (-1));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList3 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList7 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList16 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList20 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList12, intList20, (int) 'a', (java.lang.Integer) 0);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList30 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10, (-1), 1 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList37 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList42 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList46 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest39.FuzzTest_remove(intList42, intList46, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList51 = null;
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList55 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList59 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest52.FuzzTest_remove(intList55, intList59, (-1), (java.lang.Integer) 1);
        fuzzTest39.FuzzTest_remove(intList51, intList59, (int) 'a', (java.lang.Integer) 0);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, 0 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList70 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        buggycodes.mut_014.Vector<java.lang.Integer> intList72 = null;
        fuzzTest39.FuzzTest_remove(intList70, intList72, (int) 'a', (java.lang.Integer) (-1));
        fuzzTest32.FuzzTest_remove(intList37, intList70, (int) (short) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList30, intList37, (int) (short) 1, (java.lang.Integer) 10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList3 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList7 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList16 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList20 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList12, intList20, (int) 'a', (java.lang.Integer) 0);
        buggycodes.mut_014.Vector<java.lang.Integer> intList28 = null;
        buggycodes.mut_014.Vector<java.lang.Integer> intList29 = null;
        fuzzTest0.FuzzTest_remove(intList28, intList29, (int) (short) -1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList36 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList40 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_remove(intList36, intList40, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList45 = null;
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList49 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList53 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest46.FuzzTest_remove(intList49, intList53, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList62 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList66 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        fuzzTest59.FuzzTest_remove(intList62, intList66, (-1), (java.lang.Integer) 1);
        fuzzTest46.FuzzTest_remove(intList58, intList66, (int) 'a', (java.lang.Integer) 0);
        fuzzTest33.FuzzTest_remove(intList45, intList66, 100, (java.lang.Integer) 10);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10, 0, 1, 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList82 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100, 10, 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList88 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest33.FuzzTest_remove(intList82, intList88, (int) (byte) 1, (java.lang.Integer) 0);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList95 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList95, intArray94);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList88, intList95, (int) '#', (java.lang.Integer) 10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList4 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList8 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_remove(intList4, intList8, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList16 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList20 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList28 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList32 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_remove(intList28, intList32, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList40 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList44 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest37.FuzzTest_remove(intList40, intList44, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList53 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList57 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest50.FuzzTest_remove(intList53, intList57, (-1), (java.lang.Integer) 1);
        fuzzTest37.FuzzTest_remove(intList49, intList57, (int) 'a', (java.lang.Integer) 0);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, 0 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList68 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        buggycodes.mut_014.Vector<java.lang.Integer> intList70 = null;
        fuzzTest37.FuzzTest_remove(intList68, intList70, (int) 'a', (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList77 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList81 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest74.FuzzTest_remove(intList77, intList81, (-1), (java.lang.Integer) 1);
        fuzzTest25.FuzzTest_remove(intList68, intList77, (int) (byte) -1, (java.lang.Integer) 10);
        buggycodes.mut_014.Vector<java.lang.Integer> intList89 = null;
        fuzzTest13.FuzzTest_remove(intList68, intList89, 100, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList8, intList68, (int) '#', (java.lang.Integer) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList3 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList7 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList15 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList19 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_remove(intList15, intList19, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList24 = null;
        fuzzTest0.FuzzTest_remove(intList15, intList24, (int) '4', (java.lang.Integer) 0);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10, 10, (-1), 1 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList33 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList38 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList42 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest35.FuzzTest_remove(intList38, intList42, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList47 = null;
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList51 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList55 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest48.FuzzTest_remove(intList51, intList55, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList60 = null;
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList64 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList68 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_remove(intList64, intList68, (-1), (java.lang.Integer) 1);
        fuzzTest48.FuzzTest_remove(intList60, intList68, (int) 'a', (java.lang.Integer) 0);
        fuzzTest35.FuzzTest_remove(intList47, intList68, 100, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList33, intList68, (int) ' ', (java.lang.Integer) 10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_014.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_014.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_remove(intList1, intList2, 100, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList9 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList13 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest6.FuzzTest_remove(intList9, intList13, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList21 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList25 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_remove(intList21, intList25, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList30 = null;
        fuzzTest6.FuzzTest_remove(intList21, intList30, (int) '4', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList37 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList41 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest34.FuzzTest_remove(intList37, intList41, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList49 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList53 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest46.FuzzTest_remove(intList49, intList53, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_014.Vector<java.lang.Integer> intList61 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest34.FuzzTest_remove(intList53, intList61, (int) '4', (java.lang.Integer) 10);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100, (-1), 100, (-1), 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList72 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList77 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList81 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest74.FuzzTest_remove(intList77, intList81, (-1), (java.lang.Integer) 1);
        fuzzTest34.FuzzTest_remove(intList72, intList81, (int) (byte) 1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList21, intList72, (int) '#', (java.lang.Integer) 100);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList3 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList7 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList16 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList20 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10, 0, 0 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList29 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList34 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList38 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_remove(intList34, intList38, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList46 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList50 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest43.FuzzTest_remove(intList46, intList50, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_014.Vector<java.lang.Integer> intList58 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest31.FuzzTest_remove(intList50, intList58, (int) '4', (java.lang.Integer) 10);
        fuzzTest13.FuzzTest_remove(intList29, intList58, (int) (byte) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10, 10, (-1) };
        buggycodes.mut_014.Vector<java.lang.Integer> intList70 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest12.FuzzTest_remove(intList58, intList70, 100, (java.lang.Integer) 100);
        buggycodes.mut_014.Vector<java.lang.Integer> intList75 = null;
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 1, 1 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList80 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest12.FuzzTest_remove(intList75, intList80, (int) (byte) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest85 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList88 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList92 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        fuzzTest85.FuzzTest_remove(intList88, intList92, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList80, intList88, 0, (java.lang.Integer) 10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_014.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_014.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_remove(intList1, intList2, 100, (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList6 = null;
        buggycodes.mut_014.Vector<java.lang.Integer> intList7 = null;
        fuzzTest0.FuzzTest_remove(intList6, intList7, 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList14 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList18 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest11.FuzzTest_remove(intList14, intList18, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 0, 0 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList27 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList32 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList36 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_remove(intList32, intList36, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList44 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList48 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_remove(intList44, intList48, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_014.Vector<java.lang.Integer> intList56 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest29.FuzzTest_remove(intList48, intList56, (int) '4', (java.lang.Integer) 10);
        fuzzTest11.FuzzTest_remove(intList27, intList56, (int) (byte) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10, 10, 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList68 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList73 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList77 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest70.FuzzTest_remove(intList73, intList77, (-1), (java.lang.Integer) 1);
        fuzzTest11.FuzzTest_remove(intList68, intList73, (int) (byte) 100, (java.lang.Integer) 0);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 1, 1, 100, 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList90 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList73, intList90, 0, (java.lang.Integer) 1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList3 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList7 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList16 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList20 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        buggycodes.mut_014.Vector<java.lang.Integer> intList25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList29 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList33 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_remove(intList29, intList33, (-1), (java.lang.Integer) 1);
        fuzzTest13.FuzzTest_remove(intList25, intList33, (int) 'a', (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_remove(intList12, intList33, 100, (java.lang.Integer) 10);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10, 0, 1, 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList49 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 10, 10 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList55 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest0.FuzzTest_remove(intList49, intList55, (int) (byte) 1, (java.lang.Integer) 0);
        buggycodes.mut_014.Vector<java.lang.Integer> intList60 = null;
        buggycodes.mut_014.Vector<java.lang.Integer> intList61 = null;
        fuzzTest0.FuzzTest_remove(intList60, intList61, (int) (short) -1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList67 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10, 10, 100 };
        buggycodes.mut_014.Vector<java.lang.Integer> intList73 = new buggycodes.mut_014.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList67, intList73, 0, (java.lang.Integer) 10);
    }
}

