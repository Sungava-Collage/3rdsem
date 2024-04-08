class MulticationTable
{
    void PrintTable(int n)
    {
        for  (int i = 1; i <=  10; ++i)
        {
            System.out.println(n+" * "+i+"= " + n*i);
        }
    }
}
class Implementation extends MulticationTable
{
    public static void main(String[] args)
    {
        int num = 5;
        Implementation obj = new Implementation();
        System.out.println("Multiplication Table of " + num);
        obj.PrintTable(num);
    }
}
