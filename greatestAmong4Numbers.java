import java.util.Scanner;
public class greatestAmong4Numbers {
   public static void main(String args[]){
    Scanner inputFn = new Scanner(System.in);
    int num1,num2,num3,num4;
    System.out.println("Enter first number: ");
    num1 = inputFn.nextInt();
    System.out.println("Enter Second number: ");
    num2 = inputFn.nextInt();
    System.out.println("Enter Third number: ");
    num3 = inputFn.nextInt();
    System.out.println("Enter Fourth number: ");
    num4 = inputFn.nextInt();
    if(num1>=num2&&num1>=num3&&num1>=num4){
        System.out.println("Greatest among given numbers is "+num1);
    }
    else if(num2>=num1&&num2>=num3&&num2>=num4){
        System.out.println("Greatest among given numbers is "+num2);
    }
    else if(num3>=num2&&num3>=num1&&num3>=num4){
        System.out.println("Greatest among given numbers is "+num1);
    }
    else
    System.out.println("Greatest among given numbers is "+num4);
    inputFn.close();
   } 

}
