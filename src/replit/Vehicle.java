package replit;

public class Vehicle {
    /*Vehicle Hierarchy Task: Create a class Vehicle with subclasses like Car, Truck, Motorcycle, and Bicycle.
Define common attributes like speed, color, and fuelType in the Vehicle class.
Override methods in the subclasses, like accelerate and brake, with specific behaviors.
Add unique methods in subclasses, like loadCargo in Truck.
Instantiate objects of each subclass and store them in an array. Iterate through the array to demonstrate polymorphism.*/
    private int speed;
    private String color;
    private String fuelType;
    private String Vclass;
    public Vehicle(int speed, String color, String fuelType, String vclass) {
        this.speed = speed;
        this.color = color;
        this.fuelType = fuelType;
        Vclass = vclass;
    }
    void PrintInfo(){
        System.out.println(speed+" "+color+" "+fuelType+" "+Vclass);
    }
    void accelerate(){
        System.out.println("you have to accelerate");
    }
    void brake(){
        System.out.println(" you have to stop");
    }
    void load(){
        System.out.println("  load  Me ");}

}
class Truck extends Vehicle {
    public Truck(int speed, String color, String fuelType, String vclass) {
        super(speed, color, fuelType, vclass);
    }

    @Override
    void load() {
        super.load();

    }
}
    class Car extends Vehicle {
        public Car(int speed, String color, String fuelType, String vclass) {
            super(speed, color, fuelType, vclass);
        }

        @Override
        void brake() {

            System.out.println("YOU HAVE TO TOUCH YOUR BRAKE SOFTLY");
        }
    }

    class Motorcycle extends Vehicle {
        public Motorcycle(int speed, String color, String fuelType, String vclass) {
            super(speed, color, fuelType, vclass);
        }

        @Override
        void accelerate() {
            System.out.println("YOU HAVE TO SLOWLY ACCELERATE");
        }

        @Override
        void brake() {
            System.out.println("YOU HAVE Changed");
        }
    }

    class Bike extends Vehicle {
        public Bike(int speed, String color, String fuelType, String vclass) {
            super(speed, color, fuelType, vclass);
        }
    }

    class VehicleTester {
        public static void main(String[] args) {
            Vehicle[] arrV = {new Truck(50, "white", "Diesel", "BigVeh"),
                    new Car(60, "black", "Gaz", "Eco"),
                    new Bike(70, "gray", "electric", "Air"),
                    new Motorcycle(80, "Green", "N/A", "Mua")};
            for (Vehicle veh : arrV) {
                veh.PrintInfo();
                veh.accelerate();
                veh.brake();
                veh.load();




            }
        }
    }
