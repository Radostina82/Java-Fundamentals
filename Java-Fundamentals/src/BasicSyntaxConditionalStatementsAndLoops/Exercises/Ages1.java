package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class Ages1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String output = "";
        if (n >= 0 && n <= 2) {
            output = "baby";
        }else if (n <= 13){
            output = "child";
        }else if (n <= 19){
            output = "teenager";
        }else if (n <= 65){
            output = "adult";
        }else{
            output = "elder";
        }
        System.out.print(output);
    }
}
