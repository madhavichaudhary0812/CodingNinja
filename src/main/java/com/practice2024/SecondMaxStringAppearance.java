package com.practice2024;

import java.util.HashMap;
import java.util.Map;

//https://www.linkedin.com/pulse/5-finding-2nd-most-frequent-string-array-rupa-shree-k/

public class SecondMaxStringAppearance {
    public static void main(String[] args) {
        String[] inputStr = {"hi", "hey", "hi", "hi", "hello", "hey"};

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String str : inputStr) {
            if (frequencyMap.containsKey(str)) {
                frequencyMap.put(str, frequencyMap.get(str) + 1);
            } else {
                frequencyMap.put(str, 1);
            }
        }

        int maxCount = -1;
        int secondMaxCount = -1;
        String maxStr = "";
        String secondMaxStr = "";

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
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
