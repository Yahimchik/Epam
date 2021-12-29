package by.yahimovich.task03classuml.insurance.comparator;

import by.yahimovich.task03classuml.insurance.entity.insurance.InsuranceContract;

import java.util.Comparator;

public class InsurancePremiumAmountComparator implements Comparator<InsuranceContract> {
    @Override
    public int compare(InsuranceContract o1, InsuranceContract o2) {
        return Double.compare(o1.getInsurancePremiumAmount(), o2.getInsurancePremiumAmount());
    }
}
