import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner inputFn = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial");
        int num = inputFn.nextInt();
        System.out.println(factorial(num));
        inputFn.close();
    }
    static int factorial(int x){
        if(x==0)
          return 1;
        else{
            return x*factorial(x-1);
        }  
    }
}
