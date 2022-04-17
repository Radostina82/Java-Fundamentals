package ASSOCIATIVEARRAYSExercises;

import java.util.*;

public class StudentAcademy_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsGrade = new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsGrade.containsKey(name)){
                studentsGrade.put(name, new ArrayList<>());
            }
            studentsGrade.get(name).add(grade);
        }

       Map<String, Double> avrGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentsGrade.entrySet()) {
            double average = entry.getValue().stream().mapToDouble(e->e).average().getAsDouble();
            if (average>=4.50){
                avrGrade.put(entry.getKey(), average);
            }
        }
        avrGrade.entrySet().stream().sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
                .forEach(student -> System.out.printf("%s -> %.2f%n", student.getKey(), student.getValue()));
    }
}
