import java.io.*;
public class dynamicWToFile {
    public static void main(String[] args) {
        System.out.println("Enter your file name: ");
        char c;
        StringBuffer sb = new StringBuffer();
        try {
            while((c= (char)System.in.read())!='\n')
                 sb.append(c);

        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        File f1 = new File(sb.toString());
        if(f1.exists()){
            System.out.println("File Name: "+f1.getName());
            System.out.println("Path: "+f1.getPath());
            System.out.println("Absolute Path: "+f1.getAbsolutePath());
            System.out.println("Writable: "+f1.canWrite());
            System.out.println("Readable: "+f1.canRead());
            System.out.println("File Length: "+f1.length());
        }
        else
           System.out.println("File not found");
    }
}
