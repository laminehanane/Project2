package Class3;

public class E12IfElse {
    public static void main(String[] args) {
        String name="sino";
        //whenever we have a non primitive type we should never use== sign.
        // the sign (!) means non equal
        if (!name.equals("sino")){
            System.out.println("Fast");
        }else {
            System.out.println("Moderate");
        }

    }
}
