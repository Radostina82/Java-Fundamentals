package OBJECTSANDCLASSESMoreExercise.CarSalesman_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEngines = Integer.parseInt(scanner.nextLine());

        List<Engine> engines = new ArrayList<>();
        for (int i = 1; i <= numEngines ; i++) {
            String [] input = scanner.nextLine().split(", ");
            String model = input[0];
            int power = Integer.parseInt(input[1]);

            Engine engine = new Engine(model, power);

            if (input.length == 4){
                String  displacement = input[2];
                String efficiency = input[3];
                engine.setDisplacement(displacement);
                engine.setEfficiency(efficiency);
            }else if (input.length == 3){
                String  displacement = input[2];
                String efficiency = input[2];
                if (Integer.parseInt(input[2]) >47 &&Integer.parseInt(input[2]) <58){
                    engine.setDisplacement(displacement);
                    engine.setEfficiency("n/a");
                }else {
                    engine.setDisplacement("n/a");
                    engine.setEfficiency(efficiency);
                }
            }else if (input.length== 2){
                engine.setDisplacement("n/a");
                engine.setEfficiency("n/a");
            }
            engines.add(engine);
        }

        int countCar = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();

        for (int i = 1; i <= countCar ; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String model = command[0];
            String engine = command[1];
           // Car car = new Car(model, engine)
            if (command.length == 4){
                String  weight = command[2];
                String color = command[3];

            }
        }
    }
}
