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
// Demonstrate HashSet.
import java.util.*;
class HashSetDemo {
public static void main(String args[]) {
// Create a hash set.
HashSet<String> hs = new HashSet<String>();
// Add elements to the hash set.
hs.add("Beta");
hs.add("Alpha");
hs.add("Eta");
hs.add("Gamma");
hs.add("Epsilon");
hs.add("Omega");
hs.add("Gamma");
hs.add("Epsilon");
hs.add("Omega");
System.out.println(hs);
System.out.println("Gamma".hashCode());
System.out.println("Eta".hashCode());
System.out.println("Alpha".hashCode());
System.out.println("Epsilon".hashCode());
System.out.println("Omega".hashCode());
System.out.println("Beta".hashCode());


}
}
