package by.yahimovich.task03classuml.insurance.service.repository;

import by.yahimovich.task03classuml.insurance.entity.insurance.InsuranceContract;
import by.yahimovich.task03classuml.insurance.entity.person.factory.CreateInsuredFactory;
import by.yahimovich.task03classuml.insurance.entity.person.factory.CreateInsurerFactory;
import by.yahimovich.task03classuml.insurance.service.Service;

import java.util.Date;
import java.util.List;

public class InsuranceRepository {

    public Service service = new Service();

    public List<InsuranceContract> contracts = List.of(
            new InsuranceContract(
                    "Accident and illness insurance",
                    "Property of citizens",
                    new Date(1),
                    1313,
                    1710,
                    new CreateInsurerFactory().createPerson(),
                    new CreateInsuredFactory().createPerson(),
                    service.rand(1000)
            ),

            new InsuranceContract(
                    "Health insurance",
                    "Legal entities",
                    new Date(2),
                    9451,
                    2224,
                    new CreateInsurerFactory().createPerson(),
                    new CreateInsuredFactory().createPerson(),
                    service.rand(1000)
            ),

            new InsuranceContract(
                    "Insurance of land vehicles (excluding railway vehicles)",
                    "Banking risks",
                    new Date(3),
                    1557,
                    4776,
                    new CreateInsurerFactory().createPerson(),
                    new CreateInsuredFactory().createPerson(),
                    service.rand(1000)
            ),

            new InsuranceContract(
                    "Railway transport insurance",
                    "Marine risks",
                    new Date(4),
                    7144,
                    4620,
                    new CreateInsurerFactory().createPerson(),
                    new CreateInsuredFactory().createPerson(),
                    service.rand(1000)
            ),

            new InsuranceContract(
                    "Air transport insurance",
                    "Aviation risks",
                    new Date(5),
                    9960,
                    4898,
                    new CreateInsurerFactory().createPerson(),
                    new CreateInsuredFactory().createPerson(),
                    service.rand(1000)
            ),

            new InsuranceContract(
                    "Accident and illness insurance",
                    "Cargo transportation",
                    new Date(6),
                    780,
                    3995,
                    new CreateInsurerFactory().createPerson(),
                    new CreateInsuredFactory().createPerson(),
                    service.rand(1000)
            ),

            new InsuranceContract(
                    "Water transport insurance",
                    "Technical risks",
                    new Date(7),
                    1403,
                    2244,
                    new CreateInsurerFactory().createPerson(),
                    new CreateInsuredFactory().createPerson(),
                    service.rand(1000)
            ),

            new InsuranceContract(
                    "Cargo insurance",
                    "Insurance of term deposits and money in bank accounts",
                    new Date(8),
                    854,
                    1063,
                    new CreateInsurerFactory().createPerson(),
                    new CreateInsuredFactory().createPerson(),
                    service.rand(1000)
            ),

            new InsuranceContract(
                    "Agricultural insurance (insurance of crops, crops, perennial plantations, animals)",
                    "Motor third party liability insurance",
                    new Date(9),
                    4659,
                    4766,
                    new CreateInsurerFactory().createPerson(),
                    new CreateInsuredFactory().createPerson(),
                    service.rand(1000)
            ),

            new InsuranceContract(
                    "Property insurance of legal entities, excluding vehicles and agricultural insurance",
                    "Insurance of losses on transactions of sale of goods, performance of work," +
                            " provision of services",
                    new Date(10),
                    2696,
                    767,
                    new CreateInsurerFactory().createPerson(),
                    new CreateInsuredFactory().createPerson(),
                    service.rand(1000)
            )
    );
}
