package BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int digit = number % 10;
        if (digit == 1){
            System.out.print("one");
        }else if (digit == 2){
            System.out.print("two");
        }else if (digit == 3){
            System.out.print("three");
        }else if (digit == 4){
            System.out.print("four");
        }else if (digit == 5){
            System.out.print("five");
        }else if (digit == 6){
            System.out.print("six");
        }else if (digit == 7){
            System.out.print("seven");
        }else if (digit == 8){
            System.out.print("eight");
        }else if (digit == 9){
            System.out.print("nine");
        }else if (digit == 0){
            System.out.print("zero");
        }
    }
}
