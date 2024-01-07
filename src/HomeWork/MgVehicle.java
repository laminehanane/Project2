package HomeWork;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//Vehicle Management System: Design a base class Vehicle with methods like startEngine(), stopEngine(), fuelUp(),
// and fields like make, model, and fuelLevel. Create subclasses like Car, Truck, and Motorcycle,
// each with specific implementations for the methods, considering their unique characteristics.
public abstract class MgVehicle{
   private String make ;
   private String model;
   private String fuelLevel;

    public MgVehicle(String make, String model, String fuelLevel) {
        this.make = make;
        this.model = model;
        this.fuelLevel = fuelLevel;
    }
    public void printInfo(){
        System.out.println("Vehicke make "+make+" model "+model+" fuel :"+fuelLevel);
    }

    public abstract void  startEngine();
    public abstract void  stopEngine();
    public abstract void  fuelUp();
}
class Car extends MgVehicle{

    public Car(String make, String model, String fuelLevel) {
        super(make, model, fuelLevel);
    }

    @Override
    public void startEngine() {
        System.out.println("TURN ON THE CAR");

    }

    @Override
    public void stopEngine() {
        System.out.println("STOP THE CAR ");

    }

    @Override
    public void fuelUp() {
        System.out.println("GET MORE FUEL");
    }
}
class Truck extends MgVehicle{

    public Truck(String make, String model, String fuelLevel) {
        super(make, model, fuelLevel);
    }

    @Override
    public void startEngine() {
        System.out.println("TURN ON THR TRUCK");
    }

    @Override
    public void stopEngine() {
        System.out.println("STOP THE TRUCK");
    }

    @Override
    public void fuelUp() {
        System.out.println("ADD fuel to the truck");
    }
}
class MgVehicleTester{
    public static void main(String[] args) {
        MgVehicle[] arr={new Car("toyota","pruis","diesel"),
                       new Truck("honda","accord","gaz")};

        for (MgVehicle vehicle : arr) {
            vehicle.printInfo();
            vehicle.startEngine();
            vehicle.stopEngine();
            vehicle.fuelUp();

            System.out.println("**********************************************");
        }



    }
}