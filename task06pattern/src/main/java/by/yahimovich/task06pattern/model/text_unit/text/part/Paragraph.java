package model.text_unit.text.part;

import model.text_unit.text.TextUnit;
import model.text_unit.text.TextUnitTypeEnum;

/**
 * Paragraph
 *
 * @author Grishkin Andrei
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
        return " ";
    }

}
