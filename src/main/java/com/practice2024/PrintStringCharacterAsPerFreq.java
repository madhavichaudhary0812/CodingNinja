package com.practice2024;
import java.util.*;


public class PrintStringCharacterAsPerFreq {
/*
        public static String frequencySort(String s) {
           // Map<Character, Integer> cnt = new HashMap<>(52);
            Map<Character, Integer> cnt = new HashMap<Character, Integer>(52);
            for (int i = 0; i < s.length(); ++i) {
                //cnt.getOrDefault(s.charAt(i),0)+1);
                cnt.merge(s.charAt(i), 1, Integer::sum);
            }
            List<Character> cs = new ArrayList<>(cnt.keySet());
            cs.sort((a, b) -> cnt.get(b) - cnt.get(a));
            StringBuilder ans = new StringBuilder();
            for (char c : cs) {
                for (int v = cnt.get(c); v > 0; --v) {
                    ans.append(c);
                }
            }
            return ans.toString();
        }

    public static void main(String[] args) {
        String str = "hshdjkdfiuuyiaaaooee";
        System.out.println(frequencySort(str));
    }
*/

    }

