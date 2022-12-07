package com.Optimisedprogram;

import java.util.LinkedHashMap;

public class FirstNonRepeatingINArray {
/* Find first non-repeating element in a given Array of integers
Source - https://www.geeksforgeeks.org/non-repeating-element/
*Input: {-1, 2, -1, 3, 0}
Output: 2
Explanation: The first number that does not repeat is : 2

Input: {9, 4, 9, 6, 7, 4}
Output: 6
* */

    public static int nonRepeatingElement(int arr[])
    {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) == 1)
            {
                return arr[i];
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {-1, 2, -1, 3, 0};
        int brr[] = {9, 4, 9, 6, 7, 4};
        System.out.println(nonRepeatingElement(arr));
        System.out.println(nonRepeatingElement(brr));
    }
}
