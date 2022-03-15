package by.yahimovich.task06pattern;

import by.yahimovich.task06pattern.entity.exception.FileException;
import by.yahimovich.task06pattern.entity.exception.InvalidParsingException;
import by.yahimovich.task06pattern.entity.textunit.text.part.Text;
import by.yahimovich.task06pattern.service.Service;
import by.yahimovich.task06pattern.view.Manager;
import org.testng.annotations.DataProvider;

public class DataClass {

    Manager manager = new Manager();

    @DataProvider(name = "testInputFromFile")
    public Object[][] createFile() {
        return new Object[][]{
                {"input4.txt", ""},
                {"output1.txt", ""},
                {"output2.txt", ""},
                {"output3.txt", ""}
        };
    }

    @DataProvider(name = "parseText")
    public Object[][] loadText() {
        return new Object[][]{
                {new Text(), ""},
                {new Text(), ""},
                {new Text(), ""},
                {new Text(), ""}
        };
    }

    @DataProvider(name = "sortWordsInSentence")
    public Object[][] createTextForWordsSort() throws FileException, InvalidParsingException {
        String str = manager.loadText("input.txt");
        Text text = manager.parseTextStringToText();
        Text text1 = manager.parseTextStringToText();
        Text text2 = manager.parseTextStringToText();
        Text text3 = manager.parseTextStringToText();
        return new Object[][]{
                {text, new Service().sortWordsInSentence(text)},
                {text1, new Service().sortWordsInSentence(text1)},
                {text2, new Service().sortWordsInSentence(text2)},
                {text3, new Service().sortWordsInSentence(text3)}
        };
    }

    @DataProvider(name = "sortParagraphs")
    public Object[][] createTextForParagraphSort() throws FileException, InvalidParsingException {
        String str = manager.loadText("input.txt");
        Text text = manager.parseTextStringToText();
        Text text1 = manager.parseTextStringToText();
        Text text2 = manager.parseTextStringToText();
        Text text3 = manager.parseTextStringToText();
        return new Object[][]{
                {text, new Service().sortParagraphs(text)},
                {text1, new Service().sortParagraphs(text1)},
                {text2, new Service().sortParagraphs(text2)},
                {text3, new Service().sortParagraphs(text3)}
        };
    }
}
