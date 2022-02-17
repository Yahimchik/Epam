package by.yahimovich.task06pattern.entity.textunit.text.part;

import by.yahimovich.task06pattern.entity.textunit.text.TextUnit;
import by.yahimovich.task06pattern.entity.textunit.text.TextUnitTypeEnum;

/**
 * Word
 *
 * @author Egor Yahimovich
 * @version 1.1
 */

public class Word extends TextUnit {

    public static final String WORD_NAME = "WORD";
    public static final String DIVIDER = ",:;'\"";
    public static final String PATTERN = "[^ " + Paragraph.DIVIDER + Sentence.DIVIDER + DIVIDER + "]+";

    /**
     * word value getter
     *
     * @return word
     */

    public String getText() {
        return text;
    }

    /**
     * word value
     */

    private final String text;

    /**
     * constructor
     *
     * @param text word value
     */

    public Word(String text) {
        super(text, TextUnitTypeEnum.WORD);
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

}
