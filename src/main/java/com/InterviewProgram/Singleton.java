package com.InterviewProgram;

public class Singleton {

    private static Singleton singleton_instance = null;
    public String str;
//Singleton class is a class that can have only one object(instance of the class) at a time
// Design singleton class -
    //1- Make constructor as private
    //2- Write a public static method that has return type of object of this Singleton class - Lazy Initialization
    private Singleton()
    {
        str = "This is singleton class string";
    }

    public static Singleton getInstance()
    {
        if(singleton_instance == null)
        {
            singleton_instance = new Singleton();
        }

        return singleton_instance;
    }

    public static void main(String []args)
    {
        Singleton X = Singleton.getInstance();
        Singleton Y = Singleton.getInstance();
        Singleton Z = Singleton.getInstance();
//        System.out.println(X);
//        System.out.println(Y);
//        System.out.println(Z);
        if(X == Y && Y==Z)
        {
            System.out.println("Created objects have same reference address");
        }

    }
}


/* How to Design/Create a Singleton Class in Java?
    To create a singleton class, we must follow the steps, given below:

            1. Ensure that only one instance of the class exists.

            2. Provide global access to that instance by

    Declaring all constructors of the class to be private.
    Providing a static method that returns a reference to the instance. The lazy initialization concept is used to write the static methods.
    The instance is stored as a private static variable.

    Example of singleton classes is Runtime class, Action Servlet, Service Locator. Private constructors and factory methods are also an example of the singleton class.

*/
/*

    Difference between Normal Class and Singleton Class
        We can distinguish a Singleton class from the usual classes with respect to the process of instantiating the
        object of the class. To instantiate a normal class, we use a java constructor. On the other hand, to instantiate
        a singleton class, we use the getInstance() method.

        The other difference is that a normal class vanishes at the end of the lifecycle of the application while the
        singleton class does not destroy with the completion of an application.

        Forms of Singleton Class Pattern
        There are two forms of singleton design pattern, which are:

        Early Instantiation: The object creation takes place at the load time.
        Lazy Instantiation: The object creation is done according to the requirement.

        Implementation: Let us brief how the singleton class varies from the normal class in java. Here the difference
         is in terms of instantiation as for normal class we use constructor, whereas for singleton class we use
         getInstance() method which we will be peeking out in example 1 as depicted below. In general, in order to
         avoid confusion, we may also use the class name as method name while defining this method which will be as
         depicted in example 2 below as follows.*/
