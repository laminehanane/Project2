package Class22;

import java.util.ArrayList;

public class ArrayListHw {
    public static void main(String[] args) {
        ArrayList<Integer> evennumbers=new ArrayList<Integer>();
        // Loop to add even numbers from 1 to 500 to the ArrayList

        for (int i = 2; i <= 500; i=i+2) {
            evennumbers.add(i);
        }
        System.out.println(evennumbers);
        System.out.println("\n********************");
        for (int j = 0; j < evennumbers.size(); j++) {
            if (evennumbers.get(j)%5==0){
                evennumbers.remove(j);
            }
        }
        System.out.println(evennumbers);




    }
}
