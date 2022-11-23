package com.test;

public class Test4 {

    /* WAP Printing frequency of each character just after its consecutive occurrences
    String s = aaaabbbccddaaeed —
    o/p = a4b3c2d2a2e2d1
    *aaaabbbccddaaeed — a4b3c2d2a2e2d1
Harshit Kumar - Zepto
String s1= new String("Zepto")
String s2= new String("Zepto")

System.out.println(s1==s2)
System.out.println(s1.equals(s2))
    * */

    public static void countCharacters(String s) {

        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }
            System.out.print(s.charAt(i) + "" + count + "");

        }
    }

    public static void main(String[] args) {
        String s = "aaaabbbccddaaeed";
        countCharacters(s);
    }

}
