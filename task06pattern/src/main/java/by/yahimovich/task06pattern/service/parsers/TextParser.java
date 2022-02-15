package by.yahimovich.task06pattern.service.parsers;

import by.yahimovich.task06pattern.entity.Text;

import java.util.List;
import java.util.regex.Pattern;

public class TextParser {

    private static final String REGEX_TITLES = "[\\s+]?[0-9].+|";
    private static final String REGEX_SENTENCES = "[\\s+]?(.|:)";

    private List<String> rows;

    public TextParser(List<String> rows) {
        this.rows = rows;
    }

    public Text parseRows() {
        Text text = new Text();
        ParagraphParser parser = new ParagraphParser();

        for (String row : rows) {
            if (Pattern.matches(REGEX_TITLES, row)) {
                text.addParagraph(parser.parseTitle(row));
            } else {
                if (Pattern.matches(REGEX_SENTENCES, row)) {
                    text.addParagraph(parser.parseSentences(row));
                } else {
                    text.addParagraph(parser.parseCode(row));
                }
            }
        }
        return text;
    }
}
