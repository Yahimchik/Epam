package by.yahimovich.task03classuml.insurance.service.comparator;

import by.yahimovich.task03classuml.insurance.entity.insurance.Derivatives;

import java.util.Comparator;

public class InsuranceDamageComparator implements Comparator<Derivatives> {
    @Override
    public int compare(Derivatives o1, Derivatives o2) {
        return Double.compare(o1.getContract().getDamage(), o2.getContract().getDamage());
    }
}
