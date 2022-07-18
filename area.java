import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner inputFn = new Scanner(System.in);
        area();
        System.out.println("Enter the side of the  sqaure: ");
        int side = inputFn.nextInt();
        System.out.println("Enter the length of the rectangle: ");
        float length = inputFn.nextFloat();
        System.out.println("Enter the width of the rectangle: ");
        float width = inputFn.nextFloat();
        area(side);
        area(length,width);
        inputFn.close();
    }
    static void area(){
        Scanner inputFn = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        float radius = inputFn.nextFloat();
        double area =  3.14*radius*radius;
        System.out.println("Area Circle: "+area);
    }
    static void  area(int side){
       System.out.println("Area Square:"+(double)(side*side));
    }
    static void area(float length, float width){
        System.out.println("Area rectangle"+(double)(length*width));
    }
}
