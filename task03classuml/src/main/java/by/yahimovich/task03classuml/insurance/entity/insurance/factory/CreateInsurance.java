package by.yahimovich.task03classuml.insurance.entity.insurance.factory;

import by.yahimovich.task03classuml.insurance.entity.insurance.InsuranceContract;
import by.yahimovich.task03classuml.insurance.service.CreateInsuranceService;

public class CreateInsurance implements InsuranceFactory {
    @Override
    public InsuranceContract create() {
        return new CreateInsuranceService().createInsurance();
    }
}
