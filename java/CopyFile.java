import java.io.*;

public class CopyFile {

    public static void main(String[] args) {
        FileInputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream("E:\\3rdsem\\k.txt");
            out = new FileOutputStream("E:\\3rdsem\\kk.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null)
                    in.close();
                if (out != null)
                    out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
