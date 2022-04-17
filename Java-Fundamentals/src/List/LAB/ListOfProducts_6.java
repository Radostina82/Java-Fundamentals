package List.LAB;

import java.util.*;

public class ListOfProducts_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            products.add(input);
        }
        Collections.sort(products);
        for (int i = 0; i <= products.size()-1 ; i++) {
            System.out.printf("%d.%s%n", i+1, products.get(i));
        }
    }
}
