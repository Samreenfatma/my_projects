package com.weather.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplate;

import com.weather.datastore.UserEntry;
import com.weather.datastore.WeatherRepository;

@Service
public class WeatherAppService {
	@Autowired
	private WeatherRepository weatherRepo;

	@Value("${api.key}")
	private String apiKey;

	@Value("${current.weather.url}")
	private String currentWeatherApiUrl;

	@Value("${forecast.weather.url}")
	private String forecastWeatherApiUrl;

	private final RestTemplate restTemplate = new RestTemplate();

	public CurrentWeather getCurrentWeather(String country, String city) {
		URI url = new UriTemplate(currentWeatherApiUrl).expand(city, country,
				apiKey);
		User user = (User) SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		weatherRepo.save(new UserEntry(user.getUsername(), city));
		CurrentWeather currentWeather = restTemplate.getForObject(url,
				CurrentWeather.class);
		return currentWeather;
	}

	public WeatherForecast getWeatherForecast(String country, String city) {
		URI url = new UriTemplate(forecastWeatherApiUrl).expand(city, country,
				100, this.apiKey);
		WeatherForecast weatherForecast = restTemplate.getForObject(url,
				WeatherForecast.class);
		return weatherForecast;
	}
}
