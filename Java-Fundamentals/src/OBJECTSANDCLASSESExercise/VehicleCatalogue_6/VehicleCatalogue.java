package OBJECTSANDCLASSESExercise.VehicleCatalogue_6;

public class VehicleCatalogue {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public VehicleCatalogue(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString(){

        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",type.substring(0,1).toUpperCase() + type.substring(1), model, color, horsepower);
}
}
