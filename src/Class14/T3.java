package Class14;

import java.io.FilterOutputStream;

public class T3 {
    //Create a method that will take a String as a parameter and returns reversed String.
    //Method should be available to all classes within your project and accessible by class name.
    String str(String word){
       String  rev ="";
        for (int i=word.length()-1; i>=0 ; i--) {
            rev=rev+word.charAt(i);
        }return rev;
    }

    public static void main(String[] args) {
        T3 a= new T3();
        System.out.println(a.str("hello"));
    }





}
