package by.yahimovich.task07.parser.sax;

import by.yahimovich.task07.entity.SubscriptionSale;
import by.yahimovich.task07.parser.ParserInterface;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Set;

public class SAXParserClass implements ParserInterface {
    private Set<SubscriptionSale> sales;
    private final SAXParserHandler handler = new SAXParserHandler();
    private XMLReader reader;

    public SAXParserClass() {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser parser = factory.newSAXParser();
            reader = parser.getXMLReader();
        } catch (ParserConfigurationException | SAXException exception) {
            exception.printStackTrace();
        }

        reader.setContentHandler(handler);
    }

    public Set<SubscriptionSale> getSales() {
        return sales;
    }

    @Override
    public void buildSales(String fileName) {
        try {
            reader.parse(String.valueOf(getFileFromResource(fileName)));
        } catch (IOException | SAXException | URISyntaxException exception) {
            exception.printStackTrace();
        }
        sales = handler.getSales();
    }
}