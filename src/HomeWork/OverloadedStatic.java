package HomeWork;

public class OverloadedStatic {
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.


    public static void Overloaded1(int num, int num1, int num2){
        System.out.println(num+num1+num2);

    }
    public static void Overloaded1( double num,double num1,double num2){
        System.out.println(num+num1+num2);
}

    public static void Overloaded1(double num,int num1,double num2){
        System.out.println(num+num1+num2);

}

    public static void main(String[] args) {
        Overloaded1(10,10,10);
        Overloaded1(1.5,1.5,1.5);
        Overloaded1(1.5,2,1.5);

    }






}
