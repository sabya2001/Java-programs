import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class carProgram {
    public static void main(String[] args) throws IOException {
        percar c = new percar();
        // c.setValue();
        c.show();
        c.getaValue();
        c.show();
        percar pc2 = new percar(5,1000,'S');
        pc2.show();
        vechile vech = new vechile();
        vech.show();
        vech.getaValue();
        vech.show();
    }
}
class vechile{
    int noOfWheel;
    float engPower;
    char type;
     vechile(){
        noOfWheel = 4;
        engPower = 600;
        type ='p';
    }                                                   
    vechile(int nw,float ecap,char ty){
    noOfWheel=nw;
    engPower=ecap;
    type = ty;

    }
    void show(){
        System.out.println("No. of wheels: "+noOfWheel);
        System.out.println("Engine Capacity: "+engPower);
        System.out.println("Type: "+type);
    }
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
class percar{
    int noOfWheel;
    float engPower;
    char type;
     percar(){
        noOfWheel = 4;
        engPower = 600;
        type ='p';
    }                                                   
    percar(int nw,float ecap,char ty){
    noOfWheel=nw;
    engPower=ecap;
    type = ty;

    }
    void show(){
        System.out.println("No. of wheels: "+noOfWheel);
        System.out.println("Engine Capacity: "+engPower);
        System.out.println("Type: "+type);
    }
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

