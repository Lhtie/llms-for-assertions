package combinedcodes;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;

import org.apache.commons.collections4.BoundedCollection;

/**
 * CircularFifoQueue is a first-in first-out queue with a fixed size that
 * replaces its oldest element if full.
 * <p>
 * The removal order of a {@link CircularFifoQueue} is based on the
 * insertion order; elements are removed in the same order in which they
 * were added.  The iteration order is the same as the removal order.
 * </p>
 * <p>
 * The {@link #add(Object)}, {@link #remove()}, {@link #peek()}, {@link #poll()},
 * {@link #offer(Object)} operations all perform in constant time.
 * All other operations perform in linear time or worse.
 * </p>
 * <p>
 * This queue prevents null objects from being added.
 * </p>
 *
 * @param <E> the type of elements in this collection
 * @since 4.0
 */
public class CircularFifoQueue<E> extends AbstractCollection<E>
    implements Queue<E>, BoundedCollection<E>, Serializable {

    /** Serialization version. */
    private static final long serialVersionUID = -8423413834657610406L;

    /** Underlying storage array. */
    private transient E[] elements;

    /** Array index of first (oldest) queue element. */
    private transient int start;

    /**
     * Index mod maxElements of the array position following the last queue
     * element.  Queue elements start at elements[start] and "wrap around"
     * elements[maxElements-1], ending at elements[decrement(end)].
     * For example, elements = {c,a,b}, start=1, end=1 corresponds to
     * the queue [a,b,c].
     */
    private transient int end;

    /** Flag to indicate if the queue is currently full. */
    private transient boolean full;

    /** Capacity of the queue. */
    private final int maxElements;

    /**
     * Constructor that creates a queue with the default size of 32.
     */
    public CircularFifoQueue() {
        this(32);
        // @@@ the queue is empty after creation
        // assert this.isEmpty();
        // @@@ The size of the queue is 0 after initialization with the default size.
        // assert this.size()==0;
    }

    /**
     * Constructor that creates a queue from the specified collection.
     * The collection size also sets the queue size.
     *
     * @param coll  the collection to copy into the queue, may not be null
     * @throws NullPointerException if the collection is null
     */
    public CircularFifoQueue(final Collection<? extends E> coll) {
        this(coll.size());
        addAll(coll);
        // @@@ If the collection is not null, then the size of the queue equals the size of the collection.
        // assert coll!=null => this.size()==coll.size();
        // @@@ If the collection is not null, then for every index i from 0 to the size of this queue minus one, the element at index i in this queue is the same as the element at index i in the collection.
        // assert coll!=null => \forall int i; 0<=i&&i<this.size(); this.get(i)==coll.get(i);
        // @@@ If the collection is not null, then this queue is equal to the collection.
        // assert coll!=null => this.equals(coll);
    }

    /**
     * Constructor that creates a queue with the specified size.
     *
     * @param size  the size of the queue (cannot be changed)
     * @throws IllegalArgumentException  if the size is &lt; 1
     */
    @SuppressWarnings("unchecked")
    public CircularFifoQueue(final int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        elements = (E[]) new Object[size];
        maxElements = elements.length;
        // @@@ If the size is greater than or equal to 1, then the queue is empty initially.
        // assert size>=1 => this.isEmpty();
        // @@@ If the size is greater than or equal to 1, then the queue size is initially 0.
        // assert size>=1 => this.size()==0;
    }

    /**
     * Adds the given element to this queue. If the queue is full, the least recently added
     * element is discarded so that a new element can be inserted.
     *
     * @param element  the element to add
     * @return true, always
     * @throws NullPointerException  if the given element is null
     */
    @Override
    public boolean add(final E element) {
        Objects.requireNonNull(element, "element");

        if (isAtFullCapacity()) {
            remove();
        }

        elements[end++] = element;

        if (end >= maxElements) {
            end = 0;
        }

        if (end == start) {
            full = true;
        }

        return true;
        // @@@ If the element is not null, then the queue contains the element.
        // assert element!=null => this.contains(element);
        // @@@ If the element is not null, then the result is true.
        // assert element!=null => \result==true;
        // @@@ If the element is not null, then it is equal to the last element in the queue.
        // assert element!=null => element.equals(this.get(this.size()-1));
    }

    /**
     * Clears this queue.
     */
    @Override
    public void clear() {
        full = false;
        start = 0;
        end = 0;
        Arrays.fill(elements, null);
        // @@@ The queue is empty after it is cleared.
        // assert this.isEmpty();
        // @@@ The size of the queue is zero after clearing it.
        // assert this.size()==0;
    }

    /**
     * Decrements the internal index.
     *
     * @param index  the index to decrement
     * @return the updated index
     */
    private int decrement(int index) {
        index--;
        if (index < 0) {
            index = maxElements - 1;
        }
        return index;
    }

    @Override
    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    /**
     * Gets the element at the specified position in this queue.
     *
     * @param index the position of the element in the queue
     * @return the element at position {@code index}
     * @throws NoSuchElementException if the requested position is outside the range 0 to size-1
     */
    public E get(final int index) {
        final int sz = size();
        if (index < 0 || index >= sz) {
            throw new NoSuchElementException(
                    String.format("The specified index %1$d is outside the available range 0 to %2$d - 1",
                                  Integer.valueOf(index), Integer.valueOf(sz)));
        }

        final int idx = (start + index) % maxElements;
        return elements[idx];
    }

    /**
     * Increments the internal index.
     *
     * @param index  the index to increment
     * @return the updated index
     */
    private int increment(int index) {
        index++;
        if (index >= maxElements) {
            index = 0;
        }
        return index;
    }

    /**
     * Returns {@code true} if the capacity limit of this queue has been reached,
     * i.e. the number of elements stored in the queue equals its maximum size.
     *
     * @return {@code true} if the capacity limit has been reached, {@code false} otherwise
     * @since 4.1
     */
    public boolean isAtFullCapacity() {
        return size() == maxElements;
    }

    /**
     * Returns true if this queue is empty; false otherwise.
     *
     * @return true if this queue is empty
     */
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * {@inheritDoc}
     * <p>
     * A {@code CircularFifoQueue} can never be full, thus this returns always
     * {@code false}.
     *
     * @return always returns {@code false}
     */
    @Override
    public boolean isFull() {
        return false;
    }

    /**
     * Returns an iterator over this queue's elements.
     *
     * @return an iterator over this queue's elements
     */
    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {
        private int index = start;
        private int lastReturnedIndex = -1;
        private boolean isFirst = full;

        @Override
        public boolean hasNext() {
            return isFirst || index != end;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            isFirst = false;
            lastReturnedIndex = index;
            index = increment(index);
            return elements[lastReturnedIndex];
        }

        @Override
        public void remove() {
            if (lastReturnedIndex == -1) {
                throw new IllegalStateException();
            }

            // First element can be removed quickly
            if (lastReturnedIndex == start) {
                CircularFifoQueue.this.remove();
                lastReturnedIndex = -1;
                return;
            }

            int pos = lastReturnedIndex + 1;
            if (start < lastReturnedIndex && pos < end) {
                // shift in one part
                System.arraycopy(elements, pos, elements, lastReturnedIndex, end - pos);
            } else {
                // Other elements require us to shift the subsequent elements
                while (pos != end) {
                    if (pos >= maxElements) {
                        elements[pos - 1] = elements[0];
                        pos = 0;
                    } else {
                        elements[decrement(pos)] = elements[pos];
                        pos = increment(pos);
                    }
                }
            }

            lastReturnedIndex = -1;
            end = decrement(end);
            elements[end] = null;
            full = false;
            index = decrement(index);
        }

    };

    /**
     * Gets the maximum size of the collection (the bound).
     *
     * @return the maximum number of elements the collection can hold
     */
    @Override
    public int maxSize() {
        return maxElements;
    }

    /**
     * Adds the given element to this queue. If the queue is full, the least recently added
     * element is discarded so that a new element can be inserted.
     *
     * @param element  the element to add
     * @return true, always
     * @throws NullPointerException  if the given element is null
     */
    @Override
    public boolean offer(final E element) {
        return add(element);
        // @@@ If the element is not null, then the queue contains the element after the operation.
        // assert element!=null => this.contains(element);
        // @@@ If the element is not null, then the result is always true.
        // assert element!=null => \result==true;
        // @@@ If the element is not null, then it is equal to the last element in the queue after the operation.
        // assert element!=null => element.equals(this.get(this.size()-1));
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return elements[start];
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }

        final E element = elements[start];
        if (null != element) {
            elements[start++] = null;

            if (start >= maxElements) {
                start = 0;
            }
            full = false;
        }
        return element;
    }

    /**
     * Returns the number of elements stored in the queue.
     *
     * @return this queue's size
     */
    @Override
    public int size() {
        int size = 0;

        if (end < start) {
            size = maxElements - start + end;
        } else if (end == start) {
            size = full ? maxElements : 0;
        } else {
            size = end - start;
        }

        return size;
    }

    /**
     * {@inheritDoc}
     *
     * <p>This implementation iterates over the elements in the collection,
     * checking each element in turn for equality with the specified element.
     *
     * @throws ClassCastException   {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    public boolean contains(Object o) {
        Iterator<E> it = iterator();
        if (o==null) {
            while (it.hasNext())
                if (it.next()==null)
                    return true;
        } else {
            while (it.hasNext())
                if (o.equals(it.next()))
                    return true;
        }
        return false;
    }
}