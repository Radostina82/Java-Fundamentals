package List.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list1 = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(list1);
        String output = list1.toString().replaceAll("[\\[\\],]","");
        output = output.replaceAll("\\s+", " ");

        System.out.println(output);
    }
}
