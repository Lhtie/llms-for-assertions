package mut_000;

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