package by.yahimovich.task06pattern.entity;

import java.util.Iterator;
import java.util.List;

public class Paragraph implements Iterable<Sentence> {

    private final List<Sentence> sentences;

    public Paragraph(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public Sentence getSentence(int index) {
        return sentences.get(index);
    }

    @Override
    public Iterator<Sentence> iterator() {
        return sentences.iterator();
    }
}
