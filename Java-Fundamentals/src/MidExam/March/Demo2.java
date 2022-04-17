package MidExam.March;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> gifts = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("No Money")){
            String command = input.split("\\s+")[0];
            if (command.equals("OutOfStock")){
                String gift = input.split("\\s+")[1];
                for (int i = 0; i <= gifts.size()-1 ; i++) {
                    String element = gifts.get(i);
                    if (element.equals(gift)){
                        gifts.set(i, "None");
                    }
                }
            }else if (command.equals("Required")){
                String gift = input.split("\\s+")[1];
                int index = Integer.parseInt(input.split("\\s+")[2]);
                if (index >=0 && index<gifts.size()){
                    gifts.set(index, gift);
                }
            }else if (command.equals("JustInCase")){
                String gift = input.split("\\s+")[1];
                gifts.set(gifts.size()-1, gift);
            }

            input = scanner.nextLine();
        }

        for (String gift : gifts) {
            if (!gift.equals("None")){
                System.out.print(gift + " ");
            }
        }
    }
}
