import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfRange, temp = 0;
        System.out.print("How many number add your array: ");
        numberOfRange = input.nextInt();
        int[] arr = new int[numberOfRange];
        System.out.println("Enter the number of arrays: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". digits: ");
            arr[i] = input.nextInt();
        }

        System.out.println("Your Array is :" +Arrays.toString(arr));
        for(int i=0;i<numberOfRange;i++) {
            for(int j=i+1;j<numberOfRange;j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("Your Array in a row : "+Arrays.toString(arr));
    }
 }
