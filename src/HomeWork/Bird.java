package HomeWork;

public class Bird {
    //Create a Bird class create 4 fields and use the
    //Bird class as parent class and create 2 classes
    //Using it one sparrow and one parrot use constructors make fields private and define printInfo methods
    // as well create the object of each class and call the methods

    private String name;
    private String color;
    private int age;
    private double weight;

    void Printinfo() {
        System.out.println(name + " " + color + " " + age + " " + weight);
    }

    public Bird(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
}
class sparrow extends Bird{
    sparrow(String name, String color, int age, double weight) {
        super(name,color,age,weight);
    }
}
class parrot extends Bird{
        parrot(String name, String color, int age, double weight){
            super(name,color,age,weight);
        }


}
