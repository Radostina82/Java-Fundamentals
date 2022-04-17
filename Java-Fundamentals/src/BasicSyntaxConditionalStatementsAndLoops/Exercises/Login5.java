package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class Login5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ussername = scanner.nextLine();
        String pass = "";

        for (int i = ussername.length() - 1; i >= 0; i--) {
            char currentSymbol = ussername.charAt(i);
            pass += currentSymbol;
        }

        String pass1 = scanner.nextLine();
        int counter = 0;
        while (!pass1.equals(pass)) {
            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", ussername);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            pass1 = scanner.nextLine();
        }
        if (pass1.equals(pass)) {
            System.out.printf("User %s logged in.", ussername);
        }

    }
}
