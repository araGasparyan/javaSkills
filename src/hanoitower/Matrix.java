/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoitower;

/**
 *
 * @author matenadaran
 */
public class Matrix {
    private int disks;
    private int game1[][];
     private int game2[][];

    public int getDisks() {
        return disks;
    }

    public void setDisks(int disks) {
        this.disks = disks;
    }

    public int[][] getGame1() {
        return game1;
    }

    public void setGame1(int[][] game1) {
        this.game1 = game1;
    }

    public int[][] getGame2() {
        return game2;
    }

    public void setGame2(int[][] game2) {
        this.game2 = game2;
    }

    
    public int[][] start(){
       int tmp[][]=new int[3][disks];
        
        for(int i=0;i<disks;i++){
            tmp[0][i]=disks-i;
        }
        
        return tmp;
    }
    
    
    
    public void f3(int[][] x){
        
        
        
    }
    
    
    
    
    
}
