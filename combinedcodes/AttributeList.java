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
    // @@@ The newly created list is empty.
    // assert this.isEmpty();
    // @@@ The size of the newly created list is 0
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
    // @@@ if the provided list is not null, then the size of this list is equal to the size of the provided list
    // assert list!=null => this.size()==list.size();
    // @@@ if the provided list is not null, then for each valid index i in the new list, the element at index i is the same as the element at index i in the provided list.
    // assert list!=null => \forall int i; 0<=i&&i<this.size(); this.get(i)==list.get(i);
    // @@@ if the provided list is not null, then this list equals the provided list after construction
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
    // @@@ if the initial capacity is greater than or equal to 0, then the size of the list is 0
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
    // @@@ The attribute list contains the added attribute after the operation
    // assert this.contains(attribute);
    // @@@ The last element in the list is either null if the added attribute is null, or it equals the added attribute if the added attribute is not null.
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
    // @@@ If the index is between 0 and the size of the list, then the list contains the added attribute.
    // assert index>=0 && index<=this.size() => this.contains(attribute);
    // @@@ If the index is within the valid range, then either the attribute is null and the element at the index is null, or the element at the index equals the attribute.
    // assert index>=0 && index<=this.size() => attribute==null&&this.get(index)==null||this.get(index).equals(attribute);
    // @@@ If the index is within the valid range, then for each index i less than the given index, the element at i either remains unchanged or both the old and new elements at i are null.
    // assert index>=0 && index<=this.size() => \forall int i; 0 <= i&&i < index; this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
    // @@@ If the index is between 0 and the current size of the list, then for every index i from the given index to the old size minus one, the element at position i+1 is either null if both the old and new elements at position i were null, or it equals the old element at position i.
    // assert index>=0 && index<=this.size() => \forall int i; index <= i&&i <\old(this.size()); this.get(i+1) == null&&\old(this.get(i)) == null||this.get(i+1).equals(\old(this.get(i)));
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
    // @@@ If the index is within the valid range, the result of setting the attribute at the index is equal to the attribute that was previously at that index.
    // assert index>=0 && index<this.size() => \result==\old(this.get(index));
    // @@@ if the index is valid, then for each index i less than the given index, the element at i remains unchanged if it was not null before and after the operation
    // assert index>=0 && index<size() => \forall int i; 0<=i && i<index; this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
    // @@@ if the index is valid, then for every index i greater than the given index and less than the size of the list, the element at i is either both null before and after the operation or remains unchanged.
    // assert index>=0 && index<this.size() => \forall int i; index<i && i<this.size(); this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i))); 
  }

}