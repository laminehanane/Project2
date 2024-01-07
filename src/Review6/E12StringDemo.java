package Review6;

public class E12StringDemo {
    public static void main(String[] args) {
        String str="My name is James my Number is 1234567";
        String number=str.replaceAll("[^0-9]","");
        System.out.println(number);
        StringBuilder StringB=new StringBuilder("Java");
    }
}
