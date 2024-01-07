package Class16;

public class MultilevelTester {
    public static void main(String[] args) {
        audi a=new audi();
        a.color="black";
    }
}
class vehicle{
    String color;
}
class Car extends vehicle{
    int noOfDoors=4;

}
class audi extends Car{
boolean badEngines=true;
}