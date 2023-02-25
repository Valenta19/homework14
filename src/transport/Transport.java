package transport;


import java.util.ArrayList;
import java.util.List;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private Type type;
  private List<Mechanic> mechanicList;

    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanic> mechanicList) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        setDriver(driver);

        setEngineVolume(engineVolume);
        this.mechanicList = mechanicList;


    }

    protected Transport(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
        if (engineVolume <= 0) {
            engineVolume = 1.2;
        }
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String toString() {
        return "марка " + brand +
                " модель " + model +
                " объем двинателя " + engineVolume;
    }

    public abstract void startMove();

    public abstract void finishMove();

    public Type getType() {
        return this.type;
    }

    public abstract boolean passDiagnostics() throws TransportTypeException;

    public abstract void printType();

}
