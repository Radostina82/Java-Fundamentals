package FinalExamExercise.Exam4_04_04_2020;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@[#]+(?<nameProduct>[A-Z][a-zA-Z0-9]{4,}[A-Z])@[#]+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <=n ; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String barcode = matcher.group("nameProduct");
                StringBuilder productGroup = new StringBuilder();
                for (int j = 0; j <= barcode.length()-1 ; j++) {
                    char symbol = barcode.charAt(j);
                    if (Character.isDigit(symbol)){
                        productGroup.append(symbol);
                    }
                }
                String result = productGroup.toString();
                if (result.length()==0){
                    System.out.println("Product group: 00");
                }else{
                    System.out.println("Product group: " + result);
                }
            }else{
                System.out.println("Invalid barcode");
            }
        }
    }
}
