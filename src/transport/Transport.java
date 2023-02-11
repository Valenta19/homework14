package transport;

public class Transport {
    String color;
    private int maximumMovementSpeed;
    final String brand;
    final String model;
    final int year;
    final String country;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "белый";
        }
        this.color = color;
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        this.maximumMovementSpeed = maximumMovementSpeed;
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public Transport(String brand, String model, int year, String country, String color, int maximumMovementSpeed) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;

        this.year = (year <= 0 ? 2000 : year);

        if (country == null || country.isEmpty()) {
            country = "default";
        }
        this.country = country;
        setColor(color);
        this.maximumMovementSpeed = maximumMovementSpeed;

    }
    public String toString() {
        return "марка " + brand +
                " модель " + model +
                ", год производства " + year +
                ", цвет кузова " + color +
                ", страна сборки " + country +
               ", максимальная скорость " + maximumMovementSpeed;
    }


}
