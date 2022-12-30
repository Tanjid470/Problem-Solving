
package GFG_JAVA;

import java.util.Scanner;



class Student{
    String name;
    int Class;
    
    Student(){
        //Defult constrctor
    }
    Student(String name,int Class){
        this();
        this.name=name;
        this.Class=Class;
    }
    
    void output(){
        System.out.println("Name : "+name);
        System.out.println("Class: "+Class);
    }
}

class Teacher extends Student{
    int age;
    Scanner input = new Scanner(System.in);
    Teacher (String name,int  Class,int age)
    {
       super(name,Class);
       this.age=age;
    } 
    
    void output(){
        super.output();
        System.out.println("Age  : "+age);
    }
}


public class Simple_OOP_Project {
    public static void first()
        {
            System.out.println("\n\t\t\tNew Student\n");
        }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        first();
        Student s1=new Student("Tanjid",200101470);
        s1.output();
        Teacher t1=new Teacher("Amran",200101475,23);
        t1.output();
        System.exit(0); 
        
    }
    
}
