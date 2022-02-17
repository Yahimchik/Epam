package by.yahimovich.task4ooprepository.specification;

public abstract class AbstractSpecification<T> implements Specification<T> {

    public abstract boolean isSatisfiedBy(T type);

    public AbstractSpecification<T> or(Specification<T> specification) {
        return new OrSpecification<T>(this, specification);
    }

    public AbstractSpecification<T> and(Specification<T> specification) {
        return new AndSpecification<>(this, specification);
    }

    public AbstractSpecification<T> not() {
        return new NotSpecification<>(this);
    }
}
