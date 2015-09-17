/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author matenadaran
 */
public class Setter {
   private int n=8;

    public int getN() {
        return n;
    }


   Setter(){
       fill();
   }

    public int[][] getBoard() {
        return board;
    }
   
   
    
    private int board[][]=new int[n][n];

   
    
    private void fill(){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if((i+j)%2==0) board[i][j]=1;
                else board[i][j]=0;
                //System.out.print(board[i][j]);
                //if ( j== n-1 ) System.out.println();
            }
        }
    }
}
