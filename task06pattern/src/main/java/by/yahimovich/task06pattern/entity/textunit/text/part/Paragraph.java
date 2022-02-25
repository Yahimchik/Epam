package by.yahimovich.task06pattern.entity.textunit.text.part;

import by.yahimovich.task06pattern.entity.textunit.text.TextUnit;
import by.yahimovich.task06pattern.entity.textunit.text.TextUnitTypeEnum;

import java.util.ArrayList;


/**
 * Paragraph
 *
 * @author Egor Yahimovich
 * @version 1.1
 */

public class Paragraph extends TextUnit {

    public static final String PARAGRAPH_NAME = "PARAGRAPH";
    public static final String DIVIDER = "\n";
    public static final String DIVIDER_PATTERN = DIVIDER;

    /**
     * constructor
     *
     * @param text text value
     */

    public Paragraph(String text) {
        super(text, TextUnitTypeEnum.PARAGRAPH);
    }

    @Override
    public String toString() {
        return getValue() + " " + "\n";
    }

}
