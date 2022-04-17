package TextProcessingMoreExercise;

import java.util.Scanner;

public class ExtractPersonInformation_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
      /*for (int i = 1; i <= count; i++) {
            StringBuilder year = new StringBuilder();
            StringBuilder name = new StringBuilder();
            String input = scanner.nextLine();
            for (int j = 0; j <= input.length() - 1; j++) {
                char symbol = input.charAt(j);
                if (symbol == '@') {
                    j++;
                    int k = j;
                    for (; k < input.indexOf('|'); k++) {
                        name.append(input.charAt(k));
                    }
                    j=k;

                }
                if (symbol == '#'){
                    j++;
                    int k = j;
                    for (; k < input.indexOf('*'); k++) {
                        year.append(input.charAt(k));
                    }
                    j=k;
                }
            }
            System.out.printf("%s is %s years old.%n", name, year);
        }*/

       for (int i = 1; i <= count ; i++) {
            String input = scanner.nextLine();
           // StringBuilder year = new StringBuilder();
            //StringBuilder name = new StringBuilder();
            int firstIndex = input.indexOf('@');
            int secondIndex = input.indexOf('|');
            int firstIndexYear = input.indexOf('#');
            int secondIndexYear = input.indexOf('*');

            String name = input.substring(firstIndex+1,secondIndex);
            String year = input.substring(firstIndexYear+1, secondIndexYear);
            System.out.printf("%s is %s years old.%n", name, year);
        }


    }
}
