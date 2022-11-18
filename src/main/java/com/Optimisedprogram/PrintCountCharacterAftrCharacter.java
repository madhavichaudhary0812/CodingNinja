package com.Optimisedprogram;

public class PrintCountCharacterAftrCharacter {

    /* Company - Zepto
    * WAP Printing frequency of each character just after its consecutive occurrences
    String s = aaaabbbccddaaeed —
    o/p = a4b3c2d2a2e2d1
    * 1,6,7,8 - 22 // 1 2 3 4 - 10- 1
    *
    * */

    public static String PrintCountAfterChar(String str) {
        StringBuilder newStr = new StringBuilder();
        if (str == null) {
            return null;
        }

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                i++;
                count++;
            }

            newStr = newStr.append(str.charAt(i) + "" + count + "");

        }

        return newStr.toString();
    }

    public static void PrintCountAfterChar1(String str)
    {

        for (int i = 0; i < str.length(); i++) {
            int count =1;
            while(i+1 < str.length() && str.charAt(i) == str.charAt(i+1))
            {
                i++;
                count++;
            }
            System.out.print(str.charAt(i)+""+count+"");

        }
    }

    public static void main(String[] args) {

        String str = "aaaabbbccddaaeed";
        System.out.println(PrintCountAfterChar(str));
        PrintCountAfterChar1(str);

    }
}
