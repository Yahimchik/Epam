package by.yahimovich.task07.controller;

import by.yahimovich.task07.entity.SubscriptionSale;
import by.yahimovich.task07.parser.dom.DOMParser;
import by.yahimovich.task07.parser.sax.SAXParserClass;
import by.yahimovich.task07.parser.stax.StAXParser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@WebServlet(urlPatterns = "/parser-servlet")
public class ParserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fileName = (String) req.getAttribute("fileName");
        Set<SubscriptionSale> sales = processRequest(req, fileName);
        req.setAttribute("sales", sales);
        getServletContext().getRequestDispatcher("/sales.jsp").forward(req, resp);
    }

    public Set<SubscriptionSale> processRequest(HttpServletRequest request, String fileName) {
        String operation = request.getParameter("parser");
        DOMParser parser = new DOMParser();
        SAXParserClass parserClass = new SAXParserClass();
        StAXParser stAXParser = new StAXParser();
        Set<SubscriptionSale> sales = new HashSet<>();

        switch (operation) {
            case "dom" -> {
                System.out.println("dom");
                parser.buildSales(fileName);
                sales = parser.getSales();
            }
            case "sax" -> {
                System.out.println("sax");
                parserClass.buildSales(fileName);
                sales = parserClass.getSales();
            }
            case "stax" -> {
                System.out.println("stax");
                stAXParser.buildSales(fileName);
                sales = stAXParser.getSales();
            }
        }
        return sales;
    }
}
