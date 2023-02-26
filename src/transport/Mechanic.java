package transport;

public class Mechanic {
    private String name;
    private String company;

    public Mechanic(String name, String placeOfWork) {

        this.name = name;
        this.company = placeOfWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public void performMaintenance() {
        System.out.println("Механник " + getName() + " проводит диагностику. ");
    }

    public void fixCar() {
        System.out.println("Механник " + getName() + " ремонтирует автомобиль.");
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "Механик='" + name + '\'' +
                ", Компания='" + company + '\'' +
                '}';
    }
}
