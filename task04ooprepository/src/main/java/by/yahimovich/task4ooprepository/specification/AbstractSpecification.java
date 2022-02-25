package by.yahimovich.task4ooprepository.specification;

/**
 * Abstract Specification.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */

public abstract class AbstractSpecification<T> implements Specification<T> {

    public abstract boolean isSatisfiedBy(T type);

    /**
     * Method or.
     * Allows you to add search term.
     * Example: o1 or o2.
     */

    public AbstractSpecification<T> or(Specification<T> specification) {
        return new OrSpecification<T>(this, specification);
    }

    /**
     * Method and.
     * Allows you to add search term.
     * Example: o1 and o2.
     */

    public AbstractSpecification<T> and(Specification<T> specification) {
        return new AndSpecification<>(this, specification);
    }

    /**
     * Method not.
     * Allows you to add search term.
     */

    public AbstractSpecification<T> not() {
        return new NotSpecification<>(this);
    }
}
