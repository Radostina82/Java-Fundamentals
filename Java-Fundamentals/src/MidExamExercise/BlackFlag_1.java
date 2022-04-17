package MidExamExercise;

import java.util.Scanner;

public class BlackFlag_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allDays = Integer.parseInt(scanner.nextLine());
        int dailyPlunder  = Integer.parseInt(scanner.nextLine());
        double expectedPlunder  = Double.parseDouble(scanner.nextLine());
        int count = 0;
        double allPlunder = 0;
        while (allDays>0){
            count++;
            allDays--;
            allPlunder += dailyPlunder;
            if (count%3==0){
                allPlunder += dailyPlunder*1.0/2;
            }
            if (count%5==0){
                allPlunder = allPlunder*0.7;
            }
        }
        if (allPlunder >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", allPlunder);
        }else{
            System.out.printf("Collected only %.2f%% of the plunder.", allPlunder/expectedPlunder*100);
        }
    }
}
