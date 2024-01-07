package HomeWork;

public class Car1 {
    //Create a class Car with properties like make, model, and year.
    //Implement a method calculate_rental_price based on the number of rental days.
    //Create two subclasses: LuxuryCar and EconomyCar. Override the calculate_rental_price method in LuxuryCar to include additional charges.
    //Demonstrate the functionality by creating instances of each class and calling their methods

    String make;
    String model;
    int year;

    public Car1(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void calcuprice(int days) {
        double rentalprice = days * 100;
        System.out.println(rentalprice);

    }
}

class LuxuryCar extends Car1{
    public LuxuryCar(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void calcuprice(int days) {
        double rentalprice = days * 150;
        System.out.println(rentalprice);
    }
}
class EconomyCar extends Car1{

    public EconomyCar(String make, String model, int year) {
        super(make, model, year);
    }
}

class Car1Tester{
    public static void main(String[] args) {
        Car1 C=new Car1("toyota","pruis",2011);
        C.calcuprice(5);
        LuxuryCar l=new LuxuryCar("honda","accord",2017);
        l.calcuprice(2);

    }

}