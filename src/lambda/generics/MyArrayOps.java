/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda.generics;

/**
 *
 * @author matenadaran
 */
class MyArrayOps {
static <T> int countMatching(T[] vals, T v) {
int count = 0;
for(int i=0; i < vals.length; i++)
if(vals[i] == v) count++;
return count;
}
}
