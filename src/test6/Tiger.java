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
public class Tiger implements AutoCloseable {
	public Tiger() {
		System.out.println("TIGER is OPEN in the wild.");
	}

	public void hunt() throws Exception {
		throw new Exception("DeerNotFound says Tiger!");
	}

        @Override
	public void close() throws Exception {
		System.out.println("TIGER is CLOSED in the cage.");
	}
}
