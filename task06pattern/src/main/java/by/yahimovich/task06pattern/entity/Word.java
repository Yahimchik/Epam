package by.yahimovich.task06pattern.entity;

public class Word extends SimplePart implements Comparable<Word> {

    public Word(String item) {
        super(item);
    }

    @Override
    public boolean isWord() {
        return true;
    }

    @Override
    public boolean isSpace() {
        return false;
    }

    @Override
    public boolean isPunctuation() {
        return false;
    }

    @Override
    public int compareTo(Word object) {
        return getItem().compareToIgnoreCase(object.getItem());
    }
}
