/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.Arrays;
/**
 *
 * @author matenadaran
 */
public class deepEqualDemo {
    public static void main(String[] args) {
        int matrix1[][]=new int[5][5];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j<matrix1.length; j++) {
               matrix1[i][j]=i+j;
            }
            
        }
        display(matrix1);
       int matrix2[][]=new int[5][5];//= Arrays.copyOf(matrix1, matrix1.length);
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j<matrix2.length; j++) {
               matrix2[i][j]=i+j;
            }
            
        }
        System.out.println("");
        
        display(matrix2);
        
        System.out.println(Arrays.equals(matrix1, matrix2));
          System.out.println(Arrays.deepEquals(matrix1, matrix2));
        matrix2[3][3]=9;
        display(matrix1);
        display(matrix2);
        System.out.println(Arrays.equals(matrix1, matrix2));
        System.out.println(Arrays.deepEquals(matrix1, matrix2));
          int test1[][]={{1,2,3}, {4,5,8}, {8,9}};
          int test2[][]={{1,2,3}, {4,5,8}, {4,5,8,9}};
          System.out.println("length is "+test1.length);
          System.out.println("");
          System.out.println(Arrays.equals(test1, test2));
        System.out.println(Arrays.deepEquals(test1, test2));
        int test4[][]= new int[2][5];
        System.out.println(test4.length);
        
    }
    
    static void display(int [][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j<a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
            
        }
    }
    
    
    
}
