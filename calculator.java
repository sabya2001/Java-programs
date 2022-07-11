import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        Scanner inputFn = new Scanner(System.in);
        int choice ;
        System.out.println("Enter your choice\n1.ADD\n2.SUB\n3.MULTIPLICATION\n4DIVISION\nEnter your choice: ");
        choice = inputFn.nextInt();
        System.out.println("Enter first number: ");
        int num1 = inputFn.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = inputFn.nextInt();
        switch (choice) {
            case 1:
             System.out.println("Sum: "+(num1+num2));
                break;
            case 2:    
             System.out.println("Difference: "+(num1-num2));
                break;
            case 3:    
             System.out.println("Product: "+(num1*num2));
                break;
            case 4:
            if(num2==0) 
              System.out.println("NOT DIVISIBLE BY ZERO");
            else     
             System.out.println("Product: "+(num1/num2));
                break;
        
            default:
            System.out.println("Invalid input");
                break;
        }
        inputFn.close();
    }
}
