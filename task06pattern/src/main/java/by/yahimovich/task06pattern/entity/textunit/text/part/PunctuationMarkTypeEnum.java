package by.yahimovich.task06pattern.entity.textunit.text.part;

/**
 * types of punctuation marks
 *
 * @author Egor Yahimovich
 * @version 1.1
 */

public enum PunctuationMarkTypeEnum {

    DOT("."),
    COMMA(","),
    EXCLAMATION("!"),
    QUESTION("?"),
    COLON(":"),
    SEMICOLON(";"),
    SINGLE_QUOTES("'"),
    QUOTES("\"");

    private final String text;

    PunctuationMarkTypeEnum(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
