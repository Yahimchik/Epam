package by.yahimovich.task4ooprepository.entity;

public class PyramidID {

    private static int id = 1;
    private int ID = id++;

    public PyramidID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
