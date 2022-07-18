import java.io.StringBufferInputStream;
public class printStringChar {
    static String ss = "Aec CS Sem5 \n current papers\n os\t JAVA\t AI";
    static StringBufferInputStream sbis = new StringBufferInputStream(ss);
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