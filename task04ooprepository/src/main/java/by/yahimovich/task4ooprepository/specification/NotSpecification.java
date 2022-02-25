package by.yahimovich.task4ooprepository.specification;

/**
 * NotSpecification.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */

public class NotSpecification<T> extends AbstractSpecification<T> {

    private final Specification<T> specification;

    public NotSpecification(Specification<T> specification) {
        this.specification = specification;
    }


    @Override
    public boolean isSatisfiedBy(T type) {
        return !specification.isSatisfiedBy(type);
    }
}
