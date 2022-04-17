package BasicSyntaxConditionalStatementsAndLoops.LAB;

import java.util.Scanner;

public class MonthPrinter5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String output = "";

        if (n == 1) {
            output = "January";
        } else if (n == 2) {
            output = "February";
        } else if (n == 3) {
            output = "March";
        } else if (n == 4) {
            output = "April";
        } else if (n == 5) {
            output = "May";
        } else if (n == 6) {
            output = "June";
        } else if (n == 7) {
            output = "July";
        } else if (n == 8) {
            output = "August";
        } else if (n == 9) {
            output = "September";
        } else if (n == 10) {
            output = "October";
        } else if (n == 11) {
            output = "November";
        } else if (n == 12) {
            output = "December";
        } else if (n < 1){
            output = "Error!";
        }else {
            output = "Error!";
        }
        System.out.print(output);
    }
}
