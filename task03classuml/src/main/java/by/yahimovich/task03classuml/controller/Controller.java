package by.yahimovich.task03classuml.controller;

import by.yahimovich.task03classuml.exhibition.entity.Exhibition;
import by.yahimovich.task03classuml.insurance.entity.insurance.Derivatives;
import by.yahimovich.task03classuml.insurance.entity.insurance.factory.CreateInsurance;
import by.yahimovich.task03classuml.insurance.entity.insurance.factory.InsuranceFactory;
import by.yahimovich.task03classuml.insurance.entity.person.factory.CreateInsuredFactory;
import by.yahimovich.task03classuml.insurance.entity.person.factory.CreateInsurerFactory;
import by.yahimovich.task03classuml.insurance.entity.person.factory.FactoryPerson;
import by.yahimovich.task03classuml.insurance.service.PersonRepository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class Controller {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {

        FactoryPerson insurer = new CreateInsurerFactory();
        FactoryPerson insured = new CreateInsuredFactory();

        System.out.println(insurer.createPerson());
        System.out.println(insured.createPerson());

        InsuranceFactory insurance = new CreateInsurance();
        Derivatives derivatives = new Derivatives();

        derivatives.add(insurance.create());
        System.out.println(derivatives);

        PersonRepository info = new PersonRepository();

        Exhibition exhibition = new Exhibition("Mana_Lisa",
                new Exhibition.Author("Egor", "Yahimovich",
                        new Date()),
                new Date());

        System.out.println(exhibition);
//        DAOInterface<Person> json = (DAOInterface<Person>) Proxy.newProxyInstance(JsonDAO.class.getClassLoader(), new Class[]{
//                DAOInterface.class
//        }, new LoggingProxyHandler<>(new JsonDAO<>(Person.class)));
//
//        List<Person> list = json.read("ex.json");
//
//        json.write(list,"Insurance.json");

        System.out.println(info.createPerson());
    }
}
