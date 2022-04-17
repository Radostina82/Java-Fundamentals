package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int countSequencesBest = 0; // брояч на последователността на единиците
        int indexSenquencesBest = Integer.MAX_VALUE;//индекса от който започва най-дългата последователност
        int sumBest = 0;// сумата, ако всичко друго е равно
        String[] senquence = new String[length]; // ще ми пази масива
        int numArrayBest = 0;//номера на масива, който е нашия масив
        int num = 0;
        int[] number = new int[length];

        while (!input.equals("Clone them!")) {
            number = Arrays.stream(input.split("!+")).mapToInt(e -> Integer.parseInt(e)).toArray();
            num++;
            int countSequences = 0;
            int indexSenquences = 0;
            int sum = 0;
            for (int i = 0; i <= number.length - 1; i++) {
                int digit = number[i];
                sum += digit;
                if (i == number.length - 1) {
                    break;
                } else if (digit == 1 && digit == number[i + 1]) {
                    countSequences++;
                    indexSenquences = i;

                }
            }

            if (countSequences > countSequencesBest || indexSenquences < indexSenquencesBest) {
                countSequencesBest = countSequences;
                indexSenquencesBest = indexSenquences;
                numArrayBest = num;
                sumBest = sum;
                senquence = input.split("!+");
            }else if (countSequences == countSequencesBest && indexSenquences == indexSenquencesBest && sum > sumBest){
                countSequencesBest = countSequences;
                indexSenquencesBest = indexSenquences;
                numArrayBest = num;
                sumBest = sum;
                senquence = input.split("!+");
            }

            input = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n",numArrayBest,sumBest);
        System.out.println(String.join(" ",senquence));
    }
}
