import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class fileHandling {
    public static void main(String[] args) {
        int c;
        try {
            FileInputStream fis1 = new FileInputStream("a.txt");
            FileInputStream fis2 = new FileInputStream("b.txt");
            SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
             while((c=sis.read())!=-1)
                System.out.print((char)c);
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
    }
}
