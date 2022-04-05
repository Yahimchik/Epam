package by.yahimovich.task07.controller;

import by.yahimovich.task07.builder.Parser;
import by.yahimovich.task07.entity.SubscriptionSale;
import by.yahimovich.task07.parser.dom.DOMParser;
import by.yahimovich.task07.parser.sax.SAXParserClass;
import by.yahimovich.task07.parser.stax.StAXParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@WebServlet(urlPatterns = "/file-servlet")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024,
        maxFileSize = 1024 * 1024 * 5,
        maxRequestSize = 1024 * 1024 * 5 * 5)
public class UploadFileServlet extends HttpServlet {

    private static final Logger LOGGER = LoggerFactory.getLogger(UploadFileServlet.class);
    private static final String UPLOAD_DIRECTORY = "upload";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String uploadPath = getServletContext()
                .getRealPath("") + File.separator
                + UPLOAD_DIRECTORY;
        System.out.println(uploadPath);
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        String fileName = "";

        for (Part part : request.getParts()) {
            if (!"default.file".equals(getFileName(part))) {
                fileName = getFileName(part);
                part.write(uploadPath + File.separator + fileName);
                request.setAttribute("sales", processRequest(request, fileName));
            }
        }

        getServletContext().getRequestDispatcher("/sales.jsp").forward(request, resp);
    }

    private Set<SubscriptionSale> processRequest(HttpServletRequest request, String fileName) {
        String operation = request.getParameter("parser");
        Set<SubscriptionSale> sales = new HashSet<>();

        switch (operation) {
            case "dom" -> {
                LOGGER.info("DOMParser selected");
                sales = Parser.createSubscriptionSale(new DOMParser(), fileName);
            }
            case "sax" -> {
                LOGGER.info("SAXParser selected");
                sales = Parser.createSubscriptionSale(new SAXParserClass(), fileName);
            }
            case "stax" -> {
                LOGGER.info("StAXParser selected");
                sales = Parser.createSubscriptionSale(new StAXParser(), fileName);
            }
        }
        return sales;
    }

    private String getFileName(final Part part) {
        for (String content : part
                .getHeader("content-disposition")
                .split(";")) {
            if (content.trim().startsWith("filename")) {
                return content
                        .substring(content.indexOf("=") + 2,
                                content.length() - 1);
            }
        }
        return "default.file";
    }
}
