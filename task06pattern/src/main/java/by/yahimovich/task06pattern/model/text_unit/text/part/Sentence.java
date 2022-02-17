package model.text_unit.text.part;

import model.text_unit.text.TextUnit;
import model.text_unit.text.TextUnitTypeEnum;

import java.util.ArrayList;

/**
 * Sentence
 *
 * @author Grishkin Andrei
 * @version 1.1
 */
public class Sentence extends TextUnit {

    public static final String SENTENCE_NAME = "SENTENCE";
    public static final String DIVIDER = "\\.!\\?";
    public static final String DELIM_FOR_COMBINING = " ";
    public static final String SPLITTING_REGEX = "[^" + DIVIDER + "]+([" + DIVIDER + "]+|\\z)";
    private final ArrayList<TextUnit> sentence;


    /**
     * constructor
     *
     * @param text text sentence value
     */
    public Sentence(String text) {
        super(text, TextUnitTypeEnum.SENTENCE);
        sentence = new ArrayList<>();
    }

    /**
     * add word to sentence
     *
     * @param word word
     */
    public void addWord(Word word) {
        sentence.add(word);
    }

    public ArrayList<Word> getWords() {
        ArrayList<Word> words = new ArrayList<>();
        for (TextUnit textUnit : sentence) {
            if (textUnit.getClass() == Word.class) {
                words.add((Word) textUnit);
            }
        }
        return words;
    }

    /**
     * add  punctuation mark
     *
     * @param punctuationMark punctuation mark
     */
    public void addPunctuationMark(PunctuationMark punctuationMark) {
        sentence.add(punctuationMark);
    }

    @Override
    public String toString() {
        StringBuilder textToString = new StringBuilder();
        for (TextUnit textUnit : sentence) {
            if (textUnit.getClass() != PunctuationMark.class && sentence.indexOf(textUnit) != 0) {
                textToString.append(DELIM_FOR_COMBINING);
            }
            textToString.append(textUnit);
        }
        textToString.append("\n");
        return textToString.toString();
    }
}
