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
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest20.FuzzTest_add(intList28, intList34, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList19, intList34, (int) ' ', (java.lang.Integer) 100);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest19.FuzzTest_add(intList27, intList33, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest49.FuzzTest_add(intList57, intList63, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest39.FuzzTest_add(intList47, intList57, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList85 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest71.FuzzTest_add(intList79, intList85, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest38.FuzzTest_add(intList47, intList85, 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList27, intList85, (int) (byte) -1, (java.lang.Integer) 10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_add(intList9, intList15, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest20.FuzzTest_add(intList28, intList34, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest39.FuzzTest_add(intList47, intList53, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList34, intList53, 0, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList85 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest71.FuzzTest_add(intList79, intList85, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest61.FuzzTest_add(intList69, intList79, (int) (byte) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList53, intList79, (int) (byte) -1, (java.lang.Integer) 10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest29.FuzzTest_add(intList37, intList43, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest19.FuzzTest_add(intList27, intList37, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest61.FuzzTest_add(intList69, intList75, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest51.FuzzTest_add(intList59, intList69, (int) (byte) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList27, intList69, (-1), (java.lang.Integer) (-1));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList26 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest12.FuzzTest_add(intList20, intList26, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList10, intList20, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest34.FuzzTest_add(intList42, intList48, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList10, intList48, 0, (java.lang.Integer) 0);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList10, intList56, (int) (byte) 10, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList78 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList84 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        fuzzTest70.FuzzTest_add(intList78, intList84, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest60.FuzzTest_add(intList68, intList78, (int) (byte) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_009.Vector<java.lang.Integer> intList92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList78, intList92, 100, (java.lang.Integer) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList28 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList34 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        fuzzTest20.FuzzTest_add(intList28, intList34, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest10.FuzzTest_add(intList18, intList28, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest42.FuzzTest_add(intList50, intList56, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest9.FuzzTest_add(intList18, intList56, 0, (java.lang.Integer) 0);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest8.FuzzTest_add(intList18, intList64, (int) (byte) 10, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList6, intList18, (int) '#', (java.lang.Integer) 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList25 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest11.FuzzTest_add(intList19, intList25, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList9, intList19, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest33.FuzzTest_add(intList41, intList47, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList9, intList47, 0, (java.lang.Integer) 0);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10, 10, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList85 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest71.FuzzTest_add(intList79, intList85, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest61.FuzzTest_add(intList69, intList79, (int) (byte) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList59, intList69, (int) (short) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList26 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest12.FuzzTest_add(intList20, intList26, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList10, intList20, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest34.FuzzTest_add(intList42, intList48, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList10, intList48, 0, (java.lang.Integer) 0);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList56 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList10, intList56, (int) (byte) 10, (java.lang.Integer) 1);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList60 = null;
        buggyasrts.mut_009.Vector<java.lang.Integer> intList61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest0.FuzzTest_add(intList60, intList61, (int) (short) 10, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList73 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest65.FuzzTest_add(intList73, intList79, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList84 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList79, intList84, (int) (short) 100, (java.lang.Integer) 100);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList16, (int) (byte) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest24.FuzzTest_add(intList32, intList38, (int) (byte) 10, (java.lang.Integer) 0);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 10, 10, 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList38, intList49, (int) 'a', (java.lang.Integer) 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest32.FuzzTest_add(intList40, intList46, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest22.FuzzTest_add(intList30, intList40, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList62 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest54.FuzzTest_add(intList62, intList68, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest21.FuzzTest_add(intList30, intList68, 0, (java.lang.Integer) 0);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList76 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_add(intList30, intList76, (int) (byte) 10, (java.lang.Integer) 1);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList80 = null;
        buggyasrts.mut_009.Vector<java.lang.Integer> intList81 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest20.FuzzTest_add(intList80, intList81, (int) (short) 10, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList19, intList81, (int) (byte) -1, (java.lang.Integer) (-1));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList27 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        fuzzTest29.FuzzTest_add(intList37, intList43, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest19.FuzzTest_add(intList27, intList37, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList69 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest61.FuzzTest_add(intList69, intList75, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest51.FuzzTest_add(intList59, intList69, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_add(intList27, intList69, 0, (java.lang.Integer) 10);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 0, (-1), 100, 10, 1 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList92 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList94 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList92, intList94, (int) 'a', (java.lang.Integer) 2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_009.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_add(intList1, intList2, (int) (byte) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest6.FuzzTest_add(intList14, intList20, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest25.FuzzTest_add(intList33, intList39, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest44.FuzzTest_add(intList52, intList58, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest6.FuzzTest_add(intList39, intList58, 0, (java.lang.Integer) (-1));
        buggyasrts.mut_009.Vector<java.lang.Integer> intList66 = null;
        fuzzTest0.FuzzTest_add(intList39, intList66, 2, (java.lang.Integer) 100);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList79 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList85 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest71.FuzzTest_add(intList79, intList85, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList70, intList85, (int) (short) 100, (java.lang.Integer) 100);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_009.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_add(intList1, intList2, (int) (byte) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList7 = null;
        buggyasrts.mut_009.Vector<java.lang.Integer> intList8 = null;
        fuzzTest6.FuzzTest_add(intList7, intList8, (int) (byte) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList32 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList38 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest24.FuzzTest_add(intList32, intList38, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest14.FuzzTest_add(intList22, intList32, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList54 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList60 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest46.FuzzTest_add(intList54, intList60, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest13.FuzzTest_add(intList22, intList60, 0, (java.lang.Integer) 0);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzzTest12.FuzzTest_add(intList22, intList68, (int) (byte) 10, (java.lang.Integer) 1);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { (-1), 10 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList75 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest6.FuzzTest_add(intList68, intList75, (int) '#', (java.lang.Integer) 2);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList80 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList68, intList80, (int) (byte) -1, (java.lang.Integer) 2);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzzTest1.FuzzTest_add(intList9, intList15, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList45 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest31.FuzzTest_add(intList39, intList45, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest21.FuzzTest_add(intList29, intList39, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest53.FuzzTest_add(intList61, intList67, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest20.FuzzTest_add(intList29, intList67, 0, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList15, intList29, (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_009.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_add(intList1, intList2, (int) (byte) 10, (java.lang.Integer) 100);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10, 100, 100, 0 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 1, 10, 10, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList11, intList20, (int) (short) -1, (java.lang.Integer) 10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList1, intList16, (int) (byte) 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 2, (-1), 1, 100, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList56 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest42.FuzzTest_add(intList50, intList56, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest32.FuzzTest_add(intList40, intList50, (int) (byte) 10, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList30, intList40, (int) (short) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_009.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_add(intList1, intList2, (int) (byte) 10, (java.lang.Integer) 100);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 0, (-1), 0, 1, 10 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList13 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        fuzztests.FuzzTest fuzzTest15 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList23 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzzTest15.FuzzTest_add(intList23, intList29, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList13, intList29, (int) (byte) -1, (java.lang.Integer) 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest10.FuzzTest_add(intList18, intList24, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList8, intList18, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest32.FuzzTest_add(intList40, intList46, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest51.FuzzTest_add(intList59, intList65, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList46, intList59, (int) (byte) -1, (java.lang.Integer) 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_009.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_add(intList1, intList2, (int) (byte) 10, (java.lang.Integer) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { (-1), 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 0, 10 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList9, intList14, (int) (byte) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList26 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest12.FuzzTest_add(intList20, intList26, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList10, intList20, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList52 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList58 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest44.FuzzTest_add(intList52, intList58, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest34.FuzzTest_add(intList42, intList52, (int) (byte) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_009.Vector<java.lang.Integer> intList66 = null;
        fuzzTest2.FuzzTest_add(intList42, intList66, (int) (short) -1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList1, intList42, (int) (short) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 2, 2, 0 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList5 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        fuzztests.FuzzTest fuzzTest7 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList21 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        fuzzTest7.FuzzTest_add(intList15, intList21, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList5, intList15, (int) 'a', (java.lang.Integer) 100);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest10.FuzzTest_add(intList18, intList24, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList8, intList18, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList34 = null;
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest35.FuzzTest_add(intList43, intList49, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest33.FuzzTest_add(intList34, intList49, (int) (byte) 0, (java.lang.Integer) 100);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList57 = null;
        fuzzTest32.FuzzTest_add(intList49, intList57, (int) '4', (java.lang.Integer) 1);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        fuzzTest0.FuzzTest_add(intList57, intList64, 0, (java.lang.Integer) 100);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList69 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList71 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList72 = null;
        fuzzTest70.FuzzTest_add(intList71, intList72, (int) (byte) -1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList69, intList71, (int) '4', (java.lang.Integer) 100);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzzTest2.FuzzTest_add(intList10, intList16, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList29 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList35 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest21.FuzzTest_add(intList29, intList35, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList54 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzzTest40.FuzzTest_add(intList48, intList54, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList35, intList54, 0, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList1, intList54, (int) 'a', (java.lang.Integer) 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest10.FuzzTest_add(intList18, intList24, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList8, intList18, (int) (byte) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_009.Vector<java.lang.Integer> intList32 = null;
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-1), (-1), 2, 0, 0, 10 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest0.FuzzTest_add(intList32, intList40, 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList49 = null;
        fuzzTest0.FuzzTest_add(intList47, intList49, (int) (short) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest53.FuzzTest_add(intList61, intList67, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList80 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList86 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        fuzzTest72.FuzzTest_add(intList80, intList86, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList61, intList80, 100, (java.lang.Integer) 100);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList19 = null;
        buggyasrts.mut_009.Vector<java.lang.Integer> intList20 = null;
        fuzzTest0.FuzzTest_add(intList19, intList20, (int) 'a', (java.lang.Integer) 0);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList27 = null;
        fuzzTest25.FuzzTest_add(intList26, intList27, (int) (byte) -1, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_add(intList24, intList27, 10, (java.lang.Integer) (-1));
        buggyasrts.mut_009.Vector<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList35 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList34, intList35, (int) (short) -1, (java.lang.Integer) 2);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_add(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 2, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList12 = null;
        fuzzTest0.FuzzTest_add(intList10, intList12, (int) (short) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList17 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList18 = null;
        fuzzTest16.FuzzTest_add(intList17, intList18, (int) (byte) -1, (java.lang.Integer) 1);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList22 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList17, intList22, (int) '4', (java.lang.Integer) 100);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_add(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList30 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
        fuzzTest16.FuzzTest_add(intList24, intList30, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest6.FuzzTest_add(intList14, intList24, (int) (byte) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_009.Vector<java.lang.Integer> intList38 = null;
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-1), (-1), 2, 0, 0, 10 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest6.FuzzTest_add(intList38, intList46, 1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList53 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList55 = null;
        fuzzTest6.FuzzTest_add(intList53, intList55, (int) (short) 10, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList67 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList73 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest59.FuzzTest_add(intList67, intList73, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList53, intList67, (int) ' ', (java.lang.Integer) 2);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList11 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        fuzzTest3.FuzzTest_add(intList11, intList17, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList2, intList17, (int) (byte) 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest25.FuzzTest_add(intList33, intList39, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList44 = null;
        fuzzTest1.FuzzTest_add(intList39, intList44, (int) (short) 100, (java.lang.Integer) 0);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList39, intList50, (int) (byte) -1, (java.lang.Integer) 100);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList10 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList26 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest12.FuzzTest_add(intList20, intList26, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest2.FuzzTest_add(intList10, intList20, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList48 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest34.FuzzTest_add(intList42, intList48, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList10, intList48, 0, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList64 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest56.FuzzTest_add(intList64, intList70, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList10, intList64, (int) (short) 10, (java.lang.Integer) 10);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1) };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList80 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList82 = null;
        fuzzTest0.FuzzTest_add(intList80, intList82, 0, (java.lang.Integer) 2);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList86 = null;
        buggyasrts.mut_009.Vector<java.lang.Integer> intList87 = null;
        fuzzTest0.FuzzTest_add(intList86, intList87, (int) (short) 0, (java.lang.Integer) 0);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList91 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList92 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList91, intList92, (int) 'a', (java.lang.Integer) 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList1 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_add(intList1, intList2, (int) (byte) -1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList8 = null;
        fuzzTest6.FuzzTest_add(intList7, intList8, (int) (byte) -1, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList20 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList26 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzzTest12.FuzzTest_add(intList20, intList26, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList31 = null;
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList40 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList46 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest32.FuzzTest_add(intList40, intList46, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest12.FuzzTest_add(intList31, intList46, (int) ' ', (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList8, intList31, (int) (byte) 1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList59 = null;
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList68 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        fuzzTest60.FuzzTest_add(intList68, intList74, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest58.FuzzTest_add(intList59, intList74, (int) (byte) 0, (java.lang.Integer) 100);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList82 = null;
        fuzzTest57.FuzzTest_add(intList74, intList82, (int) '4', (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest86 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList87 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList88 = null;
        fuzzTest86.FuzzTest_add(intList87, intList88, (int) (byte) -1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList74, intList87, (int) (byte) 100, (java.lang.Integer) 10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList19 = null;
        buggyasrts.mut_009.Vector<java.lang.Integer> intList20 = null;
        fuzzTest0.FuzzTest_add(intList19, intList20, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest35.FuzzTest_add(intList43, intList49, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest25.FuzzTest_add(intList33, intList43, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        fuzzTest57.FuzzTest_add(intList65, intList71, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest24.FuzzTest_add(intList33, intList71, 0, (java.lang.Integer) 0);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList33, intList81, (int) 'a', (java.lang.Integer) 2);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList14 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        fuzzTest0.FuzzTest_add(intList8, intList14, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList22 = null;
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList37 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest23.FuzzTest_add(intList31, intList37, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest21.FuzzTest_add(intList22, intList37, (int) (byte) 0, (java.lang.Integer) 100);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList45 = null;
        fuzzTest20.FuzzTest_add(intList37, intList45, (int) '4', (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest49.FuzzTest_add(intList57, intList63, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest19.FuzzTest_add(intList37, intList57, 0, (java.lang.Integer) 2);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList73 = null;
        fuzzTest71.FuzzTest_add(intList72, intList73, (int) (byte) -1, (java.lang.Integer) 1);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList81 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList83 = null;
        fuzzTest71.FuzzTest_add(intList81, intList83, (int) (short) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList37, intList81, (-1), (java.lang.Integer) 1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest10.FuzzTest_add(intList18, intList24, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest0.FuzzTest_add(intList8, intList18, (int) (byte) 10, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 100, 1, 100, 1, 1 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest51.FuzzTest_add(intList59, intList65, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest41.FuzzTest_add(intList49, intList59, (int) (byte) 10, (java.lang.Integer) (-1));
        fuzzTest0.FuzzTest_add(intList39, intList59, (int) (byte) 0, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList77 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_009.Vector<java.lang.Integer> intList78 = null;
        fuzzTest76.FuzzTest_add(intList77, intList78, (int) (byte) -1, (java.lang.Integer) 1);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList82 = fuzztests.FuzzTest.makeFuzzInput();
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList77, intList82, (int) (byte) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1), 2, (-1), 0, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList19 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList25 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest11.FuzzTest_add(intList19, intList25, (int) (byte) 10, (java.lang.Integer) 0);
        fuzzTest1.FuzzTest_add(intList9, intList19, (int) (byte) 10, (java.lang.Integer) (-1));
        buggyasrts.mut_009.Vector<java.lang.Integer> intList33 = null;
        fuzzTest0.FuzzTest_add(intList9, intList33, (int) '4', (java.lang.Integer) 2);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList37 = null;
        buggyasrts.mut_009.Vector<java.lang.Integer> intList38 = null;
        fuzzTest0.FuzzTest_add(intList37, intList38, (int) (byte) 1, (java.lang.Integer) 1);
        buggyasrts.mut_009.Vector<java.lang.Integer> intList42 = null;
        buggyasrts.mut_009.Vector<java.lang.Integer> intList43 = null;
        fuzzTest0.FuzzTest_add(intList42, intList43, (int) ' ', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList55 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList61 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        fuzzTest47.FuzzTest_add(intList55, intList61, (int) (byte) 10, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList74 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_009.Vector<java.lang.Integer> intList80 = new buggyasrts.mut_009.Vector<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest66.FuzzTest_add(intList74, intList80, (int) (byte) 10, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_add(intList55, intList80, (-1), (java.lang.Integer) 100);
    }
}

