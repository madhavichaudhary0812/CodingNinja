package com.InterviewProgram;

public class RemoveSpaceFromString {
//WAP to remove space from String
    public static String removeSpace(String str)
    {
        String ansStr ="";
        String ansStr1[] = str.split("\\s");

        for(int i=0; i<ansStr1.length;i++) {
            ansStr = ansStr + ansStr1[i];
        }
        return ansStr;
    }
    //or another by using String class methods
    public static String removeSpace1(String str)
    {
        String ansStr =str.replaceAll("\\s","");

        return ansStr;
    }
    public static void main(String []args)
    {
        String str = "my name is madhavi name denotes person madhavi is qa and works in testing team";
        String str2= "my name is madhavi name";
        String finalStr = removeSpace(str);
        String finalStr1 = removeSpace1(str2);
        System.out.print(finalStr);
        System.out.println(" ");
        System.out.print(finalStr1);
    }
}
