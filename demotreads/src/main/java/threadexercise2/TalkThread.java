package threadexercise2;

public class TalkThread implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 777; ++i) {
                System.out.println("Talk -> " + i);
            }
        } finally {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
