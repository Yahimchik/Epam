package by.yahimovich.task06pattern.controller;

import by.yahimovich.task06pattern.entity.Text;
import by.yahimovich.task06pattern.service.parsers.TextParser;
import by.yahimovich.task06pattern.view.FileUtils;

import java.util.List;

public class ParserRunner {

    public final static String INITIAL_FILE_PATH = "example.txt";
    public final static String RESTORED_FILE_PATH = "output.txt";

    public static void main(String[] args) {
        List<String> list = FileUtils.getFileRows(INITIAL_FILE_PATH);
        Text text = new TextParser(list).parseRows();
        FileUtils.restoreTextInFile(RESTORED_FILE_PATH, text);
    }
}
