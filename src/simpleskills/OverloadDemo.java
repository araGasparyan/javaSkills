package simpleskills;

class OverloadDemo
{
    void test()
    {
        System.out.println("There are not arguments");
    }
    void test(int a,int b)
    {
       System.out.println("The argument is int " +a+  "  " +b+" "); 
    }
    void test(double a)
    {
        System.out.println("The argument is double "+a); 
        
    }
}

class Overload{
    static public void main(String args[]){
        OverloadDemo obj = new OverloadDemo();
        int i=88;
        obj.test();
        obj.test(1,2);
        obj.test(88);
        obj.test(i);
        obj.test(12.5);
     
}}