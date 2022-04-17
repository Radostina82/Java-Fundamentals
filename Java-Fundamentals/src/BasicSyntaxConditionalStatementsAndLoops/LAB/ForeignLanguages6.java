package BasicSyntaxConditionalStatementsAndLoops.LAB;

import java.util.Scanner;

public class ForeignLanguages6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String output = "";

        if (country.equals("England") || country.equals("USA")){
            output = "English";
        }else if (country.equals("Spain") || country.equals("Argentina") || country.equals("Mexico")){
            output = "Spanish";
        }else{
            output = "unknown";
        }

        System.out.print(output);
    }
}
