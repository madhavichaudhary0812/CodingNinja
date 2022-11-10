package com.Optimisedprogram;

public class SecondLargestNoOfArray {

/*  Scenario 1- If array doesn't have any element
    Scenario 2- If array have less than 2 element
    Scenario 3 - if value is positive
    Scenarion 4- if value if negative
    int largest =0 , secondLargest =0 ;

    */

    public static void secondlargestNumber(int[] Arr) {


        if (Arr == null) {
            System.out.println("Arr3 [] - Array have no element and its null");
            return;
        } else if (Arr.length < 2) {
            System.out.println("Arr[] - Array have only one element");
            return;
        }


        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > largest) {
                secondLargest = largest;
                largest = Arr[i];
            } else if (Arr[i] > secondLargest && Arr[i] != largest) {
                secondLargest = Arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No Second largest number exist");
        } else {
            System.out.println("Second largest number is -: " + secondLargest);
        }

    }


    public static void main(String[] args) {
        int[] Arr = {1}; //null; // {1}; //{2,5,8,-1,6,10,16,17,2,6};
        int[] Arr1 = {-2, 5, 8, -1, 6, 10, -16, 17, 2, 6};
        int[] Arr2 = {5, 8, 1, 6, 10, 16, 17, 2, 6};
        int[] Arr3 = null;
        int[] Arr4 = {9, 9, 9, 9};

        System.out.println("Arr[] result -:  ");
        secondlargestNumber(Arr);

        System.out.println(" Arr1[] result -: ");
        secondlargestNumber(Arr1);

        System.out.println("Arr2[] result -:  ");
        secondlargestNumber(Arr2);

        System.out.println("Arr3[] result -:  ");
        secondlargestNumber(Arr3);

        System.out.println("Arr4[] result -: ");
        secondlargestNumber(Arr4);


    }
}
