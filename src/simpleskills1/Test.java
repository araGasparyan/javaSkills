/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleskills1;

/**
 *
 * @author Ara
 */
public class Test {
    int a,b;
    
    Test(int x, int y){
    a=x;
    b=y;
}
   
    boolean equals(Test o){
        if(o.a==a && o.b==b) return true;
        else return false;
    }
    
    
}
