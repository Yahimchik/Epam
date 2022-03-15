package by.yahimovich.task07.controller;


import by.yahimovich.task07.entity.SubscriptionSale;
import by.yahimovich.task07.parser.DOMParser;
import by.yahimovich.task07.parser.SAXParserClass;
import by.yahimovich.task07.parser.exception.ParserException;

import java.text.ParseException;

public class Main {
    public static void main(String[] args)
            throws ParserException, ParseException {
        DOMParser parser = new DOMParser();
        SubscriptionSale sale1 = parser.parse("data.xml");
        System.out.println(sale1 + "\n");
        SAXParserClass parser1 = new SAXParserClass();
        SubscriptionSale sale = parser1.parse("data.xml");
        System.out.print(sale.toString());
    }
}
