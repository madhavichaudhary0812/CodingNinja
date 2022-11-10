package com.Optimisedprogram;

public class MergeArrays {
    /* WAP to merge 3 Sorted arrays and store them in a single Array and that array should be sorted. like :
Input - {1,2,3,5},{2,4,9},{5,6,7,8,10}
Output - {1,2,2,3,4,5,5,6,7,8,9,10}
Source link - https://www.geeksforgeeks.org/java-program-for-merge-3-sorted-arrays/
Source link 2 - https://stackoverflow.com/questions/37935170/how-to-merge-3-sorted-arrays-into-1-sorted-array-in-big-on-time

 Scenarios :
    * conditions - if element is different
    if element same in two arrays
    if element same in three arrays


Approaches -  Two way to resolve it
1- Merge last array with the resultant of first two arrays
2- Merge three array together with multiple if & else condition
    * */

    public static int[] mergedArrays(int arr[], int brr[], int crr[]) {
        int xrr[] = new int[arr.length + brr.length + crr.length];

        int i =0; int j =0; int k =0;
        int l =0; //---- xrr[]


        while(i< arr.length && j< brr.length && k< crr.length)
        {
            if(arr[i] < brr[j] && arr[i] < crr[k])
            {
                xrr[l] = arr[i];
                i++;
                l++;

            }else if(brr[j] < arr[i] && brr[j] < crr[k])
            {
                xrr[l] = brr[j];
                j++;
                l++;

            }else if(crr[k] < arr[i] && crr[k] < brr[j])
            {
                xrr[l] = crr[k];
                k++;
                l++;

            }else if(arr[i] == brr[j] && arr[i] == crr[k])
            {
                xrr[l] = arr[i];
                l++;
                i++;
                xrr[l] = brr[j];
                l++;
                j++;
                xrr[l] = crr[k];
                l++;
                k++;
            }else if(arr[i] == brr[j])
            {
                xrr[l] = arr[i];
                l++;
                i++;
                xrr[l] = brr[j];
                l++;
                j++;
            }else if(arr[i] == crr[k])
            {
                xrr[l] = arr[i];
                l++;
                i++;
                xrr[l] = crr[k];
                l++;
                k++;
            }
        }

        while(i< arr.length)
        {
            xrr[l] = arr[i];
            i++;
            l++;
        }
        while(j< brr.length)
        {
            xrr[l] = brr[j];
            j++;
            l++;

        }
        while(k< crr.length)
        {
            xrr[l] = crr[k];
            k++;
            l++;

        }

        return xrr;
    }

    public static int[] mergeMyArrays(int arr[], int brr[], int crr[])
    {
        int [] newResult = new int[arr.length+ brr.length+ crr.length];
        newResult =mergeMyArrays((mergeMyArrays(arr,brr)),crr);

        return newResult;
    }

    public static int[] mergeMyArrays(int arr[], int brr[])
    {
        int [] result = new int[arr.length+ brr.length];

        int i=0; int j=0; int k=0;

        while(i<arr.length && j< brr.length)
        {
            if(arr[i] < brr[j])
            {
                result[k] = arr[i];
                i++;
                k++;
            }else
            {
                result[k] = brr[j];
                j++;
                k++;
            }
        }

        while(i< arr.length)
        {
            result[k] = arr[i];
            i++;
            k++;
        }

        while(j< brr.length)
        {
            result[k] = brr[j];
            j++;
            k++;
        }

        return result;
    }
    public static void display(int[] xrr) {
        for (int i = 0; i < xrr.length; i++) {
            System.out.print(xrr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5,6};
        int brr[] = {2, 4, 6, 9};
        int crr[] = {5, 6, 7, 8, 10};
        display(mergedArrays(arr,brr,crr));
        System.out.println("");
        System.out.println("*****************************");
        display(mergeMyArrays(arr,brr,crr));

    }
}
