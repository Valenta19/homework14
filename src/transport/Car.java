package transport;


import java.util.List;

public class Car extends Transport<DriverB> {


    public Car(String brand, String model, double engineVolume, DriverB driver, BodyTypes hatchback, List<Mechanic> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
    }

    public enum BodyTypes {
        SEDAN("Седан"),
        HATCHBACK("Хетчбэк"),
        COUPE("Купе"),
        UNIVERSAL("Универсал "),
        SUV(" Внедорожник"),
        CROSSOVER(" Кроссовер"),
        PICKUP(" Пикап"),
        VAN("Фургон "),
        MINIVAN("Минивэн ");

        private String bodyType;

        BodyTypes(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }

        public String toString() {
            return " тип кузова " + bodyType;
        }
    }

    BodyTypes bodyTypes;
    @Override
    public void startMove() {
        System.out.println("Автомабиль марки" + getBrand() + "начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автомабиль марки" + getBrand() + "закончил движение");
    }

    @Override
    public Type getType() {
        return Type.CAR;
    }

    @Override
    public boolean passDiagnostics() {
        return true;
    }

    @Override
    public void printType() {
        if (getType() != null) {
            System.out.println(getType());
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }


    @Override
    public void pitStop() {
        System.out.println(" пит- стоп у автомобиля");
    }

    @Override
    public void bestLapTime() {
        int minBound = 60;
        int maxBound = 100;
        int bestTimeinMin = (int) (minBound + (maxBound + minBound) * Math.random());

        System.out.println(" лучшее время для автомобиля в минутах " + bestTimeinMin);
    }

    @Override
    public void maxSpeed() {
        int minBound = 120;
        int maxBound = 180;
        int maxSpead = (int) (minBound + (maxBound + minBound) * Math.random());
        System.out.println(" максимальная скорость для автомобиля " + maxSpead);
    }
}


