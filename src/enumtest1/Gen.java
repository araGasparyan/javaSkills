/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumtest;

/**
 *
 * @author Ara
 */
 class Gen<T> {
    Integer x;
    String s;
  private  T o;

    public T getO() {
        return o;
    }

    public void setO(T o) {
        this.o = o;
    }
    
   public void print(){
       System.out.println("The type of T is "+o.getClass().getName());
   }
    
    
}
