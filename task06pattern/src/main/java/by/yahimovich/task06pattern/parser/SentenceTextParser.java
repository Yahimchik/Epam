package parser;

import model.text_unit.code.CodeBlock;
import model.text_unit.code.CodeLine;
import model.text_unit.text.TextUnit;
import model.text_unit.text.part.Paragraph;
import model.text_unit.text.part.Sentence;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.exception.InvalidParsingException;

/**
 * sentence text parser
 *
 * @author Grishkin Andrei
 * @version 1.1
 */
public class SentenceTextParser {

    /**
     * next splitter
     */
    private final WordTextParser nextSplitter;

    public SentenceTextParser() {
        nextSplitter = new WordTextParser();
    }

    public ArrayList<TextUnit> split(ArrayList<TextUnit> textUnits) throws InvalidParsingException {
        ArrayList<TextUnit> result = new ArrayList<>();
        for (TextUnit textUnit : textUnits) {
            if (textUnit.getClass() == CodeBlock.class) {
                String[] lines = textUnit.getValue().split(CodeLine.DIVIDER);
                CodeLine currentLine = null;
                CodeBlock codeBlock = new CodeBlock(textUnit.getValue());
                for (String line : lines) {
                    line = trim(line);
                    if (line.length() > 0) {
                        currentLine = new CodeLine((line));
                        codeBlock.addCodeLine(currentLine);
                    }
                }
                result.add(codeBlock);
            } else if (textUnit.getClass() == Paragraph.class) {
                Sentence sentence;
                Matcher matcher = Pattern.compile(Sentence.SPLITTING_REGEX).matcher(textUnit.getValue());
                result.add(textUnit);
                while (matcher.find()) {
                    sentence = new Sentence(trim(matcher.group()));
                    result.add(sentence);
                }
            }
        }
        
        ArrayList<TextUnit> splited;

        
        splited = nextSplitter.split(result);

        return splited;
    }

    /**
     * replace tabs
     * @param text text
     * @return replaced text
     */
    protected String trim(String text) {
        text = text.trim();
        text = text.replaceAll("[\t]", "");
        return text;
    }

    @Override
    public String toString() {
        return "Splitting into sentences and code lines";
    }
}
