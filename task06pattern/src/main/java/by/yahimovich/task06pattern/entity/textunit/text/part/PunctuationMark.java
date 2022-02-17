package by.yahimovich.task06pattern.entity.textunit.text.part;

import by.yahimovich.task06pattern.entity.textunit.text.TextUnit;
import by.yahimovich.task06pattern.entity.textunit.text.TextUnitTypeEnum;

/**
 * punctuation mark
 *
 * @author Egor Yahimovich
 * @version 1.1
 */

public class PunctuationMark extends TextUnit {

    public static final String PUNCTUATION_MARK_NAME = "PUNCTUATION MARK";
    public static final String PATTERN = "([" + Sentence.DIVIDER + "]|[" + Word.DIVIDER + "])";
    private final PunctuationMarkTypeEnum punctuationMarkType;


    /**
     * constructor
     *
     * @param type type of punctuation mark
     */

    public PunctuationMark(PunctuationMarkTypeEnum type) {
        super(type.toString(), TextUnitTypeEnum.PUNCTUATION_MARK);
        punctuationMarkType = type;
    }

    @Override
    public String toString() {
        return punctuationMarkType.toString();
    }

}
