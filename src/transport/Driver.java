package transport;

import java.util.Objects;

public abstract class Driver {
    private String name;
    private boolean hasDriverLicense;
    private int Experience;

    public Driver(String name, boolean hasDriverLicense, int experience) {
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.Experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int experience) {
        Experience = experience;
    }

    abstract void startMoving();

    abstract void finishMoving();

    abstract void refill();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return hasDriverLicense == driver.hasDriverLicense && Experience == driver.Experience && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hasDriverLicense, Experience);
    }
}
