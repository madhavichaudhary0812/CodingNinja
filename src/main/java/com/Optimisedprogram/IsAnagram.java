package com.Optimisedprogram;

import java.util.HashMap;
import java.util.Set;

public class IsAnagram {

    /* WAP to Verify two strings are Anagram.like :
          Input - "silent" , "listen"
          Output - true

       Source Link 1-https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/
       Source Link 2-

       Scenarios :
        1- Positive & Negative scenarios
        2- Both String is null
        3- Both string length is not equal

    * */
    public static boolean anagramCheck(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n != m) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Character chr : s2.toCharArray()) {
            map.put(chr, map.getOrDefault(chr, 0) - 1);
/*            if(map.containsKey(chr))
            {
                map.put(chr, map.get(chr)-1);
            }else
            {
                return false;
            }*/

        }

        Set<Character> keys = map.keySet();

        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
/*
    if(map.isEmpty()!=false)
        {
            return false;
        }*/

        return true;
    }


    public static void main(String[] args) {
        System.out.println("This program will check below given strings are anagrams");

        String s1 = "listen";
        String s2 = "silent";

        System.out.println("Above mentioned strings are Anagram --->  " + anagramCheck(s1, s2));
    }
}
