package Class14;

public class Cat {
    //instance variable
    String name="kitti";

    void printname(){
        //local variable
        String name="Pishak";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.printname();

    }
}
