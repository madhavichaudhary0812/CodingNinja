package com.Optimisedprogram;

public class RemoveJunkAndSpecialChar {

    /* WAP to remove special characters & Junk
    * Aprroach - use regular expression [a-z, 0-9, A-Z]
    *
    * */

    public static void removeJunk(String s)
    {
        if(s == null || s.length() <1)
        {
            System.out.println("String either null or empty");
            return;
        }

        String newStr = s.replaceAll("[^a-z,A-Z,0-9]","");

        if(newStr.length()<1)
        {
            System.out.println("All characters are junk and special characters in given String.");
        }else {
            System.out.println(newStr);
        }

    }


    public static void main(String[] args) {
        String str = "Y^%^*%&*^*(&*(Pankaj";
        String s1 = "";
        String s2 = null;
        String s3 = "%^*%&*";
        removeJunk(str);
        removeJunk(s1);
        removeJunk(s3);
        removeJunk(s2);

    }
}
