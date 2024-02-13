package com.practice2024;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfCharAtString {


    public static void getFrequency(String str) {

        if(str ==null || str.length()<1)
        {
            System.out.println("String doesn't have character");
            return;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(Character ch : str.replaceAll(" ","").toCharArray())
        {
            map.put(ch, map.getOrDefault(ch,0)+1);

        }

        System.out.println(map);

    }


    public static void main(String[] args) {
        String str ="My name is madhavi";

        getFrequency(str);
    }
}
