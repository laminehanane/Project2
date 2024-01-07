package Review6;

public class person {
    String name;
    int age;
    double weight;
    double height;
    void eat(){
        System.out.println("eating....");
    }
    String getName(){
        return name;
    }

    public static void main(String[] args) {
        person p=new person();
        p.name="hanane";
        p.age=22;
        p.height=5.4;
        p.weight=120;
        System.out.println(p.name);
        p.eat();
    }
}
