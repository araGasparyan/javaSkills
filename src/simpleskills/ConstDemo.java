package simpleskills;

class ConsDemo
{
    double Re,Im;
    
    void set(double Re, double Im)
    {
        this.Re=Re;
        this.Im=Im;
        show();
    }
    
          void show()
    {
        System.out.println("You have entered "+Re+" and "+Im);
    }
          
          ConsDemo()
          {
              set(0,0);
          }
          
           ConsDemo(double x)
          {
              set(x,x);
          }
           
           ConsDemo(double x, double y)
          {
              set(x,y);
          }
              
           ConsDemo(ConsDemo obj)
          {
              set(obj.Re,obj.Im);
          }
           
           ConsDemo getSum(ConsDemo obj)
          {
              ConsDemo tmp=new ConsDemo();
              tmp.Re=Re+obj.Re;
               tmp.Im=Im+obj.Im;
              return tmp;
          }
           
           void add(ConsDemo obj)
           {
               Re+=obj.Re;
                Im+=obj.Im;
           }
           
}

class Demo1{
    static public void main(String args[])
    {
             ConsDemo a = new ConsDemo(1);
             ConsDemo b = new ConsDemo(-3,5);
             ConsDemo c = new ConsDemo(b);
             c=a.getSum(b);
             c.show();
             a.add(c);
             a.show();
             
    }
}