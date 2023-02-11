package transport;


public class DriverC extends Driver {
    public DriverC(String name,
                   boolean hasDriverLicense,
                   int experience) {
        super(name, hasDriverLicense, experience);
    }

    @Override
    void startMoving() {
        System.out.println("Водитель котигории C " + getName() + " начал движение");
    }

    @Override
    void finishMoving() {
        System.out.println("Водитель котигории C " + getName() + " закончил движение");
    }

    @Override
    void refill() {
        System.out.println("Водитель котигории C " + getName() + " заправляет авто");
    }
}
