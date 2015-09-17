/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlTest;

/**
 *
 * @author matenadaran
 */
import java.util.List;

import xmlTest.Item;

public class TestRead {
  public static void main(String args[]) {
    StaXParser read = new StaXParser();
    List<Item> readConfig = read.readConfig("test.xml");
    for (Item item : readConfig) {
      System.out.println(item);
    }
  }
} 

