package by.yahimovich.task4ooprepository.specification;

import java.util.HashSet;
import java.util.Set;

/**
 * AndSpecification.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */

public class AndSpecification<T> extends AbstractSpecification<T> {

    private final Set<Specification<T>> set = new HashSet<>();

    public AndSpecification(Specification<T> a, Specification<T> b) {
        set.add(a);
        set.add(b);
    }

    public boolean isSatisfiedBy(T type) {
        for (Specification<T> specification : set) {
            if (!specification.isSatisfiedBy(type)) {
                return false;
            }
        }
        return true;
    }
}