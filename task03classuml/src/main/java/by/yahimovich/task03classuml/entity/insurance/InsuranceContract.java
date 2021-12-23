package by.yahimovich.task03classuml.entity.insurance;

import java.util.Date;

/**
 * Class insurance contracts.
 *
 * @author Egor Yahimovich.
 * @version 1.0
 */

public class InsuranceContract {

    private String insuranceType;
    private String insuranceObject;
    private final Date conclusionDate;

    private double damage;
    private double insurancePremiumAmount;

    /**
     * Constructor these parameters. Establishes the type, object, date of conclusion, the amount
     * of damage (in monetary terms), the amount of the premium for the insurance contract.
     *
     * @param insuranceType          Type.
     * @param insuranceObject        Insurance object.
     * @param conclusionDate         Date.
     * @param damage                 The amount of damage (in monetary terms).
     * @param insurancePremiumAmount Insurance premium amount.
     */

    public InsuranceContract(String insuranceType, String insuranceObject,
                             Date conclusionDate, double damage, double insurancePremiumAmount) {
        this.insuranceType = insuranceType;
        this.insuranceObject = insuranceObject;
        this.conclusionDate = conclusionDate;
        this.damage = damage;
        this.insurancePremiumAmount = insurancePremiumAmount;
    }

    /**
     * Method getInsuranceType.
     *
     * @return Insurance type.
     */

    public String getInsuranceType() {
        return insuranceType;
    }

    /**
     * Method setInsuranceType.
     *
     * @param insuranceType Set new insurance type.
     */

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    /**
     * Method getInsuranceObject.
     *
     * @return Insurance object.
     */

    public String getInsuranceObject() {
        return insuranceObject;
    }

    /**
     * Method setInsuranceObject.
     *
     * @param insuranceObject Set new insurance object.
     */

    public void setInsuranceObject(String insuranceObject) {
        this.insuranceObject = insuranceObject;
    }

    /**
     * Method getConclusionDate.
     *
     * @return Conclusion date.
     */

    public Date getConclusionDate() {
        return conclusionDate;
    }

    /**
     * Method getDamage.
     *
     * @return Damage amount.
     */

    public double getDamage() {
        return damage;
    }

    /**
     * Method setDamage.
     *
     * @param damage Set new damage amount.
     */

    public void setDamage(double damage) {
        this.damage = damage;
    }

    /**
     * Method getInsurancePremiumAmount.
     *
     * @return Insurance premium amount.
     */

    public double getInsurancePremiumAmount() {
        return insurancePremiumAmount;
    }

    /**
     * Method setInsurancePremiumAmount.
     *
     * @param insurancePremiumAmount Set new premium amount of the insurance.
     */

    public void setInsurancePremiumAmount(double insurancePremiumAmount) {
        this.insurancePremiumAmount = insurancePremiumAmount;
    }

    /**
     * Overriding method toString.
     *
     * @return Insurance contact to string.
     */

    @Override
    public String toString() {
        return "Insurance type: " + getInsuranceType()
                + "\nInsurance object: " + getInsuranceObject()
                + "\nConclusion date: " + getConclusionDate()
                + "\nDamage: " + getDamage()
                + "\nInsurance premium amount: " + getInsurancePremiumAmount();
    }
}
