package transport;

public class Trucks extends Transport<DriverC> {
    CarryingCapacity carryingCapacity;

    public Trucks(String brand, String model, double engineVolume, DriverC driver, CarryingCapacity carryingCapacity) {
        super(brand, model, engineVolume, driver);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение ");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение ");
    }

    @Override
    public Type getType() {
        return Type.TRUCK;
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

    public enum CarryingCapacity {
        N1(null, 3.5F),
        N2(3.5F, 12F),
        N3(12F, null);


        private Float lowerBound;
        private Float upperBound;

        CarryingCapacity(Float lowerBound, Float upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public Float getLowerBound() {
            return lowerBound;
        }

        public void setLowerBound(Float lowerBound) {
            this.lowerBound = lowerBound;
        }

        public Float getUpperBound() {
            return upperBound;
        }

        public void setUpperBound(Float upperBound) {
            this.upperBound = upperBound;
        }

        @Override
        public String toString() {
            return "CarryingCapacity{" +
                    "нижняя граница = " + (lowerBound == null ? " " : String.valueOf(lowerBound)) +
                    " верхняя граница = " + (upperBound == null ? " " : String.valueOf(upperBound)) +
                    '}';
        }
    }
}

