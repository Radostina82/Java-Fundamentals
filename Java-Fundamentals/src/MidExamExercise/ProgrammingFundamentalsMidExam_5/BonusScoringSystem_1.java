package MidExamExercise.ProgrammingFundamentalsMidExam_5;

import java.util.Scanner;

public class BonusScoringSystem_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int student = Integer.parseInt(scanner.nextLine());
        int countLectures = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0.0;
        int studentAttendances = 0;

        for (int i = 1; i <= student ; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());
            double bonus = (attendances*1.0/countLectures)*(5+initialBonus);
            if (bonus > maxBonus){
                maxBonus = bonus;
                studentAttendances = attendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", studentAttendances);
    }
}
