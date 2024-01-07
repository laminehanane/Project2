package Class22;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("hanane");
        names.add("yannis");
        names.add("souf");
        names.add("kkkkk");
        System.out.println(names.isEmpty());
        System.out.println(names.size());
        System.out.println(names.contains("fatima"));
        System.out.println(names);
        names.set(3,"ppppppp");
        System.out.println(names.get(3));

        for (int i = 0; i < names.size(); i++) {
            String s=names.get(i);
            if (s.contains("s")){
            names.set(i,"java");}

        }
        System.out.println(names);

        for (String s : names) {
            if (s.contains("a")){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
