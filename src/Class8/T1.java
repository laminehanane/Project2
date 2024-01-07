package Class8;

public class T1 {
    public static void main(String[] args) {
        String [] names={"Aidos","Zeeshan","Abid","Sharif","Zeeshan"};
        //Write a program to count how many times the name zeeshan
        // is appeared in this array
        for ( int i=0 ; i<names.length ; i++)
            if (names[i].equals("Zeeshan")){
                System.out.println(names[i]);
            }
        // second method
        System.out.println();
        int count=0;
        for ( int i=0 ; i<names.length ; i++)
            if (names[i].equals("Zeeshan")){
                count++;
            }
        System.out.println("Zeeshan appeared "+count+" times");
    }

}
