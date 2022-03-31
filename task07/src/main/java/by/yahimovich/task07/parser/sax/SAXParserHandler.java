package by.yahimovich.task07.parser.sax;

import by.yahimovich.task07.entity.*;
import by.yahimovich.task07.parser.TagEnum;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;


public class SAXParserHandler extends DefaultHandler {
    private final Set<SubscriptionSale> sales;
    private SubscriptionSale sale;
    private UserProfile client;
    private Subscription subscription;
    private Service service;
    private UserProfile employee;
    private EmployeeSpecialization specialization;
    private TagEnum tagEnum;
    private final EnumSet<TagEnum> withText;
    private static final String ELEMENT_SALE = "subscription_sale";
    private final SimpleDateFormat format =
            new SimpleDateFormat("dd.MM.yyyy HH:mm");

    public SAXParserHandler() {
        sales = new HashSet<>();
        withText = EnumSet.range(TagEnum.SALES, TagEnum.PHONE_EMPLOYEE);
    }

    public Set<SubscriptionSale> getSales() {
        return sales;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (ELEMENT_SALE.equals(qName)) {
            sale = new SubscriptionSale();
        } else {
            TagEnum temp = TagEnum.valueOf(qName.toUpperCase());
            if (withText.contains(temp)) {
                tagEnum = temp;
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (ELEMENT_SALE.equals(qName)) {
            sales.add(sale);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        String data = new String(ch, start, length);
        if (tagEnum != null) {
            switch (tagEnum) {
                case CARD_NUMBER -> sale.setCardNumber(Integer.parseInt(data));
                case USER_ID -> sale.setUserID(Integer.parseInt(data));
                case START_DATE -> {
                    try {
                        sale.setStartDate(format.parse(data));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                case END_DATE -> {
                    try {
                        sale.setEndDate(format.parse(data));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                case SERVICE_ID -> sale.setEmployeeServiceID(Integer.parseInt(data));
                case CLIENT -> {
                    client = new UserProfile();
                    sale.setUserProfile(client);
                }
                case ID_CLIENT -> client.setId(Integer.parseInt(data));
                case F_NAME_CLIENT -> client.setFirstName(data);
                case S_NAME_CLIENT -> client.setSecondName(data);
                case L_NAME_CLIENT -> client.setLastName(data);
                case ADDRESS_CLIENT -> client.setAddress(data);
                case PHONE_CLIENT -> client.setPhoneNumber(data);
                case SUBSCRIPTION -> {
                    subscription = new Subscription();
                    sale.setSubscription(subscription);
                }
                case ID_SUB -> subscription.setId(Integer.parseInt(data));
                case NAME_SUB -> subscription.setName(data);
                case PRICE -> subscription.setPrice(Double.parseDouble(data));
                case VISITS -> subscription.setNumberOfVisit(Integer.parseInt(data));
                case DAYS -> subscription.setNumberOfDays(Integer.parseInt(data));
                case SPECIALIZATION -> {
                    specialization = new EmployeeSpecialization();
                    sale.setSpecialization(specialization);
                }
                case ID_SPEC -> specialization.setId(Integer.parseInt(data));
                case NOTE -> specialization.setNote(data);
                case SERVICE -> {
                    service = new Service();
                    specialization.setService(service);
                }
                case ID_SERV -> service.setId(Integer.parseInt(data));
                case NAME_SERV -> service.setNameService(data);
                case EMPLOYEE -> {
                    employee = new UserProfile();
                    specialization.setEmployee(employee);
                }
                case ID_EMPLOYEE -> employee.setId(Integer.parseInt(data));
                case F_NAME_EMPLOYEE -> employee.setFirstName(data);
                case S_NAME_EMPLOYEE -> employee.setSecondName(data);
                case L_NAME_EMPLOYEE -> employee.setLastName(data);
                case ADDRESS_EMPLOYEE -> employee.setAddress(data);
                case PHONE_EMPLOYEE -> employee.setPhoneNumber(data);
            }
        }
        tagEnum = null;
    }
}