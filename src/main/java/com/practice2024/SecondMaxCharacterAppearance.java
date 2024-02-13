package com.practice2024;

import java.util.HashMap;
import java.util.Map;

//https://www.digizol.com/2013/07/second-highest-frequency-character-java.html

public class SecondMaxCharacterAppearance {

    public static void main(String[] args) {
        String inputStr = "rhhxdrfdytrdrgfhvcggsys";

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (Character str : inputStr.toCharArray()) {
            frequencyMap.put(str,frequencyMap.getOrDefault(str,0)+1);
        }

        int maxCount = -1;
        int secondMaxCount = -1;
        char maxStr = '\u0000';
        char secondMaxStr='\u0000';

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            int count = entry.getValue();
            if (count > maxCount) {
                secondMaxCount = maxCount;
                secondMaxStr = maxStr;

                maxCount = count;
                maxStr = entry.getKey();
            } else if (count > secondMaxCount && count < maxCount) {
                secondMaxCount = count;
                secondMaxStr = entry.getKey();
            }
        }

        System.out.println("Most frequent string: " + maxStr + " (Count: " + maxCount + ")");
        System.out.println("Second most frequent string: " + secondMaxStr + " (Count: " + secondMaxCount + ")");
    }
}
