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
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = null;
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList10, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = null;
        fuzzTest20.FuzzTest_set(intList21, intList22, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest27.FuzzTest_set(intList28, intList29, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest19.FuzzTest_set(intList21, intList29, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList41 = null;
        fuzzTest39.FuzzTest_set(intList40, intList41, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = null;
        fuzzTest46.FuzzTest_set(intList47, intList48, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest38.FuzzTest_set(intList40, intList48, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_set(intList29, intList40, 2, (java.lang.Integer) 2, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList63 = null;
        fuzzTest61.FuzzTest_set(intList62, intList63, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList71 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList62, intList71, (int) (byte) 0, (java.lang.Integer) 100, (java.lang.Integer) 100);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = null;
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = null;
        fuzzTest1.FuzzTest_set(intList8, intList9, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList16 = null;
        fuzzTest14.FuzzTest_set(intList15, intList16, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = null;
        fuzzTest22.FuzzTest_set(intList23, intList24, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList31 = null;
        fuzzTest29.FuzzTest_set(intList30, intList31, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest21.FuzzTest_set(intList23, intList31, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList42 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList43 = null;
        fuzzTest41.FuzzTest_set(intList42, intList43, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList49 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = null;
        fuzzTest48.FuzzTest_set(intList49, intList50, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest40.FuzzTest_set(intList42, intList50, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzzTest14.FuzzTest_set(intList31, intList50, 100, (java.lang.Integer) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest63.FuzzTest_set(intList64, intList65, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList71 = null;
        fuzzTest63.FuzzTest_set(intList70, intList71, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList77 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList78 = null;
        fuzzTest76.FuzzTest_set(intList77, intList78, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList83 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList84 = null;
        fuzzTest76.FuzzTest_set(intList83, intList84, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest14.FuzzTest_set(intList70, intList84, (int) (byte) 0, (java.lang.Integer) 0, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList8, intList70, (int) (short) 0, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = null;
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList10, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = null;
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 2, 0, 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList25 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest0.FuzzTest_set(intList19, intList25, (int) (short) 10, (java.lang.Integer) 100, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest31.FuzzTest_set(intList32, intList33, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = null;
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 1 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList42 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzzTest31.FuzzTest_set(intList38, intList42, 10, (java.lang.Integer) 1, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList51 = null;
        fuzzTest49.FuzzTest_set(intList50, intList51, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList58 = null;
        fuzzTest56.FuzzTest_set(intList57, intList58, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest48.FuzzTest_set(intList50, intList58, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList67 = null;
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1, 2, 0, 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList73 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest48.FuzzTest_set(intList67, intList73, (int) (short) 10, (java.lang.Integer) 100, (java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList42, intList73, (int) (short) 1, (java.lang.Integer) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList3 = null;
        fuzzTest1.FuzzTest_set(intList2, intList3, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_set(intList2, intList10, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = null;
        fuzzTest20.FuzzTest_set(intList21, intList22, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = null;
        fuzzTest27.FuzzTest_set(intList28, intList29, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest19.FuzzTest_set(intList21, intList29, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList41 = null;
        fuzzTest39.FuzzTest_set(intList40, intList41, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList48 = null;
        fuzzTest46.FuzzTest_set(intList47, intList48, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        fuzzTest38.FuzzTest_set(intList40, intList48, (int) (short) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_set(intList29, intList40, (-1), (java.lang.Integer) 100, (java.lang.Integer) 1);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList61 = null;
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList63 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = null;
        fuzzTest62.FuzzTest_set(intList63, intList64, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList69 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList70 = null;
        fuzzTest62.FuzzTest_set(intList69, intList70, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList75 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList76 = null;
        fuzzTest62.FuzzTest_set(intList75, intList76, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        fuzzTest0.FuzzTest_set(intList61, intList76, (int) '4', (java.lang.Integer) 100, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList85 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 1, 100 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList89 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList85, intList89, (int) (short) 0, (java.lang.Integer) 2, (java.lang.Integer) 2);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = null;
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList10 = null;
        fuzzTest8.FuzzTest_set(intList9, intList10, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList15 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList17 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList18 = null;
        fuzzTest16.FuzzTest_set(intList17, intList18, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList23 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList24 = null;
        fuzzTest16.FuzzTest_set(intList23, intList24, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest8.FuzzTest_set(intList15, intList24, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_set(intList7, intList15, (int) (byte) 0, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList39 = null;
        fuzzTest37.FuzzTest_set(intList38, intList39, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = null;
        fuzzTest37.FuzzTest_set(intList44, intList45, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 100, 10 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList55 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList58 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList59 = null;
        fuzzTest57.FuzzTest_set(intList58, intList59, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest57.FuzzTest_set(intList64, intList65, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest50.FuzzTest_set(intList55, intList65, (int) (byte) 100, (java.lang.Integer) 2, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList44, intList55, 0, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_set(intList1, intList2, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList8 = null;
        fuzzTest0.FuzzTest_set(intList7, intList8, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList14 = null;
        fuzzTest0.FuzzTest_set(intList13, intList14, 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList22 = null;
        fuzzTest20.FuzzTest_set(intList21, intList22, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList30 = null;
        fuzzTest28.FuzzTest_set(intList29, intList30, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList35 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList36 = null;
        fuzzTest28.FuzzTest_set(intList35, intList36, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest20.FuzzTest_set(intList27, intList36, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList46 = null;
        fuzzTest20.FuzzTest_set(intList45, intList46, 1, (java.lang.Integer) 2, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_set(intList19, intList46, (int) (short) 100, (java.lang.Integer) 100, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList56 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList57 = null;
        fuzzTest55.FuzzTest_set(intList56, intList57, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList65 = null;
        fuzzTest63.FuzzTest_set(intList64, intList65, (int) '#', (java.lang.Integer) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList71 = null;
        fuzzTest63.FuzzTest_set(intList70, intList71, (int) ' ', (java.lang.Integer) 1, (java.lang.Integer) 100);
        fuzzTest55.FuzzTest_set(intList62, intList71, 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 0 };
        buggyasrts.mut_000.ArrayList<java.lang.Integer> intList83 = new buggyasrts.mut_000.ArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_set(intList62, intList83, (int) (byte) 1, (java.lang.Integer) 2, (java.lang.Integer) 2);
    }
}

