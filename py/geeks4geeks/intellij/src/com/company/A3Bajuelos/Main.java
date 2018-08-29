package com.company.A3Bajuelos;


/*********************************************************************

 Purpose/Description:
 The method findIndex will be the find the pivot and determine the high and low to apply to binarySearch
 and send it

 Author’s Panther ID: 6089424
 Certification:
 I hereby certify that this work is my own and none of it is the work of any other person.
 ********************************************************************/

public class Main{

    public static void main(String args[])
    {
        // array of elements
        int array[] = {15,16,19,20,25,1,3,4,5,7,10,14};
        // get the length of the array
        int length = array.length;
        // find the element 5
        int element = 5;
        // call the function
        System.out.println("Index of Number " + findIndex(array,length,element));
    }

    public static int findIndex(int array[], int length, int element)
    {
        // We find the pivot
        int pivot = getPivot(array, 0, length-1);

        // if there is no pivot then the array is already sorted
        if (pivot == -1)
        {
            return binarySearch(array, 0, length-1, element);
        }

        // if the pivot is element then we are done
        if (array[pivot] == element)
        {
            return pivot;
        }

        // partition the array into two parts based on the pivot
        // if the beginning of the array is less than the element
        // then we call binarySearch from low to pivot
        if (array[0] <= element)
        {
            return binarySearch(array, 0, pivot-1, element);
        }

        // if the beginnning of the array is greater than the element
        // then we must go backwards and start searching  from the pivot + 1
        return binarySearch(array, pivot+1, length-1, element);
    }

    public static int getPivot(int array[], int low, int high)
    {
        // high is less than low
        if (high < low)
        {
            return -1;
        }
        // if high equals low then we return either since its the same index
        if (high == low)
        {
            return low;
        }
        // we get the mid
        int mid = (low + high)/2;

        // if the mid is less than the high index and the value in the mid is greater than the next value
        //  25 then that is the last value of the rotated array so we return it
        if (mid < high && array[mid] > array[mid + 1])
        {
            return mid;
        }
        // if the mid index is greater than the low
        // and the mid value is less than the mid - 1 then we return mid - 1
        if (mid > low && array[mid] < array[mid - 1])
        {
            return (mid-1);
        }
        // if the low value is greater than the mid value
        // we search for the pivot again within the range of
        // the beginning of the array and the mid - 1
        // to find the pivot
        if (array[low] >= array[mid])
        {
            return getPivot(array, low, mid-1);
        }
        // if the beginning of the array is not less then the mid
        // that might mean that the array has only been rotated a few values and
        // the pivot must be to the right of the mid
        return getPivot(array, mid + 1, high);
    }

    // adapted binary search
    // added the low and the high to the parameters in order for it to be used
    // recursively
    // we pass the array, the low,high and number we want to find
    public static int binarySearch(int array[], int low, int high, int number)
    {
        if (high < low)
            return -1;

        int mid = (low + high)/2;

        if (number == array[mid])
        {
            return mid;
        }

        if (number > array[mid])
        {
            return binarySearch(array, (mid + 1), high, number);
        }

        return binarySearch(array, low, mid -1,number);
    }

}