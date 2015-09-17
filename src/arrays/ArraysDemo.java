package arrays;
// Demonstrate Arrays
import java.util.*;
class ArraysDemo {
public static void main(String args[]) {
// Allocate and initialize array.
int array[] = new int[10];
for(int i = 0; i < 10; i++)
array[i] = -3 * i;
// Display, sort, and display the array.
System.out.print("Original contents: ");
display(array);
Arrays.sort(array);
System.out.print("Sorted: ");
display(array);
//
int array1[]=Arrays.copyOf(array, array.length);
System.out.println(Arrays.equals(array, array1));
//
// Fill and display the array.
Arrays.fill(array, 2, 6, -1);
System.out.print("After fill(): ");
display(array);
// Sort and display the array.
Arrays.sort(array);
System.out.print("After sorting again: ");
display(array);
// Binary search for -9.
System.out.print("The value -9 is at location ");
int index =
Arrays.binarySearch(array, -9);
System.out.println(index);
//int [] test={1,2};
//array=new int [2];
//array[0]=1;
//array[1]=2;
//array1=new int [2];
//array1[0]=1;
//array1[1]=3;
    System.out.println(Arrays.equals(array, array1));
    
  

}
static void display(int array[]) {
for(int i: array)
System.out.print(i + " ");
System.out.println();
}
}