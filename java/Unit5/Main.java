class MultiplicationTable {
    synchronized void printTable(int n) { // synchronized method to ensure thread safety
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread {
    MultiplicationTable t;

    public Thread1(MultiplicationTable obj) {
        this.t = obj;
    }

    public void run() {
        t.printTable(100);
    }
}

class Thread2 extends Thread {
    MultiplicationTable t;

    public Thread2(MultiplicationTable obj) {
        this.t = obj;
    }

    public void run() {
        t.printTable(200);
    }
}

public class Main {
    public static void main(String[] args) {
        MultiplicationTable obj = new MultiplicationTable();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }
}
