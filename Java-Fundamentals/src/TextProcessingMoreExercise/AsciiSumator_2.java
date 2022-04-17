package TextProcessingMoreExercise;

import java.util.Scanner;

public class AsciiSumator_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i <= text.length()-1 ; i++) {
            char currentSymbol = text.charAt(i);
            if (currentSymbol>symbol1 && currentSymbol<symbol2 || currentSymbol<symbol1 && currentSymbol > symbol2){
                sum+=currentSymbol;
            }

        }
        System.out.println(sum);
    }
}
