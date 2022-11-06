package com.InterviewProgram;

import java.util.HashMap;
import java.util.Set;

public class isAnnagram {
    public static boolean areAnagram(String s1, String  s2)
    {
        char arr[] = s1.toCharArray();
        char brr[] = s2.toCharArray();
        int n = arr.length;
        int m = brr. length;

        if( n != m)
        {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i<n ; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i] , map.get(arr[i])+ 1);
            }else
            {
                map.put(arr[i] ,1);
            }
        }


        for(int i = 0; i<n ; i++)
        {
            if(map.containsKey(brr[i]))
            {

                map.put(brr[i] ,map.get(brr[i]) - 1);
            }else
            {
                return false;
            }
        }


        Set<Character> keys = map.keySet();

        for(Character key : keys)
        {
            if(map.get(key) !=0)
            {
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String s1 = "listen";
        String s2 = "silent";

        String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeeks";

        boolean result =  areAnagram(s1, s2);
        boolean result1 =  areAnagram(str1, str2);

        System.out.println(result);
        System.out.println(result1);
    }


}



