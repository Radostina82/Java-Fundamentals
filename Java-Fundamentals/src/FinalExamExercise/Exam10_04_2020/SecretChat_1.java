package FinalExamExercise.Exam10_04_2020;

import java.util.Scanner;

public class SecretChat_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            //ChangeAll:|:V:|:l
            String[] token = input.split(":\\|:");
            String command = token[0];

            if (command.equals("InsertSpace")) {
                int index = Integer.parseInt(token[1]);
                message.insert(index, " ");
                System.out.println(message);
            } else if (command.equals("Reverse")) {
                String substring = token[1];
                String newMassage = message.toString();
                if (newMassage.contains(substring)) {
                    newMassage = newMassage.replaceFirst(substring, "").concat(new StringBuilder(substring).reverse().toString());
                    message = new StringBuilder(newMassage);
                    System.out.println(message);
                } else {
                    System.out.println("error");
                }

            } else if (command.equals("ChangeAll")) {
                String substring = token[1];
                String replacement = token[2];
                String newMassage = message.toString();
                newMassage = newMassage.replaceAll(substring, replacement);
                message = new StringBuilder(newMassage);
                System.out.println(message);
            }

            input = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + message);
    }
}
