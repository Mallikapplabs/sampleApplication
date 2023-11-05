package Threads;

class Runner1 implements Runnable {

    @Override
    public void run() {
        Integer i = 0;
        for ( i=0; i<10; i++ ){
            System.out.println("Runner -1 The interator value is " + i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class Runner2 implements Runnable {

    @Override
    public void run() {
        Integer i = 0;
        for ( i=0; i<10; i++ ){
            System.out.println("Runner - 2 : The interator value is " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class AppThread {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Runner1());
        Thread t2 = new Thread(new Runner2());
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
