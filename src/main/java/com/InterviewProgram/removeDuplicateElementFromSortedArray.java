package com.InterviewProgram;

import java.util.LinkedHashSet;

public class removeDuplicateElementFromSortedArray {

    public static int removeDuplicate(int[] arr, int n)
    {
        if (n == 0 || n == 1)
        {
            return n;
        }
        int j =0;

        for(int i=0; i<n-1 ;i++)
        {
            if(arr[i] != arr[i+1])
            {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];

        return j;
    }

    public static void removeDuplicateBySet(int []arr, int n)
    {
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        for(int i =0; i< n; i++)
        {
            ls.add(arr[i]);
        }
        System.out.print(ls);
    }

    public static void main(String []args)
    {
        int arr[] ={1,2,2,3,4,4,5,6,6,6,7};
        int n = arr.length;

        int arr1[] ={1,2,2,3,3,3,4,4,5,6,6,7};
        int n1 = arr.length;


        int j = removeDuplicate(arr, n);
        for (int i = 0; i < j; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("******************************************************************");
        removeDuplicateBySet(arr1,n1);

    }
}
