package by.yahimovich.task4ooprepository.singleton;

import by.yahimovich.task4ooprepository.repository.ArrayPyramidRepository;

public class SingletonRepository {

    private static SingletonRepository instance;
    public ArrayPyramidRepository repository;

    public SingletonRepository(ArrayPyramidRepository repository) {
        this.repository = repository;
    }

    public static SingletonRepository getInstance(ArrayPyramidRepository repository) {
        if (instance == null) {
            instance = new SingletonRepository(repository);
        }
        return instance;
    }


}
