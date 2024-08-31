package com.polotika.prayerTimes;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import static com.polotika.prayerTimes.Constants.url;

public class Main {

    public static void main(String[] args)  {
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(new URI(url)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            PrayerTimesResponse prayerTimesResponse = new Gson().fromJson(response.body(), PrayerTimesResponse.class);
            Scheduler.schedule(prayerTimesResponse.data.timings);

        } catch (URISyntaxException | InterruptedException | IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
    }
}
