package com.polotika.prayerTimes;

public class Constants {
    private static final String method = "5"; // Egyptian General Authority of Survey
    private static final String country = "Egypt";
    private static final String city = "Cairo";
    private static final String date = "";
    public static final String url = String.format("https://api.aladhan.com/v1/timingsByCity/31-08-2024?city=%s&country=%s&method=%s", city, country, method);

}
