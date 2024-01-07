package Class15;

public class Book {
    private  String name;
    private String color;
    private int age;
    private double weight;

    public Book(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;

    }

    public Book(String name, String color, int age,double weight) {
        this(name,color,weight);
        this.age = age;
    }

    public void printInfo(){
        System.out.println(name+" "+color+" "+weight+" "+age);

    }
    public void printAll(){
        System.out.println(name+" "+color+" "+weight);
    }

    public static void main(String[] args) {
        Book b1=new Book("hanane","white",12,33.5);
        b1.printInfo();
        Book b2=new Book("souf","black",22.5);
        b2.printAll();

    }

}
