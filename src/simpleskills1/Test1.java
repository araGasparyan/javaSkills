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
public class Test1 {
    int i;
    Test1(int a){
        i=a;
    }
    
    Test1 incrByTen(){
        Test1 tmp=new Test1(i+10);
        return tmp;
    }
    
    
}
