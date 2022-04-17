package MidExamExercise.ProgrammingFundamentalsMidExam_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split("\\s+")[0];

            if (command.equals("swap")){
                int index1 = Integer.parseInt(input.split("\\s+")[1]);
                int index2 = Integer.parseInt(input.split("\\s+")[2]);

                int element1 = number[index1];
                int element2 = number[index2];
                number[index1] = element2;
                number[index2] = element1;

            }else if (command.equals("multiply")){
                int index1 = Integer.parseInt(input.split("\\s+")[1]);
                int index2 = Integer.parseInt(input.split("\\s+")[2]);
                int element1 = number[index1];
                int element2 = number[index2];
                int multiply = element1 * element2;
                number[index1] = multiply;

            }else if (command.equals("decrease")){
                for (int i = 0; i <= number.length-1 ; i++) {
                    number[i] = number[i] - 1;
                }
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i <= number.length-1 ; i++) {
            int element = number[i];
            if (i == number.length-1){
                System.out.print(element);
                break;
            }else{
                System.out.print(element + "," + " ");
            }
        }
    }
}
