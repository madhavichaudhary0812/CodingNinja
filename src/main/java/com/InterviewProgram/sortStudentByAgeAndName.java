package com.InterviewProgram;

import java.util.ArrayList;
import java.util.Collections;

public class sortStudentByAgeAndName {

    public static void main(String []args)
    {
        ArrayList<Student1> al = new ArrayList<>();
        al.add(new Student1(2,"Vijay", 6));
        al.add(new Student1(1,"Raghu", 7));
        al.add(new Student1(3,"Maddy", 8));
        al.add(new Student1(5,"Niku", 6));
        al.add(new Student1(4,"Vijay", 5));

        System.out.println("sorting by Age");
        Collections.sort(al, new ageComparator());
        for(Student1 st : al)
        {
            System.out.println("{" +st.rollNumber + " "+ st.name + " "+ st.age +"}");
        }

        System.out.println("********************************************************************************");

        System.out.println("sorting by Name");
        Collections.sort(al, new nameComparator());
        for(Student1 str : al)
        {
            System.out.println("{" +str.rollNumber + " "+ str.name + " "+ str.age +"}");
        }


    }
}
