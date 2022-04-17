package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class StrongNumber6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int startNumber = number;
        int sumFact = 0;
        while (number != 0) {

            int digit = number % 10;// digit число
            int fact = 1;
            for (int i = 1; i <=digit ; i++) {
                // i= 1 fact = 1*1; i = 2 fact = 1*2; i = 3 fact = 2*3
                fact *= i;
            }
            sumFact += fact;
            number /= 10;
        }
        if (sumFact == startNumber){
            System.out.println("yes");
        }else{
            System.out.println("no");

        }

    }
}
