package MidExamExercise.ProgrammingFundamentalsMidExam_5;

import java.util.Scanner;

public class MuOnline_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");
        int health = 100;
        int countRoom = 0;
        int bitcoin = 0;
        boolean isDie = false;


        for (int i = 0; i <= input.length - 1; i++) {
            String[] token = input[i].split("\\s+");
            String command = token[0];
            int number = Integer.parseInt(token[1]);

            if (command.equals("potion")) {
                countRoom++;
                if (health < 100) {
                    health += number;
                    if (health >= 100) {
                        int over = health - 100;
                        health -= over;
                        System.out.printf("You healed for %d hp.%n", number - over);
                        System.out.printf("Current health: %d hp.%n", health);
                        continue;
                    }
                }
                System.out.printf("You healed for %d hp.%n", number);
                System.out.printf("Current health: %d hp.%n", health);
            } else if (command.equals("chest")) {
                countRoom++;
                bitcoin += number;
                System.out.printf("You found %d bitcoins.%n", number);
            } else {
                health -= number;
                if (health > 0) {
                    countRoom++;
                    System.out.printf("You slayed %s.%n", command);
                } else {
                    countRoom++;
                    System.out.printf("You died! Killed by %s.%n", command);
                    isDie = true;
                    break;
                }
            }

        }
        if (isDie) {
            System.out.printf("Best room: %d%n", countRoom);
        } else {
            System.out.printf("You've made it!%n");
            System.out.printf("Bitcoins: %d%n", bitcoin);
            System.out.printf("Health: %d", health);
        }
    }
}
