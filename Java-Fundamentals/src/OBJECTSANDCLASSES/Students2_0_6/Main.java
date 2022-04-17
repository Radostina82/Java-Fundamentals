package OBJECTSANDCLASSES.Students2_0_6;

import OBJECTSANDCLASSES.Students_5.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Students2_0> students = new ArrayList<>();

        while (!input.equals("end")){
            String firstName = input.split("\\s+")[0];
            String lastName = input.split("\\s+")[1];
            int age = Integer.parseInt(input.split("\\s+")[2]);
            String hometown = input.split("\\s+")[3];

            boolean isExist = isExist(students, firstName, lastName);
            if (isExist){
                Students2_0 student = getStudent(students, firstName, lastName);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHometown(hometown);
            }else {
                Students2_0 student = new Students2_0(firstName, lastName, age, hometown);
                students.add(student);
            }

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Students2_0 student : students) {
            if (student.getHometown().equals(city)){
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }


    private static boolean isExist(List<Students2_0> students, String firstName, String lastName) {
        for (Students2_0 student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }

    private static Students2_0 getStudent(List<Students2_0> students, String firstName, String lastName) {
        Students2_0 existingStudent = null;
        for (Students2_0 student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                existingStudent = student;
            }
        }
        return existingStudent;
    }


}
