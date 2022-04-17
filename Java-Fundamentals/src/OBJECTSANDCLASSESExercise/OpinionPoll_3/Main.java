package OBJECTSANDCLASSESExercise.OpinionPoll_3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);

            Person person = new Person(name, age);
            personList.add(person);
        }
        List<Person> filteredList = personList.stream().filter(p->p.getAge()>30).collect(Collectors.toList());
        filteredList.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));

        for (Person person : filteredList) {
            System.out.println(person);
        }
    }
}
