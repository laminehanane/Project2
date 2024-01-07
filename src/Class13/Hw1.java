package Class13;

public class Hw1 {
    //Create a method that will say Hello in different language based on the country
    // that will passed when method is executed. Do it for any five countries
     void hello (String country)  {
         if (country.equalsIgnoreCase("morocco")){
             System.out.println("salam");
         } else if (country.equalsIgnoreCase("france")) {
             System.out.println("bonjour");
         } else if (country.equalsIgnoreCase("usa")) {
             System.out.println("hi");
         }else {
             System.out.println("invalid");
         }
     }





}
