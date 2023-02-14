package transport;

public class DriverD extends Driver {

    public DriverD(String name,
                   boolean hasDriverLicense,
                   int experience) {
        super(name, hasDriverLicense, experience);
    }

    @Override
    void startMoving() {
        System.out.println("Водитель котигории D " + getName() + " начал движение");
    }

    @Override
    void finishMoving() {
        System.out.println("Водитель котигории D " + getName() + " закончил движение");
    }

    @Override
    void refill() {
        System.out.println("Водитель котигории D " + getName() + " заправляет авто");
    }
}
