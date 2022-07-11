import java.util.Scanner;
public class isUpperIsLower {
    public static void main(String args[]){
        Scanner inputFn = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = inputFn.next().trim().charAt(0);
        if('A'<=ch&& ch<='Z')
         System.out.println("Uppercase");
        else if('a'<=ch&& ch<='z') 
        System.out.println("LowerCase");
        else
        System.out.println("Invalid input");
        inputFn.close();
    }
}
