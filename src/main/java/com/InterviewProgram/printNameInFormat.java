package com.InterviewProgram;

public class printNameInFormat {

        public static String printInitials(String str) {
            int len = str.length();
            String gender = "Female";

            // to remove any leading or trailing spaces
            str = str.trim();
            String fullname = new String();

            // to store extracted words
            String t = "";
            for (int i = 0; i < len; i++) {
                char ch = str.charAt(i);

                if (ch != ' ') {

                    // forming the word
                    t = t + ch;
                }

                // when space is encountered
                // it means the name is completed
                // and thereby extracted
                else {
                    // printing the first letter
                    // of the name in capital letters
                    fullname += Character.toUpperCase(t.charAt(0))
                            + ".";
                    t = "";
                }
            }

            String temp = "";

            // for the surname, we have to print the entire
            // surname and not just the initial
            // string "t" has the surname now
            for (int j = 0; j < t.length(); j++) {

                // first letter of surname in capital letter
                if (j == 0)
                    temp = temp + Character.toUpperCase(t.charAt(0));

                    // rest of the letters in small
                else
                    temp = temp + Character.toLowerCase(t.charAt(j));
            }
            String initailName = temp + " " + fullname;

            if (gender.equalsIgnoreCase("Female"))
                initailName = "Miss " + initailName;
            else
                initailName = "Mr " + initailName;
            System.out.println(initailName);
            return initailName;
        }

        public static void main(String[] args) {
            String str = "Madhavi Kumari Chaudhary";
            printInitials(str);
        }
    }




