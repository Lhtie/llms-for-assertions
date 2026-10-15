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
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest1.FuzzTest_toArray(intList2, intList3, intArray7);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest9.FuzzTest_toArray(intList10, intList11, intArray15);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest18.FuzzTest_toArray(intList19, intList20, intArray24);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest27.FuzzTest_toArray(intList28, intList29, intArray33);
        fuzzTest17.FuzzTest_toArray(intList19, intList26, intArray33);
        fuzzTest0.FuzzTest_toArray(intList3, intList10, intArray33);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest37.FuzzTest_toArray(intList38, intList39, intArray43);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest46 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest46.FuzzTest_toArray(intList47, intList48, intArray52);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList55 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList56 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest54.FuzzTest_toArray(intList55, intList56, intArray60);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList63 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest62.FuzzTest_toArray(intList63, intList64, intArray68);
        java.lang.Integer[] intArray70 = null;
        fuzzTest46.FuzzTest_toArray(intList55, intList64, intArray70);
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList74 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest72.FuzzTest_toArray(intList73, intList74, intArray78);
        fuzzTest37.FuzzTest_toArray(intList45, intList55, intArray78);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList81 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray82 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList45, intList81, intArray82);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest0.FuzzTest_toArray(intList1, intList2, intArray6);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList8 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest9.FuzzTest_toArray(intList10, intList11, intArray15);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest17.FuzzTest_toArray(intList18, intList19, intArray23);
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest25.FuzzTest_toArray(intList26, intList27, intArray31);
        java.lang.Integer[] intArray33 = null;
        fuzzTest9.FuzzTest_toArray(intList18, intList27, intArray33);
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest35.FuzzTest_toArray(intList36, intList37, intArray41);
        fuzzTest0.FuzzTest_toArray(intList8, intList18, intArray41);
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList45 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList46 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest44.FuzzTest_toArray(intList45, intList46, intArray50);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = null;
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0, 100, 0, 100, 0 };
        fuzzTest0.FuzzTest_toArray(intList46, intList52, intArray58);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList60 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList63 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList64 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest62.FuzzTest_toArray(intList63, intList64, intArray68);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest71.FuzzTest_toArray(intList72, intList73, intArray77);
        fuzzTest61.FuzzTest_toArray(intList63, intList70, intArray77);
        java.lang.Integer[] intArray80 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList60, intList70, intArray80);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest1.FuzzTest_toArray(intList2, intList3, intArray7);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest10.FuzzTest_toArray(intList11, intList12, intArray16);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest19.FuzzTest_toArray(intList20, intList21, intArray25);
        fuzzTest9.FuzzTest_toArray(intList11, intList18, intArray25);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = null;
        java.lang.Integer[] intArray30 = null;
        fuzzTest9.FuzzTest_toArray(intList28, intList29, intArray30);
        java.lang.Integer[] intArray32 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList3, intList28, intArray32);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest1.FuzzTest_toArray(intList2, intList3, intArray7);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest10.FuzzTest_toArray(intList11, intList12, intArray16);
        fuzzTest0.FuzzTest_toArray(intList2, intList9, intArray16);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = null;
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList22 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest20.FuzzTest_toArray(intList21, intList22, intArray26);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList31 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest29.FuzzTest_toArray(intList30, intList31, intArray35);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest37.FuzzTest_toArray(intList38, intList39, intArray43);
        fuzztests.FuzzTest fuzzTest45 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList46 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest45.FuzzTest_toArray(intList46, intList47, intArray51);
        java.lang.Integer[] intArray53 = null;
        fuzzTest29.FuzzTest_toArray(intList38, intList47, intArray53);
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList56 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList57 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest55.FuzzTest_toArray(intList56, intList57, intArray61);
        fuzzTest20.FuzzTest_toArray(intList28, intList38, intArray61);
        fuzztests.FuzzTest fuzzTest64 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest65 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList66 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList67 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest65.FuzzTest_toArray(intList66, intList67, intArray71);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest74 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList75 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList76 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest74.FuzzTest_toArray(intList75, intList76, intArray80);
        fuzzTest64.FuzzTest_toArray(intList66, intList73, intArray80);
        fuzzTest0.FuzzTest_toArray(intList19, intList38, intArray80);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList84 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList85 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray86 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList84, intList85, intArray86);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest0.FuzzTest_toArray(intList1, intList2, intArray6);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest8.FuzzTest_toArray(intList9, intList10, intArray14);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList17 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest16.FuzzTest_toArray(intList17, intList18, intArray22);
        java.lang.Integer[] intArray24 = null;
        fuzzTest0.FuzzTest_toArray(intList9, intList18, intArray24);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest26.FuzzTest_toArray(intList27, intList28, intArray32);
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList35 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest34.FuzzTest_toArray(intList35, intList36, intArray40);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList42 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest43.FuzzTest_toArray(intList44, intList45, intArray49);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList53 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest51.FuzzTest_toArray(intList52, intList53, intArray57);
        fuzztests.FuzzTest fuzzTest59 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList60 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList61 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest59.FuzzTest_toArray(intList60, intList61, intArray65);
        java.lang.Integer[] intArray67 = null;
        fuzzTest43.FuzzTest_toArray(intList52, intList61, intArray67);
        fuzztests.FuzzTest fuzzTest69 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList71 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest69.FuzzTest_toArray(intList70, intList71, intArray75);
        fuzzTest34.FuzzTest_toArray(intList42, intList52, intArray75);
        java.lang.Integer[] intArray78 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList28, intList42, intArray78);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest1.FuzzTest_toArray(intList2, intList3, intArray7);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest10.FuzzTest_toArray(intList11, intList12, intArray16);
        fuzzTest0.FuzzTest_toArray(intList2, intList9, intArray16);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = null;
        java.lang.Integer[] intArray21 = null;
        fuzzTest0.FuzzTest_toArray(intList19, intList20, intArray21);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest24 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest25 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest25.FuzzTest_toArray(intList26, intList27, intArray31);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList33 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest34 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList35 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest34.FuzzTest_toArray(intList35, intList36, intArray40);
        fuzzTest24.FuzzTest_toArray(intList26, intList33, intArray40);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest44 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList45 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList46 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest44.FuzzTest_toArray(intList45, intList46, intArray50);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList54 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList55 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest53.FuzzTest_toArray(intList54, intList55, intArray59);
        fuzzTest43.FuzzTest_toArray(intList45, intList52, intArray59);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList63 = null;
        java.lang.Integer[] intArray64 = null;
        fuzzTest43.FuzzTest_toArray(intList62, intList63, intArray64);
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest67 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList68 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList69 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest67.FuzzTest_toArray(intList68, intList69, intArray73);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList75 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest76 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList77 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList78 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest76.FuzzTest_toArray(intList77, intList78, intArray82);
        fuzzTest66.FuzzTest_toArray(intList68, intList75, intArray82);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList85 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList86 = null;
        java.lang.Integer[] intArray87 = null;
        fuzzTest66.FuzzTest_toArray(intList85, intList86, intArray87);
        java.lang.Integer[] intArray89 = null;
        fuzzTest24.FuzzTest_toArray(intList63, intList85, intArray89);
        java.lang.Integer[] intArray91 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList23, intList85, intArray91);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList4 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest2.FuzzTest_toArray(intList3, intList4, intArray8);
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest10.FuzzTest_toArray(intList11, intList12, intArray16);
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest18.FuzzTest_toArray(intList19, intList20, intArray24);
        java.lang.Integer[] intArray26 = null;
        fuzzTest2.FuzzTest_toArray(intList11, intList20, intArray26);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = null;
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList31 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest29.FuzzTest_toArray(intList30, intList31, intArray35);
        fuzzTest1.FuzzTest_toArray(intList11, intList28, intArray35);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = null;
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList42 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest40.FuzzTest_toArray(intList41, intList42, intArray46);
        fuzztests.FuzzTest fuzzTest48 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList49 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest48.FuzzTest_toArray(intList49, intList50, intArray54);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList59 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest57.FuzzTest_toArray(intList58, intList59, intArray63);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList67 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest66.FuzzTest_toArray(intList67, intList68, intArray72);
        fuzzTest56.FuzzTest_toArray(intList58, intList65, intArray72);
        fuzzTest39.FuzzTest_toArray(intList42, intList49, intArray72);
        java.lang.Integer[] intArray76 = null;
        fuzzTest1.FuzzTest_toArray(intList38, intList42, intArray76);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList78 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray79 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList42, intList78, intArray79);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest0.FuzzTest_toArray(intList1, intList2, intArray6);
        fuzztests.FuzzTest fuzzTest8 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList9 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest8.FuzzTest_toArray(intList9, intList10, intArray14);
        fuzztests.FuzzTest fuzzTest16 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList17 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest16.FuzzTest_toArray(intList17, intList18, intArray22);
        java.lang.Integer[] intArray24 = null;
        fuzzTest0.FuzzTest_toArray(intList9, intList18, intArray24);
        fuzztests.FuzzTest fuzzTest26 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList27 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest26.FuzzTest_toArray(intList27, intList28, intArray32);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest35 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList36 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest35.FuzzTest_toArray(intList36, intList37, intArray41);
        fuzztests.FuzzTest fuzzTest43 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList45 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest43.FuzzTest_toArray(intList44, intList45, intArray49);
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList53 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest51.FuzzTest_toArray(intList52, intList53, intArray57);
        java.lang.Integer[] intArray59 = null;
        fuzzTest35.FuzzTest_toArray(intList44, intList53, intArray59);
        fuzztests.FuzzTest fuzzTest61 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList62 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList63 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest61.FuzzTest_toArray(intList62, intList63, intArray67);
        fuzzTest26.FuzzTest_toArray(intList34, intList44, intArray67);
        fuzztests.FuzzTest fuzzTest70 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList71 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest70.FuzzTest_toArray(intList71, intList72, intArray76);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList78 = null;
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 0, 100, 0, 100, 0 };
        fuzzTest26.FuzzTest_toArray(intList72, intList78, intArray84);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList86 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray87 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList72, intList86, intArray87);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList4 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest2.FuzzTest_toArray(intList3, intList4, intArray8);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest11.FuzzTest_toArray(intList12, intList13, intArray17);
        fuzzTest1.FuzzTest_toArray(intList3, intList10, intArray17);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = null;
        java.lang.Integer[] intArray22 = null;
        fuzzTest1.FuzzTest_toArray(intList20, intList21, intArray22);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        fuzztests.FuzzTest fuzzTest28 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList31 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest29.FuzzTest_toArray(intList30, intList31, intArray35);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest38.FuzzTest_toArray(intList39, intList40, intArray44);
        fuzzTest28.FuzzTest_toArray(intList30, intList37, intArray44);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList47 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = null;
        java.lang.Integer[] intArray49 = null;
        fuzzTest28.FuzzTest_toArray(intList47, intList48, intArray49);
        java.lang.Integer[] intArray51 = null;
        fuzzTest1.FuzzTest_toArray(intList26, intList48, intArray51);
        fuzztests.FuzzTest fuzzTest53 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList55 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList56 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest54.FuzzTest_toArray(intList55, intList56, intArray60);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList62 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList64 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest63.FuzzTest_toArray(intList64, intList65, intArray69);
        fuzzTest53.FuzzTest_toArray(intList55, intList62, intArray69);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = null;
        java.lang.Integer[] intArray74 = null;
        fuzzTest53.FuzzTest_toArray(intList72, intList73, intArray74);
        java.lang.Integer[] intArray76 = null;
        fuzzTest0.FuzzTest_toArray(intList26, intList73, intArray76);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList78 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList79 = null;
        java.lang.Integer[] intArray80 = null;
        fuzzTest0.FuzzTest_toArray(intList78, intList79, intArray80);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { (-1), 100, 2 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList86 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        java.lang.Integer[] intArray93 = new java.lang.Integer[] { 1, 2, 100, 1, 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList94 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList94, intArray93);
        java.lang.Integer[] intArray96 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList86, intList94, intArray96);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100, 1, 2 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest10.FuzzTest_toArray(intList11, intList12, intArray16);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest19.FuzzTest_toArray(intList20, intList21, intArray25);
        fuzzTest9.FuzzTest_toArray(intList11, intList18, intArray25);
        fuzzTest0.FuzzTest_toArray(intList1, intList7, intArray25);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList31 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest30.FuzzTest_toArray(intList31, intList32, intArray36);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList40 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest39.FuzzTest_toArray(intList40, intList41, intArray45);
        fuzzTest29.FuzzTest_toArray(intList31, intList38, intArray45);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList49 = null;
        java.lang.Integer[] intArray50 = null;
        fuzzTest29.FuzzTest_toArray(intList48, intList49, intArray50);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1) };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList54 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        fuzztests.FuzzTest fuzzTest56 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest57 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList59 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest57.FuzzTest_toArray(intList58, intList59, intArray63);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest66 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList67 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList68 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest66.FuzzTest_toArray(intList67, intList68, intArray72);
        fuzzTest56.FuzzTest_toArray(intList58, intList65, intArray72);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList75 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList76 = null;
        java.lang.Integer[] intArray77 = null;
        fuzzTest56.FuzzTest_toArray(intList75, intList76, intArray77);
        java.lang.Integer[] intArray79 = null;
        fuzzTest29.FuzzTest_toArray(intList54, intList76, intArray79);
        fuzztests.FuzzTest fuzzTest81 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList82 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList83 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest81.FuzzTest_toArray(intList82, intList83, intArray87);
        java.lang.Integer[] intArray89 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList54, intList83, intArray89);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 100, 100, 1, 2 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList7 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest10.FuzzTest_toArray(intList11, intList12, intArray16);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest19.FuzzTest_toArray(intList20, intList21, intArray25);
        fuzzTest9.FuzzTest_toArray(intList11, intList18, intArray25);
        fuzzTest0.FuzzTest_toArray(intList1, intList7, intArray25);
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest31 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest32 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList33 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList34 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest32.FuzzTest_toArray(intList33, intList34, intArray38);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList42 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList43 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest41.FuzzTest_toArray(intList42, intList43, intArray47);
        fuzzTest31.FuzzTest_toArray(intList33, intList40, intArray47);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList51 = null;
        java.lang.Integer[] intArray52 = null;
        fuzzTest31.FuzzTest_toArray(intList50, intList51, intArray52);
        fuzztests.FuzzTest fuzzTest54 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest55 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList56 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList57 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest55.FuzzTest_toArray(intList56, intList57, intArray61);
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList64 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest63.FuzzTest_toArray(intList64, intList65, intArray69);
        fuzztests.FuzzTest fuzzTest71 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList72 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest71.FuzzTest_toArray(intList72, intList73, intArray77);
        java.lang.Integer[] intArray79 = null;
        fuzzTest55.FuzzTest_toArray(intList64, intList73, intArray79);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList81 = null;
        fuzztests.FuzzTest fuzzTest82 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList83 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList84 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest82.FuzzTest_toArray(intList83, intList84, intArray88);
        fuzzTest54.FuzzTest_toArray(intList64, intList81, intArray88);
        fuzzTest29.FuzzTest_toArray(intList30, intList51, intArray88);
        java.lang.Integer[] intArray95 = new java.lang.Integer[] { 0, (-1), 1 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList96 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean97 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList96, intArray95);
        java.lang.Integer[] intArray98 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList30, intList96, intArray98);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest1.FuzzTest_toArray(intList2, intList3, intArray7);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest10 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest10.FuzzTest_toArray(intList11, intList12, intArray16);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest19.FuzzTest_toArray(intList20, intList21, intArray25);
        fuzzTest9.FuzzTest_toArray(intList11, intList18, intArray25);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 2, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList31 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        fuzztests.FuzzTest fuzzTest33 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList34 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList35 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest33.FuzzTest_toArray(intList34, intList35, intArray39);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList43 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest42.FuzzTest_toArray(intList43, intList44, intArray48);
        fuzztests.FuzzTest fuzzTest50 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList51 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest50.FuzzTest_toArray(intList51, intList52, intArray56);
        fuzztests.FuzzTest fuzzTest58 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList59 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList60 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest58.FuzzTest_toArray(intList59, intList60, intArray64);
        java.lang.Integer[] intArray66 = null;
        fuzzTest42.FuzzTest_toArray(intList51, intList60, intArray66);
        fuzztests.FuzzTest fuzzTest68 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList69 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest68.FuzzTest_toArray(intList69, intList70, intArray74);
        fuzzTest33.FuzzTest_toArray(intList41, intList51, intArray74);
        fuzztests.FuzzTest fuzzTest77 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList78 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList79 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest77.FuzzTest_toArray(intList78, intList79, intArray83);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList85 = null;
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 0, 100, 0, 100, 0 };
        fuzzTest33.FuzzTest_toArray(intList79, intList85, intArray91);
        java.lang.Integer[] intArray93 = null;
        fuzzTest9.FuzzTest_toArray(intList31, intList85, intArray93);
        java.lang.Integer[] intArray95 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList3, intList31, intArray95);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest1.FuzzTest_toArray(intList2, intList3, intArray7);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest9.FuzzTest_toArray(intList10, intList11, intArray15);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest18.FuzzTest_toArray(intList19, intList20, intArray24);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest27.FuzzTest_toArray(intList28, intList29, intArray33);
        fuzzTest17.FuzzTest_toArray(intList19, intList26, intArray33);
        fuzzTest0.FuzzTest_toArray(intList3, intList10, intArray33);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList37 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest38 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList40 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest38.FuzzTest_toArray(intList39, intList40, intArray44);
        java.lang.Integer[] intArray46 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList37, intList40, intArray46);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest0.FuzzTest_toArray(intList1, intList2, intArray6);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 0, 0, 10, (-1), 100, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList15 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList18 = null;
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest21 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList22 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList23 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest21.FuzzTest_toArray(intList22, intList23, intArray27);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest30 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList31 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList32 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest30.FuzzTest_toArray(intList31, intList32, intArray36);
        fuzzTest20.FuzzTest_toArray(intList22, intList29, intArray36);
        fuzztests.FuzzTest fuzzTest39 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest40 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList41 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList42 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest40.FuzzTest_toArray(intList41, intList42, intArray46);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList48 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest49 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList50 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList51 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest49.FuzzTest_toArray(intList50, intList51, intArray55);
        fuzzTest39.FuzzTest_toArray(intList41, intList48, intArray55);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList58 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList59 = null;
        java.lang.Integer[] intArray60 = null;
        fuzzTest39.FuzzTest_toArray(intList58, intList59, intArray60);
        fuzztests.FuzzTest fuzzTest62 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest63 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList64 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList65 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest63.FuzzTest_toArray(intList64, intList65, intArray69);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList71 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest72 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList73 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList74 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest72.FuzzTest_toArray(intList73, intList74, intArray78);
        fuzzTest62.FuzzTest_toArray(intList64, intList71, intArray78);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList81 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList82 = null;
        java.lang.Integer[] intArray83 = null;
        fuzzTest62.FuzzTest_toArray(intList81, intList82, intArray83);
        java.lang.Integer[] intArray85 = null;
        fuzzTest20.FuzzTest_toArray(intList59, intList81, intArray85);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList87 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray88 = null;
        fuzzTest19.FuzzTest_toArray(intList59, intList87, intArray88);
        java.lang.Integer[] intArray90 = null;
        fuzzTest17.FuzzTest_toArray(intList18, intList87, intArray90);
        java.lang.Integer[] intArray92 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList15, intList87, intArray92);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest1 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList2 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList3 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest1.FuzzTest_toArray(intList2, intList3, intArray7);
        fuzztests.FuzzTest fuzzTest9 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList10 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList11 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest9.FuzzTest_toArray(intList10, intList11, intArray15);
        fuzztests.FuzzTest fuzzTest17 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest18 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList19 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList20 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest18.FuzzTest_toArray(intList19, intList20, intArray24);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList26 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest27 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList29 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest27.FuzzTest_toArray(intList28, intList29, intArray33);
        fuzzTest17.FuzzTest_toArray(intList19, intList26, intArray33);
        fuzzTest0.FuzzTest_toArray(intList3, intList10, intArray33);
        fuzztests.FuzzTest fuzzTest37 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList38 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList39 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest37.FuzzTest_toArray(intList38, intList39, intArray43);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList45 = null;
        java.lang.Integer[] intArray46 = null;
        fuzzTest0.FuzzTest_toArray(intList39, intList45, intArray46);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 0, 100, 1, 2 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList54 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList56 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray57 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList54, intList56, intArray57);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        fuzztests.FuzzTest fuzzTest0 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList1 = null;
        fuzztests.FuzzTest fuzzTest2 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest3 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList4 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList5 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest3.FuzzTest_toArray(intList4, intList5, intArray9);
        fuzztests.FuzzTest fuzzTest11 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList12 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList13 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest11.FuzzTest_toArray(intList12, intList13, intArray17);
        fuzztests.FuzzTest fuzzTest19 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest20 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList21 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList22 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest20.FuzzTest_toArray(intList21, intList22, intArray26);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList28 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest29 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList30 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList31 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest29.FuzzTest_toArray(intList30, intList31, intArray35);
        fuzzTest19.FuzzTest_toArray(intList21, intList28, intArray35);
        fuzzTest2.FuzzTest_toArray(intList5, intList12, intArray35);
        java.lang.Integer[] intArray39 = null;
        fuzzTest0.FuzzTest_toArray(intList1, intList12, intArray39);
        fuzztests.FuzzTest fuzzTest41 = new fuzztests.FuzzTest();
        fuzztests.FuzzTest fuzzTest42 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList43 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList44 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest42.FuzzTest_toArray(intList43, intList44, intArray48);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList50 = fuzztests.FuzzTest.makeFuzzInput();
        fuzztests.FuzzTest fuzzTest51 = new fuzztests.FuzzTest();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList52 = null;
        c2s_aug_sub.ArrayList<java.lang.Integer> intList53 = fuzztests.FuzzTest.makeFuzzInput();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 100, 2 };
        fuzzTest51.FuzzTest_toArray(intList52, intList53, intArray57);
        fuzzTest41.FuzzTest_toArray(intList43, intList50, intArray57);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList60 = fuzztests.FuzzTest.makeFuzzInput();
        c2s_aug_sub.ArrayList<java.lang.Integer> intList61 = null;
        java.lang.Integer[] intArray62 = null;
        fuzzTest41.FuzzTest_toArray(intList60, intList61, intArray62);
        c2s_aug_sub.ArrayList<java.lang.Integer> intList64 = null;
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 2, (-1), 1, 10 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList70 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        java.lang.Integer[] intArray72 = null;
        fuzzTest41.FuzzTest_toArray(intList64, intList70, intArray72);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10, 10, 100, 10, 100 };
        c2s_aug_sub.ArrayList<java.lang.Integer> intList80 = new c2s_aug_sub.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        java.lang.Integer[] intArray82 = null;
        // during test generation this statement threw an exception of type java.lang.RuntimeException in error
        fuzzTest0.FuzzTest_toArray(intList70, intList80, intArray82);
    }
}

