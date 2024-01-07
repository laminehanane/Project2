package Class22;

public class CalculatorTester {
    public static void main(String[] args) {
       //Calculator m=new Math(); **we can do this too**
        Math m=new Math();
        // we cant creating the object of interfaces**Calculator c=new Calculator()**
        int R1=m.add(10,10);
        int R2=m.subtract(20,10);
        System.out.println(R1);
        System.out.println(R2);
    }
}
