/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

/**
 *
 * @author Ara
 */
// Demonstrate the clone() method
class TestClone implements Cloneable{
int a;
double b;
String s = "sadasd";
Object o;
// This method calls Object's clone().
TestClone cloneTest() {
try {
    
// call clone in Object.
return  (TestClone) super.clone();
} catch(CloneNotSupportedException e) {
System.out.println("Cloning not allowed.");
return this;
}
}
}