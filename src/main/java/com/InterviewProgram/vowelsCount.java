package com.InterviewProgram;

import java.util.HashMap;
import java.util.*;

public class vowelsCount {

    //WAP to count of each vowels in the string

    //1- By Hasmap

    public static void vowelsCount(String str)
    {
        char [] arr = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : arr)
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }else
            {
                map.put(ch, 1);
            }
        }

        Set<Map.Entry<Character,Integer>> keys = map.entrySet();
        for(Map.Entry<Character, Integer> chr : keys)
        {
            if(chr.getKey() == 'a' || chr.getKey() == 'e' || chr.getKey() =='i' || chr.getKey() == 'o'||chr.getKey() == 'u')
            {
               System.out.println(chr.getKey() + " - count is : " +chr.getValue());
            }
            else
            {
                System.out.print("");
            }
        }
    }


    //2- second Solution by Array

    public static void vCountByArray(String str)
    {
        str = str.toLowerCase();
        int [] array = new int[5];

        for(int i=0 ; i< str.length()-1; i++)
        {
            if(str.charAt(i) == 'a')
            {
                array[0]++;
            }
            if(str.charAt(i) == 'e')
            {
                array[1]++;
            }
            if(str.charAt(i) == 'i')
            {
                array[2]++;
            }
            if(str.charAt(i) == 'o')
            {
                array[3]++;
            }
            if(str.charAt(i) == 'u') {
                array[4]++;
            }
        }
        System.out.println("******************************************************");
        System.out.println("vowels 'a' count is : " +array[0]);
        System.out.println("vowels 'e' count is : " +array[1]);
        System.out.println("vowels 'i' count is : " +array[2]);
        System.out.println("vowels 'o' count is : " +array[3]);
        System.out.println("vowels 'u' count is : " +array[4]);
    }

    // 3- Solution third by hasmap

    public static void vowelsFrequency(String str)
    {
        str = str.toLowerCase();
        char [] chArray = str.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',0);
        map.put('e',0);
        map.put('i',0);
        map.put('o',0);
        map.put('u',0);
        for(int i=0; i< str.length()-1; i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);

            }

        }
        System.out.println("*******************************************");
        System.out.println(map);

    }

    public static void main(String []args)
    {
        String str = "madhavieouaeiiiuu";
        vowelsCount(str);
        vCountByArray(str);
        vowelsFrequency(str);
    }
}
