package by.yahimovich.task07.parser;

import by.yahimovich.task07.entity.*;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SAXParserHandler extends DefaultHandler {

    private String currentTagName;

    private final SubscriptionSale sale = new SubscriptionSale();
    private final SimpleDateFormat format =
            new SimpleDateFormat("dd.MM.yyyy HH:mm");

    private boolean isSale = false;
    private boolean isClient = false;
    private boolean isService = false;
    private boolean isEmployee = false;
    private boolean isSubscription = false;
    private boolean isSpecialization = false;

    private final Service service = new Service();
    private final UserProfile client = new UserProfile();
    private final UserProfile employee = new UserProfile();
    private final Subscription subscription =
            new Subscription();
    private final EmployeeSpecialization specialization =
            new EmployeeSpecialization();


    @Override
    public void startElement(final String uri, final String localName,
                             final String qName, final Attributes attributes) {
        currentTagName = qName;
        switch (currentTagName) {
            case "client" -> isClient = true;
            case "service" -> isService = true;
            case "employee" -> isEmployee = true;
            case "subscription_sale" -> isSale = true;
            case "subscription" -> isSubscription = true;
            case "specialization" -> isSpecialization = true;
            default -> System.out.println();
        }
    }

    @Override
    public void endElement(final String uri, final String localName,
                           final String qName) {
        switch (qName) {
            case "client" -> isClient = false;
            case "service" -> isService = false;
            case "employee" -> isEmployee = false;
            case "subscription_sale" -> isSale = false;
            case "subscription" -> isSubscription = false;
            case "specialization" -> isSpecialization = false;
            default -> System.out.println();
        }
        currentTagName = null;
    }

    @Override
    public void characters(final char[] ch, final int start,
                           final int length) {
        String data = new String(ch, start, length);
        if (currentTagName == null) {
            return;
        }
        if (isSale) {
            switch (currentTagName) {
                case "card_number" -> sale
                        .setCardNumber(Integer.parseInt(data));
                case "user_id" -> sale
                        .setUserID(Integer.parseInt(data));
                case "start_date" -> {
                    try {
                        sale.setStartDate(format.parse(data));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                case "end_date" -> {
                    try {
                        sale.setEndDate(format.parse(data));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                case "service_id" -> sale
                        .setEmployeeServiceID(Integer.parseInt(data));
                default -> System.out.println();
            }
            if (isSale && isClient) {
                createUser(client, data);
                sale.setUserProfile(client);
            }
            if (isSale && isSubscription) {
                switch (currentTagName) {
                    case "id" -> subscription.setId(Integer.parseInt(data));
                    case "name" -> subscription.setName(data);
                    case "price" -> subscription
                            .setPrice(Double.parseDouble(data));
                    case "visits" -> subscription
                            .setNumberOfVisit(Integer.parseInt(data));
                    case "days" -> subscription
                            .setNumberOfDays(Integer.parseInt(data));
                    default -> System.out.println();
                }
                sale.setSubscription(subscription);
            }
            if (isSale && isSpecialization) {
                if (currentTagName.equals("id")) {
                    specialization.setId(Integer.parseInt(data));
                } else if (currentTagName.equals("note")) {
                    specialization.setNote(data);
                }
                if (isSpecialization && isService) {
                    if (currentTagName.equals("id")) {
                        service.setId(Integer.parseInt(data));
                    } else if (currentTagName.equals("name")) {
                        service.setNameService(data);
                    }
                    specialization.setService(service);
                }
                if (isSpecialization && isEmployee) {
                    createUser(employee, data);
                    specialization.setEmployee(employee);
                }
                sale.setSpecialization(specialization);
            }
        }
    }

    private void createUser(final UserProfile user, final String data) {
        switch (currentTagName) {
            case "id" -> user.setId(Integer.parseInt(data));
            case "f_name" -> user.setFirstName(data);
            case "s_name" -> user.setSecondName(data);
            case "l_name" -> user.setLastName(data);
            case "address" -> user.setAddress(data);
            case "phone" -> user.setPhoneNumber(data);
            default -> System.out.println();
        }
    }

    public SubscriptionSale getSale() {
        return sale;
    }
}