package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());//дължина на масива
        int[] array = new int[n];
        //initialIndexes - това ми е разположението на калинките първоначално
        int[] initialIndexes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        String command = scanner.nextLine();

        for (int initialIndex : initialIndexes) {
            if (initialIndex >= 0 && initialIndex <= array.length - 1){
                array[initialIndex] = 1;
            }
        }

        while (!command.equals("end")) {
            String[] input = command.split(" ");
            int indexLadybug = Integer.parseInt(input[0]);
            String directionLadybug = input[1];
            int lehght = Integer.parseInt(input[2]);
//правя проверка дали индекса на местене ми е в масива, ако е в масива и на този индекс има калинка
            //то този индекс ми се освобождава от калинка и тя лети
            if (indexLadybug >= 0 && indexLadybug <= array.length - 1 && array[indexLadybug] == 1) {
                array[indexLadybug] = 0;
                if (directionLadybug.equals("right")) {
                    indexLadybug += lehght;//тук търси къде да кацне
                    while (indexLadybug <= array.length - 1 && array[indexLadybug] == 1) {
                        indexLadybug += lehght;//търси свободна позиция, на която да кацне калинката
                    }
                    if (indexLadybug <= array.length - 1) {
                        array[indexLadybug] = 1;//калинката каца на свободния индекс, ако е в рамките на масива
                    }
                } else if (directionLadybug.equals("left")) {
                    indexLadybug -= lehght;
                    while (indexLadybug >= 0 && array[indexLadybug] == 1) {
                        indexLadybug -= lehght;
                    }
                    if (indexLadybug >= 0) {
                        array[indexLadybug] = 1;
                    }
                }
            }

            command = scanner.nextLine();
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
