package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class Login5new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usser = scanner.nextLine();
        StringBuilder passBuilder = new StringBuilder();
        for (int i = usser.length()-1; i >=0 ; i--) {
            char simbol = usser.charAt(i);
            passBuilder.append(simbol);
        }
        String pass = passBuilder.toString();
        String command = scanner.nextLine();
        int counter = 0;

        while (!command.equals(pass)){
            counter++;
            if (counter==4){
                System.out.printf("User %s blocked!", usser);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            command=scanner.nextLine();
        }
if (command.equals(pass)){
    System.out.printf("User %s logged in.", usser);
}
    }
}
