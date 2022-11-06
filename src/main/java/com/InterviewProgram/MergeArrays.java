package com.InterviewProgram;

public class MergeArrays {

    public static int[] mergeArrays(int arr[], int brr[], int crr[])
    {
        int l = arr.length;
        int m = brr.length;
        int q = crr.length;
        int input[] = new int[l+m];
        int input2[] = new int[l+m+q];

        merge (input, arr,brr);
        merge (input2, input,crr);

        return input2;
    }
    private static void merge(int[] input,int arr[],int brr[]) {

        int i = 0, j = 0, k = 0;
        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                input[k] = arr[i];
                k++;
                i++;
            } else {
                input[k] = brr[j];
                k++;
                j++;
            }
        }
        while (i < arr.length) {
            input[k] = arr[i];
            k++;
            i++;
        }
        while (j < brr.length) {
            input[k] = brr[j];
            k++;
            j++;
        }

    }
        public static void main (String[] args) {
            System.out.println("WAP to merge three sorted arrays without help of data structure");
            System.out.println(" ");
            int arr[] = {1,2,3,4,5};
            int brr[] = {11,12,13,14,15};
            int crr[] = {6,7,8,9,10};
            int final2 [] = mergeArrays(arr,brr,crr);
            //int final1 [] = mergeArrays(final2,crr);


            for (int i = 0; i< final2.length ;i++)
            {
                System.out.print(final2[i] + " " );
            }
        }
}
