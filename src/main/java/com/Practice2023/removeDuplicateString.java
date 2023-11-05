package com.Practice2023;

import java.util.HashMap;
import java.util.Map;

public class removeDuplicateString {

    public static void removeDuplicateString(String str)
    {
        String arr[] = str.split("\\s");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : arr)
        {
             map.put(word, map.getOrDefault(word,0)+1);
        }
        System.out.print("String after removing duplicate String -: ");

     for(Map.Entry<String, Integer> mp : map.entrySet())
     {
         if(mp.getValue() == 1)
         {
             String sb = mp.getKey();
             System.out.print(sb+" ");
         }
     }
    }

    public static void main(String []args){
        String str = "My name is madhavi and this is my another program in program list";
        removeDuplicateString(str);
    }
}
