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
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_clone(intList3, intList7, intList13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest16.FuzzTest_clone(intList19, intList23, intList29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest32.FuzzTest_clone(intList35, intList39, intList45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest48.FuzzTest_clone(intList51, intList55, intList61);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = null;
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest32.FuzzTest_clone(intList55, intList64, intList67);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest70.FuzzTest_clone(intList73, intList77, intList83);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList29, intList55, intList77);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_clone(intList3, intList7, intList13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest16.FuzzTest_clone(intList19, intList23, intList29);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = null;
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest0.FuzzTest_clone(intList23, intList32, intList35);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzzTest38.FuzzTest_clone(intList41, intList45, intList51);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest54.FuzzTest_clone(intList57, intList61, intList67);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList73 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest70.FuzzTest_clone(intList73, intList77, intList83);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList41, intList61, intList77);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_clone(intList3, intList7, intList13);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, 100, 0, 1, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest24.FuzzTest_clone(intList27, intList31, intList37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest40.FuzzTest_clone(intList43, intList47, intList53);
        fuzzTest0.FuzzTest_clone(intList22, intList31, intList43);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest57.FuzzTest_clone(intList60, intList64, intList70);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest73.FuzzTest_clone(intList76, intList80, intList86);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList89 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList64, intList76, intList89);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest2.FuzzTest_clone(intList5, intList9, intList15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList25 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest18.FuzzTest_clone(intList21, intList25, intList31);
        fuzzTest0.FuzzTest_clone(intList1, intList15, intList25);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest35.FuzzTest_clone(intList38, intList42, intList48);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest58.FuzzTest_clone(intList61, intList65, intList71);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest74.FuzzTest_clone(intList77, intList81, intList87);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = null;
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList93 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        fuzzTest58.FuzzTest_clone(intList81, intList90, intList93);
        fuzzTest51.FuzzTest_clone(intList55, intList57, intList93);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList97 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList38, intList93, intList97);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_clone(intList3, intList7, intList13);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = null;
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest17.FuzzTest_clone(intList20, intList24, intList30);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = null;
        fuzzTest0.FuzzTest_clone(intList16, intList24, intList33);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest35.FuzzTest_clone(intList38, intList42, intList48);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList51 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = null;
        fuzzTest0.FuzzTest_clone(intList42, intList51, intList52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest61.FuzzTest_clone(intList64, intList68, intList74);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList80 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        fuzzTest77.FuzzTest_clone(intList80, intList84, intList90);
        fuzzTest59.FuzzTest_clone(intList60, intList74, intList84);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList94 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList57, intList84, intList94);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_clone(intList3, intList7, intList13);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = null;
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest17.FuzzTest_clone(intList20, intList24, intList30);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = null;
        fuzzTest0.FuzzTest_clone(intList16, intList24, intList33);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest35.FuzzTest_clone(intList38, intList42, intList48);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest51.FuzzTest_clone(intList54, intList58, intList64);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList67 = null;
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest35.FuzzTest_clone(intList58, intList67, intList70);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList58, intList76, intList78);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList3 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_clone(intList3, intList7, intList13);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = null;
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest17.FuzzTest_clone(intList20, intList24, intList30);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = null;
        fuzzTest0.FuzzTest_clone(intList16, intList24, intList33);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest35.FuzzTest_clone(intList38, intList42, intList48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest55.FuzzTest_clone(intList58, intList62, intList68);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest71.FuzzTest_clone(intList74, intList78, intList84);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList88 = null;
        fuzzTest55.FuzzTest_clone(intList78, intList87, intList88);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList38, intList53, intList88);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest1.FuzzTest_clone(intList4, intList8, intList14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest17.FuzzTest_clone(intList20, intList24, intList30);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = null;
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest1.FuzzTest_clone(intList24, intList33, intList36);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, 100, 0, (-1) };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList54 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest51.FuzzTest_clone(intList54, intList58, intList64);
        fuzzTest1.FuzzTest_clone(intList42, intList49, intList64);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest68.FuzzTest_clone(intList71, intList75, intList81);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList84 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList49, intList71, intList84);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { (-1), 0, 1, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = null;
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList10 = null;
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest11.FuzzTest_clone(intList14, intList18, intList24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest27.FuzzTest_clone(intList30, intList34, intList40);
        fuzzTest9.FuzzTest_clone(intList10, intList24, intList34);
        fuzzTest0.FuzzTest_clone(intList6, intList8, intList10);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, (-1), 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest58.FuzzTest_clone(intList61, intList65, intList71);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest74.FuzzTest_clone(intList77, intList81, intList87);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList90 = null;
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList93 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        fuzzTest58.FuzzTest_clone(intList81, intList90, intList93);
        fuzzTest51.FuzzTest_clone(intList55, intList57, intList93);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList97 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList49, intList93, intList97);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList4 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest6.FuzzTest_clone(intList9, intList13, intList19);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList26 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest29.FuzzTest_clone(intList32, intList36, intList42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest45.FuzzTest_clone(intList48, intList52, intList58);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = null;
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest29.FuzzTest_clone(intList52, intList61, intList64);
        fuzzTest22.FuzzTest_clone(intList26, intList28, intList64);
        fuzzTest0.FuzzTest_clone(intList4, intList13, intList26);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = null;
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10, (-1), 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = null;
        fuzzTest69.FuzzTest_clone(intList70, intList75, intList77);
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList86 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { (-1), 10, 1 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList92 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        fuzzTest79.FuzzTest_clone(intList82, intList86, intList92);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList95 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_clone(intList75, intList86, intList95);
    }
}

