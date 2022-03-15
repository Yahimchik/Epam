package by.yahimovich.task07.parser;

import by.yahimovich.task07.entity.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DOMParser implements ParserInterface {

    private Document document;
    private final SimpleDateFormat format =
            new SimpleDateFormat("dd.MM.yyyy HH:mm");

    @Override
    public SubscriptionSale parse(final String fileName) throws ParseException {
        try {
            document = buildDocument(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return createSubscription();
    }

    private Document buildDocument(final String fileName) throws Exception {
        File input = new File(fileName);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        return dbFactory.newDocumentBuilder().parse(input);
    }

    private SubscriptionSale createSubscription() throws ParseException {
        SubscriptionSale sale = new SubscriptionSale();
        NodeList subscriptionTags = document
                .getElementsByTagName("subscription_sale");
        for (int i = 0; i < subscriptionTags.getLength(); ++i) {
            Node node = subscriptionTags.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element subSale = (Element) node;
                String cardNumber = getContent(subSale, "card_number");

                String userId = getContent(subSale, "user_id");
                String startDate = getContent(subSale, "start_date");

                String endDate = getContent(subSale, "end_date");
                String serviceId = getContent(subSale, "service_id");

                Element client = createElement(subSale, "client");
                Element sub = createElement(subSale, "subscription");

                String idSub = getContent(sub, "id");
                String name = getContent(sub, "name");

                String price = getContent(sub, "price");
                String visits = getContent(sub, "visits");

                String days = getContent(sub, "days");
                Element spec = createElement(subSale, "specialization");

                String idSpec = getContent(spec, "id");
                String note = getContent(spec, "note");

                Element serv = createElement(spec, "service");
                String idServ = getContent(serv, "id");

                String nameServ = getContent(serv, "name");
                Element employee = createElement(spec, "employee");

                sale.setCardNumber(Integer.parseInt(cardNumber));
                sale.setUserID(Integer.parseInt(userId));

                sale.setStartDate(format.parse(startDate));
                sale.setEndDate(format.parse(endDate));

                sale.setEmployeeServiceID(Integer.parseInt(serviceId));
                sale.setUserProfile(createUser(client));

                sale.setSubscription(
                        new Subscription(
                                Integer.parseInt(idSub),
                                name,
                                Double.parseDouble(price),
                                Integer.parseInt(visits),
                                Integer.parseInt(days)));

                sale.setSpecialization(
                        new EmployeeSpecialization(
                                Integer.parseInt(idSpec),
                                note,
                                new Service(
                                        Integer.parseInt(idServ),
                                        nameServ),
                                createUser(employee)));
            }
        }
        return sale;
    }

    private String getContent(final Element element, final String name) {
        return element
                .getElementsByTagName(name)
                .item(0)
                .getTextContent();
    }

    private Element createElement(final Element element, final String name) {
        return (Element) element
                .getElementsByTagName(name)
                .item(0);
    }

    private UserProfile createUser(final Element element) {
        String id = getContent(element, "id");
        String fName = getContent(element, "f_name");
        String sName = getContent(element, "s_name");
        String lName = getContent(element, "l_name");
        String address = getContent(element, "address");
        String phone = getContent(element, "phone");
        return new UserProfile(Integer.parseInt(id), fName,
                sName, lName, address, phone);
    }
}
