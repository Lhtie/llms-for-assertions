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

    //
    // Constructors
    //



    //
    // Accessors
    //





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
        // @@@ natural language assertion here
        // assert this.isEmpty();
        // @@@ natural language assertion here
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
        // @@@ natural language assertion here
        // assert initialCapacity>=0 => this.isEmpty();
        // @@@ natural language assertion here
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
        // @@@ natural language assertion here
        // assert list!=null => this.size()==list.size();
        // @@@ natural language assertion here
        // assert list!=null => \forall int i; 0<=i&&i<this.size(); this.get(i)==list.get(i);
        // @@@ natural language assertion here
        // assert list!=null => this.equals(list);
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
        // @@@ natural language assertion here
        // assert this.contains(role);
        // @@@ natural language assertion here
        // assert role==null && this.get(this.size()-1)==null || role!=null && role.equals(this.get(this.size()-1));
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
        // @@@ natural language assertion here
        // assert index>=0 && index<=this.size() => this.contains(role);
        // @@@ natural language assertion here
        // assert index>=0 && index<=this.size() => role==null&&this.get(index)==null||this.get(index).equals(role);
        // @@@ natural language assertion here
        // assert index>=0 && index<=this.size() => \forall int i; 0 <= i&&i < index; this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
        // @@@ natural language assertion here
        // assert index>=0 && index<=this.size() => \forall int i; index <= i&&i <\old(this.size()); this.get(i+1) == null&&\old(this.get(i)) == null||this.get(i+1).equals(\old(this.get(i)));
    }

    @Override
    public boolean add(Object o) {
        if (!tainted)
            tainted = isTainted(o);
        if (typeSafe)
            checkTypeSafe(o);
        return super.add(o);
    }

    @Override
    public void add(int index, Object element) {
        if (!tainted)
            tainted = isTainted(element);
        if (typeSafe)
            checkTypeSafe(element);
        super.add(index, element);
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
        // @@@ natural language assertion here
        // assert index>=0 && index<this.size() => \result==\old(this.get(index));
        // @@@ natural language assertion here
        // assert index>=0 && index<size() => \forall int i; 0<=i && i<index; this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
        // @@@ natural language assertion here
        // assert index>=0 && index<this.size() => \forall int i; index<i && i<this.size(); this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));
     }

    @Override
    public Object set(int index, Object element) {
        if (!tainted)
            tainted = isTainted(element);
        if (typeSafe)
            checkTypeSafe(element);
        return super.set(index, element);
    }}