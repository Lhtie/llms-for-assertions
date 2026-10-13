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
        fuzzTest0.FuzzTest_keysWithPrefix(trie1, trie2, "old1", strList4);
        fuzztests.FuzzTest fuzzTest6 = new fuzztests.FuzzTest();
        naturalness.Trie trie7 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.List<java.lang.String> strList10 = null;
        fuzzTest6.FuzzTest_keysWithPrefix(trie7, trie8, "old1", strList10);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        naturalness.Trie trie13 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie14 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        naturalness.Trie trie17 = null;
        naturalness.Trie trie18 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        fuzzTest16.FuzzTest_keysWithPrefix(trie17, trie18, "", (java.util.List<java.lang.String>) strList29);
        naturalness.Trie trie32 = null;
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        naturalness.Trie trie36 = null;
        naturalness.Trie trie37 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        fuzzTest35.FuzzTest_keysWithPrefix(trie36, trie37, "", (java.util.List<java.lang.String>) strList48);
        fuzzTest16.FuzzTest_keysWithPrefix(trie32, trie33, "seed0", (java.util.List<java.lang.String>) strList48);
        fuzzTest12.FuzzTest_keysWithPrefix(trie13, trie14, "", (java.util.List<java.lang.String>) strList48);
        naturalness.Trie trie53 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "seed0", "", "", "hi!", "old2", "old0", "seed0" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        fuzzTest6.FuzzTest_keysWithPrefix(trie13, trie53, "seed1", (java.util.List<java.lang.String>) strList63);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        naturalness.Trie trie67 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie68 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.List<java.lang.String> strList70 = null;
        fuzzTest66.FuzzTest_keysWithPrefix(trie67, trie68, "old1", strList70);
        java.lang.String[] strArray74 = new java.lang.String[] { "old1" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_keysWithPrefix(trie13, trie67, "seed0", (java.util.List<java.lang.String>) strList75);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        naturalness.Trie trie2 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie3 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.List<java.lang.String> strList5 = null;
        fuzzTest1.FuzzTest_keysWithPrefix(trie2, trie3, "old1", strList5);
        naturalness.Trie trie7 = null;
        naturalness.Trie trie8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        naturalness.Trie trie11 = null;
        naturalness.Trie trie12 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "old0", "old0", "hi!", "old0", "hi!", "seed0", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        fuzzTest10.FuzzTest_keysWithPrefix(trie11, trie12, "", (java.util.List<java.lang.String>) strList23);
        fuzzTest1.FuzzTest_keysWithPrefix(trie7, trie8, "old1", (java.util.List<java.lang.String>) strList23);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        naturalness.Trie trie28 = fuzztests.FuzzTest.makeFuzzInput();
        naturalness.Trie trie29 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.List<java.lang.String> strList31 = null;
        fuzzTest27.FuzzTest_keysWithPrefix(trie28, trie29, "old1", strList31);
        naturalness.Trie trie33 = fuzztests.FuzzTest.makeFuzzInput();
        java.util.List<java.lang.String> strList35 = null;
        fuzzTest1.FuzzTest_keysWithPrefix(trie28, trie33, "hi!", strList35);
        naturalness.Trie trie37 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.String[] strArray40 = new java.lang.String[] { "seed0" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_keysWithPrefix(trie33, trie37, "old2", (java.util.List<java.lang.String>) strList41);
    }
}

