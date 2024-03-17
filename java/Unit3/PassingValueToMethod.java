public class PassingValueToMethod {
  
    static class X {
    
        void sum(int a, int b) {
            a = a + 5;
            b = b + 3;
            System.out.println("Inside the method: a = " + a + " and b = " + b);
        }
        
    }

    public static void main(String args[]) {
        int m = 10, n = 20;
        X obj = new X();
        System.out.println("Before function call: m = " + m + " and n = " + n);
        obj.sum(m, n);
        System.out.println("After function call: m = " + m + " and n = " + n);
    }
}
