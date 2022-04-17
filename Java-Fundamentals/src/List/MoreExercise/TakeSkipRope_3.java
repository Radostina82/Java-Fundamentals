package List.MoreExercise;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();
        List<String> nonNumbers = new ArrayList<>();

        for (int i = 0; i <= input.length() - 1; i++) {
            char symbol = input.charAt(i);
            if (symbol > 47 && symbol < 58) {
                numbers.add(Integer.parseInt(String.valueOf(symbol)));
            } else {
                nonNumbers.add(String.valueOf(symbol));
            }
        }
        List<Integer> takeCount = new ArrayList<>();//нечетните even
        List<Integer> skipCount = new ArrayList<>();//четни odd
        for (int i = 0; i <= numbers.size() - 1; i++) {
            int element = numbers.get(i);
            if (i % 2 == 0) {
                takeCount.add(element);
            } else {
                skipCount.add(element);
            }
        }

        StringBuilder result = new StringBuilder();
        int total = 0;
        for (int i = 0; i <= takeCount.size() - 1; i++) {
            int take = takeCount.get(i);
            int skip = skipCount.get(i);


            for (int j = total; j < total + take; j++) {
                if (total+take >= nonNumbers.size()){
                    for (int k = total; k <= nonNumbers.size()-1 ; k++) {
                        result.append(nonNumbers.get(k));
                    }
                    break;
                }
                result.append(nonNumbers.get(j));

            }

            total += take + skip;
        }
        String finalResult = result.toString();
        System.out.println(finalResult);
    }
}
