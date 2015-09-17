/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoundDemo;

import java.io.*;
import sun.audio.*;
import java.io.File;
import javax.swing.*;
import java.awt.event.*;
public class Main2 {
   public static void main(String[] args) {
AudioPlayer player = AudioPlayer.player;
   AudioStream stream;
   AudioData data;
   ContinuousAudioDataStream loop = null;
   InputStream input = null;
   try
   {
       input = new FileInputStream("C:\\Users\\Ara\\Documents\\NetBeansProjects\\JavaApplication5\\1.wav");
       System.out.println("sdsad");
       stream = new AudioStream(input);
       
       data = stream.getData();
       loop = new ContinuousAudioDataStream(data);
       player.start(loop);
   }
   catch(IOException err)
   {
          System.out.println("fle not found");
   }
    }
}