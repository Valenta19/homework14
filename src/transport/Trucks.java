package transport;

public class Trucks extends Transport<DriverC> {

    public Trucks(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение ");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение ");
    }

    public void pitStop() {
        System.out.println(" пит- стоп у грузовика");
    }

    @Override
    public void bestLapTime() {
        int minBound = 100;
        int maxBound = 140;
        int bestTimeinMin = (int) (minBound + (maxBound + minBound) * Math.random());

        System.out.println(" лучшее время для грузовика в минутах " + bestTimeinMin);
    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 140;
        int maxSpead = (int) (minBound + (maxBound + minBound) * Math.random());
        System.out.println(" максимальная скорость для грузовика " + maxSpead);
    }
}
