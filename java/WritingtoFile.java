
import java.io.*;
public class WritingtoFile {
    public static void main(String[] args) throws IOException{
        FileOutputStream out=null;
        try{
            out=new FileOutputStream("E:\\Kashi.txt");
            int a=65;
            out.write(a);
        }
        finally{
            if(out!=null){
                out.close();
            }
        }
    }
}