import java.util.Scanner;
public class addNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1,num2,num3,sum;
        System.out.println("Enter first number: ");
        num1=input.nextInt();
        System.out.println("Enter first number: ");
        num2=input.nextInt();
        System.out.println("Enter first number: ");
        num3=input.nextInt();
        sum = num1+num2+num3;
        System.out.println("Sum:"+sum);
        input.close();
    }
}
