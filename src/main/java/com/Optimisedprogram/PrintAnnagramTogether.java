package com.Optimisedprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintAnnagramTogether {

/* Company Fynd

    Program - WAP to Print Annagram together in list
    Input: strs = ["eat","tea","tan","ate","nat","bat"]
    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    */

    public static void printAnnagram(String[] arr) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            char[] ch = word.toCharArray();
            Arrays.sort(ch);

            String newWord = new String(ch);

            if (map.containsKey(newWord)) {
                map.get(newWord).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(newWord, list);
            }
        }

        System.out.println(map);

        for (String s : map.keySet()) {
            List<String> values = map.get(s);
            if (values.size() > 1) {
                System.out.print(values);
            } System.out.print(" ");

        }

    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String str[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        printAnnagram(str);


    }
}
