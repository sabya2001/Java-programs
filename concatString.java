import java.io.StringBufferInputStream;
import java.io.SequenceInputStream;
public class concatString {
    static String ss1 = "Aec CS Sem5 \n current papers\n os\t JAVA\t AI";
    static String ss2 = "M.TECH in CS \n sem\n System Dynamics\t Portfolio";
    static StringBufferInputStream sbis1 = new StringBufferInputStream(ss1);
    static StringBufferInputStream sbis2= new StringBufferInputStream(ss2);
    static SequenceInputStream sbis= new SequenceInputStream(sbis1,sbis2);
    public static void main(String[] args) {
        int c;
        try {
            while((c=sbis.read())!=-1)
                System.out.println((char)c);
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}