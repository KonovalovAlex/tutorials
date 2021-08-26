package tutorials.multithreading;

import java.util.concurrent.Callable;

public class VariableExample {
    public static void main(String[] args) {
        Tester tester = new Tester();
        Thread thread = new Thread(tester);
        Thread thread2 = new Thread(tester);
        thread.start();
        thread2.start();
    }
}

class Tester implements Runnable {
    private static final Integer k = 0;
    private Integer e = 1;
    @Override
    public void run() {
        test();
    }

    public void test() {
        for (int i = 1; i < 100000; i++) {
            e++;
        }
        System.out.println(e);
    }
}
