//Automatic type conversions apply to overloading.
class OverloadDemo{
    void test(){
        System.out.println("No Parameters");
    }
    //OVerload test for two integer parameters
    void test(int a, int b){
        System.out.println("a snd b:"+a+" "+b);
    }
    //Overload test for double parameter
    void test(double a){
        System.out.println("Inside test (double) a: "+ a);
    }
}
class methodOverloading{
    public static void main(String args []){
        OverloadDemo ob = new OverloadDemo();
        int i = 88;
         ob.test();
         ob.test(10,20);
         ob.test(i);
         ob.test(123.2);
    }
}