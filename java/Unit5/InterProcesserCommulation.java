class Customer
{
    int amount = 1000;
    synchronized void withdraw(int amount)
    {
        System.out.println("going to Withdraw...");
        if (this.amount < amount)
        {
            System.out.println("Less balance ; waiting for deposit...");
            try
            {
                wait();
            } catch (Exception e)
            {
                // Kashi Don
            }
        }
        this.amount = this.amount-amount;
        System.out.println("Withdrawn Successfully : " + amount);
    }
    synchronized void deposite(int amount)
    {
        System.out.println("gonig to deposit...");
        this.amount=this.amount+amount;
        System.out.println("Deposited Amount: "+amount);
        notify();
    }
}
    public class InterProcesserCommulation
    {
    
        public static void main(String[] args) 
        {
            final Customer c = new Customer();
            new Thread()
            {
                public void run()
                {
                    c.withdraw(15000);
                }

            }.start();
            
            new Thread()
            {
                public void run()
                {
                    c.deposite(20000);
                }
            }.start();
        }
    }
