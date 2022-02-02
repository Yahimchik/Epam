package threadexercise1;

public class WalkThread extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 777; ++i) {
                System.out.println("Walk " + i);
            }
        } finally {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
