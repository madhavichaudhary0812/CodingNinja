package com.Optimisedprogram;

public class BubbleSort {

    /* Bubble Sort - DSA problem
    *
    *
    * */

    public static int[] bubbleSortArray(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static void display(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int arr[] = {100,15,234,11,567,8245,1000};
        display(bubbleSortArray(arr));
    }
}
