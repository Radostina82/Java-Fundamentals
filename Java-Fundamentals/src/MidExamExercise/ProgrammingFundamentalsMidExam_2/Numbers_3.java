package MidExamExercise.ProgrammingFundamentalsMidExam_2;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

public class Numbers_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        for (int i = 0; i <= numbers.size() - 1; i++) {
            int element = numbers.get(i);
            sum += element;
        }
        double average = sum * 1.0 / numbers.size();
        int count = 0;
        Collections.sort(numbers);
        Collections.reverse(numbers);
       // boolean isNoNumbers = false;

        for (Integer number : numbers) {
            if (number>average){
                //isNoNumbers = true;
                count++;
                if (count==5){
                    System.out.print(number);
                    break;
                }
                System.out.print(number + " ");
            }
        }
      /*  if (!isNoNumbers){
            System.out.println("No");
        }*/
        if (count==0){
            System.out.println("No");
        }
    }
}
