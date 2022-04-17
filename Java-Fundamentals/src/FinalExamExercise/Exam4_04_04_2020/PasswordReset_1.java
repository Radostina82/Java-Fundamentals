package FinalExamExercise.Exam4_04_04_2020;

import java.util.Scanner;

public class PasswordReset_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] token = input.split("\\s+");
            String command = token[0];

            if (command.equals("TakeOdd")) {
                password = getNewPassword(password);
                System.out.println(password);

            } else if (command.equals("Cut")) {
                int index = Integer.parseInt(token[1]);
                int length = Integer.parseInt(token[2]);
                String remove = password.substring(index,index+ length);
                password = password.replaceFirst(remove, "");
                System.out.println(password);

            } else if (command.equals("Substitute")) {
                String substring = token[1];
                String substitute = token[2];

                if (password.contains(substring)) {
                    password = password.replace(substring, substitute);
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", password);
    }

    private static String getNewPassword(String password) {
        StringBuilder pass = new StringBuilder();

        for (int i = 1; i <= password.length() - 1; i += 2) {
            char symbol = password.charAt(i);
            pass.append(symbol);
        }
        return pass.toString();
    }
}
