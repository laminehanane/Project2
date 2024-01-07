package Class12;

public class T5 {
    //How would you reverse a String word by word? for example
    // input=>This is sentence i want to reverse
    // output=>sihT si ecnetnes i tnaw ot esrever
    public static void main(String[] args) {
        String str="This is sentence i want to reverse";
        String [] words=str.split(" ");
        for (String w: words) {
            for (int i =w.length()-1; i >=0 ; i--) {
                System.out.print(w.charAt(i));
                
            }
            System.out.print(" ");
            
        }

    }
}
