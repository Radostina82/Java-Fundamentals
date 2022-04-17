package FinalExamExercise.Exam5_04_04_2020;

import java.util.Scanner;

public class ActivationKeys_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Generate")){
            String [] token = input.split(">>>");
            String command = token[0];

            if (command.equals("Contains")){
                String substring = token[1];
                if (key.contains(substring)){
                    System.out.printf("%s contains %s%n", key, substring);
                }else {
                    System.out.println("Substring not found!");
                }

            }else if (command.equals("Flip")){
                String command1 = token[1];
                int startIndex = Integer.parseInt(token[2]);
                int endIndex = Integer.parseInt(token[3]);

                if (command1.equals("Upper")){

                String flipUpper = key.substring(startIndex, endIndex);
                key = key.replace(flipUpper, flipUpper.toUpperCase());

                }else if (command1.equals("Lower")){
                    String flipLower = key.substring(startIndex, endIndex);
                key = key.replace(flipLower, flipLower.toLowerCase());
                }
                System.out.println(key);

            }else if (command.equals("Slice")){
                int startIndex = Integer.parseInt(token[1]);
                int endIndex = Integer.parseInt(token[2]);
                String remove = key.substring(startIndex, endIndex);
                key = key.replace(remove, "");
                System.out.println(key);
            }

            input = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + key);
    }
}
