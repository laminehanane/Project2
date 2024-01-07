package replit;

import java.awt.*;

public class T87 {
    String Color;
   int year;
    String make;



    public static void main(String[] args) {
        T87 Car1=new T87();
       Car1.Color="Black";
        Car1.year=2019;
        Car1.make="BMW";

        T87 Car2=new T87();
        Car2.Color="White";
        Car2.year=2018;
        Car2.make="Toyota";


        System.out.println("Car color is "+Car1.Color+" and car year is "+Car1.year+" and car model is "+Car1.make);
        System.out.println("Car color is "+Car2.Color+" and car year is "+Car2.year+" and car model is "+Car2.make);
    }

}

