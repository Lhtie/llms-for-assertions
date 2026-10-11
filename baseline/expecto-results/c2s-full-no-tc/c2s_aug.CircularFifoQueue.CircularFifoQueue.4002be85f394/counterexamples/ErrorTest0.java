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
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue7 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue3, intQueue7, (-1));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue3 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue7 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue3, intQueue7, 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue4 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue4, intArray3);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 10, (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue10 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue4, intQueue10, (int) (byte) 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 0, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue5 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue9 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue5, intQueue9, 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue10 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue6, intQueue10, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue21 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue29 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue33 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzzTest23.FuzzTest_CircularFifoQueue(intQueue29, intQueue33, (int) (short) 10);
        fuzzTest14.FuzzTest_CircularFifoQueue(intQueue21, intQueue33, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue45 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue49 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        fuzzTest39.FuzzTest_CircularFifoQueue(intQueue45, intQueue49, (int) (short) 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue53 = null;
        fuzzTest14.FuzzTest_CircularFifoQueue(intQueue45, intQueue53, 0);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue63 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue71 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue75 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        fuzzTest65.FuzzTest_CircularFifoQueue(intQueue71, intQueue75, (int) (short) 10);
        fuzzTest56.FuzzTest_CircularFifoQueue(intQueue63, intQueue75, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue45, intQueue75, (-1));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue7 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue15 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue19 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest9.FuzzTest_CircularFifoQueue(intQueue15, intQueue19, (int) (short) 10);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue7, intQueue19, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue31 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue35 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzzTest25.FuzzTest_CircularFifoQueue(intQueue31, intQueue35, (int) (short) 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue39 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue31, intQueue39, 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue48 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue52 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        fuzzTest42.FuzzTest_CircularFifoQueue(intQueue48, intQueue52, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue63 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue71 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue75 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        fuzzTest65.FuzzTest_CircularFifoQueue(intQueue71, intQueue75, (int) (short) 10);
        fuzzTest56.FuzzTest_CircularFifoQueue(intQueue63, intQueue75, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue52, intQueue75, 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue10 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue6, intQueue10, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue20 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue24 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        fuzzTest14.FuzzTest_CircularFifoQueue(intQueue20, intQueue24, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue35 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue43 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue47 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest37.FuzzTest_CircularFifoQueue(intQueue43, intQueue47, (int) (short) 10);
        fuzzTest28.FuzzTest_CircularFifoQueue(intQueue35, intQueue47, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue59 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue63 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzzTest53.FuzzTest_CircularFifoQueue(intQueue59, intQueue63, (int) (short) 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue67 = null;
        fuzzTest28.FuzzTest_CircularFifoQueue(intQueue59, intQueue67, 0);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue24, intQueue59, 10);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue78 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue78, intArray77);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue82 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        fuzzTest72.FuzzTest_CircularFifoQueue(intQueue78, intQueue82, (int) (short) 10);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { (-1), 0, (-1), 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue91 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue91, intArray90);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue78, intQueue91, (int) (byte) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue9 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue17 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue21 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzzTest11.FuzzTest_CircularFifoQueue(intQueue17, intQueue21, (int) (short) 10);
        fuzzTest2.FuzzTest_CircularFifoQueue(intQueue9, intQueue21, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue33 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue37 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest27.FuzzTest_CircularFifoQueue(intQueue33, intQueue37, (int) (short) 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue41 = null;
        fuzzTest2.FuzzTest_CircularFifoQueue(intQueue33, intQueue41, 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue51 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue59 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue63 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzzTest53.FuzzTest_CircularFifoQueue(intQueue59, intQueue63, (int) (short) 10);
        fuzzTest44.FuzzTest_CircularFifoQueue(intQueue51, intQueue63, (int) (byte) 100);
        fuzzTest1.FuzzTest_CircularFifoQueue(intQueue33, intQueue51, (int) (byte) 10);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue77 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue81 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        fuzzTest71.FuzzTest_CircularFifoQueue(intQueue77, intQueue81, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue33, intQueue77, 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue9 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue9, intArray8);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue17 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue21 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzzTest11.FuzzTest_CircularFifoQueue(intQueue17, intQueue21, (int) (short) 10);
        fuzzTest2.FuzzTest_CircularFifoQueue(intQueue9, intQueue21, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue33 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue37 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest27.FuzzTest_CircularFifoQueue(intQueue33, intQueue37, (int) (short) 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue41 = null;
        fuzzTest2.FuzzTest_CircularFifoQueue(intQueue33, intQueue41, 0);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue51 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue59 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue63 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        fuzzTest53.FuzzTest_CircularFifoQueue(intQueue59, intQueue63, (int) (short) 10);
        fuzzTest44.FuzzTest_CircularFifoQueue(intQueue51, intQueue63, (int) (byte) 100);
        fuzzTest1.FuzzTest_CircularFifoQueue(intQueue33, intQueue51, (int) (byte) 10);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue73 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue51, intQueue73, 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue8 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue16 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue20 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        fuzzTest10.FuzzTest_CircularFifoQueue(intQueue16, intQueue20, (int) (short) 10);
        fuzzTest1.FuzzTest_CircularFifoQueue(intQueue8, intQueue20, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue32 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue36 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        fuzzTest26.FuzzTest_CircularFifoQueue(intQueue32, intQueue36, (int) (short) 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue40 = null;
        fuzzTest1.FuzzTest_CircularFifoQueue(intQueue32, intQueue40, 0);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue49 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue53 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        fuzzTest43.FuzzTest_CircularFifoQueue(intQueue49, intQueue53, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue63 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue67 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        fuzzTest57.FuzzTest_CircularFifoQueue(intQueue63, intQueue67, (int) (short) 10);
        fuzzTest1.FuzzTest_CircularFifoQueue(intQueue49, intQueue63, (int) (short) 100);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue80 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue88 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue88, intArray87);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue92 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue92, intArray91);
        fuzzTest82.FuzzTest_CircularFifoQueue(intQueue88, intQueue92, (int) (short) 10);
        fuzzTest73.FuzzTest_CircularFifoQueue(intQueue80, intQueue92, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue49, intQueue80, 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue1, intQueue2, 1);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue8 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue17 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue25 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue29 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        fuzzTest19.FuzzTest_CircularFifoQueue(intQueue25, intQueue29, (int) (short) 10);
        fuzzTest10.FuzzTest_CircularFifoQueue(intQueue17, intQueue29, (int) (byte) 100);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue8, intQueue17, 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue37 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue38 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue37, intQueue38, (int) ' ');
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue43 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-1) };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue47 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue43, intQueue47, (-1));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue7 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue15 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue19 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest9.FuzzTest_CircularFifoQueue(intQueue15, intQueue19, (int) (short) 10);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue7, intQueue19, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue26 = null;
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue33 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue37 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest27.FuzzTest_CircularFifoQueue(intQueue33, intQueue37, (int) (short) 10);
        fuzzTest25.FuzzTest_CircularFifoQueue(intQueue26, intQueue37, (-1));
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue49 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue53 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        fuzzTest43.FuzzTest_CircularFifoQueue(intQueue49, intQueue53, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue37, intQueue49, (-1));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue1, intQueue2, 1);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue12 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue20 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue24 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        fuzzTest14.FuzzTest_CircularFifoQueue(intQueue20, intQueue24, (int) (short) 10);
        fuzzTest5.FuzzTest_CircularFifoQueue(intQueue12, intQueue24, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue36 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue40 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzzTest30.FuzzTest_CircularFifoQueue(intQueue36, intQueue40, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue24, intQueue36, (int) (short) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue8 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue12 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        fuzzTest2.FuzzTest_CircularFifoQueue(intQueue8, intQueue12, (int) (short) 10);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue1, intQueue12, (-1));
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, (-1), 1, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue23 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue23, intArray22);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue27 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue28 = null;
        fuzzTest26.FuzzTest_CircularFifoQueue(intQueue27, intQueue28, 1);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue34 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        fuzztests.FuzzTest fuzzTest36 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue43 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue51 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue55 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        fuzzTest45.FuzzTest_CircularFifoQueue(intQueue51, intQueue55, (int) (short) 10);
        fuzzTest36.FuzzTest_CircularFifoQueue(intQueue43, intQueue55, (int) (byte) 100);
        fuzzTest26.FuzzTest_CircularFifoQueue(intQueue34, intQueue43, 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue63 = null;
        fuzzTest25.FuzzTest_CircularFifoQueue(intQueue34, intQueue63, (int) (short) 0);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10, 100, (-1), 0, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue72 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue74 = null;
        fuzzTest25.FuzzTest_CircularFifoQueue(intQueue72, intQueue74, 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue23, intQueue72, 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue8 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue12 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        fuzzTest2.FuzzTest_CircularFifoQueue(intQueue8, intQueue12, (int) (short) 10);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue1, intQueue12, (-1));
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue26 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue26, intArray25);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue34 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue38 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        fuzzTest28.FuzzTest_CircularFifoQueue(intQueue34, intQueue38, (int) (short) 10);
        fuzzTest19.FuzzTest_CircularFifoQueue(intQueue26, intQueue38, (int) (byte) 100);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue44 = null;
        fuzzTest18.FuzzTest_CircularFifoQueue(intQueue38, intQueue44, 0);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, 1, 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue51 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue38, intQueue51, (int) (short) -1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue10 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue6, intQueue10, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue15 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue16 = null;
        fuzzTest14.FuzzTest_CircularFifoQueue(intQueue15, intQueue16, 1);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue22 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue22, intArray21);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue31 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue39 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue39, intArray38);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue43 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        fuzzTest33.FuzzTest_CircularFifoQueue(intQueue39, intQueue43, (int) (short) 10);
        fuzzTest24.FuzzTest_CircularFifoQueue(intQueue31, intQueue43, (int) (byte) 100);
        fuzzTest14.FuzzTest_CircularFifoQueue(intQueue22, intQueue31, 10);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue57 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue61 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        fuzzTest51.FuzzTest_CircularFifoQueue(intQueue57, intQueue61, (int) (short) 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue65 = null;
        fuzzTest14.FuzzTest_CircularFifoQueue(intQueue57, intQueue65, (int) (short) -1);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { (-1), 0, 0, 1, 1 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue74 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue74, intArray73);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue82 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue82, intArray81);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue86 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue86, intArray85);
        fuzzTest76.FuzzTest_CircularFifoQueue(intQueue82, intQueue86, (int) (short) 10);
        fuzzTest14.FuzzTest_CircularFifoQueue(intQueue74, intQueue86, (int) ' ');
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 1 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue94 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue94, intArray93);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue74, intQueue94, 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue10 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue10, intArray9);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue6, intQueue10, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue21 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue21, intArray20);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue29 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue33 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzzTest23.FuzzTest_CircularFifoQueue(intQueue29, intQueue33, (int) (short) 10);
        fuzzTest14.FuzzTest_CircularFifoQueue(intQueue21, intQueue33, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue45 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue49 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        fuzzTest39.FuzzTest_CircularFifoQueue(intQueue45, intQueue49, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue60 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue60, intArray59);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue68 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue72 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzzTest62.FuzzTest_CircularFifoQueue(intQueue68, intQueue72, (int) (short) 10);
        fuzzTest53.FuzzTest_CircularFifoQueue(intQueue60, intQueue72, (int) (byte) 100);
        fuzzTest14.FuzzTest_CircularFifoQueue(intQueue49, intQueue60, (int) (short) 1);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1), 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue83 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue49, intQueue83, 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue7 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue15 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue19 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest9.FuzzTest_CircularFifoQueue(intQueue15, intQueue19, (int) (short) 10);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue7, intQueue19, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue31 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue35 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzzTest25.FuzzTest_CircularFifoQueue(intQueue31, intQueue35, (int) (short) 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue39 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue31, intQueue39, 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue48 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue52 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue52, intArray51);
        fuzzTest42.FuzzTest_CircularFifoQueue(intQueue48, intQueue52, (int) (short) 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue56 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue52, intQueue56, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue65 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue69 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        fuzzTest59.FuzzTest_CircularFifoQueue(intQueue65, intQueue69, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue80 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue88 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue88, intArray87);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue92 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue92, intArray91);
        fuzzTest82.FuzzTest_CircularFifoQueue(intQueue88, intQueue92, (int) (short) 10);
        fuzzTest73.FuzzTest_CircularFifoQueue(intQueue80, intQueue92, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue65, intQueue92, (int) (short) 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue7 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue15 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue19 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest9.FuzzTest_CircularFifoQueue(intQueue15, intQueue19, (int) (short) 10);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue7, intQueue19, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue31 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue35 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzzTest25.FuzzTest_CircularFifoQueue(intQueue31, intQueue35, (int) (short) 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue39 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue31, intQueue39, 0);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue43 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue44 = null;
        fuzzTest42.FuzzTest_CircularFifoQueue(intQueue43, intQueue44, 1);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue47 = null;
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue54 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue58 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue58, intArray57);
        fuzzTest48.FuzzTest_CircularFifoQueue(intQueue54, intQueue58, (int) (short) 10);
        fuzzTest42.FuzzTest_CircularFifoQueue(intQueue47, intQueue58, 0);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue71 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue79 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue83 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        fuzzTest73.FuzzTest_CircularFifoQueue(intQueue79, intQueue83, (int) (short) 10);
        fuzzTest64.FuzzTest_CircularFifoQueue(intQueue71, intQueue83, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue58, intQueue71, (int) (byte) 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue7 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue15 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue19 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest9.FuzzTest_CircularFifoQueue(intQueue15, intQueue19, (int) (short) 10);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue7, intQueue19, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue26 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue27 = null;
        fuzzTest25.FuzzTest_CircularFifoQueue(intQueue26, intQueue27, 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue33 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue42 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue42, intArray41);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue50 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue50, intArray49);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue54 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue54, intArray53);
        fuzzTest44.FuzzTest_CircularFifoQueue(intQueue50, intQueue54, (int) (short) 10);
        fuzzTest35.FuzzTest_CircularFifoQueue(intQueue42, intQueue54, (int) (byte) 100);
        fuzzTest25.FuzzTest_CircularFifoQueue(intQueue33, intQueue42, 10);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue69 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue69, intArray68);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue77 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue81 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        fuzzTest71.FuzzTest_CircularFifoQueue(intQueue77, intQueue81, (int) (short) 10);
        fuzzTest62.FuzzTest_CircularFifoQueue(intQueue69, intQueue81, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue33, intQueue81, (-1));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue1, intQueue2, (int) (byte) 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue5 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue5, intQueue6, 0);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue15 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue19 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzzTest9.FuzzTest_CircularFifoQueue(intQueue15, intQueue19, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest23 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue24 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue25 = null;
        fuzzTest23.FuzzTest_CircularFifoQueue(intQueue24, intQueue25, (-1));
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue35 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue35, intArray34);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue43 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue47 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest37.FuzzTest_CircularFifoQueue(intQueue43, intQueue47, (int) (short) 10);
        fuzzTest28.FuzzTest_CircularFifoQueue(intQueue35, intQueue47, (int) (byte) 100);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue53 = null;
        fuzzTest23.FuzzTest_CircularFifoQueue(intQueue35, intQueue53, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue19, intQueue35, (int) (short) 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue1, intQueue2, 1);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue8 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue17 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue25 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue29 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        fuzzTest19.FuzzTest_CircularFifoQueue(intQueue25, intQueue29, (int) (short) 10);
        fuzzTest10.FuzzTest_CircularFifoQueue(intQueue17, intQueue29, (int) (byte) 100);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue8, intQueue17, 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue37 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue38 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue37, intQueue38, 0);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue47 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue51 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue51, intArray50);
        fuzzTest41.FuzzTest_CircularFifoQueue(intQueue47, intQueue51, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue56 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue57 = null;
        fuzzTest55.FuzzTest_CircularFifoQueue(intQueue56, intQueue57, 1);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue60 = null;
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue67 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue67, intArray66);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue71 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        fuzzTest61.FuzzTest_CircularFifoQueue(intQueue67, intQueue71, (int) (short) 10);
        fuzzTest55.FuzzTest_CircularFifoQueue(intQueue60, intQueue71, 0);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue78 = null;
        fuzztests.FuzzTest fuzzTest79 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue85 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue89 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue89, intArray88);
        fuzzTest79.FuzzTest_CircularFifoQueue(intQueue85, intQueue89, (int) (short) 10);
        fuzzTest77.FuzzTest_CircularFifoQueue(intQueue78, intQueue89, (-1));
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue95 = null;
        fuzzTest55.FuzzTest_CircularFifoQueue(intQueue89, intQueue95, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue47, intQueue89, (int) (byte) 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue1, intQueue2, (-1));
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue6 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue7 = null;
        fuzzTest5.FuzzTest_CircularFifoQueue(intQueue6, intQueue7, (-1));
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue12 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue13 = null;
        fuzzTest11.FuzzTest_CircularFifoQueue(intQueue12, intQueue13, 1);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue19 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue19, intArray18);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue28 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue28, intArray27);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue36 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue40 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue40, intArray39);
        fuzzTest30.FuzzTest_CircularFifoQueue(intQueue36, intQueue40, (int) (short) 10);
        fuzzTest21.FuzzTest_CircularFifoQueue(intQueue28, intQueue40, (int) (byte) 100);
        fuzzTest11.FuzzTest_CircularFifoQueue(intQueue19, intQueue28, 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue48 = null;
        fuzzTest10.FuzzTest_CircularFifoQueue(intQueue28, intQueue48, (int) 'a');
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue51 = null;
        fuzzTest5.FuzzTest_CircularFifoQueue(intQueue28, intQueue51, 100);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue55 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue56 = null;
        fuzzTest54.FuzzTest_CircularFifoQueue(intQueue55, intQueue56, 1);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue59 = null;
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue66 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue66, intArray65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue70 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue70, intArray69);
        fuzzTest60.FuzzTest_CircularFifoQueue(intQueue66, intQueue70, (int) (short) 10);
        fuzzTest54.FuzzTest_CircularFifoQueue(intQueue59, intQueue70, 0);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue77 = null;
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue84 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue84, intArray83);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue88 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue88, intArray87);
        fuzzTest78.FuzzTest_CircularFifoQueue(intQueue84, intQueue88, (int) (short) 10);
        fuzzTest76.FuzzTest_CircularFifoQueue(intQueue77, intQueue88, (-1));
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue94 = null;
        fuzzTest54.FuzzTest_CircularFifoQueue(intQueue88, intQueue94, 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue28, intQueue88, (-1));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue1, intQueue2, 1);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue8 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue17 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue17, intArray16);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue25 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue29 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue29, intArray28);
        fuzzTest19.FuzzTest_CircularFifoQueue(intQueue25, intQueue29, (int) (short) 10);
        fuzzTest10.FuzzTest_CircularFifoQueue(intQueue17, intQueue29, (int) (byte) 100);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue8, intQueue17, 10);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue43 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue47 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzzTest37.FuzzTest_CircularFifoQueue(intQueue43, intQueue47, (int) (short) 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue51 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue43, intQueue51, (int) (short) -1);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue54 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue55 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue54, intQueue55, 0);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 0, 0, 0, 100, 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue64 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue64, intArray63);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue73 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue73, intArray72);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue81 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue81, intArray80);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue85 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue85, intArray84);
        fuzzTest75.FuzzTest_CircularFifoQueue(intQueue81, intQueue85, (int) (short) 10);
        fuzzTest66.FuzzTest_CircularFifoQueue(intQueue73, intQueue85, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue64, intQueue73, (int) (byte) 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue1, intQueue2, (-1));
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue12 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        fuzztests.FuzzTest fuzzTest14 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue20 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue24 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue24, intArray23);
        fuzzTest14.FuzzTest_CircularFifoQueue(intQueue20, intQueue24, (int) (short) 10);
        fuzzTest5.FuzzTest_CircularFifoQueue(intQueue12, intQueue24, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue37 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue45 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue49 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        fuzzTest39.FuzzTest_CircularFifoQueue(intQueue45, intQueue49, (int) (short) 10);
        fuzzTest30.FuzzTest_CircularFifoQueue(intQueue37, intQueue49, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue61 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue65 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue65, intArray64);
        fuzzTest55.FuzzTest_CircularFifoQueue(intQueue61, intQueue65, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue76 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue76, intArray75);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue84 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue84, intArray83);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue88 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue88, intArray87);
        fuzzTest78.FuzzTest_CircularFifoQueue(intQueue84, intQueue88, (int) (short) 10);
        fuzzTest69.FuzzTest_CircularFifoQueue(intQueue76, intQueue88, (int) (byte) 100);
        fuzzTest30.FuzzTest_CircularFifoQueue(intQueue65, intQueue76, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue24, intQueue76, 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue8 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue12 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue12, intArray11);
        fuzzTest2.FuzzTest_CircularFifoQueue(intQueue8, intQueue12, (int) (short) 10);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue1, intQueue12, (-1));
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue25 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue25, intArray24);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue33 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue37 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue37, intArray36);
        fuzzTest27.FuzzTest_CircularFifoQueue(intQueue33, intQueue37, (int) (short) 10);
        fuzzTest18.FuzzTest_CircularFifoQueue(intQueue25, intQueue37, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue49 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue49, intArray48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue53 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue53, intArray52);
        fuzzTest43.FuzzTest_CircularFifoQueue(intQueue49, intQueue53, (int) (short) 10);
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue25, intQueue49, (int) (byte) 100);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue59 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue60 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue59, intQueue60, (int) (byte) 0);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue71 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue71, intArray70);
        fuzztests.FuzzTest fuzzTest73 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue79 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue79, intArray78);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue83 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue83, intArray82);
        fuzzTest73.FuzzTest_CircularFifoQueue(intQueue79, intQueue83, (int) (short) 10);
        fuzzTest64.FuzzTest_CircularFifoQueue(intQueue71, intQueue83, (int) (byte) 100);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue89 = null;
        fuzzTest63.FuzzTest_CircularFifoQueue(intQueue83, intQueue89, 0);
        java.lang.Integer[] intArray95 = new java.lang.Integer[] { 1, (-1), 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue96 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean97 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue96, intArray95);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue83, intQueue96, 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue8 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue8, intArray7);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue16 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue20 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue20, intArray19);
        fuzzTest10.FuzzTest_CircularFifoQueue(intQueue16, intQueue20, (int) (short) 10);
        fuzzTest1.FuzzTest_CircularFifoQueue(intQueue8, intQueue20, (int) (byte) 100);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue26 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue20, intQueue26, 0);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue31 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue32 = null;
        fuzzTest30.FuzzTest_CircularFifoQueue(intQueue31, intQueue32, 1);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 0, 10 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue38 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue38, intArray37);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue47 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue47, intArray46);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue55 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue59 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue59, intArray58);
        fuzzTest49.FuzzTest_CircularFifoQueue(intQueue55, intQueue59, (int) (short) 10);
        fuzzTest40.FuzzTest_CircularFifoQueue(intQueue47, intQueue59, (int) (byte) 100);
        fuzzTest30.FuzzTest_CircularFifoQueue(intQueue38, intQueue47, 10);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue67 = null;
        fuzzTest29.FuzzTest_CircularFifoQueue(intQueue38, intQueue67, (int) (short) 0);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { (-1), 100, (-1), 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue75 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue75, intArray74);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue38, intQueue75, (int) (byte) 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue1 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue2 = null;
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue1, intQueue2, (int) (short) 1);
        fuzztests.FuzzTest fuzzTest5 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue11 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue11, intArray10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue15 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue15, intArray14);
        fuzzTest5.FuzzTest_CircularFifoQueue(intQueue11, intQueue15, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue20 = null;
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue21 = null;
        fuzzTest19.FuzzTest_CircularFifoQueue(intQueue20, intQueue21, 1);
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue33 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue33, intArray32);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue41 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue45 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue45, intArray44);
        fuzzTest35.FuzzTest_CircularFifoQueue(intQueue41, intQueue45, (int) (short) 10);
        fuzzTest26.FuzzTest_CircularFifoQueue(intQueue33, intQueue45, (int) (byte) 100);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue57 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue57, intArray56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue61 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue61, intArray60);
        fuzzTest51.FuzzTest_CircularFifoQueue(intQueue57, intQueue61, (int) (short) 10);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { (-1), (-1), 0, 100, 100 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue72 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue72, intArray71);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1), 10, 100, 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue80 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue80, intArray79);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 0 };
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue84 = new c2s_aug.CircularFifoQueue<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intQueue84, intArray83);
        fuzzTest74.FuzzTest_CircularFifoQueue(intQueue80, intQueue84, (int) (short) 10);
        fuzzTest65.FuzzTest_CircularFifoQueue(intQueue72, intQueue84, (int) (byte) 100);
        fuzzTest26.FuzzTest_CircularFifoQueue(intQueue61, intQueue72, (int) (short) 1);
        fuzzTest24.FuzzTest_CircularFifoQueue(intQueue25, intQueue61, (int) (byte) -1);
        c2s_aug.CircularFifoQueue<java.lang.Integer> intQueue94 = null;
        fuzzTest19.FuzzTest_CircularFifoQueue(intQueue61, intQueue94, 100);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_CircularFifoQueue(intQueue15, intQueue61, (int) (byte) -1);
    }
}

