package test6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matenadaran
 */

    public class TryWithResourcesExample {

	public static void main(String[] args) {
		try (Lion lion = new Lion(); Tiger tiger = new Tiger()) {
 
                    tiger.hunt();
			lion.hunt();
			tiger.close();
                    lion.close();
                       
                        

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally.");
		}
	
	}
}

