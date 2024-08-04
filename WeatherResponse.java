package com.example.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

    @JsonProperty("location")
    private Location location;

    @JsonProperty("current")
    private CurrentWeather currentWeather;

    // Getters and setters

    public static class Location {
        private String name;
        private String country;
        private String region;

        // Getters and setters
    }

    public static class CurrentWeather {
        @JsonProperty("temperature")
        private int temperature;

        @JsonProperty("weather_descriptions")
        private String[] weatherDescriptions;

        // Getters and setters
    }

    // Getters and setters
}
