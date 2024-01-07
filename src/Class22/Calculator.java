package Class22;

public interface Calculator {
    int add(int num1,int num2);
    int subtract(int num1,int num2);
}
class Math implements Calculator{

    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1-num2;
    }
}
class MathTester {
    public static void main(String[] args) {
        //  Calculator m=new Math();
        /*
        we can't create the object of interfaces
         */
        // Calculator c=new Calculator();
        Math m=new Math();
        int r=  m.add(10,10);
        System.out.println(r);

    }
}