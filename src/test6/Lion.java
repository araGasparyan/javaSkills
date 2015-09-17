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
public class Lion implements AutoCloseable {
	public Lion() {
		System.out.println("LION is OPEN in the wild.");
	}

	public void hunt() throws Exception {
		throw new Exception("DeerNotFound says Lion!");
	}

        @Override
	public void close() throws Exception {
		System.out.println("LION is CLOSED in the cage.");
		throw new Exception("Unable to close the cage!");
	}
}
