package Class15;

public class Cat {
    private  String name;
    private String color;
    private int age;

    public Cat(String cName,String cColor,int cAge){
        this.name=cName;
        this.color=cColor;
        this.age=cAge;
    }
    public void printInfo(){
        String name="lolo";
        System.out.println(this.name+" "+color+" "+age);
    }

    public static void main(String[] args) {
        Cat c=new Cat("kitti","white",13);
        c.printInfo();
    }
}
