package com.weather.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.service.WeatherResponse;
import com.weather.service.WeatherAppService;

@RestController
public class WeatherAppController {
	private final WeatherAppService weatherService;

	public WeatherAppController(WeatherAppService weatherAppService) {
		this.weatherService = weatherAppService;
	}

	@RequestMapping("/weather/app/{country}/{city}")
	public WeatherResponse getWeatherInfo(@PathVariable String country, @PathVariable String city) {
		WeatherResponse weatherResponse = new WeatherResponse(this.weatherService.getCurrentWeather(country, city),this.weatherService.getWeatherForecast(country, city ));
		return weatherResponse;
	}
}
