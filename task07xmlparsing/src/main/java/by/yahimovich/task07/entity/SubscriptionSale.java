package by.yahimovich.task07.entity;

import java.util.Date;
import java.util.Objects;

/**
 * Class subscription sale.
 * Allows you to sign up
 * for a gym membership.
 *
 * @author Egot Yahimovich
 * @version 1.0
 * @see Entity
 */

public class SubscriptionSale extends Entity {
    private Integer cardNumber;
    private Integer userID;
    private Date startDate;
    private Date endDate;
    private Integer employeeServiceID;
    private UserProfile userProfile;
    private Subscription subscription;
    private EmployeeSpecialization specialization;

    public SubscriptionSale() {
        super();
    }

    /**
     * Constructor - creates new object.
     *
     * @param cardNumber     Number of subscription.
     * @param userID         Identification number of user.
     * @param startDate      Subscription start date.
     * @param endDate        Subscription end date.
     * @param specialization Identification number
     *                       of coach services.
     * @param userProfile    Identification number of user.
     * @param subscription   Identification number of subscription.
     */

    public SubscriptionSale(Integer cardNumber, Integer userID,
                            Date startDate, Date endDate,
                            Integer employeeServiceID,
                            UserProfile userProfile,
                            Subscription subscription,
                            EmployeeSpecialization specialization) {
        this.cardNumber = cardNumber;
        this.userID = userID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employeeServiceID = employeeServiceID;
        this.userProfile = userProfile;
        this.subscription = subscription;
        this.specialization = specialization;
    }

    /**
     * Method getCardNumber.
     *
     * @return card number.
     */

    public Integer getCardNumber() {
        return cardNumber;
    }

    /**
     * Method setCardNumber.
     * Set new value for card number.
     */

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Method getUserID.
     *
     * @return user id.
     */

    public Integer getUserID() {
        return userID;
    }

    /**
     * Method setUserID.
     * Set new id.
     */

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    /**
     * Method getStartDate.
     *
     * @return Subscription start date.
     */

    public Date getStartDate() {
        return startDate;
    }

    /**
     * Method setStartDate.
     * Set new value for subscription start date.
     */

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Method getStartDate.
     *
     * @return Subscription end date.
     */

    public Date getEndDate() {
        return endDate;
    }

    /**
     * Method setStartDate.
     * Set new value for subscription end date.
     */

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * Method getEmployeeServiceID.
     *
     * @return employee service id.
     */

    public Integer getEmployeeServiceID() {
        return employeeServiceID;
    }

    /**
     * Method setEmployeeServiceID.
     * Sets new value for employee service id.
     */

    public void setEmployeeServiceID(Integer employeeServiceID) {
        this.employeeServiceID = employeeServiceID;
    }

    /**
     * Method getUserProfile.
     *
     * @return user profile.
     */

    public UserProfile getUserProfile() {
        return userProfile;
    }

    /**
     * Method setUserProfile.
     * Sets new value for user profile.
     */

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    /**
     * Method getSubscription.
     *
     * @return subscription.
     */

    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Method setSubscription.
     * Set new value for subscription.
     */

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    /**
     * Method getSpecialization.
     *
     * @return Coach specialization.
     */

    public EmployeeSpecialization getSpecialization() {
        return specialization;
    }

    /**
     * Method setSpecialization.
     * Sets new value for coach specialization.
     */

    public void setSpecialization(EmployeeSpecialization
                                          specialization) {
        this.specialization = specialization;
    }

    /**
     * Override method toString.
     *
     * @return object as string.
     */

    @Override
    public String toString() {
        return "Card number: " + getCardNumber()
                + "\nUser ID: " + getUserID()
                + "\nStart date: " + getStartDate()
                + "\nEnd date: " + getEndDate()
                + "\nEmployee service ID: " + getEmployeeServiceID()
                + "\nUser: " + getUserProfile()
                + "\nSubscription: " + getSubscription()
                + "\nSpecialization: " + getSpecialization();
    }

    /**
     * Override method hashCode.
     *
     * @return a hash value for an object.
     */

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, userID, startDate,
                endDate, employeeServiceID, userProfile,
                subscription, specialization);
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
        SubscriptionSale that = (SubscriptionSale) object;
        return cardNumber.equals(that.cardNumber) &&
                userID.equals(that.userID) &&
                startDate.equals(that.startDate) &&
                endDate.equals(that.endDate) &&
                employeeServiceID.equals(that.employeeServiceID) &&
                userProfile.equals(that.userProfile) &&
                subscription.equals(that.subscription) &&
                specialization.equals(that.specialization);
    }
}
