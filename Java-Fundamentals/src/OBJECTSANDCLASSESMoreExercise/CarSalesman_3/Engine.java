package OBJECTSANDCLASSESMoreExercise.CarSalesman_3;

public class Engine {
    private String model;
    private int power;
    private String displacement;//работен обем
    private String efficiency;//ефективност

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public void setDisplacement(String  displacement) {
        this.displacement = displacement;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
