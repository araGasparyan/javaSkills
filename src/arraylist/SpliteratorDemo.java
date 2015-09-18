/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

/**
 *
 * @author Ara
 */
// A simple Spliterator demonstration.
import java.util.*;
class SpliteratorDemo {
public static void main(String args[]) {
// Create an array list for doubles.
ArrayList<Double> vals = new ArrayList<>();
// Add values to the array list.
vals.add(6.0);
vals.add(7.0);
vals.add(8.0);
vals.add(9.0);
vals.add(10.0);
// Use tryAdvance() to display contents of vals.
System.out.print("Contents of vals:\n");
Spliterator<Double> spltitr = vals.spliterator();
while(spltitr.tryAdvance((n) -> System.out.println(n)));
System.out.println();
// Create new list that contains square roots.
spltitr = vals.spliterator();
ArrayList<Double> sqrs = new ArrayList<>();
while(spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
// Use forEachRemaining() to display contents of sqrs.
System.out.print("Contents of sqrs:\n");
spltitr = sqrs.spliterator();
spltitr.forEachRemaining((n) -> System.out.println(n));
System.out.println();
}
}