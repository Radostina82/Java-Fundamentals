package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        boolean isFound = false;

        for (int index = 0; index <= numbers.length - 1; index++) {
            //трябва да намеря сумата на левите и десните числа, като правя нов цикъл който започва от 0 до
            //индекса на моето число минус 1 за левите
            //за десните започвам от индекса на моето число плюс 1 до края на индексите в масива
            //ако сумите от ляво и дясно са равни идекса е индекса на моето число
            int sumLeft = 0;
            int sumRight = 0;
            for (int indexLeft = 0; indexLeft <= index - 1; indexLeft++) {
                sumLeft += numbers[indexLeft];
            }
            for (int indexRight = index + 1; indexRight <= numbers.length - 1; indexRight++) {
                sumRight += numbers[indexRight];
            }
            if (sumLeft == sumRight){
                System.out.println(index);
                isFound = true;
            }
        }
        if (!isFound){
            System.out.print("no");
        }
    }
}
