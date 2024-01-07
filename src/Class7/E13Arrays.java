package Class7;

public class E13Arrays {
    public static void main(String[] args) {
        //int [] numbers={10,20,30,45,69,55,69,78,15,20};
        int [] numbers={9,10,15,18,20,22,22,30,60};
        //search for number 55 if present print found
        for (int i=0; i<numbers.length;i++){
            if (numbers[i]==55){
                System.out.println("found");
                break;
            }
        }

    }
}

