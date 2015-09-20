/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Ara
 */
public class Mp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        try {
            // new MediaPlayer("\\123456.au").play();
            new MediaPlayer("\\123456.au").playSound();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Mp3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Mp3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Mp3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
      
    }
    
}
