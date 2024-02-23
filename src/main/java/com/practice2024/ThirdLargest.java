package com.practice2024;

public class ThirdLargest {

    public static int thirdLargestElement(int[] array)
    {

        if(array.length<1)
        {
            System.out.println("Array doesn't have elements its empty");
            return 0;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if(array[i] > largest)
            {
               thirdLargest = secondLargest;
               secondLargest = largest;
               largest = array[i];
            }else if(array[i] > secondLargest && array[i]!=largest)
            {
                thirdLargest = secondLargest;
                secondLargest = array[i];
            }else if(array[i] > thirdLargest && array[i]!=largest && array[i]!=secondLargest)
            {
                thirdLargest = array[i];
            }

        }

        return thirdLargest;
    }

    public static void main(String[] args) {

        int arr[] = {2,4,6,7,32,8,9,12,11,21,22,10};
        System.out.println(thirdLargestElement(arr));
    }
}
