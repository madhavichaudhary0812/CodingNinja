package com.practice2024;

public class lengthOfLastWord {

    public static int lengthOfLastWord(String str)
    {
        int count =0;

        String newStr = str.trim();
        for (int i = newStr.length()-1; i >=0 ; i--) {
            if(newStr.charAt(i) != ' ')
            {
                count++;
            }else
            {
                break;
            }

        }


        return count;
    }

    public static void main(String[] args) {
        String str ="   fly me   to   the moon  ";
        String strOne = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(str));
        System.out.println(lengthOfLastWord(strOne));

    }
}
