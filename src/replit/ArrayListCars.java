package replit;

import java.util.ArrayList;

public class ArrayListCars {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
         cars.add("toyota");
         cars.add("honda");
         cars.add("kia");
         cars.add("fait");
        System.out.println(cars);
        cars.forEach(x-> System.out.println(x));
    }









}
