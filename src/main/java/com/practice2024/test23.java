package com.practice2024;

import java.util.TreeMap;

public class test23 {

    //map<Integer, String> =
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(7,"Madhavi");
        map.put(3,"rohit");
        map.put(1,"b");
        map.put(5,"c");
        map.put(2,"mfjhhgf");
        map.put(4,"ty");

        System.out.println(map);

        int n =3;
        int i=1;

        while (i<n)
        {
           int a = map.lastKey();
           map.remove(a);
           i++;
        }

        int b = map.lastKey();
        System.out.println(map.get(b));
        map.remove(b);
        System.out.println(map);
    }
}




//emp id emp name emp dep
//emp id emp salary

//select department from employee e empsalry s
