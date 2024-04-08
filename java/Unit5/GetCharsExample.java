public class GetCharsExample {
    public static void main(String[] args) {
        String s1="Object Oriented Programming";  // Declare es a string.
        int start=6;
        int end=15;
        char s2[]=new char[end-start];
        s1.getChars(start, end, s2, 0);   // get the characters of the string into an array.
        System.out.println(s2);

    }
}
