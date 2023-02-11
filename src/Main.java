
import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("lada", "Granta", 17, "yellow", "белый", 130, 1.2, "седан", false, 341, "XXX0XXX", "null", new Car.Kay(true, true));
        System.out.println(ladaGranta);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 30, "германия", null, 150, 2.1, "седан", false, 341, "XXX0XXX", null, new Car.Kay(true, true));
        System.out.println(audiA8);
        Car bmwZ8 = new Car("BMV", "Z8", 30, "америка", "черный", 120, 1.4, "седан", true, 341, "XXX0XXX", null, new Car.Kay(true, false));
        System.out.println(bmwZ8);
        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 24, "корея", "синий", 170, 5.4, "седан", true, 341, "XXX0XXX", null, new Car.Kay(false, true));
        System.out.println(kiaSportage);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 16, "корея", "красный", 230, 6.7, "седан", false, 341, "XXX0XXX", "null", new Car.Kay(false, false));
        System.out.println(hyundaiAvante);
        for (int i = 1; i <= 3; i++) {
            Bus bus = new Bus(
                    "Bus brand №" + i,
                    "Bus model №" + i,
                    2016 + i,
                    "россия",
                    " красный",
                    130
            );
            System.out.println(bus);

        }
    }
}