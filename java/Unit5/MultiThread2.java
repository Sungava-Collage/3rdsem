public class MultiThread implements Runnable {
    public void run(){
        for(int i=65; i<90; i++) {
            System.out.println((char)i + " ");
        }
    }
}

class ThreadExample2 {
    public static void main(String args[]) {
        MultiThread obj = new MultiThread();
        Thread t = new Thread(obj); 
        t.start(); 
        for(int i=1; i<=20; i++) {
            System.out.println(i + " ");
        }
    }
}
