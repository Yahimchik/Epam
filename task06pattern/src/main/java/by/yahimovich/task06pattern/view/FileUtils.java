package by.yahimovich.task06pattern.view;

import by.yahimovich.task06pattern.entity.Paragraph;
import by.yahimovich.task06pattern.entity.Sentence;
import by.yahimovich.task06pattern.entity.Text;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


public class FileUtils {

    private static final Logger LOGGER = LogManager.getLogger(FileUtils.class);


    public static List<String> getFileRows(final String filePath) {
        File file = new File(filePath);

        List<String> allLines = new ArrayList<>();

        try {
            allLines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            LOGGER.info(e);
        }
        return allLines;
    }

    public static void restoreTextInFile(final String filePath, Text text) {
        File file = new File(filePath);

        try {
            for (Paragraph paragraph : text) {
                for (Sentence sentence : paragraph) {
                    for (int i = 0; i < sentence.getSize(); ++i) {
                        Files.write(file.toPath(), sentence.getPart(i).toString().getBytes(), StandardOpenOption.APPEND);
                    }
                }
                Files.write(file.toPath(), System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
        }
    }
}
