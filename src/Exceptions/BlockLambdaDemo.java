/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Ara
 */
class BlockLambdaDemo {
    static int z;
public static void main(String args[])
{
   
// This block lambda computes the factorial of an int value.
NumericFunc factorial = (n) -> {
   
   z=5;
int result = 1;
for(int i=1; i <= n; i++)
result = i * result;
return result;
};

System.out.println("The factoral of 3 is " + factorial.func(3));
System.out.println("The factoral of 5 is " + factorial.func(5));
}
}
