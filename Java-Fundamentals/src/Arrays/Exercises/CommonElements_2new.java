package Arrays.Exercises;

import java.util.Scanner;

public class CommonElements_2new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arrayFirst = scanner.nextLine().split(" ");
        String [] arraySecond = scanner.nextLine().split(" ");

        for (String letter: arrayFirst) {
            for (String letter1: arraySecond) {
                if (letter.equals(letter1)){
                    System.out.print(letter + " ");
                }
            }

        }
    }
}
