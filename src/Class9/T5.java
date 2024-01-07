package Class9;

public class T5 {
    public static void main(String[] args) {
        String[][] carsarray = {
                {"Chevrolet", "Ford", "Dodge"},
                {"BMW", "Mercedes", "Audi"},
                {"Hyundai", "Kia", "Genesis"},
                {"Ferrari", "Lamborghini", "Maserati"}
        };
        for (int i=0;i<carsarray.length ; i++){
            for (int j=0 ; j <carsarray[i].length ; j++){
                System.out.print(carsarray[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("\nsecond methode with Enhanced for loop\n");
        for (String[] arr:carsarray){
            for (String car:arr){
                System.out.print(car+" ");
            }
            System.out.println();
        }
    }
}
