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
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList3 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList7 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList15 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList19 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_remove(intList15, intList19, (-1), (java.lang.Integer) 1);
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList24 = null;
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList28 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList32 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        fuzzTest25.FuzzTest_remove(intList28, intList32, (-1), (java.lang.Integer) 1);
        fuzzTest12.FuzzTest_remove(intList24, intList32, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList43 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList47 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest40.FuzzTest_remove(intList43, intList47, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest52 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList55 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList59 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        fuzzTest52.FuzzTest_remove(intList55, intList59, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList67 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest40.FuzzTest_remove(intList59, intList67, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList32, intList59, 0, (java.lang.Integer) 100);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList3 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList7 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 0, 0 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList16 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList21 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList25 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_remove(intList21, intList25, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList33 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList37 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_remove(intList33, intList37, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList45 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest18.FuzzTest_remove(intList37, intList45, (int) '4', (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_remove(intList16, intList45, (int) (byte) -1, (java.lang.Integer) 100);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList56 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList61 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList65 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_remove(intList61, intList65, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList73 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList77 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        fuzzTest70.FuzzTest_remove(intList73, intList77, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList85 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest58.FuzzTest_remove(intList77, intList85, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList56, intList77, (int) (short) 0, (java.lang.Integer) 10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList5 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList9 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_remove(intList5, intList9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList1, intList5, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList20 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList24 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        fuzzTest17.FuzzTest_remove(intList20, intList24, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList32 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList36 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        fuzzTest29.FuzzTest_remove(intList32, intList36, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList44 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzzTest17.FuzzTest_remove(intList36, intList44, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList52 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList56 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest49.FuzzTest_remove(intList52, intList56, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList64 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList68 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_remove(intList64, intList68, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList76 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        fuzzTest49.FuzzTest_remove(intList68, intList76, (int) '4', (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList36, intList68, (int) (byte) 10, (java.lang.Integer) 10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList3 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList7 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 0, 0 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList16 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList21 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList25 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_remove(intList21, intList25, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList33 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList37 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_remove(intList33, intList37, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList45 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest18.FuzzTest_remove(intList37, intList45, (int) '4', (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_remove(intList16, intList45, (int) (byte) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList56 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList60 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_remove(intList56, intList60, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList68 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList72 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_remove(intList68, intList72, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList80 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        fuzzTest53.FuzzTest_remove(intList72, intList80, (int) '4', (java.lang.Integer) 10);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList88 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList80, intList88, (int) (byte) -1, (java.lang.Integer) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList3 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList7 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 0, 0 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList16 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList21 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList25 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_remove(intList21, intList25, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList33 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList37 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_remove(intList33, intList37, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList45 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest18.FuzzTest_remove(intList37, intList45, (int) '4', (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_remove(intList16, intList45, (int) (byte) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList56 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList60 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzzTest53.FuzzTest_remove(intList56, intList60, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList68 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList72 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        fuzzTest65.FuzzTest_remove(intList68, intList72, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList56, intList68, (int) (short) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList4 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList8 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_remove(intList4, intList8, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1), (-1), 0, 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList19 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList24 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList28 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        fuzzTest21.FuzzTest_remove(intList24, intList28, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList36 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList40 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzzTest33.FuzzTest_remove(intList36, intList40, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList48 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest21.FuzzTest_remove(intList40, intList48, (int) '4', (java.lang.Integer) 10);
        fuzzTest1.FuzzTest_remove(intList19, intList48, (int) '4', (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList59 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList63 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_remove(intList59, intList63, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList19, intList59, (int) (short) -1, (java.lang.Integer) 100);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList3 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList7 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, (-1), (-1), 0, 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList18 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList23 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList27 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest20.FuzzTest_remove(intList23, intList27, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList35 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList39 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_remove(intList35, intList39, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList47 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        fuzzTest20.FuzzTest_remove(intList39, intList47, (int) '4', (java.lang.Integer) 10);
        fuzzTest0.FuzzTest_remove(intList18, intList47, (int) '4', (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList59 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList63 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        fuzzTest56.FuzzTest_remove(intList59, intList63, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList71 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList75 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        fuzzTest68.FuzzTest_remove(intList71, intList75, (-1), (java.lang.Integer) 1);
        fuzzTest55.FuzzTest_remove(intList59, intList75, 0, (java.lang.Integer) 100);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 1, 100, 10, 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList88 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList75, intList88, 100, (java.lang.Integer) 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList5 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList9 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_remove(intList5, intList9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList1, intList5, 10, (java.lang.Integer) (-1));
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList17 = null;
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList18 = null;
        fuzzTest0.FuzzTest_remove(intList17, intList18, (int) 'a', (java.lang.Integer) 1);
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList22 = null;
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList23 = null;
        fuzzTest0.FuzzTest_remove(intList22, intList23, (int) (short) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList31 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList35 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        fuzzTest28.FuzzTest_remove(intList31, intList35, (-1), (java.lang.Integer) 1);
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList40 = null;
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList44 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList48 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        fuzzTest41.FuzzTest_remove(intList44, intList48, (-1), (java.lang.Integer) 1);
        fuzzTest28.FuzzTest_remove(intList40, intList48, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList61 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList65 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_remove(intList61, intList65, (-1), (java.lang.Integer) 1);
        fuzzTest56.FuzzTest_remove(intList57, intList61, 10, (java.lang.Integer) (-1));
        fuzzTest27.FuzzTest_remove(intList48, intList57, (int) (byte) 100, (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList79 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList83 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        fuzzTest76.FuzzTest_remove(intList79, intList83, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList48, intList83, 1, (java.lang.Integer) 10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList3 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList7 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList15 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList19 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_remove(intList15, intList19, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList27 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_remove(intList19, intList27, (int) '4', (java.lang.Integer) 10);
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList32 = null;
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList33 = null;
        fuzzTest0.FuzzTest_remove(intList32, intList33, (int) (byte) 100, (java.lang.Integer) 10);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList40 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList45 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList49 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        fuzzTest42.FuzzTest_remove(intList45, intList49, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, (-1), (-1), 0, 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList60 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList65 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList69 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        fuzzTest62.FuzzTest_remove(intList65, intList69, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList77 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList81 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        fuzzTest74.FuzzTest_remove(intList77, intList81, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList89 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        fuzzTest62.FuzzTest_remove(intList81, intList89, (int) '4', (java.lang.Integer) 10);
        fuzzTest42.FuzzTest_remove(intList60, intList89, (int) '4', (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList40, intList60, (int) (byte) 0, (java.lang.Integer) (-1));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList1 = null;
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList2 = null;
        fuzzTest0.FuzzTest_remove(intList1, intList2, 1, (java.lang.Integer) 0);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10, 100, 1, 1 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList11 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList16 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList20 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10, 0, 0 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList29 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList34 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList38 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        fuzzTest31.FuzzTest_remove(intList34, intList38, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList46 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList50 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        fuzzTest43.FuzzTest_remove(intList46, intList50, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList58 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        fuzzTest31.FuzzTest_remove(intList50, intList58, (int) '4', (java.lang.Integer) 10);
        fuzzTest13.FuzzTest_remove(intList29, intList58, (int) (byte) -1, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList69 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList73 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        fuzzTest66.FuzzTest_remove(intList69, intList73, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest78 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList81 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList85 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        fuzzTest78.FuzzTest_remove(intList81, intList85, (-1), (java.lang.Integer) 1);
        fuzzTest13.FuzzTest_remove(intList73, intList81, (int) '4', (java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList11, intList73, (int) (short) 10, (java.lang.Integer) 10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList2 = null;
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList6 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList10 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        fuzzTest3.FuzzTest_remove(intList6, intList10, (-1), (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_remove(intList2, intList6, 10, (java.lang.Integer) (-1));
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList18 = null;
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList19 = null;
        fuzzTest1.FuzzTest_remove(intList18, intList19, (int) 'a', (java.lang.Integer) 1);
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList23 = null;
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList27 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList31 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzzTest24.FuzzTest_remove(intList27, intList31, (-1), (java.lang.Integer) 1);
        fuzzTest1.FuzzTest_remove(intList23, intList27, (int) ' ', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList42 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList46 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        fuzzTest39.FuzzTest_remove(intList42, intList46, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 100, 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList56 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        fuzzTest1.FuzzTest_remove(intList42, intList56, (int) '#', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList64 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList68 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        fuzzTest61.FuzzTest_remove(intList64, intList68, (-1), (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList42, intList64, 10, (java.lang.Integer) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList3 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList7 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList12 = null;
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList16 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList20 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList12, intList20, (int) 'a', (java.lang.Integer) 0);
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList28 = null;
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 0, 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList33 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest0.FuzzTest_remove(intList28, intList33, (int) (short) 100, (java.lang.Integer) 10);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 10, 1, 100, (-1), (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList44 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList47 = null;
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList51 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList55 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        fuzzTest48.FuzzTest_remove(intList51, intList55, (-1), (java.lang.Integer) 1);
        fuzzTest46.FuzzTest_remove(intList47, intList51, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList66 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList70 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest63.FuzzTest_remove(intList66, intList70, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest75 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList78 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList82 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList82, intArray81);
        fuzzTest75.FuzzTest_remove(intList78, intList82, (-1), (java.lang.Integer) 1);
        fuzzTest46.FuzzTest_remove(intList70, intList78, (int) (short) 1, (java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList44, intList70, (int) (byte) 1, (java.lang.Integer) 10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList4 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList8 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        fuzzTest1.FuzzTest_remove(intList4, intList8, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest13 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList16 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList20 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        fuzzTest13.FuzzTest_remove(intList16, intList20, (-1), (java.lang.Integer) 1);
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList25 = null;
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList29 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList33 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        fuzzTest26.FuzzTest_remove(intList29, intList33, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList41 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList45 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        fuzzTest38.FuzzTest_remove(intList41, intList45, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList53 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        fuzzTest26.FuzzTest_remove(intList45, intList53, (int) '4', (java.lang.Integer) 10);
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList58 = null;
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList59 = null;
        fuzzTest26.FuzzTest_remove(intList58, intList59, (int) (byte) 100, (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList66 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList70 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        fuzzTest63.FuzzTest_remove(intList66, intList70, (-1), (java.lang.Integer) 1);
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList75 = null;
        fuzzTest26.FuzzTest_remove(intList70, intList75, (int) (short) 0, (java.lang.Integer) (-1));
        fuzzTest13.FuzzTest_remove(intList25, intList70, 1, (java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList8, intList70, 0, (java.lang.Integer) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList3 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList7 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzzTest0.FuzzTest_remove(intList3, intList7, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest12 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList15 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList19 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        fuzzTest12.FuzzTest_remove(intList15, intList19, (-1), (java.lang.Integer) 1);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, (-1) };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList27 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        fuzzTest0.FuzzTest_remove(intList19, intList27, (int) '4', (java.lang.Integer) 10);
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList35 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList39 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        fuzzTest32.FuzzTest_remove(intList35, intList39, (-1), (java.lang.Integer) 1);
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList44 = null;
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList48 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList52 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_remove(intList48, intList52, (-1), (java.lang.Integer) 1);
        fuzzTest32.FuzzTest_remove(intList44, intList52, (int) 'a', (java.lang.Integer) 0);
        fuzztests.FuzzTest fuzzTest60 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList63 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList67 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        fuzzTest60.FuzzTest_remove(intList63, intList67, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList75 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList79 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        fuzzTest72.FuzzTest_remove(intList75, intList79, (-1), (java.lang.Integer) 1);
        fuzzTest32.FuzzTest_remove(intList63, intList75, (int) (short) 1, (java.lang.Integer) 0);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 10, 100, 0 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList91 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList75, intList91, (int) (short) 100, (java.lang.Integer) 100);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList5 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList9 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        fuzzTest2.FuzzTest_remove(intList5, intList9, (-1), (java.lang.Integer) 1);
        fuzzTest0.FuzzTest_remove(intList1, intList5, 10, (java.lang.Integer) (-1));
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList21 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList25 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        fuzzTest18.FuzzTest_remove(intList21, intList25, (-1), (java.lang.Integer) 1);
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList33 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList37 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        fuzzTest30.FuzzTest_remove(intList33, intList37, (-1), (java.lang.Integer) 1);
        fuzzTest17.FuzzTest_remove(intList21, intList37, 0, (java.lang.Integer) 100);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList48 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList52 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        fuzzTest45.FuzzTest_remove(intList48, intList52, (-1), (java.lang.Integer) 1);
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList57 = null;
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList61 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList65 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        fuzzTest58.FuzzTest_remove(intList61, intList65, (-1), (java.lang.Integer) 1);
        fuzzTest45.FuzzTest_remove(intList57, intList65, (int) 'a', (java.lang.Integer) 0);
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList73 = null;
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 0, 10 };
        buggycodes.mut_006.ArrayList<java.lang.Integer> intList78 = new buggycodes.mut_006.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        fuzzTest45.FuzzTest_remove(intList73, intList78, (int) (short) 100, (java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_remove(intList37, intList78, (int) (byte) 0, (java.lang.Integer) 0);
    }
}

