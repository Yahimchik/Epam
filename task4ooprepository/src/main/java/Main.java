import by.yahimovich.task4ooprepository.entity.Point;
import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;
import by.yahimovich.task4ooprepository.entity.pyramidfactory.CreatePyramid;
import by.yahimovich.task4ooprepository.repository.ArrayPyramidRepository;
import by.yahimovich.task4ooprepository.service.PointService;
import by.yahimovich.task4ooprepository.service.PyramidService;
import by.yahimovich.task4ooprepository.view.dao.JsonDAO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, PyramidException {
        System.out.println(new Point(2, 3, 3));
        System.out.println(new Point(12, 3, 3).hashCode());

        System.out.println(new PointService().sideLength(new Point(3, 3, 3)));
        ArrayPyramidRepository repository = new ArrayPyramidRepository();

        Pyramid pyramid = new CreatePyramid().create();
        repository.save(pyramid);

        PyramidService service = new PyramidService();
        System.out.println(service.isPyramid(pyramid));
        List<Pyramid> pyramids = new ArrayList<>();
        List<Pyramid> list = new ArrayList<>();
        pyramids.add(new CreatePyramid().create());

        JsonDAO<Pyramid> jsonDAO = new JsonDAO<>(Pyramid.class);
        jsonDAO.write(pyramids, "ex.json");

    }
}
