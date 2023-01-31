public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model,double engineVolume,String color, int year, String country) {
        this.brand = (brand == null ? "default" : brand);
        this.model = (model == null ? "default" : model);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.color = (color == null ? "white" : color);
        this.year = (year <= 0 ? 2000 : year);
        this.country = (country == null ? "default" : country);
    }



    public String toString() {
        return "марка " + brand +
                " модель " + model +
                ", год производства " + year +
                ", объем двигателя в литрах " + engineVolume +
                ", цвет кузова " + color +
                ", страна сборки " + country;
    }

}
