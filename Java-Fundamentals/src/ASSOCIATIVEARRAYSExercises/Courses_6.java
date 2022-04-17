package ASSOCIATIVEARRAYSExercises;

import java.util.*;

public class Courses_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")){
            String nameCourse = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!courses.containsKey(nameCourse)){

                courses.put(nameCourse, new ArrayList<>());
            }

                courses.get(nameCourse).add(studentName);


            input = scanner.nextLine();
        }

        courses.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size())).
                forEach(e->{
                    System.out.println(e.getKey() + ": " + e.getValue().size());
                    e.getValue().stream().sorted(String::compareTo).forEach(n -> System.out.println("-- " + n));
                });

    }
}
