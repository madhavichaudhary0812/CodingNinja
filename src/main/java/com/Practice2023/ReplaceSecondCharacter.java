package com.Practice2023;

public class ReplaceSecondCharacter {

    public static String replaceSecondCharacter(String str)
    {
        if(str == null)
        {
            System.out.println("String is null");
        }else if(str.length() < 2)
        {
            System.out.println("string one character only");
        }

        StringBuilder sb = new StringBuilder();
        int count =0;
        char arr[] = str.toCharArray();

        for(int i=0; i< arr.length ;i++)
        {
            if(arr[i]=='o' || arr[i] =='O')
            {
                if(count==1)
                {
                    arr[i]='$';
                }
                count++;
            }

            sb = sb.append(arr[i]);

        }

        if(count>1)
        {
            System.out.println("Have character twice");
        }else{
            System.out.println("String Have not character twice");
        }
        return sb.toString();

    }

    public static String replaceSecondOccurance(String str, char c)
    {
        int n = str.indexOf(c);
        int m = str.substring(n + 1).indexOf(c);
        if(m==-1)
        {
            System.out.println("String doesn't have character twice");
            return str;
        }
        return str.substring(0,(m+n+1)) +"&"+ str.substring(n + m +2);

    }





    public static void main(String []args){
        String str="Tomorrow";
        String str1 ="";
        String str2 ="today";
        String str3 ="t";
        System.out.println(replaceSecondCharacter(str));
        System.out.println(replaceSecondCharacter(str3));
        System.out.println(replaceSecondCharacter(str1));
        System.out.println(replaceSecondCharacter(str2));

        System.out.println(replaceSecondOccurance(str,'o'));
        System.out.println(replaceSecondOccurance(str3 , 'o'));
        System.out.println(replaceSecondOccurance(str1,'o'));
        System.out.println(replaceSecondOccurance(str2,'o'));

    }
}
