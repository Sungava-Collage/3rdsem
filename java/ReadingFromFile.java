import java.io.*;
public class ReadingFromFile {
    public static void main(String[] args) throws IOException{
        FileInputStream in=null;
        try{
            in=new FileInputStream("E:\3rdsem\\kashi.txt");
            System.out.println(in.read());
        }
        finally{
            if(in!=null){
                in.close();
            }
        }
    }
}