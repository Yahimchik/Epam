package by.yahimovich.task03classuml.insurance.comparator;

import by.yahimovich.task03classuml.insurance.entity.insurance.InsuranceContract;

import java.util.Comparator;

public class InsuranceObjectComparator implements Comparator<InsuranceContract> {
    @Override
    public int compare(InsuranceContract o1, InsuranceContract o2) {
        return o1.getInsuranceObject().compareTo(o2.getInsuranceObject());
    }
}
