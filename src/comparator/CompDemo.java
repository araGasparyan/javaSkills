/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

// Use a custom comparator.
import java.util.*;
// A reverse comparator for strings.
class MyComp implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
// Reverse the comparison.
return bStr.compareTo(aStr);
}
// No need to override equals or the default methods.
}


class CompDemo {
public static void main(String args[]) {
// Create a tree set.
TreeSet<String> ts = new TreeSet<String>(new MyComp());
// Add elements to the tree set.
ts.add("C");
ts.add("A");
ts.add("B");
ts.add("E");
ts.add("F");
ts.add("D");
// Display the elements.
for(String element : ts)
System.out.print(element + " ");
System.out.println();
    System.out.println("B".compareTo("A"));
}
}
