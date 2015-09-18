/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdademo;

/**
 *
 * @author Ara
 */
class LambdaExceptionDemo {
public static void main(String args[]) throws EmptyArrayException
{
double[] values = { 1.0, 2.0, 3.0, 4.0 };
// This block lambda computes the average of an array of doubles.
DoubleNumericArrayFunc average = (double [] n) -> {
double sum = 0;
if(n.length == 0)
throw new EmptyArrayException();
for(int i=0; i < n.length; i++)
sum += n[i];
return sum / n.length;
};
System.out.println("The average is " + average.func(new double[0]));
System.out.println("The average is " + average.func(values));
// This causes an exception to be thrown.
try {
        System.out.println("The average is " + average.func(new double[0]));
    } catch (Exception e) {
        System.out.println("sdfsdafdsa");
    }

}
}