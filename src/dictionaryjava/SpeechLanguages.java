/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionaryjava;

import com.darkprograms.speech.synthesiser.SynthesiserV2;
import java.io.IOException;
import javazoom.jl.player.Player;
import javax.sound.midi.*;
import javax.speech.*;
import javax.speech.synthesis.*;
import javazoom.jl.decoder.JavaLayerException;


/**
 *
 * @author Le Hung
 */
public class SpeechLanguages {

    public SpeechLanguages() {
        speech("i want you");
    }
    
    
//AIzaSyBOti4mM-6x9WDnZIjIeyEU210pBXqWBgw
    SynthesiserV2 synthesiser= new SynthesiserV2("?hl=vi");
    public void speech(String text) {
        Thread thread = new Thread(()->{
            try {
                Player player = new Player (synthesiser.getMP3Data(text));
                player.play();
            } catch (IOException | JavaLayerException e) {
                e.printStackTrace();
            }
        });
        thread.setDaemon(false);
        thread.start();
//        try {
//            // Create a synthesizer for English
//            Synthesizer synth;
//            synth = Central.createSynthesizer(
//                    new SynthesizerModeDesc(Locale.ENGLISH));
//
//            // Get it ready to speak
//            synth.allocate();
//            synth.resume();
//
//            // Speak the "Hello world" string
//            synth.speakPlainText("Hello, world!", null);
//
//            // Wait till speaking is done
//            synth.waitEngineState(Synthesizer.QUEUE_EMPTY);
//
//            // Clean up
//            synth.deallocate();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
}
