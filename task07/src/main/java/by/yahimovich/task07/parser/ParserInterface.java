package by.yahimovich.task07.parser;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;

public interface ParserInterface {

    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");

    default URI getFileFromResource(final String fileName) throws URISyntaxException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource != null) {
            return resource.toURI();
        } else {
            throw new URISyntaxException(fileName, ": couldn't be parsed.");
        }
    }
}
