package Methods.Exercise;

import java.util.Scanner;

public class CharactersInRange_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startSymbol = scanner.nextLine().charAt(0);
        char endSymbol = scanner.nextLine().charAt(0);
        printSymbolInRange(startSymbol, endSymbol);
    }

    private static void printSymbolInRange(char startSymbol, char endSymbol) {
        if (startSymbol < endSymbol) {
            for (int i = startSymbol + 1; i <= endSymbol - 1; i++) {
                System.out.print((char)i + " ");
            }
        }else{
            for (int i = endSymbol +1; i <= startSymbol - 1 ; i++) {
                System.out.print((char)i + " ");
            }
        }
    }
}
