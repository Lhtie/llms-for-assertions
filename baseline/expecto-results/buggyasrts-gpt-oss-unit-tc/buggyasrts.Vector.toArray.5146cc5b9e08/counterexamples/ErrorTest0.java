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
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest1.FuzzTest_toArray(intList9, intList15, intArray23);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 100, (-1), 0, 10 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList31 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest33.FuzzTest_toArray(intList41, intList47, intArray55);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList71 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest57.FuzzTest_toArray(intList65, intList71, intArray79);
        fuzzTest1.FuzzTest_toArray(intList31, intList47, intArray79);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray83 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList47, intList82, intArray83);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest1.FuzzTest_toArray(intList9, intList15, intArray23);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest25.FuzzTest_toArray(intList33, intList39, intArray47);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList63 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest49.FuzzTest_toArray(intList57, intList63, intArray71);
        java.lang.Integer[] intArray73 = null;
        fuzzTest1.FuzzTest_toArray(intList39, intList57, intArray73);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList75 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray76 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList57, intList75, intArray76);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList15 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest1.FuzzTest_toArray(intList9, intList15, intArray23);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList33 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList39 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest25.FuzzTest_toArray(intList33, intList39, intArray47);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10, 1, 10 };
        fuzzTest0.FuzzTest_toArray(intList9, intList39, intArray52);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10, 10, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList59 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList70 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList76 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest62.FuzzTest_toArray(intList70, intList76, intArray84);
        fuzzTest54.FuzzTest_toArray(intList59, intList61, intArray84);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList87 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray88 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList61, intList87, intArray88);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 0, 10, 0, 0, 1, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest10.FuzzTest_toArray(intList18, intList24, intArray32);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList35 = null;
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList44 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList50 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest36.FuzzTest_toArray(intList44, intList50, intArray58);
        fuzzTest10.FuzzTest_toArray(intList34, intList35, intArray58);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10, 10, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList77 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList83 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest69.FuzzTest_toArray(intList77, intList83, intArray91);
        fuzzTest61.FuzzTest_toArray(intList66, intList68, intArray91);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList94 = null;
        java.lang.Integer[] intArray95 = null;
        fuzzTest10.FuzzTest_toArray(intList68, intList94, intArray95);
        java.lang.Integer[] intArray97 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList8, intList68, intArray97);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList5 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList16 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList22 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest8.FuzzTest_toArray(intList16, intList22, intArray30);
        fuzzTest0.FuzzTest_toArray(intList5, intList7, intArray30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList41 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList47 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest33.FuzzTest_toArray(intList41, intList47, intArray55);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList57 = null;
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 2 };
        fuzzTest0.FuzzTest_toArray(intList41, intList57, intArray59);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray63 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList61, intList62, intArray63);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList12 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest4.FuzzTest_toArray(intList12, intList18, intArray26);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList36 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList42 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest28.FuzzTest_toArray(intList36, intList42, intArray50);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10, 1, 10 };
        fuzzTest3.FuzzTest_toArray(intList12, intList42, intArray55);
        fuzzTest0.FuzzTest_toArray(intList1, intList2, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList66 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList72 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest58.FuzzTest_toArray(intList66, intList72, intArray80);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList82 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] {};
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList72, intList82, intArray83);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 10, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList6 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList17 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList23 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest9.FuzzTest_toArray(intList17, intList23, intArray31);
        fuzzTest1.FuzzTest_toArray(intList6, intList8, intArray31);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList43 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest35.FuzzTest_toArray(intList43, intList49, intArray57);
        fuzzTest0.FuzzTest_toArray(intList8, intList34, intArray57);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList60 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList61 = null;
        java.lang.Integer[] intArray62 = null;
        fuzzTest0.FuzzTest_toArray(intList60, intList61, intArray62);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray66 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList64, intList65, intArray66);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggyasrts.mut_000.Vector<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10, 10, 0 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList7 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList18 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList24 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest10.FuzzTest_toArray(intList18, intList24, intArray32);
        fuzzTest2.FuzzTest_toArray(intList7, intList9, intArray32);
        java.lang.Integer[] intArray35 = null;
        fuzzTest0.FuzzTest_toArray(intList1, intList9, intArray35);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList37 = null;
        buggyasrts.mut_000.Vector<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray39 = null;
        fuzzTest0.FuzzTest_toArray(intList37, intList38, intArray39);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, 2, 1, 100, 10, 2 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList49 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 2, 1, 100 };
        buggyasrts.mut_000.Vector<java.lang.Integer> intList55 = new buggyasrts.mut_000.Vector<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 2, 2, 2, 2, 1, 1 };
        fuzzTest41.FuzzTest_toArray(intList49, intList55, intArray63);
        buggyasrts.mut_000.Vector<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray66 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList49, intList65, intArray66);
    }
}

