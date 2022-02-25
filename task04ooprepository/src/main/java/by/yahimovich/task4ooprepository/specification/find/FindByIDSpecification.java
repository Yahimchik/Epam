package by.yahimovich.task4ooprepository.specification.find;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.PyramidID;
import by.yahimovich.task4ooprepository.specification.AbstractSpecification;

/**
 * Find by ID specification class.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Pyramid
 * @see PyramidID
 * @see AbstractSpecification
 */

public class FindByIDSpecification extends AbstractSpecification<Pyramid> {

    private final PyramidID pyramidID;

    /**
     * Constructor - create new object.
     *
     * @param pyramidID pyramid ID.
     */

    public FindByIDSpecification(PyramidID pyramidID) {
        this.pyramidID = pyramidID;
    }

    @Override
    public boolean isSatisfiedBy(Pyramid type) {
        if (type.getID() == pyramidID.getID()) {
            return true;
        } else {
            System.out.println(0);
            return false;
        }
    }
}


