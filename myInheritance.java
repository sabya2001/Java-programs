import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class myInheritance {
    public static void main(String[] args) throws IOException {
        human h1 = new human();
        h1.show();
        h1.hgetValue();
        h1.show();
        human h2 = new human(47, "Saikat", 55.55);
        h2.show();
        stud s1 = new stud();
        s1.std_show();
        s1.sgetData();
        s1.std_show();
        stud s2 = new stud(12, "Bala", 34.12, 200, "class 7");
        s2.std_show();
    }
}

class human {
    int age;
    String name;
    double weight;

    human() {
        age = 1;
        name = "Unknown";
        weight = 2.5;
    }

    human(int ag, String nm, double wt) {
        age = ag;
        name = nm;
        weight = wt;
    }

    void hgetValue() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter age: ");
        age = Integer.parseInt(br.readLine());
        System.out.println("Enter name ");
        name = br.readLine();
        System.out.println("Enter weight");
        String t = br.readLine();
        weight = t.charAt(0);
    }

    void show() {
        System.out.println("We are in the base show(): ");
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
    }
}

class stud extends human {
    int roll;
    String course;

    stud() {
        age = 0;
        name = "Kala";
        weight = 5.2;
        roll = 1000;
        course = "n/a";
    }

    stud(int ag, String n, double wt, int rol, String cr) {
        super(ag, n, wt);
        roll = rol;
        course = cr;
    }

    void std_show() {
        System.out.println("We are in std_show()");
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Roll: " + roll);
        System.out.println("Course: " + course);
    }

    void sgetData() throws IOException {
        hgetValue();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter roll: ");
        age = Integer.parseInt(br.readLine());
        System.out.println("Enter course ");
        name = br.readLine();
    }
}
