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
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest2.FuzzTest_add(intList8, intList10, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = null;
        fuzzTest14.FuzzTest_add(intList20, intList22, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_add(intList8, intList22, (int) (short) 1, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList8, intList31, 0, (java.lang.Integer) 0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList11 = null;
        fuzzTest3.FuzzTest_add(intList9, intList11, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = null;
        fuzzTest15.FuzzTest_add(intList21, intList23, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest2.FuzzTest_add(intList9, intList23, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_add(intList1, intList23, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList43 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = null;
        fuzzTest37.FuzzTest_add(intList43, intList45, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = null;
        fuzzTest49.FuzzTest_add(intList55, intList57, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest36.FuzzTest_add(intList43, intList57, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest34.FuzzTest_add(intList35, intList57, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList67 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest33.FuzzTest_add(intList57, intList67, (int) (byte) 100, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = null;
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList77 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest71.FuzzTest_add(intList72, intList77, (int) (short) 10, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList67, intList77, (int) (byte) -1, (java.lang.Integer) 1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList20 = null;
        fuzzTest12.FuzzTest_add(intList18, intList20, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList37 = null;
        fuzzTest29.FuzzTest_add(intList35, intList37, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList49 = null;
        fuzzTest41.FuzzTest_add(intList47, intList49, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest28.FuzzTest_add(intList35, intList49, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest26.FuzzTest_add(intList27, intList49, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList59 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest25.FuzzTest_add(intList49, intList59, (int) (byte) 100, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_add(intList24, intList49, (int) '4', (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList67 = null;
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList72 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest66.FuzzTest_add(intList67, intList72, (int) (short) 10, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList24, intList72, 0, (java.lang.Integer) 10);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList25 = null;
        fuzzTest17.FuzzTest_add(intList23, intList25, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList37 = null;
        fuzzTest29.FuzzTest_add(intList35, intList37, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest16.FuzzTest_add(intList23, intList37, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest14.FuzzTest_add(intList15, intList37, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest13.FuzzTest_add(intList37, intList47, (int) (byte) 100, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList12, intList37, (int) (byte) 1, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList54 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = null;
        fuzzTest0.FuzzTest_add(intList54, intList55, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList67 = null;
        fuzzTest59.FuzzTest_add(intList65, intList67, (int) (byte) 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10, 10, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList75 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList65, intList75, (int) (short) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList12 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = null;
        fuzzTest0.FuzzTest_add(intList12, intList13, (int) ' ', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList25 = null;
        fuzzTest17.FuzzTest_add(intList23, intList25, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList42 = null;
        fuzzTest34.FuzzTest_add(intList40, intList42, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList54 = null;
        fuzzTest46.FuzzTest_add(intList52, intList54, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest33.FuzzTest_add(intList40, intList54, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest31.FuzzTest_add(intList32, intList54, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest30.FuzzTest_add(intList54, intList64, (int) (byte) 100, (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_add(intList29, intList54, (int) '4', (java.lang.Integer) 2);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 10, 0 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList75 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList29, intList75, (int) (byte) -1, (java.lang.Integer) 100);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_add(intList6, intList8, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = null;
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzzTest12.FuzzTest_add(intList13, intList18, (int) (short) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = null;
        fuzzTest23.FuzzTest_add(intList29, intList31, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = null;
        fuzzTest40.FuzzTest_add(intList46, intList48, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList58 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList60 = null;
        fuzzTest52.FuzzTest_add(intList58, intList60, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest39.FuzzTest_add(intList46, intList60, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest37.FuzzTest_add(intList38, intList60, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest36.FuzzTest_add(intList60, intList70, (int) (byte) 100, (java.lang.Integer) 1);
        fuzzTest23.FuzzTest_add(intList35, intList60, (int) (byte) 1, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_add(intList13, intList35, (int) (short) -1, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList80 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList82 = null;
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList87 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        fuzzTest81.FuzzTest_add(intList82, intList87, (int) (short) 10, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList80, intList87, (int) (short) -1, (java.lang.Integer) 1);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_add(intList7, intList9, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = null;
        fuzzTest13.FuzzTest_add(intList19, intList21, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList7, intList21, (int) (short) 1, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = null;
        fuzzTest32.FuzzTest_add(intList38, intList40, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList52 = null;
        fuzzTest44.FuzzTest_add(intList50, intList52, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest31.FuzzTest_add(intList38, intList52, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest29.FuzzTest_add(intList30, intList52, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest28.FuzzTest_add(intList52, intList62, (int) (byte) 100, (java.lang.Integer) 1);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, (-1), 2 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList70 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList62, intList70, (int) (byte) -1, (java.lang.Integer) 0);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList6 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzzTest0.FuzzTest_add(intList1, intList6, (int) (short) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = null;
        fuzzTest15.FuzzTest_add(intList21, intList23, (int) (byte) 1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = null;
        fuzzTest27.FuzzTest_add(intList33, intList35, (int) (byte) 1, (java.lang.Integer) 1);
        fuzzTest14.FuzzTest_add(intList21, intList35, (int) (short) 1, (java.lang.Integer) (-1));
        fuzzTest12.FuzzTest_add(intList13, intList35, 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest11.FuzzTest_add(intList35, intList45, (int) (byte) 100, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, 0, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = null;
        fuzzTest49.FuzzTest_add(intList55, intList57, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList61 = null;
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList62 = null;
        fuzzTest49.FuzzTest_add(intList61, intList62, (int) ' ', (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList66 = null;
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList68 = null;
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 2, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList73 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest67.FuzzTest_add(intList68, intList73, (int) (short) 10, (java.lang.Integer) 10);
        fuzzTest49.FuzzTest_add(intList66, intList73, (int) (byte) -1, (java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList45, intList73, (int) (short) 1, (java.lang.Integer) 1);
    }
}

