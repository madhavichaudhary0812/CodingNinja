package com.practice2024;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class uniqueSortedMergeArray {

    public static int[] mergeTwoArray(int arr[], int brr[])
    {
        int n = arr.length + brr.length;
        int result[] = new int[n];
        int i =0, j =0, k=0;

        System.out.println("Length of array ->"+n);

        while(i < arr.length)
        {
            result[k] = arr[i];
            i++;
            k++;
        }

        while (j<brr.length)
        {
            result[k] = brr[j];
            j++;
            k++;
        }

        Set<Integer> uniqueArray = new HashSet<>();

        for (int l = 0; l < result.length; l++) {
            uniqueArray.add(result[l]);
        }

        Iterator<Integer> it = uniqueArray.iterator();

        int res[] = new int[uniqueArray.size()];
        int m =0;

        while (it.hasNext())
        {
            res[m]=it.next();
            m++;
        }
        Arrays.sort(res);
        return res;


    }

    public static void main(String[] args) {
        int arr1[] = {3,4,5,2,8,9,3,11,4,5};
        int arr2[] = {3,4,5,2,1,5,8,0,4};

        mergeTwoArray(arr1, arr2);

        int[] mergedArray = mergeTwoArray(arr1, arr2);

        System.out.println("Array A : "+Arrays.toString(arr1));

        System.out.println("Array B : "+Arrays.toString(arr2));

        System.out.println("Sorted Merged Array With No Duplicates : ");

        System.out.println(Arrays.toString(mergedArray));
    }
}
