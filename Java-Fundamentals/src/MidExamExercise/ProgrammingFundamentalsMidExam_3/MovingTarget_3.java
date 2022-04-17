package MidExamExercise.ProgrammingFundamentalsMidExam_3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String command = input.split("\\s+")[0];

            if (command.equals("Shoot")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);
                int power = Integer.parseInt(input.split("\\s+")[2]);

                if (index >= 0 && index <= targets.size() - 1) {
                    if (targets.get(index) - power > 0) {
                        targets.set(index, targets.get(index) - power);

                    } else {
                        targets.remove(index);
                    }
                }

            } else if (command.equals("Add")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);
                int value = Integer.parseInt(input.split("\\s+")[2]);

                if (index >= 0 && index <= targets.size() - 1) {
                    targets.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                }

            } else if (command.equals("Strike")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);
                int radius = Integer.parseInt(input.split("\\s+")[2]);

                if (index + radius <= targets.size() - 1 && index - radius >= 0) {
                    for (int i = index - radius; i <= index + radius; i++) {
                        targets.set(i, -1);
                    }
                    for (int i = 0; i <= targets.size() - 1; i++) {
                        int element = targets.get(i);
                        if (element == -1) {
                            targets.remove((Object) element);
                            i--;
                        }
                    }

                } else {
                    System.out.println("Strike missed!");
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i <= targets.size() - 1; i++) {
            int element = targets.get(i);
            if (i == targets.size() - 1) {
                System.out.print(element);
                break;
            }
            System.out.print(element + "|");
        }

    }
}
