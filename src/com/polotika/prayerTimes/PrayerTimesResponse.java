package com.polotika.prayerTimes;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrayerTimesResponse {
    @Override
    public String toString() {
        return "PrayerTimesResponse{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", data=" + data +
                '}';
    }

    int code;
    private String status;
     Data data;

    // Getters and Setters

    public static class Data {
         Timings timings;
        private Date date;
        private Meta meta;

        // Getters and Setters

        public static class Timings {
             String Fajr;
            private String Sunrise;
             String Dhuhr;
             String Asr;
            private String Sunset;
             String Maghrib;
             String Isha;
            private String Imsak;
            private String Midnight;
            private String Firstthird;
            private String Lastthird;

            // Getters and Setters

            @Override
            public String toString() {
                return "Timings{" +
                        "Fajr='" + Fajr + '\'' +
                        ", Sunrise='" + Sunrise + '\'' +
                        ", Dhuhr='" + Dhuhr + '\'' +
                        ", Asr='" + Asr + '\'' +
                        ", Sunset='" + Sunset + '\'' +
                        ", Maghrib='" + Maghrib + '\'' +
                        ", Isha='" + Isha + '\'' +
                        ", Imsak='" + Imsak + '\'' +
                        ", Midnight='" + Midnight + '\'' +
                        ", Firstthird='" + Firstthird + '\'' +
                        ", Lastthird='" + Lastthird + '\'' +
                        '}';
            }

            public  Map<String,String> getPrayerTimes(){
                Map<String,String> prayerTimes = new HashMap<>();
                prayerTimes.put("Fajr",Fajr);
                prayerTimes.put("Dhuhr",Dhuhr);
                prayerTimes.put("Asr",Asr);
                prayerTimes.put("Maghrib",Maghrib);
                prayerTimes.put("Isha",Isha);
                return prayerTimes;
            }
        }

        public static class Date {
            private String readable;
            private String timestamp;
            private Hijri hijri;
            private Gregorian gregorian;

            // Getters and Setters

            public static class Hijri {
                private String date;
                private String format;
                private String day;
                private Weekday weekday;
                private Month month;
                private String year;
                private Designation designation;
                private List<String> holidays;

                // Getters and Setters

                public static class Weekday {
                    private String en;
                    private String ar;

                    // Getters and Setters
                }

                public static class Month {
                    private int number;
                    private String en;
                    private String ar;

                    // Getters and Setters
                }

                public static class Designation {
                    private String abbreviated;
                    private String expanded;

                    // Getters and Setters
                }
            }

            public static class Gregorian {
                private String date;
                private String format;
                private String day;
                private Weekday weekday;
                private Month month;
                private String year;
                private Designation designation;

                // Getters and Setters

                public static class Weekday {
                    private String en;

                    // Getters and Setters
                }

                public static class Month {
                    private int number;
                    private String en;

                    // Getters and Setters
                }

                public static class Designation {
                    private String abbreviated;
                    private String expanded;

                    // Getters and Setters
                }
            }
        }

        public static class Meta {
            private double latitude;
            private double longitude;
            private String timezone;
            private Method method;
            private String latitudeAdjustmentMethod;
            private String midnightMode;
            private String school;
            private Offset offset;

            // Getters and Setters

            public static class Method {
                private int id;
                private String name;
                private Params params;
                private Location location;

                // Getters and Setters

                public static class Params {
                    private double Fajr;
                    private double Isha;

                    // Getters and Setters
                }

                public static class Location {
                    private double latitude;
                    private double longitude;

                    // Getters and Setters
                }
            }

            public static class Offset {
                private int Imsak;
                private int Fajr;
                private int Sunrise;
                private int Dhuhr;
                private int Asr;
                private int Maghrib;
                private int Sunset;
                private int Isha;
                private int Midnight;

                // Getters and Setters
            }
        }
    }
}
