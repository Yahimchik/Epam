package by.yahimovich.task07.writer;

import by.yahimovich.task07.entity.Entity;
import by.yahimovich.task07.entity.SubscriptionSale;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

public class DOMWriter implements WriterInterface {

    @Override
    public void xmlWriter(String path, List<Entity> entityList) {

        try {
            Document document = DocumentBuilderFactory
                    .newInstance()
                    .newDocumentBuilder()
                    .newDocument();

            Element element = document.createElement("sales");
            document.appendChild(element);

//            for (Entity entity : entityList) {
//                Element child = document.createElement("subscription_sale");
//                element.appendChild(child);
//
//                Element el1 = document.createElement("card_number");
//                el1.setTextContent("" + ((SubscriptionSale) entity)
//                        .getCardNumber());
//                child.appendChild(el1);
//
//                Element el2 = document.createElement("user_id");
//                el2.setTextContent("" + ((SubscriptionSale) entity)
//                        .getUserID());
//                child.appendChild(el2);
//
//                Element el3 = document.createElement("start_date");
//                el3.setTextContent("" + ((SubscriptionSale) entity)
//                        .getStartDate());
//                child.appendChild(el3);
//
//                Element el4 = document.createElement("end_date");
//                el4.setTextContent("" + ((SubscriptionSale) entity)
//                        .getEndDate());
//                child.appendChild(el4);
//
//                Element el5 = document.createElement("service_id");
//                el5.setTextContent("" + ((SubscriptionSale) entity)
//                        .getEmployeeServiceID());
//                child.appendChild(el5);
//
//                Element child1 = document.createElement("user");
//                child.appendChild(child1);
//
//                Element el6 = document.createElement("id");
//                el6.setTextContent("" + ((SubscriptionSale) entity)
//                        .getUserProfile()
//                        .getId());
//                child1.appendChild(el6);
//
//                Element el7 = document.createElement("f_name");
//                el7.setTextContent("" + ((SubscriptionSale) entity)
//                        .getUserProfile()
//                        .getFirstName());
//                child1.appendChild(el7);
//
//                Element el8 = document.createElement("s_name");
//                el8.setTextContent("" + ((SubscriptionSale) entity)
//                        .getUserProfile()
//                        .getSecondName());
//                child1.appendChild(el8);
//
//                Element el9 = document.createElement("l_name");
//                el9.setTextContent("" + ((SubscriptionSale) entity)
//                        .getUserProfile()
//                        .getLastName());
//                child1.appendChild(el9);
//
//                Element el10 = document.createElement("address");
//                el10.setTextContent("" + ((SubscriptionSale) entity)
//                        .getUserProfile()
//                        .getAddress());
//                child1.appendChild(el10);
//
//                Element el11 = document.createElement("phone");
//                el11.setTextContent("" + ((SubscriptionSale) entity)
//                        .getUserProfile()
//                        .getPhoneNumber());
//                child1.appendChild(el11);
//
//                Element child2 = document.createElement("subscription");
//                child.appendChild(child2);
//
//                Element el12 = document.createElement("id");
//                el12.setTextContent("" + ((SubscriptionSale) entity)
//                        .getSubscription()
//                        .getId());
//                child2.appendChild(el12);
//
//                Element el13 = document.createElement("name");
//                el13.setTextContent("" + ((SubscriptionSale) entity)
//                        .getSubscription()
//                        .getName());
//                child2.appendChild(el13);
//
//                Element el14 = document.createElement("price");
//                el14.setTextContent("" + ((SubscriptionSale) entity)
//                        .getSubscription()
//                        .getPrice());
//                child2.appendChild(el14);
//
//                Element el15 = document.createElement("visits");
//                el15.setTextContent("" + ((SubscriptionSale) entity)
//                        .getSubscription()
//                        .getNumberOfVisit());
//                child2.appendChild(el15);
//
//                Element el16 = document.createElement("days");
//                el16.setTextContent("" + ((SubscriptionSale) entity)
//                        .getSubscription()
//                        .getNumberOfDays());
//                child2.appendChild(el16);
//
//                Element child3 = document.createElement("specialization");
//                child.appendChild(child3);
//
//                Element elem1 = document.createElement("id");
//                elem1.setTextContent("" + ((SubscriptionSale) entity)
//                        .getSpecialization()
//                        .getId());
//                child3.appendChild(elem1);
//
//                Element elem2 = document.createElement("note");
//                elem2.setTextContent("" + ((SubscriptionSale) entity)
//                        .getSpecialization()
//                        .getNote());
//                child3.appendChild(elem2);
//
//                Element child4 = document.createElement("service");
//                child3.appendChild(child4);
//
//                Element elem3 = document.createElement("id");
//                elem3.setTextContent("" + ((SubscriptionSale) entity)
//                        .getSpecialization()
//                        .getService()
//                        .getId());
//                child4.appendChild(elem3);
//
//                Element elem4 = document.createElement("name");
//                elem4.setTextContent("" + ((SubscriptionSale) entity)
//                        .getSpecialization()
//                        .getService()
//                        .getNameService());
//                child4.appendChild(elem4);
//
//                Element child5 = document.createElement("employee");
//                child3.appendChild(child5);
//
//                Element e6 = document.createElement("id");
//                e6.setTextContent("" + ((SubscriptionSale) entity)
//                        .getUserProfile()
//                        .getId());
//                child5.appendChild(e6);
//
//                Element e7 = document.createElement("f_name");
//                e7.setTextContent("" + ((SubscriptionSale) entity)
//                        .getUserProfile()
//                        .getFirstName());
//                child5.appendChild(e7);
//
//                Element e8 = document.createElement("s_name");
//                e8.setTextContent("" + ((SubscriptionSale) entity)
//                        .getUserProfile()
//                        .getSecondName());
//                child5.appendChild(e8);
//
//                Element e9 = document.createElement("l_name");
//                e9.setTextContent("" + ((SubscriptionSale) entity)
//                        .getUserProfile()
//                        .getLastName());
//                child5.appendChild(e9);
//
//                Element e0 = document.createElement("address");
//                e0.setTextContent("" + ((SubscriptionSale) entity)
//                        .getUserProfile()
//                        .getAddress());
//                child5.appendChild(e0);
//
//                Element e1 = document.createElement("phone");
//                e1.setTextContent("" + ((SubscriptionSale) entity)
//                        .getUserProfile()
//                        .getPhoneNumber());
//                child5.appendChild(e1);
//
//            }

            Transformer transformer = TransformerFactory
                    .newInstance()
                    .newTransformer();

            transformer.transform(new DOMSource(document),
                    new StreamResult(new FileOutputStream(path)));


        } catch (ParserConfigurationException |
                TransformerException |
                FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
