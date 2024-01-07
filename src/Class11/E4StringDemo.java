package Class11;

public class E4StringDemo {
    public static void main(String[] args) {
        String str="Now i love Java Java is great";
        System.out.println(str.startsWith("Now"));
        System.out.println(str.startsWith("N"));
        System.out.println(str.startsWith(""));// its true because there is nothing before nothing
        System.out.println(str.endsWith("great"));
        System.out.println(str.endsWith("java"));
        System.out.println(str.contains("Java"));
        System.out.println(str.contains("Python"));
    }



}
