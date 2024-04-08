public class secrchingstring {
    public static void main(String[] args) {
        String s="BCA 3rd Semester";
        int id=s.indexOf("Semester");
        if (id==-1) {
            System.out.println("Semester not found");
            
        }else

            System.out.println("Found at index " +id);
            
        
    }
}
