package by.yahimovich.task03classuml.insurance.entity.insurance.factory;

import by.yahimovich.task03classuml.insurance.entity.insurance.InsuranceContract;

import java.util.Date;

public class CreateInsurance implements InsuranceFactory {
    @Override
    public InsuranceContract create() {
        return new InsuranceContract("First", "House",
                new Date(), 12, 2021);
    }
}
