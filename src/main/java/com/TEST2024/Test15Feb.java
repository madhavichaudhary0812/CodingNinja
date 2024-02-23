package com.TEST2024;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test15Feb {

    //
    /*
    DesiredCapabilities caps = new DesiredCapabilities();

    cap.setCapablities(mobileAutomaytion, UIautomator2);
    cap.setCapablities(deviceName, s3);
    cap.setCapablities(platform, android);

    AppiumDriver driver = new AppiumDriver(new "https://20vvfv", caps);

    driver.launch(apk)
    driver.*/

/*    int arr1[] = {3,4, 5, 2,8,9,3,4,5};
    int arr2[] = {3,4,5,2,1,5,8,0};
    int arr3[] = {};*/

    //sorted array
    //duplicate number count

/*    public static void mergeTwoArray(int arr[], int brr[])
    {
        int result[] = new int[arr.length + brr.length];

        for (int i = 0; i < ; i++) {

        }
    }*/

/*    public static void mergeSort(int arr[])
    {
        int mid = arr.length/2;

        int[] part1 = new int[mid];
        int[] part2 = new int[arr.length-mid];

        int k = 0;
        for (int i = 0; i < mid; i++) {
            part1[i] = arr[i];
        }

        for (int j = mid; j < arr.length; j++) {
            part1[k] = arr[j];
            k++;
        }
        mergeSort(part1);
        mergeSort(part2);
        merge(arr, part1,part2);

    }

    public static void merge(int arr[],int part1[], int part2[])
    {

        int i =0, j =0, k =0;
    }*/
    //duplicate


    public static int[] mergeTwoArray(int arr[], int brr[])
    {
        int n = arr.length + brr.length;
        int result[] = new int[n];
        int i =0, j =0, k=0;

        System.out.println("Length of array ->"+n);

        while(i < arr.length)
        {
            result[k] = arr[i];
            i++;
            k++;
        }

        while (j<brr.length)
        {
            result[k] = brr[j];
            j++;
            k++;
        }
        System.out.println("**********************************************");
        System.out.println(Arrays.toString(result));
        System.out.println("**********************************************");

        Set<Integer> uniqueArray = new HashSet<>();

        for (int l = 0; l < result.length; l++) {
            uniqueArray.add(result[l]);
        }

        Iterator<Integer> it = uniqueArray.iterator();

        int res[] = new int[uniqueArray.size()];
        int m =0;

        while (it.hasNext())
        {
            res[m]=it.next();
            m++;
        }
        System.out.println("*********************** Response Array ***********************");
        System.out.println(Arrays.toString(res));
        System.out.println("*********************Sorted Response Array*************************");


        Arrays.sort(res);

        System.out.println(Arrays.toString(res));
        System.out.println("********************* result Array*************************");
        return res;


    }

    public static void main(String[] args) {
        int arr1[] = {3,4,5,2,8,9,3,11,4,5};
        int arr2[] = {3,4,5,2,1,5,8,0,4};

        mergeTwoArray(arr1, arr2);

        int[] mergedArray = mergeTwoArray(arr1, arr2);

        System.out.println("Array A : "+Arrays.toString(arr1));

        System.out.println("Array B : "+Arrays.toString(arr2));

        System.out.println("Sorted Merged Array With No Duplicates : ");

        System.out.println(Arrays.toString(mergedArray));
    }

}
