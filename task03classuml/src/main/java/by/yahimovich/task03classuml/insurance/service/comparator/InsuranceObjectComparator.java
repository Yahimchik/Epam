package by.yahimovich.task03classuml.insurance.service.comparator;

import by.yahimovich.task03classuml.insurance.entity.insurance.Derivatives;

import java.util.Comparator;

public class InsuranceObjectComparator implements Comparator<Derivatives> {
    @Override
    public int compare(Derivatives o1, Derivatives o2) {
        return o1.getContract().getInsuranceObject().compareTo(o2.getContract().getInsuranceObject());
    }
}
