package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> passengersInWagon = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] token = input.split("\\s+");
            String command  = token[0];
            if (command.equals("Add")){
                int wagon = Integer.parseInt(token[1]);
                passengersInWagon.add(wagon);
            }else{
                int passenger = Integer.parseInt(token[0]);
                for (int i = 0; i <= passengersInWagon.size()-1; i++) {
                    int passengerWagon = passengersInWagon.get(i);
                    if (passengerWagon+passenger <= capacity){
                        passengersInWagon.set(i, passengerWagon + passenger);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }
        System.out.print(passengersInWagon.toString().replaceAll("[\\[\\],]", ""));
    }
}
