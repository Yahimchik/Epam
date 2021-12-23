package by.yahimovich.task03classuml.controller;

import by.yahimovich.task03classuml.entity.insurance.Derivatives;
import by.yahimovich.task03classuml.entity.insurance.InsuranceContract;
import by.yahimovich.task03classuml.entity.insurance.person.factory.CreateInsuredFactory;
import by.yahimovich.task03classuml.entity.insurance.person.factory.CreateInsurerFactory;
import by.yahimovich.task03classuml.entity.insurance.person.factory.FactoryPerson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Controller {
    public static void main(String[] args) {

        FactoryPerson insurer = new CreateInsurerFactory();
        FactoryPerson insured = new CreateInsuredFactory();

        System.out.println(insurer.createPerson());
        System.out.println(insured.createPerson());

        InsuranceContract contract = new InsuranceContract("First", "House", new Date(123), 12, 2021);
        Derivatives derivatives = new Derivatives();
        derivatives.add(contract);
        derivatives.add(contract);
        derivatives.add(contract);
        System.out.println(derivatives);
    }
}
