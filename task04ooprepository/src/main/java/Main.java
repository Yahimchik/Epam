import by.yahimovich.task4ooprepository.entity.Point3DClass;
import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.PyramidID;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;
import by.yahimovich.task4ooprepository.entity.pyramidfactory.CreatePyramid;
import by.yahimovich.task4ooprepository.repository.ArrayPyramidRepository;
import by.yahimovich.task4ooprepository.specification.Specification;
import by.yahimovich.task4ooprepository.specification.find.FindByIDSpecification;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws PyramidException {

        List<Point3DClass> points = new ArrayList<>();
        points.add(new Point3DClass(0, 0, 0));
        points.add(new Point3DClass(3, 0, 0));
        points.add(new Point3DClass(0, 4, 0));
        points.add(new Point3DClass(2, 3, 3));

        new ArrayPyramidRepository().save(new CreatePyramid().create());

        List<Point3DClass> p = new ArrayList<>();
        p.add(new Point3DClass(1, 1, 0));
        p.add(new Point3DClass(1, 1, 0));
        p.add(new Point3DClass(1, 1, 0));
        p.add(new Point3DClass(1, 1, 0));

        List<Pyramid> pyramids = new ArrayList<>();
        pyramids.add(new Pyramid(new PyramidID(2), points));
        pyramids.add(new Pyramid(new PyramidID(1), points));
        pyramids.add(new Pyramid(new PyramidID(4), points));
        pyramids.add(new Pyramid(new PyramidID(3), points));
        pyramids.add(new Pyramid(new PyramidID(5), p));

        FindByIDSpecification specification = new FindByIDSpecification(new PyramidID(6));
        print(pyramids, specification);

    }

    static <T> void print(List<T> set, Specification<T> specification) {
        for (T t : set) {
            if (specification.isSatisfiedBy(t)) {
                System.out.println(t);
            }
        }
    }
}
