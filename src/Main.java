
import transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Mechanic mechanic1 = new Mechanic("Алексеев Даниил", "GENERAL MOTORS");
        Mechanic mechanic2 = new Mechanic("Иванов Владимир", "FORD");
        Mechanic mechanic3 = new Mechanic("Кузина Оливия", " FIAT");
        Mechanic mechanic4 = new Mechanic("Калмыкова София", "BMW");

        List<Mechanic> mechaniсList = new ArrayList<>();
        mechaniсList.add(mechanic1);
        mechaniсList.add(mechanic2);
        mechaniсList.add(mechanic3);
        mechaniсList.add(mechanic4);
        DriverB driverB1 = new DriverB("Григорьев Никита", true, 10);
        DriverB driverB2 = new DriverB("Кузнецова Елизавета", true, 15);
        DriverB driverB3 = new DriverB("Егоров Владимир", true, 7);
        DriverB driverB4 = new DriverB("Королева Карина", true, 12);
        Car[] cars = new Car[4];
        cars[0] = new Car("Audi", "A8 50 L TDI quattro", 3.0, driverB1, Car.BodyTypes.HATCHBACK, mechaniсList);
        cars[1] = new Car("BMW", "Z8", 12, driverB2, Car.BodyTypes.COUPE, mechaniсList);
        cars[2] = new Car("Kia", "Sportage 4-го поколения", 2.4, driverB3, Car.BodyTypes.MINIVAN, mechaniсList);
        cars[3] = new Car("Hyundai", "Avante", 1.6, driverB4, Car.BodyTypes.SEDAN, mechaniсList);
        DriverD driverD1 = new DriverD("Горбачев Филипп", true, 16);
        DriverD driverD2 = new DriverD("Васильева Алёна", true, 12);
        DriverD driverD3 = new DriverD("Егоров Владимир", true, 17);
        DriverD driverD4 = new DriverD("Карташов Юрий", true, 13);
        Bus[] buses = new Bus[4];
        buses[0] = new Bus("ANKAI", "HFF6851K57D", 3.2, driverD1, Bus.Capacity.LARGE, mechaniсList);
        buses[1] = new Bus("AYATS", "ATLANTIS", 4.3, driverD2, Bus.Capacity.AVERAGE, mechaniсList);
        buses[2] = new Bus("БАЗ", "Богдан А-3017 (301.71)", 4.2, driverD3, Bus.Capacity.SMALL, mechaniсList);
        buses[3] = new Bus("БАЗ", "А079.07", 6.2, driverD4, Bus.Capacity.EXTRA_LARGE, mechaniсList);
        DriverC driverC1 = new DriverC("Воронина Арина", true, 10);
        DriverC driverC2 = new DriverC("Попов Сергей", true, 12);
        DriverC driverC3 = new DriverC("Щербаков Тимур", true, 7);
        DriverC driverC4 = new DriverC("Токарев Артур", true, 12);
        Trucks[] trucks = new Trucks[4];
        trucks[0] = new Trucks("Ford", "Maverick", 8.0, driverC1, Trucks.CarryingCapacity.N1, mechaniсList);
        trucks[1] = new Trucks("Hyundai ", "Santa Cruz", 5.2, driverC2, Trucks.CarryingCapacity.N3, mechaniсList);
        trucks[2] = new Trucks("Honda ", "Ridgeline", 4.0, driverC3, Trucks.CarryingCapacity.N3, mechaniсList);
        trucks[3] = new Trucks(" Ford", "F-150 Raptor", 3.5, driverC4, Trucks.CarryingCapacity.N2, mechaniсList);

        List<Transport<?>> transportsList = new ArrayList<>();
        transportsList.add(cars[0]);
        transportsList.add(cars[1]);
        transportsList.add(cars[2]);
        transportsList.add(cars[3]);
        transportsList.add(buses[0]);
        transportsList.add(buses[1]);
        transportsList.add(buses[2]);
        transportsList.add(buses[3]);
        transportsList.add(trucks[0]);
        transportsList.add(trucks[1]);
        transportsList.add(trucks[2]);
        transportsList.add(trucks[3]);
        System.out.println(Trucks.CarryingCapacity.N1);
        System.out.println(Trucks.CarryingCapacity.N2.getLowerBound());
        System.out.println(Car.BodyTypes.COUPE.getBodyType());
        System.out.println(Car.BodyTypes.COUPE);
        System.out.println(Bus.Capacity.EXTRA_LARGE);
        System.out.println(Bus.Capacity.EXTRA_LARGE.getLowerBound());
        printInfo(cars);
        printInfo(buses);
        printInfo(trucks);
        trucks[3].setCarryingCapacity(Trucks.CarryingCapacity.N1);
        checkTransportDiagnostic(trucks[1]);
        checkTransportDiagnostic(cars[1]);
        checkTransportDiagnostic(buses[2]);
        checkTransportDiagnostic(cars[2]);
        checkTransportDiagnostic(trucks[2]);
        checkTransportDiagnostic(cars[3]);
        checkTransportDiagnostic(buses[3]);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addAutoQueue(cars[3]);
        serviceStation.addAutoQueue(cars[2]);
        serviceStation.addAutoQueue(cars[0]);
        serviceStation.addAutoQueue(buses[2]);
        serviceStation.addAutoQueue(buses[0]);
        serviceStation.addAutoQueue(buses[3]);
        serviceStation.addAutoQueue(trucks[0]);
        serviceStation.addAutoQueue(trucks[2]);
        serviceStation.carryOutMaintenance();
        transportsInfo(cars[1]);
        mechanic3.performMaintenance();

        Set<Driver> driverList = new HashSet<>();
        driverList.add(driverB2);
        driverList.add(driverB2);
        driverList.add(driverB3);
        driverList.add(driverB1);
        driverList.add(driverB2);
        driverList.add(driverB2);
        driverList.add(driverB1);
        driverList.add(driverB2);
        driverList.add(driverB3);
        driverList.add(driverB4);
        driverList.add(driverD2);
        System.out.println("информация о водителях без повтора: ");
        for (Driver driver : driverList) {
            System.out.println(driver.getName() + " " + driver.getExperience());
        }
        HashMap<Transport, Mechanic> map = new HashMap<>();
        map.put(cars[1], mechanic1);
        map.put(cars[2], mechanic1);
        map.put(cars[0], mechanic3);
        map.put(cars[3], mechanic2);
        map.put(cars[3], mechanic2);
        map.put(cars[1], mechanic3);
        map.put(buses[1], mechanic1);
        map.put(buses[3], mechanic1);
        map.put(buses[3], mechanic2);
        map.put(buses[1], mechanic3);
        map.put(trucks[1], mechanic2);
        map.put(trucks[1], mechanic3);
        map.put(trucks[2], mechanic4);
        map.put(trucks[2], mechanic3);


        for (Map.Entry<Transport, Mechanic> entry : map.entrySet()) {
            System.out.println(" Машина = " + entry.getKey() + " " + entry.getValue());
        }
    }

    public static void printInfo(Transport<?>[] transports) {
        for (Transport<?> transport : transports) {
            System.out.println("водитель: " + transport.getDriver().getName() + " "
                    + transport.getDriver().getClass() + ", управляет автомобилем: "
                    + transport.getBrand() + " " + transport.getModel() + " вид транспорта: " + transport.getType() +
                    " и будет участвовать в заезде");
        }
    }

    public static void checkTransportDiagnostic(Transport<?> transports) {
        if (transports.getType().equals(Type.BUS)) {
            try {
                transports.passDiagnostics();
            } catch (TransportTypeException e) {
                System.out.println("Автобусам не нужно проходить диагностику");
            }
        } else {
            try {
                transports.passDiagnostics();
            } catch (TransportTypeException e) {
                System.out.println(" ");
            }
        }
    }

    public static void transportsInfo(Transport<?> transports) {
        System.out.println(transports.getBrand() + " " + transports.getModel() + " Водитель: " +
                transports.getDriver().getName() + " " + transports.getMechanicList());
    }

}

