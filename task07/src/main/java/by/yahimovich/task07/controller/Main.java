package by.yahimovich.task07.controller;


import by.yahimovich.task07.parser.dom.DOMParser;
import by.yahimovich.task07.parser.sax.SAXParserClass;
import by.yahimovich.task07.parser.stax.StAXParser;

public class Main {
    public static void main(String[] args) {
        SAXParserClass saxParserClass = new SAXParserClass();
        saxParserClass.buildSales("data.xml");
        System.out.println(saxParserClass.getSales() + "SAX");
        DOMParser domParser = new DOMParser();
        domParser.buildSales("data.xml");
        System.out.println(domParser.getSales() + "DOM");
        StAXParser stAXParser = new StAXParser();
        stAXParser.buildSales("data.xml");
        System.out.println(stAXParser.getSales() + "StAX");
    }
}
