package Class7;

public class E8Arrays {
    public static void main(String[] args) {
        char [] gender=new char[3];
        gender[0]='F';
        gender[1]='M';
        gender[2]='0';
        // gender[3]='D'; error as capacity is reached
        System.out.println(gender[0]);
    }
}
