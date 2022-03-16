package by.yahimovich.task07.controller;


import by.yahimovich.task07.entity.SubscriptionSale;
import by.yahimovich.task07.parser.DOMParser;
import by.yahimovich.task07.parser.StAXParser;
import by.yahimovich.task07.parser.exception.ParserException;
import by.yahimovich.task07.parser.sax.SAXParserClass;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args)
            throws ParserException, ParseException, XMLStreamException, FileNotFoundException {
        DOMParser parser = new DOMParser();
        SubscriptionSale sale1 = parser.parse("data.xml");
        System.out.println(sale1 + "\n");
        SAXParserClass parser1 = new SAXParserClass();
        SubscriptionSale sale = parser1.parse("data.xml");
        System.out.println(sale.toString() + "\n");
        StAXParser parser2 = new StAXParser();
        System.out.println(parser2.parse("data.xml"));
    }
}
