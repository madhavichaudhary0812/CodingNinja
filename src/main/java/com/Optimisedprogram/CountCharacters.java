package com.Optimisedprogram;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacters {

    /*WAP to count character in String using HashMap?
      WAP to iterate HashMap.?
    *
    *
    * */

    public static void countCharacters (String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (Character ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);


        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            if (set.getValue() > 1)
            {
                System.out.println("Character " +set.getKey() +" value is --> "+set.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String str = "dhgfuvfevuyyefexjsmsowddcsd";
        countCharacters(str);
    }
}
