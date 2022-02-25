package by.yahimovich.task4ooprepository.singleton;

import by.yahimovich.task4ooprepository.repository.ArrayPyramidRepository;

/**
 * Comparator ID class.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see ArrayPyramidRepository
 */

public class SingletonRepository {

    private static SingletonRepository instance;
    public ArrayPyramidRepository repository;

    /**
     * Constructor - creates new object.
     * A generating pattern that guarantees the
     * existence of only one object of a certain
     * class, and also allows you to reach this
     * object from anywhere in the program.
     *
     * @param repository create a single repository
     *                   instance.
     */

    public SingletonRepository(ArrayPyramidRepository repository) {
        this.repository = repository;
    }

    /**
     * Method getInstance.
     *
     * @return instance value.
     */

    public static SingletonRepository getInstance(ArrayPyramidRepository repository) {
        if (instance == null) {
            instance = new SingletonRepository(repository);
        }
        return instance;
    }
}
