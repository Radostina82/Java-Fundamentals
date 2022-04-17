package MidExamExercise.ProgrammingFundamentalsMidExam_2;

import java.util.Scanner;

public class SoftUniReception_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employee1 = Integer.parseInt(scanner.nextLine());
        int employee2 = Integer.parseInt(scanner.nextLine());
        int employee3 = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int studentHour = employee1 + employee2 + employee3;
        int hours = 0;
        while (studentsCount > 0) {
            hours++;
            studentsCount -= studentHour;
            if (hours % 4 == 0) {
                hours += 1;
            }
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}
