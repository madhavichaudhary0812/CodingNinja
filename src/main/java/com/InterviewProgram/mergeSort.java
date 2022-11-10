package com.InterviewProgram;

public class mergeSort {

    public static void mergeSort(int []input)
    {
        if(input.length <=1)
        {
            return;
        }
        int len = input.length;
        int mid = len/2;

        int part1[] = new int[mid];
        int part2[] = new int[len-mid];

        for(int i=0; i<mid ; i++)
        {
            part1[i] = input[i];
        }

        int j=0;

        for(int i=mid ; i< len ; i++)
        {
            part2[j] = input[i];
            j++;
        }


        mergeSort(part1);
        mergeSort(part2);
        merge(input, part1, part2);

    }

    public static void merge(int []input, int[] part1, int[] part2)
    {
        int i=0, j=0, k=0;
        while(i< part1.length && j< part2.length)
        {
            if(part1[i] < part2[j])
            {
                input[k] = part1[i];
                i++;
                k++;
            }else
            {
                input[k] = part2[j];
                j++;
                k++;
            }

        }

/*      System.out.print("input array value befor another while loop------->  ");
        displayArray(input);
        System.out.println("-------");*/

        while(i< part1.length)
        {
            input[k] = part1[i];
            i++;
            k++;
        }
/*      System.out.print("input array value after 1st while loop------->  ");
        displayArray(input);
        System.out.println("-------");*/

        while(j< part2.length)
        {
            input[k] = part2[j];
            j++;
            k++;
        }

/*      System.out.print("input array value after 2nd another while loop------->  ");
        displayArray(input);
        System.out.println("-------");*/

    }

    public static void displayArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

        }
    }


    public static void main(String []args)
    {
        int [] input = {4,5,9,12,19,2,8,13};
        mergeSort(input);
        for(int i=0; i<input.length;i++)
        {
            System.out.print(input[i] + " ");
        }
    }
}
