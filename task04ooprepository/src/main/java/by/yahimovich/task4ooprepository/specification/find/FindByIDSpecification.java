package by.yahimovich.task4ooprepository.specification.find;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.PyramidID;
import by.yahimovich.task4ooprepository.specification.AbstractSpecification;

public class FindByIDSpecification extends AbstractSpecification<Pyramid> {

    private final PyramidID pyramidID;

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


