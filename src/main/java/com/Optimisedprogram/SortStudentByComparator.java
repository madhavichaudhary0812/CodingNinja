package com.Optimisedprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortStudentByComparator {

    public static void main(String[] args) {
        ArrayList <Student> al = new ArrayList<>();
        al.add(new Student(1,"Ram",12,56));
        al.add(new Student(4,"Mohan",11,67));
        al.add(new Student(5,"Deepak",9,78));
        al.add(new Student(7,"Ankur",12,34));
        al.add(new Student(2,"Vidut",10,49));
        al.add(new Student(6,"Mohit",13,83));
        al.add(new Student(3,"Reshma",8,52));

        System.out.println("Sort Student on basis of Age :");
        Collections.sort(al,new AgeComparator());
        for(Student st : al)
        {
            System.out.println("{"+st.age + ", " + st.name + ", " + st.marks+ ", " + st.rollNumber+"}");
        }

        System.out.println(("Sort Student on basis of name :"));
        Collections.sort(al,new NameComparator());
        for(Student st : al)
        {
            System.out.println("{"+st.name + ", " +st.age+ ", " +st.rollNumber+ ", " +st.marks+ "}");
        }

        System.out.println(("Sort Student on basis of marks :"));
        Collections.sort(al,new MarksComparator());
        for(Student st : al)
        {
            System.out.println("{" +st.marks + ", " +st.name+ ", " +st.age+ ", " +st.rollNumber+ "}");
        }

        System.out.println(("Sort Student on basis of RollNumber :"));
        Collections.sort(al,new RollNumberComparator());
        for(Student st : al)
        {
            System.out.println("{" +st.rollNumber + ", " +st.name+ ", " +st.age+ ", " +st.marks+ "}");
        }
        
    }
}


class Student
{
    int rollNumber ;
    String name;
    int age;
    int marks;
    
    Student (int rollNumber, String name,int age,int marks)
    {
        this.rollNumber= rollNumber;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}

class AgeComparator implements Comparator<Student>
{

    @Override
    public int compare(Student s1, Student s2) {
        
        if(s1.age == s2.age) {
            return 0;
        }else if(s1.age > s2.age)
        {
            return 1;
        }else
        {
            return -1;
        }
    }
}

class MarksComparator implements Comparator<Student>
{

    @Override
    public int compare(Student s1, Student s2) {
        
        if(s1.marks == s2.marks)
        {
            return 0;
            
        }else if(s1.marks > s2.marks)
        {
            return 1;
        }else
        {
            return -1;
        }
        
    }
}

class NameComparator implements Comparator<Student>
{

    @Override
    public int compare(Student s1, Student s2) {

        return s1.name.compareTo(s2.name);
    }
}

class RollNumberComparator implements Comparator<Student>
{

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.rollNumber == s2.rollNumber)
        {
            return 0;

        }else if(s1.rollNumber > s2.rollNumber)
        {
            return 1;
        }else
        {
            return -1;
        }

    }
}
