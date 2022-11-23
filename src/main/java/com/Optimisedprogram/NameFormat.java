package com.Optimisedprogram;

public class NameFormat {

    public static String getnameIntials(String s)
    {
        if(s==null ||s.length()==0)
        {
            return s;
        }

        String str[] = s.split((" "));
        StringBuilder sb = new StringBuilder("Mr. "+ str[str.length-1] + " ");
        for (int i = 0; i < str.length-1; i++) {
            sb.append(str[i].substring(0,1).toUpperCase()+ ".");
        }

        return sb.substring(0,sb.length());
    }

    public static void main(String[] args) {
        String s1 = "Abhishek kumar Shrivastav";
        String s2 = "Madhavi Chaudhary";
        System.out.println(getnameIntials(s1));

    }
}
