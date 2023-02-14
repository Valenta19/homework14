package transport;

public class DriverB extends Driver {

    public DriverB(String name,
                   boolean hasDriverLicense,
                   int experience) {
        super(name, hasDriverLicense, experience);
    }

    @Override
    void startMoving() {
        System.out.println("Водитель котигории B " + getName() + " начал движение");
    }

    @Override
    void finishMoving() {
        System.out.println("Водитель котигории B " + getName() + " закончил движение");
    }

    @Override
    void refill() {
        System.out.println("Водитель котигории B " + getName() + " заправляет авто");
    }
}
