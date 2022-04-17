package OBJECTSANDCLASSESExercise.Students_5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Students> studentsList = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            String firstName = input.split("\\s+")[0];
            String lastName = input.split("\\s+")[1];
            double grade = Double.parseDouble(input.split("\\s+")[2]);

            Students students = new Students(firstName, lastName, grade);
            studentsList.add(students);
        }

        //studentsList.sort(Comparator.comparing(Students::getGrade));//така минава
        //Collections.reverse(studentsList);

        //друг начин на Деси

        List<Students> sortedList = studentsList.stream()
                .sorted(Comparator.comparing(Students::getGrade).reversed())
                .collect(Collectors.toList());


        for (Students students : studentsList) {
            System.out.println(students);
        }
    }
}
