package by.yahimovich.task03classuml.insurance.service.comparator;

import by.yahimovich.task03classuml.insurance.entity.insurance.Derivatives;

import java.util.Comparator;

public class InsuranceTypeComparator implements Comparator<Derivatives> {
    @Override
    public int compare(Derivatives o1, Derivatives o2) {
        return o1.getContract().getInsuranceType().compareTo(o2.getContract().getInsuranceType());
    }
}
