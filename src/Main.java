
public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("lada", "Granta", 1.7, "yellow", 2015, "Russian");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        Car bmwZ8 = new Car("BMV", "Z8", 3.0, "black", 2021, "Germany");
        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2.4, "red", 2018, "southKorea");
        Car  hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "southKorea");
        System.out.println(audiA8);
        System.out.println(ladaGranta);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
    }
}