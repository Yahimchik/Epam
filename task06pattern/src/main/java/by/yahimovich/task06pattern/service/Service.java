package by.yahimovich.task06pattern.service;

import by.yahimovich.task06pattern.entity.textunit.text.part.Paragraph;
import by.yahimovich.task06pattern.entity.textunit.text.part.Sentence;
import by.yahimovich.task06pattern.entity.textunit.text.part.Text;
import by.yahimovich.task06pattern.entity.textunit.text.part.Word;

import java.util.List;

public class Service {

    public void sortWordsInSentence(Text text) {
        List<Sentence> sentences = text.getSentences();
        for (Sentence sentence : sentences) {
            List<Word> words = sentence.getWords();
            for (int j = 0; j < words.size(); ++j) {
                for (int k = j + 1; k < words.size(); ++k) {
                    sort(words, j, k);
                }
            }
            System.out.print(words);
            System.out.println();
        }
    }

    private void sort(List<Word> words, int i, int j) {
        if (words.get(i).toString().length() > words.get(j).toString().length()) {
            Word tmp = words.get(i);
            words.set(i, words.get(j));
            words.set(j, tmp);
        }
    }

    public void sortParagraphs(Text text) {
        List<Paragraph> paragraphs = text.getParagraphs();

        for(int i = 0; i < paragraphs.size(); ++i){
            List<Sentence> sentences = text.getSentences();
            for(int j = 0; j < sentences.size(); ++j){

            }
        }
    }
}
