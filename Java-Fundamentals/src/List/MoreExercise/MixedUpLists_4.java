package List.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number1 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> number2 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> unitedNumber = new ArrayList<>();


        if (number1.size() > number2.size()) {
            for (int i = 0; i <= number2.size() - 1; i++) {
                int num1 = number1.get(0);
                number1.remove(Integer.valueOf(num1));
                unitedNumber.add(num1);
                int num2 = number2.get(number2.size() - 1 - i);
                unitedNumber.add(num2);

            }
        } else {
            for (int i = 0; i <= number1.size() - 1; i++) {
                int num1 = number1.get(i);
                unitedNumber.add(num1);
                int num2 = number2.get(number2.size() - 1);
                number2.remove(Integer.valueOf(num2));
                unitedNumber.add(num2);
            }
        }
        Collections.sort(unitedNumber);
        if (number1.size() == 2){
            Collections.sort(number1);
            for (Integer integer : unitedNumber) {
                if (integer > number1.get(0) && integer< number1.get(1)){
                    System.out.print(integer + " ");
                }
            }
        }else if (number2.size()==2){
            Collections.sort(number2);
            for (Integer integer : unitedNumber) {
                if (integer >= number2.get(0) && integer<= number2.get(1)){
                    System.out.print(integer + " ");
                }

            }
        }
    }
}
