public class Prac_9 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new CounterThread(counter);
        Thread thread2 = new CounterThread(counter);

        thread1.start();
        thread2.start();
    }
}

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count += 5;
    }

    public synchronized void printCount() {
        System.out.print(count + " ");
    }
}

class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (counter) {
                counter.increment();
                counter.printCount();
            }
        }
    }
}