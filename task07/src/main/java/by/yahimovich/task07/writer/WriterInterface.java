package by.yahimovich.task07.writer;

import by.yahimovich.task07.entity.Entity;

import java.util.List;

public interface WriterInterface {

    void xmlWriter(String path, List<Entity> entityList);
}
