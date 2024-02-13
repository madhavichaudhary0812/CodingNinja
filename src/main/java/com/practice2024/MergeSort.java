package com.practice2024;

public class MergeSort {

    public static void mergeSorting(int[] arr) {
        if(arr.length <= 1)
        {
            System.out.println("array doesn't need to sort");
            return;
        }


        int len = arr.length;
        int mid = len/2;

        int[] part1 = new int[mid];
        int[] part2 = new int[len-mid];

        for (int i = 0; i < mid; i++) {
            part1[i]=arr[i];
        }
        int j=0;
        for (int i = mid; i < len; i++) {
            part2[j]=arr[i];
            j++;
        }

        mergeSorting(part1);
        mergeSorting(part2);
        merge(arr, part1, part2);

    }

    public static void merge(int[] arr, int[] part1, int[] part2) {

        int i =0, j=0, k =0;

        while(i< part1.length && j< part2.length)
        {
            if(part1[i] < part2[j]) {
                arr[k] = part1[i];
                i++;
                k++;
            }else
            {
                arr[k]=part2[j];
                j++;
                k++;
            }
        }

        while(i<part1.length)
        {
            arr[k]=part1[i];
            i++;
            k++;
        }

        while(j<part2.length)
        {
            arr[k]=part2[j];
            i++;
            j++;
        }


    }
    public static void displayArray (int[] arr) {
        for(int var : arr) {
            System.out.print(var+" ");
        }

    }


    public static void main(String[] args) {
        int[] arr = {5,6,8,2,7,1,0};
        mergeSorting(arr);

        System.out.print("{ ");
        displayArray(arr);
        System.out.print("}");
    }
}
