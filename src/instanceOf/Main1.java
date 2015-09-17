/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanceOf;

/**
 *
 * @author matenadaran
 */
public class Main1 {
    static int val=3;

    static int getnum(){
      
        return val--;
    }
    
    public static void main(String[] args) {

        int n;
        
        for(int i=0;i<10;i++){
            n=getnum();
            assert n>0;
            
            System.out.println("n equals to "+n);
            
            
            
            
            
        }
             
       
      int [][] x={{1,2,3}};
            System.out.println(x.length);
    }
}
