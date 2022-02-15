package by.yahimovich.task06pattern.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Text implements Iterable<Paragraph> {

    private final List<Paragraph> paragraphs = new ArrayList<>();

    public Text() {

    }

    public void addParagraph(Paragraph paragraph) {
        paragraphs.add(paragraph);
    }

    public Paragraph getParagraph(int index) {
        return paragraphs.get(index);
    }

    public List<Sentence> getAllSentences() {
        List<Sentence> list = new ArrayList<>();

        for (Paragraph paragraph : paragraphs) {
            for (Sentence sentence : paragraph) {
                list.add(sentence);
            }
        }
        return list;
    }

    public List<Word> getAllWords() {
        List<Word> list = new ArrayList<>();
        for (Paragraph paragraph : paragraphs) {
            for (Sentence sentence : paragraph) {
                for (SimplePart part : sentence) {
                    if (part.isWord()) {
                        list.add((Word) part);
                    }
                }
            }
        }
        return list;
    }

    @Override
    public Iterator<Paragraph> iterator() {
        return paragraphs.iterator();
    }
}
