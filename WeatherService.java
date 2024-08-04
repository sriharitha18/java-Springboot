package com.example.weather.service;

import com.example.weather.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weatherstack.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public WeatherResponse getWeather(String city) {
        String url = String.format("http://api.weatherstack.com/current?access_key=%s&query=%s", apiKey, city);
        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}
