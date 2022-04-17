package FinalExamExercise.Exam10_04_2020;

import java.util.*;

public class NeedForSpeedIII_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> carsMileage = new LinkedHashMap<>();
        Map<String, Integer> carsFuel = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            String car = input.split("\\|")[0];
            int mileage = Integer.parseInt(input.split("\\|")[1]);
            int fuel = Integer.parseInt(input.split("\\|")[2]);
           carsMileage.put(car, mileage);
           carsFuel.put(car, fuel);
        }
        String input = scanner.nextLine();

        while (!input.equals("Stop")){
            String [] token = input.split(" : ");
            String command = token[0];
            String car = token[1];

            if(command.equals("Drive")){
                int distance = Integer.parseInt(token[2]);
                int fuel = Integer.parseInt(token[3]);
                if (carsFuel.get(car)>= fuel){
                    int consumedFuel = carsFuel.get(car) - fuel;
                    int drivenDistance = carsMileage.get(car)+ distance;
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",car, distance, fuel);
                    carsFuel.put(car, consumedFuel);
                    carsMileage.put(car, drivenDistance);
                    if (drivenDistance >= 100000){
                        System.out.printf("Time to sell the %s!%n", car);
                        carsMileage.remove(car);
                    }
                }else if (carsFuel.get(car)<fuel){
                    System.out.println("Not enough fuel to make that ride");
                }

            }else if (command.equals("Refuel")){
                int fuel = Integer.parseInt(token[2]);
                if (carsFuel.get(car)<75){
                    int neededFuel = 75 - carsFuel.get(car);
                    if (fuel <= neededFuel){
                        System.out.printf("%s refueled with %d liters%n", car, fuel);
                        carsFuel.put(car, carsFuel.get(car)+fuel);
                    }else {
                        System.out.printf("%s refueled with %d liters%n", car, neededFuel);
                        carsFuel.put(car, carsFuel.get(car)+neededFuel);
                    }
                }

            }else if (command.equals("Revert")){
                int kilometers = Integer.parseInt(token[2]);
                int newMileage = carsMileage.get(car) - kilometers;
                if (newMileage < 10000){
                    newMileage = 10000;
                    carsMileage.put(car, newMileage);
                }else{
                    System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                    carsMileage.put(car, carsMileage.get(car)-kilometers);
                }
            }
            input = scanner.nextLine();
        }
        carsMileage.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(c-> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", c.getKey(), c.getValue(), carsFuel.get(c.getKey())));
    }
}
