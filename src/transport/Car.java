package transport;


public class Car extends Transport {

    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summer;
    private double engineVolume;
    private Kay kay;

    public static class Kay {
        private final boolean remoteRun;
        private final boolean keylessEntry;

        public Kay(boolean remoteRun, boolean keylessEntry) {
            this.remoteRun = remoteRun;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return (remoteRun ? "удаленный запуск двигателя" : " без удаленного запуска двигателля") + ", " +
                    (keylessEntry ? "безключевой доступ" : " безключевой доступ отсутствует");
        }
    }

    public Car(String brand, String model, int year, String country, String color, int maximumMovementSpeed, double engineVolume, String bodyType, Boolean summer, int numberOfSeats, String registrationNumber, String transmission, Kay kay) {
        super(brand, model, year, country, color, maximumMovementSpeed);
        this.engineVolume = engineVolume;
        if (numberOfSeats <= 0) {
            numberOfSeats = 5;
        }
        this.numberOfSeats = numberOfSeats;
        setRegistrationNumber(registrationNumber);
        setTransmission(transmission);
        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "седан";
        }
        this.bodyType = bodyType;
        this.summer = summer;
        setKay(kay);
    }

    public Kay getKay() {
        return kay;
    }

    public void setKay(Kay kay) {
        if (kay == null) {
            kay = new Kay(false, false);
        }
        this.kay = kay;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            transmission = "МКПП";
        }
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            registrationNumber = "x000x000";
        }
        this.registrationNumber = registrationNumber;
    }

    public void setSummer(boolean summer) {
        this.summer = summer;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
    }

    public boolean isSummer() {
        return summer;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void changeTyres(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            summer = false;
        }
        if (month >= 4 && month <= 10) {
            summer = true;
        }
    }

    public String toString() {
        return super.toString() + ", " +
                ", обьем двигателя в литрах" + engineVolume +
                ", коробка передач " + transmission +
                ", тип кузова " + bodyType +
                ", регестрацционный номер " + registrationNumber +
                ",  кол-во мест " + numberOfSeats +
                ", " + (summer ? "летнии" : " зимнии") + ",  " +
                kay;
    }
}


