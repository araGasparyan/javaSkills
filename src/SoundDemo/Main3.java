/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoundDemo;

import java.io.*;
import sun.audio.*;


/**
 *
 * @author Ara
 */
class Main3{
    public static void main(String[] args) {
        InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\Ara\\Documents\\NetBeansProjects\\JavaApplication5\\1.wav"));
                   System.out.println("error");
                AudioStream audios = new AudioStream(in);
              
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                System.out.println("error");
            }
    }
}

