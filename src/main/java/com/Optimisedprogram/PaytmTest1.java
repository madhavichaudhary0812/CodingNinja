package com.Optimisedprogram;

public class PaytmTest1 {

    /*WAP to Reverse String not word like below :
    input - "My Name is Madhavi"
    output - "Madhavi is Name My"
    source before - https://leetcode.com/submissions/detail/836989446/
         Scenario 1 - When String is null;
         Scenario 3 - When String have only one word;
         Scenario 4 - When String have more than one word;
         remove space from front and back
         Keep single space
     */
    public static String reverseStringNotWord(String str)
    {


        if(str == null)
        {
            System.out.println("------> Given String is null <------");
            return null;
        }else if(str.length()<1)
        {
            System.out.println("------> Given String is empty <------");
            return null;
        }



        String []arr = str.split(" ");

        StringBuilder reverseString = new StringBuilder("");

        for(int i =arr.length-1 ; i>=0; i-- )
        {
            if(arr[i].length()==0)
            continue;
            reverseString = reverseString.append(" "+arr[i]);


        }
       // System.out.println("------> reverse String for <------"+reverseString.toString().trim());
       return reverseString.toString().trim();
    }



    public static void main(String []args)
    {
        System.out.println("***** WAP to reverse the string but not words *****");
        String str = "My Name    is Madhavi";

        System.out.println(str.split(" ").length);

        String str1 = "";
        String str2 = null;
        String str3 = "try";

        System.out.println(reverseStringNotWord(str));

        //reverse(str);
        reverseStringNotWord(str1);
        reverseStringNotWord(str2);
        reverseStringNotWord(str3);

    }

}
