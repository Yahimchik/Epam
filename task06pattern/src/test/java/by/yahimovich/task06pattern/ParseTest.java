package by.yahimovich.task06pattern;

import by.yahimovich.task06pattern.entity.textunit.text.part.Text;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class ParseTest extends DataClass {

    @Test(dataProvider = "parseText")
    public void test(Text text,String str) {
        assertThrows(NullPointerException.class,
                () -> manager.parseTextStringToText());
    }

}
