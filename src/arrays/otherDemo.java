/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;

/**
 *
 * @author matenadaran
 */
public class otherDemo {
    public static void main(String[] args) {
        int test1 [] = {9,7,3,90,56,3,7,66,34,64,745,2,543};
        display(test1);
         int test2 []=Arrays.copyOf(test1, test1.length);
//        Arrays.fill(test2,0, 2,890);
//        display(test2);
         Arrays.sort(test2);
        display(test2);
        Arrays.parallelSort(test1);
        display(test1);
        IntBinaryOperator functionToUse = new IntBinaryOperator() {

            @Override
            public int applyAsInt(int left, int right) {
           return left*right;
            }
        } ;
        Arrays.parallelPrefix(test1, functionToUse);
        display(test1);
    }
  
    
    static void display(int array[]) {
for(int i: array)
System.out.print(i + " ");
System.out.println();
}
}
