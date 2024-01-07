package Class9;

public class T4 {
    public static void main(String[] args) {
        String[][] Grocery = {{"banana", "apple", "pear", "orange"},
                {"tomato", "botato", "cucumber", "sq"},
                {"muffin", "baklava", "pie", "cake"},
                {"cheese", "milk", "butter", "buttermilk"}

        };
        for (int i=0;i<Grocery.length ; i++){
            for (int j=0 ; j <Grocery[i].length ; j++){
                System.out.print(Grocery[i][j]+" ");
            }
        }
        System.out.println();
    }
}
