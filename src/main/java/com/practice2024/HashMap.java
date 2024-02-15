package com.practice2024;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class HashMap {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();
        int  n =3;

        map.put(2,"India");
        map.put(3,"PAK");
        map.put(1,"Bangladesh");
        map.put(5,"France");
        map.put(7,"Italy");
        map.put(4,"Swiss");

        System.out.println(map);
        System.out.println(map.size());

        int i=1;
        while(i < n) {
            int a =  map.lastKey();
            map.remove(a);
            i++;
        }

        int key = map.lastKey();
        System.out.println(map.get(key));
    }
}
