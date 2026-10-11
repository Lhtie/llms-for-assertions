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
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList7 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList3, intList7, (-1), (java.lang.Integer) 1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList6 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList11 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        buggycodes.mut_009.Vector<java.lang.Integer> intList13 = null;
        fuzzTest8.FuzzTest_add(intList11, intList13, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList20 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggycodes.mut_009.Vector<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_add(intList20, intList22, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList29 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        buggycodes.mut_009.Vector<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_add(intList29, intList31, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest8.FuzzTest_add(intList20, intList31, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_add(intList6, intList31, (int) ' ', (java.lang.Integer) 10);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList43 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList51 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList56 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        buggycodes.mut_009.Vector<java.lang.Integer> intList58 = null;
        fuzzTest53.FuzzTest_add(intList56, intList58, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList65 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        buggycodes.mut_009.Vector<java.lang.Integer> intList67 = null;
        fuzzTest62.FuzzTest_add(intList65, intList67, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList74 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        buggycodes.mut_009.Vector<java.lang.Integer> intList76 = null;
        fuzzTest71.FuzzTest_add(intList74, intList76, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest53.FuzzTest_add(intList65, intList76, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest45.FuzzTest_add(intList51, intList76, (int) ' ', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList43, intList51, (int) (byte) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList12 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_add(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList21 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggycodes.mut_009.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_add(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_add(intList12, intList23, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList32 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList37 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        buggycodes.mut_009.Vector<java.lang.Integer> intList39 = null;
        fuzzTest34.FuzzTest_add(intList37, intList39, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList46 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        buggycodes.mut_009.Vector<java.lang.Integer> intList48 = null;
        fuzzTest43.FuzzTest_add(intList46, intList48, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList55 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        buggycodes.mut_009.Vector<java.lang.Integer> intList57 = null;
        fuzzTest52.FuzzTest_add(intList55, intList57, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList64 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        buggycodes.mut_009.Vector<java.lang.Integer> intList66 = null;
        fuzzTest61.FuzzTest_add(intList64, intList66, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest43.FuzzTest_add(intList55, intList66, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList76 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest34.FuzzTest_add(intList66, intList76, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList32, intList76, (int) (byte) -1, (java.lang.Integer) 10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList15 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList20 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggycodes.mut_009.Vector<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_add(intList20, intList22, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList29 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        buggycodes.mut_009.Vector<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_add(intList29, intList31, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList38 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        buggycodes.mut_009.Vector<java.lang.Integer> intList40 = null;
        fuzzTest35.FuzzTest_add(intList38, intList40, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest17.FuzzTest_add(intList29, intList40, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest9.FuzzTest_add(intList15, intList40, (int) ' ', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList53 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        buggycodes.mut_009.Vector<java.lang.Integer> intList55 = null;
        fuzzTest50.FuzzTest_add(intList53, intList55, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList62 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        buggycodes.mut_009.Vector<java.lang.Integer> intList64 = null;
        fuzzTest59.FuzzTest_add(intList62, intList64, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList71 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        buggycodes.mut_009.Vector<java.lang.Integer> intList73 = null;
        fuzzTest68.FuzzTest_add(intList71, intList73, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList80 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        buggycodes.mut_009.Vector<java.lang.Integer> intList82 = null;
        fuzzTest77.FuzzTest_add(intList80, intList82, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest59.FuzzTest_add(intList71, intList82, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList92 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        fuzzTest50.FuzzTest_add(intList82, intList92, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList15, intList92, (int) 'a', (java.lang.Integer) 10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList15 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList20 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggycodes.mut_009.Vector<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_add(intList20, intList22, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList29 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        buggycodes.mut_009.Vector<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_add(intList29, intList31, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList38 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        buggycodes.mut_009.Vector<java.lang.Integer> intList40 = null;
        fuzzTest35.FuzzTest_add(intList38, intList40, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList47 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggycodes.mut_009.Vector<java.lang.Integer> intList49 = null;
        fuzzTest44.FuzzTest_add(intList47, intList49, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest26.FuzzTest_add(intList38, intList49, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList59 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest17.FuzzTest_add(intList49, intList59, (int) '4', (java.lang.Integer) 10);
        fuzzTest9.FuzzTest_add(intList15, intList49, (int) (short) 100, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList70 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        buggycodes.mut_009.Vector<java.lang.Integer> intList72 = null;
        fuzzTest67.FuzzTest_add(intList70, intList72, (int) (short) -1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList15, intList70, (int) (short) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList4 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        buggycodes.mut_009.Vector<java.lang.Integer> intList6 = null;
        fuzzTest1.FuzzTest_add(intList4, intList6, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList13 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        buggycodes.mut_009.Vector<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_add(intList13, intList15, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList22 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggycodes.mut_009.Vector<java.lang.Integer> intList24 = null;
        fuzzTest19.FuzzTest_add(intList22, intList24, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList31 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggycodes.mut_009.Vector<java.lang.Integer> intList33 = null;
        fuzzTest28.FuzzTest_add(intList31, intList33, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest10.FuzzTest_add(intList22, intList33, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList43 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest1.FuzzTest_add(intList22, intList43, 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 0, (-1), 0, 100, 0 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList54 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList22, intList54, (-1), (java.lang.Integer) 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList12 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_add(intList12, intList14, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList21 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggycodes.mut_009.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_add(intList21, intList23, (int) '#', (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList14, intList21, (int) (short) 1, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList33 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        buggycodes.mut_009.Vector<java.lang.Integer> intList35 = null;
        fuzzTest30.FuzzTest_add(intList33, intList35, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggycodes.mut_009.Vector<java.lang.Integer> intList40 = null;
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList44 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        buggycodes.mut_009.Vector<java.lang.Integer> intList46 = null;
        fuzzTest41.FuzzTest_add(intList44, intList46, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList53 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        buggycodes.mut_009.Vector<java.lang.Integer> intList55 = null;
        fuzzTest50.FuzzTest_add(intList53, intList55, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList62 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        buggycodes.mut_009.Vector<java.lang.Integer> intList64 = null;
        fuzzTest59.FuzzTest_add(intList62, intList64, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList71 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        buggycodes.mut_009.Vector<java.lang.Integer> intList73 = null;
        fuzzTest68.FuzzTest_add(intList71, intList73, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest50.FuzzTest_add(intList62, intList73, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList83 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest41.FuzzTest_add(intList62, intList83, 1, (java.lang.Integer) 100);
        fuzzTest39.FuzzTest_add(intList40, intList83, (int) (byte) -1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList33, intList83, (-1), (java.lang.Integer) (-1));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList12 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_add(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList21 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggycodes.mut_009.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_add(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_add(intList12, intList23, (int) (short) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList33 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        buggycodes.mut_009.Vector<java.lang.Integer> intList35 = null;
        fuzzTest30.FuzzTest_add(intList33, intList35, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList42 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        buggycodes.mut_009.Vector<java.lang.Integer> intList44 = null;
        fuzzTest39.FuzzTest_add(intList42, intList44, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList51 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        buggycodes.mut_009.Vector<java.lang.Integer> intList53 = null;
        fuzzTest48.FuzzTest_add(intList51, intList53, (int) '#', (java.lang.Integer) 0);
        fuzzTest30.FuzzTest_add(intList44, intList51, (int) (short) 1, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList63 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        buggycodes.mut_009.Vector<java.lang.Integer> intList65 = null;
        fuzzTest60.FuzzTest_add(intList63, intList65, (int) '#', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList51, intList63, (int) 'a', (java.lang.Integer) 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList12 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_add(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList21 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggycodes.mut_009.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_add(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_add(intList12, intList23, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 100, (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList34 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList40 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        buggycodes.mut_009.Vector<java.lang.Integer> intList42 = null;
        fuzzTest37.FuzzTest_add(intList40, intList42, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList49 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        buggycodes.mut_009.Vector<java.lang.Integer> intList51 = null;
        fuzzTest46.FuzzTest_add(intList49, intList51, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList58 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        buggycodes.mut_009.Vector<java.lang.Integer> intList60 = null;
        fuzzTest55.FuzzTest_add(intList58, intList60, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList67 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        buggycodes.mut_009.Vector<java.lang.Integer> intList69 = null;
        fuzzTest64.FuzzTest_add(intList67, intList69, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest46.FuzzTest_add(intList58, intList69, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList79 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest37.FuzzTest_add(intList69, intList79, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList87 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        buggycodes.mut_009.Vector<java.lang.Integer> intList89 = null;
        fuzzTest84.FuzzTest_add(intList87, intList89, (int) '#', (java.lang.Integer) 0);
        fuzzTest36.FuzzTest_add(intList69, intList87, (int) (short) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList34, intList87, (int) (short) -1, (java.lang.Integer) 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList4 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        buggycodes.mut_009.Vector<java.lang.Integer> intList6 = null;
        fuzzTest1.FuzzTest_add(intList4, intList6, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList13 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        buggycodes.mut_009.Vector<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_add(intList13, intList15, (int) '#', (java.lang.Integer) 0);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 10, 0, (-1), 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList25 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggycodes.mut_009.Vector<java.lang.Integer> intList28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList32 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        buggycodes.mut_009.Vector<java.lang.Integer> intList34 = null;
        fuzzTest29.FuzzTest_add(intList32, intList34, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList41 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        buggycodes.mut_009.Vector<java.lang.Integer> intList43 = null;
        fuzzTest38.FuzzTest_add(intList41, intList43, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList50 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        buggycodes.mut_009.Vector<java.lang.Integer> intList52 = null;
        fuzzTest47.FuzzTest_add(intList50, intList52, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList59 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        buggycodes.mut_009.Vector<java.lang.Integer> intList61 = null;
        fuzzTest56.FuzzTest_add(intList59, intList61, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest38.FuzzTest_add(intList50, intList61, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList71 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest29.FuzzTest_add(intList50, intList71, 1, (java.lang.Integer) 100);
        fuzzTest27.FuzzTest_add(intList28, intList71, (int) (byte) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList81 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        buggycodes.mut_009.Vector<java.lang.Integer> intList83 = null;
        fuzzTest27.FuzzTest_add(intList81, intList83, (int) '#', (java.lang.Integer) (-1));
        fuzzTest10.FuzzTest_add(intList25, intList83, (-1), (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList4, intList25, (int) (short) -1, (java.lang.Integer) (-1));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList4 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        buggycodes.mut_009.Vector<java.lang.Integer> intList6 = null;
        fuzzTest1.FuzzTest_add(intList4, intList6, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList13 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        buggycodes.mut_009.Vector<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_add(intList13, intList15, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList23 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        buggycodes.mut_009.Vector<java.lang.Integer> intList25 = null;
        fuzzTest20.FuzzTest_add(intList23, intList25, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList32 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        buggycodes.mut_009.Vector<java.lang.Integer> intList34 = null;
        fuzzTest29.FuzzTest_add(intList32, intList34, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList41 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        buggycodes.mut_009.Vector<java.lang.Integer> intList43 = null;
        fuzzTest38.FuzzTest_add(intList41, intList43, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList50 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        buggycodes.mut_009.Vector<java.lang.Integer> intList52 = null;
        fuzzTest47.FuzzTest_add(intList50, intList52, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest29.FuzzTest_add(intList41, intList52, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList62 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzzTest20.FuzzTest_add(intList52, intList62, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList70 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        buggycodes.mut_009.Vector<java.lang.Integer> intList72 = null;
        fuzzTest67.FuzzTest_add(intList70, intList72, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest19.FuzzTest_add(intList52, intList70, 1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 0, 10, (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList84 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest10.FuzzTest_add(intList70, intList84, (int) (byte) 1, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList4, intList84, (int) (short) 10, (java.lang.Integer) 1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList7 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList12 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_add(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList21 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggycodes.mut_009.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_add(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList30 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        buggycodes.mut_009.Vector<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_add(intList30, intList32, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest9.FuzzTest_add(intList21, intList32, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest1.FuzzTest_add(intList7, intList32, (int) ' ', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList45 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        buggycodes.mut_009.Vector<java.lang.Integer> intList47 = null;
        fuzzTest42.FuzzTest_add(intList45, intList47, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList54 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        buggycodes.mut_009.Vector<java.lang.Integer> intList56 = null;
        fuzzTest51.FuzzTest_add(intList54, intList56, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList63 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        buggycodes.mut_009.Vector<java.lang.Integer> intList65 = null;
        fuzzTest60.FuzzTest_add(intList63, intList65, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList72 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        buggycodes.mut_009.Vector<java.lang.Integer> intList74 = null;
        fuzzTest69.FuzzTest_add(intList72, intList74, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest51.FuzzTest_add(intList63, intList74, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList84 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest42.FuzzTest_add(intList63, intList84, 1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList7, intList84, 100, (java.lang.Integer) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) '#', (java.lang.Integer) 0);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, (-1), 0 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList13 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList21 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList26 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        buggycodes.mut_009.Vector<java.lang.Integer> intList28 = null;
        fuzzTest23.FuzzTest_add(intList26, intList28, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList35 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        buggycodes.mut_009.Vector<java.lang.Integer> intList37 = null;
        fuzzTest32.FuzzTest_add(intList35, intList37, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList44 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        buggycodes.mut_009.Vector<java.lang.Integer> intList46 = null;
        fuzzTest41.FuzzTest_add(intList44, intList46, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest23.FuzzTest_add(intList35, intList46, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest15.FuzzTest_add(intList21, intList46, (int) ' ', (java.lang.Integer) 10);
        buggycodes.mut_009.Vector<java.lang.Integer> intList56 = null;
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 1, 100, 100, 0 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList63 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest15.FuzzTest_add(intList56, intList63, 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList13, intList63, (int) '4', (java.lang.Integer) 10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList12 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_add(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList21 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggycodes.mut_009.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_add(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList30 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        buggycodes.mut_009.Vector<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_add(intList30, intList32, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest9.FuzzTest_add(intList21, intList32, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList42 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest0.FuzzTest_add(intList21, intList42, 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList50 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        buggycodes.mut_009.Vector<java.lang.Integer> intList52 = null;
        fuzzTest47.FuzzTest_add(intList50, intList52, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList62 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList67 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        buggycodes.mut_009.Vector<java.lang.Integer> intList69 = null;
        fuzzTest64.FuzzTest_add(intList67, intList69, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList76 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        buggycodes.mut_009.Vector<java.lang.Integer> intList78 = null;
        fuzzTest73.FuzzTest_add(intList76, intList78, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList85 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        buggycodes.mut_009.Vector<java.lang.Integer> intList87 = null;
        fuzzTest82.FuzzTest_add(intList85, intList87, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest64.FuzzTest_add(intList76, intList87, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest56.FuzzTest_add(intList62, intList87, (int) ' ', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList50, intList62, (int) (byte) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, (-1), (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList6 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList11 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        buggycodes.mut_009.Vector<java.lang.Integer> intList13 = null;
        fuzzTest8.FuzzTest_add(intList11, intList13, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList20 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggycodes.mut_009.Vector<java.lang.Integer> intList22 = null;
        fuzzTest17.FuzzTest_add(intList20, intList22, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList29 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        buggycodes.mut_009.Vector<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_add(intList29, intList31, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest8.FuzzTest_add(intList20, intList31, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_add(intList6, intList31, (int) ' ', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList44 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        buggycodes.mut_009.Vector<java.lang.Integer> intList46 = null;
        fuzzTest41.FuzzTest_add(intList44, intList46, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList53 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        buggycodes.mut_009.Vector<java.lang.Integer> intList55 = null;
        fuzzTest50.FuzzTest_add(intList53, intList55, (int) '#', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList44, intList53, 100, (java.lang.Integer) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_009.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList6 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggycodes.mut_009.Vector<java.lang.Integer> intList8 = null;
        fuzzTest3.FuzzTest_add(intList6, intList8, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList15 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        buggycodes.mut_009.Vector<java.lang.Integer> intList17 = null;
        fuzzTest12.FuzzTest_add(intList15, intList17, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList24 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        buggycodes.mut_009.Vector<java.lang.Integer> intList26 = null;
        fuzzTest21.FuzzTest_add(intList24, intList26, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest3.FuzzTest_add(intList15, intList26, (int) (short) 1, (java.lang.Integer) 100);
        fuzzTest1.FuzzTest_add(intList2, intList26, 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList39 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        buggycodes.mut_009.Vector<java.lang.Integer> intList41 = null;
        fuzzTest36.FuzzTest_add(intList39, intList41, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList48 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        buggycodes.mut_009.Vector<java.lang.Integer> intList50 = null;
        fuzzTest45.FuzzTest_add(intList48, intList50, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList57 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        buggycodes.mut_009.Vector<java.lang.Integer> intList59 = null;
        fuzzTest54.FuzzTest_add(intList57, intList59, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList66 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        buggycodes.mut_009.Vector<java.lang.Integer> intList68 = null;
        fuzzTest63.FuzzTest_add(intList66, intList68, (int) '#', (java.lang.Integer) 0);
        fuzzTest45.FuzzTest_add(intList59, intList66, (int) (short) 1, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList39, intList59, (int) (short) 1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 1, 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList81 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList39, intList81, (int) '4', (java.lang.Integer) 100);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) '#', (java.lang.Integer) 0);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 0, 0, 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList19 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggycodes.mut_009.Vector<java.lang.Integer> intList21 = null;
        fuzzTest16.FuzzTest_add(intList19, intList21, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList28 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        buggycodes.mut_009.Vector<java.lang.Integer> intList30 = null;
        fuzzTest25.FuzzTest_add(intList28, intList30, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList37 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        buggycodes.mut_009.Vector<java.lang.Integer> intList39 = null;
        fuzzTest34.FuzzTest_add(intList37, intList39, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList46 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        buggycodes.mut_009.Vector<java.lang.Integer> intList48 = null;
        fuzzTest43.FuzzTest_add(intList46, intList48, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList55 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        buggycodes.mut_009.Vector<java.lang.Integer> intList57 = null;
        fuzzTest52.FuzzTest_add(intList55, intList57, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest34.FuzzTest_add(intList46, intList57, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList67 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest25.FuzzTest_add(intList46, intList67, 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList75 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        buggycodes.mut_009.Vector<java.lang.Integer> intList77 = null;
        fuzzTest72.FuzzTest_add(intList75, intList77, (int) '#', (java.lang.Integer) 0);
        fuzzTest16.FuzzTest_add(intList46, intList75, (int) (short) 1, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList14, intList75, 100, (java.lang.Integer) 100);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList12 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList17 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        buggycodes.mut_009.Vector<java.lang.Integer> intList19 = null;
        fuzzTest14.FuzzTest_add(intList17, intList19, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList26 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        buggycodes.mut_009.Vector<java.lang.Integer> intList28 = null;
        fuzzTest23.FuzzTest_add(intList26, intList28, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList35 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        buggycodes.mut_009.Vector<java.lang.Integer> intList37 = null;
        fuzzTest32.FuzzTest_add(intList35, intList37, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList44 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        buggycodes.mut_009.Vector<java.lang.Integer> intList46 = null;
        fuzzTest41.FuzzTest_add(intList44, intList46, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest23.FuzzTest_add(intList35, intList46, (int) (short) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList56 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        buggycodes.mut_009.Vector<java.lang.Integer> intList58 = null;
        fuzzTest53.FuzzTest_add(intList56, intList58, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList65 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        buggycodes.mut_009.Vector<java.lang.Integer> intList67 = null;
        fuzzTest62.FuzzTest_add(intList65, intList67, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList74 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        buggycodes.mut_009.Vector<java.lang.Integer> intList76 = null;
        fuzzTest71.FuzzTest_add(intList74, intList76, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest53.FuzzTest_add(intList65, intList76, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList85 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest23.FuzzTest_add(intList76, intList85, (int) 'a', (java.lang.Integer) 100);
        buggycodes.mut_009.Vector<java.lang.Integer> intList90 = null;
        fuzzTest14.FuzzTest_add(intList85, intList90, (int) (short) -1, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList12, intList85, (int) (byte) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        buggycodes.mut_009.Vector<java.lang.Integer> intList9 = null;
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100, 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList13 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_add(intList9, intList13, (int) '4', (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList21 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggycodes.mut_009.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_add(intList21, intList23, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList30 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        buggycodes.mut_009.Vector<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_add(intList30, intList32, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList39 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        buggycodes.mut_009.Vector<java.lang.Integer> intList41 = null;
        fuzzTest36.FuzzTest_add(intList39, intList41, (int) '#', (java.lang.Integer) 0);
        fuzzTest18.FuzzTest_add(intList32, intList39, (int) (short) 1, (java.lang.Integer) 0);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1), 10, 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList52 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest0.FuzzTest_add(intList32, intList52, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList60 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        buggycodes.mut_009.Vector<java.lang.Integer> intList62 = null;
        fuzzTest57.FuzzTest_add(intList60, intList62, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList69 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        buggycodes.mut_009.Vector<java.lang.Integer> intList71 = null;
        fuzzTest66.FuzzTest_add(intList69, intList71, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList78 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        buggycodes.mut_009.Vector<java.lang.Integer> intList80 = null;
        fuzzTest75.FuzzTest_add(intList78, intList80, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList87 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        buggycodes.mut_009.Vector<java.lang.Integer> intList89 = null;
        fuzzTest84.FuzzTest_add(intList87, intList89, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest66.FuzzTest_add(intList78, intList89, (int) (short) 1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList60, intList78, (int) (byte) -1, (java.lang.Integer) 10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_009.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        buggycodes.mut_009.Vector<java.lang.Integer> intList7 = null;
        fuzzTest2.FuzzTest_add(intList5, intList7, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        buggycodes.mut_009.Vector<java.lang.Integer> intList16 = null;
        fuzzTest11.FuzzTest_add(intList14, intList16, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList23 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        buggycodes.mut_009.Vector<java.lang.Integer> intList25 = null;
        fuzzTest20.FuzzTest_add(intList23, intList25, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList32 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        buggycodes.mut_009.Vector<java.lang.Integer> intList34 = null;
        fuzzTest29.FuzzTest_add(intList32, intList34, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest11.FuzzTest_add(intList23, intList34, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList44 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest2.FuzzTest_add(intList23, intList44, 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_add(intList1, intList44, (int) (byte) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList55 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        buggycodes.mut_009.Vector<java.lang.Integer> intList57 = null;
        fuzzTest52.FuzzTest_add(intList55, intList57, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList64 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        buggycodes.mut_009.Vector<java.lang.Integer> intList66 = null;
        fuzzTest61.FuzzTest_add(intList64, intList66, (int) '#', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList55, intList64, 10, (java.lang.Integer) 10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList13 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        buggycodes.mut_009.Vector<java.lang.Integer> intList15 = null;
        fuzzTest10.FuzzTest_add(intList13, intList15, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList22 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggycodes.mut_009.Vector<java.lang.Integer> intList24 = null;
        fuzzTest19.FuzzTest_add(intList22, intList24, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList31 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggycodes.mut_009.Vector<java.lang.Integer> intList33 = null;
        fuzzTest28.FuzzTest_add(intList31, intList33, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList40 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        buggycodes.mut_009.Vector<java.lang.Integer> intList42 = null;
        fuzzTest37.FuzzTest_add(intList40, intList42, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest19.FuzzTest_add(intList31, intList42, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList52 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest10.FuzzTest_add(intList42, intList52, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList60 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        buggycodes.mut_009.Vector<java.lang.Integer> intList62 = null;
        fuzzTest57.FuzzTest_add(intList60, intList62, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest9.FuzzTest_add(intList42, intList60, 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList72 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        buggycodes.mut_009.Vector<java.lang.Integer> intList74 = null;
        fuzzTest69.FuzzTest_add(intList72, intList74, (int) (short) -1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList60, intList72, (int) (byte) -1, (java.lang.Integer) 10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList12 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_add(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList21 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggycodes.mut_009.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_add(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList30 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        buggycodes.mut_009.Vector<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_add(intList30, intList32, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest9.FuzzTest_add(intList21, intList32, (int) (short) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList42 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        buggycodes.mut_009.Vector<java.lang.Integer> intList44 = null;
        fuzzTest39.FuzzTest_add(intList42, intList44, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList51 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        buggycodes.mut_009.Vector<java.lang.Integer> intList53 = null;
        fuzzTest48.FuzzTest_add(intList51, intList53, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList60 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        buggycodes.mut_009.Vector<java.lang.Integer> intList62 = null;
        fuzzTest57.FuzzTest_add(intList60, intList62, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList69 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        buggycodes.mut_009.Vector<java.lang.Integer> intList71 = null;
        fuzzTest66.FuzzTest_add(intList69, intList71, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest48.FuzzTest_add(intList60, intList71, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList81 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest39.FuzzTest_add(intList60, intList81, 1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList21, intList60, (int) '#', (java.lang.Integer) 100);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_009.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        buggycodes.mut_009.Vector<java.lang.Integer> intList7 = null;
        fuzzTest2.FuzzTest_add(intList5, intList7, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        buggycodes.mut_009.Vector<java.lang.Integer> intList16 = null;
        fuzzTest11.FuzzTest_add(intList14, intList16, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList23 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        buggycodes.mut_009.Vector<java.lang.Integer> intList25 = null;
        fuzzTest20.FuzzTest_add(intList23, intList25, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList32 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        buggycodes.mut_009.Vector<java.lang.Integer> intList34 = null;
        fuzzTest29.FuzzTest_add(intList32, intList34, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest11.FuzzTest_add(intList23, intList34, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList44 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest2.FuzzTest_add(intList23, intList44, 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_add(intList1, intList44, (int) (byte) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList54 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        buggycodes.mut_009.Vector<java.lang.Integer> intList56 = null;
        fuzzTest0.FuzzTest_add(intList54, intList56, (int) '#', (java.lang.Integer) (-1));
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList62 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList67 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        buggycodes.mut_009.Vector<java.lang.Integer> intList69 = null;
        fuzzTest64.FuzzTest_add(intList67, intList69, (int) (short) -1, (java.lang.Integer) 100);
        buggycodes.mut_009.Vector<java.lang.Integer> intList73 = null;
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList77 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        buggycodes.mut_009.Vector<java.lang.Integer> intList79 = null;
        fuzzTest74.FuzzTest_add(intList77, intList79, (int) '#', (java.lang.Integer) 0);
        fuzzTest64.FuzzTest_add(intList73, intList77, 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList62, intList77, (int) (byte) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList12 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_add(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList21 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggycodes.mut_009.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_add(intList21, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_add(intList12, intList23, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 10, (-1), 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList35 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggycodes.mut_009.Vector<java.lang.Integer> intList38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList42 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        buggycodes.mut_009.Vector<java.lang.Integer> intList44 = null;
        fuzzTest39.FuzzTest_add(intList42, intList44, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList51 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        buggycodes.mut_009.Vector<java.lang.Integer> intList53 = null;
        fuzzTest48.FuzzTest_add(intList51, intList53, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList60 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        buggycodes.mut_009.Vector<java.lang.Integer> intList62 = null;
        fuzzTest57.FuzzTest_add(intList60, intList62, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList69 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        buggycodes.mut_009.Vector<java.lang.Integer> intList71 = null;
        fuzzTest66.FuzzTest_add(intList69, intList71, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest48.FuzzTest_add(intList60, intList71, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList81 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest39.FuzzTest_add(intList60, intList81, 1, (java.lang.Integer) 100);
        fuzzTest37.FuzzTest_add(intList38, intList81, (int) (byte) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList91 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        buggycodes.mut_009.Vector<java.lang.Integer> intList93 = null;
        fuzzTest37.FuzzTest_add(intList91, intList93, (int) '#', (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList35, intList91, (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_009.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        buggycodes.mut_009.Vector<java.lang.Integer> intList7 = null;
        fuzzTest2.FuzzTest_add(intList5, intList7, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        buggycodes.mut_009.Vector<java.lang.Integer> intList16 = null;
        fuzzTest11.FuzzTest_add(intList14, intList16, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList23 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        buggycodes.mut_009.Vector<java.lang.Integer> intList25 = null;
        fuzzTest20.FuzzTest_add(intList23, intList25, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList32 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        buggycodes.mut_009.Vector<java.lang.Integer> intList34 = null;
        fuzzTest29.FuzzTest_add(intList32, intList34, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest11.FuzzTest_add(intList23, intList34, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList44 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest2.FuzzTest_add(intList23, intList44, 1, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_add(intList1, intList44, (int) (byte) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList55 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        buggycodes.mut_009.Vector<java.lang.Integer> intList57 = null;
        fuzzTest52.FuzzTest_add(intList55, intList57, (int) (short) -1, (java.lang.Integer) 100);
        buggycodes.mut_009.Vector<java.lang.Integer> intList61 = null;
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList65 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest52.FuzzTest_add(intList61, intList65, (int) '4', (java.lang.Integer) 1);
        buggycodes.mut_009.Vector<java.lang.Integer> intList70 = null;
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList74 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        buggycodes.mut_009.Vector<java.lang.Integer> intList76 = null;
        fuzzTest71.FuzzTest_add(intList74, intList76, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest52.FuzzTest_add(intList70, intList74, 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 0, (-1), 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList87 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList74, intList87, (int) (byte) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList4 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        buggycodes.mut_009.Vector<java.lang.Integer> intList6 = null;
        fuzzTest1.FuzzTest_add(intList4, intList6, (int) (short) -1, (java.lang.Integer) 100);
        buggycodes.mut_009.Vector<java.lang.Integer> intList10 = null;
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest1.FuzzTest_add(intList10, intList14, (int) '4', (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList22 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggycodes.mut_009.Vector<java.lang.Integer> intList24 = null;
        fuzzTest19.FuzzTest_add(intList22, intList24, (int) (short) -1, (java.lang.Integer) 100);
        buggycodes.mut_009.Vector<java.lang.Integer> intList28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList32 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        buggycodes.mut_009.Vector<java.lang.Integer> intList34 = null;
        fuzzTest29.FuzzTest_add(intList32, intList34, (int) '#', (java.lang.Integer) 0);
        fuzzTest19.FuzzTest_add(intList28, intList32, 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggycodes.mut_009.Vector<java.lang.Integer> intList42 = null;
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList46 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        buggycodes.mut_009.Vector<java.lang.Integer> intList48 = null;
        fuzzTest43.FuzzTest_add(intList46, intList48, (int) '#', (java.lang.Integer) 0);
        fuzzTest41.FuzzTest_add(intList42, intList46, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList58 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        buggycodes.mut_009.Vector<java.lang.Integer> intList60 = null;
        fuzzTest55.FuzzTest_add(intList58, intList60, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest19.FuzzTest_add(intList46, intList60, (int) '#', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList14, intList46, (int) (byte) -1, (java.lang.Integer) (-1));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList12 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_add(intList12, intList14, (int) '#', (java.lang.Integer) 0);
        buggycodes.mut_009.Vector<java.lang.Integer> intList18 = null;
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList22 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggycodes.mut_009.Vector<java.lang.Integer> intList24 = null;
        fuzzTest19.FuzzTest_add(intList22, intList24, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList31 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggycodes.mut_009.Vector<java.lang.Integer> intList33 = null;
        fuzzTest28.FuzzTest_add(intList31, intList33, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList40 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        buggycodes.mut_009.Vector<java.lang.Integer> intList42 = null;
        fuzzTest37.FuzzTest_add(intList40, intList42, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList49 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        buggycodes.mut_009.Vector<java.lang.Integer> intList51 = null;
        fuzzTest46.FuzzTest_add(intList49, intList51, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest28.FuzzTest_add(intList40, intList51, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList61 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest19.FuzzTest_add(intList40, intList61, 1, (java.lang.Integer) 100);
        fuzzTest9.FuzzTest_add(intList18, intList40, (int) (short) 1, (java.lang.Integer) 1);
        buggycodes.mut_009.Vector<java.lang.Integer> intList69 = null;
        buggycodes.mut_009.Vector<java.lang.Integer> intList70 = null;
        fuzzTest9.FuzzTest_add(intList69, intList70, (int) (byte) 100, (java.lang.Integer) (-1));
        buggycodes.mut_009.Vector<java.lang.Integer> intList74 = null;
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList77 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest9.FuzzTest_add(intList74, intList77, (int) ' ', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        buggycodes.mut_009.Vector<java.lang.Integer> intList83 = null;
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList87 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        buggycodes.mut_009.Vector<java.lang.Integer> intList89 = null;
        fuzzTest84.FuzzTest_add(intList87, intList89, (int) '#', (java.lang.Integer) 0);
        fuzzTest82.FuzzTest_add(intList83, intList87, 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList77, intList87, (int) (byte) 10, (java.lang.Integer) 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_009.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        buggycodes.mut_009.Vector<java.lang.Integer> intList7 = null;
        fuzzTest2.FuzzTest_add(intList5, intList7, (int) '#', (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList5, 0, (java.lang.Integer) 0);
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = null;
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList18 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggycodes.mut_009.Vector<java.lang.Integer> intList20 = null;
        fuzzTest15.FuzzTest_add(intList18, intList20, (int) (short) -1, (java.lang.Integer) 100);
        buggycodes.mut_009.Vector<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList28 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        buggycodes.mut_009.Vector<java.lang.Integer> intList30 = null;
        fuzzTest25.FuzzTest_add(intList28, intList30, (int) '#', (java.lang.Integer) 0);
        fuzzTest15.FuzzTest_add(intList24, intList28, 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_add(intList14, intList28, (int) (byte) 100, (java.lang.Integer) 10);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList43 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList48 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        buggycodes.mut_009.Vector<java.lang.Integer> intList50 = null;
        fuzzTest45.FuzzTest_add(intList48, intList50, (int) '#', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList43, intList48, (int) ' ', (java.lang.Integer) 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_009.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        buggycodes.mut_009.Vector<java.lang.Integer> intList7 = null;
        fuzzTest2.FuzzTest_add(intList5, intList7, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        buggycodes.mut_009.Vector<java.lang.Integer> intList16 = null;
        fuzzTest11.FuzzTest_add(intList14, intList16, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList23 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        buggycodes.mut_009.Vector<java.lang.Integer> intList25 = null;
        fuzzTest20.FuzzTest_add(intList23, intList25, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList32 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        buggycodes.mut_009.Vector<java.lang.Integer> intList34 = null;
        fuzzTest29.FuzzTest_add(intList32, intList34, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest11.FuzzTest_add(intList23, intList34, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList44 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest2.FuzzTest_add(intList23, intList44, 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList52 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        buggycodes.mut_009.Vector<java.lang.Integer> intList54 = null;
        fuzzTest49.FuzzTest_add(intList52, intList54, (int) '#', (java.lang.Integer) 0);
        buggycodes.mut_009.Vector<java.lang.Integer> intList58 = null;
        fuzzTest2.FuzzTest_add(intList54, intList58, (int) (byte) 0, (java.lang.Integer) (-1));
        buggycodes.mut_009.Vector<java.lang.Integer> intList62 = null;
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList66 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        buggycodes.mut_009.Vector<java.lang.Integer> intList68 = null;
        fuzzTest63.FuzzTest_add(intList66, intList68, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest2.FuzzTest_add(intList62, intList66, (int) ' ', (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList1, intList66, 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 1, (-1), (-1), 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList84 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 0, 0, 1 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList90 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList84, intList90, (int) (byte) -1, (java.lang.Integer) 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList12 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_add(intList12, intList14, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList21 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggycodes.mut_009.Vector<java.lang.Integer> intList23 = null;
        fuzzTest18.FuzzTest_add(intList21, intList23, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList30 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        buggycodes.mut_009.Vector<java.lang.Integer> intList32 = null;
        fuzzTest27.FuzzTest_add(intList30, intList32, (int) '#', (java.lang.Integer) 0);
        fuzzTest9.FuzzTest_add(intList23, intList30, (int) (short) 1, (java.lang.Integer) 0);
        buggycodes.mut_009.Vector<java.lang.Integer> intList39 = null;
        fuzzTest0.FuzzTest_add(intList30, intList39, 100, (java.lang.Integer) 1);
        buggycodes.mut_009.Vector<java.lang.Integer> intList43 = null;
        buggycodes.mut_009.Vector<java.lang.Integer> intList44 = null;
        fuzzTest0.FuzzTest_add(intList43, intList44, (int) (short) -1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList51 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        buggycodes.mut_009.Vector<java.lang.Integer> intList53 = null;
        fuzzTest48.FuzzTest_add(intList51, intList53, (int) (short) -1, (java.lang.Integer) 100);
        buggycodes.mut_009.Vector<java.lang.Integer> intList57 = null;
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList61 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest48.FuzzTest_add(intList57, intList61, (int) '4', (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggycodes.mut_009.Vector<java.lang.Integer> intList67 = null;
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList71 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        buggycodes.mut_009.Vector<java.lang.Integer> intList73 = null;
        fuzzTest68.FuzzTest_add(intList71, intList73, (int) '#', (java.lang.Integer) 0);
        fuzzTest66.FuzzTest_add(intList67, intList71, 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList61, intList71, (int) (byte) -1, (java.lang.Integer) 100);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_009.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        buggycodes.mut_009.Vector<java.lang.Integer> intList7 = null;
        fuzzTest2.FuzzTest_add(intList5, intList7, (int) '#', (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList5, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggycodes.mut_009.Vector<java.lang.Integer> intList15 = null;
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList19 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggycodes.mut_009.Vector<java.lang.Integer> intList21 = null;
        fuzzTest16.FuzzTest_add(intList19, intList21, (int) '#', (java.lang.Integer) 0);
        fuzzTest14.FuzzTest_add(intList15, intList19, 0, (java.lang.Integer) 0);
        buggycodes.mut_009.Vector<java.lang.Integer> intList28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList32 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        buggycodes.mut_009.Vector<java.lang.Integer> intList34 = null;
        fuzzTest29.FuzzTest_add(intList32, intList34, (int) (short) -1, (java.lang.Integer) 100);
        buggycodes.mut_009.Vector<java.lang.Integer> intList38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList42 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        buggycodes.mut_009.Vector<java.lang.Integer> intList44 = null;
        fuzzTest39.FuzzTest_add(intList42, intList44, (int) '#', (java.lang.Integer) 0);
        fuzzTest29.FuzzTest_add(intList38, intList42, 1, (java.lang.Integer) (-1));
        fuzzTest14.FuzzTest_add(intList28, intList42, (int) (byte) 100, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList57 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        buggycodes.mut_009.Vector<java.lang.Integer> intList59 = null;
        fuzzTest54.FuzzTest_add(intList57, intList59, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList66 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        buggycodes.mut_009.Vector<java.lang.Integer> intList68 = null;
        fuzzTest63.FuzzTest_add(intList66, intList68, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList75 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        buggycodes.mut_009.Vector<java.lang.Integer> intList77 = null;
        fuzzTest72.FuzzTest_add(intList75, intList77, (int) '#', (java.lang.Integer) 0);
        fuzzTest54.FuzzTest_add(intList68, intList75, (int) (short) 1, (java.lang.Integer) 0);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { (-1), 1, 0, 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList89 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        buggycodes.mut_009.Vector<java.lang.Integer> intList91 = null;
        fuzzTest54.FuzzTest_add(intList89, intList91, (int) '4', (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList42, intList89, (int) '4', (java.lang.Integer) (-1));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        buggycodes.mut_009.Vector<java.lang.Integer> intList9 = null;
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100, 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList13 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzzTest0.FuzzTest_add(intList9, intList13, (int) '4', (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 0, 0, (-1), 0 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList24 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList29 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        buggycodes.mut_009.Vector<java.lang.Integer> intList31 = null;
        fuzzTest26.FuzzTest_add(intList29, intList31, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList38 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        buggycodes.mut_009.Vector<java.lang.Integer> intList40 = null;
        fuzzTest35.FuzzTest_add(intList38, intList40, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList47 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggycodes.mut_009.Vector<java.lang.Integer> intList49 = null;
        fuzzTest44.FuzzTest_add(intList47, intList49, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList56 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        buggycodes.mut_009.Vector<java.lang.Integer> intList58 = null;
        fuzzTest53.FuzzTest_add(intList56, intList58, (int) (short) -1, (java.lang.Integer) 100);
        fuzzTest35.FuzzTest_add(intList47, intList58, (int) (short) 1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_009.Vector<java.lang.Integer> intList68 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest26.FuzzTest_add(intList58, intList68, (int) '4', (java.lang.Integer) 10);
        fuzzTest18.FuzzTest_add(intList24, intList58, (int) (short) 100, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList79 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        buggycodes.mut_009.Vector<java.lang.Integer> intList81 = null;
        fuzzTest76.FuzzTest_add(intList79, intList81, (int) '#', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList24, intList79, (int) '4', (java.lang.Integer) 10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList3 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        buggycodes.mut_009.Vector<java.lang.Integer> intList5 = null;
        fuzzTest0.FuzzTest_add(intList3, intList5, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList12 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = null;
        fuzzTest9.FuzzTest_add(intList12, intList14, (int) (short) -1, (java.lang.Integer) 100);
        buggycodes.mut_009.Vector<java.lang.Integer> intList18 = null;
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList22 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        buggycodes.mut_009.Vector<java.lang.Integer> intList24 = null;
        fuzzTest19.FuzzTest_add(intList22, intList24, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList31 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        buggycodes.mut_009.Vector<java.lang.Integer> intList33 = null;
        fuzzTest28.FuzzTest_add(intList31, intList33, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList40 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        buggycodes.mut_009.Vector<java.lang.Integer> intList42 = null;
        fuzzTest37.FuzzTest_add(intList40, intList42, (int) '#', (java.lang.Integer) 0);
        fuzzTest19.FuzzTest_add(intList33, intList40, (int) (short) 1, (java.lang.Integer) 0);
        fuzzTest9.FuzzTest_add(intList18, intList40, (int) (byte) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList55 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        buggycodes.mut_009.Vector<java.lang.Integer> intList57 = null;
        fuzzTest52.FuzzTest_add(intList55, intList57, (int) (short) -1, (java.lang.Integer) 100);
        buggycodes.mut_009.Vector<java.lang.Integer> intList61 = null;
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList65 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        buggycodes.mut_009.Vector<java.lang.Integer> intList67 = null;
        fuzzTest62.FuzzTest_add(intList65, intList67, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList74 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        buggycodes.mut_009.Vector<java.lang.Integer> intList76 = null;
        fuzzTest71.FuzzTest_add(intList74, intList76, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest80 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList83 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        buggycodes.mut_009.Vector<java.lang.Integer> intList85 = null;
        fuzzTest80.FuzzTest_add(intList83, intList85, (int) '#', (java.lang.Integer) 0);
        fuzzTest62.FuzzTest_add(intList76, intList83, (int) (short) 1, (java.lang.Integer) 0);
        fuzzTest52.FuzzTest_add(intList61, intList83, (int) (byte) 1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList40, intList83, (int) 'a', (java.lang.Integer) 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList4 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        buggycodes.mut_009.Vector<java.lang.Integer> intList6 = null;
        fuzzTest1.FuzzTest_add(intList4, intList6, (int) (short) -1, (java.lang.Integer) 100);
        buggycodes.mut_009.Vector<java.lang.Integer> intList10 = null;
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList14 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        buggycodes.mut_009.Vector<java.lang.Integer> intList16 = null;
        fuzzTest11.FuzzTest_add(intList14, intList16, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList23 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        buggycodes.mut_009.Vector<java.lang.Integer> intList25 = null;
        fuzzTest20.FuzzTest_add(intList23, intList25, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList32 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        buggycodes.mut_009.Vector<java.lang.Integer> intList34 = null;
        fuzzTest29.FuzzTest_add(intList32, intList34, (int) '#', (java.lang.Integer) 0);
        fuzzTest11.FuzzTest_add(intList25, intList32, (int) (short) 1, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList10, intList25, (int) (byte) 1, (java.lang.Integer) 1);
        buggycodes.mut_009.Vector<java.lang.Integer> intList44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList48 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        buggycodes.mut_009.Vector<java.lang.Integer> intList50 = null;
        fuzzTest45.FuzzTest_add(intList48, intList50, (int) (short) -1, (java.lang.Integer) 100);
        buggycodes.mut_009.Vector<java.lang.Integer> intList54 = null;
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList58 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest45.FuzzTest_add(intList54, intList58, (int) '4', (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_add(intList44, intList58, (int) (byte) 1, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList69 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        buggycodes.mut_009.Vector<java.lang.Integer> intList71 = null;
        fuzzTest66.FuzzTest_add(intList69, intList71, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 10 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList78 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        buggycodes.mut_009.Vector<java.lang.Integer> intList80 = null;
        fuzzTest75.FuzzTest_add(intList78, intList80, (int) (short) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100, 1, 100 };
        buggycodes.mut_009.Vector<java.lang.Integer> intList88 = new buggycodes.mut_009.Vector<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        fuzzTest66.FuzzTest_add(intList80, intList88, (int) (short) 100, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList58, intList88, (int) (short) -1, (java.lang.Integer) 100);
    }
}

