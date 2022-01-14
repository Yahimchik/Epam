package by.yahimovich.task4ooprepository.repository;

import by.yahimovich.task4ooprepository.entity.Pyramid;

import java.util.List;

public interface PyramidRepository {

    void save(Pyramid pyramid);

    List<Pyramid> getAll();

    Pyramid findByID(Pyramid pyramidID);

}
