package Review3;

public class E92Darray {
    public static void main(String[] args) {
        int[][] numbers = {{10, 20, 30, 40},
                {20, 40, 60, 80},
                {30, 60, 90, 120}
        };
        System.out.println(numbers.length);//how many row
        System.out.println(numbers[1].length);
        for (int i = 0; i < numbers[i].length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();

        }
    }
}
