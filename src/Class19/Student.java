package Class19;

public class Student {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define 3 common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism*/
   void studying(){
       System.out.println("Student Studying Java class");
   }
   void attending(){
    System.out.println("Student attending Java class");
   }
   void watching (){
       System.out.println("Student watching Java class");
   }

}
class SyntaxStudent extends Student{
    void play(){
        System.out.println("Student likes to play");
    }

}
class CollegeStudent extends Student{
    void attending(){
        System.out.println("Student attending Java class");
    }

}
class SchoolStudent extends Student {
    void watching() {
        System.out.println("Student watching Java class");

    }

}