package by.yahimovich.task03classuml.insurance.service.comparator;

import by.yahimovich.task03classuml.insurance.entity.insurance.Derivatives;

import java.util.Comparator;

public class InsuranceDateComparator implements Comparator<Derivatives> {
    @Override
    public int compare(Derivatives o1, Derivatives o2) {
        return o1.getContract().getConclusionDate().compareTo(o2.getContract().getConclusionDate());
    }
}
