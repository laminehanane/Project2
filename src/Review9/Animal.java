package Review9;

public abstract class Animal {
    private String name ;
    private String color;
    private int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public abstract void eat();
    public abstract void speak();
    public void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}
class Dog extends Animal{
   String bread;

    public Dog(String name, String color, int age, String bread) {
        super(name, color, age);
        this.bread = bread;
    }

    @Override
    public void eat() {
        System.out.println("Dogs loves meet");
    }

    @Override
    public void speak() {
        System.out.println("Wao Wao Wuff Wuff");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(bread);
    }
    void run(){
        System.out.println("dog running");
    }
}
class Cat extends Animal{

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Cats like fish ");
    }

    @Override
    public void speak() {
        System.out.println("Meow Meow");
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
 class AnimalTester{
    public static void main(String[] args) {
        Dog d=new Dog("jacky","black",1,"German");
        Cat c=new Cat("Mano","White",2);

        Animal [] animals={d,c};
        for (Animal a : animals) {
            a.eat();
            a.speak();
            a.printInfo();
        }
        //upcasting
        Animal a=animals[0];
        //downcasting
        ((Dog)a).run();
        // Or Dog d2=(Dog)a;
        //    d2.run();


    }
}