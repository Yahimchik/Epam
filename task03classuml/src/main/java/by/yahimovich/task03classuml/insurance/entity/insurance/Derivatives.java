package by.yahimovich.task03classuml.insurance.entity.insurance;

public class Derivatives {

    private InsuranceContract contract;

    public Derivatives() {
        super();
    }

    public Derivatives(InsuranceContract contract) {
        this.contract = contract;
    }

    public InsuranceContract getContract() {
        return contract;
    }

    @Override
    public String toString() {
        return "\nINSURANCE " + getContract();
    }
}
