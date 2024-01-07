package Class11;

import java.util.Locale;

public class E7StringDemo {
    public static void main(String[] args) {
        String str="HELLO";
        // transfer all to lowercase and remove space and then count the length.

        System.out.println(str.trim().length());
        System.out.println(str.trim().toLowerCase().equals("hello"));

    }
}
