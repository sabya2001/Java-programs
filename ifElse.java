import java.util.Scanner;
public class ifElse{
    public static void main(String args[]){
        Scanner inputFn = new Scanner(System.in);
         int num;
         System.out.println("Enter a number");
         num = inputFn.nextInt();
         if(num%2==0)
           System.out.println("Even");
           else 
           System.out.println("Odd");
        inputFn.close();
    }
}