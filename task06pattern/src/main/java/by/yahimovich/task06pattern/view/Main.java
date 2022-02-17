package view;

import controller.Controller;
import model.exception.FileException;
import model.exception.InvalidParsingException;
import model.text_unit.text.part.Text;


/**
 * Main class which run controller's demonstrate method
 *
 * @author Grishkin Andrei
 * @version 1.1
 */
public class Main {



    /**
     * main method
     * @param args argument lines
     */
    public static void main(String[] args) {
        Controller controller = new Controller();
        try {

            String result = controller.loadText("input.txt");
            System.out.println();
            System.out.println(result);
            System.out.println();

            System.out.println();


            Text text = controller.parseTextStringToText();
            System.out.println(text.toString());


        } catch (FileException | InvalidParsingException | ArrayIndexOutOfBoundsException ex) {

            System.out.println();
            ex.printStackTrace();
        }
    }
}
