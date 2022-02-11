package za.ac.cput.vehicle;

public class Bus {
    private String make;
    private String model;
    private int yearModel;
    private int loadCapacity;

    public Bus(String make, String model, int yearModel, int loadCapacity) {
        this.make = make;
        this.model = model;
        this.yearModel = yearModel;
        this.loadCapacity = loadCapacity;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", yearModel=" + yearModel +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}
