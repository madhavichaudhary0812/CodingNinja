package com.Optimisedprogram;

import java.util.LinkedHashMap;

public class GetCharCountIgnoreNumAndSpecialChar {


    /* WAP to print frequency of each alphabetic characters of given String and ignore other numeric and special characters
    *  Test Program with below string value :
        String s = "madhaMMMMvi1234chaudhary234$@"; --> Mix of all characters
        String s1 = ""; --> Empty String
        String s2 = "@"; --> With one and more than one special characters only String no alphabetic characters.
        String s3 = "4"; --> With one and more than one numeric characters only String no alphabetic characters.
        String s5 = null; --> Null String
        String s6 = "a";  --> With one and more than one lower case characters only String no alphabetic characters.
        String s7 = 12345;  --> Numeric & numeric data format value
        String s8 = true;  --> boolean data format value
        String s9 = "MASDHGEUUDHhkkkjjj"; --> With one and more than one upper case characters only String no alphabetic characters.
        String s10 = Max Length ;
    * approach -
    * Company - Global Logic Client round - ConnectWise
    * */

    public static void getFrequencyChar(String s) {

        if(s == null || s.length()<1)
        {
            System.out.println("String is null or either empty");
            return;
        }
        //String str = s.replaceAll("[0-9-+^!@#$%&*()]*","");
        String str = s.replaceAll("[^a-zA-Z]", "");
        System.out.println(str);
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (Character ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }

        if(map.isEmpty())
        {
            System.out.println("No Alphabetic Characters exist in String");
        }else {

            System.out.println(map);
        }


    }

    public static void getFrequencyChar2(String s) {

        if(s == null || s.length()<1)
        {
            System.out.println("String is null or either empty");
            return;
        }

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i <s.length(); i++)
        {
            if((s.charAt(i) >= 65 && s.charAt(i) <=90 ) || (s.charAt(i) >=97 && s.charAt(i) <=127))
            {
                sb = sb.append(s.charAt(i));
            }
        }

        String str = sb.toString();
        System.out.println(str);

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character ch : str.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }

        if(map.isEmpty())
        {
            System.out.println("No Alphabetic Characters exist in String");
        }else {

            System.out.println(map);
        }
    }


    public static void main(String[] args) {
        String s = "madhaMMMMvi1234chaudhary234$@";
        String s1 = "";
        String s2 = "@";
        String s3 = "4";
        String s5 = null;

        getFrequencyChar(s2);
        getFrequencyChar2(s5);

    }
}
