package Class14;

public class T4 {
    /*Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name*/
   private String vowels(String V) {
        String V2 = V.replaceAll("[^aeiouAEIOU]", " ");
        return V2;
    }

    public static void main(String[] args) {
        T4 X=new T4();
        System.out.println(X.vowels("hello students"));
    }


}