package HomeWork;

public class Vehicle {
    //Create a class named Vehicle. If no arguments are passed while creating an object of the class, it should print "I love vehicles".
    // If a String representing the type of vehicle (like "Car", "Bike") is passed, it should print "I love [VehicleType]".
    // For example, if "Car" is passed, it should print "I love Car"
public Vehicle(){
    System.out.println("i love vehicles");
}
public Vehicle(String VType){
    System.out.println("i love "+VType);
}

    public static void main(String[] args) {
        Vehicle v1=new Vehicle() ;
        Vehicle v2=new Vehicle("car");
        Vehicle v3=new Vehicle("bike");
    }


}
