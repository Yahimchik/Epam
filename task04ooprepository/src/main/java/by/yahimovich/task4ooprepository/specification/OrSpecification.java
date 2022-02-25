package by.yahimovich.task4ooprepository.specification;

import java.util.HashSet;
import java.util.Set;

/**
 * OrSpecification.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */

public class OrSpecification<T> extends AbstractSpecification<T> {

    private final Set<Specification<T>> set = new HashSet<>();

    public OrSpecification(Specification<T> a, Specification<T> b) {
        set.add(a);
        set.add(b);
    }

    public boolean isSatisfiedBy(T type) {
        for (Specification<T> s : set) {
            if (s.isSatisfiedBy(type)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public AbstractSpecification<T> or(Specification<T> specification) {
        set.add(specification);
        return this;
    }
}
