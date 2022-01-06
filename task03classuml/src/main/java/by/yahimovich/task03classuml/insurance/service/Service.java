package by.yahimovich.task03classuml.insurance.service;

import by.yahimovich.task03classuml.insurance.entity.insurance.Derivatives;
import by.yahimovich.task03classuml.insurance.service.comparator.*;

import java.util.List;

public class Service {

    public List<Derivatives> sortByDamage(List<Derivatives> contracts) {
        InsuranceDamageComparator comparator = new InsuranceDamageComparator();
        contracts.sort(comparator);
        return contracts;
    }

    public List<Derivatives> sortByDate(List<Derivatives> contracts) {
        InsuranceDateComparator comparator = new InsuranceDateComparator();
        contracts.sort(comparator);
        return contracts;
    }

    public List<Derivatives> sortByObject(List<Derivatives> contracts) {
        InsuranceObjectComparator comparator = new InsuranceObjectComparator();
        contracts.sort(comparator);
        return contracts;
    }

    public List<Derivatives> sortByPremiumAmount(List<Derivatives> contracts) {
        InsurancePremiumAmountComparator comparator = new InsurancePremiumAmountComparator();
        contracts.sort(comparator);
        return contracts;
    }

    public List<Derivatives> sortByType(List<Derivatives> contracts) {
        InsuranceTypeComparator comparator = new InsuranceTypeComparator();
        contracts.sort(comparator);
        return contracts;
    }

    public double fullDamage(List<Derivatives> derivatives) {

        double result = 0;

        for (Derivatives derivative : derivatives) {
            result += derivative.getContract().getDamage();
        }
        return result;
    }

    public int rand(int i) {
        return (int) ((Math.random() * i));
    }
}
