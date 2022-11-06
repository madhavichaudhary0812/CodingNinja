package com.InterviewProgram;

import java.util.HashMap;
import java.util.Map;

public class removeDuplicateElementFromUnSortedArray {

    public static void removeDuplicate(int []arr, int n)
    {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer ch : arr)
        {
            if(map.get(ch)!=null)
            {
                map.put(ch, map.get(ch)+1);
            }else
            {
                map.put(ch,1);
            }
        }
        System.out.print(" Non-Duplicate Number { ");
        for(Map.Entry<Integer,Integer> keys : map.entrySet())
        {
            if(keys.getValue()==1)
            {
                System.out.print(keys.getKey() +" ");
            }
        }
        System.out.print("}");
    }
    public static void main(String []args) {
        int arr[] = {1, 2, 5, 3, 9, 9, 4, 4, 5, 6, 7, 8, 11, 9};
        int n = arr.length;
        removeDuplicate(arr,n);
    }
}
