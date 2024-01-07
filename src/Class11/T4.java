package Class11;

public class T4 {
    public static void main(String[] args) {
        String str="Hello";
        if(!str.isEmpty()) {
            if (str.length()%2==0 ||str.length()>=3){
                System.out.println(str.charAt(str.length()/2));

            }

        }
        System.out.println("second methode ");


        if(!str.isEmpty()){
            int len=str.length();
            if(len>=3 && len%2!=0){
                System.out.println(str.charAt(len/2));
            }

        }
        System.out.println("thirth methode");
        for (int i = 0; i < str.length(); i++) {
            if (!str.isEmpty()){

            }
        }
        System.out.println(str.charAt(str.length()/2));

    }
}
