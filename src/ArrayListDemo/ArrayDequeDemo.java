/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListDemo;

import java.util.PriorityQueue;

/**
 *
 * @author matenadaran
 */
// Demonstrate ArrayDeque.
import java.util.*;
class ArrayDequeDemo {
public static void main(String args[]) {
// Create an array deque.
ArrayDeque<String> adq = new ArrayDeque<String>();
// Use an ArrayDeque like a stack.
adq.push("A");
adq.push("B");
adq.push("D");
adq.push("E");
adq.push("F");
System.out.print(adq);
System.out.println();
System.out.print("Popping the stack: ");
while(adq.peek() != null)
System.out.print(adq.pop() + " ");
System.out.println();
System.out.print(adq);
}
}