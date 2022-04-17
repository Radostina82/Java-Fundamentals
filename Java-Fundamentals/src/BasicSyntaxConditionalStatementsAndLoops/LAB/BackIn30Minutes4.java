package BasicSyntaxConditionalStatementsAndLoops.LAB;

import java.util.Scanner;

public class BackIn30Minutes4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int hours = h;
        int minute = m + 30;// часа след 30 минути

        if (minute > 59){
            hours += 1;
            minute -= 60;
        }if (hours > 23){
            hours = 0;
        }
        if (minute < 10) {
            System.out.printf("%d:0%d", hours, minute);
        } else {
            System.out.printf("%d:%d", hours, minute);
        }


    }
}
