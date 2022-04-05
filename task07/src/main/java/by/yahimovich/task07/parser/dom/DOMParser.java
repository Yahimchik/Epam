package by.yahimovich.task07.parser.dom;

import by.yahimovich.task07.builder.DOMBuilder;
import by.yahimovich.task07.entity.*;
import by.yahimovich.task07.parser.ParserInterface;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

public class DOMParser extends DOMBuilder implements ParserInterface {

    private final Set<SubscriptionSale> sales;
    private DocumentBuilder builder;
    private final SimpleDateFormat format =
            new SimpleDateFormat("dd.MM.yyyy HH:mm");

    public DOMParser() {
        sales = new HashSet<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    public Set<SubscriptionSale> getSales() {
        return sales;
    }

    @Override
    public void buildSales(String fileName) {
        Document document;
        try {
            document = builder.parse(String.valueOf(getFileFromResource(fileName)));
            Element root = document.getDocumentElement();
            NodeList salesList = root.getElementsByTagName("subscription_sale");
            for (int i = 0; i < salesList.getLength(); ++i) {
                Element saleElement = (Element) salesList.item(i);
                SubscriptionSale sale = buildSale(saleElement);
                sales.add(sale);
            }
        } catch (IOException | SAXException | ParseException | URISyntaxException exception) {
            exception.printStackTrace();
        }
    }

    private SubscriptionSale buildSale(Element element) throws ParseException {
        SubscriptionSale sale = new SubscriptionSale();

        sale.setCardNumber(Integer.parseInt(getContext(element, "card_number")));
        sale.setUserID(Integer.parseInt(getContext(element, "user_id")));

        sale.setStartDate(format.parse(getContext(element, "start_date")));
        sale.setEndDate(format.parse(getContext(element, "end_date")));

        sale.setEmployeeServiceID(Integer.parseInt((getContext(element, "service_id"))));
        Element client = (Element) element.getElementsByTagName("client").item(0);

        UserProfile clientUser = new UserProfile();
        clientUser.setId(Integer.parseInt(getContext(client, "id_client")));

        clientUser.setFirstName(getContext(client, "f_name_client"));
        clientUser.setSecondName(getContext(client, "s_name_client"));

        clientUser.setLastName(getContext(client, "l_name_client"));
        clientUser.setAddress(getContext(client, "address_client"));

        clientUser.setPhoneNumber(getContext(client, "phone_client"));
        sale.setUserProfile(clientUser);

        Element sub = (Element) element.getElementsByTagName("subscription").item(0);
        Subscription subscription = new Subscription();

        subscription.setId(Integer.parseInt(getContext(sub, "id_sub")));
        subscription.setName(getContext(sub, "name_sub"));

        subscription.setPrice(Double.parseDouble(getContext(sub, "price")));
        subscription.setNumberOfVisit(Integer.parseInt(getContext(sub, "visits")));

        subscription.setNumberOfDays(Integer.parseInt(getContext(sub, "days")));
        sale.setSubscription(subscription);

        Element spec = (Element) element.getElementsByTagName("specialization").item(0);
        EmployeeSpecialization specialization = new EmployeeSpecialization();

        specialization.setId(Integer.parseInt(getContext(spec, "id_spec")));
        specialization.setNote(getContext(spec, "note"));

        sale.setSpecialization(specialization);
        Element serv = (Element) spec.getElementsByTagName("service").item(0);

        Service service = new Service();
        service.setId(Integer.parseInt(getContext(serv, "id_serv")));

        service.setNameService(getContext(serv, "name_serv"));
        specialization.setService(service);

        Element employee = (Element) spec.getElementsByTagName("employee").item(0);
        UserProfile employeeUser = new UserProfile();

        employeeUser.setId(Integer.parseInt(getContext(employee, "id_employee")));
        employeeUser.setFirstName(getContext(employee, "f_name_employee"));

        employeeUser.setSecondName(getContext(employee, "s_name_employee"));
        employeeUser.setLastName(getContext(employee, "l_name_employee"));

        employeeUser.setAddress(getContext(employee, "address_employee"));
        employeeUser.setPhoneNumber(getContext(employee, "phone_employee"));
        specialization.setEmployee(employeeUser);

        return sale;
    }

    private static String getContext(Element element, String name) {
        NodeList list = element.getElementsByTagName(name);
        Node node = list.item(0);
        return node.getTextContent();
    }
}
