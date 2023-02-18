
import transport.*;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Driver cat.B № " + i, true, 6 + i);
            Car car = new Car(
                    "car brand № " + i,
                    "car model №" + i,
                    3.2 + i,
                    driverB, Car.BodyTypes.HATCHBACK
            );

            DriverD driverD = new DriverD("Driver cat.D № " + i, true, 3 + i);
            Bus bus = new Bus(
                    " Bus " + i,
                    " Bus " + i + " ",
                    1.2,
                    driverD, Bus.Capacity.EXTRA_LARGE
            );
            DriverC driverC = new DriverC("Driver cat.C № " + i, true, 3 + i);
            Trucks trucks = new Trucks(
                    "trucks brand №" + i,
                    "trucks model №" + i,
                    5.3 + i,
                    driverC, Trucks.CarryingCapacity.N1
            );
            try {
                checkTransport(bus, car, trucks);
            } catch (TransportTypeException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }

            printInfo(car);
            printInfo(bus);
            printInfo(trucks);
        }
        System.out.println(Car.BodyTypes.HATCHBACK.getBodyType());
        System.out.println(Trucks.CarryingCapacity.N1);
        System.out.println(Trucks.CarryingCapacity.N2.getLowerBound());
        System.out.println(Car.BodyTypes.COUPE.getBodyType());
        System.out.println(Car.BodyTypes.COUPE);
        System.out.println(Bus.Capacity.EXTRA_LARGE);
        System.out.println(Bus.Capacity.EXTRA_LARGE.getLowerBound());

    }

    public static void checkTransport(Transport... transports) throws TransportTypeException {
        int count = 0;
        for (Transport transport : transports) {
            if (!transport.passDiagnostics()) {
                count++;
            }
        }

    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
    }


}