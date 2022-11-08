package com.Optimisedprogram;

public class sortArrayof0and1 {

    public static void sortArray(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < count) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 0, 0, 1, 1, 1, 0, 0};
        sortArray(arr);
    }
}
