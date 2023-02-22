package transport;

import java.io.IOException;

public class Bus extends Transport<DriverD> {
    Capacity capacity;

    public Bus(String brand, String model, double engineVolume, DriverD driver, Capacity capacity) {
        super(brand, model, engineVolume, driver);
        this.capacity = capacity;
    }

    @Override
    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение");
    }

    @Override
    public Type getType() {
        return Type.BUS;
    }

    @Override
    public boolean passDiagnostics() throws TransportTypeException {
        throw new TransportTypeException("автобусам проходить диагностику не нужно");
    }

    @Override
    public void printType() {
        if (getType() != null) {
            System.out.println(getType());
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
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

    public enum Capacity {
        EXTRA_SMALL(null, 10),
        SMALL(null, 25),
        AVERAGE(25, 50),
        LARGE(50, 80),
        EXTRA_LARGE(80, 120);

        private Integer lowerBound;
        private Integer upperBound;

        Capacity(Integer lowerBound, Integer upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;

        }

        public Integer getLowerBound() {
            return lowerBound;
        }

        public void setLowerBound(Integer lowerBound) {
            this.lowerBound = lowerBound;
        }

        public Integer getUpperBound() {
            return upperBound;
        }

        public void setUpperBound(Integer upperBound) {
            this.upperBound = upperBound;
        }

        @Override
        public String toString() {
            return "Вместимость:" +
                    "нижняя граница = " + (lowerBound == null ? " " : String.valueOf(lowerBound)) +
                    ", верхняя граница = " + (upperBound == null ? " " : String.valueOf(upperBound)) +
                    " Мест" +
                    '}';
        }
    }
}
