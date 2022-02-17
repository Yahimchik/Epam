package by.yahimovich.task06pattern.view;

import by.yahimovich.task06pattern.entity.exception.FileException;
import by.yahimovich.task06pattern.entity.exception.InvalidParsingException;
import by.yahimovich.task06pattern.entity.textunit.text.part.Text;
import by.yahimovich.task06pattern.entity.textunit.text.part.Word;
import by.yahimovich.task06pattern.service.parser.TextParser;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

/**
 * word text splitter parser
 *
 * @author Egor Yahimovich
 * @version 1.1
 */

public class Manager {

    private String textString;

    public String getTextString() {
        return textString;
    }

    /**
     * load text
     *
     * @param path path to file
     * @return text string
     * @throws FileException if no file
     */

    public String loadText(String path) throws FileException {

        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            textString = new String(encoded, Charset.forName("windows-1251"));
        } catch (IOException e) {
            throw new FileException("invalidArgs", e);
        }

        return textString;
    }

    /**
     * parse text string to text object
     *
     * @return text object
     */

    public Text parseTextStringToText() throws InvalidParsingException {

        TextParser textParser = new TextParser();
        Text parsedText;
        parsedText = textParser.splitText(textString);

        return parsedText;
    }

    /**
     * sort words with started vowel by consonant in text
     *
     * @param text text object
     * @return sorted words
     */

    public List<Word> sortWords(Text text) {
        ArrayList<Word> words = text.getAllTextWords();

        return words.stream()
                .sorted((w1, w2) -> {
                    String w1OnlyConsonants = w1.getText().toLowerCase();
                    String w2OnlyConsonants = w2.getText().toLowerCase();
                    return w1OnlyConsonants.compareTo(w2OnlyConsonants);
                })
                .collect(Collectors.toList());
    }

    /**
     * print sorted words
     *
     * @param sorted sorted array of words
     * @param bundle ResourceBundle
     */

    public void printWords(List<Word> sorted, ResourceBundle bundle) {
        if (sorted.isEmpty()) {
            System.out.println(bundle.getString("SortWordsNotFound"));
        } else {
            String a = "1";
            for (Word word :
                    sorted) {
                if (word.toString().toLowerCase().charAt(0) != a.toLowerCase().charAt(0)) {
                    System.out.println("\t" + word.toString().toLowerCase());
                    a = word.toString();
                } else {
                    System.out.println(word.toString().toLowerCase());
                }
            }
        }
    }
}