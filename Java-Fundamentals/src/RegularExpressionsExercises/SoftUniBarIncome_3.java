package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String nameRegex = "^%(?<name>[A-Z][a-z]+)%([^|$%.]*)<(?<product>[A-za-z0-9]+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$$";
       /* String productRegex = "<(?<product>[A-za-z]+)>";
        String countRegex = "\\|(?<count>[0-9]+)\\|";
        String priceRegex = "(?<price>[0-9]+\\.?[0-9]*\\D?)\\$";*/

        Pattern pattern = Pattern.compile(nameRegex);
       /* Pattern patternProduct = Pattern.compile(productRegex);
        Pattern patternCount = Pattern.compile(countRegex);
        Pattern patternPrice = Pattern.compile(priceRegex);*/
        double totalSum = 0;

        while (!input.equals("end of shift")){
              Matcher matcherName = pattern.matcher(input);
             /* Matcher matcherProduct = patternProduct.matcher(input);
              Matcher matcherCount = patternCount.matcher(input);
              Matcher matcherPrice = patternPrice.matcher(input);*/
              double sum = 0.0;
              if (matcherName.find()){
                  String name = matcherName.group("name");
                  String product = matcherName.group("product");
                  int count = Integer.parseInt(matcherName.group("count"));
                  double price = Double.parseDouble(matcherName.group("price"));
                  sum = price*count;
                  totalSum+=sum;
                  System.out.printf("%s: %s - %.2f%n", name, product, sum);
              }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalSum);
    }
}
