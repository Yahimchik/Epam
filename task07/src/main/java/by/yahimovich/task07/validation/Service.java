package by.yahimovich.task07.validation;

import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileInputStream;
import java.io.InputStream;

public class Service {

    public static void verifyValidatesInternalXsd(String filename) throws Exception {
        InputStream xmlStream = new FileInputStream(filename);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);
        factory.setNamespaceAware(true);
        factory.setAttribute("http://by.yahimovich/task07/src/recources",
                "http://www.w3.org/2001/XMLSchema");
        DocumentBuilder builder = factory.newDocumentBuilder();
        builder.setErrorHandler(new RaiseOnErrorHandler());
        builder.parse(new InputSource(xmlStream));
        xmlStream.close();
    }

    public static class RaiseOnErrorHandler implements ErrorHandler {
        public void warning(SAXParseException e) throws SAXException {
            throw new RuntimeException(e);
        }

        public void error(SAXParseException e) throws SAXException {
            throw new RuntimeException(e);
        }

        public void fatalError(SAXParseException e) throws SAXException {
            throw new RuntimeException(e);
        }
    }

}
