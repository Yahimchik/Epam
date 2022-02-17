package by.yahimovich.task06pattern.entity.textunit.code;

import by.yahimovich.task06pattern.entity.textunit.text.TextUnit;
import by.yahimovich.task06pattern.entity.textunit.text.TextUnitTypeEnum;

/**
 * code line
 *
 * @author Egor Yahimovich
 * @version 1.1
 */

public class CodeLine extends TextUnit {

    public static final String DIVIDER = "\n";
    public static final String DIVIDERS_PATTERN = DIVIDER;

    /**
     * code line
     */
    private final String codeLine;

    /**
     * code line getter
     *
     * @return code line
     */
    public String getCodeLine() {
        return codeLine;
    }

    /**
     * constructor
     *
     * @param value value of code line
     */
    public CodeLine(String value) {
        super(value, TextUnitTypeEnum.CODE_LINE);
        codeLine = value;
    }

    public String toString() {
        return codeLine;
    }

}
