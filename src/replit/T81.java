package replit;

public class T81 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 8};
        int max = numbers[0];// Assume the first element is the maximum
         for (int i=0 ; i<numbers.length ;i++){
             if (numbers[i]>max){
                  max=numbers[i];// Update max if a higher value is found

                }
            }
        System.out.println("The highest value in the array is: " + max);
        }
    }
