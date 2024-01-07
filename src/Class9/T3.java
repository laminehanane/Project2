package Class9;

public class T3 {
    public static void main(String[] args) {


        String[][] students = {{"Hanane", "souf", "yannis", "janna"},
                                  {"a", "b", "c", "d"}
        };
        for (int i = 0; i < students[0].length ; i++){
            if (students[1][i].equals("a") || students[1][i].equals("b"))
            System.out.println(students[0][i]+" "+students[1][i]);
        }


    }
}