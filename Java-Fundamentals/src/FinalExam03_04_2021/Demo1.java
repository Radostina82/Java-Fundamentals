package FinalExam03_04_2021;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Finish")){
            String[] token = input.split("\\s+");
            String command = token[0];

            if (command.equals("Replace")){
                String currentChar = token[1];
                String newChar = token[2];
                text = text.replace(currentChar, newChar);
                System.out.println(text);

            }else if (command.equals("Cut")){
                int startIndex = Integer.parseInt(token[1]);
                int endIndex = Integer.parseInt(token[2]);

                if (startIndex>=0 && endIndex<text.length()){
                    String substring = text.substring(startIndex, endIndex + 1);
                    text = text.replace(substring, "");
                    System.out.println(text);

                }else {
                    System.out.println("Invalid indices!");
                }
            }else if (command.equals("Make")){
                String replace = token[1];
                if (replace.equals("Upper")){
                text = text.toUpperCase();
                }else if (replace.equals("Lower")){
                    text = text.toLowerCase();
                }
                System.out.println(text);

            }else if (command.equals("Check")){
                String string = token[1];
                if (text.contains(string)){
                    System.out.println("Message contains " + string);
                }else{
                    System.out.println("Message doesn't contain " + string);
                }

            }else if (command.equals("Sum")){
                int startIndex = Integer.parseInt(token[1]);
                int endIndex = Integer.parseInt(token[2]);

                if (startIndex>=0 && endIndex<text.length()){
                    String substring = text.substring(startIndex, endIndex + 1);
                    int sum = getSum(substring);
                    System.out.println(sum);

                }else {
                    System.out.println("Invalid indices!");
                }
            }


            input = scanner.nextLine();
        }
    }

    private static int getSum(String substring) {
        int sum = 0;
        for (int i = 0; i <=substring.length()-1 ; i++) {
            char currentCahr = substring.charAt(i);
            sum+=currentCahr;
        }
        return sum;
    }
}
