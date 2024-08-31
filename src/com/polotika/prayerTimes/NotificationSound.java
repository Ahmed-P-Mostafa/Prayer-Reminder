package com.polotika.prayerTimes;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class NotificationSound implements LineListener {
    private final File soundFile = new File("alert.wav");
    private final AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
    private final CountDownLatch latch = new CountDownLatch(1);
    private final Clip clip = AudioSystem.getClip();


    @Override
    public void update(LineEvent event) {
        System.out.println(event.getType());
        if (event.getType() == LineEvent.Type.STOP) {
            clip.close();
            try {
                audioInputStream.close();

            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                latch.countDown();  // Release the latch
            }
        }
    }


    public NotificationSound() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        clip.addLineListener(this);
    }

    void playSound() {
        // play on another Thread
        try {
            clip.open(audioInputStream);

            // Play the audio clip
            clip.start();
            clip.drain();
            latch.await();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    void finish(){
        clip.stop();
    }
}
