package replit;

public class T98 {
    //Create a String given="Hello Syntax friends".
    //Using String methods from given String create new String
    // "Welcome Syntax family"
    public static void main(String[] args) {
        String given= "Hello Syntax friends";
        String newgiven=given.replace("Hello","Welcome").replace("friends","family");
        System.out.println(newgiven);
    }
}
