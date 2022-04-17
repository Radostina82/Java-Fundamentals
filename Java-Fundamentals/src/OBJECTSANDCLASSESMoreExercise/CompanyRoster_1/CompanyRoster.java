package OBJECTSANDCLASSESMoreExercise.CompanyRoster_1;

import java.util.List;

public class CompanyRoster {
   public static class Department {
        String name;
       double avrgSalary;

       public String getName() {
           return name;
       }

       public double getAvrgSalary() {
           return avrgSalary;
       }

       public Department(String name, double avgSalary) {
           this.name = name;
           this.avrgSalary = avgSalary;

       }

   }


   public static class Employee {
        private String name;
        private double salary;
        private String position;
        private String department;
        private String email;
        private int age;

       public String getDepartment() {
           return department;
       }

       public String getName() {
           return name;
       }

       public String getPosition() {
           return position;
       }

       public String getEmail() {
           return email;
       }

       public int getAge() {
           return age;
       }

       public double getSalary() {
           return salary;
       }

       public Employee(String name, double salary, String position, String department) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
        }

       public void setEmail(String email) {
           this.email = email;
       }

       public void setAge(int age) {
           this.age = age;
       }

      @Override
       public String toString() {
           return name + " " + String.format("%.2f", salary) + " " + email + " " + age;
       }
   }
}
