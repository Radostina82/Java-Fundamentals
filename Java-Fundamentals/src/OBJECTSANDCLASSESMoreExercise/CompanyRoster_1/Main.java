package OBJECTSANDCLASSESMoreExercise.CompanyRoster_1;

import OBJECTSANDCLASSESMoreExercise.CompanyRoster_1.CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<CompanyRoster.Employee> employeeList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            CompanyRoster.Employee employee = new CompanyRoster.Employee(name, salary, position, department);

            if (input.length == 6) {
                employee.setEmail(input[4]);
                employee.setAge(Integer.parseInt(input[5]));
            } else if (input.length == 5) {
                if (input[4].contains("@")) {
                    employee.setEmail(input[4]);
                    employee.setAge(-1);
                } else {
                    employee.setEmail("n/a");
                    employee.setAge(Integer.parseInt(input[4]));
                }
            } else if (input.length < 5) {
                employee.setAge(-1);
                employee.setEmail("n/a");
            }
            employeeList.add(employee);
        }
        List<String> uniqueDepartments = employeeList.stream().map(CompanyRoster.Employee::getDepartment).distinct().collect(Collectors.toList());


        List<CompanyRoster.Department> departments = new ArrayList<>();
        for (String department : uniqueDepartments) {
            double salary = 0;
            int count = 0;
            for (CompanyRoster.Employee employe : employeeList) {
                if (employe.getDepartment().equals(department)) {
                    salary += employe.getSalary();
                    count++;
                }
            }
            CompanyRoster.Department department1 = new CompanyRoster.Department(department, salary/count);
            departments.add(department1);
        }
       departments = departments.stream().sorted(Comparator.comparing(CompanyRoster.Department::getAvrgSalary).reversed()).collect(Collectors.toList());
        employeeList = employeeList.stream().sorted(Comparator.comparing(CompanyRoster.Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.printf("Highest Average Salary: %s%n", departments.get(0).getName());
        for (CompanyRoster.Employee employee : employeeList) {
            if (employee.getDepartment().equals(departments.get(0).getName()))
            System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
        }

    }
}
