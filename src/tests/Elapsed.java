/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author matenadaran
 */
// Timing program execution.
class Elapsed {
public static void main(String args[]) {
long start, end;
System.out.println("Timing a for loop from 0 to 100,000,000");
// time a for loop from 0 to 100,000,000
start = System.currentTimeMillis(); // get starting time
for(long i=0; i < 1000000L; i++)
    ;
        
end = System.currentTimeMillis(); // get ending time
System.out.println("Elapsed time: " + (end-start));
    
}
}
