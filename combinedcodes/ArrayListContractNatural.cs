using System;
using System.Runtime.Serialization;
using System.Diagnostics;
using System.Diagnostics.CodeAnalysis;
using System.Collections.Generic;
using System.Collections;
using System.Reflection;
using System.Runtime.CompilerServices;
using System.Runtime.InteropServices;
using Common.Utility;
using ArrayList.Utility;

namespace ArrayList
{
    // Implements a variable-size List that uses an array of objects to store the
    // elements. A ArrayList has a capacity, which is the allocated length
    // of the internal array. As elements are added to a ArrayList, the capacity
    // of the ArrayList is automatically increased as required by reallocating the
    // internal array.
    // 
    //[DebuggerTypeProxy(typeof(System.Collections.ArrayList.ArrayListDebugView))]
    [System.Diagnostics.DebuggerDisplay("Count = {Count}")]
    [Serializable]
    //[System.Runtime.CompilerServices.TypeForwardedFrom("mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089")]
    public class ArrayList : System.Collections.IList, ICloneable
    {
        private Object[] _items; // Do not rename (binary serialization)
        private int _size; // Do not rename (binary serialization)
        private int _version; // Do not rename (binary serialization)
        [NonSerialized]
        private Object _syncRoot;

        private const int _defaultCapacity = 4;

        // Copy of Array.MaxArrayLength
        internal const int MaxArrayLength = 0X7FEFFFFF;

        // Constructs a ArrayList. The list is initially empty and has a capacity
        // of zero. Upon adding the first element to the list the capacity is
        // increased to _defaultCapacity, and then increased in multiples of two as required.
        public ArrayList()
        {
            _items = EmptyArray<Object>.Value;
        }

        // Constructs a ArrayList with a given initial capacity. The list is
        // initially empty, but will have room for the given number of elements
        // before any reallocations are required.
        // 
        public ArrayList(int capacity);

        // Gets and sets the capacity of this list.  The capacity is the size of
        // the internal array used to hold items.  When set, the internal 
        // array of the list is reallocated to the given capacity.
        // 
        public virtual int Capacity;

        // Read-only property describing how many elements are in the List.
        public virtual int Count
        {
            get
            {
                // @@@ size of array is always greater than or equal to 0
		Debug.Assert(New_Ret >= 0);
                return _size;
            }
        }

        // Sets or Gets the element at the given index.
        // 
        public virtual Object this[int index]
        {
            get
            {
                //NotpAssume.IsTrue(index >= 0 && index < _size);
                if (index < 0 || index >= _size) throw new ArgumentOutOfRangeException("nameof(index)", "SR.ArgumentOutOfRange_Index");

                // @@@ the array contains the value being returned
	        Debug.Assert(New_objContainsNewRet );
	        // @@@ index passed in is less than the array size and greater than or same as 0
	        Debug.Assert( arg0 < Old_objCount && arg0 >= 0 );
	        // @@@ size of array does not change after the operation 
	        Debug.Assert( New_objCount == Old_objCount );

                return _items[index];
            }
            set
            {
                //NotpAssume.IsTrue(index >= 0 && index < _size);
                if (index < 0 || index >= _size) throw new ArgumentOutOfRangeException("nameof(index)", "SR.ArgumentOutOfRange_Index");
                _items[index] = value;
                _version++;

                // @@@ array list contains value after setting
	        Debug.Assert(New_objContainsarg1 );
	        // @@@ index where value is set is between the first and last positions of value in the list after the operation
	        Debug.Assert( New_objIndexOfarg1 <= arg0 && arg0 <= New_objLastIndexOfarg1 );
	        // @@@ last position of value in the list increases or stays the same after the operation
	        Debug.Assert( Old_objLastIndexOfarg1 <= New_objLastIndexOfarg1 );
	        // @@@ if the array contained value before the operation, the first index of value decreases or remains same after the operation
	        Debug.Assert( !Old_objContainsarg1 || Old_objIndexOfarg1 >= New_objIndexOfarg1 );
            }
        }

        // Adds the given object to the end of this list. The size of the list is
        // increased by one. If required, the capacity of the list is doubled
        // before adding the new element.
        //
        public virtual int Add(Object value)
        {
            if (_size == _items.Length) EnsureCapacity(_size + 1);
            _items[_size] = value;
            _version++;

	    // @@@ array contains the added value after the operation
	    Debug.Assert(New_objContainsarg0 );
	    // @@@ array size increases by 1 after adding
	    Debug.Assert( New_objCount == 1 + Old_objCount );
	    // @@@ last index of value in the list increases when value is added
	    Debug.Assert( Old_objLastIndexOfarg0 < New_objLastIndexOfarg0 );
	    // @@@ first index of value in the list remains same if value was already in the list
	    Debug.Assert( !Old_objContainsarg0 || Old_objIndexOfarg0 == New_objIndexOfarg0 );

            return _size++;
        }

        // Adds the elements of the given collection to the end of this list. If
        // required, the capacity of the list is increased to twice the previous
        // capacity or the new size, whichever is larger.
        //
        public virtual void AddRange(System.Collections.ICollection c);

        // Clears the contents of ArrayList.
        public virtual void Clear();

        // Contains returns true if the specified element is in the ArrayList.
        // It does a linear, O(n) search.  Equality is determined by calling
        // item.Equals().
        //
        public virtual bool Contains(Object item)
        {
            // @@@ array list count does not change on applying contains
	    Debug.Assert(New_objCount == Old_objCount );

	    // @@@ If the list contains item, last index of item must be less than array size
	    Debug.Assert(!(New_Ret) ||  New_objLastIndexOfarg0 < Old_objCount );
	    // @@@ If the return value is true, first index of item in the array is more than or same as 0
	    Debug.Assert(!(New_Ret) ||  New_objIndexOfarg0 >= 0);

	    // @@@ If item is not in the array, the first and last positions of item are both -1
	    Debug.Assert(New_Ret  ||  (New_objIndexOfarg0 == -1 && New_objLastIndexOfarg0 == -1) );

            if (item == null)
            {
                for (int i = 0; i < _size; i++)
                    if (_items[i] == null)
                        return true;
                return false;
            }
            else
            {
                for (int i = 0; i < _size; i++)
                    if ((_items[i] != null) && (_items[i].Equals(item)))
                        return true;
                return false;
            }
        }

        // Returns the index of the first occurrence of a given value in a range of
        // this list. The list is searched forwards from beginning to end.
        // The elements of the list are compared to the given value using the
        // Object.Equals method.
        // 
        // This method uses the Array.IndexOf method to perform the
        // search.
        // 
        public virtual int IndexOf(Object value)
        {
	    // @@@ If and only if the index-of operation for value returns -1, value is not in array 
	    Debug.Assert((New_Ret == -1) ==  !Old_objContainsarg0 );

	    // @@@ If the first index of value is -1 then so is the last index
	    Debug.Assert(New_Ret != -1 ||  New_objLastIndexOfarg0 == -1 );

	    // @@@ If the return value is positive or zero it is still less than or equal to the last index of value
	    Debug.Assert(New_Ret < 0  || New_Ret <= New_objLastIndexOfarg0 );

            return Array.IndexOf((Array)_items, value, 0, _size);
        }

        // Inserts an element into this list at a given index. The size of the list
        // is increased by one. If required, the capacity of the list is doubled
        // before inserting the new element.
        // 
        public virtual void Insert(int index, Object value)
        {
            // Note that insertions at the end are legal.
            //NotpAssume.IsTrue(index >= 0 && index <= _size);
            if (index < 0 || index > _size) throw new ArgumentOutOfRangeException("nameof(index)", "SR.ArgumentOutOfRange_ArrayListInsert");

            if (_size == _items.Length) EnsureCapacity(_size + 1);
            if (index < _size)
            {
                Array.Copy(_items, index, _items, index + 1, _size - index);
            }
            _items[index] = value;
            _size++;
            _version++;

	    // @@@ index where value is inserted should be between the first and last occurances of value in the array after the insertion
	    Debug.Assert( New_objIndexOfarg1 <= arg0 &&  arg0 <= New_objLastIndexOfarg1  );
	    // @@@ count of the list increases by 1 after inserting value in the array 
	    Debug.Assert( New_objCount == 1 + Old_objCount );
	    // @@@ position of value in array after insertion is greater than or equal to 0 
	    Debug.Assert( New_objIndexOfarg1 >= 0 );
	    // @@@ last index of value does not decrease on inserting value in the array
	    Debug.Assert(New_objLastIndexOfarg1 >= Old_objLastIndexOfarg1);
        }

        // Returns the index of the last occurrence of a given value in a range of
        // this list. The list is searched backwards, starting at the end 
        // and ending at the first element in the list. The elements of the list 
        // are compared to the given value using the Object.Equals method.
        // 
        // This method uses the Array.LastIndexOf method to perform the
        // search.
        // 
        public virtual int LastIndexOf(Object value)
        {
	    // @@@ The last index return value must be smaller than the array size 
	    Debug.Assert( New_Ret < Old_objCount );

	    // @@@ If the return value is -1, the array list must not have value 
	    Debug.Assert(New_Ret != -1 ||  (!(Old_objContainsarg0)) );
	    // @@@ If the last-index-of operation returns -1 it implies that the first index of value should also be -1 
	    Debug.Assert(New_Ret != -1 ||  New_objIndexOfarg0 == -1);
	    
	    // @@@ If the return value is valid and >= 0 then the array must contain value 
	    Debug.Assert(New_Ret < 0  ||  New_objContainsarg0 );
	    // @@@ If the last-index operation with value is more than or same as 0, so should be the first index of value
	    Debug.Assert(New_Ret < 0  ||  New_objIndexOfarg0 >= 0);

            return LastIndexOf(value, _size - 1, _size);
        }

        // Removes the element at the given index. The size of the list is
        // decreased by one.
        // 
        public virtual void Remove(Object obj)
        {
            int index = IndexOf(obj);
            if (index >= 0)
                RemoveAt(index);

            // @@@ array list size decreases by one or remains the same after remove 
	    Debug.Assert(New_objCount == Old_objCount || New_objCount == Old_objCount - 1 );
	    // @@@ last index of obj does not increase due to the operation 
	    Debug.Assert( New_objLastIndexOfarg0 <= Old_objLastIndexOfarg0 );
	    // @@@ first index of obj never decreases except the case when it becomes -1
	    Debug.Assert( New_objIndexOfarg0 >= Old_objIndexOfarg0 || New_objIndexOfarg0 == -1 );
        }

        // Removes the element at the given index. The size of the list is
        // decreased by one.
        // 
        public virtual void RemoveAt(int index);
    }
}
