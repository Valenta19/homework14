package transport;

public class Bus extends Transport<DriverD> {

    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение");
    }

    public void pitStop() {
        System.out.println(" пит- стоп у автобуса");
    }

    @Override
    public void bestLapTime() {
        int minBound = 100;
        int maxBound = 140;
        int bestTimeinMin = (int) (minBound + (maxBound + minBound) * Math.random());

        System.out.println(" лучшее время для астобуса в минутах " + bestTimeinMin);
    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 140;
        int maxSpead = (int) (minBound + (maxBound + minBound) * Math.random());
        System.out.println(" максимальная скорость для астобуса " + maxSpead);
    }
}
