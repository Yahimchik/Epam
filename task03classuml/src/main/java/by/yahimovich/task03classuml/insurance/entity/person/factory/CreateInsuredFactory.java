package by.yahimovich.task03classuml.insurance.entity.person.factory;

import by.yahimovich.task03classuml.insurance.entity.person.Person;
import by.yahimovich.task03classuml.insurance.service.CreatePerson;

public class CreateInsuredFactory implements FactoryPerson {
    @Override
    public Person createPerson() {
        return new CreatePerson().createPerson();
    }
}
