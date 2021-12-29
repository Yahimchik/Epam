package by.yahimovich.task03classuml.insurance.entity.insurance;

import java.util.ArrayList;
import java.util.List;

public class Derivatives {

    private List<InsuranceContract> contracts = new ArrayList<>();


    public Derivatives() {

    }

    public List<InsuranceContract> getContracts() {
        return contracts;
    }

    public void add(InsuranceContract contract) {
        contracts.add(contract);
    }

    public void setContracts(List<InsuranceContract> contracts) {
        this.contracts = contracts;
    }

    /**
     * Overriding method toString.
     *
     * @return Derivatives to string.
     */

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (InsuranceContract insuranceContract : contracts) {
            str.append("\n");
            str.append(insuranceContract);
            str.append("\n");
        }
        return str.toString();
    }
}
