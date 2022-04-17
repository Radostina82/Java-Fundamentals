package ASSOCIATIVEARRAYSExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Double> productsQuantity  = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String nameProduct = input.split("\\s+")[0];
            double priceProduct = Double.parseDouble(input.split("\\s+")[1]);
            double quantityProduct = Double.parseDouble(input.split("\\s+")[2]);

            productsPrice.put(nameProduct, priceProduct);

            if (!productsQuantity.containsKey(nameProduct)){
                productsQuantity.put(nameProduct, quantityProduct);
            }else{
                productsQuantity.put(nameProduct, productsQuantity.get(nameProduct) + quantityProduct);
            }


            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productsPrice.entrySet()) {
            String productName = entry.getKey();
            double sum = entry.getValue() * productsQuantity.get(productName);
            System.out.printf("%s -> %.2f%n", entry.getKey(), sum);
        }
    }
}
