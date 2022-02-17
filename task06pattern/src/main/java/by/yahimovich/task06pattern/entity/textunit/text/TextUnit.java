package by.yahimovich.task06pattern.entity.textunit.text;

/**
 * abstract text unit class
 *
 * @author Egor Yahimovich
 * @version 1.1
 */

public abstract class TextUnit {

    /**
     * type
     */

    protected TextUnitTypeEnum type;

    /**
     * value getter
     *
     * @return string value
     */

    public String getValue() {
        return value;
    }

    /**
     * value
     */

    protected String value;

    public TextUnitTypeEnum getType() {
        return type;
    }

    /**
     * constructor
     *
     * @param value value of text unit
     * @param type  type of text unit
     */

    protected TextUnit(String value, TextUnitTypeEnum type) {
        if (type == null) {
            throw new IllegalArgumentException("Illegal argument type");
        }
        this.type = type;
        this.value = value;
    }
}