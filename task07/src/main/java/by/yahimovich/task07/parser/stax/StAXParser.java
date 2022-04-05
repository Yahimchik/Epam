package by.yahimovich.task07.parser.stax;

import by.yahimovich.task07.builder.BaseBuilder;
import by.yahimovich.task07.entity.*;
import by.yahimovich.task07.parser.ParserInterface;
import by.yahimovich.task07.parser.TagEnum;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

public class StAXParser extends BaseBuilder implements ParserInterface {

    private final SimpleDateFormat format =
            new SimpleDateFormat("dd.MM.yyyy HH:mm");
    private final Set<SubscriptionSale> sales;
    private final XMLInputFactory factory;
    private UserProfile client;
    private Subscription subscription;
    private Service service;
    private EmployeeSpecialization specialization;
    private UserProfile employee;

    public StAXParser() {
        factory = XMLInputFactory.newInstance();
        sales = new HashSet<>();
    }

    public Set<SubscriptionSale> getSales() {
        return sales;
    }

    @Override
    public void buildSales(String fileName) {
        XMLStreamReader reader;
        String name;
        try (FileInputStream inputStream = new FileInputStream(String.valueOf(getFileFromResource(fileName)))) {
            reader = factory.createXMLStreamReader(inputStream);
            while (reader.hasNext()) {
                int type = reader.next();
                if (type == XMLStreamConstants.START_ELEMENT) {
                    name = reader.getLocalName();
                    if (name.equals(TagEnum.SUBSCRIPTION_SALE.getTagName())) {
                        SubscriptionSale sale = buildSale(reader);
                        sales.add(sale);
                    }
                }
            }
        } catch (XMLStreamException | IOException | ParseException | URISyntaxException exception) {
            exception.printStackTrace();
        }
    }

    private SubscriptionSale buildSale(XMLStreamReader reader)
            throws XMLStreamException, ParseException {
        SubscriptionSale sale = new SubscriptionSale();
        String name;
        while (reader.hasNext()) {
            int type = reader.next();
            switch (type) {
                case XMLStreamConstants.START_ELEMENT -> {
                    name = reader.getLocalName();
                    switch (TagEnum.valueOf(name.toUpperCase())) {
                        case CARD_NUMBER -> sale.setCardNumber(Integer.parseInt(getText(reader)));
                        case USER_ID -> sale.setUserID(Integer.parseInt(getText(reader)));
                        case START_DATE -> sale.setStartDate(format.parse(getText(reader)));
                        case END_DATE -> sale.setEndDate(format.parse(getText(reader)));
                        case SERVICE_ID -> sale.setEmployeeServiceID(Integer.parseInt(getText(reader)));
                        case CLIENT -> {
                            client = new UserProfile();
                            sale.setUserProfile(client);
                        }
                        case ID_CLIENT -> client.setId(Integer.parseInt(getText(reader)));
                        case F_NAME_CLIENT -> client.setFirstName(getText(reader));
                        case S_NAME_CLIENT -> client.setSecondName(getText(reader));
                        case L_NAME_CLIENT -> client.setLastName(getText(reader));
                        case ADDRESS_CLIENT -> client.setAddress(getText(reader));
                        case PHONE_CLIENT -> client.setPhoneNumber(getText(reader));
                        case SUBSCRIPTION -> {
                            subscription = new Subscription();
                            sale.setSubscription(subscription);
                        }
                        case ID_SUB -> subscription.setId(Integer.parseInt(getText(reader)));
                        case NAME_SUB -> subscription.setName(getText(reader));
                        case PRICE -> subscription.setPrice(Double.parseDouble(getText(reader)));
                        case VISITS -> subscription.setNumberOfVisit(Integer.parseInt(getText(reader)));
                        case DAYS -> subscription.setNumberOfDays(Integer.parseInt(getText(reader)));
                        case SPECIALIZATION -> {
                            specialization = new EmployeeSpecialization();
                            sale.setSpecialization(specialization);
                        }
                        case ID_SPEC -> specialization.setId(Integer.parseInt(getText(reader)));
                        case NOTE -> specialization.setNote(getText(reader));
                        case SERVICE -> {
                            service = new Service();
                            specialization.setService(service);
                        }
                        case ID_SERV -> service.setId(Integer.parseInt(getText(reader)));
                        case NAME_SERV -> service.setNameService(getText(reader));
                        case EMPLOYEE -> {
                            employee = new UserProfile();
                            specialization.setEmployee(employee);
                        }
                        case ID_EMPLOYEE -> employee.setId(Integer.parseInt(getText(reader)));
                        case F_NAME_EMPLOYEE -> employee.setFirstName(getText(reader));
                        case S_NAME_EMPLOYEE -> employee.setSecondName(getText(reader));
                        case L_NAME_EMPLOYEE -> employee.setLastName(getText(reader));
                        case ADDRESS_EMPLOYEE -> employee.setAddress(getText(reader));
                        case PHONE_EMPLOYEE -> employee.setPhoneNumber(getText(reader));
                    }
                }
                case XMLStreamConstants.END_ELEMENT -> {
                    name = reader.getLocalName();
                    if (TagEnum.valueOf(name.toUpperCase()) == TagEnum.SUBSCRIPTION_SALE) {
                        return sale;
                    }
                }
            }
        }
        throw new XMLStreamException();
    }

    private String getText(XMLStreamReader reader) throws XMLStreamException {
        String text = null;
        if (reader.hasNext()) {
            reader.next();
            text = reader.getText();
        }
        return text;
    }


}
