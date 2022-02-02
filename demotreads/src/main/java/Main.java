import threadexercise1.WalkThread;
import threadexercise2.TalkThread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new WalkThread(), "Min");
        Thread thread1 = new Thread(new TalkThread(), "Max");

        thread.setPriority(Thread.MIN_PRIORITY);
        thread1.setPriority(Thread.MAX_PRIORITY);

        thread.start();
        thread1.start();
    }
}
