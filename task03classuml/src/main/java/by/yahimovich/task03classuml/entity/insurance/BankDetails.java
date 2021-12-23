package by.yahimovich.task03classuml.entity.insurance;

/**
 * Class bank details.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */

public class BankDetails {

    private final String recipientIBAN;
    private String appointment;

    private final int bankRecipientBIC;
    private final int recipientPAN;
    private final int payerPAN;

    /**
     * Constructor these parameters. Bank details.
     *
     * @param payerPAN         Payer Payer Account Number.
     * @param recipientPAN     Recipient Payer Account Number.
     * @param recipientIBAN    Recipient International Bank Account Number.
     * @param bankRecipientBIC Bank Identification Code.
     * @param appointment      Appointment.
     */

    public BankDetails(int payerPAN, int recipientPAN, String recipientIBAN, int bankRecipientBIC, String appointment) {
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

    public int getBankRecipientBIC() {
        return bankRecipientBIC;
    }

    /**
     * Method getBankRecipient.
     *
     * @return Payer Account Number.
     */

    public int getRecipientPAN() {
        return recipientPAN;
    }

    /**
     * Method getBankRecipient.
     *
     * @return Payer Account Number.
     */

    public int getPayerPAN() {
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
