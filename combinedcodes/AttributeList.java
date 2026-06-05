package combinedcodes;

import java.util.*;
import java.util.ArrayList;

import javax.naming.directory.Attribute;
import javax.management.RuntimeOperationsException;

/**
 * Represents a list of MBean {@link Attribute}s, with their
 * names and values.  This is implemented as an
 * {@link java.util.ArrayList} extension, with additional
 * methods typed to only allow the addition of {@link Attribute}s.
 *
 * @author Andrew John Hughes (gnu_andrew@member.fsf.org)
 * @since 1.5
 */
public class AttributeList
  extends ArrayList<Object>
{

  /**
   * Compatible with JDK 1.5
   */
  private static final long serialVersionUID = -4077085769279709076L;

  /**
   * Constructs an empty list with an initial capacity of ten.
   *
   * @see java.util.ArrayList#ArrayList()
   */
  public AttributeList()
  {
    super();
    // @@@ the list is empty after creation
    // assert this.isEmpty();
    // @@@ The size of the list is zero when it is initially created.
    // assert this.size()==0;
  }

  /**
   * Constructs an {@link AttributeList} using the contents
   * of an existing list.  The initial capacity is 110% of the
   * size of the specified list.
   *
   * @param list the list to use to fill this list.
   * @see java.util.ArrayList#ArrayList(java.util.Collection)
   */
  public AttributeList(AttributeList list)
  {
    super(list);
    // @@@ If the list is not null, then the size of this list is equal to the size of the provided list.
    // assert list!=null => this.size()==list.size();
    // @@@ If the list is not null, then for every valid index in this list, the element at that index is the same as the element at the same index in the original list.
    // assert list!=null => \forall int i; 0<=i&&i<this.size(); this.get(i)==list.get(i);
    // @@@ If the list is not null, then this list is equal to the provided list.
    // assert list!=null => this.equals(list);
  }

  /**
   * Constructs an empty list with the specified initial capacity.
   *
   * @param capacity the initial capacity of the list.
   * @see java.util.ArrayList#ArrayList(int)
   */
  public AttributeList(int initialCapacity)
  {
    super(initialCapacity);
    // @@@ If the initial capacity is greater than or equal to 0, then the list is empty.
    // assert initialCapacity>=0 => this.isEmpty();
    // @@@ If the initial capacity is greater than or equal to 0, then the size of the list is 0.
    // assert initialCapacity>=0 => this.size()==0;
  }

  /**
   * Adds the specified {@link Attribute} to the end of the list.
   *
   * @param attribute the attribute to add.
   * @see java.util.Arraylist#add(Object)
   */
  public void add(Attribute attribute)
  {
    super.add(attribute);
    // @@@ The list contains the specified attribute after it is added.
    // assert this.contains(attribute);
    // @@@ If the attribute is null, then the last element in the list is also null; if the attribute is not null, then it equals the last element in the list.
    // assert attribute==null && this.get(this.size()-1)==null || attribute!=null && attribute.equals(this.get(this.size()-1));
  }

  /**
   * <p>
   * Adds the specified {@link Attribute} at the supplied index.
   * Any attribute already at that index is moved up one place
   * in the list to the position <code>(index + 1)</code>.
   * Likewise, the attribute at <code>(index + 1)</code> is
   * also moved up one place, continuing until the final
   * attribute in the list moves to a new position, increasing
   * the size of the list.
   * </p>
   * <p>
   * If the index is invalid (i.e. it is smaller than zero, or
   * greater than the current size of the list), a
   * @link{RuntimeOperationsException} is thrown, which wraps
   * the @link{IndexOutOfBoundsException} from the underlying
   * array list.
   * </p>
   * 
   * @param index the index at which to place the new attribute.
   * @param attribute the new attribute to add.
   * @throws RuntimeOperationsException if <code>index < 0</code>
   *                                    or <code>index > size()</code>
   * @see java.util.ArrayList#add(int, Object)
   */
  public void add(int index, Attribute attribute)
  {
    try
      {
    super.add(index, attribute);
      }
    catch (IndexOutOfBoundsException e)
      {
    throw new RuntimeOperationsException(e, "Invalid index.");
      }
    // @@@ If the index is valid (between 0 and the initial size of the list inclusive), then the list contains the added attribute.
    // assert index>=0 && index<=\old(this.size()) => this.contains(attribute);
    // @@@ If the index is valid (between 0 and the initial size of the list inclusive), then if the attribute is null, the attribute at that index is also null, or the attribute at that index equals the added attribute.
    // assert index>=0 && index<=\old(this.size()) => attribute==null&&this.get(index)==null||this.get(index).equals(attribute);
    // @@@ If the index is valid (between 0 and the initial size of the list inclusive), then for every valid index before the specified index, each element at that position remains unchanged or is null both before and after the operation.
    // assert index>=0 && index<=\old(this.size()) => \forall int i; 0 <= i&&i < index; this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
    // @@@ If the index is within the valid range (from 0 to the initial size of the list), then for every position from the index to the old size of the list, the element at each position plus one is either both null or equal to the element at that position before the addition.
    // assert index>=0 && index<=\old(this.size()) => \forall int i; index <= i&&i <\old(this.size()); this.get(i+1) == null&&\old(this.get(i)) == null||this.get(i+1).equals(\old(this.get(i)));
  }

  /**
   * Adds all the {@link Attribute}s from the supplied list
   * to the end of this list, in the order they are returned
   * by the list's {@link java.util.Iterator}.
   *
   * @param list the list of attributes to add.
   * @return true if the list changed.
   * @see java.util.ArrayList#addAll(Collection)
   */
  public boolean addAll(AttributeList list)
  {
    return super.addAll(list);
  }

  /**
   * <p>
   * Adds all the {@link Attribute}s from the supplied list
   * to this list, at the specified index.  The attributes
   * are added in the order they are returned by the
   * list's {@link java.util.Iterator}.  Any attribute already
   * at that index is moved up one place in the list to the
   * position <code>(index + list.size())</code>.
   * Likewise, the attribute at <code>(index + list.size())</code>
   * is also moved up one place, continuing until the final
   * attribute in the original list.
   * </p>
   * <p>
   * If the index is invalid (i.e. it is smaller than zero, or
   * greater than the current size of the list), a
   * @link{RuntimeOperationsException} is thrown, which wraps
   * the @link{IndexOutOfBoundsException} from the underlying
   * array list.
   * </p>
   * 
   * @param index the index at which to place the new attribute.
   * @param list the list of attributes to add.
   * @return true if the list changed.
   * @throws RuntimeOperationsException if <code>index < 0</code>
   *                                    or <code>index > size()</code>
   * @see java.util.ArrayList#addAll(int, Collection)
   */
  public boolean addAll(int index, AttributeList list)
  {
    try
      {
    return super.addAll(index, list);
      }
    catch (IndexOutOfBoundsException e)
      {
    throw new RuntimeOperationsException(e, "Invalid index.");
      }
  }

  /**
   * Replaces the attribute at the specified index with the one
   * supplied. If the index is invalid (i.e. it is smaller than
   * zero, or greater than the current size of the list), a
   * @link{RuntimeOperationsException} is thrown, which wraps
   * the @link{IndexOutOfBoundsException} from the underlying
   * array list.
   *
   * @param index the index at which to place the new attribute.
   * @param attribute the new attribute to add.
   * @throws RuntimeOperationsException if <code>index < 0</code>
   *                                    or <code>index > size()</code>
   * @see java.util.ArrayList#set(int, Object)
   */
  public void set(int index, Attribute attribute)
  {
    try
      {
    super.set(index, attribute);
      }
    catch (IndexOutOfBoundsException e)
      {
    throw new RuntimeOperationsException(e, "Invalid index.");
      }
    // @@@ If the index is valid (non-negative and less than the initial size of the list), then the value at that index is the same as attribute.
    // assert index>=0 && index<\old(this.size()) => this.get(index).equals(attribute);
    // @@@ if the index is valid (non-negative and less than the initial size of the list), then for every valid index i less than the specified index, either both the current and old values at i are null, or the current value at i equals the old value at i.
    // assert index>=0 && index<\old(this.size()) => \forall int i; 0<=i && i<index; this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
    // @@@ If the index is valid (between 0 and the initial size of the list), then for every position greater than the index up to the end of the list, either both the current and old values at that position are null, or the current value is equal to the old value.
    // assert index>=0 && index<\old(this.size()) => \forall int i; index<i && i<this.size(); this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i))); 
  }

  /**
   * Returns {@code true} if this list contains the specified element.
   * More formally, returns {@code true} if and only if this list contains
   * at least one element {@code e} such that
   * {@code Objects.equals(o, e)}.
   *
   * @param o element whose presence in this list is to be tested
   * @return {@code true} if this list contains the specified element
   */
  public boolean contains(Attribute o) {
      return super.contains(o);
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param  index index of the element to return
   * @return the element at the specified position in this list
   * @throws IndexOutOfBoundsException {@inheritDoc}
   */
  public Attribute get(int index) {
    return (Attribute) super.get(index);
  }

  /**
   * Returns {@code true} if this list contains no elements.
   *
   * @return {@code true} if this list contains no elements
   */
  public boolean isEmpty() {
      return super.isEmpty();
  }

  /**
   * Returns the number of elements in this list.
   *
   * @return the number of elements in this list
   */
  public int size() {
      return super.size();
  }

}