package Arrays.Exercises;

import java.util.Scanner;

public class CommonElements_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arrayFirst = scanner.nextLine().split(" ");
        String [] arraySecond = scanner.nextLine().split(" ");

        for (int index = 0; index <= arrayFirst.length-1 ; index++) {
            String letter = arrayFirst[index];
            for (int index1 = 0; index1 <= arraySecond.length-1 ; index1++) {
                String letter2 = arraySecond[index1];
                if (letter.equals(letter2)){
                    System.out.print(letter + " ");
                }
            }
        }
    }
}
