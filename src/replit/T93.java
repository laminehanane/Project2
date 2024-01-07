package replit;

public class T93 {
    public static void main(String[] args) {
/*String “abracadabra alakazam”;
- Print out the position of the first occurrence of "c".
- Print out the position of the first occurrence of " ".
- Print out the position of the first occurrence of the variable target1.
- Print out the position of the first occurrence of the variable target2.*/

    String str = "abracadabra alakazam";
    String target1 = "dab";
    String target2 = "ABRA";
        int positionOfC = str.indexOf('c');
        System.out.println(positionOfC);
        int positionOfspace = str.indexOf(" ");
        System.out.println(positionOfspace);


        int positiontarget1=str.indexOf(target1);
        System.out.println(positiontarget1);
        int positiontarget2=str.indexOf(target2);
        System.out.println(positiontarget2);





}}
