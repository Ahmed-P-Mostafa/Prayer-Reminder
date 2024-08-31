package com.polotika.prayerTimes;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class Scheduler {

    public static void schedule(PrayerTimesResponse.Data.Timings timings) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        NotificationSound notificationSound = new NotificationSound();
       // new Thread(notificationSound.playSound()).start();
       // JOptionPane.showMessageDialog(null, "This is an alert dialog!", "Alert", JOptionPane.WARNING_MESSAGE);
        int result = JOptionPane.showConfirmDialog(null,"Message","Title",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
        System.out.println(result);
    }




}
