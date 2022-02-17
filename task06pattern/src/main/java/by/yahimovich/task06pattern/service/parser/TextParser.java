package by.yahimovich.task06pattern.service.parser;

import by.yahimovich.task06pattern.entity.exception.InvalidParsingException;
import by.yahimovich.task06pattern.entity.textunit.text.TextUnit;
import by.yahimovich.task06pattern.entity.textunit.text.part.Text;

import java.util.ArrayList;

/**
 * paragraph text splitter parser
 *
 * @author Egor Yahimovich
 * @version 1.1
 */

public class TextParser {

    /**
     * next splitter
     */
    private final ParagraphTextParser nextSplitter;


    public TextParser() {
        nextSplitter = new ParagraphTextParser();
    }

    /**
     * split text codeBlock and paragraph
     *
     * @param textString text
     * @return return Text object
     */

    public Text splitText(String textString) throws InvalidParsingException {
        Text text = new Text();
        ArrayList<TextUnit> result;

        result = nextSplitter.split(trim(textString));

        text.setText(result);
        return text;
    }

    /**
     * replace tabs
     *
     * @param text text
     * @return replaced text
     */

    protected String trim(String text) {
        text = text.trim();
        text = text.replaceAll("[\t ]+", " ");
        return text;
    }

}
