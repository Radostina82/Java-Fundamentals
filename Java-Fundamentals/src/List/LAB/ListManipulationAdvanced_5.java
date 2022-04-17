package List.LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] token = input.split("\\s+");
            String command = token[0];
            if (command.equals("Contains")) {
                boolean isContains = isContains(number, token);
                if (isContains) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command.equals("Print")) {
                printEvenOrOddNumber(number, token);
            } else if (command.equals("Get")) {
                printSum(number, token);
            } else if (command.equals("Filter")) {
                filterNumber(number, token);
            }

            input = scanner.nextLine();
        }
    }

    private static void printEvenOrOddNumber(List<Integer> number, String[] token) {
        String command = token[1];
        for (int i = 0; i <= number.size() - 1; i++) {
            int num = number.get(i);
            if (command.equals("even")) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            } else if (command.equals("odd")) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
        }
        System.out.println();
    }

    private static void filterNumber(List<Integer> number, String[] token) {
        String command = token[1];
        String command1 = token[2];
        int num = Integer.parseInt(command1);

        for (int i = 0; i <= number.size() - 1; i++) {
            int n = number.get(i);
            if (command.equals("<")) {
                if (num > n) {
                    System.out.print(n + " ");
                }
            } else if (command.equals(">")) {
                if (num < n) {
                    System.out.print(n + " ");
                }
            } else if (command.equals(">=")) {
                if (num <= n) {
                    System.out.print(n + " ");
                }
            } else if (command.equals("<=")) {
                if (num >= n) {
                    System.out.print(n + " ");
                }
            }
        }
        System.out.println();
    }


    private static void printSum(List<Integer> number, String[] token) {
        String command = token[1];
        int sum = 0;
        for (int i = 0; i <= number.size() - 1; i++) {
            int num = number.get(i);
            sum += num;
        }
        System.out.println(sum);
    }

    private static boolean isContains(List<Integer> number, String[] token) {
        String command = token[1];
        int element = Integer.parseInt(command);
        return number.contains(element);
    }
}
