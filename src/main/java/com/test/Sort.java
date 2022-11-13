package com.test;

public class Sort {

/* WAP to sort the channel on basis of viewership of channel by Using any sorting algorithm
Algo we can use - Insertion sort, bubble sort, merge sort, Quick Sort
*   Channel 1  - 1000
	Channel 2  - 2554
	Channel 3  - 1000
	Channel 4  -   15
	Channel 5  -  503
* */

    public static void bubbleSort(int arr[])
    {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1 ; j++) {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
    }

    public static void main(String[] args) {
        int arr[]= {1000,2554,1000,15,503 };
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }

    }
}
