import java.util.Scanner;
public class nameSplit {
    public static void main(String[] args) {
        Scanner inputFn = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = inputFn.nextLine();
        for(int i=0;i<name.length();i+=2){
               System.out.print(name.charAt(i));
        }
        inputFn.close();
    }
}
