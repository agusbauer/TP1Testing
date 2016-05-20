package myLinkedList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test(timeout=1000)
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    java.util.Collection collection0 = null;
    // The following exception was thrown during execution in test generation
    try {
      myLinkedList.MyLinkedList myLinkedList1 = new myLinkedList.MyLinkedList(collection0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test(timeout=1000)
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj2 = myLinkedList0.element();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test(timeout=1000)
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj5 = myLinkedList0.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test(timeout=1000)
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj3 = myLinkedList0.set((-1), (java.lang.Object)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test(timeout=1000)
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj6 = myLinkedList2.set(100, (java.lang.Object)0L);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test(timeout=1000)
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    myLinkedList0.addFirst((java.lang.Object)(-1.0f));
    java.util.function.Consumer consumer8 = null;
    // The following exception was thrown during execution in test generation
    try {
      myLinkedList0.forEach(consumer8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test(timeout=1000)
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    java.lang.Object obj7 = myLinkedList6.peek();
    myLinkedList6.addLast((java.lang.Object)(byte)100);
    boolean b10 = myLinkedList2.retainAll((java.util.Collection)myLinkedList6);
    java.lang.Object[] obj_array11 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object[] obj_array12 = myLinkedList2.toArray(obj_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test(timeout=1000)
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    int i1 = myLinkedList0.size();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj2 = myLinkedList0.getLast();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test(timeout=1000)
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    // The following exception was thrown during execution in test generation
    try {
      java.util.List list6 = myLinkedList0.subList(100, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test(timeout=1000)
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    java.lang.Object obj1 = myLinkedList0.peek();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    java.lang.Object obj3 = myLinkedList2.peek();
    boolean b4 = myLinkedList0.addAll((java.util.Collection)myLinkedList2);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj5 = myLinkedList0.pollLast();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test(timeout=1000)
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    int i1 = myLinkedList0.size();
    // The following exception was thrown during execution in test generation
    try {
      myLinkedList0.add(10, (java.lang.Object)true);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test(timeout=1000)
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList0.clear();
    java.lang.Object obj6 = myLinkedList0.pollFirst();
    java.lang.Object obj7 = myLinkedList0.pollLast();
    // The following exception was thrown during execution in test generation
    try {
      myLinkedList0.add((-1), (java.lang.Object)10.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test(timeout=1000)
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    java.lang.Object obj7 = myLinkedList6.peek();
    myLinkedList6.addLast((java.lang.Object)(byte)100);
    boolean b10 = myLinkedList2.retainAll((java.util.Collection)myLinkedList6);
    boolean b11 = myLinkedList2.repOK();
    int i12 = myLinkedList2.size();
    boolean b14 = myLinkedList2.insertar((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test(timeout=1000)
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList0.clear();
    java.lang.Object obj6 = myLinkedList0.pollFirst();
    java.util.ListIterator listIterator7 = myLinkedList0.listIterator();
    // The following exception was thrown during execution in test generation
    try {
      java.util.ListIterator listIterator9 = myLinkedList0.listIterator(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listIterator7);

  }

  @Test(timeout=1000)
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    java.lang.Object obj7 = myLinkedList6.peek();
    myLinkedList6.addLast((java.lang.Object)(byte)100);
    boolean b10 = myLinkedList2.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList6.addLast((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test(timeout=1000)
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj7 = myLinkedList2.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test(timeout=1000)
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b5 = myLinkedList4.repOK();
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    boolean b7 = myLinkedList6.repOK();
    int i8 = myLinkedList6.size();
    boolean b9 = myLinkedList4.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList4.addFirst((java.lang.Object)(-1.0f));
    boolean b12 = myLinkedList0.offer((java.lang.Object)myLinkedList4);
    myLinkedList0.addFirst((java.lang.Object)100L);
    java.util.function.UnaryOperator unaryOperator15 = null;
    // The following exception was thrown during execution in test generation
    try {
      myLinkedList0.replaceAll(unaryOperator15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test(timeout=1000)
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList0.clear();
    boolean b6 = myLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test(timeout=1000)
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    java.lang.Object obj1 = myLinkedList0.peek();
    java.lang.Object[] obj_array2 = myLinkedList0.toArray();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj3 = myLinkedList0.getLast();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test(timeout=1000)
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    java.util.stream.Stream stream2 = myLinkedList0.parallelStream();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj4 = myLinkedList0.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream2);

  }

  @Test(timeout=1000)
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b5 = myLinkedList4.repOK();
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    boolean b7 = myLinkedList6.repOK();
    int i8 = myLinkedList6.size();
    boolean b9 = myLinkedList4.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList4.addFirst((java.lang.Object)(-1.0f));
    boolean b12 = myLinkedList0.offer((java.lang.Object)myLinkedList4);
    java.lang.Object obj13 = myLinkedList0.peekFirst();
    myLinkedList0.add(0, (java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);

  }

  @Test(timeout=1000)
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList0.clear();
    java.lang.Object obj6 = myLinkedList0.pollFirst();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj7 = myLinkedList0.removeLast();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test(timeout=1000)
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b5 = myLinkedList4.repOK();
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    boolean b7 = myLinkedList6.repOK();
    int i8 = myLinkedList6.size();
    boolean b9 = myLinkedList4.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList4.addFirst((java.lang.Object)(-1.0f));
    boolean b12 = myLinkedList0.offer((java.lang.Object)myLinkedList4);
    myLinkedList.MyLinkedList myLinkedList13 = new myLinkedList.MyLinkedList();
    boolean b14 = myLinkedList13.repOK();
    myLinkedList.MyLinkedList myLinkedList15 = new myLinkedList.MyLinkedList();
    boolean b16 = myLinkedList13.removeAll((java.util.Collection)myLinkedList15);
    myLinkedList.MyLinkedList myLinkedList17 = new myLinkedList.MyLinkedList();
    boolean b18 = myLinkedList17.repOK();
    myLinkedList.MyLinkedList myLinkedList19 = new myLinkedList.MyLinkedList();
    boolean b20 = myLinkedList19.repOK();
    int i21 = myLinkedList19.size();
    boolean b22 = myLinkedList17.retainAll((java.util.Collection)myLinkedList19);
    myLinkedList17.addFirst((java.lang.Object)(-1.0f));
    boolean b25 = myLinkedList13.offer((java.lang.Object)myLinkedList17);
    int i27 = myLinkedList17.indexOf((java.lang.Object)(short)1);
    java.util.ListIterator listIterator28 = myLinkedList17.listIterator();
    int i29 = myLinkedList4.lastIndexOf((java.lang.Object)listIterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listIterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));

  }

  @Test(timeout=1000)
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b5 = myLinkedList4.repOK();
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    boolean b7 = myLinkedList6.repOK();
    int i8 = myLinkedList6.size();
    boolean b9 = myLinkedList4.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList4.addFirst((java.lang.Object)(-1.0f));
    boolean b12 = myLinkedList0.offer((java.lang.Object)myLinkedList4);
    java.lang.Object obj13 = myLinkedList0.peekFirst();
    java.lang.String str14 = myLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[[-1.0]]"+ "'", str14.equals("[[-1.0]]"));

  }

  @Test(timeout=1000)
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList0.clear();
    java.lang.Object obj6 = myLinkedList0.pollFirst();
    boolean b8 = myLinkedList0.offerFirst((java.lang.Object)'4');
    java.lang.Object obj9 = myLinkedList0.clone();
    myLinkedList.MyLinkedList myLinkedList10 = new myLinkedList.MyLinkedList((java.util.Collection)myLinkedList0);
    java.lang.Object obj11 = myLinkedList0.removeFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + '4'+ "'", obj11.equals('4'));

  }

  @Test(timeout=1000)
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    java.lang.Object obj7 = myLinkedList6.peek();
    myLinkedList6.addLast((java.lang.Object)(byte)100);
    boolean b10 = myLinkedList2.retainAll((java.util.Collection)myLinkedList6);
    boolean b11 = myLinkedList2.repOK();
    java.util.function.Consumer consumer12 = null;
    // The following exception was thrown during execution in test generation
    try {
      myLinkedList2.forEach(consumer12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test(timeout=1000)
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    java.lang.Object obj1 = myLinkedList0.peek();
    java.lang.Object[] obj_array2 = myLinkedList0.toArray();
    java.lang.Object obj3 = myLinkedList0.poll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test(timeout=1000)
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    java.lang.Object obj7 = myLinkedList6.peek();
    myLinkedList6.addLast((java.lang.Object)(byte)100);
    boolean b10 = myLinkedList2.retainAll((java.util.Collection)myLinkedList6);
    java.lang.Object[] obj_array11 = myLinkedList2.toArray();
    myLinkedList.MyLinkedList myLinkedList12 = new myLinkedList.MyLinkedList();
    boolean b13 = myLinkedList12.repOK();
    myLinkedList.MyLinkedList myLinkedList14 = new myLinkedList.MyLinkedList();
    boolean b15 = myLinkedList12.removeAll((java.util.Collection)myLinkedList14);
    myLinkedList.MyLinkedList myLinkedList16 = new myLinkedList.MyLinkedList();
    boolean b17 = myLinkedList16.repOK();
    myLinkedList.MyLinkedList myLinkedList18 = new myLinkedList.MyLinkedList();
    boolean b19 = myLinkedList18.repOK();
    int i20 = myLinkedList18.size();
    boolean b21 = myLinkedList16.retainAll((java.util.Collection)myLinkedList18);
    myLinkedList16.addFirst((java.lang.Object)(-1.0f));
    boolean b24 = myLinkedList12.offer((java.lang.Object)myLinkedList16);
    java.util.Comparator comparator25 = null;
    myLinkedList12.sort(comparator25);
    myLinkedList.MyLinkedList myLinkedList27 = new myLinkedList.MyLinkedList();
    boolean b28 = myLinkedList27.repOK();
    int i29 = myLinkedList27.size();
    boolean b31 = myLinkedList27.equals((java.lang.Object)(short)(-1));
    myLinkedList27.clear();
    java.lang.Object obj33 = myLinkedList27.pollFirst();
    java.lang.Object obj34 = myLinkedList27.pollLast();
    java.lang.Object obj35 = myLinkedList27.pollLast();
    boolean b36 = myLinkedList12.addAll((java.util.Collection)myLinkedList27);
    boolean b37 = myLinkedList2.containsAll((java.util.Collection)myLinkedList27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test(timeout=1000)
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    java.lang.Object obj7 = myLinkedList6.peek();
    myLinkedList6.addLast((java.lang.Object)(byte)100);
    boolean b10 = myLinkedList2.retainAll((java.util.Collection)myLinkedList6);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj11 = myLinkedList2.remove();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test(timeout=1000)
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    java.util.stream.Stream stream2 = myLinkedList0.parallelStream();
    myLinkedList.MyLinkedList myLinkedList3 = new myLinkedList.MyLinkedList();
    boolean b4 = myLinkedList3.repOK();
    int i5 = myLinkedList3.size();
    boolean b7 = myLinkedList3.equals((java.lang.Object)(short)(-1));
    myLinkedList3.clear();
    boolean b9 = myLinkedList0.offerFirst((java.lang.Object)myLinkedList3);
    java.lang.Object obj10 = myLinkedList3.peekLast();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test(timeout=1000)
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    myLinkedList0.addFirst((java.lang.Object)(-1.0f));
    java.util.Spliterator spliterator8 = myLinkedList0.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);

  }

  @Test(timeout=1000)
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    java.lang.Object obj7 = myLinkedList6.peek();
    myLinkedList6.addLast((java.lang.Object)(byte)100);
    boolean b10 = myLinkedList2.retainAll((java.util.Collection)myLinkedList6);
    java.lang.Object obj11 = myLinkedList6.poll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte)100+ "'", obj11.equals((byte)100));

  }

  @Test(timeout=1000)
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b2 = myLinkedList0.equals((java.lang.Object)100);
    int i3 = myLinkedList0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test(timeout=1000)
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    java.lang.Object obj1 = myLinkedList0.peekLast();
    boolean b3 = myLinkedList0.equals((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test(timeout=1000)
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b5 = myLinkedList4.repOK();
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    boolean b7 = myLinkedList6.repOK();
    int i8 = myLinkedList6.size();
    boolean b9 = myLinkedList4.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList4.addFirst((java.lang.Object)(-1.0f));
    boolean b12 = myLinkedList0.offer((java.lang.Object)myLinkedList4);
    java.util.Comparator comparator13 = null;
    myLinkedList0.sort(comparator13);
    myLinkedList.MyLinkedList myLinkedList15 = new myLinkedList.MyLinkedList();
    boolean b16 = myLinkedList15.repOK();
    int i17 = myLinkedList15.size();
    boolean b19 = myLinkedList15.equals((java.lang.Object)(short)(-1));
    myLinkedList15.clear();
    java.lang.Object obj21 = myLinkedList15.pollFirst();
    java.lang.Object obj22 = myLinkedList15.pollLast();
    java.lang.Object obj23 = myLinkedList15.pollLast();
    boolean b24 = myLinkedList0.addAll((java.util.Collection)myLinkedList15);
    java.lang.Object obj25 = myLinkedList0.peekFirst();
    java.util.stream.Stream stream26 = myLinkedList0.stream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream26);

  }

  @Test(timeout=1000)
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList0.clear();
    java.lang.Object obj6 = myLinkedList0.pollFirst();
    java.lang.Object obj7 = myLinkedList0.pollLast();
    java.lang.Object obj8 = myLinkedList0.peekFirst();
    java.util.function.Consumer consumer9 = null;
    // The following exception was thrown during execution in test generation
    try {
      myLinkedList0.forEach(consumer9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test(timeout=1000)
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    java.lang.Object obj7 = myLinkedList6.peek();
    myLinkedList6.addLast((java.lang.Object)(byte)100);
    boolean b10 = myLinkedList2.retainAll((java.util.Collection)myLinkedList6);
    boolean b11 = myLinkedList2.repOK();
    myLinkedList.MyLinkedList myLinkedList12 = new myLinkedList.MyLinkedList();
    boolean b13 = myLinkedList12.repOK();
    myLinkedList.MyLinkedList myLinkedList14 = new myLinkedList.MyLinkedList();
    boolean b15 = myLinkedList14.repOK();
    int i16 = myLinkedList14.size();
    boolean b17 = myLinkedList12.retainAll((java.util.Collection)myLinkedList14);
    myLinkedList.MyLinkedList myLinkedList18 = new myLinkedList.MyLinkedList();
    java.lang.Object obj19 = myLinkedList18.peek();
    myLinkedList18.addLast((java.lang.Object)(byte)100);
    boolean b22 = myLinkedList14.retainAll((java.util.Collection)myLinkedList18);
    boolean b23 = myLinkedList14.repOK();
    int i24 = myLinkedList14.size();
    boolean b25 = myLinkedList2.retainAll((java.util.Collection)myLinkedList14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test(timeout=1000)
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    java.lang.Object obj1 = myLinkedList0.peek();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    java.lang.Object obj3 = myLinkedList2.peek();
    boolean b4 = myLinkedList0.addAll((java.util.Collection)myLinkedList2);
    boolean b6 = myLinkedList0.remove((java.lang.Object)false);
    int i7 = myLinkedList0.size();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj9 = myLinkedList0.remove((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test(timeout=1000)
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList0.clear();
    java.lang.String str6 = myLinkedList0.toString();
    java.util.ListIterator listIterator7 = myLinkedList0.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listIterator7);

  }

  @Test(timeout=1000)
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    java.lang.Object obj5 = myLinkedList4.peek();
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    java.lang.Object obj7 = myLinkedList6.peek();
    boolean b8 = myLinkedList4.addAll((java.util.Collection)myLinkedList6);
    boolean b10 = myLinkedList4.remove((java.lang.Object)false);
    int i11 = myLinkedList4.size();
    boolean b12 = myLinkedList0.retainAll((java.util.Collection)myLinkedList4);
    java.util.function.Consumer consumer13 = null;
    // The following exception was thrown during execution in test generation
    try {
      myLinkedList4.forEach(consumer13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test(timeout=1000)
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    myLinkedList0.addFirst((java.lang.Object)(-1.0f));
    java.util.Iterator iterator8 = myLinkedList0.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);

  }

  @Test(timeout=1000)
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    java.lang.Object obj1 = myLinkedList0.peek();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    java.lang.Object obj3 = myLinkedList2.peek();
    boolean b4 = myLinkedList0.addAll((java.util.Collection)myLinkedList2);
    boolean b6 = myLinkedList0.remove((java.lang.Object)false);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj7 = myLinkedList0.removeFirst();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test(timeout=1000)
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    boolean b7 = myLinkedList2.removeFirstOccurrence((java.lang.Object)'a');
    myLinkedList.MyLinkedList myLinkedList8 = new myLinkedList.MyLinkedList();
    boolean b9 = myLinkedList8.repOK();
    int i10 = myLinkedList8.size();
    boolean b12 = myLinkedList8.equals((java.lang.Object)(short)(-1));
    myLinkedList8.clear();
    java.lang.Object obj14 = myLinkedList8.pollFirst();
    java.util.ListIterator listIterator15 = myLinkedList8.listIterator();
    boolean b16 = myLinkedList8.repOK();
    boolean b18 = myLinkedList8.removeLastOccurrence((java.lang.Object)(byte)(-1));
    boolean b19 = myLinkedList2.removeLastOccurrence((java.lang.Object)b18);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj20 = myLinkedList2.getFirst();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listIterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test(timeout=1000)
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    java.lang.Object obj7 = myLinkedList6.peek();
    myLinkedList6.addLast((java.lang.Object)(byte)100);
    boolean b10 = myLinkedList2.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList.MyLinkedList myLinkedList11 = new myLinkedList.MyLinkedList();
    java.lang.Object obj12 = myLinkedList11.peek();
    myLinkedList.MyLinkedList myLinkedList13 = new myLinkedList.MyLinkedList();
    java.lang.Object obj14 = myLinkedList13.peek();
    boolean b15 = myLinkedList11.addAll((java.util.Collection)myLinkedList13);
    boolean b17 = myLinkedList11.remove((java.lang.Object)false);
    int i18 = myLinkedList11.size();
    boolean b19 = myLinkedList2.removeFirstOccurrence((java.lang.Object)myLinkedList11);
    myLinkedList.MyLinkedList myLinkedList20 = new myLinkedList.MyLinkedList();
    boolean b21 = myLinkedList20.repOK();
    myLinkedList.MyLinkedList myLinkedList22 = new myLinkedList.MyLinkedList();
    boolean b23 = myLinkedList20.removeAll((java.util.Collection)myLinkedList22);
    myLinkedList.MyLinkedList myLinkedList24 = new myLinkedList.MyLinkedList();
    boolean b25 = myLinkedList24.repOK();
    myLinkedList.MyLinkedList myLinkedList26 = new myLinkedList.MyLinkedList();
    boolean b27 = myLinkedList26.repOK();
    int i28 = myLinkedList26.size();
    boolean b29 = myLinkedList24.retainAll((java.util.Collection)myLinkedList26);
    myLinkedList24.addFirst((java.lang.Object)(-1.0f));
    boolean b32 = myLinkedList20.offer((java.lang.Object)myLinkedList24);
    boolean b33 = myLinkedList2.insertar((java.lang.Object)myLinkedList24);
    myLinkedList.MyLinkedList myLinkedList34 = new myLinkedList.MyLinkedList();
    java.lang.Object obj35 = myLinkedList34.peek();
    boolean b37 = myLinkedList34.contains((java.lang.Object)100.0d);
    boolean b38 = myLinkedList24.retainAll((java.util.Collection)myLinkedList34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

  }

  @Test(timeout=1000)
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b5 = myLinkedList4.repOK();
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    boolean b7 = myLinkedList6.repOK();
    int i8 = myLinkedList6.size();
    boolean b9 = myLinkedList4.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList4.addFirst((java.lang.Object)(-1.0f));
    boolean b12 = myLinkedList0.offer((java.lang.Object)myLinkedList4);
    java.util.Comparator comparator13 = null;
    myLinkedList0.sort(comparator13);
    myLinkedList.MyLinkedList myLinkedList15 = new myLinkedList.MyLinkedList();
    boolean b16 = myLinkedList15.repOK();
    int i17 = myLinkedList15.size();
    boolean b19 = myLinkedList15.equals((java.lang.Object)(short)(-1));
    myLinkedList15.clear();
    java.lang.Object obj21 = myLinkedList15.pollFirst();
    java.lang.Object obj22 = myLinkedList15.pollLast();
    java.lang.Object obj23 = myLinkedList15.pollLast();
    boolean b24 = myLinkedList0.addAll((java.util.Collection)myLinkedList15);
    java.lang.Object obj25 = myLinkedList0.peekFirst();
    java.util.Iterator iterator26 = myLinkedList0.descendingIterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);

  }

  @Test(timeout=1000)
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList0.clear();
    java.lang.Object obj6 = myLinkedList0.pollFirst();
    java.util.ListIterator listIterator7 = myLinkedList0.listIterator();
    java.lang.String str8 = myLinkedList0.toString();
    myLinkedList.MyLinkedList myLinkedList9 = new myLinkedList.MyLinkedList();
    java.lang.Object obj10 = myLinkedList9.peek();
    boolean b11 = myLinkedList0.contains(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listIterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test(timeout=1000)
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b5 = myLinkedList4.repOK();
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    boolean b7 = myLinkedList6.repOK();
    int i8 = myLinkedList6.size();
    boolean b9 = myLinkedList4.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList4.addFirst((java.lang.Object)(-1.0f));
    boolean b12 = myLinkedList0.offer((java.lang.Object)myLinkedList4);
    java.util.Comparator comparator13 = null;
    myLinkedList0.sort(comparator13);
    myLinkedList.MyLinkedList myLinkedList15 = new myLinkedList.MyLinkedList();
    boolean b16 = myLinkedList15.repOK();
    int i17 = myLinkedList15.size();
    boolean b19 = myLinkedList15.equals((java.lang.Object)(short)(-1));
    myLinkedList15.clear();
    java.lang.Object obj21 = myLinkedList15.pollFirst();
    java.lang.Object obj22 = myLinkedList15.pollLast();
    java.lang.Object obj23 = myLinkedList15.pollLast();
    boolean b24 = myLinkedList0.addAll((java.util.Collection)myLinkedList15);
    java.lang.Object obj25 = myLinkedList0.peekFirst();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj27 = myLinkedList0.get((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);

  }

  @Test(timeout=1000)
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    java.lang.Object obj1 = myLinkedList0.peek();
    java.lang.Object[] obj_array2 = myLinkedList0.toArray();
    java.util.ListIterator listIterator3 = myLinkedList0.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listIterator3);

  }

  @Test(timeout=1000)
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    boolean b7 = myLinkedList2.removeFirstOccurrence((java.lang.Object)'a');
    myLinkedList.MyLinkedList myLinkedList9 = new myLinkedList.MyLinkedList();
    boolean b10 = myLinkedList9.repOK();
    java.util.stream.Stream stream11 = myLinkedList9.parallelStream();
    // The following exception was thrown during execution in test generation
    try {
      myLinkedList2.add(1, (java.lang.Object)myLinkedList9);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream11);

  }

  @Test(timeout=1000)
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList.MyLinkedList myLinkedList5 = new myLinkedList.MyLinkedList();
    boolean b6 = myLinkedList5.repOK();
    int i7 = myLinkedList5.size();
    boolean b9 = myLinkedList5.equals((java.lang.Object)(short)(-1));
    myLinkedList5.clear();
    java.lang.Object obj11 = myLinkedList5.pollFirst();
    java.util.ListIterator listIterator12 = myLinkedList5.listIterator();
    java.lang.String str13 = myLinkedList5.toString();
    myLinkedList.MyLinkedList myLinkedList14 = new myLinkedList.MyLinkedList();
    java.lang.Object obj15 = myLinkedList14.peek();
    myLinkedList.MyLinkedList myLinkedList16 = new myLinkedList.MyLinkedList();
    java.lang.Object obj17 = myLinkedList16.peek();
    boolean b18 = myLinkedList14.addAll((java.util.Collection)myLinkedList16);
    myLinkedList5.push((java.lang.Object)myLinkedList16);
    boolean b20 = myLinkedList0.offerLast((java.lang.Object)myLinkedList5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listIterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test(timeout=1000)
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    int i1 = myLinkedList0.size();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b5 = myLinkedList4.repOK();
    int i6 = myLinkedList4.size();
    boolean b7 = myLinkedList2.retainAll((java.util.Collection)myLinkedList4);
    myLinkedList.MyLinkedList myLinkedList8 = new myLinkedList.MyLinkedList();
    java.lang.Object obj9 = myLinkedList8.peek();
    myLinkedList8.addLast((java.lang.Object)(byte)100);
    boolean b12 = myLinkedList4.retainAll((java.util.Collection)myLinkedList8);
    boolean b13 = myLinkedList4.repOK();
    boolean b14 = myLinkedList0.offerLast((java.lang.Object)b13);
    myLinkedList.MyLinkedList myLinkedList15 = new myLinkedList.MyLinkedList();
    boolean b16 = myLinkedList15.repOK();
    myLinkedList.MyLinkedList myLinkedList17 = new myLinkedList.MyLinkedList();
    boolean b18 = myLinkedList17.repOK();
    int i19 = myLinkedList17.size();
    boolean b20 = myLinkedList15.retainAll((java.util.Collection)myLinkedList17);
    myLinkedList.MyLinkedList myLinkedList21 = new myLinkedList.MyLinkedList();
    java.lang.Object obj22 = myLinkedList21.peek();
    myLinkedList21.addLast((java.lang.Object)(byte)100);
    boolean b25 = myLinkedList17.retainAll((java.util.Collection)myLinkedList21);
    java.lang.Object obj26 = myLinkedList21.pollFirst();
    boolean b27 = myLinkedList0.containsAll((java.util.Collection)myLinkedList21);
    boolean b28 = myLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte)100+ "'", obj26.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test(timeout=1000)
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b5 = myLinkedList4.repOK();
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    boolean b7 = myLinkedList6.repOK();
    int i8 = myLinkedList6.size();
    boolean b9 = myLinkedList4.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList4.addFirst((java.lang.Object)(-1.0f));
    boolean b12 = myLinkedList0.offer((java.lang.Object)myLinkedList4);
    java.lang.Object obj13 = myLinkedList4.remove();
    java.lang.Object obj14 = myLinkedList4.peekFirst();
    java.lang.Object obj15 = myLinkedList4.peekLast();
    java.util.Iterator iterator16 = myLinkedList4.descendingIterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1.0f)+ "'", obj13.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);

  }

  @Test(timeout=1000)
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b5 = myLinkedList4.repOK();
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    boolean b7 = myLinkedList6.repOK();
    int i8 = myLinkedList6.size();
    boolean b9 = myLinkedList4.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList4.addFirst((java.lang.Object)(-1.0f));
    boolean b12 = myLinkedList0.offer((java.lang.Object)myLinkedList4);
    java.lang.Object obj13 = myLinkedList4.remove();
    myLinkedList.MyLinkedList myLinkedList14 = new myLinkedList.MyLinkedList();
    boolean b15 = myLinkedList14.repOK();
    myLinkedList.MyLinkedList myLinkedList16 = new myLinkedList.MyLinkedList();
    boolean b17 = myLinkedList16.repOK();
    int i18 = myLinkedList16.size();
    boolean b19 = myLinkedList14.retainAll((java.util.Collection)myLinkedList16);
    myLinkedList.MyLinkedList myLinkedList20 = new myLinkedList.MyLinkedList();
    java.lang.Object obj21 = myLinkedList20.peek();
    myLinkedList20.addLast((java.lang.Object)(byte)100);
    boolean b24 = myLinkedList16.retainAll((java.util.Collection)myLinkedList20);
    boolean b25 = myLinkedList16.repOK();
    int i26 = myLinkedList16.size();
    myLinkedList.MyLinkedList myLinkedList27 = new myLinkedList.MyLinkedList();
    boolean b28 = myLinkedList27.repOK();
    myLinkedList.MyLinkedList myLinkedList29 = new myLinkedList.MyLinkedList();
    boolean b30 = myLinkedList29.repOK();
    int i31 = myLinkedList29.size();
    boolean b32 = myLinkedList27.retainAll((java.util.Collection)myLinkedList29);
    myLinkedList.MyLinkedList myLinkedList33 = new myLinkedList.MyLinkedList();
    java.lang.Object obj34 = myLinkedList33.peek();
    myLinkedList33.addLast((java.lang.Object)(byte)100);
    boolean b37 = myLinkedList29.retainAll((java.util.Collection)myLinkedList33);
    myLinkedList.MyLinkedList myLinkedList38 = new myLinkedList.MyLinkedList();
    java.lang.Object obj39 = myLinkedList38.peek();
    myLinkedList.MyLinkedList myLinkedList40 = new myLinkedList.MyLinkedList();
    java.lang.Object obj41 = myLinkedList40.peek();
    boolean b42 = myLinkedList38.addAll((java.util.Collection)myLinkedList40);
    boolean b44 = myLinkedList38.remove((java.lang.Object)false);
    int i45 = myLinkedList38.size();
    boolean b46 = myLinkedList29.removeFirstOccurrence((java.lang.Object)myLinkedList38);
    boolean b47 = myLinkedList16.equals((java.lang.Object)myLinkedList38);
    boolean b48 = myLinkedList4.retainAll((java.util.Collection)myLinkedList16);
    myLinkedList.MyLinkedList myLinkedList49 = new myLinkedList.MyLinkedList();
    boolean b50 = myLinkedList49.repOK();
    int i51 = myLinkedList49.size();
    boolean b53 = myLinkedList49.equals((java.lang.Object)(short)(-1));
    myLinkedList49.clear();
    java.lang.Object obj55 = myLinkedList49.pollFirst();
    boolean b57 = myLinkedList49.offerFirst((java.lang.Object)'4');
    java.lang.Object obj58 = myLinkedList49.clone();
    myLinkedList.MyLinkedList myLinkedList59 = new myLinkedList.MyLinkedList((java.util.Collection)myLinkedList49);
    boolean b60 = myLinkedList16.removeAll((java.util.Collection)myLinkedList49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1.0f)+ "'", obj13.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test(timeout=1000)
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b2 = myLinkedList0.equals((java.lang.Object)100);
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b6 = myLinkedList4.equals((java.lang.Object)100);
    java.lang.Object obj7 = myLinkedList4.peek();
    // The following exception was thrown during execution in test generation
    try {
      boolean b8 = myLinkedList0.addAll(100, (java.util.Collection)myLinkedList4);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test(timeout=1000)
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b5 = myLinkedList4.repOK();
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    boolean b7 = myLinkedList6.repOK();
    int i8 = myLinkedList6.size();
    boolean b9 = myLinkedList4.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList4.addFirst((java.lang.Object)(-1.0f));
    boolean b12 = myLinkedList0.offer((java.lang.Object)myLinkedList4);
    java.util.Comparator comparator13 = null;
    myLinkedList0.sort(comparator13);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj17 = myLinkedList0.set((-1), (java.lang.Object)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test(timeout=1000)
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList0.clear();
    java.lang.Object obj6 = myLinkedList0.pollFirst();
    java.util.ListIterator listIterator7 = myLinkedList0.listIterator();
    myLinkedList.MyLinkedList myLinkedList9 = new myLinkedList.MyLinkedList();
    boolean b10 = myLinkedList9.repOK();
    myLinkedList.MyLinkedList myLinkedList11 = new myLinkedList.MyLinkedList();
    boolean b12 = myLinkedList9.removeAll((java.util.Collection)myLinkedList11);
    myLinkedList.MyLinkedList myLinkedList13 = new myLinkedList.MyLinkedList();
    boolean b14 = myLinkedList13.repOK();
    myLinkedList.MyLinkedList myLinkedList15 = new myLinkedList.MyLinkedList();
    boolean b16 = myLinkedList15.repOK();
    int i17 = myLinkedList15.size();
    boolean b18 = myLinkedList13.retainAll((java.util.Collection)myLinkedList15);
    myLinkedList13.addFirst((java.lang.Object)(-1.0f));
    boolean b21 = myLinkedList9.offer((java.lang.Object)myLinkedList13);
    java.util.Comparator comparator22 = null;
    myLinkedList9.sort(comparator22);
    boolean b24 = myLinkedList0.addAll(0, (java.util.Collection)myLinkedList9);
    java.lang.Object obj26 = myLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listIterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj26);

  }

  @Test(timeout=1000)
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    int i1 = myLinkedList0.size();
    java.lang.Object obj2 = myLinkedList0.pollLast();
    java.util.function.Predicate predicate3 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b4 = myLinkedList0.removeIf(predicate3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test(timeout=1000)
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    boolean b7 = myLinkedList2.removeFirstOccurrence((java.lang.Object)'a');
    boolean b8 = myLinkedList2.isEmpty();
    int i9 = myLinkedList2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test(timeout=1000)
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj6 = myLinkedList2.element();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test(timeout=1000)
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList0.clear();
    java.lang.Object obj6 = myLinkedList0.pollFirst();
    java.util.ListIterator listIterator7 = myLinkedList0.listIterator();
    java.lang.String str8 = myLinkedList0.toString();
    myLinkedList.MyLinkedList myLinkedList9 = new myLinkedList.MyLinkedList();
    boolean b10 = myLinkedList9.repOK();
    myLinkedList.MyLinkedList myLinkedList11 = new myLinkedList.MyLinkedList();
    boolean b12 = myLinkedList11.repOK();
    int i13 = myLinkedList11.size();
    boolean b14 = myLinkedList9.retainAll((java.util.Collection)myLinkedList11);
    myLinkedList.MyLinkedList myLinkedList15 = new myLinkedList.MyLinkedList();
    java.lang.Object obj16 = myLinkedList15.peek();
    myLinkedList15.addLast((java.lang.Object)(byte)100);
    boolean b19 = myLinkedList11.retainAll((java.util.Collection)myLinkedList15);
    boolean b20 = myLinkedList11.repOK();
    myLinkedList.MyLinkedList myLinkedList21 = new myLinkedList.MyLinkedList();
    boolean b22 = myLinkedList21.repOK();
    int i23 = myLinkedList21.size();
    java.util.Iterator iterator24 = myLinkedList21.descendingIterator();
    myLinkedList11.addLast((java.lang.Object)iterator24);
    myLinkedList0.push((java.lang.Object)myLinkedList11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listIterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);

  }

  @Test(timeout=1000)
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList0.clear();
    java.lang.Object obj6 = myLinkedList0.pollFirst();
    java.util.ListIterator listIterator7 = myLinkedList0.listIterator();
    boolean b8 = myLinkedList0.repOK();
    java.util.Iterator iterator9 = myLinkedList0.iterator();
    myLinkedList.MyLinkedList myLinkedList10 = new myLinkedList.MyLinkedList();
    boolean b11 = myLinkedList10.repOK();
    myLinkedList.MyLinkedList myLinkedList12 = new myLinkedList.MyLinkedList();
    boolean b13 = myLinkedList12.repOK();
    int i14 = myLinkedList12.size();
    boolean b15 = myLinkedList10.retainAll((java.util.Collection)myLinkedList12);
    myLinkedList.MyLinkedList myLinkedList16 = new myLinkedList.MyLinkedList();
    java.lang.Object obj17 = myLinkedList16.peek();
    myLinkedList16.addLast((java.lang.Object)(byte)100);
    boolean b20 = myLinkedList12.retainAll((java.util.Collection)myLinkedList16);
    boolean b21 = myLinkedList12.repOK();
    boolean b22 = myLinkedList0.remove((java.lang.Object)myLinkedList12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listIterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test(timeout=1000)
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    java.lang.Object obj1 = myLinkedList0.peek();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    java.lang.Object obj3 = myLinkedList2.peek();
    boolean b4 = myLinkedList0.addAll((java.util.Collection)myLinkedList2);
    java.lang.String str5 = myLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]"+ "'", str5.equals("[null]"));

  }

  @Test(timeout=1000)
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList0.clear();
    java.lang.Object obj6 = myLinkedList0.pollFirst();
    boolean b8 = myLinkedList0.offerFirst((java.lang.Object)'4');
    java.lang.Object obj9 = myLinkedList0.clone();
    myLinkedList.MyLinkedList myLinkedList10 = new myLinkedList.MyLinkedList((java.util.Collection)myLinkedList0);
    java.lang.Object obj11 = myLinkedList10.removeFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + '4'+ "'", obj11.equals('4'));

  }

  @Test(timeout=1000)
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList0.clear();
    java.lang.Object obj6 = myLinkedList0.pollFirst();
    boolean b8 = myLinkedList0.offerFirst((java.lang.Object)'4');
    java.lang.Object obj9 = myLinkedList0.clone();
    myLinkedList.MyLinkedList myLinkedList10 = new myLinkedList.MyLinkedList((java.util.Collection)myLinkedList0);
    java.util.Comparator comparator11 = null;
    // The following exception was thrown during execution in test generation
    try {
      myLinkedList10.sort(comparator11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);

  }

  @Test(timeout=1000)
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    java.lang.Object obj7 = myLinkedList6.peek();
    myLinkedList6.addLast((java.lang.Object)(byte)100);
    boolean b10 = myLinkedList2.retainAll((java.util.Collection)myLinkedList6);
    java.lang.Object[] obj_array11 = myLinkedList2.toArray();
    java.lang.Object obj12 = myLinkedList2.pollLast();
    boolean b14 = myLinkedList2.insertar((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test(timeout=1000)
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList0.clear();
    java.lang.Object obj6 = myLinkedList0.pollFirst();
    boolean b8 = myLinkedList0.offerFirst((java.lang.Object)'4');
    java.lang.Object obj9 = myLinkedList0.clone();
    myLinkedList.MyLinkedList myLinkedList10 = new myLinkedList.MyLinkedList((java.util.Collection)myLinkedList0);
    myLinkedList.MyLinkedList myLinkedList11 = new myLinkedList.MyLinkedList();
    boolean b12 = myLinkedList0.containsAll((java.util.Collection)myLinkedList11);
    boolean b14 = myLinkedList0.offerFirst((java.lang.Object)0L);
    myLinkedList.MyLinkedList myLinkedList15 = new myLinkedList.MyLinkedList();
    boolean b16 = myLinkedList15.repOK();
    myLinkedList.MyLinkedList myLinkedList17 = new myLinkedList.MyLinkedList();
    boolean b18 = myLinkedList15.removeAll((java.util.Collection)myLinkedList17);
    java.util.Iterator iterator19 = myLinkedList17.descendingIterator();
    myLinkedList0.addLast((java.lang.Object)myLinkedList17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator19);

  }

  @Test(timeout=1000)
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test67"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b5 = myLinkedList4.repOK();
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    boolean b7 = myLinkedList6.repOK();
    int i8 = myLinkedList6.size();
    boolean b9 = myLinkedList4.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList4.addFirst((java.lang.Object)(-1.0f));
    boolean b12 = myLinkedList0.offer((java.lang.Object)myLinkedList4);
    java.lang.Object obj13 = myLinkedList0.peekFirst();
    java.lang.Object obj14 = myLinkedList0.clone();
    java.util.function.Predicate predicate15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = myLinkedList0.removeIf(predicate15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);

  }

  @Test(timeout=1000)
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test68"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList0.clear();
    java.lang.Object obj6 = myLinkedList0.pollFirst();
    java.util.ListIterator listIterator7 = myLinkedList0.listIterator();
    myLinkedList.MyLinkedList myLinkedList9 = new myLinkedList.MyLinkedList();
    boolean b10 = myLinkedList9.repOK();
    myLinkedList.MyLinkedList myLinkedList11 = new myLinkedList.MyLinkedList();
    boolean b12 = myLinkedList9.removeAll((java.util.Collection)myLinkedList11);
    myLinkedList.MyLinkedList myLinkedList13 = new myLinkedList.MyLinkedList();
    boolean b14 = myLinkedList13.repOK();
    myLinkedList.MyLinkedList myLinkedList15 = new myLinkedList.MyLinkedList();
    boolean b16 = myLinkedList15.repOK();
    int i17 = myLinkedList15.size();
    boolean b18 = myLinkedList13.retainAll((java.util.Collection)myLinkedList15);
    myLinkedList13.addFirst((java.lang.Object)(-1.0f));
    boolean b21 = myLinkedList9.offer((java.lang.Object)myLinkedList13);
    java.util.Comparator comparator22 = null;
    myLinkedList9.sort(comparator22);
    boolean b24 = myLinkedList0.addAll(0, (java.util.Collection)myLinkedList9);
    java.util.Comparator comparator25 = null;
    myLinkedList0.sort(comparator25);
    java.lang.Object obj27 = myLinkedList0.pollFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listIterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);

  }

  @Test(timeout=1000)
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test69"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b5 = myLinkedList4.repOK();
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    boolean b7 = myLinkedList6.repOK();
    int i8 = myLinkedList6.size();
    boolean b9 = myLinkedList4.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList4.addFirst((java.lang.Object)(-1.0f));
    boolean b12 = myLinkedList0.offer((java.lang.Object)myLinkedList4);
    java.lang.Object obj13 = myLinkedList4.remove();
    myLinkedList.MyLinkedList myLinkedList14 = new myLinkedList.MyLinkedList();
    int i15 = myLinkedList14.size();
    boolean b16 = myLinkedList4.insertar((java.lang.Object)i15);
    boolean b17 = myLinkedList4.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1.0f)+ "'", obj13.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test(timeout=1000)
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test70"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList2.repOK();
    int i4 = myLinkedList2.size();
    boolean b5 = myLinkedList0.retainAll((java.util.Collection)myLinkedList2);
    boolean b7 = myLinkedList2.removeFirstOccurrence((java.lang.Object)'a');
    boolean b8 = myLinkedList2.isEmpty();
    java.util.ListIterator listIterator9 = myLinkedList2.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listIterator9);

  }

  @Test(timeout=1000)
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test71"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    java.util.stream.Stream stream2 = myLinkedList0.parallelStream();
    java.lang.String str3 = myLinkedList0.toString();
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b5 = myLinkedList4.repOK();
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    boolean b7 = myLinkedList6.repOK();
    int i8 = myLinkedList6.size();
    boolean b9 = myLinkedList4.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList.MyLinkedList myLinkedList10 = new myLinkedList.MyLinkedList();
    java.lang.Object obj11 = myLinkedList10.peek();
    myLinkedList10.addLast((java.lang.Object)(byte)100);
    boolean b14 = myLinkedList6.retainAll((java.util.Collection)myLinkedList10);
    java.lang.Object[] obj_array15 = myLinkedList6.toArray();
    java.lang.Object obj16 = myLinkedList6.pollLast();
    java.util.ListIterator listIterator18 = myLinkedList6.listIterator(0);
    boolean b19 = myLinkedList0.contains((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listIterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test(timeout=1000)
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test72"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    int i2 = myLinkedList0.size();
    boolean b4 = myLinkedList0.equals((java.lang.Object)(short)(-1));
    myLinkedList0.clear();
    java.lang.Object obj6 = myLinkedList0.pollFirst();
    java.util.ListIterator listIterator7 = myLinkedList0.listIterator();
    boolean b8 = myLinkedList0.repOK();
    java.util.Comparator comparator9 = null;
    myLinkedList0.sort(comparator9);
    java.lang.String str11 = myLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listIterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));

  }

  @Test(timeout=1000)
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test73"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b5 = myLinkedList4.repOK();
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    boolean b7 = myLinkedList6.repOK();
    int i8 = myLinkedList6.size();
    boolean b9 = myLinkedList4.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList4.addFirst((java.lang.Object)(-1.0f));
    boolean b12 = myLinkedList0.offer((java.lang.Object)myLinkedList4);
    java.lang.Object obj13 = myLinkedList0.peekFirst();
    java.lang.Object obj14 = myLinkedList0.pollFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);

  }

  @Test(timeout=1000)
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test74"); }


    myLinkedList.MyLinkedList myLinkedList0 = new myLinkedList.MyLinkedList();
    boolean b1 = myLinkedList0.repOK();
    myLinkedList.MyLinkedList myLinkedList2 = new myLinkedList.MyLinkedList();
    boolean b3 = myLinkedList0.removeAll((java.util.Collection)myLinkedList2);
    myLinkedList.MyLinkedList myLinkedList4 = new myLinkedList.MyLinkedList();
    boolean b5 = myLinkedList4.repOK();
    myLinkedList.MyLinkedList myLinkedList6 = new myLinkedList.MyLinkedList();
    boolean b7 = myLinkedList6.repOK();
    int i8 = myLinkedList6.size();
    boolean b9 = myLinkedList4.retainAll((java.util.Collection)myLinkedList6);
    myLinkedList4.addFirst((java.lang.Object)(-1.0f));
    boolean b12 = myLinkedList0.offer((java.lang.Object)myLinkedList4);
    java.lang.Object obj13 = myLinkedList4.remove();
    myLinkedList.MyLinkedList myLinkedList14 = new myLinkedList.MyLinkedList();
    boolean b15 = myLinkedList14.repOK();
    myLinkedList.MyLinkedList myLinkedList16 = new myLinkedList.MyLinkedList();
    boolean b17 = myLinkedList16.repOK();
    int i18 = myLinkedList16.size();
    boolean b19 = myLinkedList14.retainAll((java.util.Collection)myLinkedList16);
    myLinkedList.MyLinkedList myLinkedList20 = new myLinkedList.MyLinkedList();
    java.lang.Object obj21 = myLinkedList20.peek();
    myLinkedList20.addLast((java.lang.Object)(byte)100);
    boolean b24 = myLinkedList16.retainAll((java.util.Collection)myLinkedList20);
    boolean b25 = myLinkedList16.repOK();
    int i26 = myLinkedList16.size();
    myLinkedList.MyLinkedList myLinkedList27 = new myLinkedList.MyLinkedList();
    boolean b28 = myLinkedList27.repOK();
    myLinkedList.MyLinkedList myLinkedList29 = new myLinkedList.MyLinkedList();
    boolean b30 = myLinkedList29.repOK();
    int i31 = myLinkedList29.size();
    boolean b32 = myLinkedList27.retainAll((java.util.Collection)myLinkedList29);
    myLinkedList.MyLinkedList myLinkedList33 = new myLinkedList.MyLinkedList();
    java.lang.Object obj34 = myLinkedList33.peek();
    myLinkedList33.addLast((java.lang.Object)(byte)100);
    boolean b37 = myLinkedList29.retainAll((java.util.Collection)myLinkedList33);
    myLinkedList.MyLinkedList myLinkedList38 = new myLinkedList.MyLinkedList();
    java.lang.Object obj39 = myLinkedList38.peek();
    myLinkedList.MyLinkedList myLinkedList40 = new myLinkedList.MyLinkedList();
    java.lang.Object obj41 = myLinkedList40.peek();
    boolean b42 = myLinkedList38.addAll((java.util.Collection)myLinkedList40);
    boolean b44 = myLinkedList38.remove((java.lang.Object)false);
    int i45 = myLinkedList38.size();
    boolean b46 = myLinkedList29.removeFirstOccurrence((java.lang.Object)myLinkedList38);
    boolean b47 = myLinkedList16.equals((java.lang.Object)myLinkedList38);
    boolean b48 = myLinkedList4.retainAll((java.util.Collection)myLinkedList16);
    myLinkedList.MyLinkedList myLinkedList49 = new myLinkedList.MyLinkedList();
    boolean b50 = myLinkedList49.repOK();
    myLinkedList.MyLinkedList myLinkedList51 = new myLinkedList.MyLinkedList();
    boolean b52 = myLinkedList51.repOK();
    int i53 = myLinkedList51.size();
    boolean b54 = myLinkedList49.retainAll((java.util.Collection)myLinkedList51);
    myLinkedList.MyLinkedList myLinkedList55 = new myLinkedList.MyLinkedList();
    java.lang.Object obj56 = myLinkedList55.peek();
    myLinkedList55.addLast((java.lang.Object)(byte)100);
    boolean b59 = myLinkedList51.retainAll((java.util.Collection)myLinkedList55);
    myLinkedList.MyLinkedList myLinkedList60 = new myLinkedList.MyLinkedList();
    java.lang.Object obj61 = myLinkedList60.peek();
    myLinkedList.MyLinkedList myLinkedList62 = new myLinkedList.MyLinkedList();
    java.lang.Object obj63 = myLinkedList62.peek();
    boolean b64 = myLinkedList60.addAll((java.util.Collection)myLinkedList62);
    boolean b66 = myLinkedList60.remove((java.lang.Object)false);
    int i67 = myLinkedList60.size();
    boolean b68 = myLinkedList51.removeFirstOccurrence((java.lang.Object)myLinkedList60);
    myLinkedList.MyLinkedList myLinkedList69 = new myLinkedList.MyLinkedList();
    boolean b70 = myLinkedList69.repOK();
    myLinkedList.MyLinkedList myLinkedList71 = new myLinkedList.MyLinkedList();
    boolean b72 = myLinkedList69.removeAll((java.util.Collection)myLinkedList71);
    myLinkedList.MyLinkedList myLinkedList73 = new myLinkedList.MyLinkedList();
    boolean b74 = myLinkedList73.repOK();
    myLinkedList.MyLinkedList myLinkedList75 = new myLinkedList.MyLinkedList();
    boolean b76 = myLinkedList75.repOK();
    int i77 = myLinkedList75.size();
    boolean b78 = myLinkedList73.retainAll((java.util.Collection)myLinkedList75);
    myLinkedList73.addFirst((java.lang.Object)(-1.0f));
    boolean b81 = myLinkedList69.offer((java.lang.Object)myLinkedList73);
    boolean b82 = myLinkedList51.insertar((java.lang.Object)myLinkedList73);
    boolean b83 = myLinkedList16.contains((java.lang.Object)myLinkedList73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1.0f)+ "'", obj13.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);

  }

}
