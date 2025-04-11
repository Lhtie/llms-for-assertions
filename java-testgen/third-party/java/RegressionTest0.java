import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
            System.out.format("%n%s%n", "RegressionTest0.test01");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor2 = serializableList1.listIterator();
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList1.replaceAll(serializableUnaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable serializable29 = serializableList26.getFirst();
        java.io.Serializable serializable30 = serializableList26.removeLast();
        classes.ArrayList<java.io.Serializable> serializableList32 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor33 = serializableList32.listIterator();
        int int34 = serializableList26.lastIndexOf((java.lang.Object) serializableItor33);
        classes.ArrayList<java.io.Serializable> serializableList37 = new classes.ArrayList<java.io.Serializable>(1);
        classes.ArrayList<java.io.Serializable> serializableList39 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor40 = serializableList39.listIterator();
        boolean boolean41 = serializableList37.remove((java.lang.Object) serializableItor40);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] { int34, "hi!", serializableList37 };
        classes.ArrayList<java.io.Serializable> serializableList43 = new classes.ArrayList<java.io.Serializable>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList43, serializableArray42);
        int int45 = serializableList43.size();
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (short) 1 + "'", serializable29, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + 0 + "'", serializable30, 0);
        org.junit.Assert.assertNotNull(serializableItor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(serializableArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable serializable29 = serializableList26.getFirst();
        java.util.stream.Stream<java.io.Serializable> serializableStream30 = serializableList26.stream();
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (short) 1 + "'", serializable29, (short) 1);
        org.junit.Assert.assertNotNull(serializableStream30);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList55 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList55, serializableArray54);
        classes.ArrayList<java.io.Serializable> serializableList57 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList55);
        java.lang.Object[] objArray58 = serializableList57.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = serializableList28.add((java.io.Serializable) objArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25 out of bounds for length 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(serializableArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[1, 100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[1, 100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0]");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable serializable29 = serializableList26.getFirst();
        java.io.Serializable serializable30 = serializableList26.removeLast();
        classes.ArrayList<java.io.Serializable> serializableList32 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor33 = serializableList32.listIterator();
        int int34 = serializableList26.lastIndexOf((java.lang.Object) serializableItor33);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.io.Serializable> serializableItor36 = serializableList26.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 24");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (short) 1 + "'", serializable29, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + 0 + "'", serializable30, 0);
        org.junit.Assert.assertNotNull(serializableItor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        // The following exception was thrown during execution in test generation
        try {
            classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        // The following exception was thrown during execution in test generation
        try {
            classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        // The following exception was thrown during execution in test generation
        try {
            serializableList28.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable serializable29 = serializableList26.getFirst();
        serializableList26.clear();
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (short) 1 + "'", serializable29, (short) 1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor2 = serializableList1.listIterator();
        int int3 = serializableList1.size();
        classes.ArrayList<java.io.Serializable> serializableList4 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable5 = serializableList4.getLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        classes.ArrayList<java.util.RandomAccess> randomAccessList0 = new classes.ArrayList<java.util.RandomAccess>();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        classes.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList0 = new classes.ArrayList<java.util.Iterator<java.io.Serializable>>();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>(1);
        classes.ArrayList<java.io.Serializable> serializableList3 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor4 = serializableList3.listIterator();
        boolean boolean5 = serializableList1.remove((java.lang.Object) serializableItor4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.io.Serializable> serializableList8 = serializableList1.subList((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor2 = serializableList1.listIterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream3 = serializableList1.parallelStream();
        classes.ArrayList<java.io.Serializable> serializableList4 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList1);
        classes.ArrayList<java.io.Serializable> serializableList7 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor8 = serializableList7.listIterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableList7.parallelStream();
        classes.ArrayList<java.io.Serializable> serializableList10 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = serializableList4.addAll((int) (short) -1, (java.util.Collection<java.io.Serializable>) serializableList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableStream3);
        org.junit.Assert.assertNotNull(serializableItor8);
        org.junit.Assert.assertNotNull(serializableStream9);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable serializable29 = serializableList26.getFirst();
        java.io.Serializable serializable30 = serializableList26.removeLast();
        java.util.stream.Stream<java.io.Serializable> serializableStream31 = serializableList26.stream();
        java.io.Serializable serializable32 = serializableList26.removeFirst();
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator33 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList26.replaceAll(serializableUnaryOperator33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (short) 1 + "'", serializable29, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + 0 + "'", serializable30, 0);
        org.junit.Assert.assertNotNull(serializableStream31);
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + (short) 1 + "'", serializable32, (short) 1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList55 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList55, serializableArray54);
        classes.ArrayList<java.io.Serializable> serializableList57 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList55);
        java.io.Serializable serializable58 = serializableList55.getFirst();
        java.io.Serializable serializable59 = serializableList55.removeLast();
        java.io.Serializable serializable60 = serializableList55.removeLast();
        java.io.Serializable serializable61 = serializableList55.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = serializableList28.removeAll((java.util.Collection<java.io.Serializable>) serializableList55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(serializableArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + serializable58 + "' != '" + (short) 1 + "'", serializable58, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable59 + "' != '" + 0 + "'", serializable59, 0);
        org.junit.Assert.assertEquals("'" + serializable60 + "' != '" + 1 + "'", serializable60, 1);
        org.junit.Assert.assertEquals("'" + serializable61 + "' != '" + (short) 1 + "'", serializable61, (short) 1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        classes.ArrayList<java.lang.String> strList1 = new classes.ArrayList<java.lang.String>((int) (short) 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.lang.Object[] objArray29 = serializableList28.toArray();
        classes.ArrayList<java.io.Serializable> serializableList32 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor33 = serializableList32.listIterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream34 = serializableList32.parallelStream();
        classes.ArrayList<java.io.Serializable> serializableList35 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList32);
        boolean boolean36 = serializableList28.addAll((int) (byte) 1, (java.util.Collection<java.io.Serializable>) serializableList35);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable37 = serializableList35.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(serializableItor33);
        org.junit.Assert.assertNotNull(serializableStream34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.lang.Object[] objArray29 = serializableList28.toArray();
        classes.ArrayList<java.io.Serializable> serializableList32 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor33 = serializableList32.listIterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream34 = serializableList32.parallelStream();
        classes.ArrayList<java.io.Serializable> serializableList35 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList32);
        boolean boolean36 = serializableList28.addAll((int) (byte) 1, (java.util.Collection<java.io.Serializable>) serializableList35);
        java.util.stream.Stream<java.io.Serializable> serializableStream37 = serializableList35.stream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = serializableList35.add((java.io.Serializable) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(serializableItor33);
        org.junit.Assert.assertNotNull(serializableStream34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(serializableStream37);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>(1);
        serializableList1.clear();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.lang.Object[] objArray29 = serializableList28.toArray();
        java.lang.Class<?> wildcardClass30 = serializableList28.getClass();
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.lang.Object[] objArray29 = serializableList28.toArray();
        classes.ArrayList<java.io.Serializable> serializableList32 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor33 = serializableList32.listIterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream34 = serializableList32.parallelStream();
        classes.ArrayList<java.io.Serializable> serializableList35 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList32);
        boolean boolean36 = serializableList28.addAll((int) (byte) 1, (java.util.Collection<java.io.Serializable>) serializableList35);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable37 = serializableList35.getLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(serializableItor33);
        org.junit.Assert.assertNotNull(serializableStream34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable serializable29 = serializableList26.getFirst();
        java.io.Serializable serializable30 = serializableList26.removeLast();
        java.io.Serializable serializable31 = serializableList26.removeLast();
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList58 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList58, serializableArray57);
        classes.ArrayList<java.io.Serializable> serializableList60 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList58);
        java.io.Serializable serializable61 = serializableList58.getFirst();
        java.io.Serializable serializable62 = serializableList58.removeLast();
        java.util.stream.Stream<java.io.Serializable> serializableStream63 = serializableList58.stream();
        java.io.Serializable serializable64 = serializableList58.removeFirst();
        boolean boolean65 = serializableList26.containsAll((java.util.Collection<java.io.Serializable>) serializableList58);
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (short) 1 + "'", serializable29, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + 0 + "'", serializable30, 0);
        org.junit.Assert.assertEquals("'" + serializable31 + "' != '" + 1 + "'", serializable31, 1);
        org.junit.Assert.assertNotNull(serializableArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + serializable61 + "' != '" + (short) 1 + "'", serializable61, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable62 + "' != '" + 0 + "'", serializable62, 0);
        org.junit.Assert.assertNotNull(serializableStream63);
        org.junit.Assert.assertEquals("'" + serializable64 + "' != '" + (short) 1 + "'", serializable64, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor2 = serializableList1.listIterator();
        int int3 = serializableList1.size();
        classes.ArrayList<java.io.Serializable> serializableList4 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList1);
        serializableList1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable7 = serializableList1.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable serializable29 = serializableList26.getFirst();
        java.io.Serializable serializable30 = serializableList26.removeLast();
        java.util.stream.Stream<java.io.Serializable> serializableStream31 = serializableList26.stream();
        java.io.Serializable serializable32 = serializableList26.removeFirst();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator33 = serializableList26.spliterator();
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (short) 1 + "'", serializable29, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + 0 + "'", serializable30, 0);
        org.junit.Assert.assertNotNull(serializableStream31);
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + (short) 1 + "'", serializable32, (short) 1);
        org.junit.Assert.assertNotNull(serializableSpliterator33);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>((int) (short) 100);
        boolean boolean3 = serializableList1.equals((java.lang.Object) 0);
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList1.replaceAll(serializableUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        classes.ArrayList<java.lang.AutoCloseable> autoCloseableList0 = new classes.ArrayList<java.lang.AutoCloseable>();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable serializable29 = serializableList26.getFirst();
        java.lang.Class<?> wildcardClass30 = serializable29.getClass();
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (short) 1 + "'", serializable29, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>((int) '4');
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable serializable29 = serializableList26.getFirst();
        java.io.Serializable serializable30 = serializableList26.removeLast();
        java.util.stream.Stream<java.io.Serializable> serializableStream31 = serializableList26.stream();
        java.io.Serializable serializable32 = serializableList26.removeFirst();
        boolean boolean33 = serializableList26.isEmpty();
        java.lang.String str34 = serializableList26.toString();
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (short) 1 + "'", serializable29, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + 0 + "'", serializable30, 0);
        org.junit.Assert.assertNotNull(serializableStream31);
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + (short) 1 + "'", serializable32, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1]" + "'", str34, "[100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1]");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor2 = serializableList1.listIterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream3 = serializableList1.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.io.Serializable> serializableItor5 = serializableList1.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableStream3);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>((int) (short) 100);
        boolean boolean3 = serializableList1.equals((java.lang.Object) 0);
        classes.ArrayList<java.io.Serializable> serializableList6 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor7 = serializableList6.listIterator();
        int int8 = serializableList6.size();
        // The following exception was thrown during execution in test generation
        try {
            serializableList1.add(1, (java.io.Serializable) int8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable serializable29 = serializableList26.getFirst();
        java.io.Serializable serializable30 = serializableList26.removeLast();
        classes.ArrayList<java.io.Serializable> serializableList32 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor33 = serializableList32.listIterator();
        int int34 = serializableList26.lastIndexOf((java.lang.Object) serializableItor33);
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList61 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList61, serializableArray60);
        classes.ArrayList<java.io.Serializable> serializableList63 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList61);
        java.io.Serializable serializable64 = serializableList61.getFirst();
        java.io.Serializable serializable65 = serializableList61.removeLast();
        java.io.Serializable serializable66 = serializableList61.removeLast();
        java.io.Serializable serializable67 = serializableList61.removeFirst();
        boolean boolean68 = serializableList61.isEmpty();
        boolean boolean69 = serializableList26.containsAll((java.util.Collection<java.io.Serializable>) serializableList61);
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (short) 1 + "'", serializable29, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + 0 + "'", serializable30, 0);
        org.junit.Assert.assertNotNull(serializableItor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(serializableArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + serializable64 + "' != '" + (short) 1 + "'", serializable64, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable65 + "' != '" + 0 + "'", serializable65, 0);
        org.junit.Assert.assertEquals("'" + serializable66 + "' != '" + 1 + "'", serializable66, 1);
        org.junit.Assert.assertEquals("'" + serializable67 + "' != '" + (short) 1 + "'", serializable67, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>(1);
        classes.ArrayList<java.io.Serializable> serializableList3 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor4 = serializableList3.listIterator();
        boolean boolean5 = serializableList1.remove((java.lang.Object) serializableItor4);
        classes.ArrayList<java.io.Serializable> serializableList8 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor9 = serializableList8.listIterator();
        int int10 = serializableList8.size();
        classes.ArrayList<java.io.Serializable> serializableList11 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList8);
        serializableList8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable13 = serializableList1.set((int) '4', (java.io.Serializable) serializableList8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        classes.ArrayList<classes.ArrayList<java.io.Serializable>> serializableListList0 = new classes.ArrayList<classes.ArrayList<java.io.Serializable>>();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>(1);
        classes.ArrayList<java.io.Serializable> serializableList3 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor4 = serializableList3.listIterator();
        boolean boolean5 = serializableList1.remove((java.lang.Object) serializableItor4);
        java.util.ListIterator<java.io.Serializable> serializableItor6 = serializableList1.listIterator();
        int int7 = serializableList1.size();
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>((int) (short) 0);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.Collection<java.io.Serializable> serializableCollection2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = serializableList1.containsAll(serializableCollection2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"c\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        int int29 = serializableList28.size();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator30 = serializableList28.spliterator();
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList58 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList58, serializableArray57);
        classes.ArrayList<java.io.Serializable> serializableList60 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList58);
        java.io.Serializable serializable61 = serializableList58.getFirst();
        java.io.Serializable serializable62 = serializableList58.removeLast();
        java.util.stream.Stream<java.io.Serializable> serializableStream63 = serializableList58.stream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = serializableList28.addAll((int) (byte) 100, (java.util.Collection<java.io.Serializable>) serializableList58);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 25");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 25 + "'", int29 == 25);
        org.junit.Assert.assertNotNull(serializableSpliterator30);
        org.junit.Assert.assertNotNull(serializableArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + serializable61 + "' != '" + (short) 1 + "'", serializable61, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable62 + "' != '" + 0 + "'", serializable62, 0);
        org.junit.Assert.assertNotNull(serializableStream63);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable serializable29 = serializableList26.getFirst();
        java.io.Serializable serializable30 = serializableList26.removeLast();
        java.util.stream.Stream<java.io.Serializable> serializableStream31 = serializableList26.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream32 = serializableList26.stream();
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (short) 1 + "'", serializable29, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + 0 + "'", serializable30, 0);
        org.junit.Assert.assertNotNull(serializableStream31);
        org.junit.Assert.assertNotNull(serializableStream32);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable serializable29 = serializableList26.getFirst();
        java.io.Serializable serializable30 = serializableList26.removeLast();
        java.io.Serializable serializable31 = serializableList26.removeLast();
        java.io.Serializable serializable32 = serializableList26.removeFirst();
        boolean boolean33 = serializableList26.isEmpty();
        classes.ArrayList<java.io.Serializable> serializableList35 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor36 = serializableList35.listIterator();
        int int37 = serializableList35.size();
        classes.ArrayList<java.io.Serializable> serializableList38 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList26.removeAll((java.util.Collection<java.io.Serializable>) serializableList38);
        java.util.List<java.io.Serializable> serializableList40 = serializableList38.reversed();
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (short) 1 + "'", serializable29, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + 0 + "'", serializable30, 0);
        org.junit.Assert.assertEquals("'" + serializable31 + "' != '" + 1 + "'", serializable31, 1);
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + (short) 1 + "'", serializable32, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(serializableItor36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(serializableList40);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>(1);
        classes.ArrayList<java.io.Serializable> serializableList3 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor4 = serializableList3.listIterator();
        boolean boolean5 = serializableList1.remove((java.lang.Object) serializableItor4);
        java.util.ListIterator<java.io.Serializable> serializableItor6 = serializableList1.listIterator();
        serializableList1.clear();
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList34 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList34, serializableArray33);
        classes.ArrayList<java.io.Serializable> serializableList36 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList34);
        java.io.Serializable serializable37 = serializableList34.getFirst();
        java.io.Serializable serializable38 = serializableList34.removeLast();
        java.io.Serializable serializable39 = serializableList34.removeLast();
        int int40 = serializableList1.indexOf((java.lang.Object) serializableList34);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + serializable37 + "' != '" + (short) 1 + "'", serializable37, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable38 + "' != '" + 0 + "'", serializable38, 0);
        org.junit.Assert.assertEquals("'" + serializable39 + "' != '" + 1 + "'", serializable39, 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        classes.ArrayList<java.io.Serializable> serializableList0 = new classes.ArrayList<java.io.Serializable>();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable serializable29 = serializableList26.getFirst();
        java.io.Serializable serializable30 = serializableList26.removeLast();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator31 = serializableList26.spliterator();
        boolean boolean32 = serializableList26.isEmpty();
        java.io.Serializable[] serializableArray58 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList59 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList59, serializableArray58);
        classes.ArrayList<java.io.Serializable> serializableList61 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList59);
        java.io.Serializable serializable62 = serializableList59.getFirst();
        java.io.Serializable serializable63 = serializableList59.removeLast();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator64 = serializableList59.spliterator();
        java.util.ListIterator<java.io.Serializable> serializableItor66 = serializableList59.listIterator((int) (byte) 0);
        boolean boolean67 = serializableList26.remove((java.lang.Object) serializableList59);
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (short) 1 + "'", serializable29, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + 0 + "'", serializable30, 0);
        org.junit.Assert.assertNotNull(serializableSpliterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(serializableArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + serializable62 + "' != '" + (short) 1 + "'", serializable62, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable63 + "' != '" + 0 + "'", serializable63, 0);
        org.junit.Assert.assertNotNull(serializableSpliterator64);
        org.junit.Assert.assertNotNull(serializableItor66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        classes.ArrayList<java.lang.Class<?>> wildcardClassList0 = new classes.ArrayList<java.lang.Class<?>>();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable2 = serializableList1.getLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        int int29 = serializableList28.size();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator30 = serializableList28.spliterator();
        boolean boolean31 = serializableList28.isEmpty();
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 25 + "'", int29 == 25);
        org.junit.Assert.assertNotNull(serializableSpliterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.lang.Object[] objArray29 = serializableList28.toArray();
        classes.ArrayList<java.io.Serializable> serializableList31 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor32 = serializableList31.listIterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream33 = serializableList31.parallelStream();
        classes.ArrayList<java.io.Serializable> serializableList34 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList31);
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList61 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList61, serializableArray60);
        classes.ArrayList<java.io.Serializable> serializableList63 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList61);
        java.io.Serializable serializable64 = serializableList61.getFirst();
        java.io.Serializable serializable65 = serializableList61.removeLast();
        java.io.Serializable serializable66 = serializableList61.removeLast();
        java.io.Serializable serializable67 = serializableList61.removeFirst();
        int int68 = serializableList34.lastIndexOf((java.lang.Object) serializableList61);
        // The following exception was thrown during execution in test generation
        try {
            serializableList28.addFirst((java.io.Serializable) int68);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 25 out of bounds for object array[12]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(serializableItor32);
        org.junit.Assert.assertNotNull(serializableStream33);
        org.junit.Assert.assertNotNull(serializableArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + serializable64 + "' != '" + (short) 1 + "'", serializable64, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable65 + "' != '" + 0 + "'", serializable65, 0);
        org.junit.Assert.assertEquals("'" + serializable66 + "' != '" + 1 + "'", serializable66, 1);
        org.junit.Assert.assertEquals("'" + serializable67 + "' != '" + (short) 1 + "'", serializable67, (short) 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>((int) (short) 100);
        int int3 = serializableList1.indexOf((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable5 = serializableList1.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>((int) (short) 100);
        boolean boolean3 = serializableList1.equals((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable4 = serializableList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        int int29 = serializableList28.size();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator30 = serializableList28.spliterator();
        java.lang.String str31 = serializableList28.toString();
        java.util.ArrayList[] arrayListArray33 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.io.Serializable>[] serializableListArray34 = (java.util.ArrayList<java.io.Serializable>[]) arrayListArray33;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.io.Serializable>[] serializableListArray35 = serializableList28.toArray(serializableListArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.Short");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 25 + "'", int29 == 25);
        org.junit.Assert.assertNotNull(serializableSpliterator30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[1, 100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0]" + "'", str31, "[1, 100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(arrayListArray33);
        org.junit.Assert.assertArrayEquals(arrayListArray33, new java.util.ArrayList[] {});
        org.junit.Assert.assertNotNull(serializableListArray34);
        org.junit.Assert.assertArrayEquals(serializableListArray34, new java.util.ArrayList[] {});
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>(1);
        classes.ArrayList<java.io.Serializable> serializableList3 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor4 = serializableList3.listIterator();
        boolean boolean5 = serializableList1.remove((java.lang.Object) serializableItor4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable7 = serializableList1.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor2 = serializableList1.listIterator();
        classes.ArrayList<java.io.Serializable> serializableList27 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor28 = serializableList27.listIterator();
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] { (byte) 1, 1L, ' ', "", "", false, 1.0d, 100L, true, 10, (byte) -1, true, (short) -1, true, 10, 0, 1L, 0L, true, (-1.0d), 1, 1, '4', serializableList27 };
        java.util.ArrayList<java.io.Serializable> serializableList30 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList30, serializableArray29);
        boolean boolean32 = serializableList30.isEmpty();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator33 = serializableList30.spliterator();
        boolean boolean34 = serializableList1.equals((java.lang.Object) serializableList30);
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableItor28);
        org.junit.Assert.assertNotNull(serializableArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable serializable29 = serializableList26.getFirst();
        java.io.Serializable serializable30 = serializableList26.removeLast();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator31 = serializableList26.spliterator();
        java.util.ListIterator<java.io.Serializable> serializableItor33 = serializableList26.listIterator((int) (byte) 0);
        boolean boolean35 = serializableList26.remove((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (short) 1 + "'", serializable29, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + 0 + "'", serializable30, 0);
        org.junit.Assert.assertNotNull(serializableSpliterator31);
        org.junit.Assert.assertNotNull(serializableItor33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>(1);
        classes.ArrayList<java.io.Serializable> serializableList3 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor4 = serializableList3.listIterator();
        boolean boolean5 = serializableList1.remove((java.lang.Object) serializableItor4);
        boolean boolean6 = serializableList1.isEmpty();
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        classes.ArrayList<java.io.Serializable> serializableList24 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor25 = serializableList24.listIterator();
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] { (byte) 1, 1L, ' ', "", "", false, 1.0d, 100L, true, 10, (byte) -1, true, (short) -1, true, 10, 0, 1L, 0L, true, (-1.0d), 1, 1, '4', serializableList24 };
        java.util.ArrayList<java.io.Serializable> serializableList27 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList27, serializableArray26);
        boolean boolean29 = serializableList27.isEmpty();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator30 = serializableList27.spliterator();
        java.io.Serializable serializable32 = serializableList27.remove((int) (short) 1);
        org.junit.Assert.assertNotNull(serializableItor25);
        org.junit.Assert.assertNotNull(serializableArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator30);
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + 1L + "'", serializable32, 1L);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>((int) (short) 100);
        boolean boolean3 = serializableList1.equals((java.lang.Object) 0);
        boolean boolean5 = serializableList1.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        classes.ArrayList<java.io.Serializable> serializableList28 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList26);
        java.io.Serializable serializable29 = serializableList26.getFirst();
        java.io.Serializable serializable30 = serializableList26.removeLast();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator31 = serializableList26.spliterator();
        boolean boolean32 = serializableList26.isEmpty();
        int int34 = serializableList26.lastIndexOf((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (short) 1 + "'", serializable29, (short) 1);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + 0 + "'", serializable30, 0);
        org.junit.Assert.assertNotNull(serializableSpliterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>(1);
        classes.ArrayList<java.io.Serializable> serializableList3 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor4 = serializableList3.listIterator();
        boolean boolean5 = serializableList1.remove((java.lang.Object) serializableItor4);
        java.util.ListIterator<java.io.Serializable> serializableItor6 = serializableList1.listIterator();
        serializableList1.clear();
        classes.ArrayList<java.io.Serializable> serializableList9 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor10 = serializableList9.listIterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableList9.parallelStream();
        java.lang.Class<?> wildcardClass12 = serializableList9.getClass();
        serializableList1.addLast((java.io.Serializable) serializableList9);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] { (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList40 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList40, serializableArray39);
        classes.ArrayList<java.io.Serializable> serializableList42 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList40);
        java.lang.Object[] objArray43 = serializableList42.toArray();
        java.util.stream.Stream<java.io.Serializable> serializableStream44 = serializableList42.stream();
        int int45 = serializableList9.indexOf((java.lang.Object) serializableStream44);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(serializableItor10);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(serializableArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1, 100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1, 100, 100, 10,  , 100.0, 0.0, 10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(serializableStream44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        classes.ArrayList<java.io.Serializable> serializableList1 = new classes.ArrayList<java.io.Serializable>(1);
        java.util.ListIterator<java.io.Serializable> serializableItor2 = serializableList1.listIterator();
        int int3 = serializableList1.size();
        classes.ArrayList<java.io.Serializable> serializableList4 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList1);
        serializableList1.clear();
        classes.ArrayList<java.io.Serializable> serializableList6 = new classes.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable8 = serializableList1.get(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }
}

