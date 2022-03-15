package by.yahimovich.task07.parser;

import by.yahimovich.task07.entity.SubscriptionSale;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SAXParserClass {

    public SubscriptionSale parse(final String fileName) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParserHandler handler = new SAXParserHandler();
        SAXParser parser = null;

        try {
            parser = factory.newSAXParser();
        } catch (ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }

        File file = new File(fileName);

        try {
            assert parser != null;
            parser.parse(file, handler);
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }
        return handler.getSale();
    }
}
