/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionaryjava;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 *
 * @author Le Hung
 */
public class Freetts {
    VoiceManager voiceManager;
    Voice voice;

    public Freetts(String text) {
        
            //System.getProperty("mbrola.base", "C:/Users/Le Hung/Desktop/FreeTTS/mbrola");
            voiceManager = VoiceManager.getInstance();
            voice = voiceManager.getVoice("kevin16");
            voice.allocate();
            voice.speak(text);
            voice.deallocate();
        

    }
}
