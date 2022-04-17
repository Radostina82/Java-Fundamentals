package ASSOCIATIVEARRAYSLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> numbers = new TreeMap<>();

        for (double number : nums) {
            if (!numbers.containsKey(number)){
                numbers.put(number, 1);
            }else{
                numbers.put(number, numbers.get(number)+1);
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.#######");

        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.printf("%s -> %d%n", decimalFormat.format(entry.getKey()), entry.getValue() );
        }
    }
}
