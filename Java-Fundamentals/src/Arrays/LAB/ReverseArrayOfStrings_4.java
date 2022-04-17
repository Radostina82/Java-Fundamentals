package Arrays.LAB;

import java.util.Scanner;

public class ReverseArrayOfStrings_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] array = scanner.nextLine().split(" ");
        for (int i = 0; i < array.length/2 ; i++) {
            String symbol = array[i];
            array[i] = array [array.length - 1 - i];
            array [array.length - 1 - i] = symbol;
        }
        System.out.println(String.join(" ", array));
    }
}
