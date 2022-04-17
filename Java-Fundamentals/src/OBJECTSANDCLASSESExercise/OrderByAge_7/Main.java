package OBJECTSANDCLASSESExercise.OrderByAge_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<OrderByAge> person = new ArrayList<>();

        while (!input.equals("End")){
            String name = input.split("\\s+")[0];
            String personID = input.split("\\s+")[1];
            int age = Integer.parseInt(input.split("\\s+")[2]);
            OrderByAge persons = new OrderByAge(name, personID, age);
            person.add(persons);

            input = scanner.nextLine();
        }
      person.sort(Comparator.comparingInt(OrderByAge::getAge));
        for (OrderByAge orderByAge : person) {
            System.out.print(orderByAge);
        }
    }
}
