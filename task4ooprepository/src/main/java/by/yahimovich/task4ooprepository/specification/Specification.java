package by.yahimovich.task4ooprepository.specification;

public interface Specification<T> {

    boolean isSatisfiedBy(T type);
}
