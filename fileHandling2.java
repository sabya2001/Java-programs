import java.io.FileInputStream;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
public class fileHandling2 {
    public static void main(String[] args) {
        byte b[] = new byte[80];
        try {
            FileInputStream fis = new FileInputStream("E:\\a.txt");
            fis.read(b,0,80);
            String s = new String(b,0);
            System.out.println(s);

        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
    }
}
