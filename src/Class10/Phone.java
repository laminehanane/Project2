package Class10;
//Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung create 3 to 5 attributes
//And three behaviours

public class Phone {
    String make;
    String model;
    double price;
    String color;

    void takepics() {
        System.out.println("use camera to take pics");
    }
    void call(){
        System.out.println("calling...");
    }
    void playVideos(){
        System.out.println("Playing videos....");
    }

    public static void main(String[] args) {
        Phone iphone=new Phone();
        iphone.make="apple";
        iphone.color="White";
        iphone.model="iphone 15";
        iphone.price=1200;
        System.out.println(iphone.make);
        System.out.println(iphone.model);
        System.out.println(iphone.price);
        System.out.println(iphone.color);
        iphone.takepics();
        iphone.call();
        iphone.playVideos();





    }

}
