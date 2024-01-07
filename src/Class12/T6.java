package Class12;

public class T6 {
    public static void main(String[] args) {
        String str = "hanane";
        String reversedWord="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedWord = reversedWord+str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversedWord)){
            System.out.println("It's a Palindrome");
        }else{
            System.out.println("It's not a Palindrome");
        }

    }
}