/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda.newpackage;

/**
 *
 * @author matenadaran
 */
// This class defines a static method called strReverse().
class MyStringOps {
// A static method that reverses a string.
static String strReverse(String str) {
String result = "";

int i;
for(i = str.length()-1; i >= 0; i--)
result += str.charAt(i);
return result;
}
}
