package by.yahimovich.task03classuml.insurance.service;

import by.yahimovich.task03classuml.insurance.entity.insurance.InsuranceContract;
import by.yahimovich.task03classuml.insurance.service.repository.InsuranceRepository;

public class CreateInsuranceService extends InsuranceRepository {
    public InsuranceContract createInsurance() {
        return new InsuranceContract(
                contracts.get(service.rand(10)).getInsuranceType(),
                contracts.get(service.rand(10)).getInsuranceObject(),
                contracts.get(service.rand(10)).getConclusionDate(),
                contracts.get(service.rand(10)).getDamage(),
                contracts.get(service.rand(10)).getInsurancePremiumAmount(),
                contracts.get(service.rand(10)).getInsurer(),
                contracts.get(service.rand(10)).getInsured(),
                contracts.get(service.rand(10)).getInsuranceNumber()
        );
    }
}
