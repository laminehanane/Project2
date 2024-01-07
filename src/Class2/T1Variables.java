package Class2;

public class T1Variables {
    public static void main(String[] args) {
        /*
Create a Java program and name it Variables
In your program create different type of variables to store student’s
 information(first name, last name, city, state, phone number) and then
 print value of those variables in the format:
My First name is ___ and my  last name is ____
I live in city__ and state____
And my phone number is ____
 */
        String firstname="Hanane";
        String lastname="Lamine";
        String city="Sterling";
        String state="Va";
        String phonenumber="+1234567890";
        System.out.println("My First name is "+firstname+" and my last name is "+lastname);
        System.out.println("My city is "+city+" and my state is "+state);
        System.out.println("My phone number is "+phonenumber);

        city="casablanca";
        state="Morocco";
        phonenumber="+234567890";
        System.out.println("updated city is "+city);
        System.out.println("updated state is "+state);
        System.out.println("Updated phone number is "+phonenumber);



    }
}
