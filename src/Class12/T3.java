package Class12;

public class T3 {
    public static void main(String[] args) {
        /*
You have a String a=”Is it saturday? Is it raining?
Do we have a Java Class today?” How would you find out how many
sentences are in that String?
 */
        String str="Is it saturday?Is it raining?Dowe have a java Class today?";
        System.out.println(str.split("[?]").length);
    }
}
