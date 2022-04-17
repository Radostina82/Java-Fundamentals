package MidExamExercise.ProgrammingFundamentalsMidExam_3;

import java.util.Scanner;

public class CounterStrike_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialEnergy = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isEnd = false;
        String input = scanner.nextLine();
        while (!input.equals("End of battle")) {

            int distance = Integer.parseInt(input);


            if (initialEnergy >= distance) {

                count++;
                initialEnergy -= distance;
                if (count % 3 == 0) {
                    initialEnergy += count;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", count, initialEnergy);
                isEnd = true;
                break;
            }
            if (initialEnergy < 0) {
                break;
            }

            input = scanner.nextLine();
        }
        if (!isEnd) {
            System.out.printf("Won battles: %d. Energy left: %d", count, initialEnergy);
        }
    }

}

