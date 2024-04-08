class EvenThread extends Thread
{
    public void run()
    {
        for(int i = 100; i <= 200; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        }
    }
}
class oddThread extends Thread
{
    public void run()
    {
        for(int i = 100; i <= 200; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        }
    }
}
public class Evenoddthread {

    public static void main(String[] args) {
        EvenThread et = new EvenThread();r
        oddThread ot = new oddThread();
        et.setName("Even Thread");
        ot.setName("Odd Thread");
        et.start();
        ot.start();
    }
}