package com.InterviewProgram;
import java.util.*;
public class largestSubstring {
    //wap to get largest substring from given string without repeating any character;

    static int longestUniqueSubsttr(String s)
    {

        // Creating a set to store the last positions of occurrence
        HashMap<Character, Integer> seen = new HashMap<>();
        int maximum_length = 0;

        // starting the initial point of window to index 0
        int start = 0;

        for(int i = 0; i < s.length(); i++)
        {
            // Checking if we have already seen the element or not
            if(seen.containsKey(s.charAt(i)))
            {
                // If we have seen the number, move the start pointer
                // to position after the last occurrence
                start = Math.max(start, seen.get(s.charAt(i)) + 1);
            }

            // Updating the last seen value of the character
            seen.put(s.charAt(i), i);
            maximum_length = Math.max(maximum_length, i-start + 1);
        }
        return maximum_length;
    }

    // Driver code
    public static void main(String []args)
    {
        String s = "geeksforgeeks";
        System.out.println("The input String is " + s);
        int length = longestUniqueSubsttr(s);
        System.out.println("The length of the longest non-repeating character substring is " + length);
    }
}

