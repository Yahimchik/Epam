package by.yahimovich.task4ooprepository.repository;

import by.yahimovich.task4ooprepository.entity.Pyramid;

import java.util.ArrayList;
import java.util.List;

public class ArrayPyramidRepository implements PyramidRepository {

    private final List<Pyramid> pyramids = new ArrayList<>();

    @Override
    public void save(Pyramid pyramid) {
        this.pyramids.add(pyramid);
    }

    @Override
    public List<Pyramid> getAll() {
        return this.pyramids; // TODO make a correct conclusion
    }

    @Override
    public Pyramid findByID(Pyramid pyramidID) {
        if (this.pyramids.get(pyramidID.getID()) == null) {
            System.out.println("lox");
        }
        return this.pyramids.get(pyramidID.getID());
    }
}
