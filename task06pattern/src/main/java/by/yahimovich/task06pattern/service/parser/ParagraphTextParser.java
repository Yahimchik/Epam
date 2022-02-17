package by.yahimovich.task06pattern.service.parser;


import by.yahimovich.task06pattern.entity.exception.InvalidParsingException;
import by.yahimovich.task06pattern.entity.textunit.code.CodeBlock;
import by.yahimovich.task06pattern.entity.textunit.text.TextUnit;
import by.yahimovich.task06pattern.entity.textunit.text.part.Paragraph;

import java.util.ArrayList;

/**
 * paragraph text parser
 *
 * @author Egor Yahimovich
 * @version 1.1
 */
public class ParagraphTextParser {

    /**
     * next splitter
     */

    private final SentenceTextParser nextSplitter;

    ParagraphTextParser() {
        nextSplitter = new SentenceTextParser();
    }

    public ArrayList<TextUnit> split(String text) throws InvalidParsingException {
        ArrayList<TextUnit> result = new ArrayList<>();
        String[] split = text.split(CodeBlock.DIVIDER);
        for (int i = 0; i < split.length; i++) {
            if ((i & 1) == 1) {
                split[i] = trim(split[i]);
                if (split[i].length() > 0) {
                    result.add(new CodeBlock(split[i]));
                }
            } else {
                String[] paragraphs = split[i].split(Paragraph.DIVIDER_PATTERN);
                for (int j = 0; j < paragraphs.length; j++) {
                    paragraphs[j] = trim(paragraphs[j]);
                    if (paragraphs[j].length() > 0) {
                        result.add(new Paragraph(paragraphs[j]));
                    }
                }
            }
        }

        ArrayList<TextUnit> splited;

        splited = nextSplitter.split(result);

        return splited;
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

    @Override
    public String toString() {
        return "TextParser of paragraphs and code blocks";
    }
}
