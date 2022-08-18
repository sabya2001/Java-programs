import java.io.*;

public class writeToFile {
    public static void main(String[] args) {
        byte buff[] = new byte[100];
        try {
            System.out.println("Enter some text");
            System.in.read(buff, 0, 100);
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            fos.write(buff);
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }
}
