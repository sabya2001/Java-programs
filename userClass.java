import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class userClass {
    public static void main(String[] args) throws IOException {
        car c = new car();
        // c.setValue();
        c.show();
        c.getaValue();
        c.show();
    }
}
class car{
    int noOfWheel;
    float engPower;
    char type;
    /* constructor declaration , constructor will execute when the new instance(Object) is created of the class
    constructor name should be same as class name,  and it has no return type */
     car(){
        noOfWheel = 4;
        engPower = 600;
        type ='p';
    }
    void show(){
        System.out.println("No. of wheels: "+noOfWheel);
        System.out.println("Engine Capacity: "+engPower);
        System.out.println("Type: "+type);
    }
    //static keyword is not required for declairing a method of a class
    void getaValue() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of wheels: ");
        noOfWheel = Integer.parseInt(br.readLine());
        System.out.println("Enter engine capacity: ");
        engPower = Float.parseFloat(br.readLine());
        System.out.println("Enter type: s->sports\nc->commercial\np->personal ");
        String t = br.readLine();
        type= t.charAt(0);
    }
}