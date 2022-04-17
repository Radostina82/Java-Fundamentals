package MidExamExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> treasure = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {
            String[] command = input.split("\\s+");

            if (command[0].equals("Loot")) {
                for (int i = 1; i <= command.length - 1; i++) {
                    String treasures = command[i];
                    if (!treasure.contains(treasures)) {
                        treasure.add(0, treasures);
                    }
                }
            } else if (command[0].equals("Drop")) {
                int index = Integer.parseInt(command[1]);
                if (index >= 0 && index < treasure.size() - 1) {
                    if (treasure.contains(treasure.get(index))) {
                        String element = treasure.get(index);
                        treasure.remove(element);
                        treasure.add(element);
                    }
                }

            } else if (command[0].equals("Steal")) {
                int count = Integer.parseInt(command[1]);
                if (count > treasure.size()) {
                    List<String> treasure1 = new ArrayList<>(treasure);
                    treasure.removeAll(treasure1);
                    for (int i = 0; i <=treasure1.size()-1 ; i++) {
                        String element = treasure1.get(i);
                        if (i==treasure1.size()-1){
                            System.out.print(element);
                            break;
                        }
                        System.out.print(element + "," + " ");
                    }

                    System.out.println();
                } else {
                    List<String> treasure1 = new ArrayList<>();
                    for (int i = 1; i <= count; i++) {
                        treasure1.add(treasure.get(treasure.size() - 1));
                        treasure.remove(treasure.size() - 1);
                    }
                    for (int i = treasure1.size() - 1; i >= 0; i--) {
                        String element = treasure1.get(i);
                        if (i==0){
                            System.out.print(element);
                            break;
                        }
                        System.out.print(element + "," + " ");
                    }

                    System.out.println();
                }
            }

            input = scanner.nextLine();
        }
        if (treasure.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            double sum = 0;

            for (int i = 0; i <= treasure.size() - 1; i++) {
                String element = treasure.get(i);
                int countLetter = 0;
                for (int j = 0; j <= element.length() - 1; j++) {
                    countLetter++;
                }
                sum += countLetter;
            }
            double totalSum = sum / treasure.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", totalSum);
        }
    }
}
