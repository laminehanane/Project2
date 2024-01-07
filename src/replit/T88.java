package replit;

public class T88 {
    String breed;
    String name;
    String color;
    void bark(){
        System.out.println(name+" can bark");
    }
    void run(){
        System.out.println(name+" can run");
    }
    void play() {
        System.out.println(name + " can play");
    }

    public static void main(String[] args) {

        T88 dog1= new T88();

        dog1.breed="German";
        dog1.name="Husky";
        dog1.color="white";
        dog1.bark();
        dog1.run();
        dog1.play();

        T88 dog2= new T88();
        dog2.breed="Italian";
        dog2.name="Bulldog";
        dog2.color="Black";
        dog2.bark();
        dog2.run();
        dog2.play();

        T88 dog3=new T88();
        dog3.breed="Germ";
        dog3.name="Labrador";
        dog3.color="gray";
        dog3.bark();
        dog3.run();
        dog3.play();










    }





}
