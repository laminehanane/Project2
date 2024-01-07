package Review10;

public class Dog {
    private String Dog;
    private String breed;
    private int age;

    public Dog(String dog, String breed, int age) {
        Dog = dog;
        this.breed = breed;
        this.age = age;
    }

    public String getDog() {
        return Dog;
    }

    public void setDog(String dog) {
        Dog = dog;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
