package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class PadawanEquipment_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //имаме сумата с която разполага
        double amount = Double.parseDouble(scanner.nextLine());
        //броя на учениците
        int countStudents = Integer.parseInt(scanner.nextLine());
        //цена на светлинен меч
        double priceLightsaber = Double.parseDouble(scanner.nextLine());
        //цена на халати
        double priceRobe = Double.parseDouble(scanner.nextLine());
        //цена на колани
        double priceBelt = Double.parseDouble(scanner.nextLine());
        double totalPriceLightsaber = Math.ceil(countStudents * 1.1) * priceLightsaber;
        double totalPriceRobe = countStudents * priceRobe;
        double totalPriceBelt = priceBelt * (countStudents - countStudents/6);

        //12345 6 -безплатен 7891011 12 - безплатен 13 14 15 16 17 18-безплатен
        double neededSum = totalPriceBelt + totalPriceLightsaber + totalPriceRobe;

        String output = "";
        if (neededSum <= amount) {
            output = String.format("The money is enough - it would cost %.2flv.", neededSum);
        } else {
            output = String.format("Ivan Cho will need %.2flv more.", neededSum - amount);
        }
        System.out.print(output);
    }
}
