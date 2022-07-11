import java.util.Scanner;
public class schoolGrading {
    public static void main(String args[]){
        int num;
        Scanner inputFn = new Scanner(System.in);
        System.out.println("Enter a number");
        num=inputFn.nextInt();
        if(num<=100 && num>=80)
          System.out.println("A");
        else if(num<80 && num>=60)
          System.out.println("B"); 
        else if(num<60 && num>=50)
          System.out.println("C") ; 
        else if(num<50 && num>=45)
          System.out.println("D");  
        else if(num<45 && num>=25)
          System.out.println("E");
        else if(num<25)
         System.out.println("F");
        else
        System.out.println("Invalid input");
         inputFn.close();   
    }
}
