package by.yahimovich.task03classuml.insurance.entity.insurance;

import java.util.Objects;

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

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }

        Derivatives other = (Derivatives) object;


        return (this.getContract() == other.getContract());
    }
}
