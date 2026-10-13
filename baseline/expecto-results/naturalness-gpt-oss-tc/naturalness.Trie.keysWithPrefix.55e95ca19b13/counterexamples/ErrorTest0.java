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
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.List<java.lang.String> strList4 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_keysWithPrefix(trie1, trie2, "old1", strList4);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        fuzzTest0.FuzzTest_keysWithPrefix(trie1, trie2, "", (java.util.List<java.lang.String>) strList13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        fuzzTest16.FuzzTest_keysWithPrefix(trie17, trie18, "", (java.util.List<java.lang.String>) strList29);
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.Trie trie36 = null;
        naturalness.Trie trie37 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        fuzzTest35.FuzzTest_keysWithPrefix(trie36, trie37, "", (java.util.List<java.lang.String>) strList48);
        fuzzTest16.FuzzTest_keysWithPrefix(trie32, trie33, "hi!", (java.util.List<java.lang.String>) strList48);
        naturalness.Trie trie52 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.List<java.lang.String> strList54 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_keysWithPrefix(trie32, trie52, "seed0", strList54);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        fuzzTest0.FuzzTest_keysWithPrefix(trie1, trie2, "", (java.util.List<java.lang.String>) strList13);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        fuzzTest16.FuzzTest_keysWithPrefix(trie17, trie18, "", (java.util.List<java.lang.String>) strList29);
        naturalness.Trie trie32 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        naturalness.Trie trie34 = null;
        naturalness.Trie trie35 = null;
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        fuzzTest33.FuzzTest_keysWithPrefix(trie34, trie35, "", (java.util.List<java.lang.String>) strList46);
        naturalness.Trie trie49 = null;
        naturalness.Trie trie50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        naturalness.Trie trie53 = null;
        naturalness.Trie trie54 = null;
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        fuzzTest52.FuzzTest_keysWithPrefix(trie53, trie54, "", (java.util.List<java.lang.String>) strList65);
        fuzzTest33.FuzzTest_keysWithPrefix(trie49, trie50, "seed0", (java.util.List<java.lang.String>) strList65);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        naturalness.Trie trie71 = null;
        naturalness.Trie trie72 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        fuzzTest70.FuzzTest_keysWithPrefix(trie71, trie72, "", (java.util.List<java.lang.String>) strList83);
        fuzzTest16.FuzzTest_keysWithPrefix(trie32, trie49, "", (java.util.List<java.lang.String>) strList83);
        naturalness.Trie trie87 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.List<java.lang.String> strList89 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_keysWithPrefix(trie32, trie87, "", strList89);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        fuzzTest0.FuzzTest_keysWithPrefix(trie1, trie2, "", (java.util.List<java.lang.String>) strList13);
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.Trie trie22 = null;
        naturalness.Trie trie23 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        fuzzTest21.FuzzTest_keysWithPrefix(trie22, trie23, "", (java.util.List<java.lang.String>) strList34);
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        naturalness.Trie trie39 = null;
        naturalness.Trie trie40 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        fuzzTest38.FuzzTest_keysWithPrefix(trie39, trie40, "", (java.util.List<java.lang.String>) strList51);
        naturalness.Trie trie54 = null;
        naturalness.Trie trie55 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        naturalness.Trie trie58 = null;
        naturalness.Trie trie59 = null;
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        fuzzTest57.FuzzTest_keysWithPrefix(trie58, trie59, "", (java.util.List<java.lang.String>) strList70);
        fuzzTest38.FuzzTest_keysWithPrefix(trie54, trie55, "seed0", (java.util.List<java.lang.String>) strList70);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        naturalness.Trie trie76 = null;
        naturalness.Trie trie77 = null;
        java.lang.String[] strArray87 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        fuzzTest75.FuzzTest_keysWithPrefix(trie76, trie77, "", (java.util.List<java.lang.String>) strList88);
        fuzzTest21.FuzzTest_keysWithPrefix(trie37, trie54, "", (java.util.List<java.lang.String>) strList88);
        fuzzTest17.FuzzTest_keysWithPrefix(trie18, trie19, "hi!", (java.util.List<java.lang.String>) strList88);
        java.util.List<java.lang.String> strList94 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_keysWithPrefix(trie16, trie19, "seed0", strList94);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = null;
        naturalness.Trie trie4 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        fuzzTest2.FuzzTest_keysWithPrefix(trie3, trie4, "", (java.util.List<java.lang.String>) strList15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        naturalness.Trie trie19 = null;
        naturalness.Trie trie20 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        fuzzTest18.FuzzTest_keysWithPrefix(trie19, trie20, "", (java.util.List<java.lang.String>) strList31);
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie35 = null;
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        naturalness.Trie trie38 = null;
        naturalness.Trie trie39 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        fuzzTest37.FuzzTest_keysWithPrefix(trie38, trie39, "", (java.util.List<java.lang.String>) strList50);
        naturalness.Trie trie53 = null;
        naturalness.Trie trie54 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        naturalness.Trie trie57 = null;
        naturalness.Trie trie58 = null;
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        fuzzTest56.FuzzTest_keysWithPrefix(trie57, trie58, "", (java.util.List<java.lang.String>) strList69);
        fuzzTest37.FuzzTest_keysWithPrefix(trie53, trie54, "seed0", (java.util.List<java.lang.String>) strList69);
        fuzzTest18.FuzzTest_keysWithPrefix(trie34, trie35, "hi!", (java.util.List<java.lang.String>) strList69);
        naturalness.Trie trie74 = null;
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        naturalness.Trie trie77 = null;
        naturalness.Trie trie78 = null;
        java.lang.String[] strArray88 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList89 = new java.util.ArrayList<java.lang.String>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList89, strArray88);
        fuzzTest76.FuzzTest_keysWithPrefix(trie77, trie78, "", (java.util.List<java.lang.String>) strList89);
        fuzzTest2.FuzzTest_keysWithPrefix(trie34, trie74, "seed2", (java.util.List<java.lang.String>) strList89);
        java.util.List<java.lang.String> strList94 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_keysWithPrefix(trie1, trie34, "seed2", strList94);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest4 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        naturalness.Trie trie6 = null;
        naturalness.Trie trie7 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        fuzzTest5.FuzzTest_keysWithPrefix(trie6, trie7, "", (java.util.List<java.lang.String>) strList18);
        naturalness.Trie trie21 = null;
        naturalness.Trie trie22 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        naturalness.Trie trie25 = null;
        naturalness.Trie trie26 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        fuzzTest24.FuzzTest_keysWithPrefix(trie25, trie26, "", (java.util.List<java.lang.String>) strList37);
        fuzzTest5.FuzzTest_keysWithPrefix(trie21, trie22, "seed0", (java.util.List<java.lang.String>) strList37);
        naturalness.Trie trie41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        naturalness.Trie trie44 = null;
        naturalness.Trie trie45 = null;
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        fuzzTest43.FuzzTest_keysWithPrefix(trie44, trie45, "", (java.util.List<java.lang.String>) strList56);
        naturalness.Trie trie59 = null;
        naturalness.Trie trie60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        naturalness.Trie trie63 = null;
        naturalness.Trie trie64 = null;
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        fuzzTest62.FuzzTest_keysWithPrefix(trie63, trie64, "", (java.util.List<java.lang.String>) strList75);
        fuzzTest43.FuzzTest_keysWithPrefix(trie59, trie60, "seed0", (java.util.List<java.lang.String>) strList75);
        fuzzTest4.FuzzTest_keysWithPrefix(trie21, trie41, "hi!", (java.util.List<java.lang.String>) strList75);
        fuzzTest0.FuzzTest_keysWithPrefix(trie1, trie2, "seed1", (java.util.List<java.lang.String>) strList75);
        naturalness.Trie trie81 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.List<java.lang.String> strList84 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_keysWithPrefix(trie81, trie82, "hi!", strList84);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        naturalness.Trie trie1 = null;
        naturalness.Trie trie2 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        fuzzTest0.FuzzTest_keysWithPrefix(trie1, trie2, "", (java.util.List<java.lang.String>) strList13);
        naturalness.Trie trie16 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        fuzzTest17.FuzzTest_keysWithPrefix(trie18, trie19, "", (java.util.List<java.lang.String>) strList30);
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        naturalness.Trie trie37 = null;
        naturalness.Trie trie38 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        fuzzTest36.FuzzTest_keysWithPrefix(trie37, trie38, "", (java.util.List<java.lang.String>) strList49);
        fuzzTest17.FuzzTest_keysWithPrefix(trie33, trie34, "hi!", (java.util.List<java.lang.String>) strList49);
        java.util.List<java.lang.String> strList54 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_keysWithPrefix(trie16, trie34, "old0", strList54);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        naturalness.Trie trie3 = null;
        naturalness.Trie trie4 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        fuzzTest2.FuzzTest_keysWithPrefix(trie3, trie4, "", (java.util.List<java.lang.String>) strList15);
        naturalness.Trie trie18 = null;
        naturalness.Trie trie19 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        naturalness.Trie trie22 = null;
        naturalness.Trie trie23 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        fuzzTest21.FuzzTest_keysWithPrefix(trie22, trie23, "", (java.util.List<java.lang.String>) strList34);
        fuzzTest2.FuzzTest_keysWithPrefix(trie18, trie19, "seed0", (java.util.List<java.lang.String>) strList34);
        naturalness.Trie trie38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        naturalness.Trie trie41 = null;
        naturalness.Trie trie42 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        fuzzTest40.FuzzTest_keysWithPrefix(trie41, trie42, "", (java.util.List<java.lang.String>) strList53);
        naturalness.Trie trie56 = null;
        naturalness.Trie trie57 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        naturalness.Trie trie60 = null;
        naturalness.Trie trie61 = null;
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        fuzzTest59.FuzzTest_keysWithPrefix(trie60, trie61, "", (java.util.List<java.lang.String>) strList72);
        fuzzTest40.FuzzTest_keysWithPrefix(trie56, trie57, "seed0", (java.util.List<java.lang.String>) strList72);
        fuzzTest1.FuzzTest_keysWithPrefix(trie18, trie38, "hi!", (java.util.List<java.lang.String>) strList72);
        naturalness.Trie trie77 = null;
        naturalness.Trie trie78 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.List<java.lang.String> strList80 = null;
        fuzzTest1.FuzzTest_keysWithPrefix(trie77, trie78, "old0", strList80);
        naturalness.Trie trie82 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie83 = null;
        java.lang.String[] strArray87 = new java.lang.String[] { "seed2", "old2" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        fuzzTest1.FuzzTest_keysWithPrefix(trie82, trie83, "seed1", (java.util.List<java.lang.String>) strList88);
        naturalness.Trie trie91 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.List<java.lang.String> strList93 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_keysWithPrefix(trie82, trie91, "seed2", strList93);
    }
}

