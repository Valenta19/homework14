package transport;

public class Car {

    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summer;

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
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

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String bodyType, Boolean summer, int numberOfSeats, String registrationNumber, String transmission, Kay kay) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;

        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;

        setEngineVolume(engineVolume);
        setColor(color);
        this.year = (year <= 0 ? 2000 : year);

        if (country == null || country.isEmpty()) {
            country = "default";
        }
        this.country = country;

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

    public String getBrand() {
        return brand;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getModel() {
        return model;
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

    {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "белый";
        }
        this.color = color;
    }


    public boolean isSummer() {
        return summer;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
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
        return "марка " + brand +
                " модель " + model +
                ", год производства " + year +
                ", объем двигателя в литрах " + engineVolume +
                ", цвет кузова " + color +
                ", страна сборки " + country +
                ", коробка передач " + transmission +
                ", тип кузова " + bodyType +
                ", регестрацционный номер " + registrationNumber +
                ",  кол-во мест " + numberOfSeats +
                ", " + (summer ? "летнии" : " зимнии") + ", " +
                kay;
    }

}
