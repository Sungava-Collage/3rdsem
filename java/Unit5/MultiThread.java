public class MultiThread extends Thread {
    public void run(){
        for(int i=65; i<90; i++) {
            System.out.println((char)i + " ");
        }
    }
}

class ThreadExample {
    public static void main(String args[]) {
        MultiThread obj = new MultiThread();
        obj.start();
        for(int i=1; i<=20; i++) {
            System.out.println(i + " ");
        }
    }
}
