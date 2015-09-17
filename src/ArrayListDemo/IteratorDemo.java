/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListDemo;

/**
 *
 * @author matenadaran
 */
// Demonstrate iterators.
import java.util.*;
class IteratorDemo {
public static void main(String args[]) {
// Create an array list.
ArrayList<String> al = new ArrayList<String>();
// Add elements to the array list.
al.add("C");
al.add("A");
al.add("E");
al.add("F");
al.add("D");
al.add("B");
al.add("F");

System.out.print("Original contents of al: ");
Iterator<String> itr = al.iterator();
System.out.println();

while(itr.hasNext()) {
    if(itr.next()=="B") break;
    else System.out.println(itr.next());
}

 







/*
// Use iterator to display contents of al.
System.out.print("Original contents of al: ");
Iterator<String> itr = al.iterator();
while(itr.hasNext()) {
String element = itr.next();
System.out.print(element + " ");
}

System.out.println();
// Modify objects being iterated.
ListIterator<String> litr = al.listIterator();
while(litr.hasNext()) {
String element = litr.next();
litr.set(element + "+");
}

System.out.print("Modified contents of al: ");
itr = al.iterator();
while(itr.hasNext()) {
String element = itr.next();
System.out.print(element + " ");
}
System.out.println();


// Now, display the list backwards.
System.out.print("Modified list backwards: ");
while(litr.hasPrevious()) {
    String element = litr.previous();
System.out.print(element + " ");
}
System.out.println();
*/
}
}