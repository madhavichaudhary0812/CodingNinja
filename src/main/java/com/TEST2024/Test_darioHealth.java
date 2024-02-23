package com.TEST2024;

import java.util.*;

public class Test_darioHealth {

    ////td[normalize-space()='5.4 Mbps']
    
    public static void main(String[] args) {
      
        Map<Integer,Integer> map =new HashMap<Integer, Integer>();
        map.put(1, 50);
        map.put(2, 60);
        map.put(3, 30);
        map.put(4, 60);
        map.put(5, 60);


        int largest=(Collections.max(map.values()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==largest) {
                System.out.println(entry.getKey());
            }
        }

    }}

