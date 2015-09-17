/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author matenadaran
 */
public class MakeString {
    int x;
    static int y;
    public static void main(String[] args) {
        
     //   String s="This is a test string";
       // System.out.println("barev"+s+"sd");
        
        /*
        Object o1=new Object();
         Object o2=new Object();
         System.out.println(o1.toString());
         System.out.println(o2.toString());
         String s1="aaa";
         String s2="bbb";
         System.out.println(s1.toString());
         System.out.println(s2.toString());
        
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
        System.out.println(x);
               
        char [] c = {'a'};
        
        String test =new String(c);
        
   //     System.out.println(s.regionMatches(5, test, 0, 2));
        
       
    
        
     //   System.out.println(test.startsWith(new Character(c).toString()));
        
        
        System.out.println(c);
        
        
        
        myFrame f=new myFrame();
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        
         */
        
        /*
        String [] arr={
            "I", "was", "born", "in", "1987", "in",
            "the", "little", "town", "Yerevan"
        };
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        System.out.println("");
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    
                }
            }  
            System.out.println(arr[i]);
        }
        
        */
        
        /*
        
        String s="apple is the best fruit in the world. Everyone likes apple."
                + "I like apple too.";
        String search="apple";
        String replace = "banana";
        String result="";
        int i;
        System.out.println(s);
        do{
            i=s.indexOf(search);
            if(i!=-1){
            result=s.substring(0,i)+replace+s.substring(i+search.length());
            s=result;
            }
        }while(i!=-1);
        System.out.println(s);
        String s1=s.substring(0,0);
        System.out.println(s1);
        
        
        
        
      // I i=new A();
      //  I a=i;
       // new B().test(new B());
        
       
 Boolean b = new Boolean(false);
 
        System.out.println(b);
       
       Box v= new Box();
        System.out.println(v.b().x);
        */
        
       // byte x []={89};
        
       // System.out.println(new String(x));
        
    A a=new A();
        a.meth().meth().meth();
        System.out.println();
        a.statmeth().statmeth().statmeth();
        System.out.println("");
    a.meth1().meth1().meth1();
//new B();
    
       MakeString g= new MakeString();
   
    g.m(g);
    
    
    }
    
   void m(MakeString g){
       // MakeString y1 = this;
        //MakeString.this.x;
        System.out.println(this.x);
         System.out.println(MakeString.this.y);
         System.out.println(MakeString.y);
      ;
    }
    
    
        
    }

