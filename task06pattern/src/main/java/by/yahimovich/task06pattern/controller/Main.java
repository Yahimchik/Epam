package by.yahimovich.task06pattern.controller;

import by.yahimovich.task06pattern.entity.exception.FileException;
import by.yahimovich.task06pattern.entity.exception.InvalidParsingException;
import by.yahimovich.task06pattern.entity.textunit.text.part.Text;
import by.yahimovich.task06pattern.service.Service;
import by.yahimovich.task06pattern.view.Manager;

/**
 * Main class which run manager's demonstrate method
 *
 * @author Egor Yahimovich
 * @version 1.1
 */

public class Main {

    /**
     * main method
     *
     * @param args argument lines
     */

    public static void main(String[] args) {
        Manager manager = new Manager();
        try {
            String result = manager.loadText("input.txt");
            System.out.println();
            System.out.println(result);
            System.out.println();

            System.out.println();


            Text text = manager.parseTextStringToText();

            new Service().sortWordsInSentence(text);
            System.out.println(text);
            System.out.println();


        } catch (FileException | InvalidParsingException | ArrayIndexOutOfBoundsException ex) {
            System.out.println();
            ex.printStackTrace();
        }
    }
}
