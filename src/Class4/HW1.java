package Class4;

public class HW1 {
    public static void main(String[] args) {
        double age=20;
        double weight=100;
        if (age<18){
            System.out.println("you are not eligible to donate blood");
        }else if (age>=18){
            if (weight>=110){
                System.out.println("you are eligible to donate ");
            }else {
                System.out.println(" you are not eligible");
            }

        }

    }
}
