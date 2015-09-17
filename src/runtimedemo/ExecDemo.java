/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtimedemo;

/**
 *
 * @author matenadaran
 */
// Demonstrate exec().
class ExecDemo {
public static void main(String args[]) {
//String[] cmd = {"open", "/Applications/Calculator.app/Contents/MacOS/Calculator"};
String[] cmd = {"open", "/Applications/Calculator.app"};
    Runtime r = Runtime.getRuntime();
Process p = null;
try {
p = r.exec(cmd);
} catch (Exception e) {
System.out.println("Error executing notepad.");
}

    System.out.println("OK");
}
}
