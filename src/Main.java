
import transport.*;

public class Main {
    public static void main(String[] args) {


        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Driver cat.B № " + i, true, 6 + i);
            Car car = new Car(
                    "car brand № " + i,
                    "car model №" + i,
                    3.2 + i,
                    driverB
            );
            DriverD driverD = new DriverD("Driver cat.D № " + i, true, 3 + i);
            Bus bus = new Bus(
                    " Bus " + i,
                    " Bus " + i + " ",
                    1.2,
                    driverD
            );
            DriverC driverC = new DriverC("Driver cat.C № " + i, true, 3 + i);
            Trucks trucks = new Trucks(
                    "trucks brand №" + i,
                    "trucks model №" + i,
                    5.3 + i,
                    driverC
            );
            printInfo(car);
            printInfo(bus);
            printInfo(trucks);

        }
    }

    public static void printInfo(Transport<?>transport) {
        System.out.println("водитель " +transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
    }

}