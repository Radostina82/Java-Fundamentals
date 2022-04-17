package Methods.Exercise;

import java.util.Calendar;
import java.util.Scanner;

public class PasswordValidator_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        boolean isValidLenght = validateLenght(pass);
        boolean isValidateContent = validateContent(pass);
        boolean isValidateDigit = validateDigit(pass);
        if (!isValidLenght){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isValidateContent){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isValidateDigit){
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidateContent && isValidLenght && isValidateDigit){
            System.out.println("Password is valid");
        }
    }

    private static boolean validateLenght(String pass) {
        return pass.length() >= 6 && pass.length() <= 10;
    }

    private static boolean validateContent(String pass){
        for (int i = 0; i <= pass.length()-1 ; i++) {
            char currentSymbol = pass.charAt(i);
            boolean isSmallLetter = currentSymbol >=97 && currentSymbol<=122;
            boolean isCapitalLetter = currentSymbol >=65 && currentSymbol <= 90;
            boolean isDigit = currentSymbol >= 48 && currentSymbol <= 57;
            if (!isSmallLetter && !isCapitalLetter && !isDigit){
                return false;
            }
        }
        return true;
    }

    private static boolean validateDigit(String pass){
        int counter = 0;
        for (int i = 0; i <= pass.length()-1 ; i++) {
            char currentSymbol = pass.charAt(i);
          /*  boolean isDigit = currentSymbol >= 48 && currentSymbol <= 57;
            if (isDigit) {
                counter++;
            }*/
            if (Character.isDigit(currentSymbol)){// по този начин директно може да се провери дали е цифра
                counter++;
            }
        }
        return counter>=2;
    }
}
