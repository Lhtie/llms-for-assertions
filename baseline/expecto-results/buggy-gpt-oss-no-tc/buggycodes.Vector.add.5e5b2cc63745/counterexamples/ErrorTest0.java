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
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList15 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList28 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList32 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_add(intList28, intList32, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_add(intList24, intList32, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList43 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList47 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_add(intList43, intList47, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList55 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList59 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest52.FuzzTest_add(intList55, intList59, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList67 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest40.FuzzTest_add(intList59, intList67, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList32, intList59, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 0, 0 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList16 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList21 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList25 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_add(intList21, intList25, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList33 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList37 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_add(intList33, intList37, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList45 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest18.FuzzTest_add(intList37, intList45, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList16, intList45, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList4 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList8 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList16 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList20 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList28 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest1.FuzzTest_add(intList20, intList28, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList36 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList40 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList48 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList52 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_add(intList48, intList52, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList60 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest33.FuzzTest_add(intList52, intList60, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList28, intList52, (java.lang.Integer) 10, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList14 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList23 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest16.FuzzTest_add(intList19, intList23, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList14, intList23, (java.lang.Integer) 0, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList15 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList27 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 10, 1 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList36 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList41 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList45 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest38.FuzzTest_add(intList41, intList45, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList53 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList57 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest50.FuzzTest_add(intList53, intList57, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList65 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest38.FuzzTest_add(intList57, intList65, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList36, intList65, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList4 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList8 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList16 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList20 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList28 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest1.FuzzTest_add(intList20, intList28, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList36 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList40 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, 0, 1, (-1), 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList51 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest1.FuzzTest_add(intList40, intList51, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList59 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList63 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_add(intList59, intList63, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList68 = null;
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList72 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList76 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest69.FuzzTest_add(intList72, intList76, (java.lang.Integer) 1, true);
        fuzzTest56.FuzzTest_add(intList68, intList76, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList51, intList76, (java.lang.Integer) 100, false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList4 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList8 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList17 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList21 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_add(intList17, intList21, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intList13, intList21, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList32 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList36 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_add(intList32, intList36, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList21, intList36, (java.lang.Integer) 0, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList8 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList12 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzzTest5.FuzzTest_add(intList8, intList12, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList3, intList8, (java.lang.Integer) 1, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList15 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList28 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList32 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_add(intList28, intList32, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_add(intList24, intList32, (java.lang.Integer) 1, false);
        buggycodes.mut_010.Vector<java.lang.Integer> intList40 = null;
        fuzzTest0.FuzzTest_add(intList24, intList40, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList47 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList51 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_add(intList47, intList51, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList59 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList63 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_add(intList59, intList63, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList47, intList63, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList4 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList8 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList13 = null;
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList17 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList21 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_add(intList17, intList21, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intList13, intList21, (java.lang.Integer) 1, false);
        buggycodes.mut_010.Vector<java.lang.Integer> intList29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList33 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList37 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_add(intList33, intList37, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList45 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList49 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest42.FuzzTest_add(intList45, intList49, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList57 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest30.FuzzTest_add(intList49, intList57, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intList29, intList49, (java.lang.Integer) 10, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList65 = null;
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList69 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList73 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest66.FuzzTest_add(intList69, intList73, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intList65, intList69, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList84 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList88 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest81.FuzzTest_add(intList84, intList88, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList69, intList88, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList15 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList27 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList35 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList39 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_add(intList35, intList39, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, 0, 1, (-1), 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList50 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest0.FuzzTest_add(intList39, intList50, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList58 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList62 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest55.FuzzTest_add(intList58, intList62, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, 10, 1 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList71 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList62, intList71, (java.lang.Integer) 1, false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 10, 1, 1 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList17 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList23 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList27 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest20.FuzzTest_add(intList23, intList27, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList35 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList39 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_add(intList35, intList39, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList47 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest20.FuzzTest_add(intList39, intList47, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList55 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList59 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest52.FuzzTest_add(intList55, intList59, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, 0, 1, (-1), 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList70 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest20.FuzzTest_add(intList59, intList70, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList78 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList82 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest75.FuzzTest_add(intList78, intList82, (java.lang.Integer) 1, true);
        fuzzTest19.FuzzTest_add(intList70, intList78, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList17, intList78, (java.lang.Integer) 0, false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 100, 10, 10, 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList12 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList16 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest9.FuzzTest_add(intList12, intList16, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList24 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList28 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest21.FuzzTest_add(intList24, intList28, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList33 = null;
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList37 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList41 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest34.FuzzTest_add(intList37, intList41, (java.lang.Integer) 1, true);
        fuzzTest21.FuzzTest_add(intList33, intList41, (java.lang.Integer) 1, false);
        buggycodes.mut_010.Vector<java.lang.Integer> intList49 = null;
        fuzzTest9.FuzzTest_add(intList33, intList49, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList56 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList60 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_add(intList56, intList60, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList68 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList72 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_add(intList68, intList72, (java.lang.Integer) 1, true);
        fuzzTest9.FuzzTest_add(intList56, intList72, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList7, intList72, (java.lang.Integer) 10, false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList4 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList8 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList16 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList20 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList28 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest1.FuzzTest_add(intList20, intList28, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList36 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList40 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList48 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList52 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_add(intList48, intList52, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intList36, intList52, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList63 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList67 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest60.FuzzTest_add(intList63, intList67, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList52, intList67, (java.lang.Integer) 0, false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList15 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList27 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList35 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList39 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_add(intList35, intList39, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, 100, 0, 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList49 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList39, intList49, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList16 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList20 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList12, intList20, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList31 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList35 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest28.FuzzTest_add(intList31, intList35, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList42 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList35, intList42, (java.lang.Integer) 100, false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList4 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList8 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList16 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList20 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList28 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest1.FuzzTest_add(intList20, intList28, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList36 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList40 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList48 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList52 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_add(intList48, intList52, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intList36, intList52, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList62 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList36, intList62, (java.lang.Integer) 0, false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList4 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList8 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList16 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList20 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList28 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest1.FuzzTest_add(intList20, intList28, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList36 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList40 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, 0, 1, (-1), 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList51 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest1.FuzzTest_add(intList40, intList51, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList59 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList63 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_add(intList59, intList63, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList51, intList59, (java.lang.Integer) 100, false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList15 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList27 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList31 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_add(intList27, intList31, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList39 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList43 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest36.FuzzTest_add(intList39, intList43, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList51 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest24.FuzzTest_add(intList43, intList51, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList59 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList63 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_add(intList59, intList63, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 0, 0, 1, (-1), 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList74 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest24.FuzzTest_add(intList63, intList74, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList79 = null;
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList83 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList87 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest80.FuzzTest_add(intList83, intList87, (java.lang.Integer) 1, true);
        fuzzTest24.FuzzTest_add(intList79, intList87, (java.lang.Integer) 100, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList15, intList87, (java.lang.Integer) 100, false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList4 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList8 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList16 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList20 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList28 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest1.FuzzTest_add(intList20, intList28, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList36 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList40 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, 0, 1, (-1), 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList51 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest1.FuzzTest_add(intList40, intList51, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList56 = null;
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList60 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList64 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest57.FuzzTest_add(intList60, intList64, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intList56, intList64, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, 10, 1 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList76 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList64, intList76, (java.lang.Integer) 10, false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList14 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList23 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        fuzzTest16.FuzzTest_add(intList19, intList23, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList14, intList19, (java.lang.Integer) 1, false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList15 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList27 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList31 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_add(intList27, intList31, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList39 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest12.FuzzTest_add(intList31, intList39, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList47 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList51 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_add(intList47, intList51, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList59 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList63 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_add(intList59, intList63, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_add(intList47, intList63, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList74 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList78 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest71.FuzzTest_add(intList74, intList78, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList47, intList78, (java.lang.Integer) 10, false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList4 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList8 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList16 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList20 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList28 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest1.FuzzTest_add(intList20, intList28, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList36 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList40 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList28, intList36, (java.lang.Integer) 100, false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList15 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList27 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList35 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList39 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_add(intList35, intList39, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, 0, 1, (-1), 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList50 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest0.FuzzTest_add(intList39, intList50, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList55 = null;
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList59 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList63 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_add(intList59, intList63, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList55, intList63, (java.lang.Integer) 100, false);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { (-1), 1 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList74 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        buggycodes.mut_010.Vector<java.lang.Integer> intList76 = null;
        fuzzTest0.FuzzTest_add(intList74, intList76, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1), (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList83 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzztests.FuzzTest fuzzTest85 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList88 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList92 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        fuzzTest85.FuzzTest_add(intList88, intList92, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList83, intList92, (java.lang.Integer) 0, false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList16 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList20 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList12, intList20, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList31 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList35 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest28.FuzzTest_add(intList31, intList35, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList43 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList47 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_add(intList43, intList47, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList31, intList47, (java.lang.Integer) 1, false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList15 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList27 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList35 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList39 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_add(intList35, intList39, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList47 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList51 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_add(intList47, intList51, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList59 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList63 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_add(intList59, intList63, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList71 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest44.FuzzTest_add(intList63, intList71, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList35, intList71, (java.lang.Integer) 10, false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList16 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList20 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList12, intList20, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList32 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList36 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_add(intList32, intList36, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList44 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList48 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_add(intList44, intList48, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList56 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest29.FuzzTest_add(intList48, intList56, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList61 = null;
        fuzzTest28.FuzzTest_add(intList48, intList61, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList68 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList72 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_add(intList68, intList72, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList77 = null;
        fuzzTest28.FuzzTest_add(intList72, intList77, (java.lang.Integer) 1, false);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList84 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList72, intList84, (java.lang.Integer) 1, false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList15 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList28 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList32 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_add(intList28, intList32, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList40 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList44 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest37.FuzzTest_add(intList40, intList44, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList52 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest25.FuzzTest_add(intList44, intList52, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList60 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList64 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest57.FuzzTest_add(intList60, intList64, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0, 0, 1, (-1), 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList75 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest25.FuzzTest_add(intList64, intList75, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList83 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList87 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest80.FuzzTest_add(intList83, intList87, (java.lang.Integer) 1, true);
        fuzzTest24.FuzzTest_add(intList75, intList83, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList19, intList83, (java.lang.Integer) 0, false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList15 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList27 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList35 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList39 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_add(intList35, intList39, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList48 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList52 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_add(intList48, intList52, (java.lang.Integer) 1, true);
        fuzzTest32.FuzzTest_add(intList44, intList52, (java.lang.Integer) 1, false);
        buggycodes.mut_010.Vector<java.lang.Integer> intList60 = null;
        fuzzTest0.FuzzTest_add(intList52, intList60, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList67 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList71 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest64.FuzzTest_add(intList67, intList71, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList80 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList84 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest77.FuzzTest_add(intList80, intList84, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList89 = null;
        fuzzTest76.FuzzTest_add(intList80, intList89, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList71, intList80, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList4 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList8 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList4, intList13, (java.lang.Integer) 0, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList21 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList25 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_add(intList21, intList25, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList34 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList38 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_add(intList34, intList38, (java.lang.Integer) 1, true);
        fuzzTest18.FuzzTest_add(intList30, intList38, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_add(intList17, intList30, (java.lang.Integer) 0, false);
        buggycodes.mut_010.Vector<java.lang.Integer> intList49 = null;
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList54 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList58 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest51.FuzzTest_add(intList54, intList58, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList63 = null;
        fuzzTest50.FuzzTest_add(intList54, intList63, (java.lang.Integer) 0, true);
        fuzzTest0.FuzzTest_add(intList49, intList54, (java.lang.Integer) 10, false);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList73 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 1, (-1), 0, 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList80 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList73, intList80, (java.lang.Integer) 10, false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList5 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList9 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_add(intList5, intList9, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList17 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList21 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest14.FuzzTest_add(intList17, intList21, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList29 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest2.FuzzTest_add(intList21, intList29, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList37 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList41 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        fuzzTest34.FuzzTest_add(intList37, intList41, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, 0, 1, (-1), 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList52 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest2.FuzzTest_add(intList41, intList52, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList60 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList64 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest57.FuzzTest_add(intList60, intList64, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intList52, intList60, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList75 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList79 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest72.FuzzTest_add(intList75, intList79, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList52, intList75, (java.lang.Integer) 100, false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList4 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList8 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList4, intList13, (java.lang.Integer) 0, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList17 = null;
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList21 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList25 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_add(intList21, intList25, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList30 = null;
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList34 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList38 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_add(intList34, intList38, (java.lang.Integer) 1, true);
        fuzzTest18.FuzzTest_add(intList30, intList38, (java.lang.Integer) 1, false);
        fuzzTest0.FuzzTest_add(intList17, intList30, (java.lang.Integer) 0, false);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList53 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList57 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzzTest50.FuzzTest_add(intList53, intList57, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList62 = null;
        fuzzTest49.FuzzTest_add(intList53, intList62, (java.lang.Integer) 0, true);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList70 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList74 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest67.FuzzTest_add(intList70, intList74, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList79 = null;
        fuzzTest66.FuzzTest_add(intList70, intList79, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList53, intList70, (java.lang.Integer) 0, false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList15 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList28 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList32 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_add(intList28, intList32, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_add(intList24, intList32, (java.lang.Integer) 1, false);
        buggycodes.mut_010.Vector<java.lang.Integer> intList40 = null;
        fuzzTest0.FuzzTest_add(intList24, intList40, (java.lang.Integer) 10, false);
        buggycodes.mut_010.Vector<java.lang.Integer> intList44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList48 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList52 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_add(intList48, intList52, (java.lang.Integer) 1, true);
        fuzzTest0.FuzzTest_add(intList44, intList48, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList63 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList67 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest60.FuzzTest_add(intList63, intList67, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList72 = null;
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList75 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest60.FuzzTest_add(intList72, intList75, (java.lang.Integer) 100, true);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 100, 0, 1, 1, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList86 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList75, intList86, (java.lang.Integer) 1, false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList4 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList8 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList16 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList20 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList28 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest1.FuzzTest_add(intList20, intList28, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList36 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList40 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList48 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList52 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_add(intList48, intList52, (java.lang.Integer) 1, true);
        fuzzTest1.FuzzTest_add(intList36, intList52, (java.lang.Integer) 100, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList60 = null;
        fuzzTest0.FuzzTest_add(intList52, intList60, (java.lang.Integer) (-1), true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList64 = null;
        buggycodes.mut_010.Vector<java.lang.Integer> intList65 = null;
        fuzzTest0.FuzzTest_add(intList64, intList65, (java.lang.Integer) (-1), false);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1, 100, 0, 1 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList74 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList79 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList83 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest76.FuzzTest_add(intList79, intList83, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList74, intList79, (java.lang.Integer) 10, false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList4 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList8 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_add(intList4, intList8, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList16 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList20 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList28 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest1.FuzzTest_add(intList20, intList28, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList36 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList40 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, 0, 1, (-1), 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList51 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest1.FuzzTest_add(intList40, intList51, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList56 = null;
        fuzzTest0.FuzzTest_add(intList51, intList56, (java.lang.Integer) 10, true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList63 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList67 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest60.FuzzTest_add(intList63, intList67, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList74 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList67, intList74, (java.lang.Integer) 10, false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList15 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList27 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList35 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList39 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_add(intList35, intList39, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList47 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList51 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest44.FuzzTest_add(intList47, intList51, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList59 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest32.FuzzTest_add(intList51, intList59, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList67 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList71 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest64.FuzzTest_add(intList67, intList71, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList59, intList67, (java.lang.Integer) 10, false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList16 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList20 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_add(intList16, intList20, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList25 = null;
        fuzzTest12.FuzzTest_add(intList16, intList25, (java.lang.Integer) 0, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList29 = null;
        fuzzTest0.FuzzTest_add(intList16, intList29, (java.lang.Integer) 10, false);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList36 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList40 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_add(intList36, intList40, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList48 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList52 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_add(intList48, intList52, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList60 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest33.FuzzTest_add(intList52, intList60, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList68 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList72 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_add(intList68, intList72, (java.lang.Integer) 1, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList60, intList72, (java.lang.Integer) 100, false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList15 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList27 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_add(intList19, intList27, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList35 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList39 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_add(intList35, intList39, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, 0, 1, (-1), 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList50 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest0.FuzzTest_add(intList39, intList50, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList55 = null;
        buggycodes.mut_010.Vector<java.lang.Integer> intList56 = null;
        fuzzTest0.FuzzTest_add(intList55, intList56, (java.lang.Integer) 10, true);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList62 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList67 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList71 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest64.FuzzTest_add(intList67, intList71, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList76 = null;
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList80 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList84 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest77.FuzzTest_add(intList80, intList84, (java.lang.Integer) 1, true);
        fuzzTest64.FuzzTest_add(intList76, intList84, (java.lang.Integer) 1, false);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList62, intList84, (java.lang.Integer) 0, false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList15 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList19 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_add(intList15, intList19, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList28 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList32 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_add(intList28, intList32, (java.lang.Integer) 1, true);
        fuzzTest12.FuzzTest_add(intList24, intList32, (java.lang.Integer) 1, false);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList43 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList47 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_add(intList43, intList47, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList52 = null;
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList55 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest40.FuzzTest_add(intList52, intList55, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList63 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList67 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest60.FuzzTest_add(intList63, intList67, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList75 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList79 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest72.FuzzTest_add(intList75, intList79, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList87 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest60.FuzzTest_add(intList79, intList87, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList92 = null;
        fuzzTest40.FuzzTest_add(intList79, intList92, (java.lang.Integer) (-1), true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList32, intList79, (java.lang.Integer) 100, false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_010.Vector<java.lang.Integer> intList1 = null;
        buggycodes.mut_010.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_add(intList1, intList2, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList9 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList13 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest6.FuzzTest_add(intList9, intList13, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList21 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList25 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_add(intList21, intList25, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList33 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest6.FuzzTest_add(intList25, intList33, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList41 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList45 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest38.FuzzTest_add(intList41, intList45, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 0, 1, (-1), 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList56 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest6.FuzzTest_add(intList45, intList56, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList64 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList68 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_add(intList64, intList68, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList73 = null;
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList76 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest61.FuzzTest_add(intList73, intList76, (java.lang.Integer) 100, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList56, intList76, (java.lang.Integer) (-1), false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList3 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList7 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_add(intList3, intList7, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList12 = null;
        buggycodes.mut_010.Vector<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList12, intList13, (java.lang.Integer) (-1), true);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList20 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList24 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_add(intList20, intList24, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList32 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList36 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_add(intList32, intList36, (java.lang.Integer) 1, true);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_010.Vector<java.lang.Integer> intList44 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest17.FuzzTest_add(intList36, intList44, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList52 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList56 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_add(intList52, intList56, (java.lang.Integer) 1, true);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList64 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList68 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_add(intList64, intList68, (java.lang.Integer) 1, true);
        fuzzTest17.FuzzTest_add(intList52, intList68, (java.lang.Integer) 100, true);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList80 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10 };
        buggycodes.mut_010.Vector<java.lang.Integer> intList84 = new buggycodes.mut_010.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest77.FuzzTest_add(intList80, intList84, (java.lang.Integer) 1, true);
        buggycodes.mut_010.Vector<java.lang.Integer> intList89 = null;
        fuzzTest76.FuzzTest_add(intList80, intList89, (java.lang.Integer) 0, true);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList68, intList80, (java.lang.Integer) 100, false);
    }
}

