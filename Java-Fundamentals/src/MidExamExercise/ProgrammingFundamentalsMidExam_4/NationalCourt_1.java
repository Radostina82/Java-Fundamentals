package MidExamExercise.ProgrammingFundamentalsMidExam_4;

import java.util.Scanner;

public class NationalCourt_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int allPeople = Integer.parseInt(scanner.nextLine());

        int peopleForHour = n1 + n2 + n3;
        int countHour = 0;

        while (allPeople > 0) {
            countHour++;

            if (countHour % 4 == 0) {
                continue;
            }
            allPeople -= peopleForHour;
        }
        System.out.printf("Time needed: %dh.", countHour);
    }
}
