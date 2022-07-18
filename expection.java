
public class expection {
    public static void main(String[] args) {
        byte b[] = new byte[80];
        
        try {
            System.out.println("Enter some text");
            System.in.read(b,0,80);
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
        String s = new String(b,0);
        System.out.println(b);
        System.out.println(s);
    }
}
