package Review3;

import java.util.Arrays;

public class E4 {
    public static void main(String[] args) {
        String [] students=new String[5];
        students[0]="hanane";
        students[1]="souf";
        students[2]="yannis";
        students[3]="janna";
        students[4]="israa";
        for (int i=0; i< students.length ; i++){
            if (students[i].equals("yannis")){
                students[i]="Good student";
                System.out.println(students[i]);
            }
        }
        System.out.println("secont method to print :");
        System.out.println(Arrays.toString(students));

        }

    }

