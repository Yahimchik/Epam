package by.yahimovich.task07.parser;

import by.yahimovich.task07.entity.Entity;
import by.yahimovich.task07.entity.SubscriptionSale;
import by.yahimovich.task07.entity.User;
import by.yahimovich.task07.parser.exception.ParserException;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class StAXParser implements ParserInterface {

    @Override
    public SubscriptionSale parse(String fileName) throws ParseException, ParserException {
        List<Entity> entities = new ArrayList<>();

        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLEventReader reader;

        try {
            reader = factory.createXMLEventReader(new FileReader(fileName));
        } catch (XMLStreamException | FileNotFoundException e) {
            throw new ParserException();
        }

        String currentElement = "";
        boolean parsed;
        parsed = true;
        String id = "";
        String email = "";
        String password = "";
        String role = "";

        while (reader.hasNext()) {
            XMLEvent event = null;

            try {
                event = reader.nextEvent();
            } catch (XMLStreamException e) {
                throw new ParserException();
            }

            String qName = "";

            switch (event.getEventType()) {
                case XMLStreamConstants.START_ELEMENT:
                    StartElement startElement = event.asStartElement();
                    qName = startElement
                            .getName()
                            .getLocalPart();
                    currentElement = qName;
                    if (qName.equals("id") ||
                            qName.equals("email") ||
                            qName.equals("password") ||
                            qName.equals("role")
                    ) {
                        parsed = false;
                    }
                    break;
                case XMLStreamConstants.CHARACTERS:
                    String value = event.asCharacters().getData();
                    if (!parsed) {
                        switch (currentElement) {
                            case "id":
                                id = value;
                                break;
                            case "email":
                                email = value;
                                break;
                            case "password":
                                password = value;
                                break;
                            case "role":
                                role = value;
                                break;
                            default:
                                break;
                        }
                        parsed = true;
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    EndElement endElement = event.asEndElement();
                    qName = endElement
                            .getName()
                            .getLocalPart();
                    if ("user".equals(qName)) {
                        entities.add(new User(
                                Integer.parseInt(id),
                                email,
                                password,
                                role));
                    }
                    break;
                default:
                    break;
            }
        }
        return null;
    }
}
