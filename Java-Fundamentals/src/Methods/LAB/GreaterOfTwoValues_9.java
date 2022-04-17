package Methods.LAB;

import java.util.Scanner;

public class GreaterOfTwoValues_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String symbol1 = scanner.nextLine();
        String symbol2 = scanner.nextLine();
        if (input.equalsIgnoreCase("int")) {// equalsIgnoreCase игнорира малки и големи букви каквото подадеш сравнява
            int max = getMaxInt(Integer.parseInt(symbol1), Integer.parseInt(symbol2));
            System.out.println(max);
        } else if (input.equalsIgnoreCase("char")) {
            char max = getMaxChar(symbol1.charAt(0), symbol2.charAt(0));
            System.out.println(max);
        }else if (input.equalsIgnoreCase("String")){
            String max = getMaxString(symbol1, symbol2);
            System.out.println(max);
        }
    }

    private static int getMaxInt(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    private static char getMaxChar(char first, char second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    private static String getMaxString(String symbol1, String symbol2) {
        if (symbol1.compareTo(symbol2)>=0){
            return symbol1;
        }else{
            return symbol2;
        }
    }

}
