import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EasterBonuses3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int totalSum = 0;

        while (!name.equals("stop")) {
            // List<Integer> num = Arrays.stream(scanner.nextLine().split("\\s")).map(Integer::parseInt).collect(Collectors.toList());
            int [] num = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

            int sumBonus = 0;
           // List<Integer> bonus = new ArrayList<>();
            int number = 1;
            for (int i = 0; i <= num.length - 1; i++) {
                //126 (7 * 3 * 6), 90 (5 * 3 * 6), 210 (5 * 7 * 6), 105 (5 * 7 * 3) 5 7 3 6
                for (int j = i + 1; j <= num.length - 1; j++) {

                    number *= num[j];
                }

                    for (int k = 0; k < i; k++) {
                        number *= num[k];

                }
               // bonus.add(i, number);
                sumBonus+=number;

                        number=1;
            }
          /*  for (Integer integer : bonus) {
                sumBonus+=integer;
            }*/
            System.out.printf("%s has a bonus of %d lv.%n", name, sumBonus);
            totalSum += sumBonus;
            name = scanner.nextLine();
        }
        System.out.printf("The amount of all bonuses is %d lv.", totalSum);
    }
}
