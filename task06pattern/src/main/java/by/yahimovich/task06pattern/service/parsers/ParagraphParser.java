package by.yahimovich.task06pattern.service.parsers;

import by.yahimovich.task06pattern.entity.*;

import java.util.ArrayList;
import java.util.List;

public class ParagraphParser {

    public ParagraphParser() {
    }

    public Paragraph parseTitle(String row) {
        List<SimplePart> simplePartList = parseToSimpleParts(row);
        Sentence sentence = new Sentence(simplePartList);
        List<Sentence> list = new ArrayList<>();
        list.add(sentence);
        return new ParagraphTitle(list);
    }

    public Paragraph parseSentences(String row) {
        List<Sentence> list = new ArrayList<>();
        String[] splitSentences = row.split("\\.");
        for (String sentence : splitSentences) {
            if (!sentence.endsWith(":")) {
                sentence = sentence.concat(".");
            }
            List<SimplePart> simplePartList = parseToSimpleParts(row);
            list.add(new Sentence(simplePartList));
        }
        return new ParagraphText(list);
    }

    public Paragraph parseCode(String row) {
        List<SimplePart> simplePartList = parseToSimpleParts(row);
        Sentence sentence = new Sentence(simplePartList);
        List<Sentence> list = new ArrayList<>();
        list.add(sentence);
        return new ParagraphCode(list);
    }

    public List<SimplePart> parseToSimpleParts(String row) {
        List<SimplePart> simplePartList = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();

        for (char character : row.toCharArray()) {
            if (Character.isLetter(character)) {
                stringBuilder.append(character);
            } else {
                if (stringBuilder.length() != 0) {
                    simplePartList.add(new Word(stringBuilder.toString()));
                    stringBuilder = new StringBuilder();
                }
                if (Character.isWhitespace(character)) {
                    simplePartList.add(new Space(String.valueOf(character)));
                } else {
                    simplePartList.add(new Punctuation(String.valueOf(character)));
                }
            }
        }
        if (stringBuilder.length() != 0) {
            simplePartList.add(new Word(stringBuilder.toString()));
            stringBuilder = new StringBuilder();
        }
        return simplePartList;
    }
}
