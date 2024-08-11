using System;
using System.Text;
using Microsoft.Pex.Framework;
using Microsoft.Pex.Framework.Settings;
using Microsoft.Pex.Framework.Exceptions;

using NUnit.Framework;
using ArrayList;
using PexAPIWrapper;

namespace ArrayList.Test
{
    [TestFixture, PexClass]
    public partial class ArrayListContractTest
    {
        [PexMethod]
        public void PUT_AddContract([PexAssumeUnderTest]ArrayList arrList, int x)
        {
            AssumePrecondition.IsTrue(true);

            int Old_arrListCount = arrList.Count;
            int Old_x = x;
            int Old_arrListIndexOfX = arrList.IndexOf(x);
            int Old_arrListLastIndexOfX = arrList.LastIndexOf(x);
            bool Old_arrListContainsX = arrList.Contains(x);

            int New_Ret = arrList.Add(x);

            int New_arrListCount = arrList.Count;
            int New_arrListIndexOfX = arrList.IndexOf(x);
            int New_arrListLastIndexOfX = arrList.LastIndexOf(x);

            bool New_arrListContainsX = arrList.Contains(x);

            PexObserve.ValueForViewing("$old_arrList_Count", Old_arrListCount);
            PexObserve.ValueForViewing("$new_arrList_Count", New_arrListCount);
            PexObserve.ValueForViewing("$old_arrList_x", Old_x);
            PexObserve.ValueForViewing("$old_arrList_IndexOf_x", Old_arrListIndexOfX);
            PexObserve.ValueForViewing("$new_arrList_IndexOf_x", New_arrListIndexOfX);
            PexObserve.ValueForViewing("$old_arrList_LastIndexOf_x", Old_arrListLastIndexOfX);
            PexObserve.ValueForViewing("$new_arrList_LastIndexOf_x", New_arrListLastIndexOfX);
            PexObserve.ValueForViewing("$New_ret", New_Ret);
            PexObserve.ValueForViewing("$old_arrList_contains_x", Old_arrListContainsX);
            PexObserve.ValueForViewing("$new_arrList_contains_x", New_arrListContainsX);

	    // @@@ new arry contains x
	    Debug.Assert(New_arrListContainsX );
	    // @@@ the return value is index of x in new array 
	    Debug.Assert( New_Ret == New_arrListLastIndexOfX );
	    // @@@ new array has size 1 greater than old array 
	    Debug.Assert( New_arrListCount == 1 + Old_arrListCount );
	    // @@@ index of x in new array is >= in old array 
	    Debug.Assert( Old_arrListIndexOfX <= New_arrListIndexOfX );
	    // @@@ last position of x in new array is greater than or equal to old array size
	    Debug.Assert( Old_arrListCount <= New_arrListLastIndexOfX );
	    // @@@ last position of x in new array is lesser than or equal to old array size
	    Debug.Assert( New_arrListLastIndexOfX <= Old_arrListCount );
	    // @@@ last index of x is geq an index of x in old array list 
	    Debug.Assert( Old_arrListIndexOfX <= Old_arrListLastIndexOfX );
	    // @@@ last index of x is geq an index of x in new array list 
	    Debug.Assert( New_arrListIndexOfX <= New_arrListLastIndexOfX );
	    // @@@ last index of x in new and old array lists are different
	    Debug.Assert( (!(New_arrListLastIndexOfX == Old_arrListLastIndexOfX)) );
	    // @@@ new last index of x is greater than or equal to old last index of x
	    Debug.Assert( Old_arrListLastIndexOfX <= New_arrListLastIndexOfX );
	    // @@@ index of x in new array is valid ie >= 0 
	    Debug.Assert( New_arrListIndexOfX >= 0 );
	    // @@@ index of x in old array is >= -1 
	    Debug.Assert( Old_arrListIndexOfX >= -1);
        }

        [PexMethod]
        public void PUT_RemoveContract([PexAssumeUnderTest]ArrayList arrList, int x)
        {
            AssumePrecondition.IsTrue(true);

            int Old_arrListCount = arrList.Count;
            int Old_x = x;
            int Old_arrListIndexOfX = arrList.IndexOf(x);
            int Old_arrListLastIndexOfX = arrList.LastIndexOf(x);
            bool Old_arrListContainsX = arrList.Contains(x);

            arrList.Remove(x);

            int New_arrListCount = arrList.Count;
            int New_arrListIndexOfX = arrList.IndexOf(x);
            int New_arrListLastIndexOfX = arrList.LastIndexOf(x);
            bool New_arrListContainsX = arrList.Contains(x);

            PexObserve.ValueForViewing("$old_arrList_Count", Old_arrListCount);
            PexObserve.ValueForViewing("$new_arrList_Count", New_arrListCount);
            PexObserve.ValueForViewing("$old_arrList_x", Old_x);
            PexObserve.ValueForViewing("$old_arrList_IndexOf_x", Old_arrListIndexOfX);
            PexObserve.ValueForViewing("$new_arrList_IndexOf_x", New_arrListIndexOfX);
            PexObserve.ValueForViewing("$old_arrList_LastIndexOf_x", Old_arrListLastIndexOfX);
            PexObserve.ValueForViewing("$new_arrList_LastIndexOf_x", New_arrListLastIndexOfX);
            PexObserve.ValueForViewing("$old_arrList_contains_x", Old_arrListContainsX);
            PexObserve.ValueForViewing("$new_arrList_contains_x", New_arrListContainsX);

	    // @@@ new array list has size at most as much as old array list 
	    Debug.Assert(New_arrListCount <= Old_arrListCount );
	    // @@@ array list count is not same as last index of x in new array 
	    Debug.Assert( (!(New_arrListLastIndexOfX == New_arrListCount)) );
	    // @@@ array list count is not same as last index of x in old array 
	    Debug.Assert( (!(Old_arrListLastIndexOfX == Old_arrListCount)) );
	    // @@@ last index of x in old array is smaller than or equal to new array size
	    Debug.Assert( Old_arrListLastIndexOfX <= New_arrListCount );
	    // @@@ the last position of x in old array is greater than or equal to some position of x in the same array
	    Debug.Assert( Old_arrListIndexOfX <= Old_arrListLastIndexOfX );
	    // @@@ the last position of x in new array is greater than or equal to some position of x in the same array
	    Debug.Assert( New_arrListIndexOfX <= New_arrListLastIndexOfX );
	    // @@@ new last index of x is lesser than or equal to old last index of x 
	    Debug.Assert( New_arrListLastIndexOfX <= Old_arrListLastIndexOfX );
	    // @@@ index of x in old array is geq minus 1 
	    Debug.Assert( Old_arrListIndexOfX >= -1 );
	    // @@@ index of x in new array is geq minus 1 
	    Debug.Assert( New_arrListIndexOfX >= -1);

        }

        [PexMethod]
        public void PUT_InsertContract([PexAssumeUnderTest]ArrayList arrList, int x, int index)
        {
            AssumePrecondition.IsTrue(index <= arrList.Count && index >= 0);

            int Old_arrListCount = arrList.Count;
            int Old_x = x;
            int Old_index = index;
            int Old_arrListIndexOfX = arrList.IndexOf(x);
            int Old_arrListLastIndexOfX = arrList.LastIndexOf(x);
            bool Old_arrListContainsX = arrList.Contains(x);

            arrList.Insert(index, x);

            int New_arrListCount = arrList.Count;
            int New_arrListIndexOfX = arrList.IndexOf(x);
            int New_arrListLastIndexOfX = arrList.LastIndexOf(x);
            bool New_arrListContainsX = arrList.Contains(x);

            PexObserve.ValueForViewing("$old_arrList_Count", Old_arrListCount);
            PexObserve.ValueForViewing("$new_arrList_Count", New_arrListCount);
            PexObserve.ValueForViewing("$old_arrList_x", Old_x);
            PexObserve.ValueForViewing("$old_arrList_index", Old_index);
            PexObserve.ValueForViewing("$old_arrList_IndexOf_x", Old_arrListIndexOfX);
            PexObserve.ValueForViewing("$new_arrList_IndexOf_x", New_arrListIndexOfX);
            PexObserve.ValueForViewing("$old_arrList_LastIndexOf_x", Old_arrListLastIndexOfX);
            PexObserve.ValueForViewing("$new_arrList_LastIndexOf_x", New_arrListLastIndexOfX);
            PexObserve.ValueForViewing("$old_arrList_contains_x", Old_arrListContainsX);
            PexObserve.ValueForViewing("$new_arrList_contains_x", New_arrListContainsX);

	    // @@@ new list contains x 
	    Debug.Assert(New_arrListContainsX );
	    // @@@ New_arrListIndexOfX is smaller than or equal to Old_index
	    Debug.Assert( New_arrListIndexOfX <= Old_index );
	    // @@@ the index where x is being inserted is less than or equal to last index of x in new array 
	    Debug.Assert( Old_index <= New_arrListLastIndexOfX );
	    // @@@ array list size increases by 1 after insertion 
	    Debug.Assert( New_arrListCount == 1 + Old_arrListCount );
	    // @@@ last position of x after insertion is less than or equal to original array count 
	    Debug.Assert( New_arrListLastIndexOfX <= Old_arrListCount );
	    // @@@ last position of x in old array is greater than or equal to a position of x in the same array 
	    Debug.Assert( Old_arrListIndexOfX <= Old_arrListLastIndexOfX );
	    // @@@ last position of x in old and new lists are different 
	    Debug.Assert( (!(New_arrListLastIndexOfX == Old_arrListLastIndexOfX)) );
	    // @@@ last position of x in new array list is greater than or equal to that in old array 
	    Debug.Assert( Old_arrListLastIndexOfX <= New_arrListLastIndexOfX );
	    // @@@ index of x after insertion is more than or equal to 0 
	    Debug.Assert( New_arrListIndexOfX >= 0 );
	    // @@@ postion of x in old array is more than or equal to -1 
	    Debug.Assert( Old_arrListIndexOfX >= -1);
        }

        [PexMethod]
        public void PUT_SetContract([PexAssumeUnderTest]ArrayList arrList, int x, int index)
        {
            AssumePrecondition.IsTrue(index >= 0 && index < arrList.Count);

            int Old_arrListCount = arrList.Count;
            int Old_x = x;
            int Old_index = index;
            int Old_arrListIndexOfX = arrList.IndexOf(x);
            int Old_arrListLastIndexOfX = arrList.LastIndexOf(x);
            bool Old_arrListContainsX = arrList.Contains(x);

            arrList[index] = x;

            int New_arrListCount = arrList.Count;
            int New_arrListIndexOfX = arrList.IndexOf(x);
            int New_arrListLastIndexOfX = arrList.LastIndexOf(x);
            bool New_arrListContainsX = arrList.Contains(x);

            PexObserve.ValueForViewing("$old_arrList_Count", Old_arrListCount);
            PexObserve.ValueForViewing("$new_arrList_Count", New_arrListCount);
            PexObserve.ValueForViewing("$old_arrList_x", Old_x);
            PexObserve.ValueForViewing("$old_arrList_index", Old_index);
            PexObserve.ValueForViewing("$old_arrList_IndexOf_x", Old_arrListIndexOfX);
            PexObserve.ValueForViewing("$new_arrList_IndexOf_x", New_arrListIndexOfX);
            PexObserve.ValueForViewing("$old_arrList_LastIndexOf_x", Old_arrListLastIndexOfX);
            PexObserve.ValueForViewing("$new_arrList_LastIndexOf_x", New_arrListLastIndexOfX);
            PexObserve.ValueForViewing("$old_arrList_contains_x", Old_arrListContainsX);
            PexObserve.ValueForViewing("$new_arrList_contains_x", New_arrListContainsX);

	    // @@@ array after setting x, contains x 
	    Debug.Assert(New_arrListContainsX );
	    // @@@ index of x in new array list is less than or equal to position where it is set
	    Debug.Assert( New_arrListIndexOfX <= Old_index );
	    // @@@ count of array list does not change 
	    Debug.Assert( New_arrListCount == Old_arrListCount );
	    // @@@ index passed in is less than or equal to last index of x in new array 
	    Debug.Assert( Old_index <= New_arrListLastIndexOfX );
	    // @@@ last index of x in new array is not same as old array size 
	    Debug.Assert( (!(New_arrListLastIndexOfX == Old_arrListCount)) );
	    // @@@ last index of x in new array is less than or equal to old array size 
	    Debug.Assert( New_arrListLastIndexOfX <= Old_arrListCount );
	    // @@@ an index of x in old array is <= last index of x in the same array
	    Debug.Assert( Old_arrListIndexOfX <= Old_arrListLastIndexOfX );
	    // @@@ last position of x in old array is <= same in new array 
	    Debug.Assert( Old_arrListLastIndexOfX <= New_arrListLastIndexOfX );
	    // @@@ index of x after setting is more than or same as zero 
	    Debug.Assert( New_arrListIndexOfX >= 0 );
	    // @@@ index of x in old aray list is more than or same as -1 
	    Debug.Assert( Old_arrListIndexOfX >= -1);
        }

        [PexMethod]
        public void PUT_GetContract([PexAssumeUnderTest]ArrayList arrList, int index)
        {
            AssumePrecondition.IsTrue(index < arrList.Count && index >= 0);

            int Old_arrListCount = arrList.Count;
            int Old_index = index;

            int New_Ret = (int)(arrList[index]);

            int New_arrListCount = arrList.Count;
            bool New_containsNewRet = arrList.Contains(New_Ret);

            PexObserve.ValueForViewing("$old_arrList_Count", Old_arrListCount);
            PexObserve.ValueForViewing("$new_arrList_Count", New_arrListCount);
            PexObserve.ValueForViewing("$old_arrList_index", Old_index);
            PexObserve.ValueForViewing("$New_ret", New_Ret);

            PexObserve.ValueForViewing("$new_containsNewRet", New_containsNewRet);

	    // @@@ the array contains New_Ret 
	    Debug.Assert(New_containsNewRet );
	    // @@@ old index is less than or same as old array count 
	    Debug.Assert( Old_index <= Old_arrListCount );
	    // @@@ index passed in is not equal to the old array size 
	    Debug.Assert( (!(Old_index == Old_arrListCount)) );
	    // @@@ count of new and old array lists are same 
	    Debug.Assert( New_arrListCount == Old_arrListCount );
	    // @@@ index value is greater than or equal to 0 
	    Debug.Assert( Old_index >= 0);
        }

        [PexMethod]
        public void PUT_ContainsContract([PexAssumeUnderTest]ArrayList arrList, int x)
        {
            AssumePrecondition.IsTrue(true);

            int Old_arrListCount = arrList.Count;
            int Old_x = x;
            int Old_arrListIndexOfX = arrList.IndexOf(x);
            int Old_arrListLastIndexOfX = arrList.LastIndexOf(x);

            bool New_Ret = arrList.Contains(x);

            int New_arrListCount = arrList.Count;
            int New_arrListIndexOfX = arrList.IndexOf(x);
            int New_arrListLastIndexOfX = arrList.LastIndexOf(x);

            PexObserve.ValueForViewing("$old_arrList_Count", Old_arrListCount);
            PexObserve.ValueForViewing("$new_arrList_Count", New_arrListCount);
            PexObserve.ValueForViewing("$old_arrList_x", Old_x);
            PexObserve.ValueForViewing("$old_arrList_IndexOf_x", Old_arrListIndexOfX);
            PexObserve.ValueForViewing("$new_arrList_IndexOf_x", New_arrListIndexOfX);
            PexObserve.ValueForViewing("$old_arrList_LastIndexOf_x", Old_arrListLastIndexOfX);
            PexObserve.ValueForViewing("$new_arrList_LastIndexOf_x", New_arrListLastIndexOfX);
            PexObserve.ValueForViewing("$New_ret", New_Ret);

	    // @@@ If the return value is true, new and old array list counts are same
	    Debug.Assert(!(New_Ret) || New_arrListCount == Old_arrListCount );
	    // @@@ If the return value is true, index of x in old array is less than or equal to that in new array
	    Debug.Assert(!(New_Ret) ||  Old_arrListIndexOfX <= New_arrListIndexOfX );
	    // @@@ If the return value is true, index of x in old array is greater than or equal to that in new array
	    Debug.Assert(!(New_Ret) ||  New_arrListIndexOfX <= Old_arrListIndexOfX );
	    // @@@ If the return value is true, last index of x in new array is <= size of old array
	    Debug.Assert(!(New_Ret) ||  New_arrListLastIndexOfX <= Old_arrListCount );
	    // @@@ If the return value is true, last position of x in new array is not the size of old array
	    Debug.Assert(!(New_Ret) ||  (!(New_arrListLastIndexOfX == Old_arrListCount)) );
	    // @@@ If the return value is true, the last position of x is atleast arrListIndexOfX in the new array 
	    Debug.Assert(!(New_Ret) ||  New_arrListIndexOfX <= New_arrListLastIndexOfX );
	    // @@@ If the return value is true, new list's last index of x is <= old list's last index of x  
	    Debug.Assert(!(New_Ret) ||  New_arrListLastIndexOfX <= Old_arrListLastIndexOfX );
	    // @@@ If the return value is true, new list's last index of x is >= old list's last index of x
	    Debug.Assert(!(New_Ret) ||  Old_arrListLastIndexOfX <= New_arrListLastIndexOfX );
	    // @@@ If the return value is true, index of x in new array is >= 0
	    Debug.Assert(!(New_Ret) ||  New_arrListIndexOfX >= 0);
	    // @@@ If the return value is false, sizes of new and old array are same 
	    Debug.Assert(New_Ret  || New_arrListCount == Old_arrListCount );
	    // @@@ If the return value is false, index of x before is less than or equal to after 
	    Debug.Assert(New_Ret  ||  Old_arrListIndexOfX <= New_arrListIndexOfX );
	    // @@@ If the return value is false, index of x before is more than or equal to after
	    Debug.Assert(New_Ret  ||  New_arrListIndexOfX <= Old_arrListIndexOfX );
	    // @@@ If the return value is false, old list's count is not -1 
	    Debug.Assert(New_Ret  ||  (!(-1 == Old_arrListCount)) );
	    // @@@ If the return value is false, last index of x in old arrList is <= index of x in new arrList 
	    Debug.Assert(New_Ret  ||  Old_arrListLastIndexOfX <= New_arrListIndexOfX );
	    // @@@ If the return value is false, old list size is >= -1
	    Debug.Assert(New_Ret  ||  Old_arrListCount >= -1 );
	    // @@@ If the return value is false, index of x in new list is lesser than or equal to -1 
	    Debug.Assert(New_Ret  ||  New_arrListIndexOfX <= -1 );
	    // @@@ If the return value is false, last position of x in old list is >= -1
	    Debug.Assert(New_Ret  ||  Old_arrListLastIndexOfX >= -1 );
	    // @@@ If the return value is false, last position of x in new list is exactly -1 
	    Debug.Assert(New_Ret  ||  New_arrListLastIndexOfX == -1);
        }

        [PexMethod]
        public void PUT_IndexOfContract([PexAssumeUnderTest]ArrayList arrList, int x)
        {
            AssumePrecondition.IsTrue(true);

            int Old_arrListCount = arrList.Count;
            int Old_x = x;
            int Old_arrListLastIndexOfX = arrList.LastIndexOf(x);
            bool Old_arrListContainsX = arrList.Contains(x);

            int New_Ret = arrList.IndexOf(x);

            int New_arrListCount = arrList.Count;
            int New_arrListLastIndexOfX = arrList.LastIndexOf(x);
            bool New_arrListContainsX = arrList.Contains(x);

            PexObserve.ValueForViewing("$old_arrList_Count", Old_arrListCount);
            PexObserve.ValueForViewing("$new_arrList_Count", New_arrListCount);
            PexObserve.ValueForViewing("$old_arrList_x", Old_x);
            PexObserve.ValueForViewing("$old_arrList_LastIndexOf_x", Old_arrListLastIndexOfX);
            PexObserve.ValueForViewing("$new_arrList_LastIndexOf_x", New_arrListLastIndexOfX);
            PexObserve.ValueForViewing("$New_ret", New_Ret);
            PexObserve.ValueForViewing("$old_arrList_contains_x", Old_arrListContainsX);
            PexObserve.ValueForViewing("$new_arrList_contains_x", New_arrListContainsX);

	    // @@@ If the return value is negative, list count remains same  
	    Debug.Assert(New_Ret >= 0 || New_arrListCount == Old_arrListCount );
	    // @@@ If the return value is negative, old list count is not -1
	    Debug.Assert(New_Ret >= 0 ||  (!(-1 == Old_arrListCount)) );
	    // @@@ If the return value is negative, new list doesnt contain x 
	    Debug.Assert(New_Ret >= 0 ||  (!(New_arrListContainsX)) );
	    // @@@ If the return value is negative, x is not in old list 
	    Debug.Assert(New_Ret >= 0 ||  (!(Old_arrListContainsX)) );
	    // @@@ If the return value is negative, old array count is greater than or equal to -1 
	    Debug.Assert(New_Ret >= 0 ||  Old_arrListCount >= -1 );
	    // @@@ If the return value is negative, last index of x in old array is -1 
	    Debug.Assert(New_Ret >= 0 ||  Old_arrListLastIndexOfX == -1 );
	    // @@@ If the return value is negative, last index of x in new array is -1 too 
	    Debug.Assert(New_Ret >= 0 ||  New_arrListLastIndexOfX == -1 );
	    // @@@ If the return value is non-negative, new ret <= last index of x in new list
	    Debug.Assert(New_Ret < 0  || New_Ret <= New_arrListLastIndexOfX );
	    // @@@ If the return value is non-negative, list counts of new and old array are equal 
	    Debug.Assert(New_Ret < 0  ||  New_arrListCount == Old_arrListCount );
	    // @@@ If the return value is non-negative, new array list's last index of x is <= old arrays count 
	    Debug.Assert(New_Ret < 0  ||  New_arrListLastIndexOfX <= Old_arrListCount );
	    // @@@ If the return value is non-negative, last index of x in new list != old list count 
	    Debug.Assert(New_Ret < 0  ||  (!(New_arrListLastIndexOfX == Old_arrListCount)) );
	    // @@@ If the return value is non-negative, last index of x in old array is more than or equal to new array 
	    Debug.Assert(New_Ret < 0  ||  New_arrListLastIndexOfX <= Old_arrListLastIndexOfX );
	    // @@@ If the return value is non-negative, last index of x in old array is smaller than or equal to new array
	    Debug.Assert(New_Ret < 0  ||  Old_arrListLastIndexOfX <= New_arrListLastIndexOfX );
	    // @@@ If the return value is non-negative, x is in the old array 
	    Debug.Assert(New_Ret < 0  ||  Old_arrListContainsX );
	    // @@@ If the return value is non-negative, new list contains x 
	    Debug.Assert(New_Ret < 0  ||  New_arrListContainsX );
        }

        [PexMethod]
        public void PUT_LastIndexOfContract([PexAssumeUnderTest]ArrayList arrList, int x)
        {
            AssumePrecondition.IsTrue(true);

            int Old_arrListCount = arrList.Count;
            int Old_x = x;
            int Old_arrListIndexOfX = arrList.IndexOf(x);
            bool Old_arrListContainsX = arrList.Contains(x);

            int New_Ret = arrList.LastIndexOf(x);

            int New_arrListCount = arrList.Count;
            int New_arrListIndexOfX = arrList.IndexOf(x);
            bool New_arrListContainsX = arrList.Contains(x);

            PexObserve.ValueForViewing("$old_arrList_Count", Old_arrListCount);
            PexObserve.ValueForViewing("$new_arrList_Count", New_arrListCount);
            PexObserve.ValueForViewing("$old_arrList_x", Old_x);
            PexObserve.ValueForViewing("$old_arrList_IndexOf_x", Old_arrListIndexOfX);
            PexObserve.ValueForViewing("$new_arrList_IndexOf_x", New_arrListIndexOfX);
            PexObserve.ValueForViewing("$New_ret", New_Ret);
            PexObserve.ValueForViewing("$old_arrList_contains_x", Old_arrListContainsX);
            PexObserve.ValueForViewing("$new_arrList_contains_x", New_arrListContainsX);

	    // @@@ If the return value is negative, old list size is not -1 
	    Debug.Assert(New_Ret >= 0 || (!(-1 == Old_arrListCount)) );
	    // @@@ If the return value is negative, count of old and new list is same 
	    Debug.Assert(New_Ret >= 0 ||  New_arrListCount == Old_arrListCount );
	    // @@@ If the return value is negative, old array list doesnt contain x 
	    Debug.Assert(New_Ret >= 0 ||  (!(Old_arrListContainsX)) );
	    // @@@ If the return value is negative, new array list does not contain x 
	    Debug.Assert(New_Ret >= 0 ||  (!(New_arrListContainsX)) );
	    // @@@ If the return value is negative, old array's size is at least -1
	    Debug.Assert(New_Ret >= 0 ||  Old_arrListCount >= -1 );
	    // @@@ If the return value is negative, old array's index where x is located is -1 
	    Debug.Assert(New_Ret >= 0 ||  Old_arrListIndexOfX == -1 );
	    // @@@ If the return value is negative, new array's index where x is stored is -1 
	    Debug.Assert(New_Ret >= 0 ||  New_arrListIndexOfX == -1);
	    // @@@ If the return value is non-negative, return value is less than old array list's size 
	    Debug.Assert(New_Ret < 0  || New_Ret <= Old_arrListCount );
	    // @@@ If the return value is non-negative, return value is not equal to old array count 
	    Debug.Assert(New_Ret < 0  ||  (!(New_Ret == Old_arrListCount)) );
	    // @@@ If the return value is non-negative, return value is at least the index of x in old list 
	    Debug.Assert(New_Ret < 0  ||  Old_arrListIndexOfX <= New_Ret );
	    // @@@ If the return value is non-negative, size of old and new list is same 
	    Debug.Assert(New_Ret < 0  ||  New_arrListCount == Old_arrListCount );
	    // @@@ If the return value is non-negative, index of x in old list is less than or equal to index in new list 
	    Debug.Assert(New_Ret < 0  ||  Old_arrListIndexOfX <= New_arrListIndexOfX );
	    // @@@ If the return value is non-negative, index of x in old array is more than or equal to index in new list 
	    Debug.Assert(New_Ret < 0  ||  New_arrListIndexOfX <= Old_arrListIndexOfX );
	    // @@@ If the return value is non-negative, new array list contains x 
	    Debug.Assert(New_Ret < 0  ||  New_arrListContainsX );
	    // @@@ If the return value is non-negative, x is in the old array list 
	    Debug.Assert(New_Ret < 0  ||  Old_arrListContainsX );
	    // @@@ If the return value is non-negative, index of x in new array is >= 0 
	    Debug.Assert(New_Ret < 0  ||  New_arrListIndexOfX >= 0);
        }

        [PexMethod]
        public void PUT_CountContract([PexAssumeUnderTest]ArrayList arrList)
        {
            AssumePrecondition.IsTrue(true);


            int New_Ret = arrList.Count;


            PexObserve.ValueForViewing("$New_ret", New_Ret);


	    // @@@ count value of array is either 0 or greater than or equal to one 
	    Debug.Assert((New_Ret >= 1) || (New_Ret == 0));
        }
    }
}
