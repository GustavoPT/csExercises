package com.company;


import java.util.*;

public class InsertionSelectionDemo{

    public static void main(String[] args)
    {

        int[] a = {5,2,4,6,1,3};
        System.out.println("Insertion Sort");
        System.out.println(Arrays.toString(a));
        insertionSort(a);
        System.out.println(Arrays.toString(a));
        
        int[] b = {5,2,5,6,1,3};
        System.out.println("Selection Sort");
        System.out.println(Arrays.toString(b));
        selectionSort(b);
        System.out.println(Arrays.toString(b));
    }

    public static void insertionSort(int[]a)
    {
        int j;

        for (int p = 1; p < a.length;p++)
        {
            int tmp = a[p];
            for (j = p;j > 0;j--)
            {
                if(tmp >= a[j - 1])
                {
                    break;
                }
                else
                {
                    a[j] = a[j - 1];
                }
            }
            a[j] = tmp;
        }
    }

    public static void selectionSort(int[] a)
    {
        int i;
        for (i = a.length - 1; i > 0;i--) {
            // find the maximum value in A[0..i]
            int maxIndex = 0;
            int j;
            for (j = 1;j < i;j++) {
                // inner loop variant for all  k < j
                if(a[maxIndex] < a[j])
                {
                    maxIndex = j;
                }
            }
            swapReferences(a,i,maxIndex);
        }
    }

    public static void swapReferences(int[]a,int ind1,int ind2)
    {
        int tmp = a[ind1];
        a[ind1] = a[ind2];
        a[ind2] = tmp;
    }

}
