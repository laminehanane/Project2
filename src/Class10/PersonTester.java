package Class10;

public class PersonTester {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="hanane";
        p1.weight=23;
        p1.age=170;
        p1.gender='M';
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.weight);
        System.out.println(p1.gender);
        p1.eat();
        p1.sleep();
    }
}
