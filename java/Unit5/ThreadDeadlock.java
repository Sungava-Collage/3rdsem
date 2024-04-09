public class ThreadDeadlock {
    String str1 = "java";
    String str2 = "Python";

    Thread t1 = new Thread("My Thread 1") {
        public void run() {
            while (true) {
                synchronized (str1) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                    synchronized (str2) {
                        System.out.println(str1 + str2);
                    }
                }
            }
        }
    };

    Thread t2 = new Thread("My Thread 2") {
        public void run() {
            while (true) {
                synchronized (str2) {
                    synchronized (str1) {
                        System.out.println(str2 + str1);
                    }
                }
            }
        }
    };

    public static void main(String[] args) {
        ThreadDeadlock td = new ThreadDeadlock();
        td.t1.start();
        td.t2.start();
    }
}
