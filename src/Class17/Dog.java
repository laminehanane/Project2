package Class17;

import Class16.Animal;

class animal {
    private String name;
    private String color;
    private int age;
    private double weight;

    public animal(){

    }
    public animal(String name,String color,int age,double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    public void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
public class Dog extends animal{
   Dog(String name,String color,int age,double weight){
       super(name,color,age,weight);
   }
}
class Cat extends animal{
Cat(){
super();
}
}
