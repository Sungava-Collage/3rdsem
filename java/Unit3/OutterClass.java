public class OutterClass {
    static class Innerclass
    {
        public void display()
        {
            System.out.println("Insids Nested class");
        }
    }
    public static void main(String args[])
    {
        OutterClass.Innerclass obj = new OutterClass.Innerclass();
        obj.display();
    }
}
