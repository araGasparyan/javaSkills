/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author matenadaran
 */
class C {
    public void E(C c) {
        System.out.print("C.E - ");
    }
}

class SC extends C {
    public void E(SC sc) {
        System.out.print("SC.E - ");
    }}


class Biblik {
    public static void main(String[] args) {
        C c = new C();
        SC sc = new SC();
        C c2 = new SC();

        c.E(c);
        c.E(c2);
        c.E(sc);

        c2.E(c);
        c2.E(c2);
        c2.E(sc);

        sc.E(c);
        sc.E(c2);
        sc.E(sc);
    }}

