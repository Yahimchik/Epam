package by.yahimovich.task06pattern.service;

import by.yahimovich.task06pattern.entity.textunit.text.part.Paragraph;
import by.yahimovich.task06pattern.entity.textunit.text.part.Sentence;
import by.yahimovich.task06pattern.entity.textunit.text.part.Text;
import by.yahimovich.task06pattern.entity.textunit.text.part.Word;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {

    public void sortWordsInSentence(Text text) {
        List<Sentence> sentences = text.getSentences();
        List<Word> words;
        for (Sentence sentence : sentences) {
            words = sentence.getWords();
            for (int j = 0; j < words.size(); ++j) {
                for (int k = j + 1; k < words.size(); ++k) {
                    swap(words, j, k);
                }
            }
            words.forEach((k) -> System.out.print(k.getValue() + " "));
            System.out.println();
        }

    }

    private void swap(List<Word> words, int i, int j) {
        if (words.get(i).toString().length() > words.get(j).toString().length()) {
            Word tmp = words.get(i);
            words.set(i, words.get(j));
            words.set(j, tmp);
        }
    }

    public void sortParagraphs(Text text) {
        List<Paragraph> paragraphs = text.getParagraphs();
        Map<Paragraph, Integer> map = new HashMap<>();
        for (Paragraph paragraph : paragraphs) {
            String str = paragraph.getValue();
            int count = 0;
            for (int j = 0; j < str.length(); ++j) {
                if (str.charAt(j) == '.' || str.charAt(j) == '!' || str.charAt(j) == '?') {
                    count++;
                }
            }
            map.put(paragraph, count);
        }
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach((k) -> System.out.print(k.getKey()));
    }
}
