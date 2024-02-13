package com.practice2024;

import java.util.HashMap;
import java.util.Map;

public class validAnagram {

    public static boolean isAnagram(String s1, String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s1.length(); i++) {
          map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
          map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)-1);
        }

        for(char ch : map.keySet())
        {
            if(map.get(ch) !=0)
            {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        // Test case 1
        String s1 = "listen";
        String t1 = "silent";
        System.out.println(isAnagram(s1, t1)); // Expected output: true

        // Test case 2
        String s2 = "hello";
        String t2 = "world";
        System.out.println(isAnagram(s2, t2)); // Expected output: false

        // Test case 3
        String s3 = "anagram";
        String t3 = "nagaram";
        System.out.println(isAnagram(s3, t3)); // Expected output: true

        // Test case 4
        String s4 = "rat";
        String t4 = "car";
        System.out.println(isAnagram(s4, t4)); // Expected output: false

        // Test case 5
        String s5 = "";
        String t5 = "";
        System.out.println(isAnagram(s5, t5)); // Expected output: true
    }
}
