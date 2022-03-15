package by.yahimovich.task07.parser;

import by.yahimovich.task07.parser.exception.ParserException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public interface ParserInterface {

    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");

    Object parse(String fileName) throws ParseException, ParserException;
}
