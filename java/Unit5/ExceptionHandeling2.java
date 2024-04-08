public class ExceptionHandeling2 {
    public static void main(String[] args) {
        try{
            int a[]={1,4,3,4};
            System.out.println(a[5]);

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        System.out.println(e);
    }
}
}
