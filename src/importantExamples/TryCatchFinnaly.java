/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

/**
 *
 * @author Ara
 */
public class TryCatchFinnaly {
    public static void main(String[] args) {
      try{
            int d=0;
            int a= 7/d;
        }catch(Exception e){
            System.out.println("amenafirst try");
            return;
        }
        finally{
        try{
            int d=0;
            int a= 7/d;
        }catch(Exception e){
            System.out.println("first try");
            return;
        }
        
        
        try{
            int d=0;
            int a= 7/d;
        }catch(Exception e){
            System.out.println("secdond try");
            return;
        }
        
    }
        
    }
}
