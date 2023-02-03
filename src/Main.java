import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("lada", "Granta", 1.7, "yellow", 2015, "Russian", " первая", false, 3, "XXX0XXX", " dfdfdfd", null );
        System.out.println(ladaGranta);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany", "23323", true,1, "ccc0ccc", "sfsfsff", new Car.Kay(true,true));
        System.out.println(audiA8);
        Car bmwZ8 = new Car("BMV", "Z8", 3.0, "black", 2021, "Germany", "ddfdf", false, 3, "fdfddf", "fdfdfd", new Car.Kay(true, false));
        System.out.println(bmwZ8);
        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2.4, "red", 2018, "southKorea", "121", true, 2, "xxx121xxx", "fdfdfdfd", new Car.Kay(false, true));
        System.out.println(kiaSportage);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "southKorea", "efddf", true, 1, " dfdffd", " dgdfgf", new Car.Kay(false, false));
        System.out.println(hyundaiAvante);
    }
}