package by.yahimovich.finaltask.entity;

import java.util.Objects;

/**
 * Subscription class.
 * Store information about
 * subscription.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Entity
 */

public class Subscription extends Entity {
    private Integer id;
    private String name;
    private double price;
    private int numberOfVisit;
    private int numberOfDays;

    public Subscription() {
    }

    /**
     * Constructor - create new object.
     *
     * @param id            User identification number.
     * @param name          Subscription type.
     * @param price         Subscription cost.
     * @param numberOfVisit Number of possible visits.
     * @param numberOfDays  Subscription duration.
     */

    public Subscription(Integer id, String name,
                        double price, int numberOfVisit,
                        int numberOfDays) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.numberOfVisit = numberOfVisit;
        this.numberOfDays = numberOfDays;
    }

    /**
     * Method getId.
     *
     * @return User identification number.
     */

    public Integer getId() {
        return id;
    }

    //Аналогично.

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method getName;
     *
     * @return subscription type;
     */

    public String getName() {
        return name;
    }

    /**
     * Method setName;
     * Set new value for subscription type.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method getPrice.
     *
     * @return subscription cost.
     */

    public double getPrice() {
        return price;
    }

    /**
     * Method setPrice.
     * Set new value for subscription cost.
     */

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Method getNumberOfVisit.
     *
     * @return Number of possible visits.
     */

    public int getNumberOfVisit() {
        return numberOfVisit;
    }

    /**
     * Method setNumberOfVisit.
     * Set new value of possible visits.
     */

    public void setNumberOfVisit(int numberOfVisit) {
        this.numberOfVisit = numberOfVisit;
    }

    /**
     * Method getNumberOfDays.
     *
     * @return Subscription duration.
     */

    public int getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * Method setNumberOfDays.
     * Set new Subscription duration.
     */

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    /**
     * Override method toString.
     *
     * @return object as string.
     */

    @Override
    public String toString() {
        return "ID: " + getId()
                + "\nName: " + getName()
                + "\nPrice: " + getPrice()
                + "\nNumber of visit: " + getNumberOfVisit()
                + "\nSubscription duration: " + getNumberOfDays();
    }

    /**
     * Override method hashCode.
     *
     * @return a hash value for an object.
     */

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price,
                numberOfVisit, numberOfDays);
    }

    /**
     * Override method equals.
     *
     * @return true or false if the objects
     * are equal or not respectively.
     */

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null ||
                getClass() != object.getClass()) {
            return false;
        }
        Subscription other = (Subscription) object;
        return Objects.equals(id, other.id) &&
                Double.compare(other.price, price) == 0 &&
                numberOfVisit == other.numberOfVisit &&
                numberOfDays == other.numberOfDays &&
                name.equals(other.name);
    }
}
