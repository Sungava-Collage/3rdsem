public class ThredDeadlovk {
    String str1 = "java";
    String str2 = "Python";
    Thread t1 = new Thread("My Thre")
    {
        public void run ()
        {
            while (true) {
                synchronized(atr1)
                {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        
                    }
                }
                
            }
        }
    }
}
