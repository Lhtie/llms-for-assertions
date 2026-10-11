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
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue4 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzzTest1.FuzzTest_addLast(intQueue4, intQueue8, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue19 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_addLast(intQueue15, intQueue19, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue4, intQueue15, (java.lang.Integer) 100);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue3 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue7 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_addLast(intQueue3, intQueue7, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue18 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        fuzzTest11.FuzzTest_addLast(intQueue14, intQueue18, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue25 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue29 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        fuzzTest22.FuzzTest_addLast(intQueue25, intQueue29, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue36 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue40 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzzTest33.FuzzTest_addLast(intQueue36, intQueue40, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue47 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue51 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        fuzzTest44.FuzzTest_addLast(intQueue47, intQueue51, (java.lang.Integer) 1);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue58 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzzTest33.FuzzTest_addLast(intQueue51, intQueue58, (java.lang.Integer) 1);
        fuzzTest11.FuzzTest_addLast(intQueue25, intQueue58, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue67 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue71 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        fuzzTest64.FuzzTest_addLast(intQueue67, intQueue71, (java.lang.Integer) 1);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue80 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue85 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue89 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue89, intArray88);
        fuzzTest82.FuzzTest_addLast(intQueue85, intQueue89, (java.lang.Integer) 1);
        fuzzTest64.FuzzTest_addLast(intQueue80, intQueue85, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue58, intQueue85, (java.lang.Integer) 100);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue4 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzzTest1.FuzzTest_addLast(intQueue4, intQueue8, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue19 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_addLast(intQueue15, intQueue19, (java.lang.Integer) 1);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue26 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        fuzzTest1.FuzzTest_addLast(intQueue19, intQueue26, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue33 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue37 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest30.FuzzTest_addLast(intQueue33, intQueue37, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue41 = null;
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue45 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue49 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        fuzzTest42.FuzzTest_addLast(intQueue45, intQueue49, (java.lang.Integer) 1);
        fuzzTest30.FuzzTest_addLast(intQueue41, intQueue49, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue26, intQueue49, (java.lang.Integer) 10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue3 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue7 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_addLast(intQueue3, intQueue7, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue19 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_addLast(intQueue15, intQueue19, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_addLast(intQueue11, intQueue19, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue28 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue32 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        fuzzTest25.FuzzTest_addLast(intQueue28, intQueue32, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue39 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue43 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzzTest36.FuzzTest_addLast(intQueue39, intQueue43, (java.lang.Integer) 1);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue50 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        fuzzTest25.FuzzTest_addLast(intQueue43, intQueue50, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue54 = null;
        fuzzTest0.FuzzTest_addLast(intQueue50, intQueue54, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue60 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue64 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        fuzzTest57.FuzzTest_addLast(intQueue60, intQueue64, (java.lang.Integer) 1);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue73 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue78 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue82 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        fuzzTest75.FuzzTest_addLast(intQueue78, intQueue82, (java.lang.Integer) 1);
        fuzzTest57.FuzzTest_addLast(intQueue73, intQueue78, (java.lang.Integer) 10);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 10, (-1), (-1), 0 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue93 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue93, intArray92);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue73, intQueue93, (java.lang.Integer) 10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue3 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue7 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_addLast(intQueue3, intQueue7, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue19 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_addLast(intQueue15, intQueue19, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_addLast(intQueue11, intQueue19, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue28 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue32 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        fuzzTest25.FuzzTest_addLast(intQueue28, intQueue32, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue39 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue43 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzzTest36.FuzzTest_addLast(intQueue39, intQueue43, (java.lang.Integer) 1);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue50 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        fuzzTest25.FuzzTest_addLast(intQueue43, intQueue50, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue54 = null;
        fuzzTest0.FuzzTest_addLast(intQueue50, intQueue54, (java.lang.Integer) (-1));
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue57 = null;
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, 1, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue62 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        fuzzTest0.FuzzTest_addLast(intQueue57, intQueue62, (java.lang.Integer) 10);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue66 = null;
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue67 = null;
        fuzzTest0.FuzzTest_addLast(intQueue66, intQueue67, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue73 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue77 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        fuzzTest70.FuzzTest_addLast(intQueue73, intQueue77, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 0, 0, 100, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue87 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue87, intArray86);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue89 = null;
        fuzzTest81.FuzzTest_addLast(intQueue87, intQueue89, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue73, intQueue87, (java.lang.Integer) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue3 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue7 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_addLast(intQueue3, intQueue7, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue11 = null;
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        fuzzTest0.FuzzTest_addLast(intQueue11, intQueue14, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue21 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue25 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzzTest18.FuzzTest_addLast(intQueue21, intQueue25, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue29 = null;
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue33 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue37 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest30.FuzzTest_addLast(intQueue33, intQueue37, (java.lang.Integer) 1);
        fuzzTest18.FuzzTest_addLast(intQueue29, intQueue37, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue43 = null;
        fuzzTest0.FuzzTest_addLast(intQueue37, intQueue43, (java.lang.Integer) 10);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue46 = null;
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue47 = null;
        fuzzTest0.FuzzTest_addLast(intQueue46, intQueue47, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue53 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue57 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        fuzzTest50.FuzzTest_addLast(intQueue53, intQueue57, (java.lang.Integer) 1);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 0 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue63 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue53, intQueue63, (java.lang.Integer) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue4 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzzTest1.FuzzTest_addLast(intQueue4, intQueue8, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue19 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_addLast(intQueue15, intQueue19, (java.lang.Integer) 1);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue28 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue33 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue37 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest30.FuzzTest_addLast(intQueue33, intQueue37, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_addLast(intQueue28, intQueue33, (java.lang.Integer) 10);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, (-1), 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue47 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue52 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue56 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue56, intArray55);
        fuzzTest49.FuzzTest_addLast(intQueue52, intQueue56, (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_addLast(intQueue47, intQueue52, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue8, intQueue52, (java.lang.Integer) 100);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue3 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue7 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_addLast(intQueue3, intQueue7, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue19 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_addLast(intQueue15, intQueue19, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_addLast(intQueue11, intQueue19, (java.lang.Integer) 10);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10, 100, 1, 1, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue31 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue36 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue40 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzzTest33.FuzzTest_addLast(intQueue36, intQueue40, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue48 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue52 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        fuzzTest45.FuzzTest_addLast(intQueue48, intQueue52, (java.lang.Integer) 1);
        fuzzTest33.FuzzTest_addLast(intQueue44, intQueue52, (java.lang.Integer) 10);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue58 = null;
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue62 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue66 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        fuzzTest59.FuzzTest_addLast(intQueue62, intQueue66, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue73 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue77 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        fuzzTest70.FuzzTest_addLast(intQueue73, intQueue77, (java.lang.Integer) 1);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue84 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue84, intArray83);
        fuzzTest59.FuzzTest_addLast(intQueue77, intQueue84, (java.lang.Integer) 1);
        fuzzTest33.FuzzTest_addLast(intQueue58, intQueue84, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue31, intQueue84, (java.lang.Integer) 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue3 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue7 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_addLast(intQueue3, intQueue7, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue19 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_addLast(intQueue15, intQueue19, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_addLast(intQueue11, intQueue19, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue29 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue33 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzzTest26.FuzzTest_addLast(intQueue29, intQueue33, (java.lang.Integer) 1);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue42 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue47 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue51 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        fuzzTest44.FuzzTest_addLast(intQueue47, intQueue51, (java.lang.Integer) 1);
        fuzzTest26.FuzzTest_addLast(intQueue42, intQueue47, (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_addLast(intQueue25, intQueue47, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue62 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue66 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        fuzzTest59.FuzzTest_addLast(intQueue62, intQueue66, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue73 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue77 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        fuzzTest70.FuzzTest_addLast(intQueue73, intQueue77, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue66, intQueue73, (java.lang.Integer) 100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 0, 100, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue6 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue8 = null;
        fuzzTest0.FuzzTest_addLast(intQueue6, intQueue8, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue18 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        fuzzTest11.FuzzTest_addLast(intQueue14, intQueue18, (java.lang.Integer) 1);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue27 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue27, intArray26);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue32 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue36 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        fuzzTest29.FuzzTest_addLast(intQueue32, intQueue36, (java.lang.Integer) 1);
        fuzzTest11.FuzzTest_addLast(intQueue27, intQueue32, (java.lang.Integer) 10);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, (-1), 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue46 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue46, intArray45);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue51 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue55 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        fuzzTest48.FuzzTest_addLast(intQueue51, intQueue55, (java.lang.Integer) 1);
        fuzzTest11.FuzzTest_addLast(intQueue46, intQueue51, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue64 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue68 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        fuzzTest61.FuzzTest_addLast(intQueue64, intQueue68, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue72 = null;
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue75 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        fuzzTest61.FuzzTest_addLast(intQueue72, intQueue75, (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue46, intQueue75, (java.lang.Integer) (-1));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue4 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzzTest1.FuzzTest_addLast(intQueue4, intQueue8, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue19 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_addLast(intQueue15, intQueue19, (java.lang.Integer) 1);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue26 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        fuzzTest1.FuzzTest_addLast(intQueue19, intQueue26, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue33 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue37 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest30.FuzzTest_addLast(intQueue33, intQueue37, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue41 = null;
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue45 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue49 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        fuzzTest42.FuzzTest_addLast(intQueue45, intQueue49, (java.lang.Integer) 1);
        fuzzTest30.FuzzTest_addLast(intQueue41, intQueue49, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue58 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue62 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue62, intArray61);
        fuzzTest55.FuzzTest_addLast(intQueue58, intQueue62, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue69 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue73 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzzTest66.FuzzTest_addLast(intQueue69, intQueue73, (java.lang.Integer) 1);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue80 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        fuzzTest55.FuzzTest_addLast(intQueue73, intQueue80, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest84 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue87 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue87, intArray86);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue91 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue91, intArray90);
        fuzzTest84.FuzzTest_addLast(intQueue87, intQueue91, (java.lang.Integer) 1);
        fuzzTest30.FuzzTest_addLast(intQueue80, intQueue87, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue26, intQueue87, (java.lang.Integer) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue3 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue7 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_addLast(intQueue3, intQueue7, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue19 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_addLast(intQueue15, intQueue19, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_addLast(intQueue11, intQueue19, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue28 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue32 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        fuzzTest25.FuzzTest_addLast(intQueue28, intQueue32, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue39 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue43 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzzTest36.FuzzTest_addLast(intQueue39, intQueue43, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest47 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue50 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue54 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        fuzzTest47.FuzzTest_addLast(intQueue50, intQueue54, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue61 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue65 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        fuzzTest58.FuzzTest_addLast(intQueue61, intQueue65, (java.lang.Integer) 1);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue72 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzzTest47.FuzzTest_addLast(intQueue65, intQueue72, (java.lang.Integer) 1);
        fuzzTest25.FuzzTest_addLast(intQueue39, intQueue72, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue81 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue85 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        fuzzTest78.FuzzTest_addLast(intQueue81, intQueue85, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue39, intQueue81, (java.lang.Integer) 100);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue3 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue7 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_addLast(intQueue3, intQueue7, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue11 = null;
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue19 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_addLast(intQueue15, intQueue19, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_addLast(intQueue11, intQueue19, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue28 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue32 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        fuzzTest25.FuzzTest_addLast(intQueue28, intQueue32, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue39 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue43 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzzTest36.FuzzTest_addLast(intQueue39, intQueue43, (java.lang.Integer) 1);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue50 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        fuzzTest25.FuzzTest_addLast(intQueue43, intQueue50, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue54 = null;
        fuzzTest0.FuzzTest_addLast(intQueue50, intQueue54, (java.lang.Integer) (-1));
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue59 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue61 = null;
        fuzzTest0.FuzzTest_addLast(intQueue59, intQueue61, (java.lang.Integer) 0);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue64 = null;
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue65 = null;
        fuzzTest0.FuzzTest_addLast(intQueue64, intQueue65, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue69 = null;
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue73 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue77 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        fuzzTest70.FuzzTest_addLast(intQueue73, intQueue77, (java.lang.Integer) 1);
        fuzzTest68.FuzzTest_addLast(intQueue69, intQueue77, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest83 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 0, 0, 100, 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue89 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue89, intArray88);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue91 = null;
        fuzzTest83.FuzzTest_addLast(intQueue89, intQueue91, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue77, intQueue89, (java.lang.Integer) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue3 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue7 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzzTest0.FuzzTest_addLast(intQueue3, intQueue7, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue14 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue14, intArray13);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue18 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue18, intArray17);
        fuzzTest11.FuzzTest_addLast(intQueue14, intQueue18, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest22 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue25 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue29 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        fuzzTest22.FuzzTest_addLast(intQueue25, intQueue29, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue36 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue40 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzzTest33.FuzzTest_addLast(intQueue36, intQueue40, (java.lang.Integer) 1);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue47 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest22.FuzzTest_addLast(intQueue40, intQueue47, (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_addLast(intQueue14, intQueue47, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue53 = null;
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue54 = null;
        fuzzTest0.FuzzTest_addLast(intQueue53, intQueue54, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue60 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue64 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        fuzzTest57.FuzzTest_addLast(intQueue60, intQueue64, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue71 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue75 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        fuzzTest68.FuzzTest_addLast(intQueue71, intQueue75, (java.lang.Integer) 1);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue82 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        fuzzTest57.FuzzTest_addLast(intQueue75, intQueue82, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest86 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue89 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue89, intArray88);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue93 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue93, intArray92);
        fuzzTest86.FuzzTest_addLast(intQueue89, intQueue93, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue82, intQueue89, (java.lang.Integer) 100);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue4 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzzTest1.FuzzTest_addLast(intQueue4, intQueue8, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue15 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue19 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest12.FuzzTest_addLast(intQueue15, intQueue19, (java.lang.Integer) 1);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue25 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue30 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue34 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzzTest27.FuzzTest_addLast(intQueue30, intQueue34, (java.lang.Integer) 1);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue43 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue48 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue52 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        fuzzTest45.FuzzTest_addLast(intQueue48, intQueue52, (java.lang.Integer) 1);
        fuzzTest27.FuzzTest_addLast(intQueue43, intQueue48, (java.lang.Integer) 10);
        fuzzTest12.FuzzTest_addLast(intQueue25, intQueue43, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue4, intQueue43, (java.lang.Integer) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue1 = null;
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_addLast(intQueue1, intQueue2, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue8 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue12 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        fuzzTest5.FuzzTest_addLast(intQueue8, intQueue12, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue16 = null;
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { (-1) };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue19 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest5.FuzzTest_addLast(intQueue16, intQueue19, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue26 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue30 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue30, intArray29);
        fuzzTest23.FuzzTest_addLast(intQueue26, intQueue30, (java.lang.Integer) 1);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, (-1), (-1), 1 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue39 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue44 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue48 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        fuzzTest41.FuzzTest_addLast(intQueue44, intQueue48, (java.lang.Integer) 1);
        fuzzTest23.FuzzTest_addLast(intQueue39, intQueue44, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue57 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue61 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        fuzzTest54.FuzzTest_addLast(intQueue57, intQueue61, (java.lang.Integer) 1);
        fuzzTest5.FuzzTest_addLast(intQueue44, intQueue57, (java.lang.Integer) 0);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue67 = null;
        fuzzTest0.FuzzTest_addLast(intQueue57, intQueue67, (java.lang.Integer) 1);
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue70 = null;
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue71 = null;
        fuzzTest0.FuzzTest_addLast(intQueue70, intQueue71, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue77 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue81 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        fuzzTest74.FuzzTest_addLast(intQueue77, intQueue81, (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest85 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue88 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue88, intArray87);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 10 };
        buggycodes.mut_018.ArrayDeque<java.lang.Integer> intQueue92 = new buggycodes.mut_018.ArrayDeque<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue92, intArray91);
        fuzzTest85.FuzzTest_addLast(intQueue88, intQueue92, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_addLast(intQueue77, intQueue92, (java.lang.Integer) 10);
    }
}

