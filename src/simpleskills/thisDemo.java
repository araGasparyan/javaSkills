package simpleskills;

class thisDemo
{
    int number=0;
    thisDemo next=this;
    FibArray Fib=new FibArray();
    
}

class testThisDemo
{
    public static void main(String args[])
    {
        thisDemo obj =new thisDemo();
        System.out.println(obj.next.next.number);
              //System.out.println(obj.next.number);
               //System.out.println(obj.next.next.number);
    }
}