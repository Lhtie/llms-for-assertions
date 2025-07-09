package combinedcodes;

import java.util.*;
import javax.management.relation.Role;

/**
 * A RoleList represents a list of roles (Role objects). It is used as
 * parameter when creating a relation, and when trying to set several roles in
 * a relation (via 'setRoles()' method). It is returned as part of a
 * RoleResult, to provide roles successfully retrieved.
 *
 * @since 1.5
 */

/** 
 * We cannot extend ArrayList<Role> because our legacy
 * add(Role) method would then override add(E) in ArrayList<E>,
 * and our return value is void whereas ArrayList.add(E)'s is boolean.
 * Likewise for set(int,Role).  Grrr.  We cannot use covariance
 * to override the most important methods and have them return
 * Role, either, because that would break subclasses that
 * override those methods in turn (using the original return type
 * of Object).  Finally, we cannot implement Iterable<Role>
 * so you could write
 *     for (Role r : roleList)
 * because ArrayList<> implements Iterable<> and the same class cannot
 * implement two versions of a generic interface.  Instead we provide
 * the asList() method so you can write
 *     for (Role r : roleList.asList())
*/

public class RoleList extends ArrayList<Object> {

    private transient boolean typeSafe;
    private transient boolean tainted;

    /* Serial version */
    private static final long serialVersionUID = 5568344346499649313L;

    /*
     * Override all of the methods from ArrayList<Object> that might add
     * a non-Role to the List, and disallow that if asList has ever
     * been called on this instance.
     */

    /**
     * Constructs an empty RoleList.
     */
    public RoleList() {
        super();
        // @@@ The RoleList is empty upon construction.
        // assert this.isEmpty();
        // @@@ The size of the RoleList is 0 after construction.
        // assert this.size()==0;
    }

    /**
     * Constructs an empty RoleList with the initial capacity
     * specified.
     *
     * @param initialCapacity  initial capacity
     */
    public RoleList(int initialCapacity) {
        super(initialCapacity);
        // @@@ If the initial capacity is greater than or equal to 0, then the RoleList is empty.
        // assert initialCapacity>=0 => this.isEmpty();
        // @@@ If the initial capacity is greater than or equal to 0, then the size of the RoleList is 0
        // assert initialCapacity>=0 => this.size()==0;
    }

    /**
     * Constructs a {@code RoleList} containing the elements of the
     * {@code List} specified, in the order in which they are returned by
     * the {@code List}'s iterator. The {@code RoleList} instance has
     * an initial capacity of 110% of the size of the {@code List}
     * specified.
     *
     * @param list the {@code List} that defines the initial contents of
     * the new {@code RoleList}.
     *
     * @exception IllegalArgumentException if the {@code list} parameter
     * is {@code null} or if the {@code list} parameter contains any
     * non-Role objects.
     *
     * @see ArrayList#ArrayList(java.util.Collection)
     */
    public RoleList(List<Role> list) throws IllegalArgumentException {
        // Check for null parameter
        //
        if (list == null)
            throw new IllegalArgumentException("Null parameter");

        // Check for non-Role objects
        //
        checkTypeSafe(list);

        // Build the List<Role>
        //
        super.addAll(list);
        // @@@ If the provided list is not null, then the size of this RoleList is equal to the size of the provided list.
        // assert list!=null => this.size()==list.size();
        // @@@ If the list is not null, then for each index i between 0 and the size of this RoleList, the element at index i in this RoleList is the same as the element at index i in the provided list.
        // assert list!=null => \forall int i; 0<=i&&i<this.size(); this.get(i)==list.get(i);
        // @@@ If the provided list is not null, then the constructed RoleList is equal to the provided list.
        // assert list!=null => this.equals(list);
    }

    @Override
    public void add(int index, Object element) {
        if (!tainted)
            tainted = isTainted(element);
        if (typeSafe)
            checkTypeSafe(element);
        super.add(index, element);
        // @@@ If the index is within the valid range, then the element is contained in the list after the addition.
        // assert index>=0 && index<=this.size() => this.contains(element);
        // @@@ if the index is within the bounds of the list, then the element at the index is either null and the newly added element is null, or the element at the index equals the newly added element
        // assert index>=0 && index<=this.size() => element==null&&this.get(index)==null||this.get(index).equals(element);
        // @@@ If the index is within the valid range, then for each element before the index, the element is either null and was null before, or it remains unchanged.
        // assert index>=0 && index<=this.size() => \forall int i; 0 <= i&&i < index; this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
        // @@@ If the index is within the bounds of the list, then for every element from the index to the old size minus one, the element at the next position is either null and the current element was null, or the element at the next position is equal to the current element in the old list.
        // assert index>=0 && index<=this.size() => \forall int i; index <= i&&i <\old(this)size(); this.get(i+1) == null&&\old(this).get(i) == null||this.get(i+1).equals(\old(this).get(i));
    }

    /**
     * Inserts the role specified as an element at the position specified.
     * Elements with an index greater than or equal to the current position are
     * shifted up.
     *
     * @param index  The position in the list where the new Role
     * object is to be inserted.
     * @param role  The Role object to be inserted.
     *
     * @exception IllegalArgumentException  if the role is null.
     * @exception IndexOutOfBoundsException  if accessing with an index
     * outside of the list.
     */
    public void add(int index,
                    Role role)
        throws IllegalArgumentException,
               IndexOutOfBoundsException {

        if (role == null) {
            String excMsg = "Invalid parameter";
            throw new IllegalArgumentException(excMsg);
        }

        super.add(index, role);
        // @@@ If the index is within bounds and the role is not null, then the role is contained in the list after the operation.
        // assert index>=0 && index<=this.size() && role!=null => this.contains(role);
        // @@@ If the index is between 0 and the size of the list, and the role is not null, then the element at the index in the list equals the role after adding.
        // assert index>=0 && index<=this.size() && role!=null => this.get(index).equals(role);
        // @@@ If the index is within bounds and the role is not null, then for each element before the index, the element remains unchanged if it was not null before the operation.
        // assert index>=0 && index<=this.size() && role!=null => \forall int i; 0 <= i&&i < index; this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
        // @@@ If the index is within bounds and the role is not null, then for each index i from the given index to the old size minus one, the element at position i+1 is either null or equal to the element at position i in the old list.
        // assert index>=0 && index<=this.size() && role!=null => \forall int i; index <= i&&i <\old(this)size(); this.get(i+1) == null&&\old(this).get(i) == null||this.get(i+1).equals(\old(this).get(i));
    }

    @Override
    public boolean add(Object o) {
        if (!tainted)
            tainted = isTainted(o);
        if (typeSafe)
            checkTypeSafe(o);
        return super.add(o);
        // @@@ The added object is contained in the RoleList after the operation.
        // assert this.contains(o);
        // @@@ The last element added to the list is either null if the added object is null, or it equals the added object if the added object is not null.
        // assert o==null && this.get(this.size()-1)==null || o!=null && o.equals(this.get(this.size()-1));
        // @@@ The result of adding an element to the list is always true
        // assert \result==true;
    }

    /**
     * Adds the Role specified as the last element of the list.
     *
     * @param role  the role to be added.
     *
     * @exception IllegalArgumentException  if the role is null.
     */
    public void add(Role role)
        throws IllegalArgumentException {

        if (role == null) {
            String excMsg = "Invalid parameter";
            throw new IllegalArgumentException(excMsg);
        }
        super.add(role);
        // @@@ If the role is not null, then the role is contained in the list after adding it.
        // assert role!=null => this.contains(role);
        // @@@ If the role is not null, then it equals the last element in the list after adding.
        // assert role!=null => role.equals(this.get(this.size()-1));
    }

    /**
     * Appends all the elements in the RoleList specified to the end
     * of the list, in the order in which they are returned by the Iterator of
     * the RoleList specified.
     *
     * @param roleList  Elements to be inserted into the list (can be null)
     *
     * @return true if this list changed as a result of the call.
     *
     * @exception IndexOutOfBoundsException  if accessing with an index
     * outside of the list.
     *
     * @see ArrayList#addAll(Collection)
     */
    public boolean addAll(RoleList roleList)
        throws IndexOutOfBoundsException {

        if (roleList == null) {
            return true;
        }

        return (super.addAll(roleList));
    }

    /**
     * Inserts all of the elements in the RoleList specified into this
     * list, starting at the specified position, in the order in which they are
     * returned by the Iterator of the RoleList specified.
     *
     * @param index  Position at which to insert the first element from the
     * RoleList specified.
     * @param roleList  Elements to be inserted into the list.
     *
     * @return true if this list changed as a result of the call.
     *
     * @exception IllegalArgumentException  if the role is null.
     * @exception IndexOutOfBoundsException  if accessing with an index
     * outside of the list.
     *
     * @see ArrayList#addAll(int, Collection)
     */
    public boolean addAll(int index,
                          RoleList roleList)
        throws IllegalArgumentException,
               IndexOutOfBoundsException {

        if (roleList == null) {
            // Revisit [cebro] Localize message
            String excMsg = "Invalid parameter.";
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
     * IllegalArgumentException if o is a non-Role object.
     */
    private static void checkTypeSafe(Object o) {
        try {
            o = (Role) o;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * IllegalArgumentException if c contains any non-Role objects.
     */
    private static void checkTypeSafe(Collection<?> c) {
        try {
            Role r;
            for (Object o : c)
                r = (Role) o;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * Returns true if o is a non-Role object.
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
     * Returns true if c contains any non-Role objects.
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
        // @@@ If the index is within the bounds of the list, then the result of setting an element at that index is the element that was previously at that index.
        // assert index>=0 && index<this.size() => \result==\old(this.get(index));
        // @@@ If the index is within the bounds of the list, then for every index i less than the given index, the element at i is either both null before and after the operation or remains unchanged.
        // assert index>=0 && index<size() => \forall int i; 0<=i && i<index; this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
        // @@@ If the index is within the bounds of the list, then for every index i greater than the given index and less than the size of the list, either both the current and old elements at index i are null, or they are equal.
        // assert index>=0 && index<this.size() => \forall int i; index<i && i<this.size(); this.get(i)==null && \old(this).get(i)==null || this.get(i).equals(\old(this).get(i));
    }

    /**
     * Sets the element at the position specified to be the role
     * specified.
     * The previous element at that position is discarded.
     *
     * @param index  The position specified.
     * @param role  The value to which the role element should be set.
     *
     * @exception IllegalArgumentException  if the role is null.
     * @exception IndexOutOfBoundsException  if accessing with an index
     * outside of the list.
     */
     public void set(int index,
                     Role role)
         throws IllegalArgumentException,
                IndexOutOfBoundsException {

        if (role == null) {
            // Revisit [cebro] Localize message
            String excMsg = "Invalid parameter.";
            throw new IllegalArgumentException(excMsg);
        }

        super.set(index, role);
        // @@@ If the index is within bounds and the role is not null, then the result of setting the role at the index is equal to the element that was previously at that index.
        // assert index>=0 && index<this.size() && role!=null => \result==\old(this.get(index));
        // @@@ If the index is within bounds and the role is not null, then for each index i less than the given index, the element at i remains unchanged.
        // assert index>=0 && index<size() && role!=null => \forall int i; 0<=i && i<index; this.get(i)==null && \old(this).get(i)==null || this.get(i).equals(\old(this).get(i));
        // @@@ If the index is within bounds and the role is not null, then for every index i greater than the given index and less than the size of the list, the element at i is either both null before and after the operation or remains unchanged.
        // assert index>=0 && index<this.size() && role!=null => \forall int i; index<i && i<this.size(); this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
     }
}