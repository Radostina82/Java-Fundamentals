package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class BalancedBrackets_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        boolean firstBraket = false;
        boolean secondBraket = true;

        for (int i = 1; i <= num; i++) {
            String input = scanner.nextLine();
            char line = input.charAt(0);
            if (line == 40) {
                if (!firstBraket) {
                    firstBraket = true;
                }else{
                    secondBraket = false;
                }
            }if (line == 41){
                if (firstBraket){
                    firstBraket = false;
                }else{
                    secondBraket = false;
                }
            }
        }
        if (secondBraket && !firstBraket){
            System.out.println("BALANCED");
        }else{
            System.out.println("UNBALANCED");
        }
    }
}
