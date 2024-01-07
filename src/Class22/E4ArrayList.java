package Class22;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("hanane");
        names.add("yannis");
        names.add("souf");
        names.add("janna");
        for (int i = 0; i < names.size(); i++) {
            String s= names.get(i);
            System.out.println(names.get(i));

        }
        System.out.println("**************************");
        for (String s : names) {
            System.out.println(s);

        }
    }
}
