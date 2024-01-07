package Class15;

public class Dog {
   private String name;
   private String breed;
   private String color;
    private int age;

   public Dog(String dName,String dBreed, String dColor,int dAge) {
       name = dName;
       breed = dBreed;
       color = dColor;
       if (age < 30) {
           age = dAge;
       } else {
           System.out.println("wrong age");
       }

   }

        void printInfo(){
        System.out.println(name+" "+breed+" "+color+" "+age);
    }

}
