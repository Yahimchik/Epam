package by.yahimovich.task03classuml.insurance.entity.insurance.derivativefactory;

import by.yahimovich.task03classuml.insurance.entity.insurance.Derivatives;
import by.yahimovich.task03classuml.insurance.entity.insurance.factory.CreateInsurance;

public class CreateDerivative implements CreateDerivativeInterface {
    @Override
    public Derivatives create() {
        return new Derivatives(new CreateInsurance().create());
    }
}
