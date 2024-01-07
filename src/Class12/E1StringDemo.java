package Class12;

public class E1StringDemo {
    public static void main(String[] args) {
        String str="Its savera's birthday today.its Sunday.Today is Java Class";
        String [] strArr=str.split("[.]");
        System.out.println(strArr.length);
        System.out.println(str.replaceAll(" ",""));
    }
}
