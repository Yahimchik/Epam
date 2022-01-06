package by.yahimovich.task03classuml.insurance.entity.insurance;

/**
 * Class bank details.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */

public class BankDetails {

    private String recipientIBAN;
    private String appointment;
    private String recipientPAN;
    private String payerPAN;

    private String bankRecipientBIC;

    public BankDetails() {
        super();
    }

    /**
     * Constructor these parameters. Bank details.
     *
     * @param payerPAN         Payer Payer Account Number.
     * @param recipientPAN     Recipient Payer Account Number.
     * @param recipientIBAN    Recipient International Bank Account Number.
     * @param bankRecipientBIC Bank Identification Code.
     * @param appointment      Appointment.
     */

    public BankDetails(String payerPAN, String recipientPAN, String recipientIBAN, String bankRecipientBIC, String appointment) {
        this.payerPAN = payerPAN;
        this.recipientPAN = recipientPAN;
        this.recipientIBAN = recipientIBAN;
        this.bankRecipientBIC = bankRecipientBIC;
        this.appointment = appointment;
    }

    /**
     * Method getRecipientIBAN.
     *
     * @return Recipient IBAN.
     */

    public String getRecipientIBAN() {
        return recipientIBAN;
    }

    /**
     * Method getAppointment.
     *
     * @return Appointment.
     */

    public String getAppointment() {
        return appointment;
    }

    /**
     * Method setAppointment.
     *
     * @param appointment Set new appointment.
     */

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    /**
     * Method getBankRecipient.
     *
     * @return Bank Identification Code.
     */

    public String getBankRecipientBIC() {
        return bankRecipientBIC;
    }

    /**
     * Method getBankRecipient.
     *
     * @return Payer Account Number.
     */

    public String getRecipientPAN() {
        return recipientPAN;
    }

    /**
     * Method getBankRecipient.
     *
     * @return Payer Account Number.
     */

    public String getPayerPAN() {
        return payerPAN;
    }

    /**
     * Overriding method toString.
     *
     * @return Bank details to string.
     */

    @Override
    public String toString() {
        return "\nPayer PAN: " + getPayerPAN() +
                "\nRecipient PAN: " + getRecipientPAN() +
                "\nRecipient IBAN: " + getRecipientIBAN() +
                "\nBIC: " + getBankRecipientBIC() +
                "\nAppointment: " + getAppointment();
    }
}
