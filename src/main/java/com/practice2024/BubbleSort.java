package com.practice2024;

public class BubbleSort {

    public static int[] bubbleSorting(int[] arr) {

        int temp =0;

        if(arr.length <1)
        {
            System.out.println("array doesn't have element");
            return arr;
        }

        if(arr.length == 1)
        {
            System.out.println("array doesn't need to sort as its have only one element");
            return arr;
        }

        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;

    }

    public static void displayArray (int[] arr) {
        for(int var : arr) {
            System.out.print(var+" ");
        }

    }


    public static void main(String[] args) {
        int[] arr = {5, 6,8,2,7,1,0};
        int[] arr1 = {};
        System.out.print("{ ");
        displayArray(bubbleSorting(arr));
        System.out.print("}");
        System.out.println("");
        System.out.print("{ ");
        displayArray(bubbleSorting(arr1));
        System.out.print("}");

    }
}
