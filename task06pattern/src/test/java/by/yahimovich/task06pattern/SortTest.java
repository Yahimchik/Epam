package by.yahimovich.task06pattern;

import by.yahimovich.task06pattern.entity.textunit.text.part.Paragraph;
import by.yahimovich.task06pattern.entity.textunit.text.part.Text;
import by.yahimovich.task06pattern.entity.textunit.text.part.Word;
import by.yahimovich.task06pattern.service.Service;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class SortTest extends DataClass {

    @Test(dataProvider = "sortWordsInSentence")
    public void test(Text text, List<Word> words) {
        assertEquals(new Service().sortWordsInSentence(text), words);
    }

    @Test(dataProvider = "sortParagraphs")
    public void test(Text text, Map<Paragraph, Integer> answer) {
        assertEquals(new Service().sortParagraphs(text), answer);
    }
}
