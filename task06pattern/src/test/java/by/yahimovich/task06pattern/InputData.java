package by.yahimovich.task06pattern;

import by.yahimovich.task06pattern.entity.exception.FileException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;


public class InputData extends DataClass {

    @Test(dataProvider = "testInputFromFile")
    public void test(String fileName, String str) {
        assertThrows(FileException.class,
                () -> manager.loadText(fileName));
    }
}
