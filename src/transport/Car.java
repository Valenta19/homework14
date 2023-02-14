package transport;


public class Car extends Transport<DriverB> {


    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автомабиль марки" + getBrand() + "начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автомабиль марки" + getBrand() + "закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println(" пит- стоп у автомобиля");
    }

    @Override
    public void bestLapTime() {
        int minBound = 60;
        int maxBound = 100;
        int bestTimeinMin = (int) ( minBound + (maxBound + minBound) * Math.random());

        System.out.println(" лучшее время для автомобиля в минутах " + bestTimeinMin);
    }

    @Override
    public void maxSpeed() {
        int minBound = 120;
        int maxBound = 180;
        int maxSpead = (int) ( minBound + (maxBound + minBound) * Math.random());
        System.out.println(" максимальная скорость для автомобиля " + maxSpead);
    }
}


