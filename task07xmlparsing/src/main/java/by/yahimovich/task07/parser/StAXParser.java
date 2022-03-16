package by.yahimovich.task07.parser;

import by.yahimovich.task07.entity.*;
import by.yahimovich.task07.parser.exception.ParserException;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StAXParser implements ParserInterface {

    private final SimpleDateFormat format =
            new SimpleDateFormat("dd.MM.yyyy HH:mm");
    private final Service service = new Service();
    private final UserProfile client = new UserProfile();
    private final UserProfile employee = new UserProfile();
    private final Subscription subscription = new Subscription();
    private final EmployeeSpecialization specialization =
            new EmployeeSpecialization();


    @Override
    public SubscriptionSale parse(String fileName) throws ParserException, ParseException {
        SubscriptionSale sale = new SubscriptionSale();
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLEventReader reader;
        try {
            reader = factory
                    .createXMLEventReader(new FileInputStream(fileName));
        } catch (XMLStreamException | FileNotFoundException e) {
            throw new ParserException();
        }

        String currentElement = "";
        boolean parsed = true;

        while (reader.hasNext()) {
            XMLEvent event;
            try {
                event = reader.nextEvent();
            } catch (XMLStreamException e) {
                throw new ParserException();
            }

            String qName;

            switch (event.getEventType()) {
                case XMLStreamConstants.START_ELEMENT:
                    StartElement startElement = event.asStartElement();
                    qName = startElement.getName().getLocalPart();
                    currentElement = qName;
                    parsed = false;
                    break;
                case XMLStreamConstants.CHARACTERS:
                    String value = event.asCharacters().getData();
                    if (!parsed) {
                        switch (currentElement) {
                            case "card_number":
                                sale.setCardNumber(Integer.parseInt(value));
                                break;
                            case "user_id":
                                sale.setUserID(Integer.parseInt(value));
                                break;
                            case "start_date":
                                sale.setStartDate(format.parse(value));
                                break;
                            case "end_date":
                                sale.setEndDate(format.parse(value));
                                break;
                            case "service_id":
                                sale.setEmployeeServiceID(Integer.parseInt(value));
                                break;
                            case "client":
                                sale.setUserProfile(client);
                                break;
                            case "id":
                                client.setId(Integer.parseInt(value));
                                break;
                            case "f_name":
                                client.setFirstName(value);
                                break;
                            case "s_name":
                                client.setSecondName(value);
                                break;
                            case "l_name":
                                client.setLastName(value);
                            case "address":
                                client.setAddress(value);
                                break;
                            case "phone":
                                client.setPhoneNumber(value);
                                break;
                            case "subscription":
                                sale.setSubscription(subscription);
                                break;
                            case "id_sub":
                                subscription.setId(Integer.parseInt(value));
                                break;
                            case "name_sub":
                                subscription.setName(value);
                                break;
                            case "price":
                                subscription.setPrice(Double.parseDouble(value));
                                break;
                            case "visits":
                                subscription.setNumberOfVisit(Integer.parseInt(value));
                                break;
                            case "days":
                                subscription.setNumberOfDays(Integer.parseInt(value));
                                break;
                            case "specialization":
                                sale.setSpecialization(specialization);
                                break;
                            case "id_spec":
                                specialization.setId(Integer.parseInt(value));
                                break;
                            case "note":
                                specialization.setNote(value);
                                break;
                            case "service":
                                specialization.setService(service);
                                break;
                            case "id_serv":
                                service.setId(Integer.parseInt(value));
                                break;
                            case "name_serv":
                                service.setNameService(value);
                                break;
                            case "employee":
                                specialization.setEmployee(employee);
                                break;
                            case "id_e":
                                employee.setId(Integer.parseInt(value));
                                break;
                            case "f_name_e":
                                employee.setFirstName(value);
                                break;
                            case "s_name_e":
                                employee.setSecondName(value);
                                break;
                            case "l_name_e":
                                employee.setLastName(value);
                            case "address_e":
                                employee.setAddress(value);
                                break;
                            case "phone_e":
                                employee.setPhoneNumber(value);
                                break;
                        }
                        parsed = true;
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    break;
            }
        }
        return sale;
    }
}
