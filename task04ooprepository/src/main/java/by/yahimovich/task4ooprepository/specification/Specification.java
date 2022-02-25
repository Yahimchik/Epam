package by.yahimovich.task4ooprepository.specification;

/**
 * Specification interface.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */

public interface Specification<T> {

    boolean isSatisfiedBy(T type);
}
