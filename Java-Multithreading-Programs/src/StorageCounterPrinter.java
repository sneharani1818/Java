class Storage {
    private int value;

    public synchronized void setValue(int value) {
        this.value = value;
    }

    public synchronized int getValue() {
        return value;
    }
}

// Counter.java
class Counter implements Runnable {
    private Storage storage;
    private Thread thread;

    public Counter(Storage storage) {
        this.storage = storage;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            storage.setValue(count);
            count++;
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Printer.java
class Printer implements Runnable {
    private Storage storage;
    private Thread thread;

    public Printer(Storage storage) {
        this.storage = storage;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Value: " + storage.getValue());
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main.java
public class StorageCounterPrinter {
    public static void main(String[] args) {
        Storage storage = new Storage();
        new Counter(storage);
        new Printer(storage);
    }
}