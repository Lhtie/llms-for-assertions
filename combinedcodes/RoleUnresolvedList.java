package combinedcodes;

import java.util.*;
import java.io.Serializable;
import javax.management.relation.RoleUnresolved;

/**
 * A RoleUnresolvedList represents a list of RoleUnresolved objects,
 * representing roles not retrieved from a relation due to a problem
 * encountered when trying to access (read or write) the roles.
 *
 * @since 1.5
 */

/**
 * We cannot extend ArrayList<RoleUnresolved> because our legacy
 * add(RoleUnresolved) method would then override add(E) in ArrayList<E>,
 * and our return value is void whereas ArrayList.add(E)'s is boolean.
 * Likewise for set(int,RoleUnresolved).  Grrr.  We cannot use covariance
 * to override the most important methods and have them return
 * RoleUnresolved, either, because that would break subclasses that
 * override those methods in turn (using the original return type
 * of Object).  Finally, we cannot implement Iterable<RoleUnresolved>
 * so you could write
 * for (RoleUnresolved r : roleUnresolvedList)
 * because ArrayList<> implements Iterable<> and the same class cannot
 * implement two versions of a generic interface.  Instead we provide
 * the asList() method so you can write
 * for (RoleUnresolved r : roleUnresolvedList.asList())
 */

public class RoleUnresolvedList extends ArrayList<Object> {

    private transient boolean typeSafe;
    private transient boolean tainted;

    /* Serial version */
    private static final long serialVersionUID = 4054902803091433324L;

    /*
     * Override all of the methods from ArrayList<Object> that might add
     * a non-RoleUnresolved to the List, and disallow that if asList has
     * ever been called on this instance.
     */

    /**
     * Constructs an empty RoleUnresolvedList.
     */
    public RoleUnresolvedList() {
        super();
        // @@@ The newly created RoleUnresolvedList is empty.
        // assert this.isEmpty();
        // @@@ The size of the newly created RoleUnresolvedList is 0
        // assert this.size()==0;
    }

    /**
     * Constructs an empty RoleUnresolvedList with the initial capacity
     * specified.
     *
     * @param initialCapacity  initial capacity
     */
    public RoleUnresolvedList(int initialCapacity) {
        super(initialCapacity);
        // @@@ If the initial capacity is greater than or equal to 0, then the list is empty.
        // assert initialCapacity>=0 => this.isEmpty();
        // @@@ If the initial capacity is greater than or equal to 0, then the size of the list is 0.
        // assert initialCapacity>=0 => this.size()==0;
    }

    /**
     * Constructs a {@code RoleUnresolvedList} containing the elements of the
     * {@code List} specified, in the order in which they are returned by
     * the {@code List}'s iterator. The {@code RoleUnresolvedList} instance has
     * an initial capacity of 110% of the size of the {@code List}
     * specified.
     *
     * @param list the {@code List} that defines the initial contents of
     * the new {@code RoleUnresolvedList}.
     *
     * @exception IllegalArgumentException if the {@code list} parameter
     * is {@code null} or if the {@code list} parameter contains any
     * non-RoleUnresolved objects.
     *
     * @see ArrayList#ArrayList(java.util.Collection)
     */
    public RoleUnresolvedList(List<RoleUnresolved> list)
        throws IllegalArgumentException {
        // Check for null parameter
        //
        if (list == null)
            throw new IllegalArgumentException("Null parameter");

        // Check for non-RoleUnresolved objects
        //
        checkTypeSafe(list);

        // Build the List<RoleUnresolved>
        //
        super.addAll(list);
        // @@@ If the list is not null, then the size of this RoleUnresolvedList is equal to the size of the list provided.
        // assert list!=null => this.size()==list.size();
        // @@@ If the list is not null, then for every valid index from 0 to the size of this list, the element at each index in this list is the same as the element at the corresponding index in the initial list.
        // assert list!=null => \forall int i; 0<=i&&i<this.size(); this.get(i)==list.get(i);
        // @@@ If the list is not null, then this RoleUnresolvedList is equal to the list provided.
        // assert list!=null => this.equals(list);
    }

    @Override
    public void add(int index, Object element) {
        if (!tainted)
            tainted = isTainted(element);
        if (typeSafe)
            checkTypeSafe(element);
        super.add(index, element);
        // @@@ If the index is between 0 and the size of the list inclusive, then the list contains the element.
        // assert index>=0 && index<=this.size() => this.contains(element);
        // @@@ If the index is between 0 and the size of the list inclusive, then if the element is null, the element at that index in the list must also be null, or the element at that index must be equal to the element being added.
        // assert index>=0 && index<=this.size() => element==null&&this.get(index)==null||this.get(index).equals(element);
        // @@@ If the index is between 0 and the size of the list inclusive, then for every valid index up to the specified index, each element is either null and was null before, or remains unchanged from its previous state.
        // assert index>=0 && index<=this.size() => \forall int i; 0 <= i&&i < index; this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
        // @@@ If the index is within the valid range, then for every element from the index to the old size minus one, the element at the next position is either null if the current element is null, or the element at the next position is equal to the current element.
        // assert index>=0 && index<=this.size() => \forall int i; index <= i&&i <\old(this.size()); this.get(i+1) == null&&\old(this.get(i)) == null||this.get(i+1).equals(\old(this.get(i)));
    }

    /**
     * Inserts the unresolved role specified as an element at the position
     * specified.
     * Elements with an index greater than or equal to the current position are
     * shifted up.
     *
     * @param index - The position in the list where the new
     * RoleUnresolved object is to be inserted.
     * @param role - The RoleUnresolved object to be inserted.
     *
     * @exception IllegalArgumentException  if the unresolved role is null.
     * @exception IndexOutOfBoundsException if index is out of range
     * (<code>index &lt; 0 || index &gt; size()</code>).
     */
    public void add(int index,
                    RoleUnresolved role)
        throws IllegalArgumentException,
               IndexOutOfBoundsException {

        if (role == null) {
            String excMsg = "Invalid parameter";
            throw new IllegalArgumentException(excMsg);
        }

        super.add(index, role);
        // @@@ If the index is within the valid range and the role is not null, then the role is contained in the list after adding.
        // assert index>=0 && index<=this.size() && role!=null => this.contains(role);
        // @@@ If the index is between 0 and the size of the list inclusive, and the role is not null, then the element at that index is equal to the role.
        // assert index>=0 && index<=this.size() && role!=null => this.get(index).equals(role);
        // @@@ If the index is within valid range (0 to size of the list), and the role is not null, then for every valid index less than the specified index, either the element at that index is null and was null before, or it remains unchanged from its previous state.
        // assert index>=0 && index<=this.size() && role!=null => \forall int i; 0 <= i&&i < index; this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
        // @@@ If the index is within valid range (0 to size inclusive) and the role is not null, then for every position from the index to the old size of the list, the element at the next position is either null and the old element at that position was null, or it is equal to the old element at that position.
        // assert index>=0 && index<=this.size() && role!=null => \forall int i; index <= i&&i <\old(this.size()); this.get(i+1) == null&&\old(this.get(i)) == null||this.get(i+1).equals(\old(this.get(i)));
    }

    @Override
    public boolean add(Object o) {
        if (!tainted)
            tainted = isTainted(o);
        if (typeSafe)
            checkTypeSafe(o);
        return super.add(o);
        // @@@ The list contains the object after it has been added.
        // assert this.contains(o);
        // @@@ If the object is null, then the last element of the list is also null; if the object is not null, then it equals the last element of the list.
        // assert o==null && this.get(this.size()-1)==null || o!=null && o.equals(this.get(this.size()-1));
        // @@@ The method always returns true.
        // assert \result==true;
    }

    /**
     * Adds the RoleUnresolved specified as the last element of the list.
     *
     * @param role - the unresolved role to be added.
     *
     * @exception IllegalArgumentException  if the unresolved role is null.
     */
    public void add(RoleUnresolved role)
        throws IllegalArgumentException {

        if (role == null) {
            String excMsg = "Invalid parameter";
            throw new IllegalArgumentException(excMsg);
        }
        super.add(role);
        // @@@ If the role is not null, then the list contains the role.
        // assert role!=null => this.contains(role);
        // @@@ If the role is not null, then it must be equal to the last element in the list.
        // assert role!=null => role.equals(this.get(this.size()-1));
    }

    /**
     * Appends all the elements in the RoleUnresolvedList specified to the end
     * of the list, in the order in which they are returned by the Iterator of
     * the RoleUnresolvedList specified.
     *
     * @param roleList - Elements to be inserted into the list
     * (can be null).
     *
     * @return true if this list changed as a result of the call.
     *
     * @exception IndexOutOfBoundsException  if accessing with an index
     * outside of the list.
     */
    public boolean addAll(RoleUnresolvedList roleList)
        throws IndexOutOfBoundsException {

        if (roleList == null) {
            return true;
        }

        return (super.addAll(roleList));
    }

    /**
     * Inserts all of the elements in the RoleUnresolvedList specified into
     * this list, starting at the specified position, in the order in which
     * they are returned by the Iterator of the RoleUnresolvedList specified.
     *
     * @param index - Position at which to insert the first element from the
     * RoleUnresolvedList specified.
     * @param roleList - Elements to be inserted into the list.
     *
     * @return true if this list changed as a result of the call.
     *
     * @exception IllegalArgumentException  if the role is null.
     * @exception IndexOutOfBoundsException if index is out of range
     * (<code>index &lt; 0 || index &gt; size()</code>).
     */
    public boolean addAll(int index,
                          RoleUnresolvedList roleList)
        throws IllegalArgumentException,
               IndexOutOfBoundsException {

        if (roleList == null) {
            String excMsg = "Invalid parameter";
            throw new IllegalArgumentException(excMsg);
        }

        return (super.addAll(index, roleList));
    }

    @Override
    public boolean addAll(Collection<?> c) {
        if (!tainted)
            tainted = isTainted(c);
        if (typeSafe)
            checkTypeSafe(c);
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<?> c) {
        if (!tainted)
            tainted = isTainted(c);
        if (typeSafe)
            checkTypeSafe(c);
        return super.addAll(index, c);
    }

    /**
     * IllegalArgumentException if o is a non-RoleUnresolved object.
     */
    private static void checkTypeSafe(Object o) {
        try {
            o = (RoleUnresolved) o;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * IllegalArgumentException if c contains any non-RoleUnresolved objects.
     */
    private static void checkTypeSafe(Collection<?> c) {
        try {
            RoleUnresolved r;
            for (Object o : c)
                r = (RoleUnresolved) o;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * Returns true if o is a non-RoleUnresolved object.
     */
    private static boolean isTainted(Object o) {
        try {
            checkTypeSafe(o);
        } catch (IllegalArgumentException e) {
            return true;
        }
        return false;
    }

    /**
     * Returns true if c contains any non-RoleUnresolved objects.
     */
    private static boolean isTainted(Collection<?> c) {
        try {
            checkTypeSafe(c);
        } catch (IllegalArgumentException e) {
            return true;
        }
        return false;
    }

    @Override
    public Object set(int index, Object element) {
        if (!tainted)
            tainted = isTainted(element);
        if (typeSafe)
            checkTypeSafe(element);
        return super.set(index, element);
        // @@@ If the index is non-negative and less than the size of the list, then the result is the same as the old value at that index.
        // assert index>=0 && index<this.size() => \result==\old(this.get(index));
        // @@@ If the index is within valid range, then for every index i less than the specified index, the element at i remains unchanged or is null both before and after the operation.
        // assert index>=0 && index<size() => \forall int i; 0<=i && i<index; this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
        // @@@ If the index is valid (greater than or equal to 0 and less than the size of the list), then for every position greater than the index and within the list size, the element at that position is either unchanged or continues to be null if it was null before.
        // assert index>=0 && index<this.size() => \forall int i; index<i && i<this.size(); this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
    }

    /**
     * Sets the element at the position specified to be the unresolved role
     * specified.
     * The previous element at that position is discarded.
     *
     * @param index - The position specified.
     * @param role - The value to which the unresolved role element
     * should be set.
     *
     * @exception IllegalArgumentException   if the unresolved role is null.
     * @exception IndexOutOfBoundsException if index is out of range
     * (<code>index &lt; 0 || index &gt;= size()</code>).
     */
     public void set(int index,
                     RoleUnresolved role)
         throws IllegalArgumentException,
                IndexOutOfBoundsException {

        if (role == null) {
            String excMsg = "Invalid parameter";
            throw new IllegalArgumentException(excMsg);
        }

        super.set(index, role);
        // @@@ If the index is non-negative, less than the size of the list, and the role is not null, then the result is the same as the old value at that index.
        // assert index>=0 && index<this.size() && role!=null => \result==\old(this.get(index));
        // @@@ If the index is within bounds and the role is not null, then for every index i less than the specified index, the element at i remains unchanged if it was not null before the operation.
        // assert index>=0 && index<size() && role!=null => \forall int i; 0<=i && i<index; this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
        // @@@ If the index is within valid range (greater than or equal to 0 and less than the size of the list) and the role is not null, then for every position greater than the index and within the list size, the element at that position remains unchanged or continues to be null if it was originally null.
        // assert index>=0 && index<this.size() && role!=null => \forall int i; index<i && i<this.size(); this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
     }
}