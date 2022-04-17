package OBJECTSANDCLASSES.Students_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Students> students = new ArrayList<>();

        while (!input.equals("end")){
            String firstName = input.split("\\s+")[0];
            String lastName = input.split("\\s+")[1];
            int age = Integer.parseInt(input.split("\\s+")[2]);
            String hometown = input.split("\\s+")[3];

            Students student = new Students(firstName, lastName, age, hometown);

            students.add(student);

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Students student : students) {
            if (student.getHometown().equals(city)){
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

}
